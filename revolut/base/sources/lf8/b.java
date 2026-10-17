package lf8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f194664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f194665b;

    public b(e j2jTransfers, j jVar) {
        Intrinsics.checkNotNullParameter(j2jTransfers, "j2jTransfers");
        this.f194664a = j2jTransfers;
        this.f194665b = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f194664a, bVar.f194664a) && Intrinsics.f(this.f194665b, bVar.f194665b);
    }

    public final int hashCode() {
        int iHashCode = this.f194664a.hashCode() * 31;
        j jVar = this.f194665b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
