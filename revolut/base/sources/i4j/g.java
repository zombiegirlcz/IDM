package i4j;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f158516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f158517b;

    public g(Set availableCountries, wi0.b preselectedCountry) {
        Intrinsics.checkNotNullParameter(preselectedCountry, "preselectedCountry");
        Intrinsics.checkNotNullParameter(availableCountries, "availableCountries");
        this.f158516a = preselectedCountry;
        this.f158517b = availableCountries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f158516a, gVar.f158516a) && Intrinsics.f(this.f158517b, gVar.f158517b);
    }

    public final int hashCode() {
        return this.f158517b.hashCode() + (this.f158516a.f297794a.hashCode() * 31);
    }
}
