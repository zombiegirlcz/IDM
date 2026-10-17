package g8a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f141308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f141309b;

    public i(dj0.d dVar, Boolean bool) {
        this.f141308a = bool;
        this.f141309b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f141308a, iVar.f141308a) && Intrinsics.f(this.f141309b, iVar.f141309b);
    }

    public final int hashCode() {
        Boolean bool = this.f141308a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        dj0.d dVar = this.f141309b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
