package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f4628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f4629c;
    public final j d;
    public final k e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f4630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f4631h;

    public q(String ref2, n nVar, m mVar, j jVar, k kVar, l lVar, i iVar, p pVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f4627a = ref2;
        this.f4628b = nVar;
        this.f4629c = mVar;
        this.d = jVar;
        this.e = kVar;
        this.f = lVar;
        this.f4630g = iVar;
        this.f4631h = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f4627a, qVar.f4627a) && Intrinsics.f(this.f4628b, qVar.f4628b) && Intrinsics.f(this.f4629c, qVar.f4629c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f4630g, qVar.f4630g) && Intrinsics.f(this.f4631h, qVar.f4631h);
    }

    public final int hashCode() {
        int iHashCode = this.f4627a.hashCode() * 31;
        n nVar = this.f4628b;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        m mVar = this.f4629c;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        j jVar = this.d;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.e;
        int iHashCode5 = (iHashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.f;
        int iHashCode6 = (iHashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        i iVar = this.f4630g;
        int iHashCode7 = (iHashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        p pVar = this.f4631h;
        return iHashCode7 + (pVar != null ? pVar.hashCode() : 0);
    }

    @Override // afl.a
    public final String i() {
        return this.f4627a;
    }
}
