package uk2;

import com.revolut.feature.atm.api.model.AtmBoundBox;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtmBoundBox f280659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sj2.c f280660b;

    public p(AtmBoundBox boundBox, sj2.c cVar) {
        Intrinsics.checkNotNullParameter(boundBox, "boundBox");
        this.f280659a = boundBox;
        this.f280660b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f280659a, pVar.f280659a) && this.f280660b == pVar.f280660b;
    }

    public final int hashCode() {
        int iHashCode = this.f280659a.hashCode() * 31;
        sj2.c cVar = this.f280660b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
