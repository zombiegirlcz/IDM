package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class uj0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tj0 f34111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34112b;

    private uj0(tj0 tj0Var, e4m.e eVar) {
        this.f34111a = tj0Var;
        this.f34112b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public sj0 get() {
        return a(this.f34111a, (Context) this.f34112b.get());
    }

    public static uj0 a(tj0 tj0Var, e4m.e eVar) {
        return new uj0(tj0Var, eVar);
    }

    public static sj0 a(tj0 tj0Var, Context context) {
        sj0 sj0VarA = tj0Var.a(context);
        vc.s.k(sj0VarA);
        return sj0VarA;
    }
}
