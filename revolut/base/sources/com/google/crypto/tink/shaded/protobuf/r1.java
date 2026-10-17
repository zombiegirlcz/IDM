package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes17.dex */
public abstract class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f49405a;

    public r1(Unsafe unsafe) {
        this.f49405a = unsafe;
    }

    public final int a(Class cls) {
        return this.f49405a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f49405a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj2, long j2);

    public abstract byte d(Object obj2, long j2);

    public abstract double e(Object obj2, long j2);

    public abstract float f(Object obj2, long j2);

    public final int g(Object obj2, long j2) {
        return this.f49405a.getInt(obj2, j2);
    }

    public final long h(Object obj2, long j2) {
        return this.f49405a.getLong(obj2, j2);
    }

    public final Object i(Object obj2, long j2) {
        return this.f49405a.getObject(obj2, j2);
    }

    public final long j(Field field) {
        return this.f49405a.objectFieldOffset(field);
    }

    public abstract void k(Object obj2, long j2, boolean z);

    public abstract void l(Object obj2, long j2, byte b4);

    public abstract void m(Object obj2, long j2, double d);

    public abstract void n(Object obj2, long j2, float f);

    public final void o(Object obj2, long j2, int i) {
        this.f49405a.putInt(obj2, j2, i);
    }

    public final void p(Object obj2, long j2, long j3) {
        this.f49405a.putLong(obj2, j2, j3);
    }

    public final void q(Object obj2, long j2, Object obj3) {
        this.f49405a.putObject(obj2, j2, obj3);
    }

    public boolean r() {
        Unsafe unsafe = this.f49405a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th10) {
            s1.a(th10);
            return false;
        }
    }

    public abstract boolean s();
}
