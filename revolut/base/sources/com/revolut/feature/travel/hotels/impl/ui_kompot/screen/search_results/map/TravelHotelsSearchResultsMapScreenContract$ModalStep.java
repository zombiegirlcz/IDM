package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/map/TravelHotelsSearchResultsMapScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SortingOptions", "Filters", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/map/TravelHotelsSearchResultsMapScreenContract$ModalStep$Filters;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/map/TravelHotelsSearchResultsMapScreenContract$ModalStep$SortingOptions;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsSearchResultsMapScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/map/TravelHotelsSearchResultsMapScreenContract$ModalStep$Filters;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/map/TravelHotelsSearchResultsMapScreenContract$ModalStep;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Filters implements TravelHotelsSearchResultsMapScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Filters f94056a = new Filters();

        @NotNull
        public static final Parcelable.Creator<Filters> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Filters.f94056a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Filters[i];
            }
        }

        private Filters() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/map/TravelHotelsSearchResultsMapScreenContract$ModalStep$SortingOptions;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/map/TravelHotelsSearchResultsMapScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SortingOptions implements TravelHotelsSearchResultsMapScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SortingOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ffi.a f94057a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SortingOptions(parcel.readInt() == 0 ? null : ffi.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SortingOptions[i];
            }
        }

        public SortingOptions(ffi.a aVar) {
            this.f94057a = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SortingOptions) && this.f94057a == ((SortingOptions) obj2).f94057a;
        }

        public final int hashCode() {
            ffi.a aVar = this.f94057a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ffi.a aVar = this.f94057a;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }
    }
}
