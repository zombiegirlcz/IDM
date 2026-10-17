package e60;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t80.m f122857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122858b;

    public j(t80.m reason, String str) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f122857a = reason;
        this.f122858b = str;
    }

    @Override // e60.l
    public final String a() {
        return this.f122858b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f122857a, jVar.f122857a) && Intrinsics.f(this.f122858b, jVar.f122858b);
    }

    public final int hashCode() {
        int iHashCode = this.f122857a.hashCode() * 31;
        String str = this.f122858b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
