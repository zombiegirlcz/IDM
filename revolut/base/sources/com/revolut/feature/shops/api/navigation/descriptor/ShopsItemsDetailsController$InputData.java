package com.revolut.feature.shops.api.navigation.descriptor;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shops/api/navigation/descriptor/ShopsItemsDetailsController$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsItemsDetailsController$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsItemsDetailsController$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87083c;
    public final int d;
    public final Map e;
    public final Address f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f87084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f87085h;
    public final Long i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i2);
                int iD = 0;
                while (iD != i2) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
            }
            return new ShopsItemsDetailsController$InputData(string, string2, string3, i, linkedHashMap, (Address) parcel.readParcelable(ShopsItemsDetailsController$InputData.class.getClassLoader()), parcel.readDouble(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsItemsDetailsController$InputData[i];
        }
    }

    public ShopsItemsDetailsController$InputData(String productName, String description, String imageUrl, int i, Map map, Address address, double d, String str, Long l2) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f87081a = productName;
        this.f87082b = description;
        this.f87083c = imageUrl;
        this.d = i;
        this.e = map;
        this.f = address;
        this.f87084g = d;
        this.f87085h = str;
        this.i = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsItemsDetailsController$InputData)) {
            return false;
        }
        ShopsItemsDetailsController$InputData shopsItemsDetailsController$InputData = (ShopsItemsDetailsController$InputData) obj2;
        return Intrinsics.f(this.f87081a, shopsItemsDetailsController$InputData.f87081a) && Intrinsics.f(this.f87082b, shopsItemsDetailsController$InputData.f87082b) && Intrinsics.f(this.f87083c, shopsItemsDetailsController$InputData.f87083c) && this.d == shopsItemsDetailsController$InputData.d && Intrinsics.f(this.e, shopsItemsDetailsController$InputData.e) && Intrinsics.f(this.f, shopsItemsDetailsController$InputData.f) && Double.compare(this.f87084g, shopsItemsDetailsController$InputData.f87084g) == 0 && Intrinsics.f(this.f87085h, shopsItemsDetailsController$InputData.f87085h) && Intrinsics.f(this.i, shopsItemsDetailsController$InputData.i);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, p.a.c(p.a.c(this.f87081a.hashCode() * 31, 31, this.f87082b), 31, this.f87083c), 31);
        Map map = this.e;
        int iHashCode = (iB + (map == null ? 0 : map.hashCode())) * 31;
        Address address = this.f;
        int iC = b.c((iHashCode + (address == null ? 0 : address.hashCode())) * 31, this.f87084g, 31);
        String str = this.f87085h;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.i;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87081a);
        dest.writeString(this.f87082b);
        dest.writeString(this.f87083c);
        dest.writeInt(this.d);
        Map map = this.e;
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
        dest.writeParcelable(this.f, i);
        dest.writeDouble(this.f87084g);
        dest.writeString(this.f87085h);
        Long l2 = this.i;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
    }
}
