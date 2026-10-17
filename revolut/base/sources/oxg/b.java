package oxg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f230816b;

    public b(String symbol, String ref2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f230815a = symbol;
        this.f230816b = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f230815a, bVar.f230815a) && Intrinsics.f(this.f230816b, bVar.f230816b);
    }

    public final int hashCode() {
        return this.f230816b.hashCode() + (this.f230815a.hashCode() * 31);
    }
}
