package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesRedeemOptionItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesRedeemOptionItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesRedeemOptionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f94122c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesRedeemOptionItem(parcel.readDouble(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesRedeemOptionItem[i];
        }
    }

    public TravelMilesRedeemOptionItem(double d, String title, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f94120a = title;
        this.f94121b = icon;
        this.f94122c = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesRedeemOptionItem)) {
            return false;
        }
        TravelMilesRedeemOptionItem travelMilesRedeemOptionItem = (TravelMilesRedeemOptionItem) obj2;
        return Intrinsics.f(this.f94120a, travelMilesRedeemOptionItem.f94120a) && Intrinsics.f(this.f94121b, travelMilesRedeemOptionItem.f94121b) && Double.compare(this.f94122c, travelMilesRedeemOptionItem.f94122c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f94122c) + p.a.c(this.f94120a.hashCode() * 31, 31, this.f94121b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94120a);
        dest.writeString(this.f94121b);
        dest.writeDouble(this.f94122c);
    }
}
