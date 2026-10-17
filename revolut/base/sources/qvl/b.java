package qvl;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f249717a;

    public b(Amount insufficientAmount) {
        Intrinsics.checkNotNullParameter(insufficientAmount, "insufficientAmount");
        this.f249717a = insufficientAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f249717a, ((b) obj2).f249717a);
    }

    public final int hashCode() {
        return this.f249717a.hashCode();
    }
}
