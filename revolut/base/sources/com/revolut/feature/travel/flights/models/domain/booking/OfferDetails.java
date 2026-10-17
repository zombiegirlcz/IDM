package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/OfferDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OfferDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OfferDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f93463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BookingPreviewItineraryDetails f93464c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BookingDetailsTraveller.CREATOR, parcel, arrayList, iA, 1);
            }
            return new OfferDetails(string, arrayList, parcel.readInt() == 0 ? null : BookingPreviewItineraryDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OfferDetails[i];
        }
    }

    public OfferDetails(String fareRules, ArrayList travellers, BookingPreviewItineraryDetails bookingPreviewItineraryDetails) {
        Intrinsics.checkNotNullParameter(fareRules, "fareRules");
        Intrinsics.checkNotNullParameter(travellers, "travellers");
        this.f93462a = fareRules;
        this.f93463b = travellers;
        this.f93464c = bookingPreviewItineraryDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OfferDetails)) {
            return false;
        }
        OfferDetails offerDetails = (OfferDetails) obj2;
        return Intrinsics.f(this.f93462a, offerDetails.f93462a) && this.f93463b.equals(offerDetails.f93463b) && Intrinsics.f(this.f93464c, offerDetails.f93464c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f93463b, this.f93462a.hashCode() * 31, 31);
        BookingPreviewItineraryDetails bookingPreviewItineraryDetails = this.f93464c;
        return iB + (bookingPreviewItineraryDetails == null ? 0 : bookingPreviewItineraryDetails.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93462a);
        Iterator itY = j6.a.y(this.f93463b, dest);
        while (itY.hasNext()) {
            ((BookingDetailsTraveller) itY.next()).writeToParcel(dest, i);
        }
        BookingPreviewItineraryDetails bookingPreviewItineraryDetails = this.f93464c;
        if (bookingPreviewItineraryDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bookingPreviewItineraryDetails.writeToParcel(dest, i);
        }
    }
}
