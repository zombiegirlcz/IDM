package qi7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f246659c;

    public a(String ref2, String symbol, g gVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f246657a = ref2;
        this.f246658b = symbol;
        this.f246659c = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f246657a, aVar.f246657a) && Intrinsics.f(this.f246658b, aVar.f246658b) && Intrinsics.f(this.f246659c, aVar.f246659c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f246657a.hashCode() * 31, 31, this.f246658b);
        g gVar = this.f246659c;
        return iC + (gVar == null ? 0 : gVar.hashCode());
    }
}
