package mwg;

import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f209463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f209464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f209465c;
    public final ZonedDateTime d;

    public i(DateTime start, DateTime end2, List points, ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f209463a = start;
        this.f209464b = end2;
        this.f209465c = points;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f209463a, iVar.f209463a) && Intrinsics.f(this.f209464b, iVar.f209464b) && Intrinsics.f(this.f209465c, iVar.f209465c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(m72.b.f(this.f209464b, this.f209463a.hashCode() * 31, 31), 31, this.f209465c);
        ZonedDateTime zonedDateTime = this.d;
        return iD + (zonedDateTime == null ? 0 : zonedDateTime.hashCode());
    }
}
