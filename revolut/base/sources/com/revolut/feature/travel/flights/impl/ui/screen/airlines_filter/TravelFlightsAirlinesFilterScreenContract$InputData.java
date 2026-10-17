package com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/airlines_filter/TravelFlightsAirlinesFilterScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsAirlinesFilterScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsAirlinesFilterScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f93237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f93238b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TravelFlightsAirlinesFilterScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            while (iA != i2) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new TravelFlightsAirlinesFilterScreenContract$InputData(linkedHashSet, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsAirlinesFilterScreenContract$InputData[i];
        }
    }

    public TravelFlightsAirlinesFilterScreenContract$InputData(Set selected, ArrayList available) {
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f93237a = available;
        this.f93238b = selected;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsAirlinesFilterScreenContract$InputData)) {
            return false;
        }
        TravelFlightsAirlinesFilterScreenContract$InputData travelFlightsAirlinesFilterScreenContract$InputData = (TravelFlightsAirlinesFilterScreenContract$InputData) obj2;
        return this.f93237a.equals(travelFlightsAirlinesFilterScreenContract$InputData.f93237a) && Intrinsics.f(this.f93238b, travelFlightsAirlinesFilterScreenContract$InputData.f93238b);
    }

    public final int hashCode() {
        return this.f93238b.hashCode() + (this.f93237a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f93237a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        Iterator itV = n.v(this.f93238b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }
}
