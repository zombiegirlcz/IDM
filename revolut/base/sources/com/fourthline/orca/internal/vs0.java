package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesErrorPopupStateBuilder;

/* JADX INFO: loaded from: classes23.dex */
public final class vs0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f34447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34448b;

    private vs0(ms0 ms0Var, e4m.e eVar) {
        this.f34447a = ms0Var;
        this.f34448b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public QesErrorPopupStateBuilder get() {
        return a(this.f34447a, (v10) this.f34448b.get());
    }

    public static vs0 a(ms0 ms0Var, e4m.e eVar) {
        return new vs0(ms0Var, eVar);
    }

    public static QesErrorPopupStateBuilder a(ms0 ms0Var, v10 v10Var) {
        QesErrorPopupStateBuilder qesErrorPopupStateBuilderC = ms0Var.c(v10Var);
        vc.s.k(qesErrorPopupStateBuilderC);
        return qesErrorPopupStateBuilderC;
    }
}
