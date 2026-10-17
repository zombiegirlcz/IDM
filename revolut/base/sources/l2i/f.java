package l2i;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f191801a;

    public f(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f191801a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f191801a, ((f) obj2).f191801a);
    }

    public final int hashCode() {
        return this.f191801a.hashCode();
    }
}
