package one;

import com.revolut.feature.tax_residency.api.exemption.model.ValidityPeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ValidityPeriod f226940b;

    public b(String code, ValidityPeriod validityPeriod) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f226939a = code;
        this.f226940b = validityPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f226939a, bVar.f226939a) && Intrinsics.f(this.f226940b, bVar.f226940b);
    }

    public final int hashCode() {
        int iHashCode = this.f226939a.hashCode() * 31;
        ValidityPeriod validityPeriod = this.f226940b;
        return iHashCode + (validityPeriod == null ? 0 : validityPeriod.hashCode());
    }
}
