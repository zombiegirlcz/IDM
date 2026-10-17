package com.revolut.feature.travel.experiences.api.models.search.recent;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.search.TravelRecentSearchType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/recent/TravelRecentSearchLocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelRecentSearchLocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelRecentSearchLocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f92902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92903c;
    public final Long d;
    public final Long e;
    public final TravelRecentSearchType f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelRecentSearchLocation(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (TravelRecentSearchType) parcel.readParcelable(TravelRecentSearchLocation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelRecentSearchLocation[i];
        }
    }

    public TravelRecentSearchLocation(String id10, long j2, String name, Long l2, Long l3, TravelRecentSearchType locationType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        this.f92901a = id10;
        this.f92902b = j2;
        this.f92903c = name;
        this.d = l2;
        this.e = l3;
        this.f = locationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelRecentSearchLocation)) {
            return false;
        }
        TravelRecentSearchLocation travelRecentSearchLocation = (TravelRecentSearchLocation) obj2;
        return Intrinsics.f(this.f92901a, travelRecentSearchLocation.f92901a) && this.f92902b == travelRecentSearchLocation.f92902b && Intrinsics.f(this.f92903c, travelRecentSearchLocation.f92903c) && Intrinsics.f(this.d, travelRecentSearchLocation.d) && Intrinsics.f(this.e, travelRecentSearchLocation.e) && Intrinsics.f(this.f, travelRecentSearchLocation.f);
    }

    public final int hashCode() {
        int iC = p.a.c(d.c(this.f92901a.hashCode() * 31, 31, this.f92902b), 31, this.f92903c);
        Long l2 = this.d;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        return this.f.hashCode() + ((iHashCode + (l3 != null ? l3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92901a);
        dest.writeLong(this.f92902b);
        dest.writeString(this.f92903c);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.e;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        dest.writeParcelable(this.f, i);
    }
}
