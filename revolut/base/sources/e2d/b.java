package e2d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ogd.e f122047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f122048b;

    public b(ogd.e assetPair, Integer num) {
        Intrinsics.checkNotNullParameter(assetPair, "assetPair");
        this.f122047a = assetPair;
        this.f122048b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f122047a, bVar.f122047a) && Intrinsics.f(this.f122048b, bVar.f122048b);
    }

    public final int hashCode() {
        int iHashCode = this.f122047a.hashCode() * 31;
        Integer num = this.f122048b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
