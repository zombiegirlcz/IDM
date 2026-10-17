package com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information;

import cli.y;
import emc.e;
import inc.g;
import inc.j;
import inc.k;
import inc.l;
import ip0.v7;
import jlc.t;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import poc.b;
import ppc.u;
import vkm.q0;
import zjh.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements g {

    @NotNull
    public static final k Companion = new k();
    public final PortfolioStrategyInformationScreenContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f85173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final doc.f f85174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f85175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f85176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f85177t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(j mapper, PortfolioStrategyInformationScreenContract$Input input, f portfolioInteractor, doc.f chartWidgetExtension, e templatesInteractor, b portfolioRiskMetricsWidgetDelegate, u roboFooterDisclaimersWidgetProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(chartWidgetExtension, "chartWidgetExtension");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(portfolioRiskMetricsWidgetDelegate, "portfolioRiskMetricsWidgetDelegate");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimersWidgetProvider, "roboFooterDisclaimersWidgetProvider");
        this.o = input;
        this.f85173p = portfolioInteractor;
        this.f85174q = chartWidgetExtension;
        this.f85175r = templatesInteractor;
        this.f85176s = portfolioRiskMetricsWidgetDelegate;
        this.f85177t = roboFooterDisclaimersWidgetProvider;
        this.u = d.b(this, new inc.e(0), mapper, null, false, 12);
        this.v = hx7.e.a(this, new in1.a(this, 1));
    }

    @Override // yji.l
    public final void I1() {
        q0 q0VarY = v7.y("PortfolioStrategyInformationScreen", "observeTemplate onCreated", xam.a.h(new l(this, null, 6), rd0.e.b(this.f85173p.B(this.o.f85171a, w4l.h.f294642c))));
        yji.l.a1(this, v7.y("PortfolioStrategyInformationScreen", "observeTemplateRiskMetrics onCreated", xam.a.h(new l(this, null, 0), q0VarY)), null, null, new l(this, null, 1), 3);
        yji.l.a1(this, q0VarY, null, null, new l(this, null, 2), 3);
        yji.l.a1(this, mo3.a.g(q0VarY, null, null, 3), null, null, new l(this, null, 3), 3);
        yji.l.a1(this, this.f85174q.c3(), null, null, new l(this, null, 4), 3);
        yji.l.a1(this, this.f85177t.a(t.TEMPLATES), null, null, new l(this, null, 5), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
