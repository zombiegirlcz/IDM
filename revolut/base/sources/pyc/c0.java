package pyc;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.selfserve.sot.impl.ui.SotActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends bsi.a implements g {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f240757j;
    public final c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xpi.g f240758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ypi.i f240759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f240760n;
    public final sri.m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bqi.d f240761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tri.c f240762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final opi.d f240763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kpi.c f240764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t70.g f240765t;

    public c0(f presentationModel, c mapper, xpi.g navBarWithToolbarView, ypi.i nextButtonView, h router, sri.m navigator, bqi.d progressDialogView, tri.c backButtonView, opi.d expandableDialogView, kpi.c activityResultDelegate, t70.g localization) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(progressDialogView, "progressDialogView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f240757j = presentationModel;
        this.k = mapper;
        this.f240758l = navBarWithToolbarView;
        this.f240759m = nextButtonView;
        this.f240760n = router;
        this.o = navigator;
        this.f240761p = progressDialogView;
        this.f240762q = backButtonView;
        this.f240763r = expandableDialogView;
        this.f240764s = activityResultDelegate;
        this.f240765t = localization;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        k view = (k) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        xpi.c cVar = (xpi.c) this.f240758l;
        cVar.e0(numValueOf);
        pfm.a aVar2 = new pfm.a(te0.w.D(cVar.b(), new u(this, 5)), new o9h.d(11, new pjg.k(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ozc.z zVar = new ozc.z(13, y.f240808a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new nw8.d(6, sVar), zVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        t tVar = (t) this.f240757j;
        efm.r rVarSwitchMap = tVar.u3().switchMap(new r(8, new u(this, 11)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarF = o70.a.f(rVarSwitchMap);
        u uVar = new u(this, 12);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new o9h.d(11, new pjg.k(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new nw8.d(6, uVar), new nw8.d(6, sVar), new ozc.z(13, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarSwitchMap2 = o70.a.f(tVar.u3()).switchMap(new r(9, new u(this, 13)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        efm.r rVarF2 = o70.a.f(rVarSwitchMap2);
        u uVar2 = new u(this, 14);
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new o9h.d(11, new pjg.k(new BreadcrumbException(), 20)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new nw8.d(6, uVar2), new nw8.d(6, sVar), new ozc.z(13, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r rVarSwitchMap3 = tVar.u3().switchMap(new r(10, new u(this, 15)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap3, "switchMap(...)");
        efm.r rVarF3 = o70.a.f(rVarSwitchMap3);
        u uVar3 = new u(this, 16);
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF3.onErrorResumeNext(new o9h.d(11, new pjg.k(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new nw8.d(6, uVar3), new nw8.d(6, sVar), new ozc.z(13, function0J3));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        pfm.a aVar3 = new pfm.a(te0.w.D(this.f240759m.s(), new u(this, 6)), new o9h.d(11, new pjg.k(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new nw8.d(6, sVar), new ozc.z(13, z.f240809a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        efm.r rVarMergeWith = cVar.Q().mergeWith(this.f240762q.f273801b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        pfm.a aVar4 = new pfm.a(te0.w.D(rVarMergeWith, new u(this, 7)), new o9h.d(11, new pjg.k(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new nw8.d(6, sVar), new ozc.z(13, a0.f240755a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        efm.r rVarDoOnNext = o70.a.f(tVar.u3()).doOnNext(new r(7, new u(this, 8)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarDoOnNext.onErrorResumeNext(new o9h.d(11, new pjg.k(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new nw8.d(6, b0.f240756a), new nw8.d(6, sVar), new ozc.z(13, function0J4));
        te0.w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        efm.r rVarF4 = o70.a.f(((qri.b) this.f240760n).o());
        u uVar4 = new u(this, 9);
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext5 = rVarF4.onErrorResumeNext(new o9h.d(11, new pjg.k(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new nw8.d(6, uVar4), new nw8.d(6, sVar), new ozc.z(13, function0J5));
        te0.w.j0(bVar, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        efm.r rVarF5 = o70.a.f(((SotActivity) view).f85904w0.d.f121375b);
        u uVar5 = new u(this, 10);
        Function0 function0J6 = J();
        efm.r rVarOnErrorResumeNext6 = rVarF5.onErrorResumeNext(new o9h.d(11, new pjg.k(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new nw8.d(6, uVar5), new nw8.d(6, sVar), new ozc.z(13, function0J6));
        te0.w.j0(bVar, cVarSubscribe6);
        Intrinsics.h(cVarSubscribe6);
        v60.i sourceSubmissionState = tVar.i;
        Intrinsics.checkNotNullExpressionValue(sourceSubmissionState, "sourceSubmissionState");
        efm.r rVarF6 = o70.a.f(sourceSubmissionState);
        u uVar6 = new u(this, 4);
        Function0 function0J7 = J();
        efm.r rVarOnErrorResumeNext7 = rVarF6.onErrorResumeNext(new o9h.d(11, new pjg.k(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext7, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe7 = rVarOnErrorResumeNext7.subscribe(new nw8.d(6, uVar6), new nw8.d(6, sVar), new ozc.z(13, function0J7));
        te0.w.j0(bVar, cVarSubscribe7);
        Intrinsics.h(cVarSubscribe7);
        efm.b bVarSwitchMapCompletable = this.f240764s.N(10001).switchMapCompletable(new r(3, new u(this, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        o9h.d dVar = new o9h.d(11, new pjg.k(new BreadcrumbException(), 18));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar5 = new pfm.a(bVarSwitchMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new nw8.d(6, sVar), new ozc.z(13, x.f240807a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
    }
}
