package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import cgi.e;
import com.revolut.feature_travel_hotels_models.booking.details.CancellationRefund;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/confirmation/TravelHotelsCancellationConfirmationContract$CancellationConfirmationData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsCancellationConfirmationContract$CancellationConfirmationData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsCancellationConfirmationContract$CancellationConfirmationData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationRefund f93885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f93886b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsCancellationConfirmationContract$CancellationConfirmationData((CancellationRefund) parcel.readParcelable(TravelHotelsCancellationConfirmationContract$CancellationConfirmationData.class.getClassLoader()), e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsCancellationConfirmationContract$CancellationConfirmationData[i];
        }
    }

    public TravelHotelsCancellationConfirmationContract$CancellationConfirmationData(CancellationRefund cancellationRefund, e ratesType) {
        Intrinsics.checkNotNullParameter(cancellationRefund, "cancellationRefund");
        Intrinsics.checkNotNullParameter(ratesType, "ratesType");
        this.f93885a = cancellationRefund;
        this.f93886b = ratesType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsCancellationConfirmationContract$CancellationConfirmationData)) {
            return false;
        }
        TravelHotelsCancellationConfirmationContract$CancellationConfirmationData travelHotelsCancellationConfirmationContract$CancellationConfirmationData = (TravelHotelsCancellationConfirmationContract$CancellationConfirmationData) obj2;
        return Intrinsics.f(this.f93885a, travelHotelsCancellationConfirmationContract$CancellationConfirmationData.f93885a) && this.f93886b == travelHotelsCancellationConfirmationContract$CancellationConfirmationData.f93886b;
    }

    public final int hashCode() {
        return this.f93886b.hashCode() + (this.f93885a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93885a, i);
        dest.writeString(this.f93886b.name());
    }
}
