package ly3;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f200671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200672b;

    public g(String requestedMeetingPeriod, LocalDate requestedMeetingDate) {
        Intrinsics.checkNotNullParameter(requestedMeetingDate, "requestedMeetingDate");
        Intrinsics.checkNotNullParameter(requestedMeetingPeriod, "requestedMeetingPeriod");
        this.f200671a = requestedMeetingDate;
        this.f200672b = requestedMeetingPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f200671a, gVar.f200671a) && Intrinsics.f(this.f200672b, gVar.f200672b);
    }

    public final int hashCode() {
        return this.f200672b.hashCode() + (this.f200671a.hashCode() * 31);
    }
}
