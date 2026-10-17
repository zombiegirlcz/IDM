package com.fourthline.orca.internal;

import com.google.common.base.Optional;

/* JADX INFO: loaded from: classes23.dex */
public final class pp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f32015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32017c;

    private pp(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        this.f32015a = hpVar;
        this.f32016b = eVar;
        this.f32017c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d40 get() {
        return a(this.f32015a, (Optional) this.f32016b.get(), (l70) this.f32017c.get());
    }

    public static pp a(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        return new pp(hpVar, eVar, eVar2);
    }

    public static d40 a(hp hpVar, Optional optional, l70 l70Var) {
        d40 d40VarA = hpVar.a(optional, l70Var);
        vc.s.k(d40VarA);
        return d40VarA;
    }
}
