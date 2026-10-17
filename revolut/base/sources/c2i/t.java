package c2i;

import a08.o0;
import a08.p0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import g1i.d0;
import g1i.l0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a implements k {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f20812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final opi.d f20813q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xpi.g f20814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f20815s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(i mapper, j presentationModel, opi.d expandableDialogView, xpi.g navBarView, l router, tri.c backButtonView, rpi.c keyboardView) {
        super(mapper, presentationModel, router, expandableDialogView, backButtonView, keyboardView);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        this.o = mapper;
        this.f20812p = presentationModel;
        this.f20813q = expandableDialogView;
        this.f20814r = navBarView;
        this.f20815s = router;
    }

    @Override // com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a
    public final boolean N() {
        return false;
    }

    @Override // com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a
    public final boolean O() {
        return false;
    }

    @Override // com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a
    public final efm.b P(wd6.h orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        pfm.h hVar = new pfm.h(new p(false, this, orderType, true), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a
    public final pfm.a Q(wd6.h orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        int i = q.f20809a[orderType.ordinal()];
        j jVar = this.f20812p;
        return ue0.e.v(i == 1 ? ((d0) jVar).l3(orderType) : ((d0) jVar).N3(orderType).e(((l0) this.f20815s).q()));
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        m view = (m) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        efm.r map = ((opi.b) this.f20813q).N().g().map(new c(new c2d.n(23), 6));
        d0 d0Var = (d0) this.f20812p;
        efm.r rVarWithLatestFrom = map.withLatestFrom(d0Var.F3(), new c(new c2f.m(1), 7));
        Intrinsics.checkNotNullExpressionValue(rVarWithLatestFrom, "withLatestFrom(...)");
        final int i = 1;
        r0 r0VarD = w.D(o70.a.f(rVarWithLatestFrom), new Function1(this) { // from class: c2i.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f20805b;

            {
                this.f20805b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) obj2;
                switch (i) {
                    case 0:
                        wd6.h hVar = exchangeOrderDraft.e;
                        t tVar = this.f20805b;
                        pfm.h hVar2 = new pfm.h(new p(((d0) tVar.f20812p).n3(), tVar, hVar, false), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                        return hVar2;
                    default:
                        wd6.h hVar3 = exchangeOrderDraft.e;
                        t tVar2 = this.f20805b;
                        pfm.h hVar4 = new pfm.h(new p(((d0) tVar2.f20812p).n3(), tVar2, hVar3, false), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                        return hVar4;
                }
            }
        });
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new p0(5, new c0d.j(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o0(6, function1K), new a08.q(17, r.f20810a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        efm.r rVarDistinctUntilChanged = d0Var.F3().distinctUntilChanged((kfm.d) new c(new c2f.m(2), 3));
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        final int i2 = 0;
        r0 r0VarD2 = w.D(o70.a.f(rVarDistinctUntilChanged), new Function1(this) { // from class: c2i.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f20805b;

            {
                this.f20805b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) obj2;
                switch (i2) {
                    case 0:
                        wd6.h hVar = exchangeOrderDraft.e;
                        t tVar = this.f20805b;
                        pfm.h hVar2 = new pfm.h(new p(((d0) tVar.f20812p).n3(), tVar, hVar, false), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                        return hVar2;
                    default:
                        wd6.h hVar3 = exchangeOrderDraft.e;
                        t tVar2 = this.f20805b;
                        pfm.h hVar4 = new pfm.h(new p(((d0) tVar2.f20812p).n3(), tVar2, hVar3, false), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                        return hVar4;
                }
            }
        });
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new p0(5, new c0d.j(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(6, function1K2), new a08.q(17, s.f20811a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.r map2 = ((xpi.c) this.f20814r).b().filter(new c(new c2d.n(21), 4)).map(new c(new c2d.n(22), 5));
        Intrinsics.checkNotNullExpressionValue(map2, "getMenuItemClick(...)");
        S(view, map2);
    }
}
