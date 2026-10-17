package com.revolut.feature.cash_topup.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/api/models/CashTopUpLocationInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashTopUpLocationInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CashTopUpLocationInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65592c;
    public final double d;
    public final double e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f65594h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f65595j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f65596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LockedStatus f65597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f65598n;
    public final Map o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            double d = parcel.readDouble();
            double d5 = parcel.readDouble();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            float f = parcel.readFloat();
            String string8 = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            LockedStatus lockedStatus = (LockedStatus) parcel.readParcelable(CashTopUpLocationInfo.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int i2 = 0;
            while (i2 != i) {
                int i3 = i;
                DayOfWeek dayOfWeekValueOf = DayOfWeek.valueOf(parcel.readString());
                int i5 = i2;
                int i6 = parcel.readInt();
                String str = string2;
                ArrayList arrayList = new ArrayList(i6);
                String str2 = string3;
                int iA = 0;
                while (iA != i6) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(OpenInterval.CREATOR, parcel, arrayList, iA, 1);
                    i6 = i6;
                    d = d;
                }
                linkedHashMap.put(dayOfWeekValueOf, arrayList);
                i2 = i5 + 1;
                i = i3;
                string2 = str;
                string3 = str2;
                d = d;
            }
            return new CashTopUpLocationInfo(string, string2, string3, d, d5, string4, string5, string6, string7, f, string8, dVar, lockedStatus, z, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashTopUpLocationInfo[i];
        }
    }

    public CashTopUpLocationInfo(String retailerName, String address, String phone, double d, double d5, String id10, String city, String zipCode, String state, float f, String str, d dVar, LockedStatus lockedStatus, boolean z, Map openingHours) {
        Intrinsics.checkNotNullParameter(retailerName, "retailerName");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(zipCode, "zipCode");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(lockedStatus, "lockedStatus");
        Intrinsics.checkNotNullParameter(openingHours, "openingHours");
        this.f65590a = retailerName;
        this.f65591b = address;
        this.f65592c = phone;
        this.d = d;
        this.e = d5;
        this.f = id10;
        this.f65593g = city;
        this.f65594h = zipCode;
        this.i = state;
        this.f65595j = f;
        this.k = str;
        this.f65596l = dVar;
        this.f65597m = lockedStatus;
        this.f65598n = z;
        this.o = openingHours;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashTopUpLocationInfo)) {
            return false;
        }
        CashTopUpLocationInfo cashTopUpLocationInfo = (CashTopUpLocationInfo) obj2;
        return Intrinsics.f(this.f65590a, cashTopUpLocationInfo.f65590a) && Intrinsics.f(this.f65591b, cashTopUpLocationInfo.f65591b) && Intrinsics.f(this.f65592c, cashTopUpLocationInfo.f65592c) && Double.compare(this.d, cashTopUpLocationInfo.d) == 0 && Double.compare(this.e, cashTopUpLocationInfo.e) == 0 && Intrinsics.f(this.f, cashTopUpLocationInfo.f) && Intrinsics.f(this.f65593g, cashTopUpLocationInfo.f65593g) && Intrinsics.f(this.f65594h, cashTopUpLocationInfo.f65594h) && Intrinsics.f(this.i, cashTopUpLocationInfo.i) && Float.compare(this.f65595j, cashTopUpLocationInfo.f65595j) == 0 && Intrinsics.f(this.k, cashTopUpLocationInfo.k) && Intrinsics.f(this.f65596l, cashTopUpLocationInfo.f65596l) && Intrinsics.f(this.f65597m, cashTopUpLocationInfo.f65597m) && this.f65598n == cashTopUpLocationInfo.f65598n && Intrinsics.f(this.o, cashTopUpLocationInfo.o);
    }

    public final int hashCode() {
        int iB = b.b(this.f65595j, p.a.c(p.a.c(p.a.c(p.a.c(b.c(b.c(p.a.c(p.a.c(this.f65590a.hashCode() * 31, 31, this.f65591b), 31, this.f65592c), this.d, 31), this.e, 31), 31, this.f), 31, this.f65593g), 31, this.f65594h), 31, this.i), 31);
        String str = this.k;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.f65596l;
        return this.o.hashCode() + j6.a.c((this.f65597m.hashCode() + ((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31)) * 31, 31, this.f65598n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65590a);
        dest.writeString(this.f65591b);
        dest.writeString(this.f65592c);
        dest.writeDouble(this.d);
        dest.writeDouble(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f65593g);
        dest.writeString(this.f65594h);
        dest.writeString(this.i);
        dest.writeFloat(this.f65595j);
        dest.writeString(this.k);
        dest.writeSerializable(this.f65596l);
        dest.writeParcelable(this.f65597m, i);
        dest.writeInt(this.f65598n ? 1 : 0);
        Iterator itZ = j6.a.z(this.o, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString(((DayOfWeek) entry.getKey()).name());
            Iterator itV = p.a.v((List) entry.getValue(), dest);
            while (itV.hasNext()) {
                ((OpenInterval) itV.next()).writeToParcel(dest, i);
            }
        }
    }
}
