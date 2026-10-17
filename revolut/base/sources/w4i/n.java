package w4i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeEntry f294581a;

    public n(ChargeEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f294581a = entry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f294581a, ((n) obj2).f294581a);
    }

    public final int hashCode() {
        return this.f294581a.hashCode();
    }
}
