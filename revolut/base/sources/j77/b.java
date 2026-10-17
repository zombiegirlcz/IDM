package j77;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171864b;

    public b(String ref2, String symbol) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f171863a = ref2;
        this.f171864b = symbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f171863a, bVar.f171863a) && Intrinsics.f(this.f171864b, bVar.f171864b);
    }

    public final int hashCode() {
        return this.f171864b.hashCode() + (this.f171863a.hashCode() * 31);
    }
}
