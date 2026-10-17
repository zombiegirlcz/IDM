package com.revolut.feature_travel_hotels_models.amenity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oei.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/amenity/HotelsCategorisedAmenities;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "oei/b", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsCategorisedAmenities implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsCategorisedAmenities> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f97840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f97841b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsAmenity.CREATOR, parcel, arrayList, iA, 1);
            }
            return new HotelsCategorisedAmenities(bVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsCategorisedAmenities[i];
        }
    }

    public HotelsCategorisedAmenities(b category, List amenities) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        this.f97840a = category;
        this.f97841b = amenities;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsCategorisedAmenities)) {
            return false;
        }
        HotelsCategorisedAmenities hotelsCategorisedAmenities = (HotelsCategorisedAmenities) obj2;
        return this.f97840a == hotelsCategorisedAmenities.f97840a && Intrinsics.f(this.f97841b, hotelsCategorisedAmenities.f97841b);
    }

    public final int hashCode() {
        return this.f97841b.hashCode() + (this.f97840a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97840a.name());
        Iterator itV = p.a.v(this.f97841b, dest);
        while (itV.hasNext()) {
            ((HotelsAmenity) itV.next()).writeToParcel(dest, i);
        }
    }
}
