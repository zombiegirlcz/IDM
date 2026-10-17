package u09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276143c;
    public final v d;
    public final int e;

    public p(String id10, String term, String definition, v productDomain, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(productDomain, "productDomain");
        this.f276141a = id10;
        this.f276142b = term;
        this.f276143c = definition;
        this.d = productDomain;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f276141a, pVar.f276141a) && Intrinsics.f(this.f276142b, pVar.f276142b) && Intrinsics.f(this.f276143c, pVar.f276143c) && this.d == pVar.d && this.e == pVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + p.a.c(p.a.c(this.f276141a.hashCode() * 31, 31, this.f276142b), 31, this.f276143c)) * 31);
    }
}
