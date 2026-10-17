package m71;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f203278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f203279b;

    public a(d dVar, Object obj2) {
        this.f203278a = dVar;
        this.f203279b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f203278a, aVar.f203278a) && Intrinsics.f(this.f203279b, aVar.f203279b);
    }

    public final int hashCode() {
        d dVar = this.f203278a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Object obj2 = this.f203279b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
