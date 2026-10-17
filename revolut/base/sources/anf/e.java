package anf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends h implements thf.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(thf.d transactionIconResourcesMapper, thf.m transactionTextResourcesMapper, thf.b transactionAmountMapper, wa7.p hiddenAccountsTransactionInteractor, sj5.a cryptoDepositTransactionStateChecker) {
        super(transactionIconResourcesMapper, transactionTextResourcesMapper, transactionAmountMapper, hiddenAccountsTransactionInteractor, cryptoDepositTransactionStateChecker);
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionAmountMapper, "transactionAmountMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsTransactionInteractor, "hiddenAccountsTransactionInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositTransactionStateChecker, "cryptoDepositTransactionStateChecker");
    }
}
