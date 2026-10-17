package upe;

import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeclaredTaxResidency f281996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f281997b;

    public k(DeclaredTaxResidency taxResidency, List existingTaxResidencies) {
        Intrinsics.checkNotNullParameter(taxResidency, "taxResidency");
        Intrinsics.checkNotNullParameter(existingTaxResidencies, "existingTaxResidencies");
        this.f281996a = taxResidency;
        this.f281997b = existingTaxResidencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f281996a, kVar.f281996a) && Intrinsics.f(this.f281997b, kVar.f281997b);
    }

    public final int hashCode() {
        return this.f281997b.hashCode() + (this.f281996a.hashCode() * 31);
    }
}
