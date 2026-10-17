package com.google.common.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractInvocationHandler implements InvocationHandler {
    private static final Object[] NO_ARGS = new Object[0];

    private static boolean isProxyOfSameInterfaces(Object obj2, Class<?> cls) {
        if (cls.isInstance(obj2)) {
            return true;
        }
        return Proxy.isProxyClass(obj2.getClass()) && Arrays.equals(obj2.getClass().getInterfaces(), cls.getInterfaces());
    }

    public boolean equals(Object obj2) {
        return super.equals(obj2);
    }

    public abstract Object handleInvocation(Object obj2, Method method, Object[] objArr) throws Throwable;

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
        if (objArr == null) {
            objArr = NO_ARGS;
        }
        if (objArr.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        if (objArr.length != 1 || !method.getName().equals("equals") || method.getParameterTypes()[0] != Object.class) {
            return (objArr.length == 0 && method.getName().equals("toString")) ? toString() : handleInvocation(obj2, method, objArr);
        }
        Object obj3 = objArr[0];
        if (obj3 == null) {
            return Boolean.FALSE;
        }
        if (obj2 == obj3) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(isProxyOfSameInterfaces(obj3, obj2.getClass()) && equals(Proxy.getInvocationHandler(obj3)));
    }

    public String toString() {
        return super.toString();
    }
}
