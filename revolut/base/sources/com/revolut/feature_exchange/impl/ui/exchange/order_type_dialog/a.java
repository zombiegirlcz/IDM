package com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog;

import a08.f0;
import a08.g0;
import a08.q;
import c03.u;
import c2d.n;
import c2i.e;
import c2i.f;
import c2i.g;
import c2i.i;
import c2i.j;
import c2i.l;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import g1i.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import opi.d;
import pfm.m;
import pri.c;
import qfm.r0;
import te0.w;
import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f96927h;
    public final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f96928j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tri.c f96929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rpi.c f96930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AnalyticsContext f96931n;

    public a(i mapper, j presentationModel, l router, d expandableDialogView, tri.c backButtonView, rpi.c keyboardView) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        this.f96927h = mapper;
        this.i = presentationModel;
        this.f96928j = router;
        this.k = expandableDialogView;
        this.f96929l = backButtonView;
        this.f96930m = keyboardView;
    }

    public abstract boolean N();

    public abstract boolean O();

    public abstract efm.b P(h hVar);

    public abstract pfm.a Q(h hVar);

    public efm.b R() {
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    public final void S(c2i.m view, r menuItemClickObservable) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(menuItemClickObservable, "menuItemClickObservable");
        r0 r0VarD = w.D(view.x0(), new c2i.a(this, 4));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new g0(6, new c0d.j(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new f0(4, function1K), new q(16, g.f20801a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        pfm.h hVarB = w.b(this.f96929l.f273801b, new c2i.a(this, 5));
        Function1 function1K2 = K();
        pfm.a aVar2 = new pfm.a(hVarB, new g0(6, new c0d.j(new BreadcrumbException(), 1)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar2.w(new f0(4, function1K2), new q(16, e.f20799a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.b bVarFlatMapCompletable = ((opi.b) this.k).V().flatMapCompletable(new c2i.c(new c2i.d(this, view, 1), 1));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K3 = K();
        g0 g0Var = new g0(6, new c0d.j(new BreadcrumbException(), 2));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarFlatMapCompletable, g0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar3.w(new f0(4, function1K3), new q(16, f.f20800a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        r rVarFlatMapSingle = menuItemClickObservable.flatMapSingle(new c2i.c(new c2i.a(this, 0), 0));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        r0 r0VarD2 = w.D(o70.a.f(rVarFlatMapSingle), new c2i.d(this, view, 0));
        Function1 function1K4 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new g0(6, new c0d.j(new BreadcrumbException(), 4)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar4.w(new f0(4, function1K4), new q(16, c2i.h.f20802a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
    }

    public final pfm.a T(c2i.m view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d0 d0Var = (d0) this.i;
        r rVarF3 = d0Var.F3();
        r rVarX = d0Var.f139609s.a().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        r map = w.B0(rVarF3, rVarX).takeUntil(((opi.b) this.k).R().map(new c2i.c(new n(20), 2)).mergeWith(view.r0().map(new u(26, new n(19))))).map(new u(27, new c2i.a(this, 1)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.d0 d0VarFirstOrError = o70.a.f(map).firstOrError();
        u uVar = new u(28, new c2i.a(this, 2));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, uVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
