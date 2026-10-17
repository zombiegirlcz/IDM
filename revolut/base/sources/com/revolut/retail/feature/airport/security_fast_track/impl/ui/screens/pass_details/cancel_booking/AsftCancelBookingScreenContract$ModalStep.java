package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/cancel_booking/AsftCancelBookingScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevPointsInfo", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/cancel_booking/AsftCancelBookingScreenContract$ModalStep$RevPointsInfo;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AsftCancelBookingScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/cancel_booking/AsftCancelBookingScreenContract$ModalStep$RevPointsInfo;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/cancel_booking/AsftCancelBookingScreenContract$ModalStep;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsInfo implements AsftCancelBookingScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsInfo f98852a = new RevPointsInfo();

        @NotNull
        public static final Parcelable.Creator<RevPointsInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsInfo.f98852a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsInfo[i];
            }
        }

        private RevPointsInfo() {
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
