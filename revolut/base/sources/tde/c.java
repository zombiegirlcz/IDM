package tde;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f269973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f269974b;

    public c(Instant createdDate, Instant estimatedArrivalDate) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(estimatedArrivalDate, "estimatedArrivalDate");
        this.f269973a = createdDate;
        this.f269974b = estimatedArrivalDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f269973a, cVar.f269973a) && Intrinsics.f(this.f269974b, cVar.f269974b);
    }

    public final int hashCode() {
        return this.f269974b.hashCode() + (this.f269973a.hashCode() * 31);
    }
}
