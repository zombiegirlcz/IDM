package s47;

import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import ds6.g0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f259783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxHubVatSummary f259784b;

    public i(g0 review, TaxHubVatSummary taxHubVatSummary) {
        Intrinsics.checkNotNullParameter(review, "review");
        this.f259783a = review;
        this.f259784b = taxHubVatSummary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f259783a, iVar.f259783a) && Intrinsics.f(this.f259784b, iVar.f259784b);
    }

    public final int hashCode() {
        int iHashCode = this.f259783a.hashCode() * 31;
        TaxHubVatSummary taxHubVatSummary = this.f259784b;
        return iHashCode + (taxHubVatSummary == null ? 0 : taxHubVatSummary.hashCode());
    }
}
