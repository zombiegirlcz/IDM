package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/pass_activity/AirportLoungesPassActivityScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Filters", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_activity/AirportLoungesPassActivityScreenContract$ModalStep$Filters;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AirportLoungesPassActivityScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_activity/AirportLoungesPassActivityScreenContract$ModalStep$Filters;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_activity/AirportLoungesPassActivityScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Filters implements AirportLoungesPassActivityScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Filters> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f99114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f99115b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Filters.class, parcel, arrayList, iE, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    String string = parcel.readString();
                    int i5 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
                    int iA = 0;
                    while (iA != i5) {
                        iA = o.a(parcel, linkedHashSet, iA, 1);
                    }
                    linkedHashMap.put(string, linkedHashSet);
                }
                return new Filters(arrayList, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Filters[i];
            }
        }

        public Filters(List filters, Map selectedFilters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
            this.f99114a = filters;
            this.f99115b = selectedFilters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Filters)) {
                return false;
            }
            Filters filters = (Filters) obj2;
            return Intrinsics.f(this.f99114a, filters.f99114a) && Intrinsics.f(this.f99115b, filters.f99115b);
        }

        public final int hashCode() {
            return this.f99115b.hashCode() + (this.f99114a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f99114a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itZ = j6.a.z(this.f99115b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                Iterator itV2 = n.v((Set) entry.getValue(), dest);
                while (itV2.hasNext()) {
                    dest.writeString((String) itV2.next());
                }
            }
        }
    }
}
