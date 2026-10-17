package q5g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewParams;
import com.revolut.feature.travel.flights.models.domain.payment.PointsRedeemOption;
import com.revolut.feature.travel.flights.models.domain.search.TravelFlightsItinerary;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingPreviewParams f242386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelFlightsItinerary f242387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f242388c;
    public final PointsRedeemOption d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f242389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f242390h;
    public final Set i;

    public s(BookingPreviewParams bookingPreviewParams, TravelFlightsItinerary travelFlightsItinerary, Data bookingPreview, PointsRedeemOption pointsRedeemOption, Data calculatedTotalPrice, Data payment, Data revPointsPill, boolean z, Set expandedTravellers) {
        Intrinsics.checkNotNullParameter(bookingPreviewParams, "bookingPreviewParams");
        Intrinsics.checkNotNullParameter(bookingPreview, "bookingPreview");
        Intrinsics.checkNotNullParameter(calculatedTotalPrice, "calculatedTotalPrice");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(revPointsPill, "revPointsPill");
        Intrinsics.checkNotNullParameter(expandedTravellers, "expandedTravellers");
        this.f242386a = bookingPreviewParams;
        this.f242387b = travelFlightsItinerary;
        this.f242388c = bookingPreview;
        this.d = pointsRedeemOption;
        this.e = calculatedTotalPrice;
        this.f = payment;
        this.f242389g = revPointsPill;
        this.f242390h = z;
        this.i = expandedTravellers;
    }

    public static s a(s sVar, BookingPreviewParams bookingPreviewParams, Data data, PointsRedeemOption pointsRedeemOption, Data data2, Data data3, Data data4, boolean z, Set set, int i) {
        if ((i & 1) != 0) {
            bookingPreviewParams = sVar.f242386a;
        }
        BookingPreviewParams bookingPreviewParams2 = bookingPreviewParams;
        TravelFlightsItinerary travelFlightsItinerary = sVar.f242387b;
        if ((i & 4) != 0) {
            data = sVar.f242388c;
        }
        Data bookingPreview = data;
        if ((i & 8) != 0) {
            pointsRedeemOption = sVar.d;
        }
        PointsRedeemOption pointsRedeemOption2 = pointsRedeemOption;
        if ((i & 16) != 0) {
            data2 = sVar.e;
        }
        Data calculatedTotalPrice = data2;
        if ((i & 32) != 0) {
            data3 = sVar.f;
        }
        Data payment = data3;
        Data revPointsPill = (i & 64) != 0 ? sVar.f242389g : data4;
        boolean z3 = (i & 128) != 0 ? sVar.f242390h : z;
        Set expandedTravellers = (i & 256) != 0 ? sVar.i : set;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(bookingPreviewParams2, "bookingPreviewParams");
        Intrinsics.checkNotNullParameter(bookingPreview, "bookingPreview");
        Intrinsics.checkNotNullParameter(calculatedTotalPrice, "calculatedTotalPrice");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(revPointsPill, "revPointsPill");
        Intrinsics.checkNotNullParameter(expandedTravellers, "expandedTravellers");
        return new s(bookingPreviewParams2, travelFlightsItinerary, bookingPreview, pointsRedeemOption2, calculatedTotalPrice, payment, revPointsPill, z3, expandedTravellers);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f242386a, sVar.f242386a) && Intrinsics.f(this.f242387b, sVar.f242387b) && Intrinsics.f(this.f242388c, sVar.f242388c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f242389g, sVar.f242389g) && this.f242390h == sVar.f242390h && Intrinsics.f(this.i, sVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f242386a.hashCode() * 31;
        TravelFlightsItinerary travelFlightsItinerary = this.f242387b;
        int iC = kii.e.c(this.f242388c, (iHashCode + (travelFlightsItinerary == null ? 0 : travelFlightsItinerary.hashCode())) * 31, 31);
        PointsRedeemOption pointsRedeemOption = this.d;
        return this.i.hashCode() + j6.a.c(kii.e.c(this.f242389g, kii.e.c(this.f, kii.e.c(this.e, (iC + (pointsRedeemOption != null ? pointsRedeemOption.hashCode() : 0)) * 31, 31), 31), 31), 31, this.f242390h);
    }
}
