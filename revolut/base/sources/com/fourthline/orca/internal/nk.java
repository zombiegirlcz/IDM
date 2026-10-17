package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class nk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f31432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31434c;
    private final e4m.e d;

    private nk(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f31432a = rjVar;
        this.f31433b = eVar;
        this.f31434c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public pf0 get() {
        return a(this.f31432a, (Context) this.f31433b.get(), (t9) this.f31434c.get(), (r70) this.d.get());
    }

    public static nk a(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new nk(rjVar, eVar, eVar2, eVar3);
    }

    public static pf0 a(rj rjVar, Context context, t9 t9Var, r70 r70Var) {
        pf0 pf0VarA = rjVar.a(context, t9Var, r70Var);
        vc.s.k(pf0VarA);
        return pf0VarA;
    }
}
