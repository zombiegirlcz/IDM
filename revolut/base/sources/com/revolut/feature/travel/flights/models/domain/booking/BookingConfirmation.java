package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/BookingConfirmation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BookingConfirmation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BookingConfirmation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93434b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BookingConfirmation(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BookingConfirmation[i];
        }
    }

    public BookingConfirmation(String bookingId, String revPayOrderToken) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(revPayOrderToken, "revPayOrderToken");
        this.f93433a = bookingId;
        this.f93434b = revPayOrderToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BookingConfirmation)) {
            return false;
        }
        BookingConfirmation bookingConfirmation = (BookingConfirmation) obj2;
        return Intrinsics.f(this.f93433a, bookingConfirmation.f93433a) && Intrinsics.f(this.f93434b, bookingConfirmation.f93434b);
    }

    public final int hashCode() {
        return this.f93434b.hashCode() + (this.f93433a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93433a);
        dest.writeString(this.f93434b);
    }
}
