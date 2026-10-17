package com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassRefundBreakdown;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Home", "PassDetails", "Booking", "ManageBooking", "CancelBooking", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step$Booking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step$CancelBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step$Home;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step$ManageBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step$PassDetails;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AsftMainFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step$Booking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Booking extends AsftMainFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Booking f98759a = new Booking();

        @NotNull
        public static final Parcelable.Creator<Booking> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Booking.f98759a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Booking[i];
            }
        }

        private Booking() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step$CancelBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelBooking extends AsftMainFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CancelBooking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f98761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OffsetDateTime f98762c;
        public final AsftPassRefundBreakdown d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelBooking(parcel.readString(), parcel.readString(), (OffsetDateTime) parcel.readSerializable(), (AsftPassRefundBreakdown) parcel.readParcelable(CancelBooking.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelBooking[i];
            }
        }

        public CancelBooking(String passId, String airportDescription, OffsetDateTime cancellationUntilDate, AsftPassRefundBreakdown refundBreakdown) {
            Intrinsics.checkNotNullParameter(passId, "passId");
            Intrinsics.checkNotNullParameter(airportDescription, "airportDescription");
            Intrinsics.checkNotNullParameter(cancellationUntilDate, "cancellationUntilDate");
            Intrinsics.checkNotNullParameter(refundBreakdown, "refundBreakdown");
            this.f98760a = passId;
            this.f98761b = airportDescription;
            this.f98762c = cancellationUntilDate;
            this.d = refundBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancelBooking)) {
                return false;
            }
            CancelBooking cancelBooking = (CancelBooking) obj2;
            return Intrinsics.f(this.f98760a, cancelBooking.f98760a) && Intrinsics.f(this.f98761b, cancelBooking.f98761b) && Intrinsics.f(this.f98762c, cancelBooking.f98762c) && Intrinsics.f(this.d, cancelBooking.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f98762c.hashCode() + p.a.c(this.f98760a.hashCode() * 31, 31, this.f98761b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98760a);
            dest.writeString(this.f98761b);
            dest.writeSerializable(this.f98762c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step$ManageBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageBooking extends AsftMainFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ManageBooking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AsftManageBookingPayload f98764a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManageBooking(AsftManageBookingPayload.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageBooking[i];
            }
        }

        public ManageBooking(AsftManageBookingPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f98764a = payload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ManageBooking) && Intrinsics.f(this.f98764a, ((ManageBooking) obj2).f98764a);
        }

        public final int hashCode() {
            return this.f98764a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f98764a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step$PassDetails;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassDetails extends AsftMainFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PassDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AsftPass f98766b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PassDetails(parcel.readString(), (AsftPass) parcel.readParcelable(PassDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassDetails[i];
            }
        }

        public PassDetails(String passId, AsftPass asftPass) {
            Intrinsics.checkNotNullParameter(passId, "passId");
            this.f98765a = passId;
            this.f98766b = asftPass;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PassDetails)) {
                return false;
            }
            PassDetails passDetails = (PassDetails) obj2;
            return Intrinsics.f(this.f98765a, passDetails.f98765a) && Intrinsics.f(this.f98766b, passDetails.f98766b);
        }

        public final int hashCode() {
            int iHashCode = this.f98765a.hashCode() * 31;
            AsftPass asftPass = this.f98766b;
            return iHashCode + (asftPass == null ? 0 : asftPass.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98765a);
            dest.writeParcelable(this.f98766b, i);
        }
    }

    private AsftMainFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step$Home;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/main/AsftMainFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends AsftMainFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AsftPass f98763a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home((AsftPass) parcel.readParcelable(Home.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home(AsftPass asftPass) {
            this.f98763a = asftPass;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && Intrinsics.f(this.f98763a, ((Home) obj2).f98763a);
        }

        public final int hashCode() {
            AsftPass asftPass = this.f98763a;
            if (asftPass == null) {
                return 0;
            }
            return asftPass.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98763a, i);
        }

        public Home() {
            this(null);
        }
    }
}
