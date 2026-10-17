package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import cfl.j;
import dfl.q;
import dj0.d;
import ej0.b;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import k4l.o0;
import k4l.q0;
import k4l.r0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/InvestMarginOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestOrder;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestMarginOrder implements InvestOrder {

    @NotNull
    public static final Parcelable.Creator<InvestMarginOrder> CREATOR = new a();
    public final d A;
    public final sel.a B;
    public final Instant C;
    public final Instant D;
    public final b E;
    public final q0 F;
    public final q G;
    public final d H;
    public final d I;
    public final BigDecimal J;
    public final d K;
    public final String L;
    public final String M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4l.d f104549c;
    public final z d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f104550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f104551h;
    public final o0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r0 f104552j;
    public final Pair k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dfl.o0 f104553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f104554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f104555n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BigDecimal f104556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final BigDecimal f104557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f104558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f104559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Instant f104560t;
    public final b u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TradingAutoTopUp f104561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f104562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Instant f104563y;
    public final String z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            k4l.d dVarValueOf = k4l.d.valueOf(parcel.readString());
            z zVarValueOf = z.valueOf(parcel.readString());
            Instant instant = (Instant) parcel.readSerializable();
            Instant instant2 = (Instant) parcel.readSerializable();
            Instant instant3 = (Instant) parcel.readSerializable();
            g gVarValueOf = g.valueOf(parcel.readString());
            o0 o0VarValueOf = o0.valueOf(parcel.readString());
            r0 r0VarValueOf = r0.valueOf(parcel.readString());
            Pair pair = (Pair) parcel.readSerializable();
            dfl.o0 o0Var = (dfl.o0) parcel.readSerializable();
            j jVarValueOf = j.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InvestMarginOrder(string, string2, dVarValueOf, zVarValueOf, instant, instant2, instant3, gVarValueOf, o0VarValueOf, r0VarValueOf, pair, o0Var, jVarValueOf, boolValueOf, parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (Instant) parcel.readSerializable(), (b) parcel.readSerializable(), (b) parcel.readSerializable(), (TradingAutoTopUp) parcel.readParcelable(InvestMarginOrder.class.getClassLoader()), (d) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readString(), (d) parcel.readSerializable(), parcel.readInt() != 0 ? sel.a.valueOf(parcel.readString()) : null, (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (b) parcel.readSerializable(), q0.valueOf(parcel.readString()), (q) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestMarginOrder[i];
        }
    }

    public InvestMarginOrder(String id10, String compoundId, k4l.d accountType, z instrumentType, Instant createdAt, Instant updatedAt, Instant instant, g side, o0 state, r0 orderType, Pair currencyPair, dfl.o0 o0Var, j accountHolderType, Boolean bool, String symbol, BigDecimal estimatedQuantity, BigDecimal bigDecimal, d dVar, d estimatedTotal, Instant instant2, b bVar, b bVar2, TradingAutoTopUp tradingAutoTopUp, d dVar2, Instant instant3, String instrumentName, d dVar3, sel.a aVar, Instant instant4, Instant instant5, b bVar3, q0 timeInForce, q value, d margin, d exposure, BigDecimal leverage, d totalMargin, String str, String portfolioId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(estimatedQuantity, "estimatedQuantity");
        Intrinsics.checkNotNullParameter(estimatedTotal, "estimatedTotal");
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(totalMargin, "totalMargin");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f104547a = id10;
        this.f104548b = compoundId;
        this.f104549c = accountType;
        this.d = instrumentType;
        this.e = createdAt;
        this.f = updatedAt;
        this.f104550g = instant;
        this.f104551h = side;
        this.i = state;
        this.f104552j = orderType;
        this.k = currencyPair;
        this.f104553l = o0Var;
        this.f104554m = accountHolderType;
        this.f104555n = bool;
        this.o = symbol;
        this.f104556p = estimatedQuantity;
        this.f104557q = bigDecimal;
        this.f104558r = dVar;
        this.f104559s = estimatedTotal;
        this.f104560t = instant2;
        this.u = bVar;
        this.v = bVar2;
        this.f104561w = tradingAutoTopUp;
        this.f104562x = dVar2;
        this.f104563y = instant3;
        this.z = instrumentName;
        this.A = dVar3;
        this.B = aVar;
        this.C = instant4;
        this.D = instant5;
        this.E = bVar3;
        this.F = timeInForce;
        this.G = value;
        this.H = margin;
        this.I = exposure;
        this.J = leverage;
        this.K = totalMargin;
        this.L = str;
        this.M = portfolioId;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: K1, reason: from getter */
    public final dfl.o0 getF104553l() {
        return this.f104553l;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: K7, reason: from getter */
    public final g getF104551h() {
        return this.f104551h;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: M2, reason: from getter */
    public final Instant getF() {
        return this.f;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: O3, reason: from getter */
    public final Instant getF104550g() {
        return this.f104550g;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: T0, reason: from getter */
    public final k4l.d getF104549c() {
        return this.f104549c;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: a3, reason: from getter */
    public final z getD() {
        return this.d;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: b8, reason: from getter */
    public final j getF104554m() {
        return this.f104554m;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: c1, reason: from getter */
    public final Pair getK() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestMarginOrder)) {
            return false;
        }
        InvestMarginOrder investMarginOrder = (InvestMarginOrder) obj2;
        return Intrinsics.f(this.f104547a, investMarginOrder.f104547a) && Intrinsics.f(this.f104548b, investMarginOrder.f104548b) && this.f104549c == investMarginOrder.f104549c && this.d == investMarginOrder.d && Intrinsics.f(this.e, investMarginOrder.e) && Intrinsics.f(this.f, investMarginOrder.f) && Intrinsics.f(this.f104550g, investMarginOrder.f104550g) && this.f104551h == investMarginOrder.f104551h && this.i == investMarginOrder.i && this.f104552j == investMarginOrder.f104552j && Intrinsics.f(this.k, investMarginOrder.k) && Intrinsics.f(this.f104553l, investMarginOrder.f104553l) && this.f104554m == investMarginOrder.f104554m && Intrinsics.f(this.f104555n, investMarginOrder.f104555n) && Intrinsics.f(this.o, investMarginOrder.o) && Intrinsics.f(this.f104556p, investMarginOrder.f104556p) && Intrinsics.f(this.f104557q, investMarginOrder.f104557q) && Intrinsics.f(this.f104558r, investMarginOrder.f104558r) && Intrinsics.f(this.f104559s, investMarginOrder.f104559s) && Intrinsics.f(this.f104560t, investMarginOrder.f104560t) && Intrinsics.f(this.u, investMarginOrder.u) && Intrinsics.f(this.v, investMarginOrder.v) && Intrinsics.f(this.f104561w, investMarginOrder.f104561w) && Intrinsics.f(this.f104562x, investMarginOrder.f104562x) && Intrinsics.f(this.f104563y, investMarginOrder.f104563y) && Intrinsics.f(this.z, investMarginOrder.z) && Intrinsics.f(this.A, investMarginOrder.A) && this.B == investMarginOrder.B && Intrinsics.f(this.C, investMarginOrder.C) && Intrinsics.f(this.D, investMarginOrder.D) && Intrinsics.f(this.E, investMarginOrder.E) && this.F == investMarginOrder.F && Intrinsics.f(this.G, investMarginOrder.G) && Intrinsics.f(this.H, investMarginOrder.H) && Intrinsics.f(this.I, investMarginOrder.I) && Intrinsics.f(this.J, investMarginOrder.J) && Intrinsics.f(this.K, investMarginOrder.K) && Intrinsics.f(this.L, investMarginOrder.L) && Intrinsics.f(this.M, investMarginOrder.M);
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getCreatedAt, reason: from getter */
    public final Instant getE() {
        return this.e;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF104547a() {
        return this.f104547a;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final o0 getI() {
        return this.i;
    }

    public final int hashCode() {
        int iC = r6.b.c(r6.b.c((this.d.hashCode() + ((this.f104549c.hashCode() + p.a.c(this.f104547a.hashCode() * 31, 31, this.f104548b)) * 31)) * 31, 31, this.e), 31, this.f);
        Instant instant = this.f104550g;
        int iHashCode = (this.k.hashCode() + com.revolut.data.database.models.openbanking.d.f(this.f104552j, (this.i.hashCode() + y.b(this.f104551h, (iC + (instant == null ? 0 : instant.hashCode())) * 31, 31)) * 31, 31)) * 31;
        dfl.o0 o0Var = this.f104553l;
        int iF = v7.f(this.f104554m, (iHashCode + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        Boolean bool = this.f104555n;
        int iD = t61.a.d(this.f104556p, p.a.c((iF + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.o), 31);
        BigDecimal bigDecimal = this.f104557q;
        int iHashCode2 = (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        d dVar = this.f104558r;
        int iC2 = v7.c((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f104559s);
        Instant instant2 = this.f104560t;
        int iHashCode3 = (iC2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        b bVar = this.u;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.v;
        int iHashCode5 = (iHashCode4 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        TradingAutoTopUp tradingAutoTopUp = this.f104561w;
        int iHashCode6 = (iHashCode5 + (tradingAutoTopUp == null ? 0 : tradingAutoTopUp.hashCode())) * 31;
        d dVar2 = this.f104562x;
        int iHashCode7 = (iHashCode6 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Instant instant3 = this.f104563y;
        int iC3 = p.a.c((iHashCode7 + (instant3 == null ? 0 : instant3.hashCode())) * 31, 31, this.z);
        d dVar3 = this.A;
        int iHashCode8 = (iC3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        sel.a aVar = this.B;
        int iHashCode9 = (iHashCode8 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Instant instant4 = this.C;
        int iHashCode10 = (iHashCode9 + (instant4 == null ? 0 : instant4.hashCode())) * 31;
        Instant instant5 = this.D;
        int iHashCode11 = (iHashCode10 + (instant5 == null ? 0 : instant5.hashCode())) * 31;
        b bVar3 = this.E;
        int iC4 = v7.c(t61.a.d(this.J, v7.c(v7.c(v7.h(this.G, (this.F.hashCode() + ((iHashCode11 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31)) * 31, 31), 31, this.H), 31, this.I), 31), 31, this.K);
        String str = this.L;
        return this.M.hashCode() + ((iC4 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: k5, reason: from getter */
    public final String getF104548b() {
        return this.f104548b;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: t, reason: from getter */
    public final r0 getF104552j() {
        return this.f104552j;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: u3, reason: from getter */
    public final Boolean getF104555n() {
        return this.f104555n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104547a);
        dest.writeString(this.f104548b);
        dest.writeString(this.f104549c.name());
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f104550g);
        dest.writeString(this.f104551h.name());
        dest.writeString(this.i.name());
        dest.writeString(this.f104552j.name());
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f104553l);
        dest.writeString(this.f104554m.name());
        Boolean bool = this.f104555n;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeString(this.o);
        dest.writeSerializable(this.f104556p);
        dest.writeSerializable(this.f104557q);
        dest.writeSerializable(this.f104558r);
        dest.writeSerializable(this.f104559s);
        dest.writeSerializable(this.f104560t);
        dest.writeSerializable(this.u);
        dest.writeSerializable(this.v);
        dest.writeParcelable(this.f104561w, i);
        dest.writeSerializable(this.f104562x);
        dest.writeSerializable(this.f104563y);
        dest.writeString(this.z);
        dest.writeSerializable(this.A);
        sel.a aVar = this.B;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeSerializable(this.C);
        dest.writeSerializable(this.D);
        dest.writeSerializable(this.E);
        dest.writeString(this.F.name());
        dest.writeSerializable(this.G);
        dest.writeSerializable(this.H);
        dest.writeSerializable(this.I);
        dest.writeSerializable(this.J);
        dest.writeSerializable(this.K);
        dest.writeString(this.L);
        dest.writeString(this.M);
    }
}
