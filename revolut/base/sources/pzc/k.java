package pzc;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.feature.selfserve.sow.impl.ui.amount.SowAmountFragment;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import ozc.m;
import ozc.o;
import ozc.s0;
import ozc.t;
import ozc.z;
import pyc.p;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f240949j;
    public final ozc.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ozc.f f240950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w80.b f240951m;

    public k(ozc.d presentationModel, ozc.a mapper, ozc.f router, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f240949j = presentationModel;
        this.k = mapper;
        this.f240950l = router;
        this.f240951m = amountFormatter;
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        t tVar = (t) this.f240949j;
        r map = ((rzc.c) tVar.e).f258590c.map(new ryd.j(new ryd.k(11), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.b bVarSwitchMapCompletable = map.switchMapCompletable(new pz4.a(10, new e(this, 6)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        n1i.b bVar = new n1i.b(8, new g(new BreadcrumbException(), 3));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, bVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        z zVar = new z(14, j.f240948a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new o0(8, sVar), zVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, hVarW);
        s0 s0Var = (s0) tVar.f231329b;
        te0.e eVarX0 = s0Var.x0();
        te0.s sVar2 = te0.s.f270018a;
        r map2 = w.l(eVarX0.c(sVar2), s0Var.M0().c(sVar2)).map(new o(7, new m(tVar, 9)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r map3 = w.l(map2, tVar.x3()).map(new pz4.a(12, new e(this, 0)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        r rVarF = o70.a.f(map3);
        e eVar = new e(this, 2);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new n1i.b(8, new g(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(8, eVar), new o0(8, sVar), new z(14, function0J));
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.b bVarSwitchMapCompletable2 = tVar.w3().switchMapCompletable(new pz4.a(13, new e(this, 3)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        n1i.b bVar3 = new n1i.b(8, new g(new BreadcrumbException(), 1));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable2, bVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(8, sVar), new z(14, h.f240946a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
        SowAmountFragment sowAmountFragment = (SowAmountFragment) view;
        r map4 = ((AmountEditDelegate) sowAmountFragment.g0.getValue()).d.f121375b.map(new pz4.a(8, new p(14)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        efm.b bVarSwitchMapCompletable3 = w.l(map4, tVar.x3()).switchMapCompletable(new pz4.a(14, new e(this, 4)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable3, "switchMapCompletable(...)");
        n1i.b bVar4 = new n1i.b(8, new g(new BreadcrumbException(), 0));
        bVarSwitchMapCompletable3.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable3, bVar4, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new o0(8, sVar), new z(14, f.f240943a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar2, hVarW3);
        r map5 = ((AmountEditDelegate) sowAmountFragment.g0.getValue()).e.f121375b.map(new pz4.a(9, new p(15)));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        efm.b bVarSwitchMapCompletable4 = map5.switchMapCompletable(new pz4.a(15, new e(this, 5)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable4, "switchMapCompletable(...)");
        n1i.b bVar5 = new n1i.b(8, new g(new BreadcrumbException(), 2));
        bVarSwitchMapCompletable4.getClass();
        pfm.a aVar5 = new pfm.a(bVarSwitchMapCompletable4, bVar5, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new o0(8, sVar), new z(14, i.f240947a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar2, hVarW4);
    }
}
