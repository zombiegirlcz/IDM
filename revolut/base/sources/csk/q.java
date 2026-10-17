package csk;

import a08.r;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsActivity;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsContract$Configuration;
import efm.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import te0.s;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StockFinancialsStatementsContract$Configuration f108523h;
    public final xpi.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tri.c f108524j;
    public final yrk.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f108525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f108526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final opi.d f108527n;

    public q(StockFinancialsStatementsContract$Configuration configuration, xpi.g navBar, tri.c backButtonView, yrk.g presentationModel, d router, j mapper, opi.d expandableDialogView) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        this.f108523h = configuration;
        this.i = navBar;
        this.f108524j = backButtonView;
        this.k = presentationModel;
        this.f108525l = router;
        this.f108526m = mapper;
        this.f108527n = expandableDialogView;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        g view = (g) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        StockFinancialsStatementsContract$Configuration stockFinancialsStatementsContract$Configuration = this.f108523h;
        String ref2 = stockFinancialsStatementsContract$Configuration.f103795b;
        yrk.g gVar = this.k;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        f fVar = gVar.f316331a;
        xrk.k kVar = (xrk.k) fVar;
        if (!kVar.w0().isInitialized()) {
            kVar.w0().set(ref2);
        }
        te0.e eVarW0 = kVar.w0();
        s sVar = s.f270018a;
        d0 d0VarFirstOrError = eVarW0.c(sVar).firstOrError();
        ypg.l lVar = new ypg.l(new yrk.d(gVar, 1), 12);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(d0VarFirstOrError, lVar, 0), new ypg.l(new ypd.i(27), 8), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.n nVarI = o70.a.i(iVar);
        k kVar2 = new k(this, 0);
        Function1 function1K = K();
        ufm.i iVar2 = new ufm.i(nVarI, new r(12, new c0d.j(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        ofm.i iVar3 = new ofm.i(new a0d.g(8, kVar2), new a0d.g(8, function1K), 0);
        iVar2.q(iVar3);
        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, iVar3);
        efm.r rVarC = ((xrk.k) fVar).x0().c(sVar);
        efm.r rVarHide = gVar.d.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarTakeUntil = rVarC.takeUntil(rVarHide);
        Intrinsics.checkNotNullExpressionValue(rVarTakeUntil, "takeUntil(...)");
        efm.r rVarF = o70.a.f(rVarTakeUntil);
        k kVar3 = new k(this, 4);
        Function1 function1K2 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new r(12, new c0d.j(new BreadcrumbException(), 12)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0d.g(8, kVar3), new a0d.g(8, function1K2), new a08.q(20, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarSwitchMap = ((xrk.k) fVar).x0().c(sVar).switchMap(new ypg.l(new yrk.d(gVar, 0), 9));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarA0 = w.a0(rVarSwitchMap, new ypd.i(26));
        efm.r rVarHide2 = gVar.d.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        efm.r rVarTakeUntil2 = rVarA0.takeUntil(rVarHide2);
        Intrinsics.checkNotNullExpressionValue(rVarTakeUntil2, "takeUntil(...)");
        efm.r rVarF2 = o70.a.f(rVarTakeUntil2);
        cp7.k kVar4 = new cp7.k(view, 19);
        Function1 function1K3 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new r(12, new c0d.j(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a0d.g(8, kVar4), new a0d.g(8, function1K3), new a08.q(20, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        String ref3 = stockFinancialsStatementsContract$Configuration.f103795b;
        uqk.l statementType = stockFinancialsStatementsContract$Configuration.f103796c;
        Intrinsics.checkNotNullParameter(ref3, "ref");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        efm.r rVarSwitchMap2 = kVar.x0().c(sVar).distinctUntilChanged().switchMap(new ypg.l(new yrk.e(gVar, 1, ref3, statementType), 11));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        efm.r rVarHide3 = gVar.d.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide3, "hide(...)");
        efm.r rVarTakeUntil3 = rVarSwitchMap2.takeUntil(rVarHide3);
        Intrinsics.checkNotNullExpressionValue(rVarTakeUntil3, "takeUntil(...)");
        efm.r rVarF3 = o70.a.f(rVarTakeUntil3);
        cma.b bVar2 = new cma.b(this, view, 19);
        Function1 function1K4 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF3.onErrorResumeNext(new r(12, new c0d.j(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new a0d.g(8, bVar2), new a0d.g(8, function1K4), new a08.q(20, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        StockFinancialsStatementsActivity stockFinancialsStatementsActivity = (StockFinancialsStatementsActivity) view;
        efm.r rVarDoOnNext = w.a0(stockFinancialsStatementsActivity.f103791v0.p(), new cs.a(10)).doOnNext(new com.onfido.android.sdk.capture.ui.userconsent.c(new k(this, 5), 27));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        r0 r0VarD = w.D(rVarDoOnNext, new k(this, 6));
        Function1 function1K5 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new r(12, new c0d.j(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new a0d.g(8, function1K5), new a08.q(20, m.f108520a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        Tabs tabsZ0 = stockFinancialsStatementsActivity.Z0();
        Intrinsics.checkNotNullParameter(tabsZ0, "<this>");
        efm.r map = tabsZ0.f58882b.map(new com.onfido.android.sdk.capture.ui.userconsent.c(new cs.a(11), 28));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarMergeWith = map.mergeWith(stockFinancialsStatementsActivity.y0.map(new com.onfido.android.sdk.capture.ui.userconsent.c(new cs.a(8), 26)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        efm.r rVarDistinctUntilChanged = rVarMergeWith.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r0 r0VarD2 = w.D(rVarDistinctUntilChanged, new k(this, 1));
        Function1 function1K6 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new r(12, new c0d.j(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new a0d.g(8, function1K6), new a08.q(20, n.f108521a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        xpi.c cVar = (xpi.c) this.i;
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        efm.r rVarA02 = w.a0(navBarWithToolbar.s0(), new cs.a(9));
        k kVar5 = new k(this, 2);
        Function1 function1K7 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarA02.onErrorResumeNext(new r(12, new c0d.j(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new a0d.g(8, kVar5), new a0d.g(8, function1K7), new a08.q(20, function0J4));
        w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        efm.r rVarMergeWith2 = cVar.Q().mergeWith(this.f108524j.f273801b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith2, "mergeWith(...)");
        r0 r0VarD3 = w.D(rVarMergeWith2, new k(this, 3));
        Function1 function1K8 = K();
        pfm.a aVar4 = new pfm.a(r0VarD3, new r(12, new c0d.j(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new a0d.g(8, function1K8), new a08.q(20, o.f108522a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
    }
}
