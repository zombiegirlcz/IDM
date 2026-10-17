package com.revolut.feature.instruments.trend.collections.impl.ui.launcher;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import lcc.c;
import oki.h;
import tzg.m;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements li7.b {
    public final InstrumentsTrendCollectionsLauncherFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f74924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f74925q;

    public b(InstrumentsTrendCollectionsLauncherFlowContract$InputData inputData, m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.o = inputData;
        this.f74924p = wealthAccountsInteractor;
        this.f74925q = d.a(this, new c(this, 14));
    }

    @Override // yki.j
    public final void M0() {
        l2(new kze.h(this, null, 16), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74925q;
    }
}
