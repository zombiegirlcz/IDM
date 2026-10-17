package er4;

import kotlin.jvm.internal.Intrinsics;
import ll4.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f128535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f128536b;

    public e(a0 promotionalPeriod, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(promotionalPeriod, "promotionalPeriod");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f128535a = promotionalPeriod;
        this.f128536b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f128535a, eVar.f128535a) && Intrinsics.f(this.f128536b, eVar.f128536b);
    }

    public final int hashCode() {
        return this.f128536b.f297794a.hashCode() + (this.f128535a.hashCode() * 31);
    }
}
