package com.revolut.feature_travel_hotels_models.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/favorites/HotelsFavorites;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsFavorites implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsFavorites> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f97946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f97947b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(HotelsFavoriteProperty.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsFavoriteDestination.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new HotelsFavorites(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsFavorites[i];
        }
    }

    public HotelsFavorites(ArrayList properties, List destinations) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        this.f97946a = properties;
        this.f97947b = destinations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsFavorites)) {
            return false;
        }
        HotelsFavorites hotelsFavorites = (HotelsFavorites) obj2;
        return this.f97946a.equals(hotelsFavorites.f97946a) && Intrinsics.f(this.f97947b, hotelsFavorites.f97947b);
    }

    public final int hashCode() {
        return this.f97947b.hashCode() + (this.f97946a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f97946a, dest);
        while (itY.hasNext()) {
            ((HotelsFavoriteProperty) itY.next()).writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.f97947b, dest);
        while (itV.hasNext()) {
            ((HotelsFavoriteDestination) itV.next()).writeToParcel(dest, i);
        }
    }
}
