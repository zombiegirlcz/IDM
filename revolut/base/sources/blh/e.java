package blh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nel.n f16645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oel.l f16646b;

    public e(nel.n instrument, oel.l ipoSummary) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(ipoSummary, "ipoSummary");
        this.f16645a = instrument;
        this.f16646b = ipoSummary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f16645a, eVar.f16645a) && Intrinsics.f(this.f16646b, eVar.f16646b);
    }

    public final int hashCode() {
        return this.f16646b.hashCode() + (this.f16645a.hashCode() * 31);
    }
}
