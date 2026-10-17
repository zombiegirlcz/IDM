package com.revolut.feature.travel.flights.models.domain.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.common.Carrier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r7g.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/search/FlightSearchFilterOptions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlightSearchFilterOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlightSearchFilterOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f93572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlightSearchFilterPriceRange f93573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlightSearchFilterDurationRange f93574c;
    public final ArrayList d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(i.valueOf(parcel.readString()));
            }
            FlightSearchFilterPriceRange flightSearchFilterPriceRangeCreateFromParcel = FlightSearchFilterPriceRange.CREATOR.createFromParcel(parcel);
            FlightSearchFilterDurationRange flightSearchFilterDurationRangeCreateFromParcel = FlightSearchFilterDurationRange.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Carrier.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new FlightSearchFilterOptions(arrayList, flightSearchFilterPriceRangeCreateFromParcel, flightSearchFilterDurationRangeCreateFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FlightSearchFilterOptions[i];
        }
    }

    public FlightSearchFilterOptions(ArrayList stopOptions, FlightSearchFilterPriceRange priceRange, FlightSearchFilterDurationRange durationRange, ArrayList airlines) {
        Intrinsics.checkNotNullParameter(stopOptions, "stopOptions");
        Intrinsics.checkNotNullParameter(priceRange, "priceRange");
        Intrinsics.checkNotNullParameter(durationRange, "durationRange");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        this.f93572a = stopOptions;
        this.f93573b = priceRange;
        this.f93574c = durationRange;
        this.d = airlines;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FlightSearchFilterOptions)) {
            return false;
        }
        FlightSearchFilterOptions flightSearchFilterOptions = (FlightSearchFilterOptions) obj2;
        return this.f93572a.equals(flightSearchFilterOptions.f93572a) && Intrinsics.f(this.f93573b, flightSearchFilterOptions.f93573b) && Intrinsics.f(this.f93574c, flightSearchFilterOptions.f93574c) && this.d.equals(flightSearchFilterOptions.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f93574c.hashCode() + ((this.f93573b.hashCode() + (this.f93572a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f93572a, dest);
        while (itY.hasNext()) {
            dest.writeString(((i) itY.next()).name());
        }
        this.f93573b.writeToParcel(dest, i);
        this.f93574c.writeToParcel(dest, i);
        Iterator itY2 = j6.a.y(this.d, dest);
        while (itY2.hasNext()) {
            ((Carrier) itY2.next()).writeToParcel(dest, i);
        }
    }
}
