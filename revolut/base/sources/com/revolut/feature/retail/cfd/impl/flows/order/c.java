package com.revolut.feature.retail.cfd.impl.flows.order;

import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vmf.k;
import vsl.f;
import vvc.s;
import w2b.d;
import wp5.y;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements w2b.c {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t2b.c f82185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s2b.b f82186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final toh.d f82187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vrl.b f82188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qki.d f82189t;
    public final i u;

    public c(i90.b uuidUtils, d input, t2b.c cfdFlowDataMediator, s2b.b tutorialSettingsProvider, toh.d cfdOrderMaxPositionsLimitProvider, vrl.b orderLimitsByPortfolioInteractor) {
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(cfdFlowDataMediator, "cfdFlowDataMediator");
        Intrinsics.checkNotNullParameter(tutorialSettingsProvider, "tutorialSettingsProvider");
        Intrinsics.checkNotNullParameter(cfdOrderMaxPositionsLimitProvider, "cfdOrderMaxPositionsLimitProvider");
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolioInteractor, "orderLimitsByPortfolioInteractor");
        this.o = input;
        this.f82185p = cfdFlowDataMediator;
        this.f82186q = tutorialSettingsProvider;
        this.f82187r = cfdOrderMaxPositionsLimitProvider;
        this.f82188s = orderLimitsByPortfolioInteractor;
        this.f82189t = e.b(this, new CfdOrderFlowContract$State(y.u(uuidUtils, "toString(...)"), (CfdOrderData) cfdFlowDataMediator.f267528a.getValue()));
        this.u = d8l.d.a(this, new s(this, 12));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f82185p, null, null, new vrl.d(this, null, 21), 3);
    }

    @Override // yki.j
    public final void M0() {
        l2(new k(this, null, 21), new f(1, this, c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 14));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f82189t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
