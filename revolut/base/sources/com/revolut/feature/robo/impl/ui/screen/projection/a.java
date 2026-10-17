package com.revolut.feature.robo.impl.ui.screen.projection;

import akg.n;
import cli.g;
import cli.y;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import emc.e;
import gig.t;
import jch.p;
import jlc.d;
import jlc.k;
import jlc.u;
import jnc.q;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import te0.w;
import w4l.i;
import yji.l;
import zh9.u0;
import zjh.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements jnc.h {
    public final ProjectionScreenContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f85185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f85186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qmc.h f85187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f85188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final moc.a f85189t;
    public final u u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f85190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f85191x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85192y;

    public a(ProjectionScreenContract$Input input, jnc.e initialState, t mapper, f portfolioInteractor, e templatesInteractor, qmc.h roboPortfolioInfoProvider, d projectionChartWidgetControllerExtension, moc.a disclaimerWidgetDelegate, u roboFooterDisclaimersWidgetProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(projectionChartWidgetControllerExtension, "projectionChartWidgetControllerExtension");
        Intrinsics.checkNotNullParameter(disclaimerWidgetDelegate, "disclaimerWidgetDelegate");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimersWidgetProvider, "roboFooterDisclaimersWidgetProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = input;
        this.f85185p = portfolioInteractor;
        this.f85186q = templatesInteractor;
        this.f85187r = roboPortfolioInfoProvider;
        this.f85188s = projectionChartWidgetControllerExtension;
        this.f85189t = disclaimerWidgetDelegate;
        this.u = roboFooterDisclaimersWidgetProvider;
        this.v = featureToggleInteractor;
        this.f85190w = w.y0(new jj2.a(this, 7));
        this.f85191x = mra.d.b(this, initialState, mapper, null, false, 12);
        this.f85192y = hx7.e.a(this, new p(this, 29));
    }

    @Override // yji.l
    public final void I1() {
        ProjectionScreenContract$Input projectionScreenContract$Input = this.o;
        l.a1(this, glc.a.a(this.f85187r, projectionScreenContract$Input.f85180a), null, null, new q(this, null, 0), 3);
        String str = projectionScreenContract$Input.f85180a;
        vkm.d dVarB = rd0.e.b(this.f85185p.B(str, i.f294643c));
        PortfolioGoal portfolioGoal = projectionScreenContract$Input.f85181b;
        if (portfolioGoal != null) {
            H2(this.f85191x, new jnc.p(this, 0));
        } else {
            l.a1(this, nim.a.v(dVarB, new jn2.a(6)), null, null, new q(this, null, 1), 3);
        }
        n nVarV = nim.a.v(u0.m(dVarB, this.f85186q.e(str)), new jn2.a(7));
        l.a1(this, nVarV, null, null, new q(this, null, 2), 3);
        d dVar = this.f85188s;
        if (portfolioGoal == null) {
            l.a1(this, mo3.a.g(u0.m(nVarV, dVarB), null, new jme.f(6), 1), null, null, new q(this, null, 3), 3);
        } else {
            dVar.e3(new k(str, portfolioGoal, jlc.h.f175685a));
        }
        l.a1(this, dVar.c3(), null, null, new q(this, null, 4), 3);
        l.a1(this, ((ppc.u) this.u).a(jlc.t.PROJECTIONS), null, null, new q(this, null, 5), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85192y;
    }

    @Override // cli.z
    public final g getState() {
        return this.f85191x;
    }
}
