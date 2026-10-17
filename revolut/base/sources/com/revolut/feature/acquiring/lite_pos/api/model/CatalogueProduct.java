package com.revolut.feature.acquiring.lite_pos.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import cd1.j;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/model/CatalogueProduct;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CatalogueProduct implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CatalogueProduct> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60685c;
    public final String d;
    public final String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f60686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f60687h;
    public final String i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CatalogueProduct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), j.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogueProduct[i];
        }
    }

    public CatalogueProduct(String productId, String name, String str, String str2, String str3, d price, j unitPricing, String str4, String str5) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(unitPricing, "unitPricing");
        this.f60683a = productId;
        this.f60684b = name;
        this.f60685c = str;
        this.d = str2;
        this.e = str3;
        this.f = price;
        this.f60686g = unitPricing;
        this.f60687h = str4;
        this.i = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CatalogueProduct)) {
            return false;
        }
        CatalogueProduct catalogueProduct = (CatalogueProduct) obj2;
        return Intrinsics.f(this.f60683a, catalogueProduct.f60683a) && Intrinsics.f(this.f60684b, catalogueProduct.f60684b) && Intrinsics.f(this.f60685c, catalogueProduct.f60685c) && Intrinsics.f(this.d, catalogueProduct.d) && Intrinsics.f(this.e, catalogueProduct.e) && Intrinsics.f(this.f, catalogueProduct.f) && this.f60686g == catalogueProduct.f60686g && Intrinsics.f(this.f60687h, catalogueProduct.f60687h) && Intrinsics.f(this.i, catalogueProduct.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f60683a.hashCode() * 31, 31, this.f60684b);
        String str = this.f60685c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (this.f60686g.hashCode() + v7.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f)) * 31;
        String str4 = this.f60687h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60683a);
        dest.writeString(this.f60684b);
        dest.writeString(this.f60685c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f60686g.name());
        dest.writeString(this.f60687h);
        dest.writeString(this.i);
    }
}
