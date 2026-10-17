package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f160804c;
    public final String d;
    public final boolean e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f160805g;

    public p(String eventId, LocalDate effectiveDate, l holiday, String name, boolean z, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(holiday, "holiday");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f160802a = eventId;
        this.f160803b = effectiveDate;
        this.f160804c = holiday;
        this.d = name;
        this.e = z;
        this.f = dateTime;
        this.f160805g = dateTime2;
    }

    @Override // iel.i
    public final String b() {
        return this.f160802a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f160802a, pVar.f160802a) && Intrinsics.f(this.f160803b, pVar.f160803b) && this.f160804c == pVar.f160804c && Intrinsics.f(this.d, pVar.d) && this.e == pVar.e && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f160805g, pVar.f160805g);
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160803b;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c((this.f160804c.hashCode() + wp5.y.a(this.f160802a.hashCode() * 31, 31, this.f160803b)) * 31, 31, this.d), 31, this.e);
        DateTime dateTime = this.f;
        int iHashCode = (iC + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f160805g;
        return iHashCode + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }
}
