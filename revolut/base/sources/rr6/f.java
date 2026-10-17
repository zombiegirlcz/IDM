package rr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f256704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f256705b;

    public f(d dVar, e nextTier) {
        Intrinsics.checkNotNullParameter(nextTier, "nextTier");
        this.f256704a = dVar;
        this.f256705b = nextTier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f256704a, fVar.f256704a) && Intrinsics.f(this.f256705b, fVar.f256705b);
    }

    public final int hashCode() {
        d dVar = this.f256704a;
        return this.f256705b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }
}
