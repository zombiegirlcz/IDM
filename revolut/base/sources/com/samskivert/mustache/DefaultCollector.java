package com.samskivert.mustache;

import com.samskivert.mustache.Mustache;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class DefaultCollector extends BasicCollector {
    private void addIfaces(Set<Class<?>> set, Class<?> cls, boolean z) {
        if (z) {
            set.add(cls);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            addIfaces(set, cls2, true);
        }
    }

    private Method makeAccessible(Method method) {
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        return method;
    }

    @Override // com.samskivert.mustache.BasicCollector, com.samskivert.mustache.Mustache.Collector
    public Mustache.VariableFetcher createFetcher(Object obj2, String str) {
        Mustache.VariableFetcher variableFetcherCreateFetcher = super.createFetcher(obj2, str);
        if (variableFetcherCreateFetcher != null) {
            return variableFetcherCreateFetcher;
        }
        Class<?> cls = obj2.getClass();
        final Method method = getMethod(cls, str);
        if (method != null) {
            return new Mustache.VariableFetcher() { // from class: com.samskivert.mustache.DefaultCollector.1
                @Override // com.samskivert.mustache.Mustache.VariableFetcher
                public Object get(Object obj3, String str2) throws Exception {
                    return method.invoke(obj3, null);
                }
            };
        }
        final Field field = getField(cls, str);
        if (field != null) {
            return new Mustache.VariableFetcher() { // from class: com.samskivert.mustache.DefaultCollector.2
                @Override // com.samskivert.mustache.Mustache.VariableFetcher
                public Object get(Object obj3, String str2) throws Exception {
                    return field.get(obj3);
                }
            };
        }
        final Method ifaceMethod = getIfaceMethod(cls, str);
        if (ifaceMethod != null) {
            return new Mustache.VariableFetcher() { // from class: com.samskivert.mustache.DefaultCollector.3
                @Override // com.samskivert.mustache.Mustache.VariableFetcher
                public Object get(Object obj3, String str2) throws Exception {
                    return ifaceMethod.invoke(obj3, null);
                }
            };
        }
        return null;
    }

    @Override // com.samskivert.mustache.BasicCollector, com.samskivert.mustache.Mustache.Collector
    public <K, V> Map<K, V> createFetcherCache() {
        return new ConcurrentHashMap();
    }

    public Field getField(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (Exception unused) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == Object.class || superclass == null) {
                return null;
            }
            return getField(cls.getSuperclass(), str);
        }
    }

    public Method getIfaceMethod(Class<?> cls, String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (cls != null && cls != Object.class) {
            addIfaces(linkedHashSet, cls, false);
            cls = cls.getSuperclass();
        }
        Iterator<Class<?>> it8 = linkedHashSet.iterator();
        while (it8.hasNext()) {
            Method methodOn = getMethodOn(it8.next(), str);
            if (methodOn != null) {
                return methodOn;
            }
        }
        return null;
    }

    public Method getMethod(Class<?> cls, String str) {
        while (cls != null && cls != Object.class) {
            Method methodOn = getMethodOn(cls, str);
            if (methodOn != null) {
                return methodOn;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public Method getMethodOn(Class<?> cls, String str) {
        Class cls2 = Void.TYPE;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, null);
            if (!declaredMethod.getReturnType().equals(cls2)) {
                return makeAccessible(declaredMethod);
            }
        } catch (Exception unused) {
        }
        String str2 = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        try {
            Method declaredMethod2 = cls.getDeclaredMethod("get" + str2, null);
            if (!declaredMethod2.getReturnType().equals(cls2)) {
                return makeAccessible(declaredMethod2);
            }
        } catch (Exception unused2) {
        }
        try {
            Method declaredMethod3 = cls.getDeclaredMethod("is" + str2, null);
            if (declaredMethod3.getReturnType().equals(Boolean.TYPE) || declaredMethod3.getReturnType().equals(Boolean.class)) {
                return makeAccessible(declaredMethod3);
            }
        } catch (Exception unused3) {
        }
        return null;
    }
}
