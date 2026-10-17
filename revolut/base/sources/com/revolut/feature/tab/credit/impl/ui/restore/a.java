package com.revolut.feature.tab.credit.impl.ui.restore;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vie.i;
import yzb.c;
import zie.b;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final CreditTabRestoreFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f89772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.i f89773q;

    public a(CreditTabRestoreFlowContract$InputData inputData, i preferencesInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(preferencesInteractor, "preferencesInteractor");
        this.o = inputData;
        this.f89772p = preferencesInteractor;
        this.f89773q = d.a(this, new z8d.h(24));
    }

    @Override // yki.j
    public final void M0() {
        l2(new c(this, null, 21), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f89773q;
    }
}
