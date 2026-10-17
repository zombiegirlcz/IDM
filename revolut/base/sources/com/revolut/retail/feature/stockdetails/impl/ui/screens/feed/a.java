package com.revolut.retail.feature.stockdetails.impl.ui.screens.feed;

import a18.c;
import ael.k;
import cli.y;
import hcj.o;
import imk.p0;
import ivk.f;
import ivk.g;
import ivk.m;
import ivk.n;
import ivk.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m0k.e;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import ybl.b;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements f {

    @NotNull
    public static final m Companion = new m();
    public final y08.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f103953p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f103954q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q18.h f103955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f103956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final onh.b f103957t;
    public final StockDetailsFeedControllerContract$InputData u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f103958w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f103959x;

    public a(p stateMapper, y08.a insightsCompliancePopupExtensionModel, b instrumentTickerInteractor, c recentInsightsModelExtension, q18.h smartNotificationDestinationProvider, e wealthNewsInteractor, onh.b disclaimersProvider, StockDetailsFeedControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(insightsCompliancePopupExtensionModel, "insightsCompliancePopupExtensionModel");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(recentInsightsModelExtension, "recentInsightsModelExtension");
        Intrinsics.checkNotNullParameter(smartNotificationDestinationProvider, "smartNotificationDestinationProvider");
        Intrinsics.checkNotNullParameter(wealthNewsInteractor, "wealthNewsInteractor");
        Intrinsics.checkNotNullParameter(disclaimersProvider, "disclaimersProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = insightsCompliancePopupExtensionModel;
        this.f103953p = instrumentTickerInteractor;
        this.f103954q = recentInsightsModelExtension;
        this.f103955r = smartNotificationDestinationProvider;
        this.f103956s = wealthNewsInteractor;
        this.f103957t = disclaimersProvider;
        this.u = inputData;
        this.v = new vii.b();
        this.f103958w = hx7.e.a(this, new in1.a(this, 17));
        this.f103959x = d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f103958w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, (j2) ((r18.m) this.f103954q).f250923p.f22677a, null, new n(this, null, 1), 3);
        n2(new p0(this, continuation, 7), new whi.b(6));
        l.b1(this, q.Q(this.v, new o(continuation, this, 28)), null, new n(this, null, 2), 3);
        l.b1(this, nim.a.v(((z0h.d) this.f103957t.f226950b).w0(), new q09.a(17)), null, new n(this, null, 0), 3);
        l.b1(this, rd0.e.b(((k) this.f103953p).f(this.u.f103949a)), null, new n(this, null, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f103959x;
    }
}
