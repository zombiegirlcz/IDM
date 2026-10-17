package zvd;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f325656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f325657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325658c;

    public a(long j2, String sourcePocketId, xi0.b stakingCurrency) {
        Intrinsics.checkNotNullParameter(stakingCurrency, "stakingCurrency");
        Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
        this.f325656a = j2;
        this.f325657b = stakingCurrency;
        this.f325658c = sourcePocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f325656a == aVar.f325656a && Intrinsics.f(this.f325657b, aVar.f325657b) && Intrinsics.f(this.f325658c, aVar.f325658c);
    }

    public final int hashCode() {
        return this.f325658c.hashCode() + l.j(this.f325657b, Long.hashCode(this.f325656a) * 31, 31);
    }
}
