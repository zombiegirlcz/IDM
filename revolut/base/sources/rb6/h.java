package rb6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f252965a;

    public h(dj0.d dVar) {
        this.f252965a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f252965a, ((h) obj2).f252965a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f252965a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
