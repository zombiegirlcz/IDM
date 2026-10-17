package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationContract$CancellationConfirmationData;
import com.revolut.feature_travel_hotels_models.booking.details.CancellationRefund;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qbg.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Confirmation", "NetRefund", "PointsReversal", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$ModalStep$Confirmation;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$ModalStep$NetRefund;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$ModalStep$PointsReversal;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsCancellationPolicyScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$ModalStep$Confirmation;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation implements TravelHotelsCancellationPolicyScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f93871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelHotelsCancellationConfirmationContract$CancellationConfirmationData f93872c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(parcel.readString(), d.valueOf(parcel.readString()), TravelHotelsCancellationConfirmationContract$CancellationConfirmationData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(String bookingId, d variant, TravelHotelsCancellationConfirmationContract$CancellationConfirmationData confirmationData) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(confirmationData, "confirmationData");
            this.f93870a = bookingId;
            this.f93871b = variant;
            this.f93872c = confirmationData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f93870a, confirmation.f93870a) && this.f93871b == confirmation.f93871b && Intrinsics.f(this.f93872c, confirmation.f93872c);
        }

        public final int hashCode() {
            return this.f93872c.hashCode() + ((this.f93871b.hashCode() + (this.f93870a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93870a);
            dest.writeString(this.f93871b.name());
            this.f93872c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$ModalStep$NetRefund;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NetRefund implements TravelHotelsCancellationPolicyScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<NetRefund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ubg.d f93873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellationRefund f93874b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NetRefund((CancellationRefund) parcel.readParcelable(NetRefund.class.getClassLoader()), ubg.d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NetRefund[i];
            }
        }

        public NetRefund(CancellationRefund cancellationRefund, ubg.d type) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(cancellationRefund, "cancellationRefund");
            this.f93873a = type;
            this.f93874b = cancellationRefund;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NetRefund)) {
                return false;
            }
            NetRefund netRefund = (NetRefund) obj2;
            return this.f93873a == netRefund.f93873a && Intrinsics.f(this.f93874b, netRefund.f93874b);
        }

        public final int hashCode() {
            return this.f93874b.hashCode() + (this.f93873a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93873a.name());
            dest.writeParcelable(this.f93874b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$ModalStep$PointsReversal;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$ModalStep;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PointsReversal implements TravelHotelsCancellationPolicyScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PointsReversal f93875a = new PointsReversal();

        @NotNull
        public static final Parcelable.Creator<PointsReversal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PointsReversal.f93875a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PointsReversal[i];
            }
        }

        private PointsReversal() {
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
}
