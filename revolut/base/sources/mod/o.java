package mod;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f207629b;

    public o(LinkedHashMap existingTripCounts) {
        Intrinsics.checkNotNullParameter(existingTripCounts, "existingTripCounts");
        this.f207629b = existingTripCounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f207629b.equals(((o) obj2).f207629b);
    }

    public final int hashCode() {
        return this.f207629b.hashCode();
    }
}
