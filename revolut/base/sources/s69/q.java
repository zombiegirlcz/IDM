package s69;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f260174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f260175b;

    public q(Instant startDate, Instant endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f260174a = startDate;
        this.f260175b = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f260174a, qVar.f260174a) && Intrinsics.f(this.f260175b, qVar.f260175b);
    }

    public final int hashCode() {
        return this.f260175b.hashCode() + (this.f260174a.hashCode() * 31);
    }
}
