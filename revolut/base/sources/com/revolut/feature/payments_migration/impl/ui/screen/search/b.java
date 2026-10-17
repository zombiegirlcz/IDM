package com.revolut.feature.payments_migration.impl.ui.screen.search;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import d6a.i;
import d6a.m;
import kotlin.jvm.internal.Intrinsics;
import o7.d;
import oki.h;
import p5f.c;
import p6a.e;
import p6a.f;
import p6a.k;
import wli.x;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements f {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f80290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f80291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f80292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SearchInBlockControllerContract$InputData f80293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y5a.d f80294t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(d cardsProvider, x deeplinkHandler, i providerClickActionProvider, m providersSearchHelper, SearchInBlockControllerContract$InputData inputData, k stateMapper) {
        Intrinsics.checkNotNullParameter(cardsProvider, "cardsProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(providerClickActionProvider, "providerClickActionProvider");
        Intrinsics.checkNotNullParameter(providersSearchHelper, "providersSearchHelper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = cardsProvider;
        this.f80290p = deeplinkHandler;
        this.f80291q = providerClickActionProvider;
        this.f80292r = providersSearchHelper;
        this.f80293s = inputData;
        y5a.d dVar = new y5a.d(inputData.f80286c);
        this.f80294t = dVar;
        this.u = mra.d.b(this, new e(new Data(dVar, null, false, 6, null), ""), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new c(this, 2));
    }

    @Override // yji.l
    public final void I1() {
        l2(new p0l.d(this, null, 10), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
