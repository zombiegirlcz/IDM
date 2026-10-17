package e85;

import com.revolut.feature.credit.loan.api.models.rev10.ExcludedAmountRange;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentConfig;
import e85.m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s {
    public static m a(dj0.d amount, LoanRepaymentConfig config, dj0.d settlementAmount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(settlementAmount, "settlementAmount");
        if (amount.k()) {
            return null;
        }
        if (amount.compareTo(config.f70178b) < 0) {
            return m.c.f123593a;
        }
        if (amount.compareTo(settlementAmount) > 0) {
            return m.b.f123592a;
        }
        if (amount.compareTo(config.f70179c) > 0 && !amount.equals(settlementAmount)) {
            return m.a.f123591a;
        }
        List<ExcludedAmountRange> list = config.i;
        if (list == null) {
            return null;
        }
        for (ExcludedAmountRange excludedAmountRange : list) {
            dj0.d dVar = excludedAmountRange.f70105a;
            dj0.d dVar2 = excludedAmountRange.f70106b;
            String str = excludedAmountRange.f70107c;
            if (amount.compareTo(dVar) >= 0 && amount.compareTo(dVar2) <= 0) {
                return new n(str);
            }
        }
        return null;
    }
}
