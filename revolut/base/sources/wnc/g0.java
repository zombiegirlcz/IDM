package wnc;

import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreenContract$Input;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.t0;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 extends jki.g implements n {
    public final ync.h A;
    public final j2 B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ync.c f298788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f298789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final poc.b f298790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f298791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.feature.robo.impl.ui.screen.templates.a f298792t;
    public final y u;
    public final moc.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jlc.u f298793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final doc.f f298794x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qmc.b f298795y;
    public final emc.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ync.m mapper, ync.c dialogMapper, m initialState, poc.b portfolioRiskMetricsWidgetDelegate, j60.a bottomExpandableDialogControllerExtension, com.revolut.feature.robo.impl.ui.screen.templates.a observeTemplateSelectionMode, y templateRiskDialogProvider, moc.a disclaimerWidgetDelegate, jlc.u roboFooterDisclaimersWidgetProvider, doc.f chartWidgetExtension, qmc.b roboContextProvider, emc.e templatesInteractor, ync.h templateTabsModeMapper) {
        super(mapper);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(portfolioRiskMetricsWidgetDelegate, "portfolioRiskMetricsWidgetDelegate");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(observeTemplateSelectionMode, "observeTemplateSelectionMode");
        Intrinsics.checkNotNullParameter(templateRiskDialogProvider, "templateRiskDialogProvider");
        Intrinsics.checkNotNullParameter(disclaimerWidgetDelegate, "disclaimerWidgetDelegate");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimersWidgetProvider, "roboFooterDisclaimersWidgetProvider");
        Intrinsics.checkNotNullParameter(chartWidgetExtension, "chartWidgetExtension");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(templateTabsModeMapper, "templateTabsModeMapper");
        this.f298788p = dialogMapper;
        this.f298789q = initialState;
        this.f298790r = portfolioRiskMetricsWidgetDelegate;
        this.f298791s = bottomExpandableDialogControllerExtension;
        this.f298792t = observeTemplateSelectionMode;
        this.u = templateRiskDialogProvider;
        this.v = disclaimerWidgetDelegate;
        this.f298793w = roboFooterDisclaimersWidgetProvider;
        this.f298794x = chartWidgetExtension;
        this.f298795y = roboContextProvider;
        this.z = templatesInteractor;
        this.A = templateTabsModeMapper;
        this.B = vkm.q.c(((m) t2()).d);
    }

    @Override // yji.l
    public final void I1() {
        j2 j2Var = this.B;
        Continuation continuation = null;
        yji.l.a1(this, new t0(j2Var, 1), null, null, new c0(0, null, this), 3);
        yji.l.a1(this, vkm.q.Q(new t0(j2Var, 1), new b0(0, continuation, this)), null, null, new c0(1, null, this), 3);
        com.revolut.feature.robo.impl.ui.screen.templates.a aVar = this.f298792t;
        zjh.f fVar = aVar.f85218b;
        TemplatesScreenContract$Input templatesScreenContract$Input = aVar.f85217a;
        akg.n nVarV = nim.a.v(u0.m(rd0.e.b(fVar.B(templatesScreenContract$Input.getF85214a(), w4l.i.f294643c)), aVar.f85219c.e(templatesScreenContract$Input.getF85214a())), new wk2.x(aVar, 18));
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, yh5.b.d(rd0.e.n(rd0.e.n(nVarV, h0Var), h0Var), j2Var), null, null, new c0(2, null, this), 3);
        yji.l.a1(this, ((ppc.u) this.f298793w).a(jlc.t.TEMPLATES), null, null, new c0(3, null, this), 3);
        yji.l.a1(this, vkm.q.Q(vkm.q.q(mo3.a.g(nim.a.v(new vy5.d0(q2(), 8), new x(0)), null, null, 3)), new b0(1, continuation, this)), null, null, null, 7);
        yji.l.a1(this, this.f298795y.a(), null, null, new c0(4, null, this), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f298789q;
    }
}
