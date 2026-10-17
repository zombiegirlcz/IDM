package com.revolut.feature.acquiring.lite_pos.api.model;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import cd1.b;
import cd1.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/model/CatalogueLineItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Quantity", "Tax", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CatalogueLineItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CatalogueLineItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f60673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f60674c;
    public final Quantity d;
    public final List e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f60675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f60676h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f60677j;
    public final int k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/model/CatalogueLineItem$Quantity;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Quantity implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Quantity> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f60679b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Quantity(parcel.readInt(), j.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Quantity[i];
            }
        }

        public Quantity(int i, j unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f60678a = i;
            this.f60679b = unit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Quantity)) {
                return false;
            }
            Quantity quantity = (Quantity) obj2;
            return this.f60678a == quantity.f60678a && this.f60679b == quantity.f60679b;
        }

        public final int hashCode() {
            return this.f60679b.hashCode() + (Integer.hashCode(this.f60678a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f60678a);
            dest.writeString(this.f60679b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/model/CatalogueLineItem$Tax;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tax implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Tax> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f60682c;
        public final Double d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tax(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tax[i];
            }
        }

        public Tax(String str, String name, long j2, Double d) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f60680a = str;
            this.f60681b = name;
            this.f60682c = j2;
            this.d = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Tax)) {
                return false;
            }
            Tax tax = (Tax) obj2;
            return Intrinsics.f(this.f60680a, tax.f60680a) && Intrinsics.f(this.f60681b, tax.f60681b) && this.f60682c == tax.f60682c && Intrinsics.f(this.d, tax.d);
        }

        public final int hashCode() {
            String str = this.f60680a;
            int iC = d.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f60681b), 31, this.f60682c);
            Double d = this.d;
            return iC + (d != null ? d.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60680a);
            dest.writeString(this.f60681b);
            dest.writeLong(this.f60682c);
            Double d = this.d;
            if (d == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            b bVarValueOf = b.valueOf(parcel.readString());
            long j2 = parcel.readLong();
            Quantity quantityCreateFromParcel = Quantity.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Tax.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new CatalogueLineItem(string, bVarValueOf, j2, quantityCreateFromParcel, arrayList, parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogueLineItem[i];
        }
    }

    public CatalogueLineItem(String name, b itemType, long j2, Quantity quantity, List list, long j3, long j5, String str, String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f60672a = name;
        this.f60673b = itemType;
        this.f60674c = j2;
        this.d = quantity;
        this.e = list;
        this.f = j3;
        this.f60675g = j5;
        this.f60676h = str;
        this.i = str2;
        this.f60677j = str3;
        this.k = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CatalogueLineItem)) {
            return false;
        }
        CatalogueLineItem catalogueLineItem = (CatalogueLineItem) obj2;
        return Intrinsics.f(this.f60672a, catalogueLineItem.f60672a) && this.f60673b == catalogueLineItem.f60673b && this.f60674c == catalogueLineItem.f60674c && Intrinsics.f(this.d, catalogueLineItem.d) && Intrinsics.f(this.e, catalogueLineItem.e) && this.f == catalogueLineItem.f && this.f60675g == catalogueLineItem.f60675g && Intrinsics.f(this.f60676h, catalogueLineItem.f60676h) && Intrinsics.f(this.i, catalogueLineItem.i) && Intrinsics.f(this.f60677j, catalogueLineItem.f60677j) && this.k == catalogueLineItem.k;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + d.c((this.f60673b.hashCode() + (this.f60672a.hashCode() * 31)) * 31, 31, this.f60674c)) * 31;
        List list = this.e;
        int iC = d.c(d.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f), 31, this.f60675g);
        String str = this.f60676h;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60677j;
        return Integer.hashCode(this.k) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60672a);
        dest.writeString(this.f60673b.name());
        dest.writeLong(this.f60674c);
        this.d.writeToParcel(dest, i);
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Tax) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeLong(this.f);
        dest.writeLong(this.f60675g);
        dest.writeString(this.f60676h);
        dest.writeString(this.i);
        dest.writeString(this.f60677j);
        dest.writeInt(this.k);
    }
}
