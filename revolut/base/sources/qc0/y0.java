package qc0;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class y0 extends pri.a implements i {
    public final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f244502j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ypi.i f244503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f9b.f f244504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tpi.j f244505n;
    public final hqi.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BackendFlowContract$Configuration f244506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rpi.c f244507q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xpi.g f244508r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Set f244509s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mm.d f244510t;
    public final opi.d u;
    public final qd0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ihm.f f244511w;

    public y0(j router, k state, h presentationModel, ypi.i nextButtonView, f9b.f errorView, tpi.j progressView, hqi.l toolbarView, BackendFlowContract$Configuration configuration, rpi.c keyboardView, npi.a dialogView, pri.f authorizedPresenterDelegate, k3l.b statusViewModel, xpi.g navBarWithToolbarView, Set initSet, mm.d actionsDispatcher, opi.d expandableDialogView, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(statusViewModel, "statusViewModel");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(initSet, "initSet");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.i = router;
        this.f244502j = state;
        this.k = presentationModel;
        this.f244503l = nextButtonView;
        this.f244504m = errorView;
        this.f244505n = progressView;
        this.o = toolbarView;
        this.f244506p = configuration;
        this.f244507q = keyboardView;
        this.f244508r = navBarWithToolbarView;
        this.f244509s = initSet;
        this.f244510t = actionsDispatcher;
        this.u = expandableDialogView;
        this.v = languageProvider;
        P(zhm.u.c(authorizedPresenterDelegate));
        ihm.f fVar = new ihm.f();
        Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
        this.f244511w = fVar;
    }

    public final void Q(l lVar) {
        Object value = ((b) lVar).f244395t0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LargeActionButton) value).setVisibility(8);
        efm.b bVarU = mo3.a.u(hx7.a.L(o70.a.g(this.i.h0()), this.f244504m, false, null, 24), this.f244505n, true);
        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(bVarU, new n1i.b(10, new pzc.g(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new nii.o0(10, function1K), new ozc.z(17, o0.f244468a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }

    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void N(l view) throws Throwable {
        Throwable th10;
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator it8 = this.f244509s.iterator();
        while (it8.hasNext()) {
            ((e0m.d) it8.next()).init();
        }
        k kVar = this.f244502j;
        te0.v vVarP = kVar.P();
        od0.h hVar = od0.i.Companion;
        BackendFlowContract$Configuration backendFlowContract$Configuration = this.f244506p;
        AnalyticsProduct analyticsProduct = backendFlowContract$Configuration.d;
        hVar.getClass();
        ((te0.r) vVarP).set(od0.h.a(analyticsProduct));
        kVar.h().set(backendFlowContract$Configuration.e);
        h hVar2 = this.k;
        if (hVar2.u2()) {
            Q(view);
        }
        Locale localeA = ((s80.b) this.v).a();
        te0.e locale = kVar.getLocale();
        boolean zIsInitialized = locale.isInitialized();
        int i = 23;
        int i2 = 2;
        int i3 = 10;
        int i5 = 1;
        ifm.b bVar = this.f239031a;
        if (!zIsInitialized) {
            th10 = null;
            locale.set(localeA);
        } else if (((Locale) locale.get()).equals(localeA)) {
            th10 = null;
        } else {
            pfm.a aVarE = hVar2.p1().e(te0.w.z0(locale, localeA));
            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
            efm.b bVarU = mo3.a.u(o70.a.g(aVarE), this.f244505n, true);
            Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
            efm.b bVarL = hx7.a.L(bVarU, this.f244504m, true, null, 24);
            qba.b bVar2 = new qba.b(this, view, i5);
            Function1 function1K = K();
            th10 = null;
            pfm.a aVar = new pfm.a(bVarL, new n1i.b(10, new pzc.g(new BreadcrumbException(), i)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
            ofm.h hVarW = aVar.w(new nii.o0(10, function1K), new ozc.z(17, bVar2));
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
            te0.w.j0(bVar, hVarW);
        }
        qfm.r0 r0VarD = te0.w.D(this.f244503l.s(), new k0(this, 7));
        Function1 function1K2 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new n1i.b(10, new r0(new BreadcrumbException(), i5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar2.w(new nii.o0(10, function1K2), new ozc.z(17, s0.f244485a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        efm.r map = this.f244511w.map(new q2j.k(i3));
        xpi.c cVar = (xpi.c) this.f244508r;
        efm.r map2 = cVar.Q().map(new l0(0, new qb5.a(14)));
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw th10;
        }
        efm.r rVarMergeArray = efm.r.mergeArray(map, map2, navBarWithToolbar.f59409p.f57336l.map(new l0(i5, new qb5.a(15))));
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        efm.b bVarFlatMapCompletable = o70.a.f(rVarMergeArray).flatMapSingle(new l0(i2, new k0(this, 5))).flatMapCompletable(new l0(3, new k0(this, 6)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K3 = K();
        n1i.b bVar3 = new n1i.b(10, new r0(new BreadcrumbException(), i2));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarFlatMapCompletable, bVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar3.w(new nii.o0(10, function1K3), new ozc.z(17, t0.f244488a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        efm.r rVarF = o70.a.f(te0.w.l(hVar2.o1(), hVar2.n()));
        q2g.h hVar3 = new q2g.h(this, view, 24);
        Function1 function1K4 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new n1i.b(10, new pzc.g(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new nii.o0(10, hVar3), new nii.o0(10, function1K4), new ozc.z(17, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarFlatMapSingle = ((f1) this.i).f244422l.flatMapSingle(new l0(4, new k0(this, 8)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        k0 k0Var = new k0(this, 9);
        Function1 function1K5 = K();
        Function0 function0J2 = J();
        int i6 = 26;
        efm.r rVarOnErrorResumeNext2 = rVarFlatMapSingle.onErrorResumeNext(new n1i.b(10, new pzc.g(new BreadcrumbException(), i6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new nii.o0(10, k0Var), new nii.o0(10, function1K5), new ozc.z(17, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        b bVar4 = (b) view;
        efm.b bVarFlatMapCompletable2 = bVar4.B0.flatMapCompletable(new u(new k0(this, i3), 23));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        Function1 function1K6 = K();
        n1i.b bVar5 = new n1i.b(10, new r0(new BreadcrumbException(), 3));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar4 = new pfm.a(bVarFlatMapCompletable2, bVar5, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar4.w(new nii.o0(10, function1K6), new ozc.z(17, u0.f244491a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        efm.b bVarFlatMapCompletable3 = bVar4.C0.flatMapCompletable(new u(new k0(this, 0), 24));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable3, "flatMapCompletable(...)");
        Function1 function1K7 = K();
        n1i.b bVar6 = new n1i.b(10, new r0(new BreadcrumbException(), 4));
        bVarFlatMapCompletable3.getClass();
        pfm.a aVar5 = new pfm.a(bVarFlatMapCompletable3, bVar6, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar5.w(new nii.o0(10, function1K7), new ozc.z(17, v0.f244494a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar, hVarW5);
        efm.b bVarFlatMapCompletable4 = bVar4.D0.filter(new u(new k0(this, 1), 25)).flatMapCompletable(new u(new k0(this, 2), i6));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable4, "flatMapCompletable(...)");
        Function1 function1K8 = K();
        int i21 = 28;
        n1i.b bVar7 = new n1i.b(10, new pzc.g(new BreadcrumbException(), i21));
        bVarFlatMapCompletable4.getClass();
        pfm.a aVar6 = new pfm.a(bVarFlatMapCompletable4, bVar7, 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar6.w(new nii.o0(10, function1K8), new ozc.z(17, w0.f244497a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar, hVarW6);
        efm.b bVarFlatMapCompletable5 = bVar4.E0.filter(new u(new k0(this, 3), 27)).flatMapCompletable(new u(new k0(this, 4), i21));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable5, "flatMapCompletable(...)");
        Function1 function1K9 = K();
        int i22 = 29;
        n1i.b bVar8 = new n1i.b(10, new pzc.g(new BreadcrumbException(), i22));
        bVarFlatMapCompletable5.getClass();
        pfm.a aVar7 = new pfm.a(bVarFlatMapCompletable5, bVar8, 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar7.w(new nii.o0(10, function1K9), new ozc.z(17, p0.f244472a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar, hVarW7);
        efm.b bVarFlatMapCompletable6 = te0.w.a0(((LargeActionButtonDelegate) bVar4.y0.getValue()).d.f121375b, new qb5.a(6)).flatMapCompletable(new u(new pvc.e(1, this.i, j.class, "goToAction", "goToAction(Lcom/revolut/feature/backend_flow/domain/models/Action;)Lio/reactivex/Completable;", 0, 19), i22));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable6, "flatMapCompletable(...)");
        Function1 function1K10 = K();
        n1i.b bVar9 = new n1i.b(10, new r0(new BreadcrumbException(), 0));
        bVarFlatMapCompletable6.getClass();
        pfm.a aVar8 = new pfm.a(bVarFlatMapCompletable6, bVar9, 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW8 = aVar8.w(new nii.o0(10, function1K10), new ozc.z(17, q0.f244476a));
        Intrinsics.checkNotNullExpressionValue(hVarW8, "subscribe(...)");
        te0.w.j0(bVar, hVarW8);
        Intrinsics.checkNotNullParameter(hVar2, "<this>");
        efm.r rVarN = hVar2.n();
        uc0.c cVar2 = uc0.c.f;
        efm.r rVarDistinctUntilChanged = rVarN.map(new tc7.m0(24)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged2 = te0.w.l(rVarDistinctUntilChanged, te0.w.F0(hVar2.o1(), hVar2.f1())).flatMapMaybe(new ubj.c(8, new u8c.c(24))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        efm.r rVarF2 = o70.a.f(rVarDistinctUntilChanged2);
        qa9.r rVar = new qa9.r(view, i3);
        Function1 function1K11 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF2.onErrorResumeNext(new n1i.b(10, new pzc.g(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new nii.o0(10, rVar), new nii.o0(10, function1K11), new ozc.z(17, function0J3));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
    }

    public final pfm.a S() {
        efm.b bVarU = mo3.a.u(hx7.a.L(o70.a.g(((f1) this.i).l()), this.f244504m, false, null, 24), this.f244505n, true);
        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
        return ue0.e.v(bVarU);
    }

    public void d() {
        if (((Stack) this.f244502j.r0().get()).contains("STEP_RESULT")) {
            ((f1) this.i).k.onNext(FinishFlowCommand.f98647a);
        }
    }
}
