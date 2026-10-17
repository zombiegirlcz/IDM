package com.revolut.feature.travel.hotels.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "BookingDetails", "Checkout", "RoomSelection", "Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsFeatureConfig$BookingDetails;", "Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsFeatureConfig$Checkout;", "Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsFeatureConfig$RoomSelection;", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelHotelsFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsFeatureConfig$BookingDetails;", "Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingDetails extends TravelHotelsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<BookingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93625b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookingDetails(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingDetails[i];
            }
        }

        public BookingDetails(String bookingId, boolean z) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f93624a = bookingId;
            this.f93625b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BookingDetails)) {
                return false;
            }
            BookingDetails bookingDetails = (BookingDetails) obj2;
            return Intrinsics.f(this.f93624a, bookingDetails.f93624a) && this.f93625b == bookingDetails.f93625b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f93625b) + (this.f93624a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93624a);
            dest.writeInt(this.f93625b ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsFeatureConfig$Checkout;", "Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsFeatureConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout extends TravelHotelsFeatureConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f93627b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(String draftId, String propertyId) {
            Intrinsics.checkNotNullParameter(draftId, "draftId");
            Intrinsics.checkNotNullParameter(propertyId, "propertyId");
            this.f93626a = draftId;
            this.f93627b = propertyId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Checkout)) {
                return false;
            }
            Checkout checkout = (Checkout) obj2;
            return Intrinsics.f(this.f93626a, checkout.f93626a) && Intrinsics.f(this.f93627b, checkout.f93627b);
        }

        public final int hashCode() {
            return this.f93627b.hashCode() + (this.f93626a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93626a);
            dest.writeString(this.f93627b);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsFeatureConfig$RoomSelection;", "Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsFeatureConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoomSelection extends TravelHotelsFeatureConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RoomSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f93629b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoomSelection(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoomSelection[i];
            }
        }

        public RoomSelection(String draftId, String propertyId) {
            Intrinsics.checkNotNullParameter(draftId, "draftId");
            Intrinsics.checkNotNullParameter(propertyId, "propertyId");
            this.f93628a = draftId;
            this.f93629b = propertyId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RoomSelection)) {
                return false;
            }
            RoomSelection roomSelection = (RoomSelection) obj2;
            return Intrinsics.f(this.f93628a, roomSelection.f93628a) && Intrinsics.f(this.f93629b, roomSelection.f93629b);
        }

        public final int hashCode() {
            return this.f93629b.hashCode() + (this.f93628a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93628a);
            dest.writeString(this.f93629b);
        }
    }

    private TravelHotelsFeatureConfig() {
    }
}
