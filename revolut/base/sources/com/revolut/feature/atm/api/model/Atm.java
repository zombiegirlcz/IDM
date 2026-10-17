package com.revolut.feature.atm.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import sj2.e;
import sj2.f;
import sj2.g;
import sj2.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/api/model/Atm;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Atm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Atm> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtmAddress f63119c;
    public final float d;
    public final double e;
    public final double f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f63120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f63121h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f63122j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f63123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f63124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f63125n;
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f63126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtmFees f63127q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f63128r;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String str;
            g gVar;
            AtmFees atmFeesCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            String string = parcel.readString();
            AtmAddress atmAddressCreateFromParcel = AtmAddress.CREATOR.createFromParcel(parcel);
            float f = parcel.readFloat();
            double d = parcel.readDouble();
            double d5 = parcel.readDouble();
            boolean z = parcel.readInt() != 0;
            h hVarValueOf = h.valueOf(parcel.readString());
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iC = 0;
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int iC2 = 0;
            while (iC2 != i3) {
                iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC2, 1);
            }
            String string2 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            boolean z3 = z;
            int iE = 0;
            while (true) {
                str = string2;
                if (iE == i5) {
                    break;
                }
                iE = j6.a.e(Atm.class, parcel, arrayList3, iE, 1);
                string2 = str;
                i = i;
            }
            int i6 = i;
            int i21 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i21);
            int iA = 0;
            while (iA != i21) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Feature.CREATOR, parcel, arrayList4, iA, 1);
                i21 = i21;
            }
            g gVarValueOf = g.valueOf(parcel.readString());
            f fVarValueOf = f.valueOf(parcel.readString());
            e eVarValueOf = e.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                gVar = gVarValueOf;
                atmFeesCreateFromParcel = null;
            } else {
                gVar = gVarValueOf;
                atmFeesCreateFromParcel = AtmFees.CREATOR.createFromParcel(parcel);
            }
            return new Atm(i6, string, atmAddressCreateFromParcel, f, d, d5, z3, hVarValueOf, arrayList, arrayList2, str, arrayList3, arrayList4, gVar, fVarValueOf, eVarValueOf, atmFeesCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Atm[i];
        }
    }

    public Atm(int i, String name, AtmAddress address, float f, double d, double d5, boolean z, h wheelchairAccess, List withdrawalBanknotes, List depositBanknotes, String str, List openingHours, List features, g activeState, f network, e localityType, AtmFees atmFees, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(wheelchairAccess, "wheelchairAccess");
        Intrinsics.checkNotNullParameter(withdrawalBanknotes, "withdrawalBanknotes");
        Intrinsics.checkNotNullParameter(depositBanknotes, "depositBanknotes");
        Intrinsics.checkNotNullParameter(openingHours, "openingHours");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(activeState, "activeState");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(localityType, "localityType");
        this.f63117a = i;
        this.f63118b = name;
        this.f63119c = address;
        this.d = f;
        this.e = d;
        this.f = d5;
        this.f63120g = z;
        this.f63121h = wheelchairAccess;
        this.i = withdrawalBanknotes;
        this.f63122j = depositBanknotes;
        this.k = str;
        this.f63123l = openingHours;
        this.f63124m = features;
        this.f63125n = activeState;
        this.o = network;
        this.f63126p = localityType;
        this.f63127q = atmFees;
        this.f63128r = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Atm)) {
            return false;
        }
        Atm atm = (Atm) obj2;
        return this.f63117a == atm.f63117a && Intrinsics.f(this.f63118b, atm.f63118b) && Intrinsics.f(this.f63119c, atm.f63119c) && Float.compare(this.d, atm.d) == 0 && Double.compare(this.e, atm.e) == 0 && Double.compare(this.f, atm.f) == 0 && this.f63120g == atm.f63120g && this.f63121h == atm.f63121h && Intrinsics.f(this.i, atm.i) && Intrinsics.f(this.f63122j, atm.f63122j) && Intrinsics.f(this.k, atm.k) && Intrinsics.f(this.f63123l, atm.f63123l) && Intrinsics.f(this.f63124m, atm.f63124m) && this.f63125n == atm.f63125n && this.o == atm.o && this.f63126p == atm.f63126p && Intrinsics.f(this.f63127q, atm.f63127q) && Intrinsics.f(this.f63128r, atm.f63128r);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d((this.f63121h.hashCode() + j6.a.c(b.c(b.c(b.b(this.d, (this.f63119c.hashCode() + p.a.c(Integer.hashCode(this.f63117a) * 31, 31, this.f63118b)) * 31, 31), this.e, 31), this.f, 31), 31, this.f63120g)) * 31, 31, this.i), 31, this.f63122j);
        String str = this.k;
        int iHashCode = (this.f63126p.hashCode() + ((this.o.hashCode() + ((this.f63125n.hashCode() + p.a.d(p.a.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f63123l), 31, this.f63124m)) * 31)) * 31)) * 31;
        AtmFees atmFees = this.f63127q;
        int iHashCode2 = (iHashCode + (atmFees == null ? 0 : atmFees.hashCode())) * 31;
        String str2 = this.f63128r;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f63117a);
        dest.writeString(this.f63118b);
        this.f63119c.writeToParcel(dest, i);
        dest.writeFloat(this.d);
        dest.writeDouble(this.e);
        dest.writeDouble(this.f);
        dest.writeInt(this.f63120g ? 1 : 0);
        dest.writeString(this.f63121h.name());
        Iterator itV = p.a.v(this.i, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        Iterator itV2 = p.a.v(this.f63122j, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
        dest.writeString(this.k);
        Iterator itV3 = p.a.v(this.f63123l, dest);
        while (itV3.hasNext()) {
            dest.writeParcelable((Parcelable) itV3.next(), i);
        }
        Iterator itV4 = p.a.v(this.f63124m, dest);
        while (itV4.hasNext()) {
            ((Feature) itV4.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f63125n.name());
        dest.writeString(this.o.name());
        dest.writeString(this.f63126p.name());
        AtmFees atmFees = this.f63127q;
        if (atmFees == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            atmFees.writeToParcel(dest, i);
        }
        dest.writeString(this.f63128r);
    }
}
