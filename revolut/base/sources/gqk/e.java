package gqk;

import a26.s;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionContext;
import efm.r;
import gp3.n;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import sr8.g;
import tof.i7;
import y45.h;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements qsi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f145770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nhf.a f145771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f145772c;
    public final fal.b d;
    public final mhf.b e;
    public final ar3.c f;

    public e(com.revolut.domain.interactors.transactions.a transactionsInteractor, vv9.c moneyRequestInteractor, nhf.a unitedWalletInteractor, sh3.a checkoutInteractor, h loanProductFeatureTogglesInteractor, fal.b suspiciousTransactionInteractor, rul.e juniorGraduationInteractor, g juniorTransferRequestActionsDelegate, mhf.b transactionsFilterInteractor, ar3.c multiCurrencyMoneyInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(suspiciousTransactionInteractor, "suspiciousTransactionInteractor");
        Intrinsics.checkNotNullParameter(juniorGraduationInteractor, "juniorGraduationInteractor");
        Intrinsics.checkNotNullParameter(juniorTransferRequestActionsDelegate, "juniorTransferRequestActionsDelegate");
        Intrinsics.checkNotNullParameter(transactionsFilterInteractor, "transactionsFilterInteractor");
        Intrinsics.checkNotNullParameter(multiCurrencyMoneyInteractor, "multiCurrencyMoneyInteractor");
        this.f145770a = transactionsInteractor;
        this.f145771b = unitedWalletInteractor;
        this.f145772c = loanProductFeatureTogglesInteractor;
        this.d = suspiciousTransactionInteractor;
        this.e = transactionsFilterInteractor;
        this.f = multiCurrencyMoneyInteractor;
    }

    public static r b(r rVar, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        r rVarPublish = rVar.publish(new f61.a(new s(new Data(f0.f322471a, null, false, 6, null), str)));
        Intrinsics.checkNotNullExpressionValue(rVarPublish, "publish(...)");
        return ue0.e.H(rVarPublish, h0.f322473a, new gqa.a(9));
    }

    public final r a(i7 i7Var, TransactionContext context, Set disablePredefinedFilters) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(disablePredefinedFilters, "disablePredefinedFilters");
        return m70.a.g(com.revolut.domain.interactors.transactions.a.d(this.f145770a, mhf.b.a(this.e, i7Var, null, ifk.b.L(disablePredefinedFilters), 2), null, 6, null, context, 10), null, new n(10), 1);
    }
}
