package com.revolut.feature.travel.flights.impl.ui.screen.search_filters;

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
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/search_filters/TravelFlightsSearchFiltersScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Airlines", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_filters/TravelFlightsSearchFiltersScreenContract$ModalStep$Airlines;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelFlightsSearchFiltersScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_filters/TravelFlightsSearchFiltersScreenContract$ModalStep$Airlines;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/search_filters/TravelFlightsSearchFiltersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Airlines extends TravelFlightsSearchFiltersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Airlines> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f93401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f93402b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Airlines.class, parcel, arrayList, iE, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                while (iA != i2) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new Airlines(linkedHashSet, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Airlines[i];
            }
        }

        public Airlines(Set selected, ArrayList available) {
            Intrinsics.checkNotNullParameter(available, "available");
            Intrinsics.checkNotNullParameter(selected, "selected");
            this.f93401a = available;
            this.f93402b = selected;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Airlines)) {
                return false;
            }
            Airlines airlines = (Airlines) obj2;
            return this.f93401a.equals(airlines.f93401a) && Intrinsics.f(this.f93402b, airlines.f93402b);
        }

        public final int hashCode() {
            return this.f93402b.hashCode() + (this.f93401a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f93401a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            Iterator itV = n.v(this.f93402b, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    private TravelFlightsSearchFiltersScreenContract$ModalStep() {
    }
}
