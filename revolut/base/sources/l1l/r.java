package l1l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrf.i f191593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f191594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f191595c;
    public final wi0.b d;

    public /* synthetic */ r(hrf.i iVar, boolean z) {
        this(iVar, z, false, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f191593a, rVar.f191593a) && this.f191594b == rVar.f191594b && this.f191595c == rVar.f191595c && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        hrf.i iVar = this.f191593a;
        int iC = j6.a.c(j6.a.c((iVar == null ? 0 : iVar.hashCode()) * 31, 31, this.f191594b), 31, this.f191595c);
        wi0.b bVar = this.d;
        return iC + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }

    public r(hrf.i iVar, boolean z, boolean z3, wi0.b bVar) {
        this.f191593a = iVar;
        this.f191594b = z;
        this.f191595c = z3;
        this.d = bVar;
    }
}
