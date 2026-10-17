package yui;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f317028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f317029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f317030c;
    public final Data d;
    public final int e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AsftTimeSlot f317031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f317032h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bti.d f317033j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f317034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f317035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f317036n;

    public l(Data flightNumberRegex, Data asftAirport, Data asftTerminal, Data asftConfig, int i, LocalDate localDate, AsftTimeSlot asftTimeSlot, String str, String str2, bti.d dVar, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(flightNumberRegex, "flightNumberRegex");
        Intrinsics.checkNotNullParameter(asftAirport, "asftAirport");
        Intrinsics.checkNotNullParameter(asftTerminal, "asftTerminal");
        Intrinsics.checkNotNullParameter(asftConfig, "asftConfig");
        this.f317028a = flightNumberRegex;
        this.f317029b = asftAirport;
        this.f317030c = asftTerminal;
        this.d = asftConfig;
        this.e = i;
        this.f = localDate;
        this.f317031g = asftTimeSlot;
        this.f317032h = str;
        this.i = str2;
        this.f317033j = dVar;
        this.k = z;
        this.f317034l = z3;
        this.f317035m = z4;
        this.f317036n = z6;
    }

    public static l a(l lVar, Data data, Data data2, Data data3, Data data4, int i, LocalDate localDate, AsftTimeSlot asftTimeSlot, String str, String str2, bti.d dVar, boolean z, boolean z3, boolean z4, boolean z6, int i2) {
        Data flightNumberRegex = (i2 & 1) != 0 ? lVar.f317028a : data;
        Data asftAirport = (i2 & 2) != 0 ? lVar.f317029b : data2;
        Data asftTerminal = (i2 & 4) != 0 ? lVar.f317030c : data3;
        Data asftConfig = (i2 & 8) != 0 ? lVar.d : data4;
        int i3 = (i2 & 16) != 0 ? lVar.e : i;
        LocalDate localDate2 = (i2 & 32) != 0 ? lVar.f : localDate;
        AsftTimeSlot asftTimeSlot2 = (i2 & 64) != 0 ? lVar.f317031g : asftTimeSlot;
        String str3 = (i2 & 128) != 0 ? lVar.f317032h : str;
        String str4 = (i2 & 256) != 0 ? lVar.i : str2;
        bti.d dVar2 = (i2 & 512) != 0 ? lVar.f317033j : dVar;
        boolean z11 = (i2 & 1024) != 0 ? lVar.k : z;
        boolean z12 = (i2 & 2048) != 0 ? lVar.f317034l : z3;
        boolean z29 = (i2 & 4096) != 0 ? lVar.f317035m : z4;
        boolean z31 = (i2 & 8192) != 0 ? lVar.f317036n : z6;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(flightNumberRegex, "flightNumberRegex");
        Intrinsics.checkNotNullParameter(asftAirport, "asftAirport");
        Intrinsics.checkNotNullParameter(asftTerminal, "asftTerminal");
        Intrinsics.checkNotNullParameter(asftConfig, "asftConfig");
        return new l(flightNumberRegex, asftAirport, asftTerminal, asftConfig, i3, localDate2, asftTimeSlot2, str3, str4, dVar2, z11, z12, z29, z31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f317028a, lVar.f317028a) && Intrinsics.f(this.f317029b, lVar.f317029b) && Intrinsics.f(this.f317030c, lVar.f317030c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f317031g, lVar.f317031g) && Intrinsics.f(this.f317032h, lVar.f317032h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f317033j, lVar.f317033j) && this.k == lVar.k && this.f317034l == lVar.f317034l && this.f317035m == lVar.f317035m && this.f317036n == lVar.f317036n;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, kii.e.c(this.d, kii.e.c(this.f317030c, kii.e.c(this.f317029b, this.f317028a.hashCode() * 31, 31), 31), 31), 31);
        LocalDate localDate = this.f;
        int iHashCode = (iB + (localDate == null ? 0 : localDate.hashCode())) * 31;
        AsftTimeSlot asftTimeSlot = this.f317031g;
        int iHashCode2 = (iHashCode + (asftTimeSlot == null ? 0 : asftTimeSlot.hashCode())) * 31;
        String str = this.f317032h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        bti.d dVar = this.f317033j;
        return Boolean.hashCode(this.f317036n) + j6.a.c(j6.a.c(j6.a.c((iHashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.k), 31, this.f317034l), 31, this.f317035m);
    }
}
