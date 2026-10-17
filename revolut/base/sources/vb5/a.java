package vb5;

import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mb5.j;
import mb5.t;
import tb5.d;
import wb5.e;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final t a(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String sourceCurrency = eVar.getSourceCurrency();
        String sourceId = eVar.getSourceId();
        String sourceState = eVar.getSourceState();
        return new t(sourceCurrency, sourceId, sourceState != null ? (j) u1.u(sourceState, d.f269465a) : null);
    }

    public static final tb5.a b(CreditScheduledAmountType creditScheduledAmountType) {
        Intrinsics.checkNotNullParameter(creditScheduledAmountType, "<this>");
        if (creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed) {
            return tb5.a.FIXED;
        }
        if (creditScheduledAmountType instanceof CreditScheduledAmountType.Minimum) {
            return tb5.a.MIN_REPAYMENT;
        }
        if (creditScheduledAmountType instanceof CreditScheduledAmountType.Statement) {
            return tb5.a.STATEMENT_BALANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
