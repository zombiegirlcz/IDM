package hp5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f154471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154472b;

    public f(String blockchains, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchains, "blockchains");
        this.f154471a = currency;
        this.f154472b = blockchains;
    }

    public final String a() {
        return this.f154472b;
    }

    public final xi0.b b() {
        return this.f154471a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f154471a, fVar.f154471a) && Intrinsics.f(this.f154472b, fVar.f154472b);
    }

    public final int hashCode() {
        return this.f154472b.hashCode() + (this.f154471a.hashCode() * 31);
    }
}
