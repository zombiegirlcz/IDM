package f7h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132619b;

    public b(String symbol, String ref2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f132618a = symbol;
        this.f132619b = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f132618a, bVar.f132618a) && Intrinsics.f(this.f132619b, bVar.f132619b);
    }

    public final int hashCode() {
        return this.f132619b.hashCode() + (this.f132618a.hashCode() * 31);
    }
}
