package tne;

import cli.j;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxExemptionAggregate f272429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272430b;

    public d(TaxExemptionAggregate exemption, String selectedAmount) {
        Intrinsics.checkNotNullParameter(exemption, "exemption");
        Intrinsics.checkNotNullParameter(selectedAmount, "selectedAmount");
        this.f272429a = exemption;
        this.f272430b = selectedAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f272429a, dVar.f272429a) && Intrinsics.f(this.f272430b, dVar.f272430b);
    }

    public final int hashCode() {
        return this.f272430b.hashCode() + (this.f272429a.hashCode() * 31);
    }
}
