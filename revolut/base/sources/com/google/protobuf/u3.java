package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes17.dex */
public final class u3 extends v3 {
    public u3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.protobuf.v3
    public final void c(long j2, byte[] bArr, long j3) {
        this.f49813a.copyMemory((Object) null, j2, bArr, w3.f, j3);
    }

    @Override // com.google.protobuf.v3
    public final boolean d(Object obj2, long j2) {
        return this.f49813a.getBoolean(obj2, j2);
    }

    @Override // com.google.protobuf.v3
    public final byte e(long j2) {
        return this.f49813a.getByte(j2);
    }

    @Override // com.google.protobuf.v3
    public final byte f(Object obj2, long j2) {
        return this.f49813a.getByte(obj2, j2);
    }

    @Override // com.google.protobuf.v3
    public final double g(Object obj2, long j2) {
        return this.f49813a.getDouble(obj2, j2);
    }

    @Override // com.google.protobuf.v3
    public final float h(Object obj2, long j2) {
        return this.f49813a.getFloat(obj2, j2);
    }

    @Override // com.google.protobuf.v3
    public final void m(Object obj2, long j2, boolean z) {
        this.f49813a.putBoolean(obj2, j2, z);
    }

    @Override // com.google.protobuf.v3
    public final void n(Object obj2, long j2, byte b4) {
        this.f49813a.putByte(obj2, j2, b4);
    }

    @Override // com.google.protobuf.v3
    public final void o(Object obj2, long j2, double d) {
        this.f49813a.putDouble(obj2, j2, d);
    }

    @Override // com.google.protobuf.v3
    public final void p(Object obj2, long j2, float f) {
        this.f49813a.putFloat(obj2, j2, f);
    }

    @Override // com.google.protobuf.v3
    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        try {
            Class<?> cls = this.f49813a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th10) {
            w3.a(th10);
            return false;
        }
    }

    @Override // com.google.protobuf.v3
    public final boolean u() {
        Unsafe unsafe = this.f49813a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (w3.e() != null) {
                    try {
                        Class<?> cls3 = this.f49813a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th10) {
                        w3.a(th10);
                        return false;
                    }
                }
            } catch (Throwable th11) {
                w3.a(th11);
            }
        }
        return false;
    }
}
