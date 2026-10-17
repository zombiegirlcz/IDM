package lu6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AcquiringOrderFilter f200050a;

    public m(AcquiringOrderFilter acquiringOrderFilter) {
        this.f200050a = acquiringOrderFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f200050a, ((m) obj2).f200050a);
    }

    public final int hashCode() {
        AcquiringOrderFilter acquiringOrderFilter = this.f200050a;
        if (acquiringOrderFilter == null) {
            return 0;
        }
        return acquiringOrderFilter.hashCode();
    }
}
