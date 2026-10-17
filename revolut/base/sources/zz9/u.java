package zz9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f326632a;

    public u(dj0.d dVar) {
        this.f326632a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f326632a, ((u) obj2).f326632a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f326632a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
