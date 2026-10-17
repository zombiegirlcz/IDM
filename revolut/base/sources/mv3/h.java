package mv3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f209124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f209125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f209126c;
    public final e d;
    public final eu3.c e;
    public final fu3.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bv3.c f209127g;

    public h(k parameters, a creditToRefinanceContent, j jVar, e eVar, eu3.c cVar, fu3.c cVar2, bv3.c cVar3) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(creditToRefinanceContent, "creditToRefinanceContent");
        this.f209124a = parameters;
        this.f209125b = creditToRefinanceContent;
        this.f209126c = jVar;
        this.d = eVar;
        this.e = cVar;
        this.f = cVar2;
        this.f209127g = cVar3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f209124a, hVar.f209124a) && Intrinsics.f(this.f209125b, hVar.f209125b) && Intrinsics.f(this.f209126c, hVar.f209126c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f209127g, hVar.f209127g);
    }

    public final int hashCode() {
        int iHashCode = (this.f209125b.hashCode() + (this.f209124a.hashCode() * 31)) * 31;
        j jVar = this.f209126c;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        e eVar = this.d;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        eu3.c cVar = this.e;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        fu3.c cVar2 = this.f;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        bv3.c cVar3 = this.f209127g;
        return iHashCode5 + (cVar3 != null ? cVar3.hashCode() : 0);
    }
}
