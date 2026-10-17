package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f215932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f215933b;

    public m(boolean z, l lVar) {
        this.f215932a = z;
        this.f215933b = lVar;
    }

    public final l a() {
        return this.f215933b;
    }

    public final boolean b() {
        return this.f215932a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f215932a == mVar.f215932a && Intrinsics.f(this.f215933b, mVar.f215933b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f215932a) * 31;
        l lVar = this.f215933b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
