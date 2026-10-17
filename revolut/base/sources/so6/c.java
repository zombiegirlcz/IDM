package so6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f264793b;

    public c(dj0.d dVar, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f264792a = id10;
        this.f264793b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f264792a, cVar.f264792a) && Intrinsics.f(this.f264793b, cVar.f264793b);
    }

    public final int hashCode() {
        int iHashCode = this.f264792a.hashCode() * 31;
        dj0.d dVar = this.f264793b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
