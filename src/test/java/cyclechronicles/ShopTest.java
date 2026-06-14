package cyclechronicles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ShopTest {

    Shop shop;
    Order order;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }

    @Test
    void Type_is_Normal_and_Customer_has_0_orders_and_queue_has_size_0() {
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("jonas");
        Assertions.assertTrue(shop.accept(order));
    }

    @Test
    void Type_is_Gravel_and_Customer_has_0_orders_and_queue_has_size_0() {
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.GRAVEL);
        when(order.getCustomer()).thenReturn("jonas");
        Assertions.assertFalse(shop.accept(order));
    }

    @Test
    void Type_is_EBike_and_Customer_has_0_orders_and_queue_has_size_0() {
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.EBIKE);
        when(order.getCustomer()).thenReturn("jonas");
        Assertions.assertFalse(shop.accept(order));
    }

    @Test
    void Type_is_Normal_and_Customer_has_1_orders_and_queue_has_size_1() {
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("jonas");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("jonas");
        Assertions.assertFalse(shop.accept(order));
    }

    @Test
    void Type_is_Normal_and_Customer_has_0_orders_and_queue_has_size_3() {
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("jonas");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("jan");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("nils");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("britta");
        Assertions.assertTrue(shop.accept(order));
    }

    @Test
    void Type_is_Normal_and_Customer_has_0_orders_and_queue_has_size_4() {
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("jonas");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("jan");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("nils");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("britta");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("julia");
        Assertions.assertTrue(shop.accept(order));
    }

    @Test
    void Type_is_Normal_and_Customer_has_0_orders_and_queue_has_size_5() {
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("jonas");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("jan");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("nils");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("britta");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("julia");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("Maja");
        Assertions.assertFalse(shop.accept(order));
    }

    @Test
    void Type_is_Gravel_and_Customer_has_1_orders_and_queue_has_size_5() {
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("jonas");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("jan");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("nils");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("britta");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.FIXIE);
        when(order.getCustomer()).thenReturn("julia");
        shop.accept(order);
        order = mock(Order.class);
        when(order.getBicycleType()).thenReturn(Type.GRAVEL);
        when(order.getCustomer()).thenReturn("nils");
        Assertions.assertFalse(shop.accept(order));
    }

}
