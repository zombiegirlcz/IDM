package z1i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryContract$Configuration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 extends pri.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xpi.g f318823h;
    public final t2i.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t2i.c f318824j;
    public final t2i.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a2i.b f318825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sh5.d f318826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final OrderSummaryContract$Configuration f318827n;

    public i0(xpi.g navBarView, t2i.b presentationModel, t2i.c router, t2i.j orderDetailsUiMapper, a2i.b cryptoCommodityDelegate, sh5.d cryptoFcaDisclaimerWidget, gte.a featureToggleInteractor, OrderSummaryContract$Configuration configuration) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(orderDetailsUiMapper, "orderDetailsUiMapper");
        Intrinsics.checkNotNullParameter(cryptoCommodityDelegate, "cryptoCommodityDelegate");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f318823h = navBarView;
        this.i = presentationModel;
        this.f318824j = router;
        this.k = orderDetailsUiMapper;
        this.f318825l = cryptoCommodityDelegate;
        this.f318826m = cryptoFcaDisclaimerWidget;
        this.f318827n = configuration;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        t2i.d view = (t2i.d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        xpi.c cVar = (xpi.c) this.f318823h;
        cVar.e0(numValueOf);
        cVar.Z(true);
        cVar.l0(false);
        r0 r0VarD = te0.w.D(cVar.Q(), new e0(this, 0));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new nw8.d(28, new yma.w(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new xy7.l(3, function1K), new yzc.p(2, g0.f318821a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        t2i.b bVar2 = this.i;
        efm.r rVarFlatMapSingle = bVar2.d().flatMapSingle(new n(new e0(this, 1), 5));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        efm.r rVarF = o70.a.f(rVarFlatMapSingle);
        e0 e0Var = new e0(this, 2);
        Function1 function1K2 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new nw8.d(28, new yma.w(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new xy7.l(3, e0Var), new xy7.l(3, function1K2), new yzc.p(2, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        r0 r0VarD2 = te0.w.D(te0.w.a0((ihm.f) navBarWithToolbar.f59406n.f258290b, new e0(this, 3)), new e0(this, 4));
        Function1 function1K3 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new nw8.d(28, new yma.w(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new xy7.l(3, function1K3), new yzc.p(2, h0.f318822a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        efm.d0 d0VarFirstOrError = bVar2.d().firstOrError();
        n nVar = new n(new e0(this, 5), 6);
        d0VarFirstOrError.getClass();
        sfm.b bVar3 = new sfm.b(d0VarFirstOrError, nVar, 2);
        Intrinsics.checkNotNullExpressionValue(bVar3, "flatMapObservable(...)");
        efm.r rVarF2 = o70.a.f(bVar3);
        gu8.g gVar = new gu8.g(cVar, 2);
        Function1 function1K4 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new nw8.d(28, new yma.w(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new xy7.l(3, gVar), new xy7.l(3, function1K4), new yzc.p(2, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }
}
