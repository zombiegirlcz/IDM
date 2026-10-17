package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class d1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1 f49352c = new d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f49354b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f49353a = new p0();

    public final g1 a(Class cls) {
        g1 g1VarX;
        Class cls2;
        g0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f49354b;
        g1 g1Var = (g1) concurrentHashMap.get(cls);
        if (g1Var != null) {
            return g1Var;
        }
        p0 p0Var = this.f49353a;
        p0Var.getClass();
        Class cls3 = h1.f49366a;
        if (!b0.class.isAssignableFrom(cls) && (cls2 = h1.f49366a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        f1 f1VarMessageInfoFor = ((o0) p0Var.f49398a).messageInfoFor(cls);
        int i = f1VarMessageInfoFor.d;
        a aVar = f1VarMessageInfoFor.f49360a;
        if ((i & 2) == 2) {
            if (b0.class.isAssignableFrom(cls)) {
                g1VarX = new x0(h1.d, s.f49406a, aVar);
            } else {
                i1 i1Var = h1.f49367b;
                r rVar = s.f49407b;
                if (rVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                g1VarX = new x0(i1Var, rVar, aVar);
            }
        } else if (b0.class.isAssignableFrom(cls)) {
            g1VarX = ((f1VarMessageInfoFor.d & 1) == 1 ? c1.PROTO2 : c1.PROTO3) == c1.PROTO2 ? w0.x(f1VarMessageInfoFor, z0.f49438b, m0.f49389b, h1.d, s.f49406a, s0.f49409b) : w0.x(f1VarMessageInfoFor, z0.f49438b, m0.f49389b, h1.d, null, s0.f49409b);
        } else {
            if (((f1VarMessageInfoFor.d & 1) == 1 ? c1.PROTO2 : c1.PROTO3) == c1.PROTO2) {
                y0 y0Var = z0.f49437a;
                k0 k0Var = m0.f49388a;
                i1 i1Var2 = h1.f49367b;
                r rVar2 = s.f49407b;
                if (rVar2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                g1VarX = w0.x(f1VarMessageInfoFor, y0Var, k0Var, i1Var2, rVar2, s0.f49408a);
            } else {
                g1VarX = w0.x(f1VarMessageInfoFor, z0.f49437a, m0.f49388a, h1.f49368c, null, s0.f49408a);
            }
        }
        g1 g1Var2 = (g1) concurrentHashMap.putIfAbsent(cls, g1VarX);
        return g1Var2 != null ? g1Var2 : g1VarX;
    }
}
