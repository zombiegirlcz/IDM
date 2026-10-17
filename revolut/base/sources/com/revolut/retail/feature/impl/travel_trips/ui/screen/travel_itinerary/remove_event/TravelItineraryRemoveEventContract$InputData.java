package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/remove_event/TravelItineraryRemoveEventContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelItineraryRemoveEventContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelItineraryRemoveEventContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelItineraryRemoveEventContract$Target f101649a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelItineraryRemoveEventContract$InputData((TravelItineraryRemoveEventContract$Target) parcel.readParcelable(TravelItineraryRemoveEventContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelItineraryRemoveEventContract$InputData[i];
        }
    }

    public TravelItineraryRemoveEventContract$InputData(TravelItineraryRemoveEventContract$Target target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f101649a = target;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TravelItineraryRemoveEventContract$InputData) && Intrinsics.f(this.f101649a, ((TravelItineraryRemoveEventContract$InputData) obj2).f101649a);
    }

    public final int hashCode() {
        return this.f101649a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101649a, i);
    }
}
