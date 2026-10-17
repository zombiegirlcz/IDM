package i57;

import cli.j;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es6.b f158780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxHubVatSummary f158781b;

    public b(es6.b taxAllocationMode, TaxHubVatSummary vatSummary) {
        Intrinsics.checkNotNullParameter(taxAllocationMode, "taxAllocationMode");
        Intrinsics.checkNotNullParameter(vatSummary, "vatSummary");
        this.f158780a = taxAllocationMode;
        this.f158781b = vatSummary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f158780a == bVar.f158780a && Intrinsics.f(this.f158781b, bVar.f158781b);
    }

    public final int hashCode() {
        return this.f158781b.hashCode() + (this.f158780a.hashCode() * 31);
    }
}
