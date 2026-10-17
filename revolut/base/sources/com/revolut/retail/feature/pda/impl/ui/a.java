package com.revolut.retail.feature.pda.impl.ui;

import a08.p0;
import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit_resources.R$drawable;
import efm.r;
import f9b.f;
import k3l.d;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l9j.k;
import lak.b;
import lak.c;
import lak.e;
import lak.h;
import lak.l;
import lak.m;
import lak.n;
import te0.w;
import tpi.j;
import xpi.g;
import ypi.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends bsi.a implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f102383j;
    public final i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f102384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f102385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f102386n;
    public final iak.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k3l.b f102387p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kpi.c f102388q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f102389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f102390s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f102391t;
    public final Lazy u;

    public a(g navBarWithToolbarView, i nextButtonView, j progressView, f errorView, c router, iak.b presentationModel, k3l.b statusDialogView, kpi.c activityResult) {
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(activityResult, "activityResult");
        this.f102383j = navBarWithToolbarView;
        this.k = nextButtonView;
        this.f102384l = progressView;
        this.f102385m = errorView;
        this.f102386n = router;
        this.o = presentationModel;
        this.f102387p = statusDialogView;
        this.f102388q = activityResult;
        final int i = 0;
        this.f102389r = yhm.j.b(new Function0(this) { // from class: lak.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.pda.impl.ui.a f193414b;

            {
                this.f193414b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.f193414b.o.a().map(new l5i.b(28, new l9j.k(16)));
                    case 1:
                        return this.f193414b.o.a().map(new i(new l9j.k(21), 7));
                    case 2:
                        return this.f193414b.o.a().map(new i(new l9j.k(19), 4));
                    default:
                        return this.f193414b.o.a().map(new i(new l9j.k(20), 5));
                }
            }
        });
        final int i2 = 1;
        this.f102390s = yhm.j.b(new Function0(this) { // from class: lak.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.pda.impl.ui.a f193414b;

            {
                this.f193414b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.f193414b.o.a().map(new l5i.b(28, new l9j.k(16)));
                    case 1:
                        return this.f193414b.o.a().map(new i(new l9j.k(21), 7));
                    case 2:
                        return this.f193414b.o.a().map(new i(new l9j.k(19), 4));
                    default:
                        return this.f193414b.o.a().map(new i(new l9j.k(20), 5));
                }
            }
        });
        final int i3 = 2;
        this.f102391t = yhm.j.b(new Function0(this) { // from class: lak.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.pda.impl.ui.a f193414b;

            {
                this.f193414b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return this.f193414b.o.a().map(new l5i.b(28, new l9j.k(16)));
                    case 1:
                        return this.f193414b.o.a().map(new i(new l9j.k(21), 7));
                    case 2:
                        return this.f193414b.o.a().map(new i(new l9j.k(19), 4));
                    default:
                        return this.f193414b.o.a().map(new i(new l9j.k(20), 5));
                }
            }
        });
        final int i5 = 3;
        this.u = yhm.j.b(new Function0(this) { // from class: lak.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.pda.impl.ui.a f193414b;

            {
                this.f193414b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return this.f193414b.o.a().map(new l5i.b(28, new l9j.k(16)));
                    case 1:
                        return this.f193414b.o.a().map(new i(new l9j.k(21), 7));
                    case 2:
                        return this.f193414b.o.a().map(new i(new l9j.k(19), 4));
                    default:
                        return this.f193414b.o.a().map(new i(new l9j.k(20), 5));
                }
            }
        });
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        xpi.c cVar = (xpi.c) this.f102383j;
        cVar.e0(numValueOf);
        r rVarMergeWith = cVar.Q().mergeWith(((SetUpPdaActivity) view).u0);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        pfm.a aVar2 = new pfm.a(w.D(rVarMergeWith, new h(this, 0)), new a0d.g(22, new j2i.c(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        j7a.j jVar = new j7a.j(3, lak.j.f193419a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new p0(21, sVar), jVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        r rVar = (r) this.f102389r.getValue();
        Intrinsics.checkNotNullExpressionValue(rVar, "<get-observeToolbarTitle>(...)");
        r rVarF = o70.a.f(rVar);
        h hVar = new h(this, 4);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a0d.g(22, new j2i.c(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new p0(21, hVar), new p0(21, sVar), new j7a.j(3, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        r rVar2 = (r) this.f102390s.getValue();
        Intrinsics.checkNotNullExpressionValue(rVar2, "<get-observeShowNextButton>(...)");
        r rVarF2 = o70.a.f(rVar2);
        h hVar2 = new h(this, 5);
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new a0d.g(22, new j2i.c(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new p0(21, hVar2), new p0(21, sVar), new j7a.j(3, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        Object value = this.f102391t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        r rVarF3 = o70.a.f((r) value);
        h hVar3 = new h(this, 6);
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext3 = rVarF3.onErrorResumeNext(new a0d.g(22, new j2i.c(new BreadcrumbException(), 26)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new p0(21, hVar3), new p0(21, sVar), new j7a.j(3, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        Object value2 = this.u.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        r rVarF4 = o70.a.f((r) value2);
        h hVar4 = new h(this, 7);
        Function0 function0J4 = J();
        r rVarOnErrorResumeNext4 = rVarF4.onErrorResumeNext(new a0d.g(22, new j2i.c(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new p0(21, hVar4), new p0(21, sVar), new j7a.j(3, function0J4));
        w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        r rVarFilter = ((d) this.f102387p).f180813j.filter(new lak.i(new k(18), 2));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        pfm.a aVar3 = new pfm.a(w.D(rVarFilter, new h(this, 8)), new a0d.g(22, new l(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new p0(21, sVar), new j7a.j(3, lak.k.f193420a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.b bVarFlatMapCompletable = this.k.s().switchMapMaybe(new lak.i(new h(this, 9), 3)).flatMapCompletable(new l5i.b(27, new h(this, 1)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        a0d.g gVar = new a0d.g(22, new l(new BreadcrumbException(), 1));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar4 = new pfm.a(bVarFlatMapCompletable, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new p0(21, sVar), new j7a.j(3, m.f193423a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        r rVarF5 = o70.a.f(this.o.d.f);
        Intrinsics.checkNotNullParameter(rVarF5, "<this>");
        j progressView = this.f102384l;
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        tpi.i iVar = (tpi.i) progressView;
        iVar.getClass();
        r rVarCompose = rVarF5.compose(new tpi.b(iVar, 0));
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "withDataImmediateProgress(...)");
        r rVarG = m70.a.g(hx7.a.N(rVarCompose, this.f102385m, false, false), null, new l9j.j(5), 1);
        h hVar5 = new h(this, 2);
        Function0 function0J5 = J();
        r rVarOnErrorResumeNext5 = rVarG.onErrorResumeNext(new a0d.g(22, new j2i.c(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new p0(21, hVar5), new p0(21, sVar), new j7a.j(3, function0J5));
        w.j0(bVar, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        r rVarFlatMap = i26.l.g(this.f102388q.N(112)).map(new l5i.b(29, new k(17))).flatMap(new lak.i(new l3l.m(1, this.o, iak.b.class, "observeBeneficiaryById", "observeBeneficiaryById(Ljava/lang/String;)Lio/reactivex/Observable;", 0, 14), 0));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        efm.b bVarFlatMapCompletable2 = m70.a.g(rVarFlatMap, null, new l9j.j(6), 1).flatMapCompletable(new lak.i(new h(this, 3), 1));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        a0d.g gVar2 = new a0d.g(22, new l(new BreadcrumbException(), 2));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar5 = new pfm.a(bVarFlatMapCompletable2, gVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new p0(21, sVar), new j7a.j(3, n.f193424a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
    }
}
