package com.revolut.feature.travel.experiences.api.models.search;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/TravelRecentSearchType;", "Landroid/os/Parcelable;", "Destination", "Attraction", "Experience", "Lcom/revolut/feature/travel/experiences/api/models/search/TravelRecentSearchType$Attraction;", "Lcom/revolut/feature/travel/experiences/api/models/search/TravelRecentSearchType$Destination;", "Lcom/revolut/feature/travel/experiences/api/models/search/TravelRecentSearchType$Experience;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelRecentSearchType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/TravelRecentSearchType$Attraction;", "Lcom/revolut/feature/travel/experiences/api/models/search/TravelRecentSearchType;", "<init>", "()V", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Attraction implements TravelRecentSearchType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Attraction f92882a = new Attraction();

        @NotNull
        public static final Parcelable.Creator<Attraction> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Attraction.f92882a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Attraction[i];
            }
        }

        private Attraction() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/TravelRecentSearchType$Destination;", "Lcom/revolut/feature/travel/experiences/api/models/search/TravelRecentSearchType;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Destination implements TravelRecentSearchType {

        @NotNull
        public static final Parcelable.Creator<Destination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qyf.a f92883a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Destination(qyf.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Destination[i];
            }
        }

        public Destination(qyf.a destinationType) {
            Intrinsics.checkNotNullParameter(destinationType, "destinationType");
            this.f92883a = destinationType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Destination) && this.f92883a == ((Destination) obj2).f92883a;
        }

        public final int hashCode() {
            return this.f92883a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92883a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/TravelRecentSearchType$Experience;", "Lcom/revolut/feature/travel/experiences/api/models/search/TravelRecentSearchType;", "<init>", "()V", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Experience implements TravelRecentSearchType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Experience f92884a = new Experience();

        @NotNull
        public static final Parcelable.Creator<Experience> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Experience.f92884a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Experience[i];
            }
        }

        private Experience() {
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
