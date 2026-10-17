package f7j;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f132637a;

    public j(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f132637a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f132637a, ((j) obj2).f132637a);
    }

    public final int hashCode() {
        return this.f132637a.hashCode();
    }
}
