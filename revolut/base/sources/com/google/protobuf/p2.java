package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f49764c = new p2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f49766b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f49765a = new w1();

    public final t2 a(Class cls) {
        Class cls2;
        j1.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f49766b;
        t2 t2VarX = (t2) concurrentHashMap.get(cls);
        if (t2VarX == null) {
            w1 w1Var = this.f49765a;
            w1Var.getClass();
            Class cls3 = u2.f49801a;
            if (!w0.class.isAssignableFrom(cls) && (cls2 = u2.f49801a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            r2 r2VarMessageInfoFor = ((v1) w1Var.f49817a).messageInfoFor(cls);
            int i = r2VarMessageInfoFor.d;
            d2 d2Var = r2VarMessageInfoFor.f49782a;
            if ((i & 2) == 2) {
                if (w0.class.isAssignableFrom(cls)) {
                    t2VarX = i2.g(u2.f49803c, g0.f49706a, d2Var);
                } else {
                    l3 l3Var = u2.f49802b;
                    f0 f0Var = g0.f49707b;
                    if (f0Var == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    t2VarX = i2.g(l3Var, f0Var, d2Var);
                }
            } else if (w0.class.isAssignableFrom(cls)) {
                t2VarX = u1.f49800a[r2VarMessageInfoFor.a().ordinal()] != 1 ? h2.x(r2VarMessageInfoFor, k2.f49743b, p1.f49763b, u2.f49803c, g0.f49706a, a2.f49680b) : h2.x(r2VarMessageInfoFor, k2.f49743b, p1.f49763b, u2.f49803c, null, a2.f49680b);
            } else if (u1.f49800a[r2VarMessageInfoFor.a().ordinal()] != 1) {
                j2 j2Var = k2.f49742a;
                n1 n1Var = p1.f49762a;
                l3 l3Var2 = u2.f49802b;
                f0 f0Var2 = g0.f49707b;
                if (f0Var2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                t2VarX = h2.x(r2VarMessageInfoFor, j2Var, n1Var, l3Var2, f0Var2, a2.f49679a);
            } else {
                t2VarX = h2.x(r2VarMessageInfoFor, k2.f49742a, p1.f49762a, u2.f49802b, null, a2.f49679a);
            }
            t2 t2Var = (t2) concurrentHashMap.putIfAbsent(cls, t2VarX);
            if (t2Var != null) {
                return t2Var;
            }
        }
        return t2VarX;
    }
}
