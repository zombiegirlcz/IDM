package com.revolut.retail.feature.airport.security_fast_track.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import bti.n;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/model/AsftPass;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftPass implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AsftPass> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f98714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f98715c;
    public final Instant d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f98716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f98717h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TimeZone f98718j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f98719l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Instant f98720m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Instant f98721n;
    public final OffsetDateTime o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f98722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f98723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Instant f98724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f98725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f98726t;
    public final AsftPassRefundBreakdown u;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String str;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            n nVarValueOf = n.valueOf(parcel.readString());
            Instant instant = (Instant) parcel.readSerializable();
            Instant instant2 = (Instant) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            TimeZone timeZone = (TimeZone) parcel.readSerializable();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Instant instant3 = (Instant) parcel.readSerializable();
            Instant instant4 = (Instant) parcel.readSerializable();
            OffsetDateTime offsetDateTime = (OffsetDateTime) parcel.readSerializable();
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            Instant instant5 = (Instant) parcel.readSerializable();
            int i2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                str = string;
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                str = string;
                int iA = 0;
                while (iA != i3) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(AsftPassAdmission.CREATOR, parcel, arrayList, iA, 1);
                    i3 = i3;
                    nVarValueOf = nVarValueOf;
                }
            }
            return new AsftPass(str, nVarValueOf, instant, instant2, string2, string3, string4, string5, string6, timeZone, string7, string8, instant3, instant4, offsetDateTime, bVar, i, instant5, i2, arrayList, parcel.readInt() == 0 ? null : AsftPassRefundBreakdown.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftPass[i];
        }
    }

    public AsftPass(String id10, n state, Instant bookingDate, Instant revealableDate, String cityName, String cipName, String cipLocation, String terminalName, String airportDescription, TimeZone airportTimeZone, String iataCode, String str, Instant instant, Instant instant2, OffsetDateTime offsetDateTime, b countryCode, int i, Instant instant3, int i2, List list, AsftPassRefundBreakdown asftPassRefundBreakdown) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(bookingDate, "bookingDate");
        Intrinsics.checkNotNullParameter(revealableDate, "revealableDate");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(cipName, "cipName");
        Intrinsics.checkNotNullParameter(cipLocation, "cipLocation");
        Intrinsics.checkNotNullParameter(terminalName, "terminalName");
        Intrinsics.checkNotNullParameter(airportDescription, "airportDescription");
        Intrinsics.checkNotNullParameter(airportTimeZone, "airportTimeZone");
        Intrinsics.checkNotNullParameter(iataCode, "iataCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f98713a = id10;
        this.f98714b = state;
        this.f98715c = bookingDate;
        this.d = revealableDate;
        this.e = cityName;
        this.f = cipName;
        this.f98716g = cipLocation;
        this.f98717h = terminalName;
        this.i = airportDescription;
        this.f98718j = airportTimeZone;
        this.k = iataCode;
        this.f98719l = str;
        this.f98720m = instant;
        this.f98721n = instant2;
        this.o = offsetDateTime;
        this.f98722p = countryCode;
        this.f98723q = i;
        this.f98724r = instant3;
        this.f98725s = i2;
        this.f98726t = list;
        this.u = asftPassRefundBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftPass)) {
            return false;
        }
        AsftPass asftPass = (AsftPass) obj2;
        return Intrinsics.f(this.f98713a, asftPass.f98713a) && this.f98714b == asftPass.f98714b && Intrinsics.f(this.f98715c, asftPass.f98715c) && Intrinsics.f(this.d, asftPass.d) && Intrinsics.f(this.e, asftPass.e) && Intrinsics.f(this.f, asftPass.f) && Intrinsics.f(this.f98716g, asftPass.f98716g) && Intrinsics.f(this.f98717h, asftPass.f98717h) && Intrinsics.f(this.i, asftPass.i) && Intrinsics.f(this.f98718j, asftPass.f98718j) && Intrinsics.f(this.k, asftPass.k) && Intrinsics.f(this.f98719l, asftPass.f98719l) && Intrinsics.f(this.f98720m, asftPass.f98720m) && Intrinsics.f(this.f98721n, asftPass.f98721n) && Intrinsics.f(this.o, asftPass.o) && Intrinsics.f(this.f98722p, asftPass.f98722p) && this.f98723q == asftPass.f98723q && Intrinsics.f(this.f98724r, asftPass.f98724r) && this.f98725s == asftPass.f98725s && Intrinsics.f(this.f98726t, asftPass.f98726t) && Intrinsics.f(this.u, asftPass.u);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f98718j.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(r6.b.c(r6.b.c((this.f98714b.hashCode() + (this.f98713a.hashCode() * 31)) * 31, 31, this.f98715c), 31, this.d), 31, this.e), 31, this.f), 31, this.f98716g), 31, this.f98717h), 31, this.i)) * 31, 31, this.k);
        String str = this.f98719l;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Instant instant = this.f98720m;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f98721n;
        int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.o;
        int iB = j6.a.b(this.f98723q, p.a.c((iHashCode3 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31, 31, this.f98722p.f297794a), 31);
        Instant instant3 = this.f98724r;
        int iB2 = j6.a.b(this.f98725s, (iB + (instant3 == null ? 0 : instant3.hashCode())) * 31, 31);
        List list = this.f98726t;
        int iHashCode4 = (iB2 + (list == null ? 0 : list.hashCode())) * 31;
        AsftPassRefundBreakdown asftPassRefundBreakdown = this.u;
        return iHashCode4 + (asftPassRefundBreakdown != null ? asftPassRefundBreakdown.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98713a);
        dest.writeString(this.f98714b.name());
        dest.writeSerializable(this.f98715c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f98716g);
        dest.writeString(this.f98717h);
        dest.writeString(this.i);
        dest.writeSerializable(this.f98718j);
        dest.writeString(this.k);
        dest.writeString(this.f98719l);
        dest.writeSerializable(this.f98720m);
        dest.writeSerializable(this.f98721n);
        dest.writeSerializable(this.o);
        dest.writeSerializable(this.f98722p);
        dest.writeInt(this.f98723q);
        dest.writeSerializable(this.f98724r);
        dest.writeInt(this.f98725s);
        List list = this.f98726t;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((AsftPassAdmission) itQ.next()).writeToParcel(dest, i);
            }
        }
        AsftPassRefundBreakdown asftPassRefundBreakdown = this.u;
        if (asftPassRefundBreakdown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            asftPassRefundBreakdown.writeToParcel(dest, i);
        }
    }
}
