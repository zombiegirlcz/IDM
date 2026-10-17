package pnf;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsReceiptDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.transactions.impl.ui.receipts.TransactionDetailsReceiptsActivity;
import com.revolut.feature.transactions.impl.ui.receipts.TransactionDetailsReceiptsContract$Configuration;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ozc.z;
import pjg.i;
import pjg.k;
import rnf.l;
import sri.m;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends bsi.a implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f237756j;
    public final npi.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f237757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f237758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TransactionDetailsReceiptsContract$Configuration f237759n;

    public h(xpi.g navBarWithToolbarView, npi.a alertDialogView, m navigator, l receiptsDelegate, TransactionDetailsReceiptsContract$Configuration configuration) {
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(alertDialogView, "alertDialogView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(receiptsDelegate, "receiptsDelegate");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f237756j = navBarWithToolbarView;
        this.k = alertDialogView;
        this.f237757l = navigator;
        this.f237758m = receiptsDelegate;
        this.f237759n = configuration;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_receipts, null, null, 14);
        xpi.c cVar = (xpi.c) this.f237756j;
        cVar.n0(textLocalisedClause);
        cVar.p0(new TextLocalisedClause(R$string.transactionUI_transaction_details_receipts, null, null, 14));
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        r rVarQ = cVar.Q();
        d dVar = new d(this, 4);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarQ.onErrorResumeNext(new m3l.d(16, new k(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        o9h.d dVar2 = new o9h.d(9, dVar);
        s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(dVar2, new o9h.d(9, sVar), new z(11, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        TransactionDetailsReceiptsActivity transactionDetailsReceiptsActivity = (TransactionDetailsReceiptsActivity) view;
        r rVarSwitchMapSingle = w.a0(((CellDetailsReceiptDelegate) transactionDetailsReceiptsActivity.u0.getValue()).d, new pmj.b(21)).switchMapSingle(new i(new d(this, 2), 16));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        d dVar3 = new d(this, 3);
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarSwitchMapSingle.onErrorResumeNext(new m3l.d(16, new k(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o9h.d(9, dVar3), new o9h.d(9, sVar), new z(11, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        r rVarA0 = w.a0(((CellDetailsReceiptDelegate) transactionDetailsReceiptsActivity.u0.getValue()).f51888c, new pmj.b(18));
        d dVar4 = new d(this, 0);
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext3 = rVarA0.onErrorResumeNext(new m3l.d(16, new k(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new o9h.d(9, dVar4), new o9h.d(9, sVar), new z(11, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        ihm.f fVar = ((npi.c) this.k).f218223l.f256060c;
        d dVar5 = new d(this, 1);
        Function0 function0J4 = J();
        r rVarOnErrorResumeNext4 = fVar.onErrorResumeNext(new m3l.d(16, new k(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new o9h.d(9, dVar5), new o9h.d(9, sVar), new z(11, function0J4));
        w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        r map = Q().map(new i(new pmj.b(19), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF = o70.a.f(map);
        pj3.b bVar2 = new pj3.b(view, this, 5);
        Function0 function0J5 = J();
        r rVarOnErrorResumeNext5 = rVarF.onErrorResumeNext(new m3l.d(16, new k(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new o9h.d(9, bVar2), new o9h.d(9, sVar), new z(11, function0J5));
        w.j0(bVar, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
    }

    public final r Q() {
        return zi0.c.J(rd0.e.c(this.f237758m.b(this.f237759n.f92085b), kotlin.coroutines.g.f186406a)).map(new i(new pmj.b(20), 15));
    }
}
