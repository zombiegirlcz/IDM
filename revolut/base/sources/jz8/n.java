package jz8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179643c;
    public final u09.v d;
    public final int e;

    public n(String glossaryItemId, String term, String definition, u09.v productDomain, int i) {
        Intrinsics.checkNotNullParameter(glossaryItemId, "glossaryItemId");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(productDomain, "productDomain");
        this.f179641a = glossaryItemId;
        this.f179642b = term;
        this.f179643c = definition;
        this.d = productDomain;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f179641a, nVar.f179641a) && Intrinsics.f(this.f179642b, nVar.f179642b) && Intrinsics.f(this.f179643c, nVar.f179643c) && this.d == nVar.d && this.e == nVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + p.a.c(p.a.c(this.f179641a.hashCode() * 31, 31, this.f179642b), 31, this.f179643c)) * 31);
    }
}
