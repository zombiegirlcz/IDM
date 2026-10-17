package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData", "", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData implements TravelHotelsCancellationPolicyScreenContract$Mode {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationPolicy f93878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgi.a f93879b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData((CancellationPolicy) parcel.readParcelable(TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData.class.getClassLoader()), parcel.readInt() == 0 ? null : fgi.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData[i];
        }
    }

    public TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(CancellationPolicy cancellationPolicy, fgi.a aVar) {
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        this.f93878a = cancellationPolicy;
        this.f93879b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData)) {
            return false;
        }
        TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData travelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData = (TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData) obj2;
        return Intrinsics.f(this.f93878a, travelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData.f93878a) && this.f93879b == travelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData.f93879b;
    }

    public final int hashCode() {
        int iHashCode = this.f93878a.hashCode() * 31;
        fgi.a aVar = this.f93879b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93878a, i);
        fgi.a aVar = this.f93879b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
