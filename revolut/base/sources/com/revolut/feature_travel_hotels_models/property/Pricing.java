package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import cgi.e;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_travel_hotels_models.property.room.TravelHotelsRatePricing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/Pricing;", "Landroid/os/Parcelable;", "Lcom/revolut/feature_travel_hotels_models/property/room/TravelHotelsRatePricing;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Pricing implements Parcelable, TravelHotelsRatePricing {

    @NotNull
    public static final Parcelable.Creator<Pricing> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f98066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f98067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OverallPrice f98068c;
    public final OverallPrice d;
    public final HotelsPropertyCashback e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RevPoints f98069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HotelsPointsRedeemOption f98070h;
    public final PointsRewardRate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f98071j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            e eVarValueOf = e.valueOf(parcel.readString());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Parcelable.Creator<OverallPrice> creator = OverallPrice.CREATOR;
            OverallPrice overallPriceCreateFromParcel = creator.createFromParcel(parcel);
            OverallPrice overallPriceCreateFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            HotelsPropertyCashback hotelsPropertyCashbackCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPropertyCashback.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPointsRedeemOption.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            RevPoints revPoints = (RevPoints) parcel.readParcelable(Pricing.class.getClassLoader());
            HotelsPointsRedeemOption hotelsPointsRedeemOptionCreateFromParcel = parcel.readInt() == 0 ? null : HotelsPointsRedeemOption.CREATOR.createFromParcel(parcel);
            PointsRewardRate pointsRewardRateCreateFromParcel = parcel.readInt() == 0 ? null : PointsRewardRate.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(zei.a.valueOf(parcel.readString()));
                }
            }
            return new Pricing(eVarValueOf, boolValueOf, overallPriceCreateFromParcel, overallPriceCreateFromParcel2, hotelsPropertyCashbackCreateFromParcel, arrayList, revPoints, hotelsPointsRedeemOptionCreateFromParcel, pointsRewardRateCreateFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Pricing[i];
        }
    }

    public Pricing(e type, Boolean bool, OverallPrice overallPrice, OverallPrice overallPrice2, HotelsPropertyCashback hotelsPropertyCashback, ArrayList arrayList, RevPoints revPoints, HotelsPointsRedeemOption hotelsPointsRedeemOption, PointsRewardRate pointsRewardRate, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(overallPrice, "overallPrice");
        this.f98066a = type;
        this.f98067b = bool;
        this.f98068c = overallPrice;
        this.d = overallPrice2;
        this.e = hotelsPropertyCashback;
        this.f = arrayList;
        this.f98069g = revPoints;
        this.f98070h = hotelsPointsRedeemOption;
        this.i = pointsRewardRate;
        this.f98071j = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Pricing)) {
            return false;
        }
        Pricing pricing = (Pricing) obj2;
        return this.f98066a == pricing.f98066a && Intrinsics.f(this.f98067b, pricing.f98067b) && Intrinsics.f(this.f98068c, pricing.f98068c) && Intrinsics.f(this.d, pricing.d) && Intrinsics.f(this.e, pricing.e) && Intrinsics.f(this.f, pricing.f) && Intrinsics.f(this.f98069g, pricing.f98069g) && Intrinsics.f(this.f98070h, pricing.f98070h) && Intrinsics.f(this.i, pricing.i) && Intrinsics.f(this.f98071j, pricing.f98071j);
    }

    public final int hashCode() {
        int iHashCode = this.f98066a.hashCode() * 31;
        Boolean bool = this.f98067b;
        int iHashCode2 = (this.f98068c.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        OverallPrice overallPrice = this.d;
        int iHashCode3 = (iHashCode2 + (overallPrice == null ? 0 : overallPrice.hashCode())) * 31;
        HotelsPropertyCashback hotelsPropertyCashback = this.e;
        int iHashCode4 = (iHashCode3 + (hotelsPropertyCashback == null ? 0 : hotelsPropertyCashback.hashCode())) * 31;
        List list = this.f;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        RevPoints revPoints = this.f98069g;
        int iHashCode6 = (iHashCode5 + (revPoints == null ? 0 : revPoints.f83960a.hashCode())) * 31;
        HotelsPointsRedeemOption hotelsPointsRedeemOption = this.f98070h;
        int iHashCode7 = (iHashCode6 + (hotelsPointsRedeemOption == null ? 0 : hotelsPointsRedeemOption.hashCode())) * 31;
        PointsRewardRate pointsRewardRate = this.i;
        int iHashCode8 = (iHashCode7 + (pointsRewardRate == null ? 0 : pointsRewardRate.hashCode())) * 31;
        List list2 = this.f98071j;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98066a.name());
        Boolean bool = this.f98067b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        this.f98068c.writeToParcel(dest, i);
        OverallPrice overallPrice = this.d;
        if (overallPrice == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            overallPrice.writeToParcel(dest, i);
        }
        HotelsPropertyCashback hotelsPropertyCashback = this.e;
        if (hotelsPropertyCashback == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyCashback.writeToParcel(dest, i);
        }
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((HotelsPointsRedeemOption) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeParcelable(this.f98069g, i);
        HotelsPointsRedeemOption hotelsPointsRedeemOption = this.f98070h;
        if (hotelsPointsRedeemOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPointsRedeemOption.writeToParcel(dest, i);
        }
        PointsRewardRate pointsRewardRate = this.i;
        if (pointsRewardRate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pointsRewardRate.writeToParcel(dest, i);
        }
        List list2 = this.f98071j;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ2 = v0.a.q(dest, 1, list2);
        while (itQ2.hasNext()) {
            dest.writeString(((zei.a) itQ2.next()).name());
        }
    }
}
