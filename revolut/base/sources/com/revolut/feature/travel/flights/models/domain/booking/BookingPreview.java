package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/BookingPreview;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BookingPreview implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BookingPreview> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BookingPreviewPayment f93444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OfferDetails f93445c;
    public final TravelFlightsLegalAcceptance d;
    public final List e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            BookingPreviewPayment bookingPreviewPaymentCreateFromParcel = BookingPreviewPayment.CREATOR.createFromParcel(parcel);
            OfferDetails offerDetailsCreateFromParcel = OfferDetails.CREATOR.createFromParcel(parcel);
            TravelFlightsLegalAcceptance travelFlightsLegalAcceptanceCreateFromParcel = TravelFlightsLegalAcceptance.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(h.valueOf(parcel.readString()));
            }
            return new BookingPreview(string, bookingPreviewPaymentCreateFromParcel, offerDetailsCreateFromParcel, travelFlightsLegalAcceptanceCreateFromParcel, arrayList, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BookingPreview[i];
        }
    }

    public BookingPreview(String bookingToken, BookingPreviewPayment payment, OfferDetails offerDetails, TravelFlightsLegalAcceptance legalAcceptance, List notifications, List carrierCodes) {
        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(offerDetails, "offerDetails");
        Intrinsics.checkNotNullParameter(legalAcceptance, "legalAcceptance");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        Intrinsics.checkNotNullParameter(carrierCodes, "carrierCodes");
        this.f93443a = bookingToken;
        this.f93444b = payment;
        this.f93445c = offerDetails;
        this.d = legalAcceptance;
        this.e = notifications;
        this.f = carrierCodes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BookingPreview)) {
            return false;
        }
        BookingPreview bookingPreview = (BookingPreview) obj2;
        return Intrinsics.f(this.f93443a, bookingPreview.f93443a) && Intrinsics.f(this.f93444b, bookingPreview.f93444b) && Intrinsics.f(this.f93445c, bookingPreview.f93445c) && Intrinsics.f(this.d, bookingPreview.d) && Intrinsics.f(this.e, bookingPreview.e) && Intrinsics.f(this.f, bookingPreview.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d((this.d.hashCode() + ((this.f93445c.hashCode() + ((this.f93444b.hashCode() + (this.f93443a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93443a);
        this.f93444b.writeToParcel(dest, i);
        this.f93445c.writeToParcel(dest, i);
        this.d.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            dest.writeString(((h) itV.next()).name());
        }
        dest.writeStringList(this.f);
    }
}
