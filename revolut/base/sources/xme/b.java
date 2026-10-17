package xme;

import com.revolut.feature.tax_residency.api.exemption.model.ValidityPeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ValidityPeriod f307224b;

    public b(String code, ValidityPeriod validityPeriod) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(validityPeriod, "validityPeriod");
        this.f307223a = code;
        this.f307224b = validityPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f307223a, bVar.f307223a) && Intrinsics.f(this.f307224b, bVar.f307224b);
    }

    public final int hashCode() {
        return this.f307224b.hashCode() + (this.f307223a.hashCode() * 31);
    }
}
