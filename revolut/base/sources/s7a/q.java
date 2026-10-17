package s7a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f260625b;

    public q(String id10, Object obj2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f260624a = id10;
        this.f260625b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f260624a, qVar.f260624a) && Intrinsics.f(this.f260625b, qVar.f260625b);
    }

    public final int hashCode() {
        int iHashCode = this.f260624a.hashCode() * 31;
        Object obj2 = this.f260625b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
