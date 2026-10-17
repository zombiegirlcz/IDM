package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/root/TravelHotelsFlowContract$Step$DatesPicker$Modal", "", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsFlowContract$Step$DatesPicker$Modal implements TravelHotelsFlowContract$Step {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsFlowContract$Step$DatesPicker$Modal> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsDatesPickerScreenContract$InputData f93783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelHotelsFlowContract$Step f93784b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsFlowContract$Step$DatesPicker$Modal((TravelHotelsDatesPickerScreenContract$InputData) parcel.readParcelable(TravelHotelsFlowContract$Step$DatesPicker$Modal.class.getClassLoader()), (TravelHotelsFlowContract$Step) parcel.readParcelable(TravelHotelsFlowContract$Step$DatesPicker$Modal.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsFlowContract$Step$DatesPicker$Modal[i];
        }
    }

    public TravelHotelsFlowContract$Step$DatesPicker$Modal() {
        this((TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsFlowContract$Step$DatesPicker$Modal)) {
            return false;
        }
        TravelHotelsFlowContract$Step$DatesPicker$Modal travelHotelsFlowContract$Step$DatesPicker$Modal = (TravelHotelsFlowContract$Step$DatesPicker$Modal) obj2;
        return Intrinsics.f(this.f93783a, travelHotelsFlowContract$Step$DatesPicker$Modal.f93783a) && Intrinsics.f(this.f93784b, travelHotelsFlowContract$Step$DatesPicker$Modal.f93784b);
    }

    public final int hashCode() {
        int iHashCode = this.f93783a.hashCode() * 31;
        TravelHotelsFlowContract$Step travelHotelsFlowContract$Step = this.f93784b;
        return iHashCode + (travelHotelsFlowContract$Step == null ? 0 : travelHotelsFlowContract$Step.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93783a, i);
        dest.writeParcelable(this.f93784b, i);
    }

    public TravelHotelsFlowContract$Step$DatesPicker$Modal(TravelHotelsDatesPickerScreenContract$InputData input, TravelHotelsFlowContract$Step travelHotelsFlowContract$Step) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f93783a = input;
        this.f93784b = travelHotelsFlowContract$Step;
    }

    public /* synthetic */ TravelHotelsFlowContract$Step$DatesPicker$Modal(TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates currentSelectedDates, int i) {
        this((i & 1) != 0 ? new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0) : currentSelectedDates, (TravelHotelsFlowContract$Step) null);
    }
}
