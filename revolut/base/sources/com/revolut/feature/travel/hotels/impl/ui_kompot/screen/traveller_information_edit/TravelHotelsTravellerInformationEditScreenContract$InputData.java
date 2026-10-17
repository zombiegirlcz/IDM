package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/traveller_information_edit/TravelHotelsTravellerInformationEditScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Draft", "Booking", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/traveller_information_edit/TravelHotelsTravellerInformationEditScreenContract$InputData$Booking;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/traveller_information_edit/TravelHotelsTravellerInformationEditScreenContract$InputData$Draft;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelHotelsTravellerInformationEditScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/traveller_information_edit/TravelHotelsTravellerInformationEditScreenContract$InputData$Booking;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/traveller_information_edit/TravelHotelsTravellerInformationEditScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Booking extends TravelHotelsTravellerInformationEditScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Booking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94070a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Booking(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Booking[i];
            }
        }

        public Booking(String bookingId) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f94070a = bookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Booking) && Intrinsics.f(this.f94070a, ((Booking) obj2).f94070a);
        }

        public final int hashCode() {
            return this.f94070a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94070a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/traveller_information_edit/TravelHotelsTravellerInformationEditScreenContract$InputData$Draft;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/traveller_information_edit/TravelHotelsTravellerInformationEditScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Draft extends TravelHotelsTravellerInformationEditScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Draft> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94071a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Draft(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Draft[i];
            }
        }

        public Draft(String draftId) {
            Intrinsics.checkNotNullParameter(draftId, "draftId");
            this.f94071a = draftId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Draft) && Intrinsics.f(this.f94071a, ((Draft) obj2).f94071a);
        }

        public final int hashCode() {
            return this.f94071a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94071a);
        }
    }

    private TravelHotelsTravellerInformationEditScreenContract$InputData() {
    }
}
