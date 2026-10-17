package n85;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koi.j f213221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f213222b;

    public l(koi.j listItem, ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        this.f213221a = listItem;
        this.f213222b = zonedDateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f213221a, lVar.f213221a) && Intrinsics.f(this.f213222b, lVar.f213222b);
    }

    public final int hashCode() {
        int iHashCode = this.f213221a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.f213222b;
        return iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode());
    }
}
