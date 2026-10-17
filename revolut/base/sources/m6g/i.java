package m6g;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f203093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f203094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f203095c;
    public final Data d;

    public i(LocalDate flightDate, List passengerForms, Data userData, Data offerDetailsData) {
        Intrinsics.checkNotNullParameter(flightDate, "flightDate");
        Intrinsics.checkNotNullParameter(passengerForms, "passengerForms");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(offerDetailsData, "offerDetailsData");
        this.f203093a = flightDate;
        this.f203094b = passengerForms;
        this.f203095c = userData;
        this.d = offerDetailsData;
    }

    public static i a(i iVar, ArrayList passengerForms, Data userData, Data offerDetailsData, int i) {
        LocalDate flightDate = iVar.f203093a;
        if ((i & 4) != 0) {
            userData = iVar.f203095c;
        }
        if ((i & 8) != 0) {
            offerDetailsData = iVar.d;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(flightDate, "flightDate");
        Intrinsics.checkNotNullParameter(passengerForms, "passengerForms");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(offerDetailsData, "offerDetailsData");
        return new i(flightDate, passengerForms, userData, offerDetailsData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f203093a, iVar.f203093a) && Intrinsics.f(this.f203094b, iVar.f203094b) && Intrinsics.f(this.f203095c, iVar.f203095c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f203095c, p.a.d(this.f203093a.hashCode() * 31, 31, this.f203094b), 31);
    }
}
