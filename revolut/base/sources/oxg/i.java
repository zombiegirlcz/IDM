package oxg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f230829b;

    public i(String symbol, String ref2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f230828a = symbol;
        this.f230829b = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f230828a, iVar.f230828a) && Intrinsics.f(this.f230829b, iVar.f230829b);
    }

    public final int hashCode() {
        return this.f230829b.hashCode() + (this.f230828a.hashCode() * 31);
    }
}
