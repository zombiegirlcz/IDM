package u4i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeEntry f277361a;

    public q(ChargeEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f277361a = entry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f277361a, ((q) obj2).f277361a);
    }

    public final int hashCode() {
        return this.f277361a.hashCode();
    }
}
