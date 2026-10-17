package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes17.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f49410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f49411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r1 f49412c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f49413g;

    static {
        Unsafe unsafeJ = j();
        f49410a = unsafeJ;
        f49411b = c.f49347a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        r1 q1Var = null;
        if (unsafeJ != null) {
            if (!c.a()) {
                q1Var = new q1(unsafeJ);
            } else if (zF) {
                q1Var = new p1(unsafeJ, 1);
            } else if (zF2) {
                q1Var = new p1(unsafeJ, 0);
            }
        }
        f49412c = q1Var;
        d = q1Var == null ? false : q1Var.s();
        e = q1Var == null ? false : q1Var.r();
        f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && q1Var != null) {
            q1Var.j(fieldE);
        }
        f49413g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th10) {
        Logger.getLogger(s1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th10);
    }

    public static Object b(Class cls) {
        try {
            return f49410a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int c(Class cls) {
        if (e) {
            return f49412c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (e) {
            f49412c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f49411b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j2) {
        return f49412c.d(bArr, f + j2);
    }

    public static byte h(Object obj2, long j2) {
        return (byte) ((f49412c.g(obj2, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static byte i(Object obj2, long j2) {
        return (byte) ((f49412c.g(obj2, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j2, byte b4) {
        f49412c.l(bArr, f + j2, b4);
    }

    public static void l(Object obj2, long j2, byte b4) {
        long j3 = (-4) & j2;
        int iG = f49412c.g(obj2, j3);
        int i = ((~((int) j2)) & 3) << 3;
        n(obj2, j3, ((255 & b4) << i) | (iG & (~(255 << i))));
    }

    public static void m(Object obj2, long j2, byte b4) {
        long j3 = (-4) & j2;
        int i = (((int) j2) & 3) << 3;
        n(obj2, j3, ((255 & b4) << i) | (f49412c.g(obj2, j3) & (~(255 << i))));
    }

    public static void n(Object obj2, long j2, int i) {
        f49412c.o(obj2, j2, i);
    }

    public static void o(Object obj2, long j2, long j3) {
        f49412c.p(obj2, j2, j3);
    }

    public static void p(Object obj2, long j2, Object obj3) {
        f49412c.q(obj2, j2, obj3);
    }
}
