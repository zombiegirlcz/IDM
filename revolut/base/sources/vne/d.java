package vne;

import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxExemptionAggregate f290799a;

    public d(TaxExemptionAggregate taxExemptionAggregate) {
        Intrinsics.checkNotNullParameter(taxExemptionAggregate, "taxExemptionAggregate");
        this.f290799a = taxExemptionAggregate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f290799a, ((d) obj2).f290799a);
    }

    public final int hashCode() {
        return this.f290799a.hashCode();
    }
}
