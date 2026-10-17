package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsOutlet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsOutlet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsOutlet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87058c;
    public final co3.a d;
    public final Integer e;
    public final ArrayList f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            co3.a aVar = (co3.a) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ShopsAvailabilityInOutlet.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ShopsOutlet(string, string2, string3, aVar, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsOutlet[i];
        }
    }

    public ShopsOutlet(String id10, String str, String address, co3.a location, Integer num, ArrayList availability) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.f87056a = id10;
        this.f87057b = str;
        this.f87058c = address;
        this.d = location;
        this.e = num;
        this.f = availability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsOutlet)) {
            return false;
        }
        ShopsOutlet shopsOutlet = (ShopsOutlet) obj2;
        return Intrinsics.f(this.f87056a, shopsOutlet.f87056a) && Intrinsics.f(this.f87057b, shopsOutlet.f87057b) && Intrinsics.f(this.f87058c, shopsOutlet.f87058c) && Intrinsics.f(this.d, shopsOutlet.d) && Intrinsics.f(this.e, shopsOutlet.e) && this.f.equals(shopsOutlet.f);
    }

    public final int hashCode() {
        int iHashCode = this.f87056a.hashCode() * 31;
        String str = this.f87057b;
        int iHashCode2 = (this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f87058c)) * 31;
        Integer num = this.e;
        return this.f.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87056a);
        dest.writeString(this.f87057b);
        dest.writeString(this.f87058c);
        dest.writeSerializable(this.d);
        Integer num = this.e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            ((ShopsAvailabilityInOutlet) itY.next()).writeToParcel(dest, i);
        }
    }
}
