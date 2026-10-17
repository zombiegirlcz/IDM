package com.revolut.feature.travel.hotels.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class TravelHotelsApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/TravelHotelsApi$Toggles$StaysDealsRevamp;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StaysDealsRevamp extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final StaysDealsRevamp f93613c = new StaysDealsRevamp();

        @NotNull
        public static final Parcelable.Creator<StaysDealsRevamp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StaysDealsRevamp.f93613c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StaysDealsRevamp[i];
            }
        }

        private StaysDealsRevamp() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("staysDealsUpdate");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/TravelHotelsApi$Toggles$StaysDropOffNavigation;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StaysDropOffNavigation extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final StaysDropOffNavigation f93614c = new StaysDropOffNavigation();

        @NotNull
        public static final Parcelable.Creator<StaysDropOffNavigation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StaysDropOffNavigation.f93614c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StaysDropOffNavigation[i];
            }
        }

        private StaysDropOffNavigation() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("staysDropOffNavigation");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/TravelHotelsApi$Toggles$StaysExpediaCheckoutUpdates;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StaysExpediaCheckoutUpdates extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final StaysExpediaCheckoutUpdates f93615c = new StaysExpediaCheckoutUpdates();

        @NotNull
        public static final Parcelable.Creator<StaysExpediaCheckoutUpdates> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StaysExpediaCheckoutUpdates.f93615c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StaysExpediaCheckoutUpdates[i];
            }
        }

        private StaysExpediaCheckoutUpdates() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("staysExpediaCheckoutUpdates");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/TravelHotelsApi$Toggles$StaysFavoritesImprovements;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StaysFavoritesImprovements extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final StaysFavoritesImprovements f93616c = new StaysFavoritesImprovements();

        @NotNull
        public static final Parcelable.Creator<StaysFavoritesImprovements> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StaysFavoritesImprovements.f93616c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StaysFavoritesImprovements[i];
            }
        }

        private StaysFavoritesImprovements() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("staysFavouritesImprovements");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/TravelHotelsApi$Toggles$StaysInAppChangeDates;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StaysInAppChangeDates extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final StaysInAppChangeDates f93617c = new StaysInAppChangeDates();

        @NotNull
        public static final Parcelable.Creator<StaysInAppChangeDates> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StaysInAppChangeDates.f93617c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StaysInAppChangeDates[i];
            }
        }

        private StaysInAppChangeDates() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("staysInAppChangeDates");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/TravelHotelsApi$Toggles$StaysRevPayMigration;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StaysRevPayMigration extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final StaysRevPayMigration f93618c = new StaysRevPayMigration();

        @NotNull
        public static final Parcelable.Creator<StaysRevPayMigration> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StaysRevPayMigration.f93618c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StaysRevPayMigration[i];
            }
        }

        private StaysRevPayMigration() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("staysRevPayMigration");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/TravelHotelsApi$Toggles$StaysSmartSearch;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StaysSmartSearch extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final StaysSmartSearch f93619c = new StaysSmartSearch();

        @NotNull
        public static final Parcelable.Creator<StaysSmartSearch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StaysSmartSearch.f93619c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StaysSmartSearch[i];
            }
        }

        private StaysSmartSearch() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("staysSmartSearch");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/TravelHotelsApi$Toggles$StaysTopDestinationsV2;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StaysTopDestinationsV2 extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final StaysTopDestinationsV2 f93620c = new StaysTopDestinationsV2();

        @NotNull
        public static final Parcelable.Creator<StaysTopDestinationsV2> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StaysTopDestinationsV2.f93620c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StaysTopDestinationsV2[i];
            }
        }

        private StaysTopDestinationsV2() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("staysTopDestinationsUpdate");
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

    private TravelHotelsApi$Toggles() {
    }

    public static List a() {
        return v.k(StaysDropOffNavigation.f93614c, StaysRevPayMigration.f93618c, StaysInAppChangeDates.f93617c, StaysSmartSearch.f93619c, StaysExpediaCheckoutUpdates.f93615c, StaysTopDestinationsV2.f93620c, StaysFavoritesImprovements.f93616c, StaysDealsRevamp.f93613c);
    }
}
