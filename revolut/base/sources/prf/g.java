package prf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f239011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f239012b;

    public g(wi0.b userCountry, wi0.b recipientCountry) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        this.f239011a = userCountry;
        this.f239012b = recipientCountry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f239011a, gVar.f239011a) && Intrinsics.f(this.f239012b, gVar.f239012b);
    }

    public final int hashCode() {
        return this.f239012b.f297794a.hashCode() + (this.f239011a.f297794a.hashCode() * 31);
    }
}
