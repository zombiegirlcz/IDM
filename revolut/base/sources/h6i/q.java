package h6i;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {
    public static s6i.d a(OrderQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        int i = p.f149708a[quote.f104752a.ordinal()];
        if (i == 1) {
            return s6i.d.COST;
        }
        if (i == 2) {
            return s6i.d.CREDIT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
