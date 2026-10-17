package bzh;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f20031a;

    public d(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f20031a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f20031a, ((d) obj2).f20031a);
    }

    public final int hashCode() {
        return this.f20031a.hashCode();
    }
}
