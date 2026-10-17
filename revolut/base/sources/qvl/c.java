package qvl;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f249718a;

    public c(Amount insufficientAmount) {
        Intrinsics.checkNotNullParameter(insufficientAmount, "insufficientAmount");
        this.f249718a = insufficientAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f249718a, ((c) obj2).f249718a);
    }

    public final int hashCode() {
        return this.f249718a.hashCode();
    }
}
