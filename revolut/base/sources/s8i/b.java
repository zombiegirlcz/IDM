package s8i;

import kotlin.jvm.internal.Intrinsics;
import n7i.i0;
import yof.d;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f261050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jx0.a f261051b;

    public b(d transferAmountMapper, i0 expenseStringsMapper, jx0.a moveMoneyTopupTransferExpensesHintMapperV2, a moveMoneyTopupTransferExpensesAmountMapper) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(expenseStringsMapper, "expenseStringsMapper");
        Intrinsics.checkNotNullParameter(moveMoneyTopupTransferExpensesHintMapperV2, "moveMoneyTopupTransferExpensesHintMapperV2");
        Intrinsics.checkNotNullParameter(moveMoneyTopupTransferExpensesAmountMapper, "moveMoneyTopupTransferExpensesAmountMapper");
        this.f261050a = transferAmountMapper;
        this.f261051b = moveMoneyTopupTransferExpensesHintMapperV2;
    }
}
