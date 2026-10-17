package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.rev_points.models.RevPoints;
import h30.l;
import ip0.v7;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;
import t1e.a0;
import t1e.b0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StorePurchase;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StorePurchase implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StorePurchase> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f88578c;
    public final String d;
    public final String e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f88579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RevPoints f88580h;
    public final Address i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f88581j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f88582l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            b0 b0VarValueOf = b0.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Instant instantOfEpochMilli = Instant.ofEpochMilli(parcel.readLong());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            int i = parcel.readInt();
            RevPoints revPoints = (RevPoints) parcel.readParcelable(StorePurchase.class.getClassLoader());
            Address address = (Address) parcel.readParcelable(StorePurchase.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                int iD = 0;
                while (iD != i2) {
                    iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new StorePurchase(string, string2, b0VarValueOf, string3, string4, instantOfEpochMilli, i, revPoints, address, linkedHashMap, parcel.readString(), a0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StorePurchase[i];
        }
    }

    public StorePurchase(String id10, String productName, b0 purchaseType, String str, String imageUrl, Instant purchaseDate, int i, RevPoints points, Address address, Map map, String description, a0 status) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(purchaseDate, "purchaseDate");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f88576a = id10;
        this.f88577b = productName;
        this.f88578c = purchaseType;
        this.d = str;
        this.e = imageUrl;
        this.f = purchaseDate;
        this.f88579g = i;
        this.f88580h = points;
        this.i = address;
        this.f88581j = map;
        this.k = description;
        this.f88582l = status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StorePurchase)) {
            return false;
        }
        StorePurchase storePurchase = (StorePurchase) obj2;
        return Intrinsics.f(this.f88576a, storePurchase.f88576a) && Intrinsics.f(this.f88577b, storePurchase.f88577b) && this.f88578c == storePurchase.f88578c && Intrinsics.f(this.d, storePurchase.d) && Intrinsics.f(this.e, storePurchase.e) && Intrinsics.f(this.f, storePurchase.f) && this.f88579g == storePurchase.f88579g && Intrinsics.f(this.f88580h, storePurchase.f88580h) && Intrinsics.f(this.i, storePurchase.i) && Intrinsics.f(this.f88581j, storePurchase.f88581j) && Intrinsics.f(this.k, storePurchase.k) && this.f88582l == storePurchase.f88582l;
    }

    public final int hashCode() {
        int iHashCode = (this.f88578c.hashCode() + p.a.c(this.f88576a.hashCode() * 31, 31, this.f88577b)) * 31;
        String str = this.d;
        int iC = v7.c(j6.a.b(this.f88579g, b.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31), 31, this.f88580h.f83960a);
        Address address = this.i;
        int iHashCode2 = (iC + (address == null ? 0 : address.hashCode())) * 31;
        Map map = this.f88581j;
        return this.f88582l.hashCode() + p.a.c((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31, 31, this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.f88576a);
        parcel.writeString(this.f88577b);
        parcel.writeString(this.f88578c.name());
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Instant instant = this.f;
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(instant.toEpochMilli());
        parcel.writeInt(this.f88579g);
        parcel.writeParcelable(this.f88580h, i);
        parcel.writeParcelable(this.i, i);
        Map map = this.f88581j;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itV = l.v(parcel, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.k);
        parcel.writeString(this.f88582l.name());
    }
}
