package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes17.dex */
public final class q1 extends r1 {
    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final boolean c(Object obj2, long j2) {
        return this.f49405a.getBoolean(obj2, j2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final byte d(Object obj2, long j2) {
        return this.f49405a.getByte(obj2, j2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final double e(Object obj2, long j2) {
        return this.f49405a.getDouble(obj2, j2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final float f(Object obj2, long j2) {
        return this.f49405a.getFloat(obj2, j2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final void k(Object obj2, long j2, boolean z) {
        this.f49405a.putBoolean(obj2, j2, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final void l(Object obj2, long j2, byte b4) {
        this.f49405a.putByte(obj2, j2, b4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final void m(Object obj2, long j2, double d) {
        this.f49405a.putDouble(obj2, j2, d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final void n(Object obj2, long j2, float f) {
        this.f49405a.putFloat(obj2, j2, f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f49405a.getClass();
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
            s1.a(th10);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r1
    public final boolean s() {
        Unsafe unsafe = this.f49405a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (s1.e() != null) {
                    try {
                        Class<?> cls3 = this.f49405a.getClass();
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
                        s1.a(th10);
                        return false;
                    }
                }
            } catch (Throwable th11) {
                s1.a(th11);
            }
        }
        return false;
    }
}
