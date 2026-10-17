package ko5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f186225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f186226b;

    public f(boolean z, Boolean bool) {
        this.f186225a = z;
        this.f186226b = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f186225a == fVar.f186225a && Intrinsics.f(this.f186226b, fVar.f186226b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f186225a) * 31;
        Boolean bool = this.f186226b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
