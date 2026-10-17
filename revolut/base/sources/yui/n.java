package yui;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTermsAndConditions;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f317040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f317041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsftTimeSlot f317042c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f317043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f317044h;
    public final AsftTermsAndConditions i;

    public n(int i, LocalDate selectedFlightDate, AsftTimeSlot selectedTimeSlot, boolean z, boolean z3, String str, String str2, boolean z4, AsftTermsAndConditions asftTermsAndConditions) {
        Intrinsics.checkNotNullParameter(selectedFlightDate, "selectedFlightDate");
        Intrinsics.checkNotNullParameter(selectedTimeSlot, "selectedTimeSlot");
        this.f317040a = i;
        this.f317041b = selectedFlightDate;
        this.f317042c = selectedTimeSlot;
        this.d = z;
        this.e = z3;
        this.f = str;
        this.f317043g = str2;
        this.f317044h = z4;
        this.i = asftTermsAndConditions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f317040a == nVar.f317040a && Intrinsics.f(this.f317041b, nVar.f317041b) && Intrinsics.f(this.f317042c, nVar.f317042c) && this.d == nVar.d && this.e == nVar.e && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f317043g, nVar.f317043g) && this.f317044h == nVar.f317044h && Intrinsics.f(this.i, nVar.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f317042c.hashCode() + wp5.y.a(Integer.hashCode(this.f317040a) * 31, 31, this.f317041b)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f317043g;
        int iC2 = j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f317044h);
        AsftTermsAndConditions asftTermsAndConditions = this.i;
        return iC2 + (asftTermsAndConditions != null ? asftTermsAndConditions.hashCode() : 0);
    }
}
