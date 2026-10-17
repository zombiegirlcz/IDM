package com.revolut.feature.travel.flights.impl.ui.screen.checkin;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/checkin/TravelFlightsCheckInScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CheckInDetails", "SelfTransfer", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkin/TravelFlightsCheckInScreenContract$ModalStep$CheckInDetails;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkin/TravelFlightsCheckInScreenContract$ModalStep$SelfTransfer;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelFlightsCheckInScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkin/TravelFlightsCheckInScreenContract$ModalStep$CheckInDetails;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkin/TravelFlightsCheckInScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckInDetails extends TravelFlightsCheckInScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CheckInDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93288b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckInDetails(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckInDetails[i];
            }
        }

        public CheckInDetails(String bookingId, int i) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f93287a = bookingId;
            this.f93288b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CheckInDetails)) {
                return false;
            }
            CheckInDetails checkInDetails = (CheckInDetails) obj2;
            return Intrinsics.f(this.f93287a, checkInDetails.f93287a) && this.f93288b == checkInDetails.f93288b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f93288b) + (this.f93287a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93287a);
            dest.writeInt(this.f93288b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkin/TravelFlightsCheckInScreenContract$ModalStep$SelfTransfer;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/checkin/TravelFlightsCheckInScreenContract$ModalStep;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelfTransfer extends TravelFlightsCheckInScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelfTransfer f93289a = new SelfTransfer();

        @NotNull
        public static final Parcelable.Creator<SelfTransfer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelfTransfer.f93289a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelfTransfer[i];
            }
        }

        private SelfTransfer() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private TravelFlightsCheckInScreenContract$ModalStep() {
    }
}
