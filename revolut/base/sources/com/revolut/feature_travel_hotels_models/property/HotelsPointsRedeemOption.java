package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPointsRedeemOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPointsRedeemOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPointsRedeemOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f97976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f97977c;
    public final RevPoints d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            return new HotelsPointsRedeemOption((RevPoints) parcel.readParcelable(HotelsPointsRedeemOption.class.getClassLoader()), (RevPoints) parcel.readParcelable(HotelsPointsRedeemOption.class.getClassLoader()), (d) parcel.readSerializable(), string, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPointsRedeemOption[i];
        }
    }

    public HotelsPointsRedeemOption(RevPoints points, RevPoints revPoints, d discount, String str, String str2) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        this.f97975a = str;
        this.f97976b = points;
        this.f97977c = discount;
        this.d = revPoints;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPointsRedeemOption)) {
            return false;
        }
        HotelsPointsRedeemOption hotelsPointsRedeemOption = (HotelsPointsRedeemOption) obj2;
        return Intrinsics.f(this.f97975a, hotelsPointsRedeemOption.f97975a) && Intrinsics.f(this.f97976b, hotelsPointsRedeemOption.f97976b) && Intrinsics.f(this.f97977c, hotelsPointsRedeemOption.f97977c) && Intrinsics.f(this.d, hotelsPointsRedeemOption.d) && Intrinsics.f(this.e, hotelsPointsRedeemOption.e);
    }

    public final int hashCode() {
        String str = this.f97975a;
        int iC = v7.c(v7.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f97976b.f83960a), 31, this.f97977c);
        RevPoints revPoints = this.d;
        int iHashCode = (iC + (revPoints == null ? 0 : revPoints.f83960a.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97975a);
        dest.writeParcelable(this.f97976b, i);
        dest.writeSerializable(this.f97977c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
    }
}
