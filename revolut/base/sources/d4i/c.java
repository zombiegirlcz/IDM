package d4i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeEntry f111324a;

    public c(ChargeEntry charge) {
        Intrinsics.checkNotNullParameter(charge, "charge");
        this.f111324a = charge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f111324a, ((c) obj2).f111324a);
    }

    public final int hashCode() {
        return this.f111324a.hashCode();
    }
}
