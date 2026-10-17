package tb5;

import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f269468a;

    static {
        a aVar = a.FIXED;
        Pair pair = new Pair(aVar.a(), aVar);
        a aVar2 = a.MIN_REPAYMENT;
        Pair pair2 = new Pair(aVar2.a(), aVar2);
        a aVar3 = a.STATEMENT_BALANCE;
        f269468a = r0.k(pair, pair2, new Pair(aVar3.a(), aVar3));
    }

    public static final CreditScheduledAmountType a(a aVar, Long l2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        int i = e.f269467a[aVar.ordinal()];
        if (i == 1) {
            if (l2 != null) {
                return new CreditScheduledAmountType.Fixed(new dj0.d(l2.longValue(), currency));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i == 2) {
            return CreditScheduledAmountType.Minimum.f70685a;
        }
        if (i == 3) {
            return CreditScheduledAmountType.Statement.f70686a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
