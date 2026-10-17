package a0l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xel.f f426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xel.a f427b;

    public b(xel.f document, xel.a aVar) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f426a = document;
        this.f427b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f426a, bVar.f426a) && Intrinsics.f(this.f427b, bVar.f427b);
    }

    public final int hashCode() {
        int iHashCode = this.f426a.hashCode() * 31;
        xel.a aVar = this.f427b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
