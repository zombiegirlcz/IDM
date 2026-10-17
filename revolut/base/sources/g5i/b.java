package g5i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeEntry f140792a;

    public b(ChargeEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f140792a = entry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f140792a, ((b) obj2).f140792a);
    }

    public final int hashCode() {
        return this.f140792a.hashCode();
    }
}
