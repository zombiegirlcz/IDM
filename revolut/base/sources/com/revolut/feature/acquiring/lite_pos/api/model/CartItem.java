package com.revolut.feature.acquiring.lite_pos.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import cd1.b;
import cd1.j;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/model/CartItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "cd1/b", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CartItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CartItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f60664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60665c;
    public final d d;
    public final String e;
    public final TaxRate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f60666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f60667h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f60668j;
    public final String k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CartItem(parcel.readString(), b.valueOf(parcel.readString()), parcel.readString(), (d) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : TaxRate.CREATOR.createFromParcel(parcel), parcel.readInt(), j.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CartItem[i];
        }
    }

    public CartItem(String id10, b itemType, String name, d priceAmount, String str, TaxRate taxRate, int i, j unitPricing, int i2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(priceAmount, "priceAmount");
        Intrinsics.checkNotNullParameter(unitPricing, "unitPricing");
        this.f60663a = id10;
        this.f60664b = itemType;
        this.f60665c = name;
        this.d = priceAmount;
        this.e = str;
        this.f = taxRate;
        this.f60666g = i;
        this.f60667h = unitPricing;
        this.i = i2;
        this.f60668j = str2;
        this.k = str3;
    }

    public static CartItem a(CartItem cartItem, String str, d dVar, String str2, TaxRate taxRate, int i, int i2) {
        String id10 = cartItem.f60663a;
        b itemType = cartItem.f60664b;
        if ((i2 & 4) != 0) {
            str = cartItem.f60665c;
        }
        String name = str;
        if ((i2 & 8) != 0) {
            dVar = cartItem.d;
        }
        d priceAmount = dVar;
        if ((i2 & 16) != 0) {
            str2 = cartItem.e;
        }
        String str3 = str2;
        TaxRate taxRate2 = (i2 & 32) != 0 ? cartItem.f : taxRate;
        int i3 = (i2 & 64) != 0 ? cartItem.f60666g : i;
        j unitPricing = cartItem.f60667h;
        int i5 = cartItem.i;
        String str4 = cartItem.f60668j;
        String str5 = cartItem.k;
        cartItem.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(priceAmount, "priceAmount");
        Intrinsics.checkNotNullParameter(unitPricing, "unitPricing");
        return new CartItem(id10, itemType, name, priceAmount, str3, taxRate2, i3, unitPricing, i5, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CartItem)) {
            return false;
        }
        CartItem cartItem = (CartItem) obj2;
        return Intrinsics.f(this.f60663a, cartItem.f60663a) && this.f60664b == cartItem.f60664b && Intrinsics.f(this.f60665c, cartItem.f60665c) && Intrinsics.f(this.d, cartItem.d) && Intrinsics.f(this.e, cartItem.e) && Intrinsics.f(this.f, cartItem.f) && this.f60666g == cartItem.f60666g && this.f60667h == cartItem.f60667h && this.i == cartItem.i && Intrinsics.f(this.f60668j, cartItem.f60668j) && Intrinsics.f(this.k, cartItem.k);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c((this.f60664b.hashCode() + (this.f60663a.hashCode() * 31)) * 31, 31, this.f60665c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        TaxRate taxRate = this.f;
        int iB = j6.a.b(this.i, (this.f60667h.hashCode() + j6.a.b(this.f60666g, (iHashCode + (taxRate == null ? 0 : taxRate.hashCode())) * 31, 31)) * 31, 31);
        String str2 = this.f60668j;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60663a);
        dest.writeString(this.f60664b.name());
        dest.writeString(this.f60665c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        TaxRate taxRate = this.f;
        if (taxRate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            taxRate.writeToParcel(dest, i);
        }
        dest.writeInt(this.f60666g);
        dest.writeString(this.f60667h.name());
        dest.writeInt(this.i);
        dest.writeString(this.f60668j);
        dest.writeString(this.k);
    }
}
