package a08;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderActivity;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zw7.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends pri.a implements h, g {
    public final /* synthetic */ g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final iqi.h f168j;
    public final uz7.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uz7.a f169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f9b.f f171n;
    public final opi.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mm.d f172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b08.c f173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kpi.c f174r;

    public c0(iqi.h twinVerticalButtonView, uz7.b router, uz7.a presentationModel, y0 screenStateMapper, f9b.f errorView, opi.d expandableDialogView, mm.d actionDispatcher, b08.c uiBuilder, kpi.c activityResult, pri.f authorizedPresenterDelegate, g configurablePresenterDelegate) {
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(screenStateMapper, "screenStateMapper");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(activityResult, "activityResult");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(configurablePresenterDelegate, "configurablePresenterDelegate");
        this.i = configurablePresenterDelegate;
        this.f168j = twinVerticalButtonView;
        this.k = router;
        this.f169l = presentationModel;
        this.f170m = screenStateMapper;
        this.f171n = errorView;
        this.o = expandableDialogView;
        this.f172p = actionDispatcher;
        this.f173q = uiBuilder;
        this.f174r = activityResult;
        P(zhm.v.k(authorizedPresenterDelegate, configurablePresenterDelegate));
    }

    @Override // a08.g
    public final void A(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.i.A(view);
    }

    @Override // pri.f
    public final boolean C(Object obj2) {
        j view = (j) obj2;
        Intrinsics.checkNotNullParameter(view, "view");
        return this.i.C(view);
    }

    @Override // a08.g
    public final void D(h1 h1Var) {
        this.i.D(h1Var);
    }

    @Override // a08.g
    public final ifm.c F() {
        return this.i.F();
    }

    @Override // a08.g
    public final ifm.c H(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.i.H(view);
    }

    @Override // pri.b, pri.f
    public final void I() {
        this.i.I();
    }

    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        j view = (j) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Object obj2 = this.f169l;
        ((nri.a) obj2).init();
        g();
        A(view);
        ihm.b bVar = ((iqi.b) this.f168j).k;
        int i = 0;
        e eVar = new e(1, view, j.class, "updateBottomPadding", "updateBottomPadding(I)V", i, 1);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = bVar.onErrorResumeNext(new s(0, new p(new BreadcrumbException(), i)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new r(0, eVar), new r(0, function1K), new q(0, function0J));
        ifm.b bVar2 = this.f239031a;
        te0.w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        PetPlanBuilderActivity petPlanBuilderActivity = (PetPlanBuilderActivity) view;
        efm.r rVarHide = petPlanBuilderActivity.H0.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r map = rVarHide.distinctUntilChanged().map(new a05.a(new m(this, 11), 3));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        m mVar = new m(this, 12);
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = map.onErrorResumeNext(new s(0, new p(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new r(0, mVar), new r(0, function1K2), new q(0, function0J2));
        te0.w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        n();
        m();
        F();
        k();
        H(view);
        q();
        o(view);
        x(view);
        uz7.p pVar = (uz7.p) obj2;
        efm.r rVarF = o70.a.f(m70.a.g(pVar.p3(), null, new n(0), 1));
        m mVar2 = new m(this, 1);
        Function1 function1K3 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF.onErrorResumeNext(new s(0, new p(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new r(0, mVar2), new r(0, function1K3), new q(0, function0J3));
        te0.w.j0(bVar2, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.r map2 = pVar.o3().map(new a05.a(new m(this, 2), 1));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        uz7.r rVar = (uz7.r) pVar.e;
        te0.e eVarC0 = rVar.C0();
        te0.s sVar = te0.s.f270018a;
        efm.r map3 = te0.w.f0(te0.w.n(map2, eVarC0.c(sVar), rVar.B0().c(sVar), rVar.A0().c(sVar))).map(new a05.a(new m(this, 3), 2));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        efm.r rVarN = hx7.a.N(o70.a.f(map3), this.f171n, false, false);
        o oVar = new o(view, this, 0);
        Function1 function1K4 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarN.onErrorResumeNext(new s(0, new p(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new r(0, oVar), new r(0, function1K4), new q(0, function0J4));
        te0.w.j0(bVar2, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        efm.b bVarFlatMapCompletable = i26.l.g(this.f174r.N(200)).flatMapCompletable(new a05.a(new m(this, 13), 4));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        pfm.a aVarV = ue0.e.v(bVarFlatMapCompletable);
        Function1 function1K5 = K();
        pfm.a aVar2 = new pfm.a(aVarV, new s(0, new p(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new r(0, function1K5), new q(0, v.f228a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar2, hVarW);
        efm.r rVarF2 = o70.a.f(pVar.f284614h.u0());
        e eVar2 = new e(1, this, c0.class, "onPolicyStartDateSelected", "onPolicyStartDateSelected(Ljava/util/Date;)V", 0, 2);
        Function1 function1K6 = K();
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext5 = rVarF2.onErrorResumeNext(new s(0, new p(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new r(0, eVar2), new r(0, function1K6), new q(0, function0J5));
        te0.w.j0(bVar2, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        qfm.r0 r0VarD = te0.w.D(((TabsDelegate) petPlanBuilderActivity.f76369v0.getValue()).f53515c.f121375b, new m(this, 8));
        Function1 function1K7 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new s(0, new p(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new r(0, function1K7), new q(0, a0.f163a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar2, hVarW2);
        qfm.r0 r0VarD2 = te0.w.D(((ListSubheaderDelegate) petPlanBuilderActivity.u0.getValue()).d, new m(this, 0));
        Function1 function1K8 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new s(0, new p(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new r(0, function1K8), new q(0, b0.f165a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar2, hVarW3);
        qfm.r0 r0VarD3 = te0.w.D(((LargeActionButtonDelegate) petPlanBuilderActivity.f76371x0.getValue()).d.f121375b, new m(this, 9));
        Function1 function1K9 = K();
        pfm.a aVar5 = new pfm.a(r0VarD3, new s(0, new p(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new r(0, function1K9), new q(0, z.f240a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar2, hVarW4);
        qfm.r0 r0VarD4 = te0.w.D(((InputChecklistDelegate) petPlanBuilderActivity.f76370w0.getValue()).f52518c, new m(this, 10));
        Function1 function1K10 = K();
        pfm.a aVar6 = new pfm.a(r0VarD4, new s(0, new p(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new r(0, function1K10), new q(0, y.f239a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar2, hVarW5);
        qfm.r0 r0VarD5 = te0.w.D(((TextDelegate) petPlanBuilderActivity.y0.getValue()).d, new m(this, 7));
        Function1 function1K11 = K();
        pfm.a aVar7 = new pfm.a(r0VarD5, new s(0, new p(new BreadcrumbException(), 7)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new r(0, function1K11), new q(0, w.f233a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar2, hVarW6);
        qfm.r0 r0VarD6 = te0.w.D(((DatePickerDelegate) petPlanBuilderActivity.z0.getValue()).f52176c.f121375b, new m(this, 4));
        Function1 function1K12 = K();
        pfm.a aVar8 = new pfm.a(r0VarD6, new s(0, new p(new BreadcrumbException(), 4)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new r(0, function1K12), new q(0, t.f224a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar2, hVarW7);
        qfm.r0 r0VarD7 = te0.w.D(((LargeActionButtonDelegate) petPlanBuilderActivity.A0.getValue()).d.f121375b, new m(this, 5));
        Function1 function1K13 = K();
        pfm.a aVar9 = new pfm.a(r0VarD7, new s(0, new p(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        ofm.h hVarW8 = aVar9.w(new r(0, function1K13), new q(0, u.f226a));
        Intrinsics.checkNotNullExpressionValue(hVarW8, "subscribe(...)");
        te0.w.j0(bVar2, hVarW8);
        qfm.r0 r0VarD8 = te0.w.D(((FullScreenStateDelegate) petPlanBuilderActivity.B0.getValue()).f52371h.f121375b, new m(this, 6));
        Function1 function1K14 = K();
        pfm.a aVar10 = new pfm.a(r0VarD8, new s(0, new p(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        ofm.h hVarW9 = aVar10.w(new r(0, function1K14), new q(0, x.f235a));
        Intrinsics.checkNotNullExpressionValue(hVarW9, "subscribe(...)");
        te0.w.j0(bVar2, hVarW9);
    }

    @Override // a08.g
    public final boolean b() {
        return this.i.b();
    }

    @Override // a08.g
    public final void f(zw7.d0 pet) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        this.i.f(pet);
    }

    @Override // a08.g
    public final void g() {
        this.i.g();
    }

    @Override // a08.g
    public final void k() {
        this.i.k();
    }

    @Override // a08.g
    public final ifm.c m() {
        return this.i.m();
    }

    @Override // a08.g
    public final ifm.c n() {
        return this.i.n();
    }

    @Override // a08.g
    public final ifm.c o(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.i.o(view);
    }

    @Override // a08.g
    public final ifm.c q() {
        return this.i.q();
    }

    @Override // a08.g
    public final void v(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.i.v(date);
    }

    @Override // a08.g
    public final ifm.c x(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.i.x(view);
    }

    @Override // a08.g
    public final void z(boolean z) {
        this.i.z(z);
    }
}
