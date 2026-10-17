package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/home/TravelHotelsHomeFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsHomeFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsHomeFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelHotelsHomeFlowContract$PagerItem f93723b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsHomeFlowContract$InputData(parcel.readInt() != 0, parcel.readInt() == 0 ? null : TravelHotelsHomeFlowContract$PagerItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsHomeFlowContract$InputData[i];
        }
    }

    public TravelHotelsHomeFlowContract$InputData(boolean z, TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem) {
        this.f93722a = z;
        this.f93723b = travelHotelsHomeFlowContract$PagerItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsHomeFlowContract$InputData)) {
            return false;
        }
        TravelHotelsHomeFlowContract$InputData travelHotelsHomeFlowContract$InputData = (TravelHotelsHomeFlowContract$InputData) obj2;
        return this.f93722a == travelHotelsHomeFlowContract$InputData.f93722a && this.f93723b == travelHotelsHomeFlowContract$InputData.f93723b;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f93722a) * 31;
        TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem = this.f93723b;
        return iHashCode + (travelHotelsHomeFlowContract$PagerItem == null ? 0 : travelHotelsHomeFlowContract$PagerItem.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f93722a ? 1 : 0);
        TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem = this.f93723b;
        if (travelHotelsHomeFlowContract$PagerItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelHotelsHomeFlowContract$PagerItem.writeToParcel(dest, i);
        }
    }

    public TravelHotelsHomeFlowContract$InputData() {
        this(true, null);
    }
}
