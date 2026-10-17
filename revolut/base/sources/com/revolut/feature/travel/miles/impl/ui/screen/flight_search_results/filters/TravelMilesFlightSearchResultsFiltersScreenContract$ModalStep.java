package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import phg.h;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/flight_search_results/filters/TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "FilterOptions", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_results/filters/TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep$FilterOptions;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_results/filters/TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep$FilterOptions;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_results/filters/TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FilterOptions extends TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FilterOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f94339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f94340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f94341c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(FilterOptions.class, parcel, arrayList, iE, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                while (iA != i2) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new FilterOptions(arrayList, linkedHashSet, h.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FilterOptions[i];
            }
        }

        public FilterOptions(ArrayList available, Set selected, h type) {
            Intrinsics.checkNotNullParameter(available, "available");
            Intrinsics.checkNotNullParameter(selected, "selected");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f94339a = available;
            this.f94340b = selected;
            this.f94341c = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FilterOptions)) {
                return false;
            }
            FilterOptions filterOptions = (FilterOptions) obj2;
            return this.f94339a.equals(filterOptions.f94339a) && Intrinsics.f(this.f94340b, filterOptions.f94340b) && this.f94341c == filterOptions.f94341c;
        }

        public final int hashCode() {
            return this.f94341c.hashCode() + p.a.f(this.f94339a.hashCode() * 31, 31, this.f94340b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f94339a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            Iterator itV = n.v(this.f94340b, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
            dest.writeString(this.f94341c.name());
        }
    }

    private TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep() {
    }
}
