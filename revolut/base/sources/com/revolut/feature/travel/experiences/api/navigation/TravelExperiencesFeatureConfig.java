package com.revolut.feature.travel.experiences.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "ExperiencesHome", "ExperienceDetails", "BookingDetails", "SearchResults", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig$BookingDetails;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig$ExperienceDetails;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig$ExperiencesHome;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig$SearchResults;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperiencesFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig$BookingDetails;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingDetails extends TravelExperiencesFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f92929g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BookingDetails(String bookingId) {
            super(new TravelExperiencesDestination.BookingDetails(bookingId));
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f92929g = bookingId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BookingDetails) && Intrinsics.f(this.f92929g, ((BookingDetails) obj2).f92929g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f92929g.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig$ExperienceDetails;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExperienceDetails extends TravelExperiencesFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f92930g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExperienceDetails(String experienceId) {
            super(new TravelExperiencesDestination.ExperienceDetails(experienceId, null));
            Intrinsics.checkNotNullParameter(experienceId, "experienceId");
            this.f92930g = experienceId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExperienceDetails) && Intrinsics.f(this.f92930g, ((ExperienceDetails) obj2).f92930g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f92930g.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig$ExperiencesHome;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig;", "<init>", "()V", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExperiencesHome extends TravelExperiencesFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final ExperiencesHome f92931g = new ExperiencesHome();

        @NotNull
        public static final Parcelable.Creator<ExperiencesHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExperiencesHome.f92931g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExperiencesHome[i];
            }
        }

        private ExperiencesHome() {
            super(new TravelExperiencesDestination.Home(null));
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig$SearchResults;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchResults extends TravelExperiencesFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f92932g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f92933h;
        public final TravelExperienceDatesSelection.RangeDateSelection i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchResults(String destinationId, String str, TravelExperienceDatesSelection.RangeDateSelection datesSelection) {
            super(new TravelExperiencesDestination.ExperiencesSearchResults(destinationId, str, datesSelection));
            Intrinsics.checkNotNullParameter(destinationId, "destinationId");
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            this.f92932g = destinationId;
            this.f92933h = str;
            this.i = datesSelection;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SearchResults)) {
                return false;
            }
            SearchResults searchResults = (SearchResults) obj2;
            return Intrinsics.f(this.f92932g, searchResults.f92932g) && Intrinsics.f(this.f92933h, searchResults.f92933h) && Intrinsics.f(this.i, searchResults.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f92932g.hashCode() * 31;
            String str = this.f92933h;
            return this.i.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }
    }

    public TravelExperiencesFeatureConfig(TravelExperiencesDestination travelExperiencesDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) travelExperiencesDestination, false, (Integer) null, 0, 61);
    }
}
