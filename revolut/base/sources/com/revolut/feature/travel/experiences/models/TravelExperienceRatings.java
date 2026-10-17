package com.revolut.feature.travel.experiences.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/models/TravelExperienceRatings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceRatings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceRatings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f93192b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceRatings(parcel.readInt(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceRatings[i];
        }
    }

    public TravelExperienceRatings(int i, double d) {
        this.f93191a = i;
        this.f93192b = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceRatings)) {
            return false;
        }
        TravelExperienceRatings travelExperienceRatings = (TravelExperienceRatings) obj2;
        return this.f93191a == travelExperienceRatings.f93191a && Double.compare(this.f93192b, travelExperienceRatings.f93192b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f93192b) + (Integer.hashCode(this.f93191a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f93191a);
        dest.writeDouble(this.f93192b);
    }
}
