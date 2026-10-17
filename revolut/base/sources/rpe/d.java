package rpe;

import aii.r;
import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExemptionReason f256378a;

    public d(ExemptionReason exemptionReason) {
        Intrinsics.checkNotNullParameter(exemptionReason, "exemptionReason");
        this.f256378a = exemptionReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f256378a == ((d) obj2).f256378a;
    }

    public final int hashCode() {
        return this.f256378a.hashCode();
    }
}
