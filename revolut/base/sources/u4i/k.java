package u4i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeEntry f277354a;

    public k(ChargeEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f277354a = entry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f277354a, ((k) obj2).f277354a);
    }

    public final int hashCode() {
        return this.f277354a.hashCode();
    }
}
