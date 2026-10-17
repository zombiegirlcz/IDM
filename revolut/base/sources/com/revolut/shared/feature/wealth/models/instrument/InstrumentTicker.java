package com.revolut.shared.feature.wealth.models.instrument;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ej0.b;
import ip0.v7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n0;
import nel.o0;
import nel.p0;
import nel.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/instrument/InstrumentTicker;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstrumentTicker implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InstrumentTicker> CREATOR = new a();
    public final OptionTickerDetails A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f105111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105113c;
    public final z d;
    public final d e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f105114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n0 f105115h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f105116j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f105117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f105118m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f105119n;
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f105120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f105121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f105122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f105123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f105124t;
    public final b u;
    public final p0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final BigDecimal f105125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final BigDecimal f105126x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BigDecimal f105127y;
    public final BigDecimal z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            o0 o0VarValueOf = o0.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            z zVarValueOf = z.valueOf(parcel.readString());
            d dVar = (d) parcel.readSerializable();
            b bVar = (b) parcel.readSerializable();
            b bVar2 = (b) parcel.readSerializable();
            n0 n0VarValueOf = n0.valueOf(parcel.readString());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new InstrumentTicker(o0VarValueOf, string, string2, zVarValueOf, dVar, bVar, bVar2, n0VarValueOf, z3, parcel.readInt() == 0 ? z : true, (d) parcel.readSerializable(), (b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), (d) parcel.readSerializable(), (b) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (b) parcel.readSerializable(), (b) parcel.readSerializable(), (b) parcel.readSerializable(), p0.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? OptionTickerDetails.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentTicker[i];
        }
    }

    public InstrumentTicker(o0 tickerType, String ref2, String symbol, z type, d price, b bVar, b bVar2, n0 status, boolean z, boolean z3, d dVar, b bVar3, Long l2, long j2, d dVar2, b bVar4, d dVar3, d dVar4, b bVar5, b bVar6, b bVar7, p0 tradingSession, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, OptionTickerDetails optionTickerDetails) {
        Intrinsics.checkNotNullParameter(tickerType, "tickerType");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        this.f105111a = tickerType;
        this.f105112b = ref2;
        this.f105113c = symbol;
        this.d = type;
        this.e = price;
        this.f = bVar;
        this.f105114g = bVar2;
        this.f105115h = status;
        this.i = z;
        this.f105116j = z3;
        this.k = dVar;
        this.f105117l = bVar3;
        this.f105118m = l2;
        this.f105119n = j2;
        this.o = dVar2;
        this.f105120p = bVar4;
        this.f105121q = dVar3;
        this.f105122r = dVar4;
        this.f105123s = bVar5;
        this.f105124t = bVar6;
        this.u = bVar7;
        this.v = tradingSession;
        this.f105125w = bigDecimal;
        this.f105126x = bigDecimal2;
        this.f105127y = bigDecimal3;
        this.z = bigDecimal4;
        this.A = optionTickerDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstrumentTicker)) {
            return false;
        }
        InstrumentTicker instrumentTicker = (InstrumentTicker) obj2;
        return this.f105111a == instrumentTicker.f105111a && Intrinsics.f(this.f105112b, instrumentTicker.f105112b) && Intrinsics.f(this.f105113c, instrumentTicker.f105113c) && this.d == instrumentTicker.d && Intrinsics.f(this.e, instrumentTicker.e) && Intrinsics.f(this.f, instrumentTicker.f) && Intrinsics.f(this.f105114g, instrumentTicker.f105114g) && this.f105115h == instrumentTicker.f105115h && this.i == instrumentTicker.i && this.f105116j == instrumentTicker.f105116j && Intrinsics.f(this.k, instrumentTicker.k) && Intrinsics.f(this.f105117l, instrumentTicker.f105117l) && Intrinsics.f(this.f105118m, instrumentTicker.f105118m) && this.f105119n == instrumentTicker.f105119n && Intrinsics.f(this.o, instrumentTicker.o) && Intrinsics.f(this.f105120p, instrumentTicker.f105120p) && Intrinsics.f(this.f105121q, instrumentTicker.f105121q) && Intrinsics.f(this.f105122r, instrumentTicker.f105122r) && Intrinsics.f(this.f105123s, instrumentTicker.f105123s) && Intrinsics.f(this.f105124t, instrumentTicker.f105124t) && Intrinsics.f(this.u, instrumentTicker.u) && this.v == instrumentTicker.v && Intrinsics.f(this.f105125w, instrumentTicker.f105125w) && Intrinsics.f(this.f105126x, instrumentTicker.f105126x) && Intrinsics.f(this.f105127y, instrumentTicker.f105127y) && Intrinsics.f(this.z, instrumentTicker.z) && Intrinsics.f(this.A, instrumentTicker.A);
    }

    public final int hashCode() {
        int iC = v7.c((this.d.hashCode() + p.a.c(p.a.c(this.f105111a.hashCode() * 31, 31, this.f105112b), 31, this.f105113c)) * 31, 31, this.e);
        b bVar = this.f;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f105114g;
        int iC2 = j6.a.c(j6.a.c((this.f105115h.hashCode() + ((iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31)) * 31, 31, this.i), 31, this.f105116j);
        d dVar = this.k;
        int iHashCode2 = (iC2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar3 = this.f105117l;
        int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        Long l2 = this.f105118m;
        int iC3 = a0.d.c((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f105119n);
        d dVar2 = this.o;
        int iHashCode4 = (iC3 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        b bVar4 = this.f105120p;
        int iHashCode5 = (iHashCode4 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        d dVar3 = this.f105121q;
        int iHashCode6 = (iHashCode5 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.f105122r;
        int iHashCode7 = (iHashCode6 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        b bVar5 = this.f105123s;
        int iHashCode8 = (iHashCode7 + (bVar5 == null ? 0 : bVar5.hashCode())) * 31;
        b bVar6 = this.f105124t;
        int iHashCode9 = (iHashCode8 + (bVar6 == null ? 0 : bVar6.hashCode())) * 31;
        b bVar7 = this.u;
        int iHashCode10 = (this.v.hashCode() + ((iHashCode9 + (bVar7 == null ? 0 : bVar7.hashCode())) * 31)) * 31;
        BigDecimal bigDecimal = this.f105125w;
        int iHashCode11 = (iHashCode10 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f105126x;
        int iHashCode12 = (iHashCode11 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f105127y;
        int iHashCode13 = (iHashCode12 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.z;
        int iHashCode14 = (iHashCode13 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        OptionTickerDetails optionTickerDetails = this.A;
        return iHashCode14 + (optionTickerDetails != null ? optionTickerDetails.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105111a.name());
        dest.writeString(this.f105112b);
        dest.writeString(this.f105113c);
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f105114g);
        dest.writeString(this.f105115h.name());
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f105116j ? 1 : 0);
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f105117l);
        Long l2 = this.f105118m;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeLong(this.f105119n);
        dest.writeSerializable(this.o);
        dest.writeSerializable(this.f105120p);
        dest.writeSerializable(this.f105121q);
        dest.writeSerializable(this.f105122r);
        dest.writeSerializable(this.f105123s);
        dest.writeSerializable(this.f105124t);
        dest.writeSerializable(this.u);
        dest.writeString(this.v.name());
        dest.writeSerializable(this.f105125w);
        dest.writeSerializable(this.f105126x);
        dest.writeSerializable(this.f105127y);
        dest.writeSerializable(this.z);
        OptionTickerDetails optionTickerDetails = this.A;
        if (optionTickerDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            optionTickerDetails.writeToParcel(dest, i);
        }
    }
}
