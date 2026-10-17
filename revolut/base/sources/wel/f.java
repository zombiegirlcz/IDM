package wel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f296824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f296825b;

    public f(Boolean bool, Boolean bool2) {
        this.f296824a = bool;
        this.f296825b = bool2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f296824a, fVar.f296824a) && Intrinsics.f(this.f296825b, fVar.f296825b);
    }

    public final int hashCode() {
        Boolean bool = this.f296824a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f296825b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
