package com.revolut.feature.travel.experiences.api.models.search;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/search/TravelSearchResponse;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelSearchResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelSearchResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f92898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92900c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TravelSearchAttraction.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA3 = 0;
            while (iA3 != i2) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(TravelSearchExperience.CREATOR, parcel, arrayList2, iA3, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelSearchDestination.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new TravelSearchResponse(arrayList, arrayList2, arrayList3, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelSearchResponse[i];
        }
    }

    public TravelSearchResponse(List attractions, List experiences, List destinations, List orderedIds) {
        Intrinsics.checkNotNullParameter(attractions, "attractions");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(orderedIds, "orderedIds");
        this.f92898a = attractions;
        this.f92899b = experiences;
        this.f92900c = destinations;
        this.d = orderedIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelSearchResponse)) {
            return false;
        }
        TravelSearchResponse travelSearchResponse = (TravelSearchResponse) obj2;
        return Intrinsics.f(this.f92898a, travelSearchResponse.f92898a) && Intrinsics.f(this.f92899b, travelSearchResponse.f92899b) && Intrinsics.f(this.f92900c, travelSearchResponse.f92900c) && Intrinsics.f(this.d, travelSearchResponse.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f92898a.hashCode() * 31, 31, this.f92899b), 31, this.f92900c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f92898a, dest);
        while (itV.hasNext()) {
            ((TravelSearchAttraction) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f92899b, dest);
        while (itV2.hasNext()) {
            ((TravelSearchExperience) itV2.next()).writeToParcel(dest, i);
        }
        Iterator itV3 = p.a.v(this.f92900c, dest);
        while (itV3.hasNext()) {
            ((TravelSearchDestination) itV3.next()).writeToParcel(dest, i);
        }
        dest.writeStringList(this.d);
    }
}
