package h7i;

import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletAutomation.Limit f149891a;

    public h(WalletAutomation.Limit limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f149891a = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f149891a, ((h) obj2).f149891a);
    }

    public final int hashCode() {
        return this.f149891a.hashCode();
    }
}
