package iw6;

import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerCustomer f168984a;

    public o(FreelancerCustomer customer) {
        Intrinsics.checkNotNullParameter(customer, "customer");
        this.f168984a = customer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f168984a, ((o) obj2).f168984a);
    }

    public final int hashCode() {
        return this.f168984a.hashCode();
    }
}
