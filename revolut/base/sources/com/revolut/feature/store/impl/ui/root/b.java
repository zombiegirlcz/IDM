package com.revolut.feature.store.impl.ui.root;

import d8l.d;
import eub.i;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import osk.m;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements p3e.b {
    public final StoreFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f88732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.i f88733q;

    public b(StoreFlowContract$InputData inputData, i revPointsOptInInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        this.o = inputData;
        this.f88732p = revPointsOptInInteractor;
        this.f88733q = d.a(this, new or4.i(this, 26));
    }

    @Override // yki.j
    public final void M0() {
        l2(new m(this, null, 18), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f88733q;
    }
}
