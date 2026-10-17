package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow", "", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow implements TravelHotelsCheckoutFlowContract$Step {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsDatesPickerScreenContract$InputData f93706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelHotelsCheckoutFlowContract$Step f93707b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow((TravelHotelsDatesPickerScreenContract$InputData) parcel.readParcelable(TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow.class.getClassLoader()), (TravelHotelsCheckoutFlowContract$Step) parcel.readParcelable(TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow[i];
        }
    }

    public TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow(TravelHotelsDatesPickerScreenContract$InputData input, TravelHotelsCheckoutFlowContract$Step nextStep) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f93706a = input;
        this.f93707b = nextStep;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow)) {
            return false;
        }
        TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow travelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow = (TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow) obj2;
        return Intrinsics.f(this.f93706a, travelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow.f93706a) && Intrinsics.f(this.f93707b, travelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow.f93707b);
    }

    public final int hashCode() {
        return this.f93707b.hashCode() + (this.f93706a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93706a, i);
        dest.writeParcelable(this.f93707b, i);
    }
}
