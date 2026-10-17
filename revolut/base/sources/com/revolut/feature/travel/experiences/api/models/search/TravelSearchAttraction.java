package com.revolut.feature.travel.experiences.api.models.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/TravelSearchAttraction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelSearchAttraction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelSearchAttraction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92887c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelSearchAttraction(LocationId.AttractionId.CREATOR.createFromParcel(parcel).f92880a, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelSearchAttraction[i];
        }
    }

    public TravelSearchAttraction(String id10, String name, String country, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f92885a = id10;
        this.f92886b = name;
        this.f92887c = country;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelSearchAttraction)) {
            return false;
        }
        TravelSearchAttraction travelSearchAttraction = (TravelSearchAttraction) obj2;
        return Intrinsics.f(this.f92885a, travelSearchAttraction.f92885a) && Intrinsics.f(this.f92886b, travelSearchAttraction.f92886b) && Intrinsics.f(this.f92887c, travelSearchAttraction.f92887c) && Intrinsics.f(this.d, travelSearchAttraction.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f92885a.hashCode() * 31, 31, this.f92886b), 31, this.f92887c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92885a);
        dest.writeString(this.f92886b);
        dest.writeString(this.f92887c);
        dest.writeString(this.d);
    }
}
