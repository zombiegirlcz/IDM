package q56;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kn5.n f242298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk5.a f242299b;

    public g() {
        this((kn5.n) null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f242298a, gVar.f242298a) && this.f242299b == gVar.f242299b;
    }

    public final int hashCode() {
        kn5.n nVar = this.f242298a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        wk5.a aVar = this.f242299b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public /* synthetic */ g(kn5.n nVar, int i) {
        this((i & 1) != 0 ? null : nVar, (wk5.a) null);
    }

    public g(kn5.n nVar, wk5.a aVar) {
        this.f242298a = nVar;
        this.f242299b = aVar;
    }
}
