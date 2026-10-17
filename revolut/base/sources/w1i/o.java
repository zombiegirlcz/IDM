package w1i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.exchange.order_settings.OrderSettingsActivity;
import com.revolut.feature_exchange.impl.ui.exchange.order_settings.OrderSettingsContract$Configuration;
import g1i.d0;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import te0.w;
import u80.t;
import vx5.r;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends pri.b implements d {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xpi.g f293865h;
    public final g1i.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f293866j;
    public final ypi.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f293867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t70.b f293868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final OrderSettingsContract$Configuration f293869n;
    public final f9b.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f293870p;

    public o(xpi.g navBarView, g1i.a presentationModel, e router, ypi.i nextButtonView, t ratesFormatter, t70.b currencyLocalization, OrderSettingsContract$Configuration configuration, f9b.f errorView) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(ratesFormatter, "ratesFormatter");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        this.f293865h = navBarView;
        this.i = presentationModel;
        this.f293866j = router;
        this.k = nextButtonView;
        this.f293867l = ratesFormatter;
        this.f293868m = currencyLocalization;
        this.f293869n = configuration;
        this.o = errorView;
        this.f293870p = true;
    }

    public static RateClause N(y1i.b bVar, boolean z) {
        BigDecimal bigDecimal = bVar.f310384c;
        xi0.b bVar2 = bVar.f;
        RateClause.Format.ExchangeRate exchangeRate = new RateClause.Format.ExchangeRate(true);
        Click click = new Click(30, (Integer) null, (Object) null, "CurrentRateDescriptionClickId", false);
        if (!z) {
            click = null;
        }
        return new RateClause(bigDecimal, bVar2, exchangeRate, click);
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        f view = (f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        xpi.c cVar = (xpi.c) this.f293865h;
        cVar.e0(numValueOf);
        r0 r0VarD = w.D(cVar.Q(), new h(this, 2));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new n1i.b(25, new r(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o0(22, function1K), new t1i.n(12, m.f293863a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        efm.b bVarFlatMapCompletable = navBarWithToolbar.p0().flatMapCompletable(new vz4.c(new h(this, 3), 8));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K2 = K();
        n1i.b bVar2 = new n1i.b(25, new r(new BreadcrumbException(), 19));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarFlatMapCompletable, bVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(22, function1K2), new t1i.n(12, n.f293864a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        cVar.n0(new TextLocalisedClause(R$string.fx_orders_settings_title, null, null, 14));
        cVar.Z(true);
        cVar.X(false);
        g1i.a aVar4 = this.i;
        efm.r rVarF = o70.a.f(((d0) aVar4).I3());
        h hVar = new h(this, 4);
        Function1 function1K3 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new n1i.b(25, new r(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(22, hVar), new o0(22, function1K3), new t1i.n(12, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarF2 = o70.a.f(((d0) aVar4).I3());
        vrl.n nVar = new vrl.n(this, view, 25);
        Function1 function1K4 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new n1i.b(25, new r(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o0(22, nVar), new o0(22, function1K4), new t1i.n(12, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r map = ((InputTextDelegate) ((OrderSettingsActivity) view).u0.getValue()).e.f121375b.map(new vz4.c(new vz1.h(14), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r0 r0VarD2 = w.D(map, new h(this, 5));
        Function1 function1K5 = K();
        pfm.a aVar5 = new pfm.a(r0VarD2, new n1i.b(25, new r(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar5.w(new o0(22, function1K5), new t1i.n(12, k.f293861a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(this.f293869n.f96909b, null, null, 14);
        ypi.i iVar = this.k;
        iVar.f(textLocalisedClause);
        r0 r0VarD3 = w.D(iVar.s(), new h(this, 0));
        Function1 function1K6 = K();
        pfm.a aVar6 = new pfm.a(r0VarD3, new n1i.b(25, new r(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar6.w(new o0(22, function1K6), new t1i.n(12, l.f293862a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        efm.r rVarF3 = o70.a.f(((d0) aVar4).I3());
        h hVar2 = new h(this, 1);
        Function1 function1K7 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF3.onErrorResumeNext(new n1i.b(25, new r(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new o0(22, hVar2), new o0(22, function1K7), new t1i.n(12, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
    }
}
