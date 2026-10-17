package q56;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk5.a f242301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f242302b;

    public i(wk5.a blockchain, xi0.b currency) {
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f242301a = blockchain;
        this.f242302b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f242301a == iVar.f242301a && Intrinsics.f(this.f242302b, iVar.f242302b);
    }

    public final int hashCode() {
        return this.f242302b.hashCode() + (this.f242301a.hashCode() * 31);
    }
}
