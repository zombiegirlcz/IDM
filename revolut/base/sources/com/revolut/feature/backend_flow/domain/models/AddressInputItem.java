package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/AddressInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "CountrySelector", "xl2/c", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressInputItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<AddressInputItem> CREATOR = new a();
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final String K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountrySelector f63235c;
    public final Address d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f63237h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f63238j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f63239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f63240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f63241n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f63242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f63243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f63244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f63245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f63246t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f63247w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f63248x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f63249y;
    public final String z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/AddressInputItem$CountrySelector;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountrySelector implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CountrySelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xl2.c f63250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f63251b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountrySelector(xl2.c.valueOf(parcel.readString()), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountrySelector[i];
            }
        }

        public CountrySelector(xl2.c accessibility, wi0.b bVar) {
            Intrinsics.checkNotNullParameter(accessibility, "accessibility");
            this.f63250a = accessibility;
            this.f63251b = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CountrySelector)) {
                return false;
            }
            CountrySelector countrySelector = (CountrySelector) obj2;
            return this.f63250a == countrySelector.f63250a && Intrinsics.f(this.f63251b, countrySelector.f63251b);
        }

        public final int hashCode() {
            int iHashCode = this.f63250a.hashCode() * 31;
            wi0.b bVar = this.f63251b;
            return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63250a.name());
            dest.writeSerializable(this.f63251b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddressInputItem(parcel.readString(), parcel.readInt() != 0, CountrySelector.CREATOR.createFromParcel(parcel), (Address) parcel.readParcelable(AddressInputItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddressInputItem[i];
        }
    }

    public AddressInputItem(String id10, boolean z, CountrySelector countrySelector, Address address, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(countrySelector, "countrySelector");
        this.f63233a = id10;
        this.f63234b = z;
        this.f63235c = countrySelector;
        this.d = address;
        this.e = str;
        this.f = str2;
        this.f63236g = str3;
        this.f63237h = str4;
        this.i = str5;
        this.f63238j = str6;
        this.k = str7;
        this.f63239l = str8;
        this.f63240m = str9;
        this.f63241n = str10;
        this.o = str11;
        this.f63242p = str12;
        this.f63243q = str13;
        this.f63244r = str14;
        this.f63245s = str15;
        this.f63246t = str16;
        this.u = str17;
        this.v = str18;
        this.f63247w = str19;
        this.f63248x = str20;
        this.f63249y = str21;
        this.z = str22;
        this.A = str23;
        this.B = str24;
        this.C = str25;
        this.D = str26;
        this.E = str27;
        this.F = str28;
        this.G = str29;
        this.H = str30;
        this.I = str31;
        this.J = str32;
        this.K = str33;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63233a() {
        return this.f63233a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63234b() {
        return this.f63234b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddressInputItem)) {
            return false;
        }
        AddressInputItem addressInputItem = (AddressInputItem) obj2;
        return Intrinsics.f(this.f63233a, addressInputItem.f63233a) && this.f63234b == addressInputItem.f63234b && Intrinsics.f(this.f63235c, addressInputItem.f63235c) && Intrinsics.f(this.d, addressInputItem.d) && Intrinsics.f(this.e, addressInputItem.e) && Intrinsics.f(this.f, addressInputItem.f) && Intrinsics.f(this.f63236g, addressInputItem.f63236g) && Intrinsics.f(this.f63237h, addressInputItem.f63237h) && Intrinsics.f(this.i, addressInputItem.i) && Intrinsics.f(this.f63238j, addressInputItem.f63238j) && Intrinsics.f(this.k, addressInputItem.k) && Intrinsics.f(this.f63239l, addressInputItem.f63239l) && Intrinsics.f(this.f63240m, addressInputItem.f63240m) && Intrinsics.f(this.f63241n, addressInputItem.f63241n) && Intrinsics.f(this.o, addressInputItem.o) && Intrinsics.f(this.f63242p, addressInputItem.f63242p) && Intrinsics.f(this.f63243q, addressInputItem.f63243q) && Intrinsics.f(this.f63244r, addressInputItem.f63244r) && Intrinsics.f(this.f63245s, addressInputItem.f63245s) && Intrinsics.f(this.f63246t, addressInputItem.f63246t) && Intrinsics.f(this.u, addressInputItem.u) && Intrinsics.f(this.v, addressInputItem.v) && Intrinsics.f(this.f63247w, addressInputItem.f63247w) && Intrinsics.f(this.f63248x, addressInputItem.f63248x) && Intrinsics.f(this.f63249y, addressInputItem.f63249y) && Intrinsics.f(this.z, addressInputItem.z) && Intrinsics.f(this.A, addressInputItem.A) && Intrinsics.f(this.B, addressInputItem.B) && Intrinsics.f(this.C, addressInputItem.C) && Intrinsics.f(this.D, addressInputItem.D) && Intrinsics.f(this.E, addressInputItem.E) && Intrinsics.f(this.F, addressInputItem.F) && Intrinsics.f(this.G, addressInputItem.G) && Intrinsics.f(this.H, addressInputItem.H) && Intrinsics.f(this.I, addressInputItem.I) && Intrinsics.f(this.J, addressInputItem.J) && Intrinsics.f(this.K, addressInputItem.K);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63233a;
    }

    public final int hashCode() {
        int iHashCode = (this.f63235c.hashCode() + j6.a.c(this.f63233a.hashCode() * 31, 31, this.f63234b)) * 31;
        Address address = this.d;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63236g;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f63237h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f63238j;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f63239l;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f63240m;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f63241n;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.o;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f63242p;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f63243q;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f63244r;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f63245s;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f63246t;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.u;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.v;
        int iHashCode20 = (iHashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f63247w;
        int iHashCode21 = (iHashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f63248x;
        int iHashCode22 = (iHashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f63249y;
        int iHashCode23 = (iHashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.z;
        int iHashCode24 = (iHashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.A;
        int iHashCode25 = (iHashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.B;
        int iHashCode26 = (iHashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.C;
        int iHashCode27 = (iHashCode26 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.D;
        int iHashCode28 = (iHashCode27 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.E;
        int iHashCode29 = (iHashCode28 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.F;
        int iHashCode30 = (iHashCode29 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.G;
        int iHashCode31 = (iHashCode30 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.H;
        int iHashCode32 = (iHashCode31 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.I;
        int iHashCode33 = (iHashCode32 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.J;
        int iHashCode34 = (iHashCode33 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.K;
        return iHashCode34 + (str33 != null ? str33.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63233a);
        dest.writeInt(this.f63234b ? 1 : 0);
        this.f63235c.writeToParcel(dest, i);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f63236g);
        dest.writeString(this.f63237h);
        dest.writeString(this.i);
        dest.writeString(this.f63238j);
        dest.writeString(this.k);
        dest.writeString(this.f63239l);
        dest.writeString(this.f63240m);
        dest.writeString(this.f63241n);
        dest.writeString(this.o);
        dest.writeString(this.f63242p);
        dest.writeString(this.f63243q);
        dest.writeString(this.f63244r);
        dest.writeString(this.f63245s);
        dest.writeString(this.f63246t);
        dest.writeString(this.u);
        dest.writeString(this.v);
        dest.writeString(this.f63247w);
        dest.writeString(this.f63248x);
        dest.writeString(this.f63249y);
        dest.writeString(this.z);
        dest.writeString(this.A);
        dest.writeString(this.B);
        dest.writeString(this.C);
        dest.writeString(this.D);
        dest.writeString(this.E);
        dest.writeString(this.F);
        dest.writeString(this.G);
        dest.writeString(this.H);
        dest.writeString(this.I);
        dest.writeString(this.J);
        dest.writeString(this.K);
    }
}
