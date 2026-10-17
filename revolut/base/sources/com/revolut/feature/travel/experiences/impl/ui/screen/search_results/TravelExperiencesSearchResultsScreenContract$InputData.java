package com.revolut.feature.travel.experiences.impl.ui.screen.search_results;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Destination", "PreciseLocation", "Attraction", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreenContract$InputData$Attraction;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreenContract$InputData$Destination;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreenContract$InputData$PreciseLocation;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperiencesSearchResultsScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreenContract$InputData$Attraction;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Attraction extends TravelExperiencesSearchResultsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Attraction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f93142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelExperienceDatesSelection f93143c;
        public final TravelExperienceFiltersSelection d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Attraction(((LocationId.AttractionId) parcel.readParcelable(Attraction.class.getClassLoader())).f92880a, parcel.readString(), (TravelExperienceDatesSelection) parcel.readParcelable(Attraction.class.getClassLoader()), (TravelExperienceFiltersSelection) parcel.readParcelable(Attraction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Attraction[i];
            }
        }

        public Attraction(String attractionId, String str, TravelExperienceDatesSelection datesSelection, TravelExperienceFiltersSelection selectedFilters) {
            Intrinsics.checkNotNullParameter(attractionId, "attractionId");
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
            this.f93141a = attractionId;
            this.f93142b = str;
            this.f93143c = datesSelection;
            this.d = selectedFilters;
        }

        @Override // com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TravelExperienceDatesSelection getF93148b() {
            return this.f93143c;
        }

        @Override // com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TravelExperienceFiltersSelection getF93149c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Attraction)) {
                return false;
            }
            Attraction attraction = (Attraction) obj2;
            return Intrinsics.f(this.f93141a, attraction.f93141a) && Intrinsics.f(this.f93142b, attraction.f93142b) && Intrinsics.f(this.f93143c, attraction.f93143c) && Intrinsics.f(this.d, attraction.d);
        }

        public final int hashCode() {
            int iHashCode = this.f93141a.hashCode() * 31;
            String str = this.f93142b;
            return this.d.hashCode() + ((this.f93143c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new LocationId.AttractionId(this.f93141a), i);
            dest.writeString(this.f93142b);
            dest.writeParcelable(this.f93143c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreenContract$InputData$Destination;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Destination extends TravelExperiencesSearchResultsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Destination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f93145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelExperienceDatesSelection f93146c;
        public final TravelExperienceFiltersSelection d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Destination(((LocationId.DestinationId) parcel.readParcelable(Destination.class.getClassLoader())).f92881a, parcel.readString(), (TravelExperienceDatesSelection) parcel.readParcelable(Destination.class.getClassLoader()), (TravelExperienceFiltersSelection) parcel.readParcelable(Destination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Destination[i];
            }
        }

        public Destination(String destinationId, String str, TravelExperienceDatesSelection datesSelection, TravelExperienceFiltersSelection selectedFilters) {
            Intrinsics.checkNotNullParameter(destinationId, "destinationId");
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
            this.f93144a = destinationId;
            this.f93145b = str;
            this.f93146c = datesSelection;
            this.d = selectedFilters;
        }

        @Override // com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TravelExperienceDatesSelection getF93148b() {
            return this.f93146c;
        }

        @Override // com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TravelExperienceFiltersSelection getF93149c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Destination)) {
                return false;
            }
            Destination destination = (Destination) obj2;
            return Intrinsics.f(this.f93144a, destination.f93144a) && Intrinsics.f(this.f93145b, destination.f93145b) && Intrinsics.f(this.f93146c, destination.f93146c) && Intrinsics.f(this.d, destination.d);
        }

        public final int hashCode() {
            int iHashCode = this.f93144a.hashCode() * 31;
            String str = this.f93145b;
            return this.d.hashCode() + ((this.f93146c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new LocationId.DestinationId(this.f93144a), i);
            dest.writeString(this.f93145b);
            dest.writeParcelable(this.f93146c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreenContract$InputData$PreciseLocation;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreciseLocation extends TravelExperiencesSearchResultsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PreciseLocation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Coordinates f93147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperienceDatesSelection f93148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelExperienceFiltersSelection f93149c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreciseLocation((Coordinates) parcel.readParcelable(PreciseLocation.class.getClassLoader()), (TravelExperienceDatesSelection) parcel.readParcelable(PreciseLocation.class.getClassLoader()), (TravelExperienceFiltersSelection) parcel.readParcelable(PreciseLocation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreciseLocation[i];
            }
        }

        public PreciseLocation(Coordinates coordinates, TravelExperienceDatesSelection datesSelection, TravelExperienceFiltersSelection selectedFilters) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
            this.f93147a = coordinates;
            this.f93148b = datesSelection;
            this.f93149c = selectedFilters;
        }

        @Override // com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TravelExperienceDatesSelection getF93148b() {
            return this.f93148b;
        }

        @Override // com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TravelExperienceFiltersSelection getF93149c() {
            return this.f93149c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PreciseLocation)) {
                return false;
            }
            PreciseLocation preciseLocation = (PreciseLocation) obj2;
            return Intrinsics.f(this.f93147a, preciseLocation.f93147a) && Intrinsics.f(this.f93148b, preciseLocation.f93148b) && Intrinsics.f(this.f93149c, preciseLocation.f93149c);
        }

        public final int hashCode() {
            return this.f93149c.hashCode() + ((this.f93148b.hashCode() + (this.f93147a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93147a, i);
            dest.writeParcelable(this.f93148b, i);
            dest.writeParcelable(this.f93149c, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract TravelExperienceDatesSelection getF93148b();

    /* JADX INFO: renamed from: b */
    public abstract TravelExperienceFiltersSelection getF93149c();
}
