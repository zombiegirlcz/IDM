package com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesFlightSearchDashboardPagerFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelMilesFlightSearchDashboardPagerFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f94245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchLocation f94246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelMilesSearchLocation f94247c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesFlightSearchDashboardPagerFlowContract$InputData((TravelMilesSearchLocation) parcel.readParcelable(TravelMilesFlightSearchDashboardPagerFlowContract$InputData.class.getClassLoader()), (TravelMilesSearchLocation) parcel.readParcelable(TravelMilesFlightSearchDashboardPagerFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesFlightSearchDashboardPagerFlowContract$InputData[i];
        }
    }

    public TravelMilesFlightSearchDashboardPagerFlowContract$InputData(TravelMilesSearchLocation travelMilesSearchLocation, TravelMilesSearchLocation travelMilesSearchLocation2, boolean z) {
        this.f94245a = z;
        this.f94246b = travelMilesSearchLocation;
        this.f94247c = travelMilesSearchLocation2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesFlightSearchDashboardPagerFlowContract$InputData)) {
            return false;
        }
        TravelMilesFlightSearchDashboardPagerFlowContract$InputData travelMilesFlightSearchDashboardPagerFlowContract$InputData = (TravelMilesFlightSearchDashboardPagerFlowContract$InputData) obj2;
        return this.f94245a == travelMilesFlightSearchDashboardPagerFlowContract$InputData.f94245a && Intrinsics.f(this.f94246b, travelMilesFlightSearchDashboardPagerFlowContract$InputData.f94246b) && Intrinsics.f(this.f94247c, travelMilesFlightSearchDashboardPagerFlowContract$InputData.f94247c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f94245a) * 31;
        TravelMilesSearchLocation travelMilesSearchLocation = this.f94246b;
        int iHashCode2 = (iHashCode + (travelMilesSearchLocation == null ? 0 : travelMilesSearchLocation.hashCode())) * 31;
        TravelMilesSearchLocation travelMilesSearchLocation2 = this.f94247c;
        return iHashCode2 + (travelMilesSearchLocation2 != null ? travelMilesSearchLocation2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f94245a ? 1 : 0);
        dest.writeParcelable(this.f94246b, i);
        dest.writeParcelable(this.f94247c, i);
    }

    public TravelMilesFlightSearchDashboardPagerFlowContract$InputData() {
        this(null, null, false);
    }
}
