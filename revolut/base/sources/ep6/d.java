package ep6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo6.d f128085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo6.c f128086c;

    public d(String referenceId, yo6.d referenceType, yo6.c cVar) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        this.f128084a = referenceId;
        this.f128085b = referenceType;
        this.f128086c = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f128084a, dVar.f128084a) && this.f128085b == dVar.f128085b && Intrinsics.f(this.f128086c, dVar.f128086c);
    }

    public final int hashCode() {
        int iHashCode = (this.f128085b.hashCode() + (this.f128084a.hashCode() * 31)) * 31;
        yo6.c cVar = this.f128086c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
