package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/listing/TravelHotelsFiltersScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "FilterOptionsPicker", "SmartFiltersInfo", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/listing/TravelHotelsFiltersScreenContract$ModalStep$FilterOptionsPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/listing/TravelHotelsFiltersScreenContract$ModalStep$SmartFiltersInfo;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsFiltersScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/listing/TravelHotelsFiltersScreenContract$ModalStep$FilterOptionsPicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/listing/TravelHotelsFiltersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FilterOptionsPicker implements TravelHotelsFiltersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FilterOptionsPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f94027b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new FilterOptionsPicker(string, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FilterOptionsPicker[i];
            }
        }

        public FilterOptionsPicker(String filterReference, Set selectedOptionIds) {
            Intrinsics.checkNotNullParameter(filterReference, "filterReference");
            Intrinsics.checkNotNullParameter(selectedOptionIds, "selectedOptionIds");
            this.f94026a = filterReference;
            this.f94027b = selectedOptionIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FilterOptionsPicker)) {
                return false;
            }
            FilterOptionsPicker filterOptionsPicker = (FilterOptionsPicker) obj2;
            return Intrinsics.f(this.f94026a, filterOptionsPicker.f94026a) && Intrinsics.f(this.f94027b, filterOptionsPicker.f94027b);
        }

        public final int hashCode() {
            return this.f94027b.hashCode() + (this.f94026a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94026a);
            Iterator itV = n.v(this.f94027b, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/listing/TravelHotelsFiltersScreenContract$ModalStep$SmartFiltersInfo;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/listing/TravelHotelsFiltersScreenContract$ModalStep;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SmartFiltersInfo implements TravelHotelsFiltersScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SmartFiltersInfo f94028a = new SmartFiltersInfo();

        @NotNull
        public static final Parcelable.Creator<SmartFiltersInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SmartFiltersInfo.f94028a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SmartFiltersInfo[i];
            }
        }

        private SmartFiltersInfo() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
