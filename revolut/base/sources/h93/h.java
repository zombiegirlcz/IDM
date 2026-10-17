package h93;

import com.revolut.feature.address.models.Address;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f150132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f150133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150134c;
    public final String d;
    public final Boolean e;
    public final Address f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f150135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f150136h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f150137j;
    public final LocalDate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LocalDate f150138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LocalDate f150139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f150140n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f150141p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f150142q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f150143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f150144s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f150145t;

    public h(g status, s sVar, String str, String str2, Boolean bool, Address address, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, f fVar, LocalDate localDate4, LocalDate localDate5, LocalDate localDate6, String str3, String str4, String str5, boolean z, e courierStatus, String str6, String str7) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(courierStatus, "courierStatus");
        this.f150132a = status;
        this.f150133b = sVar;
        this.f150134c = str;
        this.d = str2;
        this.e = bool;
        this.f = address;
        this.f150135g = localDate;
        this.f150136h = localDate2;
        this.i = localDate3;
        this.f150137j = fVar;
        this.k = localDate4;
        this.f150138l = localDate5;
        this.f150139m = localDate6;
        this.f150140n = str3;
        this.o = str4;
        this.f150141p = str5;
        this.f150142q = z;
        this.f150143r = courierStatus;
        this.f150144s = str6;
        this.f150145t = str7;
    }

    public final LocalDate a(boolean z) {
        boolean zF = Intrinsics.f(this.f150140n, "PRIORITY");
        LocalDate localDate = null;
        f fVar = this.f150137j;
        if (zF && z) {
            if (fVar != null) {
                localDate = fVar.f150108a;
            }
        } else if (fVar != null) {
            localDate = fVar.f150109b;
        }
        return localDate == null ? this.i : localDate;
    }

    public final LocalDate b() {
        return this.i;
    }

    public final f c() {
        return this.f150137j;
    }

    public final g d() {
        return this.f150132a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f150132a == hVar.f150132a && this.f150133b == hVar.f150133b && Intrinsics.f(this.f150134c, hVar.f150134c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f150135g, hVar.f150135g) && Intrinsics.f(this.f150136h, hVar.f150136h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f150137j, hVar.f150137j) && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f150138l, hVar.f150138l) && Intrinsics.f(this.f150139m, hVar.f150139m) && Intrinsics.f(this.f150140n, hVar.f150140n) && Intrinsics.f(this.o, hVar.o) && Intrinsics.f(this.f150141p, hVar.f150141p) && this.f150142q == hVar.f150142q && this.f150143r == hVar.f150143r && Intrinsics.f(this.f150144s, hVar.f150144s) && Intrinsics.f(this.f150145t, hVar.f150145t);
    }

    public final int hashCode() {
        int iHashCode = this.f150132a.hashCode() * 31;
        s sVar = this.f150133b;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str = this.f150134c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Address address = this.f;
        int iHashCode6 = (iHashCode5 + (address == null ? 0 : address.hashCode())) * 31;
        LocalDate localDate = this.f150135g;
        int iHashCode7 = (iHashCode6 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f150136h;
        int iHashCode8 = (iHashCode7 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.i;
        int iHashCode9 = (iHashCode8 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        f fVar = this.f150137j;
        int iHashCode10 = (iHashCode9 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        LocalDate localDate4 = this.k;
        int iHashCode11 = (iHashCode10 + (localDate4 == null ? 0 : localDate4.hashCode())) * 31;
        LocalDate localDate5 = this.f150138l;
        int iHashCode12 = (iHashCode11 + (localDate5 == null ? 0 : localDate5.hashCode())) * 31;
        LocalDate localDate6 = this.f150139m;
        int iHashCode13 = (iHashCode12 + (localDate6 == null ? 0 : localDate6.hashCode())) * 31;
        String str3 = this.f150140n;
        int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        int iHashCode15 = (iHashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f150141p;
        int iHashCode16 = (this.f150143r.hashCode() + j6.a.c((iHashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f150142q)) * 31;
        String str6 = this.f150144s;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f150145t;
        return iHashCode17 + (str7 != null ? str7.hashCode() : 0);
    }
}
