package rr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f256709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f256710b;

    public h(l lVar, p nextTier) {
        Intrinsics.checkNotNullParameter(nextTier, "nextTier");
        this.f256709a = lVar;
        this.f256710b = nextTier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f256709a, hVar.f256709a) && Intrinsics.f(this.f256710b, hVar.f256710b);
    }

    public final int hashCode() {
        l lVar = this.f256709a;
        return this.f256710b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31);
    }
}
