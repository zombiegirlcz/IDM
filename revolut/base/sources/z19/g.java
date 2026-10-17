package z19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f318776c;
    public final d d;
    public final i e;

    public g(String header, String title, String str, d dVar, i iVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f318774a = header;
        this.f318775b = title;
        this.f318776c = str;
        this.d = dVar;
        this.e = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f318774a, gVar.f318774a) && Intrinsics.f(this.f318775b, gVar.f318775b) && Intrinsics.f(this.f318776c, gVar.f318776c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f318774a.hashCode() * 31, 31, this.f318775b);
        String str = this.f318776c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.d;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i iVar = this.e;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
