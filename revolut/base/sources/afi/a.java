package afi;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oc.c;
import wp5.y;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HotelsProperty f4101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f4102c;
    public final LocalDate d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4104h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f4105j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4106l;

    public a(String draftId, HotelsProperty hotelsProperty, LocalDate checkInDate, LocalDate checkOutDate, List roomsOccupancySelection, List bedOptionsSelection, String firstName, String lastName, String phone, String email, String specialRequest) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        Intrinsics.checkNotNullParameter(checkInDate, "checkInDate");
        Intrinsics.checkNotNullParameter(checkOutDate, "checkOutDate");
        Intrinsics.checkNotNullParameter(roomsOccupancySelection, "roomsOccupancySelection");
        Intrinsics.checkNotNullParameter(bedOptionsSelection, "bedOptionsSelection");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(specialRequest, "specialRequest");
        this.f4100a = draftId;
        this.f4101b = hotelsProperty;
        this.f4102c = checkInDate;
        this.d = checkOutDate;
        this.e = roomsOccupancySelection;
        this.f = bedOptionsSelection;
        this.f4103g = firstName;
        this.f4104h = lastName;
        this.i = phone;
        this.f4105j = email;
        this.k = specialRequest;
        this.f4106l = (int) c.h(checkInDate, checkOutDate);
    }

    public static a a(a aVar, List list, String str, String str2, String str3, String str4, String str5, int i) {
        String draftId = aVar.f4100a;
        HotelsProperty hotelsProperty = aVar.f4101b;
        LocalDate checkInDate = aVar.f4102c;
        LocalDate checkOutDate = aVar.d;
        List roomsOccupancySelection = aVar.e;
        if ((i & 32) != 0) {
            list = aVar.f;
        }
        List bedOptionsSelection = list;
        if ((i & 64) != 0) {
            str = aVar.f4103g;
        }
        String firstName = str;
        String lastName = (i & 128) != 0 ? aVar.f4104h : str2;
        String phone = (i & 256) != 0 ? aVar.i : str3;
        String email = (i & 512) != 0 ? aVar.f4105j : str4;
        String specialRequest = (i & 1024) != 0 ? aVar.k : str5;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        Intrinsics.checkNotNullParameter(checkInDate, "checkInDate");
        Intrinsics.checkNotNullParameter(checkOutDate, "checkOutDate");
        Intrinsics.checkNotNullParameter(roomsOccupancySelection, "roomsOccupancySelection");
        Intrinsics.checkNotNullParameter(bedOptionsSelection, "bedOptionsSelection");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(specialRequest, "specialRequest");
        return new a(draftId, hotelsProperty, checkInDate, checkOutDate, roomsOccupancySelection, bedOptionsSelection, firstName, lastName, phone, email, specialRequest);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f4100a, aVar.f4100a) && Intrinsics.f(this.f4101b, aVar.f4101b) && Intrinsics.f(this.f4102c, aVar.f4102c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f4103g, aVar.f4103g) && Intrinsics.f(this.f4104h, aVar.f4104h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f4105j, aVar.f4105j) && Intrinsics.f(this.k, aVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.d(p.a.d(y.a(y.a((this.f4101b.hashCode() + (this.f4100a.hashCode() * 31)) * 31, 31, this.f4102c), 31, this.d), 31, this.e), 31, this.f), 31, this.f4103g), 31, this.f4104h), 31, this.i), 31, this.f4105j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, HotelsProperty hotelsProperty, LocalDate localDate, LocalDate localDate2, List list, List list2, String str2, String str3, String str4, String str5, int i) {
        String str6;
        String str7;
        String str8;
        String str9;
        List list3 = (i & 32) != 0 ? f0.f322471a : list2;
        if ((i & 64) != 0) {
            m70.a.c(t0.f186434a);
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 128) != 0) {
            m70.a.c(t0.f186434a);
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 256) != 0) {
            m70.a.c(t0.f186434a);
            str8 = "";
        } else {
            str8 = str4;
        }
        if ((i & 512) != 0) {
            m70.a.c(t0.f186434a);
            str9 = "";
        } else {
            str9 = str5;
        }
        m70.a.c(t0.f186434a);
        this(str, hotelsProperty, localDate, localDate2, list, list3, str6, str7, str8, str9, "");
    }
}
