package wp4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f299041a;

    public d(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f299041a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f299041a, ((d) obj2).f299041a);
    }

    @Override // wp4.e
    public final wi0.b getCountryCode() {
        return this.f299041a;
    }

    public final int hashCode() {
        return this.f299041a.f297794a.hashCode();
    }
}
