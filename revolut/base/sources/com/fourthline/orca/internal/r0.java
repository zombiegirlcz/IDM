package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class r0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f32563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32565c;

    private r0(p0 p0Var, e4m.e eVar, e4m.e eVar2) {
        this.f32563a = p0Var;
        this.f32564b = eVar;
        this.f32565c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h0 get() {
        return a(this.f32563a, (z) this.f32564b.get(), (List) this.f32565c.get());
    }

    public static r0 a(p0 p0Var, e4m.e eVar, e4m.e eVar2) {
        return new r0(p0Var, eVar, eVar2);
    }

    public static h0 a(p0 p0Var, z zVar, List list) {
        h0 h0VarA = p0Var.a(zVar, list);
        vc.s.k(h0VarA);
        return h0VarA;
    }
}
