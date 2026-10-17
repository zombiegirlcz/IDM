package upe;

import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeclaredTaxResidency f281993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f281994b;

    public i(DeclaredTaxResidency taxResidency, List existingTaxResidencies) {
        Intrinsics.checkNotNullParameter(taxResidency, "taxResidency");
        Intrinsics.checkNotNullParameter(existingTaxResidencies, "existingTaxResidencies");
        this.f281993a = taxResidency;
        this.f281994b = existingTaxResidencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f281993a, iVar.f281993a) && Intrinsics.f(this.f281994b, iVar.f281994b);
    }

    public final int hashCode() {
        return this.f281994b.hashCode() + (this.f281993a.hashCode() * 31);
    }
}
