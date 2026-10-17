package vl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f290270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f290271b;

    public l(j jVar, m mVar) {
        this.f290270a = jVar;
        this.f290271b = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f290270a, lVar.f290270a) && Intrinsics.f(this.f290271b, lVar.f290271b);
    }

    public final int hashCode() {
        j jVar = this.f290270a;
        int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        m mVar = this.f290271b;
        return iHashCode + (mVar != null ? mVar.hashCode() : 0);
    }
}
