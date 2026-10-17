package com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/widget/AsftWidgetFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "PassAvailableSoon", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/widget/AsftWidgetFlowContract$InputData$PassAvailableSoon;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AsftWidgetFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/widget/AsftWidgetFlowContract$InputData$PassAvailableSoon;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/widget/AsftWidgetFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassAvailableSoon extends AsftWidgetFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PassAvailableSoon> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AsftManageBookingPayload f98794b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PassAvailableSoon(parcel.readInt(), AsftManageBookingPayload.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassAvailableSoon[i];
            }
        }

        public PassAvailableSoon(int i, AsftManageBookingPayload manageBookingPayload) {
            Intrinsics.checkNotNullParameter(manageBookingPayload, "manageBookingPayload");
            this.f98793a = i;
            this.f98794b = manageBookingPayload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PassAvailableSoon)) {
                return false;
            }
            PassAvailableSoon passAvailableSoon = (PassAvailableSoon) obj2;
            return this.f98793a == passAvailableSoon.f98793a && Intrinsics.f(this.f98794b, passAvailableSoon.f98794b);
        }

        public final int hashCode() {
            return this.f98794b.hashCode() + (Integer.hashCode(this.f98793a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98793a);
            this.f98794b.writeToParcel(dest, i);
        }
    }

    private AsftWidgetFlowContract$InputData() {
    }
}
