package com.revolut.feature.insurance_pet.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/insurance_pet/api/navigation/PetFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Entry", "Hub", "Profile", "Lcom/revolut/feature/insurance_pet/api/navigation/PetFeatureConfig$Entry;", "Lcom/revolut/feature/insurance_pet/api/navigation/PetFeatureConfig$Hub;", "Lcom/revolut/feature/insurance_pet/api/navigation/PetFeatureConfig$Profile;", "feature_insurance_pet_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PetFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/api/navigation/PetFeatureConfig$Profile;", "Lcom/revolut/feature/insurance_pet/api/navigation/PetFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Profile extends PetFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Profile> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76226a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Profile(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Profile[i];
            }
        }

        public Profile(String petId) {
            Intrinsics.checkNotNullParameter(petId, "petId");
            this.f76226a = petId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Profile) && Intrinsics.f(this.f76226a, ((Profile) obj2).f76226a);
        }

        public final int hashCode() {
            return this.f76226a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76226a);
        }
    }

    private PetFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/api/navigation/PetFeatureConfig$Entry;", "Lcom/revolut/feature/insurance_pet/api/navigation/PetFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Entry extends PetFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Entry> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActivityAnimation f76224a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Entry((ActivityAnimation) parcel.readParcelable(Entry.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Entry[i];
            }
        }

        public Entry(ActivityAnimation activityAnimation) {
            this.f76224a = activityAnimation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Entry) && Intrinsics.f(this.f76224a, ((Entry) obj2).f76224a);
        }

        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f76224a;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76224a, i);
        }

        public Entry() {
            this(null);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/api/navigation/PetFeatureConfig$Hub;", "Lcom/revolut/feature/insurance_pet/api/navigation/PetFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Hub extends PetFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Hub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActivityAnimation f76225a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Hub((ActivityAnimation) parcel.readParcelable(Hub.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Hub[i];
            }
        }

        public Hub(ActivityAnimation activityAnimation) {
            this.f76225a = activityAnimation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Hub) && Intrinsics.f(this.f76225a, ((Hub) obj2).f76225a);
        }

        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f76225a;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76225a, i);
        }

        public Hub() {
            this(null);
        }
    }
}
