package com.revolut.feature.travel.experiences.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchLocationType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/config/TravelExperiencesSelectedLocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesSelectedLocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesSelectedLocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelSearchLocationType f92777c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesSelectedLocation(parcel.readString(), parcel.readString(), (TravelSearchLocationType) parcel.readParcelable(TravelExperiencesSelectedLocation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesSelectedLocation[i];
        }
    }

    public TravelExperiencesSelectedLocation(String id10, String name, TravelSearchLocationType locationType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        this.f92775a = id10;
        this.f92776b = name;
        this.f92777c = locationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesSelectedLocation)) {
            return false;
        }
        TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = (TravelExperiencesSelectedLocation) obj2;
        return Intrinsics.f(this.f92775a, travelExperiencesSelectedLocation.f92775a) && Intrinsics.f(this.f92776b, travelExperiencesSelectedLocation.f92776b) && Intrinsics.f(this.f92777c, travelExperiencesSelectedLocation.f92777c);
    }

    public final int hashCode() {
        return this.f92777c.hashCode() + p.a.c(this.f92775a.hashCode() * 31, 31, this.f92776b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92775a);
        dest.writeString(this.f92776b);
        dest.writeParcelable(this.f92777c, i);
    }
}
