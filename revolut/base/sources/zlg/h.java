package zlg;

import do3.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f323256a;

    public h(v vVar) {
        this.f323256a = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f323256a == ((h) obj2).f323256a;
    }

    public final int hashCode() {
        v vVar = this.f323256a;
        if (vVar == null) {
            return 0;
        }
        return vVar.hashCode();
    }
}
