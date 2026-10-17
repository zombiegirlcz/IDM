package x33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f302641a;

    public g(dj0.d dVar) {
        this.f302641a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f302641a, ((g) obj2).f302641a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f302641a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
