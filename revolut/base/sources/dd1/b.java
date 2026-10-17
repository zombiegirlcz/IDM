package dd1;

import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxRate f113084a;

    public b(TaxRate taxRate) {
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        this.f113084a = taxRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f113084a, ((b) obj2).f113084a);
    }

    public final int hashCode() {
        return this.f113084a.hashCode();
    }
}
