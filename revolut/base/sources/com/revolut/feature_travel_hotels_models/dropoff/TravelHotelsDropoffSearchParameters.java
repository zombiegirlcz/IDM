package com.revolut.feature_travel_hotels_models.dropoff;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/dropoff/TravelHotelsDropoffSearchParameters;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsDropoffSearchParameters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsDropoffSearchParameters> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ffi.a f97925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f97926c;
    public final LocalDate d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f97927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f97928h;
    public final Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f97929j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f97930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f97931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f97932n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f97933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f97934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f97935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f97936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Boolean f97937t;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Boolean boolValueOf5 = null;
            ffi.a aVarValueOf = parcel.readInt() == 0 ? null : ffi.a.valueOf(parcel.readString());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = boolValueOf3;
            String string3 = parcel.readString();
            Boolean bool2 = boolValueOf2;
            Boolean bool3 = boolValueOf4;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z = false;
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf5 = Boolean.valueOf(z);
            }
            return new TravelHotelsDropoffSearchParameters(string, aVarValueOf, localDate, localDate2, string2, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, boolValueOf, bool2, bool, bool3, string3, string4, string5, string6, string7, string8, string9, boolValueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsDropoffSearchParameters[i];
        }
    }

    public TravelHotelsDropoffSearchParameters(String str, ffi.a aVar, LocalDate checkIn, LocalDate checkOut, String roomsOccupancy, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool5) {
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        this.f97924a = str;
        this.f97925b = aVar;
        this.f97926c = checkIn;
        this.d = checkOut;
        this.e = roomsOccupancy;
        this.f = list;
        this.f97927g = list2;
        this.f97928h = list3;
        this.i = bool;
        this.f97929j = bool2;
        this.k = bool3;
        this.f97930l = bool4;
        this.f97931m = str2;
        this.f97932n = str3;
        this.o = str4;
        this.f97933p = str5;
        this.f97934q = str6;
        this.f97935r = str7;
        this.f97936s = str8;
        this.f97937t = bool5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsDropoffSearchParameters)) {
            return false;
        }
        TravelHotelsDropoffSearchParameters travelHotelsDropoffSearchParameters = (TravelHotelsDropoffSearchParameters) obj2;
        return Intrinsics.f(this.f97924a, travelHotelsDropoffSearchParameters.f97924a) && this.f97925b == travelHotelsDropoffSearchParameters.f97925b && Intrinsics.f(this.f97926c, travelHotelsDropoffSearchParameters.f97926c) && Intrinsics.f(this.d, travelHotelsDropoffSearchParameters.d) && Intrinsics.f(this.e, travelHotelsDropoffSearchParameters.e) && Intrinsics.f(this.f, travelHotelsDropoffSearchParameters.f) && Intrinsics.f(this.f97927g, travelHotelsDropoffSearchParameters.f97927g) && Intrinsics.f(this.f97928h, travelHotelsDropoffSearchParameters.f97928h) && Intrinsics.f(this.i, travelHotelsDropoffSearchParameters.i) && Intrinsics.f(this.f97929j, travelHotelsDropoffSearchParameters.f97929j) && Intrinsics.f(this.k, travelHotelsDropoffSearchParameters.k) && Intrinsics.f(this.f97930l, travelHotelsDropoffSearchParameters.f97930l) && Intrinsics.f(this.f97931m, travelHotelsDropoffSearchParameters.f97931m) && Intrinsics.f(this.f97932n, travelHotelsDropoffSearchParameters.f97932n) && Intrinsics.f(this.o, travelHotelsDropoffSearchParameters.o) && Intrinsics.f(this.f97933p, travelHotelsDropoffSearchParameters.f97933p) && Intrinsics.f(this.f97934q, travelHotelsDropoffSearchParameters.f97934q) && Intrinsics.f(this.f97935r, travelHotelsDropoffSearchParameters.f97935r) && Intrinsics.f(this.f97936s, travelHotelsDropoffSearchParameters.f97936s) && Intrinsics.f(this.f97937t, travelHotelsDropoffSearchParameters.f97937t);
    }

    public final int hashCode() {
        String str = this.f97924a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ffi.a aVar = this.f97925b;
        int iC = p.a.c(y.a(y.a((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f97926c), 31, this.d), 31, this.e);
        List list = this.f;
        int iHashCode2 = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f97927g;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f97928h;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f97929j;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.k;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f97930l;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.f97931m;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97932n;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f97933p;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f97934q;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f97935r;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f97936s;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool5 = this.f97937t;
        return iHashCode15 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97924a);
        ffi.a aVar = this.f97925b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeSerializable(this.f97926c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeStringList(this.f);
        dest.writeStringList(this.f97927g);
        dest.writeStringList(this.f97928h);
        Boolean bool = this.i;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        Boolean bool2 = this.f97929j;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        Boolean bool3 = this.k;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool3);
        }
        Boolean bool4 = this.f97930l;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool4);
        }
        dest.writeString(this.f97931m);
        dest.writeString(this.f97932n);
        dest.writeString(this.o);
        dest.writeString(this.f97933p);
        dest.writeString(this.f97934q);
        dest.writeString(this.f97935r);
        dest.writeString(this.f97936s);
        Boolean bool5 = this.f97937t;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool5);
        }
    }
}
