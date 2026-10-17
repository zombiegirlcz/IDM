package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesAccountV2;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesAccountV2 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelMilesProviderSummary f94087c;
    public final List d;

    @NotNull
    public static final Parcelable.Creator<TravelMilesAccountV2> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesAccountV2(parcel.readString(), parcel.readString(), TravelMilesProviderSummary.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesAccountV2[i];
        }
    }

    public TravelMilesAccountV2(String id10, String externalId, TravelMilesProviderSummary provider, List primaryAirlines) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(primaryAirlines, "primaryAirlines");
        this.f94085a = id10;
        this.f94086b = externalId;
        this.f94087c = provider;
        this.d = primaryAirlines;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesAccountV2)) {
            return false;
        }
        TravelMilesAccountV2 travelMilesAccountV2 = (TravelMilesAccountV2) obj2;
        return Intrinsics.f(this.f94085a, travelMilesAccountV2.f94085a) && Intrinsics.f(this.f94086b, travelMilesAccountV2.f94086b) && Intrinsics.f(this.f94087c, travelMilesAccountV2.f94087c) && Intrinsics.f(this.d, travelMilesAccountV2.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f94087c.hashCode() + a.c(this.f94085a.hashCode() * 31, 31, this.f94086b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94085a);
        dest.writeString(this.f94086b);
        this.f94087c.writeToParcel(dest, i);
        dest.writeStringList(this.d);
    }
}
