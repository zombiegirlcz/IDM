package ard;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f8684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f8685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8686c;
    public final ZonedDateTime d;
    public final ZonedDateTime e;
    public final boolean f;

    public y(ZonedDateTime windowStart, ZonedDateTime windowEnd, String searchQuery, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, boolean z) {
        Intrinsics.checkNotNullParameter(windowStart, "windowStart");
        Intrinsics.checkNotNullParameter(windowEnd, "windowEnd");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f8684a = windowStart;
        this.f8685b = windowEnd;
        this.f8686c = searchQuery;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = z;
    }

    public static y b(y yVar, ZonedDateTime windowStart, ZonedDateTime windowEnd) {
        String searchQuery = yVar.f8686c;
        ZonedDateTime zonedDateTime = yVar.d;
        ZonedDateTime zonedDateTime2 = yVar.e;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(windowStart, "windowStart");
        Intrinsics.checkNotNullParameter(windowEnd, "windowEnd");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new y(windowStart, windowEnd, searchQuery, zonedDateTime, zonedDateTime2, false);
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF84104a() {
        return 50;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f8684a, yVar.f8684a) && Intrinsics.f(this.f8685b, yVar.f8685b) && Intrinsics.f(this.f8686c, yVar.f8686c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && this.f == yVar.f;
    }

    public final int hashCode() {
        int iC = p.a.c(h30.l.h(this.f8685b, this.f8684a.hashCode() * 31, 31), 31, this.f8686c);
        ZonedDateTime zonedDateTime = this.d;
        int iHashCode = (iC + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (zonedDateTime2 != null ? zonedDateTime2.hashCode() : 0)) * 31);
    }
}
