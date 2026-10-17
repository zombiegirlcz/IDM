package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/BookingPreviewItineraryDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BookingPreviewItineraryDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BookingPreviewItineraryDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93448c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BookingPreviewItineraryDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BookingPreviewItineraryDetails[i];
        }
    }

    public BookingPreviewItineraryDetails(String destinationImageUrl, String originCityName, String destinationCityName, boolean z) {
        Intrinsics.checkNotNullParameter(destinationImageUrl, "destinationImageUrl");
        Intrinsics.checkNotNullParameter(originCityName, "originCityName");
        Intrinsics.checkNotNullParameter(destinationCityName, "destinationCityName");
        this.f93446a = destinationImageUrl;
        this.f93447b = originCityName;
        this.f93448c = destinationCityName;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BookingPreviewItineraryDetails)) {
            return false;
        }
        BookingPreviewItineraryDetails bookingPreviewItineraryDetails = (BookingPreviewItineraryDetails) obj2;
        return Intrinsics.f(this.f93446a, bookingPreviewItineraryDetails.f93446a) && Intrinsics.f(this.f93447b, bookingPreviewItineraryDetails.f93447b) && Intrinsics.f(this.f93448c, bookingPreviewItineraryDetails.f93448c) && this.d == bookingPreviewItineraryDetails.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f93446a.hashCode() * 31, 31, this.f93447b), 31, this.f93448c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93446a);
        dest.writeString(this.f93447b);
        dest.writeString(this.f93448c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
