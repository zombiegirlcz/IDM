package oxg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f230832b;

    public k(String symbol, String ref2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f230831a = symbol;
        this.f230832b = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f230831a, kVar.f230831a) && Intrinsics.f(this.f230832b, kVar.f230832b);
    }

    public final int hashCode() {
        return this.f230832b.hashCode() + (this.f230831a.hashCode() * 31);
    }
}
