package com.revolut.retail.feature.airport.security_fast_track.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import bti.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/model/AsftTerminal;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftTerminal implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AsftTerminal> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98739c;
    public final String d;
    public final int e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f98740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f98741h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f98742j;
    public final AsftPriceBreakdown k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f98743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f98744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f98745n;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            int i3 = parcel.readInt();
            boolean z3 = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            AsftPriceBreakdown asftPriceBreakdownCreateFromParcel = AsftPriceBreakdown.CREATOR.createFromParcel(parcel);
            int i5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i5);
            while (true) {
                boolean z4 = z;
                if (iA == i5) {
                    return new AsftTerminal(string, string2, i, string3, i2, z4, i3, z3, numValueOf, numValueOf2, asftPriceBreakdownCreateFromParcel, arrayList, parcel.readString(), p.valueOf(parcel.readString()));
                }
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AsftBusinessHours.CREATOR, parcel, arrayList, iA, 1);
                z = z4;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftTerminal[i];
        }
    }

    public AsftTerminal(String id10, String terminalName, int i, String terminalDescription, int i2, boolean z, int i3, boolean z3, Integer num, Integer num2, AsftPriceBreakdown priceBreakdown, List businessHours, String str, p bookingAvailability) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(terminalName, "terminalName");
        Intrinsics.checkNotNullParameter(terminalDescription, "terminalDescription");
        Intrinsics.checkNotNullParameter(priceBreakdown, "priceBreakdown");
        Intrinsics.checkNotNullParameter(businessHours, "businessHours");
        Intrinsics.checkNotNullParameter(bookingAvailability, "bookingAvailability");
        this.f98737a = id10;
        this.f98738b = terminalName;
        this.f98739c = i;
        this.d = terminalDescription;
        this.e = i2;
        this.f = z;
        this.f98740g = i3;
        this.f98741h = z3;
        this.i = num;
        this.f98742j = num2;
        this.k = priceBreakdown;
        this.f98743l = businessHours;
        this.f98744m = str;
        this.f98745n = bookingAvailability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftTerminal)) {
            return false;
        }
        AsftTerminal asftTerminal = (AsftTerminal) obj2;
        return Intrinsics.f(this.f98737a, asftTerminal.f98737a) && Intrinsics.f(this.f98738b, asftTerminal.f98738b) && this.f98739c == asftTerminal.f98739c && Intrinsics.f(this.d, asftTerminal.d) && this.e == asftTerminal.e && this.f == asftTerminal.f && this.f98740g == asftTerminal.f98740g && this.f98741h == asftTerminal.f98741h && Intrinsics.f(this.i, asftTerminal.i) && Intrinsics.f(this.f98742j, asftTerminal.f98742j) && Intrinsics.f(this.k, asftTerminal.k) && Intrinsics.f(this.f98743l, asftTerminal.f98743l) && Intrinsics.f(this.f98744m, asftTerminal.f98744m) && this.f98745n == asftTerminal.f98745n;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.b(this.f98740g, j6.a.c(j6.a.b(this.e, p.a.c(j6.a.b(this.f98739c, p.a.c(this.f98737a.hashCode() * 31, 31, this.f98738b), 31), 31, this.d), 31), 31, this.f), 31), 31, this.f98741h);
        Integer num = this.i;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f98742j;
        int iD = p.a.d((this.k.hashCode() + ((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31, 31, this.f98743l);
        String str = this.f98744m;
        return this.f98745n.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98737a);
        dest.writeString(this.f98738b);
        dest.writeInt(this.f98739c);
        dest.writeString(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f98740g);
        dest.writeInt(this.f98741h ? 1 : 0);
        Integer num = this.i;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f98742j;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        this.k.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f98743l, dest);
        while (itV.hasNext()) {
            ((AsftBusinessHours) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f98744m);
        dest.writeString(this.f98745n.name());
    }
}
