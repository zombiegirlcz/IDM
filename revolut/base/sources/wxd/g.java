package wxd;

import com.revolut.feature.statements.api.models.TaxPeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f300860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxPeriod f300861b;

    public g(y endDateConfig, TaxPeriod taxPeriod) {
        Intrinsics.checkNotNullParameter(endDateConfig, "endDateConfig");
        Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
        this.f300860a = endDateConfig;
        this.f300861b = taxPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f300860a == gVar.f300860a && Intrinsics.f(this.f300861b, gVar.f300861b);
    }

    public final int hashCode() {
        return this.f300861b.hashCode() + (this.f300860a.hashCode() * 31);
    }
}
