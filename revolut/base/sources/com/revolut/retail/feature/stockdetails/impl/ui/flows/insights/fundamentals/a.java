package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals;

import bof.r;
import cli.g;
import cli.y;
import fuk.f;
import fuk.t;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import qrk.c;
import r10.w;
import vkm.j2;
import wtk.i;
import wtk.j;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements j {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f103861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f103862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f103863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f61.a f103864s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f103865t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(r mapper, i input, c stocksInsightsInteractor, w referenceIndexNameProvider, f fundamentalsChartsWidgetModelExtension, f61.a insightsFlowDisclaimersProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(stocksInsightsInteractor, "stocksInsightsInteractor");
        Intrinsics.checkNotNullParameter(referenceIndexNameProvider, "referenceIndexNameProvider");
        Intrinsics.checkNotNullParameter(fundamentalsChartsWidgetModelExtension, "fundamentalsChartsWidgetModelExtension");
        Intrinsics.checkNotNullParameter(insightsFlowDisclaimersProvider, "insightsFlowDisclaimersProvider");
        this.o = input;
        this.f103861p = stocksInsightsInteractor;
        this.f103862q = referenceIndexNameProvider;
        this.f103863r = fundamentalsChartsWidgetModelExtension;
        this.f103864s = insightsFlowDisclaimersProvider;
        this.f103865t = d.b(this, new wtk.h(null, null, null, null), mapper, null, false, 12);
        this.u = e.a(this, new wtj.c(this, 1));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        i iVar = this.o;
        Continuation continuation = null;
        l.b1(this, this.f103861p.b(iVar.f300016a, w4l.h.f294642c), null, new wtk.w(this, continuation, 2), 3);
        l.b1(this, this.f103862q.s(iVar.f300016a), null, new wtk.w(this, continuation, 3), 3);
        l.b1(this, (j2) ((t) this.f103863r).f138272p.f22677a, null, new wtk.w(this, continuation, 0), 3);
        l.b1(this, this.f103864s.G(iuk.a.FUNDAMENTALS), null, new wtk.w(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f103865t;
    }
}
