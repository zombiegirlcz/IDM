package com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.stockdetails.impl.ui.delegates.stats.kompot.CustomisedStatsDialogProvider;
import dt4.p;
import dvk.f;
import dvk.g;
import dvk.i;
import dvk.j;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import ybl.l;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements f {
    public final DetailedStatsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ael.h f103924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f103925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kwk.b f103926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CustomisedStatsDialogProvider f103927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final aah.h f103928t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(DetailedStatsControllerContract$InputData inputData, ael.h instrumentStatsInteractor, l tradingConfigInteractor, kwk.b statsGlossaryInputDataFactory, CustomisedStatsDialogProvider customisedStatsDialogProvider, aah.h wealthDisclaimersControllerModelExtension, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentStatsInteractor, "instrumentStatsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(statsGlossaryInputDataFactory, "statsGlossaryInputDataFactory");
        Intrinsics.checkNotNullParameter(customisedStatsDialogProvider, "customisedStatsDialogProvider");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f103924p = instrumentStatsInteractor;
        this.f103925q = tradingConfigInteractor;
        this.f103926r = statsGlossaryInputDataFactory;
        this.f103927s = customisedStatsDialogProvider;
        this.f103928t = wealthDisclaimersControllerModelExtension;
        this.u = d.b(this, new g(inputData.f103917a, new Data(null, null, false, 7, null), null, null, new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
        this.v = e.a(this, new p(this, 6));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, this.f103924p.a(this.o.f103917a, w4l.h.f294642c), null, new i(this, null, 1), 3);
        n2(new ds4.y(this, null, 3), new whi.b(6));
        yji.l.b1(this, this.f103928t.f2828l.w0(), null, new i(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
