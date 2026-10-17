package r5i;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChargeEntry f251595a;

    public b(ChargeEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f251595a = entry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f251595a, ((b) obj2).f251595a);
    }

    public final int hashCode() {
        return this.f251595a.hashCode();
    }
}
