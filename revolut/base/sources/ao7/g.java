package ao7;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f7909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f7910b;

    public g(ZonedDateTime startDateTime, ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        this.f7909a = startDateTime;
        this.f7910b = zonedDateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f7909a, gVar.f7909a) && Intrinsics.f(this.f7910b, gVar.f7910b);
    }

    public final int hashCode() {
        int iHashCode = this.f7909a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.f7910b;
        return iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode());
    }
}
