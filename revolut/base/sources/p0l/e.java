package p0l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pxk.b f231552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do3.n f231553b;

    public e(pxk.b bVar, do3.n nVar) {
        this.f231552a = bVar;
        this.f231553b = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f231552a, eVar.f231552a) && Intrinsics.f(this.f231553b, eVar.f231553b);
    }

    public final int hashCode() {
        pxk.b bVar = this.f231552a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        do3.n nVar = this.f231553b;
        return iHashCode + (nVar != null ? nVar.hashCode() : 0);
    }
}
