package lbf;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f193678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f193679c;
    public final ZonedDateTime d;
    public final String e;

    public j(String id10, ZonedDateTime zonedDateTime, c cVar, ZonedDateTime zonedDateTime2, String billingCycleId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(billingCycleId, "billingCycleId");
        this.f193677a = id10;
        this.f193678b = zonedDateTime;
        this.f193679c = cVar;
        this.d = zonedDateTime2;
        this.e = billingCycleId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f193677a, jVar.f193677a) && Intrinsics.f(this.f193678b, jVar.f193678b) && this.f193679c == jVar.f193679c && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f193677a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.f193678b;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        c cVar = this.f193679c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (zonedDateTime2 != null ? zonedDateTime2.hashCode() : 0)) * 31);
    }
}
