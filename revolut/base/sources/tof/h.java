package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f272775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f272776c;

    public h(String transactionGroupId, g exclusionType, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        Intrinsics.checkNotNullParameter(exclusionType, "exclusionType");
        this.f272774a = transactionGroupId;
        this.f272775b = exclusionType;
        this.f272776c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f272774a, hVar.f272774a) && this.f272775b == hVar.f272775b && Intrinsics.f(this.f272776c, hVar.f272776c);
    }

    public final int hashCode() {
        int iHashCode = (this.f272775b.hashCode() + (this.f272774a.hashCode() * 31)) * 31;
        dj0.d dVar = this.f272776c;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
