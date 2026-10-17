package ozc;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.selfserve.sow.impl.ui.SowActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends bsi.a implements e {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f231270j;
    public final f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sri.m f231271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f231272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xpi.g f231273n;
    public final ypi.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tpi.j f231274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bqi.d f231275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k3l.b f231276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tri.c f231277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kpi.c f231278t;
    public final opi.d u;

    public g0(d presentationModel, f router, sri.m navigator, a mapper, xpi.g navBarWithToolbarView, ypi.i nextButtonView, tpi.j progressView, bqi.d progressDialogView, k3l.b statusView, tri.c backButtonView, kpi.c activityResultDelegate, opi.d expandableDialogView) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(progressDialogView, "progressDialogView");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        this.f231270j = presentationModel;
        this.k = router;
        this.f231271l = navigator;
        this.f231272m = mapper;
        this.f231273n = navBarWithToolbarView;
        this.o = nextButtonView;
        this.f231274p = progressView;
        this.f231275q = progressDialogView;
        this.f231276r = statusView;
        this.f231277s = backButtonView;
        this.f231278t = activityResultDelegate;
        this.u = expandableDialogView;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        i view = (i) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        efm.r rVarConcatMapSingle = o70.a.f(((qri.b) this.k).o()).concatMapSingle(new p(4, new u(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarConcatMapSingle, "clearStateIfFinishCommand(...)");
        u uVar = new u(this, 13);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarConcatMapSingle.onErrorResumeNext(new nii.o0(5, new oma.n(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        lhi.b bVar = new lhi.b(17, uVar);
        akl.s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(bVar, new lhi.b(17, sVar), new z(0, function0J));
        ifm.b bVar2 = this.f239031a;
        te0.w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        t tVar = (t) this.f231270j;
        efm.r rVarD0 = te0.w.d0(((s0) tVar.f231329b).A0());
        g gVar = tVar.f231329b;
        s0 s0Var = (s0) gVar;
        te0.e eVarD0 = s0Var.D0();
        te0.s sVar2 = te0.s.f270018a;
        int i = 22;
        efm.r map = eVarD0.c(sVar2).map(new oy9.b(new ox5.t0(26), i));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = s0Var.G0().c(sVar2).map(new oy9.b(new ox5.t0(27), 25));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r map3 = te0.w.n(rVarD0, map, map2, tVar.z3()).map(new p(9, new u(this, 9)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        efm.r rVarF = o70.a.f(map3);
        int i2 = 10;
        u uVar2 = new u(this, i2);
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF.onErrorResumeNext(new nii.o0(5, new oma.n(new BreadcrumbException(), i)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new lhi.b(17, uVar2), new lhi.b(17, sVar), new z(0, function0J2));
        te0.w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r rVarMergeArray = efm.r.mergeArray(tVar.i.f);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        efm.r rVarS = mo3.a.s(o70.a.f(rVarMergeArray), this.f231274p);
        Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarS.onErrorResumeNext(new nii.o0(5, new oma.n(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new lhi.b(17, f0.f231269a), new lhi.b(17, sVar), new z(0, function0J3));
        te0.w.j0(bVar2, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.r rVarHide = tVar.k.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarF2 = o70.a.f(rVarHide);
        u uVar3 = new u(this, 16);
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarF2.onErrorResumeNext(new nii.o0(5, new oma.n(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new lhi.b(17, uVar3), new lhi.b(17, sVar), new z(0, function0J4));
        te0.w.j0(bVar2, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        efm.r rVarHide2 = tVar.f231336n.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        efm.r rVarF3 = o70.a.f(nim.a.z(nim.a.w(rVarHide2, new u(this, 5)), new u(this, 6)));
        u uVar4 = new u(this, 7);
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext5 = rVarF3.onErrorResumeNext(new nii.o0(5, new oma.n(new BreadcrumbException(), i2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new lhi.b(17, uVar4), new lhi.b(17, sVar), new z(0, function0J5));
        te0.w.j0(bVar2, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        efm.r rVarSwitchMap = te0.w.l(te0.w.d0(((s0) gVar).A0()), ((s0) gVar).P0().c(sVar2)).switchMap(new p(14, new u(this, 17)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarF4 = o70.a.f(rVarSwitchMap);
        int i3 = 18;
        u uVar5 = new u(this, i3);
        Function0 function0J6 = J();
        efm.r rVarOnErrorResumeNext6 = rVarF4.onErrorResumeNext(new nii.o0(5, new oma.n(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new lhi.b(17, uVar5), new lhi.b(17, sVar), new z(0, function0J6));
        te0.w.j0(bVar2, cVarSubscribe6);
        Intrinsics.h(cVarSubscribe6);
        xpi.c cVar = (xpi.c) this.f231273n;
        efm.r rVarMergeWith = cVar.Q().mergeWith(this.f231277s.f273801b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        pfm.a aVar2 = new pfm.a(te0.w.D(rVarMergeWith, new u(this, 2)), new nii.o0(5, new oma.n(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new lhi.b(17, sVar), new z(0, c0.f231266a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar2, hVarW);
        efm.b bVarSwitchMapCompletable = this.o.s().switchMapCompletable(new p(12, new u(this, 15)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        nii.o0 o0Var = new nii.o0(5, new oma.n(new BreadcrumbException(), i3));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable, o0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new lhi.b(17, sVar), new z(0, d0.f231267a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar2, hVarW2);
        kpi.c cVar2 = this.f231278t;
        efm.b bVarSwitchMapCompletable2 = cVar2.N(10001).switchMapCompletable(new p(5, new u(this, 3)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        nii.o0 o0Var2 = new nii.o0(5, new oma.n(new BreadcrumbException(), 9));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable2, o0Var2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new lhi.b(17, sVar), new z(0, x.f231341a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar2, hVarW3);
        efm.r rVarDoOnNext = o70.a.f(te0.w.d0(((s0) gVar).A0())).doOnNext(new p(10, new u(this, 12)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        Function0 function0J7 = J();
        efm.r rVarOnErrorResumeNext7 = rVarDoOnNext.onErrorResumeNext(new nii.o0(5, new oma.n(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext7, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe7 = rVarOnErrorResumeNext7.subscribe(new lhi.b(17, b0.f231262a), new lhi.b(17, sVar), new z(0, function0J7));
        te0.w.j0(bVar2, cVarSubscribe7);
        Intrinsics.h(cVarSubscribe7);
        pfm.a aVar5 = new pfm.a(te0.w.D(cVar.b(), new u(this, 11)), new nii.o0(5, new oma.n(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new lhi.b(17, sVar), new z(0, a0.f231258a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar2, hVarW4);
        efm.r rVarF5 = o70.a.f(((SowActivity) view).f85957w0.d.f121375b);
        u uVar6 = new u(this, 8);
        Function0 function0J8 = J();
        efm.r rVarOnErrorResumeNext8 = rVarF5.onErrorResumeNext(new nii.o0(5, new oma.n(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext8, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe8 = rVarOnErrorResumeNext8.subscribe(new lhi.b(17, uVar6), new lhi.b(17, sVar), new z(0, function0J8));
        te0.w.j0(bVar2, cVarSubscribe8);
        Intrinsics.h(cVarSubscribe8);
        efm.b bVarSwitchMapCompletable3 = cVar2.N(10006).switchMapCompletable(new p(11, new u(this, 14)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable3, "switchMapCompletable(...)");
        nii.o0 o0Var3 = new nii.o0(5, new oma.n(new BreadcrumbException(), 20));
        bVarSwitchMapCompletable3.getClass();
        pfm.a aVar6 = new pfm.a(bVarSwitchMapCompletable3, o0Var3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new lhi.b(17, sVar), new z(0, e0.f231268a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar2, hVarW5);
        efm.b bVarSwitchMapCompletable4 = ((k3l.d) this.f231276r).f180813j.filter(new p(7, new n(12))).switchMapCompletable(new p(8, new u(this, 4)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable4, "switchMapCompletable(...)");
        nii.o0 o0Var4 = new nii.o0(5, new oma.n(new BreadcrumbException(), 12));
        bVarSwitchMapCompletable4.getClass();
        pfm.a aVar7 = new pfm.a(bVarSwitchMapCompletable4, o0Var4, 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new lhi.b(17, sVar), new z(0, y.f231342a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar2, hVarW6);
    }
}
