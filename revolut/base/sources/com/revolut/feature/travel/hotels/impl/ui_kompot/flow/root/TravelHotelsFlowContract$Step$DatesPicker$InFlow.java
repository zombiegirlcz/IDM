package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$DatesPicker$InFlow", "", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsFlowContract$Step$DatesPicker$InFlow implements TravelHotelsFlowContract$Step {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsFlowContract$Step$DatesPicker$InFlow> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsDatesPickerScreenContract$InputData f93781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelHotelsFlowContract$Step f93782b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsFlowContract$Step$DatesPicker$InFlow((TravelHotelsDatesPickerScreenContract$InputData) parcel.readParcelable(TravelHotelsFlowContract$Step$DatesPicker$InFlow.class.getClassLoader()), (TravelHotelsFlowContract$Step) parcel.readParcelable(TravelHotelsFlowContract$Step$DatesPicker$InFlow.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsFlowContract$Step$DatesPicker$InFlow[i];
        }
    }

    public TravelHotelsFlowContract$Step$DatesPicker$InFlow(TravelHotelsDatesPickerScreenContract$InputData input, TravelHotelsFlowContract$Step travelHotelsFlowContract$Step) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f93781a = input;
        this.f93782b = travelHotelsFlowContract$Step;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsFlowContract$Step$DatesPicker$InFlow)) {
            return false;
        }
        TravelHotelsFlowContract$Step$DatesPicker$InFlow travelHotelsFlowContract$Step$DatesPicker$InFlow = (TravelHotelsFlowContract$Step$DatesPicker$InFlow) obj2;
        return Intrinsics.f(this.f93781a, travelHotelsFlowContract$Step$DatesPicker$InFlow.f93781a) && Intrinsics.f(this.f93782b, travelHotelsFlowContract$Step$DatesPicker$InFlow.f93782b);
    }

    public final int hashCode() {
        int iHashCode = this.f93781a.hashCode() * 31;
        TravelHotelsFlowContract$Step travelHotelsFlowContract$Step = this.f93782b;
        return iHashCode + (travelHotelsFlowContract$Step == null ? 0 : travelHotelsFlowContract$Step.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93781a, i);
        dest.writeParcelable(this.f93782b, i);
    }

    public TravelHotelsFlowContract$Step$DatesPicker$InFlow() {
        this(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), null);
    }
}
