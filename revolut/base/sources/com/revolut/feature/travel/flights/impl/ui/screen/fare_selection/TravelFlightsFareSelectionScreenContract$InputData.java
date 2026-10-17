package com.revolut.feature.travel.flights.impl.ui.screen.fare_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.common.Carrier;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/fare_selection/TravelFlightsFareSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsFareSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsFareSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f93339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Carrier f93340b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TravelFlightsFareSelectionScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new TravelFlightsFareSelectionScreenContract$InputData(arrayList, (Carrier) parcel.readParcelable(TravelFlightsFareSelectionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsFareSelectionScreenContract$InputData[i];
        }
    }

    public TravelFlightsFareSelectionScreenContract$InputData(List fareOptions, Carrier carrier) {
        Intrinsics.checkNotNullParameter(fareOptions, "fareOptions");
        this.f93339a = fareOptions;
        this.f93340b = carrier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsFareSelectionScreenContract$InputData)) {
            return false;
        }
        TravelFlightsFareSelectionScreenContract$InputData travelFlightsFareSelectionScreenContract$InputData = (TravelFlightsFareSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93339a, travelFlightsFareSelectionScreenContract$InputData.f93339a) && Intrinsics.f(this.f93340b, travelFlightsFareSelectionScreenContract$InputData.f93340b);
    }

    public final int hashCode() {
        int iHashCode = this.f93339a.hashCode() * 31;
        Carrier carrier = this.f93340b;
        return iHashCode + (carrier == null ? 0 : carrier.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f93339a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f93340b, i);
    }
}
