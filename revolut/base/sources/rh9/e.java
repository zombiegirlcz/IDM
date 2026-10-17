package rh9;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.transfer.core.models.FundingSource;
import efm.r;
import go.g;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l1l.s;
import rgf.m;
import te0.w;
import vkm.j2;
import vkm.q;
import yhm.j;
import yji.n;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BillPaymentNavigation$InputData f254383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wsg.n f254384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u5k.c f254385n;
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sh9.a f254386p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f254387q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f254388r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f254389s;

    public e(BillPaymentNavigation$InputData flowInputData, wsg.n walletInteractor, u5k.c transferWalletLimitsInteractor, a transferErrorStateMapper, sh9.a paymentAmountValidator, s commonWalletLimitsValidator) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transferWalletLimitsInteractor, "transferWalletLimitsInteractor");
        Intrinsics.checkNotNullParameter(transferErrorStateMapper, "transferErrorStateMapper");
        Intrinsics.checkNotNullParameter(paymentAmountValidator, "paymentAmountValidator");
        Intrinsics.checkNotNullParameter(commonWalletLimitsValidator, "commonWalletLimitsValidator");
        this.f254383l = flowInputData;
        this.f254384m = walletInteractor;
        this.f254385n = transferWalletLimitsInteractor;
        this.o = transferErrorStateMapper;
        this.f254386p = paymentAmountValidator;
        this.f254387q = commonWalletLimitsValidator;
        this.f254388r = j.b(new r1a.a(this, 13));
        this.f254389s = q.c(new b(f0.f322471a));
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, rd0.e.b(m70.a.g(osg.b.k(this.f254384m, true, 2), null, null, 3)), null, new c(this, null), 3);
    }

    public final qna.n Z2(PaymentData paymentData, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        r rVarH = w.h(((b) this.f254389s.getValue()).f254381a);
        r rVarH2 = w.h(paymentData.getF72729b());
        r rVarX = this.f254384m.x(AccountId.Personal.f51414a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        r map = ((u5k.d) this.f254385n).b(rVarH, rVarH2, rVarX).map(new rea.j(new m(this, paymentData, 3), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        vkm.d dVarB = rd0.e.b(map);
        FundingSource fundingSource = paymentData.f78793a;
        sh9.c cVar = new sh9.c(fundingSource.getF92243g().f115082a, paymentData.f78794b, paymentData.f78795c, fundingSource.f92241b, apmQuote, (sh9.b) this.f254388r.getValue());
        this.f254386p.getClass();
        return new qna.n(new j23.b((Flow[]) d0.d1(v.k(dVarB, new g(sh9.a.a(cVar).f316033b, 2))).toArray(new Flow[0]), 18), this, 16);
    }
}
