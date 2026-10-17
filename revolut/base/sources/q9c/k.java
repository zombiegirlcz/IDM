package q9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f243868a;

    public k(f fVar) {
        this.f243868a = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f243868a, ((k) obj2).f243868a);
    }

    public final int hashCode() {
        f fVar = this.f243868a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }
}
