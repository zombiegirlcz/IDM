package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.EarningBadge;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import shd.e;
import shd.f;
import shd.g;
import shd.h;
import yhm.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsCampaignOffer;", "Lcom/revolut/feature/shops/api/model/ShopsCampaignDetails;", "Lcom/revolut/feature/shops/api/model/ShopsContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "shd/h", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class ShopsCampaignOffer implements ShopsCampaignDetails, ShopsContext, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsCampaignOffer> CREATOR = new a();
    public final ShopsInstalmentOption A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87025c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f87026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ekc.a f87027h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f87028j;
    public final BigDecimal k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f87029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ShopsEarningRate f87030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final EarningBadge f87031n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f87032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f87033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ShopsCategory f87034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f87035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f87036t;
    public final String u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f87037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ShopsOutlet f87038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f87039y;
    public final Integer z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean bool;
            ArrayList arrayList;
            String str;
            ShopsCategory shopsCategory;
            BigDecimal bigDecimal;
            Double d;
            ShopsEarningRate shopsEarningRate;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            ekc.a aVarValueOf = parcel.readInt() == 0 ? null : ekc.a.valueOf(parcel.readString());
            String string7 = parcel.readString();
            ShopsCategory shopsCategoryCreateFromParcel = null;
            ekc.a aVar = aVarValueOf;
            String string8 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            ShopsEarningRate shopsEarningRateCreateFromParcel = parcel.readInt() == 0 ? null : ShopsEarningRate.CREATOR.createFromParcel(parcel);
            EarningBadge earningBadge = (EarningBadge) parcel.readParcelable(ShopsCampaignOffer.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                shopsCategoryCreateFromParcel = ShopsCategory.CREATOR.createFromParcel(parcel);
            }
            ShopsCategory shopsCategory2 = shopsCategoryCreateFromParcel;
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = boolValueOf;
                str = string;
                shopsCategory = shopsCategory2;
                bigDecimal = bigDecimal2;
                d = dValueOf;
                shopsEarningRate = shopsEarningRateCreateFromParcel;
                arrayList = null;
            } else {
                bool = boolValueOf;
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                str = string;
                int i2 = 0;
                while (i2 != i) {
                    arrayList.add(shd.a.valueOf(parcel.readString()));
                    i2++;
                    i = i;
                }
                shopsCategory = shopsCategory2;
                bigDecimal = bigDecimal2;
                d = dValueOf;
                shopsEarningRate = shopsEarningRateCreateFromParcel;
            }
            return new ShopsCampaignOffer(str, string2, string3, string4, string5, string6, bool, aVar, string7, string8, bigDecimal, d, shopsEarningRate, earningBadge, z, z3, z4, shopsCategory, string9, string10, string11, arrayList, parcel.createStringArrayList(), parcel.readInt() == 0 ? null : ShopsOutlet.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ShopsInstalmentOption.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsCampaignOffer[i];
        }
    }

    public ShopsCampaignOffer(String id10, String str, String str2, String brandId, String name, String logoUrl, Boolean bool, ekc.a aVar, String str3, String str4, BigDecimal bigDecimal, Double d, ShopsEarningRate shopsEarningRate, EarningBadge earningBadge, boolean z, boolean z3, boolean z4, ShopsCategory shopsCategory, String str5, String str6, String source, List list, List list2, ShopsOutlet shopsOutlet, String str7, Integer num, ShopsInstalmentOption shopsInstalmentOption) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(brandId, "brandId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f87023a = id10;
        this.f87024b = str;
        this.f87025c = str2;
        this.d = brandId;
        this.e = name;
        this.f = logoUrl;
        this.f87026g = bool;
        this.f87027h = aVar;
        this.i = str3;
        this.f87028j = str4;
        this.k = bigDecimal;
        this.f87029l = d;
        this.f87030m = shopsEarningRate;
        this.f87031n = earningBadge;
        this.o = z;
        this.f87032p = z3;
        this.f87033q = z4;
        this.f87034r = shopsCategory;
        this.f87035s = str5;
        this.f87036t = str6;
        this.u = source;
        this.v = list;
        this.f87037w = list2;
        this.f87038x = shopsOutlet;
        this.f87039y = str7;
        this.z = num;
        this.A = shopsInstalmentOption;
    }

    public final h a() {
        ShopsOutlet shopsOutlet = this.f87038x;
        if (shopsOutlet != null) {
            return new shd.d(shopsOutlet);
        }
        boolean z = this.f87032p;
        return (!z || (this.k == null && this.f87029l == null)) ? (z && this.o) ? g.f263460a : e.f263458a : f.f263459a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsCampaignOffer)) {
            return false;
        }
        ShopsCampaignOffer shopsCampaignOffer = (ShopsCampaignOffer) obj2;
        return Intrinsics.f(this.f87023a, shopsCampaignOffer.f87023a) && Intrinsics.f(this.f87024b, shopsCampaignOffer.f87024b) && Intrinsics.f(this.f87025c, shopsCampaignOffer.f87025c) && Intrinsics.f(this.d, shopsCampaignOffer.d) && Intrinsics.f(this.e, shopsCampaignOffer.e) && Intrinsics.f(this.f, shopsCampaignOffer.f) && Intrinsics.f(this.f87026g, shopsCampaignOffer.f87026g) && this.f87027h == shopsCampaignOffer.f87027h && Intrinsics.f(this.i, shopsCampaignOffer.i) && Intrinsics.f(this.f87028j, shopsCampaignOffer.f87028j) && Intrinsics.f(this.k, shopsCampaignOffer.k) && Intrinsics.f(this.f87029l, shopsCampaignOffer.f87029l) && Intrinsics.f(this.f87030m, shopsCampaignOffer.f87030m) && Intrinsics.f(this.f87031n, shopsCampaignOffer.f87031n) && this.o == shopsCampaignOffer.o && this.f87032p == shopsCampaignOffer.f87032p && this.f87033q == shopsCampaignOffer.f87033q && Intrinsics.f(this.f87034r, shopsCampaignOffer.f87034r) && Intrinsics.f(this.f87035s, shopsCampaignOffer.f87035s) && Intrinsics.f(this.f87036t, shopsCampaignOffer.f87036t) && Intrinsics.f(this.u, shopsCampaignOffer.u) && Intrinsics.f(this.v, shopsCampaignOffer.v) && Intrinsics.f(this.f87037w, shopsCampaignOffer.f87037w) && Intrinsics.f(this.f87038x, shopsCampaignOffer.f87038x) && Intrinsics.f(this.f87039y, shopsCampaignOffer.f87039y) && Intrinsics.f(this.z, shopsCampaignOffer.z) && Intrinsics.f(this.A, shopsCampaignOffer.A);
    }

    public final int hashCode() {
        int iHashCode = this.f87023a.hashCode() * 31;
        String str = this.f87024b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f87025c;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        Boolean bool = this.f87026g;
        int iHashCode3 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        ekc.a aVar = this.f87027h;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f87028j;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.k;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Double d = this.f87029l;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        ShopsEarningRate shopsEarningRate = this.f87030m;
        int iHashCode9 = (iHashCode8 + (shopsEarningRate == null ? 0 : shopsEarningRate.hashCode())) * 31;
        EarningBadge earningBadge = this.f87031n;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((iHashCode9 + (earningBadge == null ? 0 : earningBadge.hashCode())) * 31, 31, this.o), 31, this.f87032p), 31, this.f87033q);
        ShopsCategory shopsCategory = this.f87034r;
        int iHashCode10 = (iC2 + (shopsCategory == null ? 0 : shopsCategory.hashCode())) * 31;
        String str5 = this.f87035s;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f87036t;
        int iC3 = p.a.c((iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.u);
        List list = this.v;
        int iHashCode12 = (iC3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f87037w;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ShopsOutlet shopsOutlet = this.f87038x;
        int iHashCode14 = (iHashCode13 + (shopsOutlet == null ? 0 : shopsOutlet.hashCode())) * 31;
        String str7 = this.f87039y;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.z;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        ShopsInstalmentOption shopsInstalmentOption = this.A;
        return iHashCode16 + (shopsInstalmentOption != null ? shopsInstalmentOption.hashCode() : 0);
    }

    @Override // com.revolut.feature.shops.api.model.ShopsContext
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getF87036t() {
        return this.f87036t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87023a);
        dest.writeString(this.f87024b);
        dest.writeString(this.f87025c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Boolean bool = this.f87026g;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        ekc.a aVar = this.f87027h;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.i);
        dest.writeString(this.f87028j);
        dest.writeSerializable(this.k);
        Double d = this.f87029l;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        ShopsEarningRate shopsEarningRate = this.f87030m;
        if (shopsEarningRate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shopsEarningRate.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f87031n, i);
        dest.writeInt(this.o ? 1 : 0);
        dest.writeInt(this.f87032p ? 1 : 0);
        dest.writeInt(this.f87033q ? 1 : 0);
        ShopsCategory shopsCategory = this.f87034r;
        if (shopsCategory == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shopsCategory.writeToParcel(dest, i);
        }
        dest.writeString(this.f87035s);
        dest.writeString(this.f87036t);
        dest.writeString(this.u);
        List list = this.v;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeString(((shd.a) itQ.next()).name());
            }
        }
        dest.writeStringList(this.f87037w);
        ShopsOutlet shopsOutlet = this.f87038x;
        if (shopsOutlet == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shopsOutlet.writeToParcel(dest, i);
        }
        dest.writeString(this.f87039y);
        Integer num = this.z;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        ShopsInstalmentOption shopsInstalmentOption = this.A;
        if (shopsInstalmentOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shopsInstalmentOption.writeToParcel(dest, i);
        }
    }
}
