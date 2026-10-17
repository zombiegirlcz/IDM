package fu8;

import a08.p0;
import a41.o0;
import cie.l1;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.kyc.impl.choosedocument.ChooseDocumentContract$Configuration;
import cu8.g1;
import cu8.i1;
import cu8.j1;
import cu8.n1;
import e7l.g;
import efm.d0;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ChooseDocumentContract$Configuration f138138h;
    public final g1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f9b.f f138139j;
    public final Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xpi.g f138140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tpi.j f138141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iqi.h f138142n;
    public final i1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j1 f138143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qd0.b f138144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0 f138145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e0m.b f138146s;

    public v(ChooseDocumentContract$Configuration config, g1 presentationModel, f9b.f errorView, ImmutableMap behaviors, xpi.g navBarWithToolbarView, tpi.j progressView, iqi.h twinVerticalButtonView, i1 router, j1 state, qd0.b languageProvider, o0 gradientEnabledProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(behaviors, "behaviors");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(gradientEnabledProvider, "gradientEnabledProvider");
        this.f138138h = config;
        this.i = presentationModel;
        this.f138139j = errorView;
        this.k = behaviors;
        this.f138140l = navBarWithToolbarView;
        this.f138141m = progressView;
        this.f138142n = twinVerticalButtonView;
        this.o = router;
        this.f138143p = state;
        this.f138144q = languageProvider;
        this.f138145r = gradientEnabledProvider;
        this.f138146s = new e0m.b(new fp3.a(this, 8));
    }

    public final efm.r N() {
        com.revolut.feature.kyc.impl.b bVar = (com.revolut.feature.kyc.impl.b) this.i;
        efm.r map = bVar.t3().map(new csl.b(18, new cu8.i(bVar, 4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map.map(new fs5.d(12, new g(this, 6)));
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        String languageTag = ((s80.b) this.f138144q).b().toLanguageTag();
        n1 n1Var = (n1) this.f138143p;
        if (w.O(n1Var.F0()) == null) {
            te0.e eVarF0 = n1Var.F0();
            Intrinsics.h(languageTag);
            eVarF0.set(languageTag);
        }
        boolean zEquals = n1Var.F0().get().equals(languageTag);
        g1 g1Var = this.i;
        ifm.b bVar = this.f239031a;
        if (!zEquals) {
            te0.e eVarF02 = n1Var.F0();
            Intrinsics.h(languageTag);
            eVarF02.set(languageTag);
            efm.r rVarS = mo3.a.s(o70.a.f(((com.revolut.feature.kyc.impl.b) g1Var).u3(true)), this.f138141m);
            Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
            Function1 function1K = K();
            Function0 function0J = J();
            efm.r rVarOnErrorResumeNext = rVarS.onErrorResumeNext(new p0(13, new fa9.c(new BreadcrumbException(), 22)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.o0(16, o.f138131a), new a08.o0(16, function1K), new ea9.c(10, function0J));
            w.j0(bVar, cVarSubscribe);
            Intrinsics.h(cVarSubscribe);
        }
        com.revolut.feature.kyc.impl.b bVar2 = (com.revolut.feature.kyc.impl.b) g1Var;
        d0 d0VarFirstOrError = m70.a.h((efm.r) bVar2.f77572l.getValue(), new l1(9), null, null, 6).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        pfm.a aVar2 = new pfm.a(o70.a.i(d0VarFirstOrError), new fs5.d(8, new g(this, 5)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(aVar2, new p0(13, new fa9.c(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new a08.o0(16, function1K2), new ea9.c(10, p.f138132a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        this.f138146s.init();
        efm.r rVarSwitchMap = N().switchMap(new fs5.d(9, new g(this, 2)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        Function1 function1K3 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarSwitchMap.onErrorResumeNext(new p0(13, new fa9.c(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a08.o0(16, q.f138133a), new a08.o0(16, function1K3), new ea9.c(10, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r rVarN = N();
        Intrinsics.checkNotNullExpressionValue(rVarN, "observeBehavior(...)");
        efm.r rVarF = o70.a.f(rVarN);
        g gVar = new g(this, 3);
        Function1 function1K4 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF.onErrorResumeNext(new p0(13, new fa9.c(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new a08.o0(16, gVar), new a08.o0(16, function1K4), new ea9.c(10, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.r rVarSwitchMap2 = N().switchMap(new fs5.d(10, new g(this, 4)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        efm.r rVarN2 = hx7.a.N(o70.a.f(rVarSwitchMap2), this.f138139j, false, false);
        h hVar = new h(view, 0);
        Function1 function1K5 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarN2.onErrorResumeNext(new p0(13, new fa9.c(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new a08.o0(16, hVar), new a08.o0(16, function1K5), new ea9.c(10, function0J4));
        w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        efm.b bVarSwitchMapCompletable = N().switchMapCompletable(new fs5.d(11, new h(view, 1)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        Function1 function1K6 = K();
        p0 p0Var = new p0(13, new fa9.c(new BreadcrumbException(), 25));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable, p0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar4.w(new a08.o0(16, function1K6), new ea9.c(10, r.f138134a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.b bVarSwitchMapCompletable2 = N().switchMapCompletable(new fs5.d(17, new h(view, 2)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        Function1 function1K7 = K();
        p0 p0Var2 = new p0(13, new fa9.c(new BreadcrumbException(), 16));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar5 = new pfm.a(bVarSwitchMapCompletable2, p0Var2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar5.w(new a08.o0(16, function1K7), new ea9.c(10, s.f138135a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        efm.b bVarSwitchMapCompletable3 = N().switchMapCompletable(new fs5.d(18, new h(view, 3)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable3, "switchMapCompletable(...)");
        Function1 function1K8 = K();
        p0 p0Var3 = new p0(13, new fa9.c(new BreadcrumbException(), 17));
        bVarSwitchMapCompletable3.getClass();
        pfm.a aVar6 = new pfm.a(bVarSwitchMapCompletable3, p0Var3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar6.w(new a08.o0(16, function1K8), new ea9.c(10, j.f138126a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        efm.b bVarSwitchMapCompletable4 = N().switchMapCompletable(new fs5.d(19, new g(this, 10)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable4, "switchMapCompletable(...)");
        Function1 function1K9 = K();
        p0 p0Var4 = new p0(13, new fa9.c(new BreadcrumbException(), 18));
        bVarSwitchMapCompletable4.getClass();
        pfm.a aVar7 = new pfm.a(bVarSwitchMapCompletable4, p0Var4, 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar7.w(new a08.o0(16, function1K9), new ea9.c(10, k.f138127a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar, hVarW5);
        efm.b bVarSwitchMapCompletable5 = N().switchMapCompletable(new fs5.d(20, new h(view, 4)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable5, "switchMapCompletable(...)");
        Function1 function1K10 = K();
        p0 p0Var5 = new p0(13, new fa9.c(new BreadcrumbException(), 19));
        bVarSwitchMapCompletable5.getClass();
        pfm.a aVar8 = new pfm.a(bVarSwitchMapCompletable5, p0Var5, 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar8.w(new a08.o0(16, function1K10), new ea9.c(10, l.f138128a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar, hVarW6);
        efm.b bVarFlatMapCompletable = o70.a.f(w.m(w.h(this.f138138h.f77586b), m70.a.g(((ik3.c) bVar2.i).k(g.a.f123406a), null, null, 3), bVar2.s3())).flatMapCompletable(new fs5.d(7, new g(this, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K11 = K();
        p0 p0Var6 = new p0(13, new fa9.c(new BreadcrumbException(), 20));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar9 = new pfm.a(bVarFlatMapCompletable, p0Var6, 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar9.w(new a08.o0(16, function1K11), new ea9.c(10, m.f138129a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        w.j0(bVar, hVarW7);
        r0 r0VarD = w.D(((iqi.b) this.f138142n).Q(), new g(this, 1));
        Function1 function1K12 = K();
        pfm.a aVar10 = new pfm.a(r0VarD, new p0(13, new fa9.c(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        ofm.h hVarW8 = aVar10.w(new a08.o0(16, function1K12), new ea9.c(10, n.f138130a));
        Intrinsics.checkNotNullExpressionValue(hVarW8, "subscribe(...)");
        w.j0(bVar, hVarW8);
    }
}
