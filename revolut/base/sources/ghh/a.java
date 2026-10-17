package ghh;

import kotlin.jvm.internal.Intrinsics;
import m1h.r;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f143925a;

    public a(dj0.d dVar) {
        this.f143925a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f143925a, ((a) obj2).f143925a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f143925a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
