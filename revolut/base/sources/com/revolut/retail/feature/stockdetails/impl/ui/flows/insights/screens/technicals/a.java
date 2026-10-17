package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals;

import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import muk.f;
import muk.g;
import muk.n;
import oki.h;
import qrk.c;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements g {
    public final TechnicalInsightsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f103870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ouk.a f103871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f61.a f103872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.c f103873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f103874t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(TechnicalInsightsControllerContract$InputData inputData, n stateMapper, c insightsInteractor, ouk.a indicatorDetailsMapper, f61.a disclaimersProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(insightsInteractor, "insightsInteractor");
        Intrinsics.checkNotNullParameter(indicatorDetailsMapper, "indicatorDetailsMapper");
        Intrinsics.checkNotNullParameter(disclaimersProvider, "disclaimersProvider");
        this.o = inputData;
        this.f103870p = insightsInteractor;
        this.f103871q = indicatorDetailsMapper;
        this.f103872r = disclaimersProvider;
        this.f103873s = new vii.c();
        this.f103874t = d.b(this, new f(new Data(null, null, false, 7, null), null), stateMapper, null, false, 12);
        this.u = e.a(this, new mnl.g(this, 20));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, q.Q(this.f103873s.a(Unit.f186387a, w4l.h.f294642c), new mk0.f((Continuation) null, this, 9)), null, new muk.l(this, null, 0), 3);
        l.b1(this, this.f103872r.G(iuk.a.TECHNICALS), null, new muk.l(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f103874t;
    }
}
