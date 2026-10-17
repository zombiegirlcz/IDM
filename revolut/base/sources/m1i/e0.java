package m1i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.exchange.models.ExchangeResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends pri.c {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f201522h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tpi.j f201523j;
    public final f9b.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k3l.b f201524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h0 f201525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final npi.a f201526n;
    public final xvh.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AccountId f201527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lrh.a f201528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f201529r;

    public e0(k presentationModel, m router, tpi.j progressView, f9b.f errorView, k3l.b statusView, h0 statusViewConfigMapper, npi.a dialogView, xvh.c autoInvestInteractor, AccountId accountId, lrh.a wealthProtectionErrorParser, u marketOrderExchangeResultHandlerV2) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        Intrinsics.checkNotNullParameter(statusViewConfigMapper, "statusViewConfigMapper");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(wealthProtectionErrorParser, "wealthProtectionErrorParser");
        Intrinsics.checkNotNullParameter(marketOrderExchangeResultHandlerV2, "marketOrderExchangeResultHandlerV2");
        this.f201522h = presentationModel;
        this.i = router;
        this.f201523j = progressView;
        this.k = errorView;
        this.f201524l = statusView;
        this.f201525m = statusViewConfigMapper;
        this.f201526n = dialogView;
        this.o = autoInvestInteractor;
        this.f201527p = accountId;
        this.f201528q = wealthProtectionErrorParser;
        this.f201529r = marketOrderExchangeResultHandlerV2;
    }

    public final ufm.b N(ExchangeResult.Success result) {
        ((g1i.d0) this.f201522h).getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        ufm.b bVarM = efm.d0.m(cp5.d.z(result.f72154b.f115083b) ? result.f72154b.f115083b : result.f72153a.f115083b);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final pfm.a O(pfm.a aVar) {
        pfm.a aVarE = aVar.e(((g1i.d0) this.f201522h).o3());
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        efm.b bVarU = mo3.a.u(o70.a.g(aVarE), this.f201523j, false);
        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress(...)");
        return ue0.e.v(hx7.a.L(bVarU, this.k, false, null, 24));
    }

    @Override // pri.b, pri.e
    public final void h(rri.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        efm.b bVarSwitchMapCompletable = o70.a.f(pd.b.r(((a) ((g1i.d0) this.f201522h).v).e.f, new w(this, 4))).flatMap(new m0g.d(21, new w(this, 5))).switchMapCompletable(new m0g.d(22, new w(this, 6)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        Function1 function1K = K();
        ly7.g gVar = new ly7.g(1, new m08.i(new BreadcrumbException(), 4));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new a0d.g(26, function1K), new j7a.j(6, c0.f201516a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        efm.b bVarFlatMapCompletable = ((npi.c) this.f201526n).f218223l.f256060c.filter(new m0g.d(19, new m18.n(9))).flatMapCompletable(new m0g.d(20, new w(this, 3)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K2 = K();
        ly7.g gVar2 = new ly7.g(1, new m08.i(new BreadcrumbException(), 3));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, gVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar2.w(new a0d.g(26, function1K2), new j7a.j(6, b0.f201513a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        qfm.r0 r0VarD = te0.w.D(((k3l.d) this.f201524l).f180813j, new w(this, 0));
        Function1 function1K3 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new ly7.g(1, new m08.i(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar3.w(new a0d.g(26, function1K3), new j7a.j(6, d0.f201520a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
    }
}
