package til;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f271582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f271583b;

    public o() {
        this(3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f271582a == oVar.f271582a && Intrinsics.f(this.f271583b, oVar.f271583b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f271582a) * 31;
        l lVar = this.f271583b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public /* synthetic */ o(int i) {
        this((i & 1) == 0, (i & 2) != 0 ? null : k.f271580a);
    }

    public o(boolean z, l lVar) {
        this.f271582a = z;
        this.f271583b = lVar;
    }
}
