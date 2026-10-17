package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1e.b;
import t1e.d;
import t1e.e;
import t1e.f;
import t1e.g;
import t1e.h;
import t1e.i;
import t1e.j;
import t1e.k;
import t1e.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreCampaignOffer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "t1e/k", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreCampaignOffer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreCampaignOffer> CREATOR = new a();
    public final StoreCampaignInstalmentOption A;
    public final StoreInstructionList B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88449c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f88450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f88451h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f88452j;
    public final BigDecimal k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f88453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StoreCampaignEarningRate f88454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final StoreCampaignBadge f88455n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f88456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f88457q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final StoreCampaignCategory f88458r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f88459s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f88460t;
    public final String u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f88461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final StoreCampaignOutlet f88462x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Instant f88463y;
    public final Integer z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z;
            Boolean bool;
            ArrayList arrayList;
            String str;
            StoreCampaignCategory storeCampaignCategory;
            BigDecimal bigDecimal;
            Double d;
            StoreCampaignEarningRate storeCampaignEarningRate;
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
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            String string7 = parcel.readString();
            StoreCampaignCategory storeCampaignCategoryCreateFromParcel = null;
            b bVar = bVarValueOf;
            String string8 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            StoreCampaignEarningRate storeCampaignEarningRateCreateFromParcel = parcel.readInt() == 0 ? null : StoreCampaignEarningRate.CREATOR.createFromParcel(parcel);
            StoreCampaignBadge storeCampaignBadgeCreateFromParcel = parcel.readInt() == 0 ? null : StoreCampaignBadge.CREATOR.createFromParcel(parcel);
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z4 = false;
            }
            if (parcel.readInt() == 0) {
                z = false;
            }
            if (parcel.readInt() != 0) {
                storeCampaignCategoryCreateFromParcel = StoreCampaignCategory.CREATOR.createFromParcel(parcel);
            }
            StoreCampaignCategory storeCampaignCategory2 = storeCampaignCategoryCreateFromParcel;
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = boolValueOf;
                str = string;
                storeCampaignCategory = storeCampaignCategory2;
                bigDecimal = bigDecimal2;
                d = dValueOf;
                storeCampaignEarningRate = storeCampaignEarningRateCreateFromParcel;
                arrayList = null;
            } else {
                bool = boolValueOf;
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                str = string;
                int i2 = 0;
                while (i2 != i) {
                    arrayList.add(m.valueOf(parcel.readString()));
                    i2++;
                    i = i;
                }
                storeCampaignCategory = storeCampaignCategory2;
                bigDecimal = bigDecimal2;
                d = dValueOf;
                storeCampaignEarningRate = storeCampaignEarningRateCreateFromParcel;
            }
            return new StoreCampaignOffer(str, string2, string3, string4, string5, string6, bool, bVar, string7, string8, bigDecimal, d, storeCampaignEarningRate, storeCampaignBadgeCreateFromParcel, z3, z4, z, storeCampaignCategory, string9, string10, string11, arrayList, parcel.createStringArrayList(), parcel.readInt() == 0 ? null : StoreCampaignOutlet.CREATOR.createFromParcel(parcel), (Instant) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? StoreCampaignInstalmentOption.CREATOR.createFromParcel(parcel) : null, parcel.readInt() == 0 ? null : StoreInstructionList.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreCampaignOffer[i];
        }
    }

    public StoreCampaignOffer(String id10, String str, String str2, String brandId, String name, String logoUrl, Boolean bool, b bVar, String str3, String str4, BigDecimal bigDecimal, Double d, StoreCampaignEarningRate storeCampaignEarningRate, StoreCampaignBadge storeCampaignBadge, boolean z, boolean z3, boolean z4, StoreCampaignCategory storeCampaignCategory, String str5, String str6, String source, List list, List list2, StoreCampaignOutlet storeCampaignOutlet, Instant instant, Integer num, StoreCampaignInstalmentOption storeCampaignInstalmentOption, StoreInstructionList storeInstructionList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(brandId, "brandId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f88447a = id10;
        this.f88448b = str;
        this.f88449c = str2;
        this.d = brandId;
        this.e = name;
        this.f = logoUrl;
        this.f88450g = bool;
        this.f88451h = bVar;
        this.i = str3;
        this.f88452j = str4;
        this.k = bigDecimal;
        this.f88453l = d;
        this.f88454m = storeCampaignEarningRate;
        this.f88455n = storeCampaignBadge;
        this.o = z;
        this.f88456p = z3;
        this.f88457q = z4;
        this.f88458r = storeCampaignCategory;
        this.f88459s = str5;
        this.f88460t = str6;
        this.u = source;
        this.v = list;
        this.f88461w = list2;
        this.f88462x = storeCampaignOutlet;
        this.f88463y = instant;
        this.z = num;
        this.A = storeCampaignInstalmentOption;
        this.B = storeInstructionList;
    }

    public final k a() {
        List list;
        StoreCampaignOutlet storeCampaignOutlet = this.f88462x;
        if (storeCampaignOutlet != null) {
            return new e(storeCampaignOutlet);
        }
        boolean z = this.f88456p;
        if (z && (list = this.v) != null && list.contains(m.REVPAY)) {
            return i.f267263a;
        }
        if (z && this.f88453l != null) {
            return h.f267262a;
        }
        if (z && this.o) {
            return f.f267258a;
        }
        StoreCampaignInstalmentOption storeCampaignInstalmentOption = this.A;
        return (storeCampaignInstalmentOption == null || storeCampaignInstalmentOption.f88442a != d.MSI) ? j.f267264a : g.f267261a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreCampaignOffer)) {
            return false;
        }
        StoreCampaignOffer storeCampaignOffer = (StoreCampaignOffer) obj2;
        return Intrinsics.f(this.f88447a, storeCampaignOffer.f88447a) && Intrinsics.f(this.f88448b, storeCampaignOffer.f88448b) && Intrinsics.f(this.f88449c, storeCampaignOffer.f88449c) && Intrinsics.f(this.d, storeCampaignOffer.d) && Intrinsics.f(this.e, storeCampaignOffer.e) && Intrinsics.f(this.f, storeCampaignOffer.f) && Intrinsics.f(this.f88450g, storeCampaignOffer.f88450g) && this.f88451h == storeCampaignOffer.f88451h && Intrinsics.f(this.i, storeCampaignOffer.i) && Intrinsics.f(this.f88452j, storeCampaignOffer.f88452j) && Intrinsics.f(this.k, storeCampaignOffer.k) && Intrinsics.f(this.f88453l, storeCampaignOffer.f88453l) && Intrinsics.f(this.f88454m, storeCampaignOffer.f88454m) && Intrinsics.f(this.f88455n, storeCampaignOffer.f88455n) && this.o == storeCampaignOffer.o && this.f88456p == storeCampaignOffer.f88456p && this.f88457q == storeCampaignOffer.f88457q && Intrinsics.f(this.f88458r, storeCampaignOffer.f88458r) && Intrinsics.f(this.f88459s, storeCampaignOffer.f88459s) && Intrinsics.f(this.f88460t, storeCampaignOffer.f88460t) && Intrinsics.f(this.u, storeCampaignOffer.u) && Intrinsics.f(this.v, storeCampaignOffer.v) && Intrinsics.f(this.f88461w, storeCampaignOffer.f88461w) && Intrinsics.f(this.f88462x, storeCampaignOffer.f88462x) && Intrinsics.f(this.f88463y, storeCampaignOffer.f88463y) && Intrinsics.f(this.z, storeCampaignOffer.z) && Intrinsics.f(this.A, storeCampaignOffer.A) && Intrinsics.f(this.B, storeCampaignOffer.B);
    }

    public final int hashCode() {
        int iHashCode = this.f88447a.hashCode() * 31;
        String str = this.f88448b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88449c;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        Boolean bool = this.f88450g;
        int iHashCode3 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        b bVar = this.f88451h;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f88452j;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.k;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Double d = this.f88453l;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        StoreCampaignEarningRate storeCampaignEarningRate = this.f88454m;
        int iHashCode9 = (iHashCode8 + (storeCampaignEarningRate == null ? 0 : storeCampaignEarningRate.hashCode())) * 31;
        StoreCampaignBadge storeCampaignBadge = this.f88455n;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((iHashCode9 + (storeCampaignBadge == null ? 0 : storeCampaignBadge.hashCode())) * 31, 31, this.o), 31, this.f88456p), 31, this.f88457q);
        StoreCampaignCategory storeCampaignCategory = this.f88458r;
        int iHashCode10 = (iC2 + (storeCampaignCategory == null ? 0 : storeCampaignCategory.hashCode())) * 31;
        String str5 = this.f88459s;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f88460t;
        int iC3 = p.a.c((iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.u);
        List list = this.v;
        int iHashCode12 = (iC3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f88461w;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        StoreCampaignOutlet storeCampaignOutlet = this.f88462x;
        int iHashCode14 = (iHashCode13 + (storeCampaignOutlet == null ? 0 : storeCampaignOutlet.hashCode())) * 31;
        Instant instant = this.f88463y;
        int iHashCode15 = (iHashCode14 + (instant == null ? 0 : instant.hashCode())) * 31;
        Integer num = this.z;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        StoreCampaignInstalmentOption storeCampaignInstalmentOption = this.A;
        int iHashCode17 = (iHashCode16 + (storeCampaignInstalmentOption == null ? 0 : storeCampaignInstalmentOption.hashCode())) * 31;
        StoreInstructionList storeInstructionList = this.B;
        return iHashCode17 + (storeInstructionList != null ? storeInstructionList.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88447a);
        dest.writeString(this.f88448b);
        dest.writeString(this.f88449c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Boolean bool = this.f88450g;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        b bVar = this.f88451h;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.i);
        dest.writeString(this.f88452j);
        dest.writeSerializable(this.k);
        Double d = this.f88453l;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        StoreCampaignEarningRate storeCampaignEarningRate = this.f88454m;
        if (storeCampaignEarningRate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeCampaignEarningRate.writeToParcel(dest, i);
        }
        StoreCampaignBadge storeCampaignBadge = this.f88455n;
        if (storeCampaignBadge == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeCampaignBadge.writeToParcel(dest, i);
        }
        dest.writeInt(this.o ? 1 : 0);
        dest.writeInt(this.f88456p ? 1 : 0);
        dest.writeInt(this.f88457q ? 1 : 0);
        StoreCampaignCategory storeCampaignCategory = this.f88458r;
        if (storeCampaignCategory == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeCampaignCategory.writeToParcel(dest, i);
        }
        dest.writeString(this.f88459s);
        dest.writeString(this.f88460t);
        dest.writeString(this.u);
        List list = this.v;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeString(((m) itQ.next()).name());
            }
        }
        dest.writeStringList(this.f88461w);
        StoreCampaignOutlet storeCampaignOutlet = this.f88462x;
        if (storeCampaignOutlet == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeCampaignOutlet.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f88463y);
        Integer num = this.z;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        StoreCampaignInstalmentOption storeCampaignInstalmentOption = this.A;
        if (storeCampaignInstalmentOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeCampaignInstalmentOption.writeToParcel(dest, i);
        }
        StoreInstructionList storeInstructionList = this.B;
        if (storeInstructionList == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeInstructionList.writeToParcel(dest, i);
        }
    }
}
