package tde;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f269975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f269976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f269977c;

    public d(Instant createdDate, Instant estimatedArrivalDate, Instant inTransitDate) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(estimatedArrivalDate, "estimatedArrivalDate");
        Intrinsics.checkNotNullParameter(inTransitDate, "inTransitDate");
        this.f269975a = createdDate;
        this.f269976b = estimatedArrivalDate;
        this.f269977c = inTransitDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f269975a, dVar.f269975a) && Intrinsics.f(this.f269976b, dVar.f269976b) && Intrinsics.f(this.f269977c, dVar.f269977c);
    }

    public final int hashCode() {
        return this.f269977c.hashCode() + r6.b.c(this.f269975a.hashCode() * 31, 31, this.f269976b);
    }
}
