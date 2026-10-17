package com.revolut.feature.travel.experiences.api.models.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/TravelSearchDestination;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "qyf/a", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelSearchDestination implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelSearchDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qyf.a f92890c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelSearchDestination(LocationId.DestinationId.CREATOR.createFromParcel(parcel).f92881a, parcel.readString(), qyf.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelSearchDestination[i];
        }
    }

    public TravelSearchDestination(String id10, String name, qyf.a type, String country, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f92888a = id10;
        this.f92889b = name;
        this.f92890c = type;
        this.d = country;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelSearchDestination)) {
            return false;
        }
        TravelSearchDestination travelSearchDestination = (TravelSearchDestination) obj2;
        return Intrinsics.f(this.f92888a, travelSearchDestination.f92888a) && Intrinsics.f(this.f92889b, travelSearchDestination.f92889b) && this.f92890c == travelSearchDestination.f92890c && Intrinsics.f(this.d, travelSearchDestination.d) && Intrinsics.f(this.e, travelSearchDestination.e);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f92890c.hashCode() + p.a.c(this.f92888a.hashCode() * 31, 31, this.f92889b)) * 31, 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92888a);
        dest.writeString(this.f92889b);
        dest.writeString(this.f92890c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
