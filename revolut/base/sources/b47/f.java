package b47;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od0.i f12191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f12192b;

    public f(od0.i taxProfile, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(taxProfile, "taxProfile");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f12191a = taxProfile;
        this.f12192b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f12191a, fVar.f12191a) && Intrinsics.f(this.f12192b, fVar.f12192b);
    }

    public final int hashCode() {
        return this.f12192b.f297794a.hashCode() + (this.f12191a.hashCode() * 31);
    }
}
