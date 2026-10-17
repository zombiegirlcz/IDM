package qlm;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aim.f f247687a;

    static {
        aim.f builder = new aim.f();
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        KClass kClassB = p0Var.b(String.class);
        nlm.a.d(kotlin.jvm.internal.t0.f186434a);
        builder.put(kClassB, v1.f247718a);
        KClass kClassB2 = p0Var.b(Character.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.i.f186421a, "<this>");
        builder.put(kClassB2, q.f247694a);
        builder.put(p0Var.b(char[].class), p.f247688c);
        KClass kClassB3 = p0Var.b(Double.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.l.f186424a, "<this>");
        builder.put(kClassB3, x.f247723a);
        builder.put(p0Var.b(double[].class), w.f247720c);
        KClass kClassB4 = p0Var.b(Float.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.m.f186426a, "<this>");
        builder.put(kClassB4, e0.f247634a);
        builder.put(p0Var.b(float[].class), d0.f247628c);
        KClass kClassB5 = p0Var.b(Long.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.v.f186436a, "<this>");
        builder.put(kClassB5, t0.f247706a);
        builder.put(p0Var.b(long[].class), s0.f247702c);
        KClass kClassB6 = p0Var.b(yhm.w.class);
        Intrinsics.checkNotNullParameter(yhm.w.INSTANCE, "<this>");
        builder.put(kClassB6, e2.f247637a);
        KClass kClassB7 = p0Var.b(Integer.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.r.f186431a, "<this>");
        builder.put(kClassB7, n0.f247680a);
        builder.put(p0Var.b(int[].class), m0.f247677c);
        KClass kClassB8 = p0Var.b(yhm.u.class);
        Intrinsics.checkNotNullParameter(yhm.u.INSTANCE, "<this>");
        builder.put(kClassB8, b2.f247619a);
        KClass kClassB9 = p0Var.b(Short.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.r0.f186432a, "<this>");
        builder.put(kClassB9, u1.f247712a);
        builder.put(p0Var.b(short[].class), t1.f247708c);
        KClass kClassB10 = p0Var.b(yhm.z.class);
        Intrinsics.checkNotNullParameter(yhm.z.INSTANCE, "<this>");
        builder.put(kClassB10, h2.f247654a);
        KClass kClassB11 = p0Var.b(Byte.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.f.f186419a, "<this>");
        builder.put(kClassB11, k.f247670a);
        builder.put(p0Var.b(byte[].class), j.f247664c);
        KClass kClassB12 = p0Var.b(yhm.s.class);
        Intrinsics.checkNotNullParameter(yhm.s.INSTANCE, "<this>");
        builder.put(kClassB12, y1.f247729a);
        KClass kClassB13 = p0Var.b(Boolean.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.e.f186418a, "<this>");
        builder.put(kClassB13, h.f247648a);
        builder.put(p0Var.b(boolean[].class), g.f247643c);
        KClass kClassB14 = p0Var.b(Unit.class);
        Intrinsics.checkNotNullParameter(Unit.f186387a, "<this>");
        builder.put(kClassB14, i2.f247662b);
        builder.put(p0Var.b(Void.class), b1.f247617a);
        try {
            KClass kClassB15 = p0Var.b(kotlin.time.b.class);
            Intrinsics.checkNotNullParameter(kotlin.time.b.INSTANCE, "<this>");
            builder.put(kClassB15, y.f247727a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            builder.put(kotlin.jvm.internal.o0.f186429a.b(yhm.x.class), d2.f247632c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            builder.put(kotlin.jvm.internal.o0.f186429a.b(yhm.v.class), a2.f247613c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            builder.put(kotlin.jvm.internal.o0.f186429a.b(yhm.a0.class), g2.f247647c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            builder.put(kotlin.jvm.internal.o0.f186429a.b(yhm.t.class), x1.f247726c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            KClass kClassB16 = kotlin.jvm.internal.o0.f186429a.b(qkm.b.class);
            Intrinsics.checkNotNullParameter(qkm.b.Companion, "<this>");
            builder.put(kClassB16, j2.f247668a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        f247687a = builder.b();
    }

    public static final void a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        for (KSerializer kSerializer : (aim.m) f247687a.values()) {
            if (serialName.equals(kSerializer.getDescriptor().e())) {
                StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", serialName, " there already exists ");
                sbX.append(kotlin.jvm.internal.o0.f186429a.b(kSerializer.getClass()).m());
                sbX.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(kotlin.text.t.e(sbX.toString()));
            }
        }
    }
}
