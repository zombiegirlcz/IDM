package qm4;

import com.revolut.feature.credit.card.api.models.autopay.CreditCardAutopayRequest;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import kotlin.NoWhenBranchMatchedException;
import mb5.u;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {
    public static final CreditScheduledAmountType a(CreditCardAutopayRequest.AmountType amountType) {
        if (amountType instanceof CreditCardAutopayRequest.AmountType.Statement) {
            return CreditScheduledAmountType.Statement.f70686a;
        }
        if (amountType instanceof CreditCardAutopayRequest.AmountType.Minimum) {
            return CreditScheduledAmountType.Minimum.f70685a;
        }
        if (amountType instanceof CreditCardAutopayRequest.AmountType.Fixed) {
            return new CreditScheduledAmountType.Fixed(((CreditCardAutopayRequest.AmountType.Fixed) amountType).f68693a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final u b(fl4.a aVar) {
        int i = a.f247773a[aVar.ordinal()];
        if (i == 1) {
            return u.SCHEDULED;
        }
        if (i == 2) {
            return u.BACKUP_CARD;
        }
        if (i == 3) {
            return u.DIRECT_DEBIT;
        }
        if (i == 4) {
            return u.ACH;
        }
        throw new NoWhenBranchMatchedException();
    }
}
