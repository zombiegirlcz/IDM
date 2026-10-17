package hr6;

import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es6.b f154782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxHubVatSummary f154783b;

    public j(es6.b taxAllocationMode, TaxHubVatSummary vatSummary) {
        Intrinsics.checkNotNullParameter(taxAllocationMode, "taxAllocationMode");
        Intrinsics.checkNotNullParameter(vatSummary, "vatSummary");
        this.f154782a = taxAllocationMode;
        this.f154783b = vatSummary;
    }

    public final es6.b b() {
        return this.f154782a;
    }

    public final TaxHubVatSummary c() {
        return this.f154783b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f154782a == jVar.f154782a && Intrinsics.f(this.f154783b, jVar.f154783b);
    }

    public final int hashCode() {
        return this.f154783b.hashCode() + (this.f154782a.hashCode() * 31);
    }
}
