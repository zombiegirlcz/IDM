package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/legacy/AsftPassDetailsLegacyScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ManageBooking", "CancelBooking", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/legacy/AsftPassDetailsLegacyScreenContract$ModalStep$CancelBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/legacy/AsftPassDetailsLegacyScreenContract$ModalStep$ManageBooking;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AsftPassDetailsLegacyScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/legacy/AsftPassDetailsLegacyScreenContract$ModalStep$CancelBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/legacy/AsftPassDetailsLegacyScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelBooking implements AsftPassDetailsLegacyScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancelBooking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AsftCancelBookingScreenContract$InputData f98857a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelBooking(AsftCancelBookingScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelBooking[i];
            }
        }

        public CancelBooking(AsftCancelBookingScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f98857a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelBooking) && Intrinsics.f(this.f98857a, ((CancelBooking) obj2).f98857a);
        }

        public final int hashCode() {
            return this.f98857a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f98857a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/legacy/AsftPassDetailsLegacyScreenContract$ModalStep$ManageBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/legacy/AsftPassDetailsLegacyScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageBooking implements AsftPassDetailsLegacyScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ManageBooking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AsftManageBookingPayload f98858a;

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
            this.f98858a = payload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ManageBooking) && Intrinsics.f(this.f98858a, ((ManageBooking) obj2).f98858a);
        }

        public final int hashCode() {
            return this.f98858a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f98858a.writeToParcel(dest, i);
        }
    }
}
