package ff1;

import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxRate f134694a;

    public g(TaxRate taxRate) {
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        this.f134694a = taxRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f134694a, ((g) obj2).f134694a);
    }

    public final int hashCode() {
        return this.f134694a.hashCode();
    }
}
