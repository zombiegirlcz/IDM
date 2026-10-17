package lbf;

import java.time.Period;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f193669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f193670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193671c;
    public final dj0.d d;

    public d(Period duration, ZonedDateTime zonedDateTime, String str, dj0.d fee2) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f193669a = duration;
        this.f193670b = zonedDateTime;
        this.f193671c = str;
        this.d = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f193669a, dVar.f193669a) && Intrinsics.f(this.f193670b, dVar.f193670b) && Intrinsics.f(this.f193671c, dVar.f193671c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f193669a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.f193670b;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str = this.f193671c;
        return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
