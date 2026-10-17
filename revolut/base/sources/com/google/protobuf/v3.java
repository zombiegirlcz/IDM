package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f49813a;

    public v3(Unsafe unsafe) {
        this.f49813a = unsafe;
    }

    public final int a(Class cls) {
        return this.f49813a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f49813a.arrayIndexScale(cls);
    }

    public abstract void c(long j2, byte[] bArr, long j3);

    public abstract boolean d(Object obj2, long j2);

    public abstract byte e(long j2);

    public abstract byte f(Object obj2, long j2);

    public abstract double g(Object obj2, long j2);

    public abstract float h(Object obj2, long j2);

    public final int i(Object obj2, long j2) {
        return this.f49813a.getInt(obj2, j2);
    }

    public final long j(Object obj2, long j2) {
        return this.f49813a.getLong(obj2, j2);
    }

    public final Object k(Object obj2, long j2) {
        return this.f49813a.getObject(obj2, j2);
    }

    public final long l(Field field) {
        return this.f49813a.objectFieldOffset(field);
    }

    public abstract void m(Object obj2, long j2, boolean z);

    public abstract void n(Object obj2, long j2, byte b4);

    public abstract void o(Object obj2, long j2, double d);

    public abstract void p(Object obj2, long j2, float f);

    public final void q(Object obj2, long j2, int i) {
        this.f49813a.putInt(obj2, j2, i);
    }

    public final void r(Object obj2, long j2, long j3) {
        this.f49813a.putLong(obj2, j2, j3);
    }

    public final void s(Object obj2, long j2, Object obj3) {
        this.f49813a.putObject(obj2, j2, obj3);
    }

    public boolean t() {
        Unsafe unsafe = this.f49813a;
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
            w3.a(th10);
            return false;
        }
    }

    public abstract boolean u();
}
