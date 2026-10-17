package com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/flows/pass_booking/AsftPassBookingFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftPassBookingFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<AsftPassBookingFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftPassBookingFlowContract$UserBookingDetails f98773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98775c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftPassBookingFlowContract$State(parcel.readInt() == 0 ? null : AsftPassBookingFlowContract$UserBookingDetails.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftPassBookingFlowContract$State[i];
        }
    }

    public AsftPassBookingFlowContract$State(AsftPassBookingFlowContract$UserBookingDetails asftPassBookingFlowContract$UserBookingDetails, String str, String str2, String str3) {
        this.f98773a = asftPassBookingFlowContract$UserBookingDetails;
        this.f98774b = str;
        this.f98775c = str2;
        this.d = str3;
    }

    public static AsftPassBookingFlowContract$State a(AsftPassBookingFlowContract$State asftPassBookingFlowContract$State, AsftPassBookingFlowContract$UserBookingDetails asftPassBookingFlowContract$UserBookingDetails, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            asftPassBookingFlowContract$UserBookingDetails = asftPassBookingFlowContract$State.f98773a;
        }
        if ((i & 2) != 0) {
            str = asftPassBookingFlowContract$State.f98774b;
        }
        if ((i & 4) != 0) {
            str2 = asftPassBookingFlowContract$State.f98775c;
        }
        if ((i & 8) != 0) {
            str3 = asftPassBookingFlowContract$State.d;
        }
        asftPassBookingFlowContract$State.getClass();
        return new AsftPassBookingFlowContract$State(asftPassBookingFlowContract$UserBookingDetails, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftPassBookingFlowContract$State)) {
            return false;
        }
        AsftPassBookingFlowContract$State asftPassBookingFlowContract$State = (AsftPassBookingFlowContract$State) obj2;
        return Intrinsics.f(this.f98773a, asftPassBookingFlowContract$State.f98773a) && Intrinsics.f(this.f98774b, asftPassBookingFlowContract$State.f98774b) && Intrinsics.f(this.f98775c, asftPassBookingFlowContract$State.f98775c) && Intrinsics.f(this.d, asftPassBookingFlowContract$State.d);
    }

    public final int hashCode() {
        AsftPassBookingFlowContract$UserBookingDetails asftPassBookingFlowContract$UserBookingDetails = this.f98773a;
        int iHashCode = (asftPassBookingFlowContract$UserBookingDetails == null ? 0 : asftPassBookingFlowContract$UserBookingDetails.hashCode()) * 31;
        String str = this.f98774b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98775c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        AsftPassBookingFlowContract$UserBookingDetails asftPassBookingFlowContract$UserBookingDetails = this.f98773a;
        if (asftPassBookingFlowContract$UserBookingDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            asftPassBookingFlowContract$UserBookingDetails.writeToParcel(dest, i);
        }
        dest.writeString(this.f98774b);
        dest.writeString(this.f98775c);
        dest.writeString(this.d);
    }
}
