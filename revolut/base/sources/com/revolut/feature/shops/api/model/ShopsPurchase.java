package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import h30.l;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import shd.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsPurchase;", "Lcom/revolut/feature/shops/api/model/ShopsContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "shd/j", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsPurchase implements ShopsContext, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsPurchase> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f87066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87067c;
    public final String d;
    public final String e;
    public final ZonedDateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f87068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f87069h;
    public final Address i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f87070j;
    public final Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f87071l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            j jVarValueOf = j.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            int i = parcel.readInt();
            double d = parcel.readDouble();
            Address address = (Address) parcel.readParcelable(ShopsPurchase.class.getClassLoader());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                int iD = 0;
                while (iD != i2) {
                    iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, 1);
                    i2 = i2;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ShopsPurchase(string, jVarValueOf, string2, string3, string4, zonedDateTime, i, d, address, string5, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsPurchase[i];
        }
    }

    public ShopsPurchase(String id10, j purchaseType, String name, String description, String imageUrl, ZonedDateTime time, int i, double d, Address address, String carouselId, Map map, String analyticsRef) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        Intrinsics.checkNotNullParameter(analyticsRef, "analyticsRef");
        this.f87065a = id10;
        this.f87066b = purchaseType;
        this.f87067c = name;
        this.d = description;
        this.e = imageUrl;
        this.f = time;
        this.f87068g = i;
        this.f87069h = d;
        this.i = address;
        this.f87070j = carouselId;
        this.k = map;
        this.f87071l = analyticsRef;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsPurchase)) {
            return false;
        }
        ShopsPurchase shopsPurchase = (ShopsPurchase) obj2;
        return Intrinsics.f(this.f87065a, shopsPurchase.f87065a) && this.f87066b == shopsPurchase.f87066b && Intrinsics.f(this.f87067c, shopsPurchase.f87067c) && Intrinsics.f(this.d, shopsPurchase.d) && Intrinsics.f(this.e, shopsPurchase.e) && Intrinsics.f(this.f, shopsPurchase.f) && this.f87068g == shopsPurchase.f87068g && Double.compare(this.f87069h, shopsPurchase.f87069h) == 0 && Intrinsics.f(this.i, shopsPurchase.i) && Intrinsics.f(this.f87070j, shopsPurchase.f87070j) && Intrinsics.f(this.k, shopsPurchase.k) && Intrinsics.f(this.f87071l, shopsPurchase.f87071l);
    }

    public final int hashCode() {
        int iC = b.c(j6.a.b(this.f87068g, l.h(this.f, p.a.c(p.a.c(p.a.c((this.f87066b.hashCode() + (this.f87065a.hashCode() * 31)) * 31, 31, this.f87067c), 31, this.d), 31, this.e), 31), 31), this.f87069h, 31);
        Address address = this.i;
        int iC2 = p.a.c((iC + (address == null ? 0 : address.hashCode())) * 31, 31, this.f87070j);
        Map map = this.k;
        return this.f87071l.hashCode() + ((iC2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.feature.shops.api.model.ShopsContext
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getF87071l() {
        return this.f87071l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87065a);
        dest.writeString(this.f87066b.name());
        dest.writeString(this.f87067c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f87068g);
        dest.writeDouble(this.f87069h);
        dest.writeParcelable(this.i, i);
        dest.writeString(this.f87070j);
        Map map = this.k;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator itV = l.v(dest, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        dest.writeString(this.f87071l);
    }
}
