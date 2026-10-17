package m7i;

import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static h7i.h a(i input) {
        WalletAutomation.Limit limit;
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.e == c7i.f.DropsBelow && (limit = input.f) != null && input.d > limit.f86449a.f115082a) {
            return new h7i.h(limit);
        }
        return null;
    }
}
