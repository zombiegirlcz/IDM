package com.fourthline.orca.internal;

import com.google.common.base.Optional;

/* JADX INFO: loaded from: classes23.dex */
public final class w41 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v41 f34515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34516b;

    private w41(v41 v41Var, e4m.e eVar) {
        this.f34515a = v41Var;
        this.f34516b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u41 get() {
        return a(this.f34515a, (Optional) this.f34516b.get());
    }

    public static w41 a(v41 v41Var, e4m.e eVar) {
        return new w41(v41Var, eVar);
    }

    public static u41 a(v41 v41Var, Optional optional) {
        u41 u41VarA = v41Var.a(optional);
        vc.s.k(u41VarA);
        return u41VarA;
    }
}
