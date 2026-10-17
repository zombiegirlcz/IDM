package n2i;

import a08.f0;
import a08.s;
import c2i.l;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderActivityV2;
import efm.r;
import g1i.d0;
import g1i.l0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n09.j0;
import n0c.p;
import n1j.t;
import pfm.m;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a implements a {
    public final c2i.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f211554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0i.l f211555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c2i.i f211556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final opi.d f211557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f211558t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c2i.j presentationModel, l router, gte.a featureToggleInteractor, x0i.l takeProfitStopLossStorageInteractor, c2i.i mapper, opi.d expandableDialogView, rpi.c keyboardView, tri.c backButtonView) {
        super(mapper, presentationModel, router, expandableDialogView, backButtonView, keyboardView);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(takeProfitStopLossStorageInteractor, "takeProfitStopLossStorageInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        this.o = presentationModel;
        this.f211554p = router;
        this.f211555q = takeProfitStopLossStorageInteractor;
        this.f211556r = mapper;
        this.f211557s = expandableDialogView;
        this.f211558t = true;
    }

    @Override // com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a
    public final boolean N() {
        return true;
    }

    @Override // com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a
    public final boolean O() {
        return this.f211558t;
    }

    @Override // com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a
    public final efm.b P(wd6.h orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a
    public final pfm.a Q(wd6.h orderType) {
        efm.b bVarE;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        int i = d.f211548a[orderType.ordinal()];
        c2i.j jVar = this.o;
        if (i == 1) {
            bVarE = ((d0) jVar).l3(orderType);
        } else {
            d0 d0Var = (d0) jVar;
            bVarE = d0Var.N3(orderType).e(orderType == wd6.h.RECURRING ? d0Var.P3().e(d0Var.m3()) : ((l0) this.f211554p).s());
        }
        return ue0.e.v(bVarE);
    }

    @Override // com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a
    public final efm.b R() {
        return ((l0) this.f211554p).k();
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        c2i.m view = (b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        efm.b bVarFlatMapCompletable = ((d0) this.o).F3().distinctUntilChanged(new mzj.j(new t(11), 24)).flatMapCompletable(new mzj.j(new c(this, 1), 25));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K = K();
        f0 f0Var = new f0(26, new p(new BreadcrumbException(), 6));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, f0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new s(28, function1K), new j7a.j(16, i.f211553a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        MarketOrderActivityV2 marketOrderActivityV2 = (MarketOrderActivityV2) view;
        r rVarFilter = marketOrderActivityV2.S().filter(new mzj.j(new t(13), 27));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = w.D(rVarFilter, new j0(this, marketOrderActivityV2, 15));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new f0(26, new p(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new s(28, function1K2), new j7a.j(16, h.f211552a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        ?? r4 = marketOrderActivityV2.C0;
        r0 r0VarD2 = w.D(((CellDetailsSwitcherDelegate) r4.getValue()).f51912c, new c(this, 0));
        Function1 function1K3 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new f0(26, new p(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new s(28, function1K3), new j7a.j(16, e.f211549a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        r rVarFilter2 = ((CellDetailsSwitcherDelegate) r4.getValue()).d.filter(new mzj.j(new t(12), 26));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        r0 r0VarD3 = w.D(rVarFilter2, new c(this, 2));
        Function1 function1K4 = K();
        pfm.a aVar5 = new pfm.a(r0VarD3, new f0(26, new p(new BreadcrumbException(), 4)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new s(28, function1K4), new j7a.j(16, g.f211551a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        S(view, ((LargeActionButton) marketOrderActivityV2.f96941w0.getValue(marketOrderActivityV2, MarketOrderActivityV2.I0[1])).o);
    }
}
