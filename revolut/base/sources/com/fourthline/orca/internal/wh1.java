package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class wh1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oh1 f34697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34698b;

    private wh1(oh1 oh1Var, e4m.e eVar) {
        this.f34697a = oh1Var;
        this.f34698b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dh1 get() {
        return a(this.f34697a, (Context) this.f34698b.get());
    }

    public static wh1 a(oh1 oh1Var, e4m.e eVar) {
        return new wh1(oh1Var, eVar);
    }

    public static dh1 a(oh1 oh1Var, Context context) {
        dh1 dh1VarA = oh1Var.a(context);
        vc.s.k(dh1VarA);
        return dh1VarA;
    }
}
