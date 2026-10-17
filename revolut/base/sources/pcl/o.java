package pcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f234970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f234971c;
    public final i d;
    public final j e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f234972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f234973h;

    public o(String ref2, m mVar, l lVar, i iVar, j jVar, k kVar, h hVar, n nVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f234969a = ref2;
        this.f234970b = mVar;
        this.f234971c = lVar;
        this.d = iVar;
        this.e = jVar;
        this.f = kVar;
        this.f234972g = hVar;
        this.f234973h = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f234969a, oVar.f234969a) && Intrinsics.f(this.f234970b, oVar.f234970b) && Intrinsics.f(this.f234971c, oVar.f234971c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f234972g, oVar.f234972g) && Intrinsics.f(this.f234973h, oVar.f234973h);
    }

    public final int hashCode() {
        int iHashCode = this.f234969a.hashCode() * 31;
        m mVar = this.f234970b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        l lVar = this.f234971c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        i iVar = this.d;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j jVar = this.e;
        int iHashCode5 = (iHashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.f;
        int iHashCode6 = (iHashCode5 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        h hVar = this.f234972g;
        int iHashCode7 = (iHashCode6 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        n nVar = this.f234973h;
        return iHashCode7 + (nVar != null ? nVar.hashCode() : 0);
    }
}
