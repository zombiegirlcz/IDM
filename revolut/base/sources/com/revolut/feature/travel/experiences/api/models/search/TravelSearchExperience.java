package com.revolut.feature.travel.experiences.api.models.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.models.TravelExperienceRatings;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/TravelSearchExperience;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelSearchExperience implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelSearchExperience> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92895c;
    public final d d;
    public final TravelExperienceRatings e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelSearchExperience(parcel.readString(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (TravelExperienceRatings) parcel.readParcelable(TravelSearchExperience.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelSearchExperience[i];
        }
    }

    public TravelSearchExperience(String id10, String name, String image, d dVar, TravelExperienceRatings travelExperienceRatings) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f92893a = id10;
        this.f92894b = name;
        this.f92895c = image;
        this.d = dVar;
        this.e = travelExperienceRatings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelSearchExperience)) {
            return false;
        }
        TravelSearchExperience travelSearchExperience = (TravelSearchExperience) obj2;
        return Intrinsics.f(this.f92893a, travelSearchExperience.f92893a) && Intrinsics.f(this.f92894b, travelSearchExperience.f92894b) && Intrinsics.f(this.f92895c, travelSearchExperience.f92895c) && Intrinsics.f(this.d, travelSearchExperience.d) && Intrinsics.f(this.e, travelSearchExperience.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f92893a.hashCode() * 31, 31, this.f92894b), 31, this.f92895c);
        d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        TravelExperienceRatings travelExperienceRatings = this.e;
        return iHashCode + (travelExperienceRatings != null ? travelExperienceRatings.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92893a);
        dest.writeString(this.f92894b);
        dest.writeString(this.f92895c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
    }
}
