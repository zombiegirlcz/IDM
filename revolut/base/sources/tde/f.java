package tde;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f269979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f269980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f269981c;
    public final String d;
    public final k e;

    public f(Instant createdDate, Instant inTransitDate, Instant estimatedArrivalDate, String str, k kVar) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(inTransitDate, "inTransitDate");
        Intrinsics.checkNotNullParameter(estimatedArrivalDate, "estimatedArrivalDate");
        this.f269979a = createdDate;
        this.f269980b = inTransitDate;
        this.f269981c = estimatedArrivalDate;
        this.d = str;
        this.e = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f269979a, fVar.f269979a) && Intrinsics.f(this.f269980b, fVar.f269980b) && Intrinsics.f(this.f269981c, fVar.f269981c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iC = r6.b.c(r6.b.c(this.f269979a.hashCode() * 31, 31, this.f269980b), 31, this.f269981c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.e;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }
}
