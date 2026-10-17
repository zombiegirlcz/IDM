package dz7;

import a08.o0;
import a08.p0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import cu8.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tx0.j0;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends bsi.a implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f121283j;
    public final ypi.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f121284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f121285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f121286n;
    public final ez7.b o;

    public q(xpi.g navBarView, ypi.i nextButtonView, f9b.f errorView, m presentationModel, f router, ez7.b uiBuilder) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f121283j = navBarView;
        this.k = nextButtonView;
        this.f121284l = errorView;
        this.f121285m = presentationModel;
        this.f121286n = router;
        this.o = uiBuilder;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        h view = (h) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_dashboard_issues_payment_overdue_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f121283j;
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.c0(j0.MULTILINE);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        final int i = 1;
        pfm.a aVar2 = new pfm.a(w.D(cVar.Q(), new Function1(this) { // from class: dz7.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f121280b;

            {
                this.f121280b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        q qVar = this.f121280b;
                        f fVar = qVar.f121286n;
                        s sVar = (s) qVar.f121285m.d;
                        dj0.d dVar = (dj0.d) w.O(sVar.f121289b.getValue(sVar, s.f121288c[0]));
                        return ((r) fVar).f121287a.a(u0.f(new InitTopUpDestination(dVar != null ? TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVar, null, null, 30) : TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, null, 31))));
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return okl.m.w(null, null, null, 7, ((r) this.f121280b.f121286n).f121287a);
                }
            }
        }), new p0(8, new u(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        a08.q qVar = new a08.q(25, o.f121281a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new o0(9, sVar), qVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        ypi.i iVar = this.k;
        iVar.setVisible(false);
        iVar.setEnabled(false);
        final int i2 = 0;
        pfm.a aVar3 = new pfm.a(w.D(iVar.s(), new Function1(this) { // from class: dz7.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f121280b;

            {
                this.f121280b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        q qVar2 = this.f121280b;
                        f fVar = qVar2.f121286n;
                        s sVar2 = (s) qVar2.f121285m.d;
                        dj0.d dVar = (dj0.d) w.O(sVar2.f121289b.getValue(sVar2, s.f121288c[0]));
                        return ((r) fVar).f121287a.a(u0.f(new InitTopUpDestination(dVar != null ? TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVar, null, null, 30) : TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, null, 31))));
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return okl.m.w(null, null, null, 7, ((r) this.f121280b.f121286n).f121287a);
                }
            }
        }), new p0(8, new u(new BreadcrumbException(), 27)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(9, sVar), new a08.q(25, p.f121282a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        m mVar = this.f121285m;
        efm.r rVarN = hx7.a.N(o70.a.f(m70.a.f(pd.b.t(((w4l.f) ((kx7.w) mVar.f121277b.f138763a).d.getValue()).f(Unit.f186387a, true), new j(mVar, 0)), new dbg.b(this, 17), new dt4.p(this, 15), new dug.d(25))), this.f121284l, false, false);
        doe.c cVar2 = new doe.c(view, this, 21);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new p0(8, new u(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(9, cVar2), new o0(9, sVar), new a08.q(25, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
