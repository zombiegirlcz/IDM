package bti;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTermsAndConditions;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f18589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OffsetDateTime f18590c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f18592h;
    public final AsftTimeSlot i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18593j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AsftTermsAndConditions f18594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f18595m;

    public d(String id10, c state, OffsetDateTime offsetDateTime, String airportCipId, String cipName, String cipLocation, String terminalName, LocalDate date, AsftTimeSlot timeSlot, int i, h priceBreakdown, AsftTermsAndConditions termsAndConditions, e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(airportCipId, "airportCipId");
        Intrinsics.checkNotNullParameter(cipName, "cipName");
        Intrinsics.checkNotNullParameter(cipLocation, "cipLocation");
        Intrinsics.checkNotNullParameter(terminalName, "terminalName");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(timeSlot, "timeSlot");
        Intrinsics.checkNotNullParameter(priceBreakdown, "priceBreakdown");
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        this.f18588a = id10;
        this.f18589b = state;
        this.f18590c = offsetDateTime;
        this.d = airportCipId;
        this.e = cipName;
        this.f = cipLocation;
        this.f18591g = terminalName;
        this.f18592h = date;
        this.i = timeSlot;
        this.f18593j = i;
        this.k = priceBreakdown;
        this.f18594l = termsAndConditions;
        this.f18595m = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f18588a, dVar.f18588a) && this.f18589b == dVar.f18589b && Intrinsics.f(this.f18590c, dVar.f18590c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f18591g, dVar.f18591g) && Intrinsics.f(this.f18592h, dVar.f18592h) && Intrinsics.f(this.i, dVar.i) && this.f18593j == dVar.f18593j && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f18594l, dVar.f18594l) && this.f18595m == dVar.f18595m;
    }

    public final int hashCode() {
        int iHashCode = (this.f18589b.hashCode() + (this.f18588a.hashCode() * 31)) * 31;
        OffsetDateTime offsetDateTime = this.f18590c;
        int iHashCode2 = (this.f18594l.hashCode() + ((this.k.hashCode() + j6.a.b(this.f18593j, (this.i.hashCode() + y.a(p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f18591g), 31, this.f18592h)) * 31, 31)) * 31)) * 31;
        e eVar = this.f18595m;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }
}
