package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import cfl.j;
import dfl.q;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import k4l.d;
import k4l.e;
import k4l.o0;
import k4l.q0;
import k4l.r0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;
import r6.b;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/InvestFundOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestOrder;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestFundOrder implements InvestOrder {

    @NotNull
    public static final Parcelable.Creator<InvestFundOrder> CREATOR = new a();
    public final BigDecimal A;
    public final Instant B;
    public final Instant C;
    public final q0 D;
    public final Instant E;
    public final Instant F;
    public final TradingAutoTopUp G;
    public final String H;
    public final sel.a I;
    public final String J;
    public final e K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f104527c;
    public final z d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f104528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f104529h;
    public final o0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r0 f104530j;
    public final Pair k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dfl.o0 f104531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f104532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f104533n;
    public final InvestFundOrderData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dj0.d f104534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f104535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f104536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f104537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dj0.d f104538t;
    public final dj0.d u;
    public final BigDecimal v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dj0.d f104539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final dj0.d f104540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final dj0.d f104541y;
    public final dj0.d z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            d dVarValueOf = d.valueOf(parcel.readString());
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
            return new InvestFundOrder(string, string2, dVarValueOf, zVarValueOf, instant, instant2, instant3, gVarValueOf, o0VarValueOf, r0VarValueOf, pair, o0Var, jVarValueOf, boolValueOf, InvestFundOrderData.CREATOR.createFromParcel(parcel), (dj0.d) parcel.readSerializable(), parcel.readString(), (q) parcel.readSerializable(), parcel.readString(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), q0.valueOf(parcel.readString()), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (TradingAutoTopUp) parcel.readParcelable(InvestFundOrder.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : sel.a.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? e.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestFundOrder[i];
        }
    }

    public InvestFundOrder(String id10, String compoundId, d accountType, z instrumentType, Instant createdAt, Instant updatedAt, Instant instant, g side, o0 state, r0 orderType, Pair currencyPair, dfl.o0 o0Var, j accountHolderType, Boolean bool, InvestFundOrderData fundData, dj0.d dVar, String symbol, q value, String instrumentName, dj0.d estimatedNet, dj0.d estimatedPrice, BigDecimal estimatedQuantity, dj0.d estimatedTotal, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4, BigDecimal bigDecimal, Instant instant2, Instant instant3, q0 timeInForce, Instant instant4, Instant instant5, TradingAutoTopUp tradingAutoTopUp, String str, sel.a aVar, String portfolioId, e eVar) {
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
        Intrinsics.checkNotNullParameter(fundData, "fundData");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        Intrinsics.checkNotNullParameter(estimatedNet, "estimatedNet");
        Intrinsics.checkNotNullParameter(estimatedPrice, "estimatedPrice");
        Intrinsics.checkNotNullParameter(estimatedQuantity, "estimatedQuantity");
        Intrinsics.checkNotNullParameter(estimatedTotal, "estimatedTotal");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f104525a = id10;
        this.f104526b = compoundId;
        this.f104527c = accountType;
        this.d = instrumentType;
        this.e = createdAt;
        this.f = updatedAt;
        this.f104528g = instant;
        this.f104529h = side;
        this.i = state;
        this.f104530j = orderType;
        this.k = currencyPair;
        this.f104531l = o0Var;
        this.f104532m = accountHolderType;
        this.f104533n = bool;
        this.o = fundData;
        this.f104534p = dVar;
        this.f104535q = symbol;
        this.f104536r = value;
        this.f104537s = instrumentName;
        this.f104538t = estimatedNet;
        this.u = estimatedPrice;
        this.v = estimatedQuantity;
        this.f104539w = estimatedTotal;
        this.f104540x = dVar2;
        this.f104541y = dVar3;
        this.z = dVar4;
        this.A = bigDecimal;
        this.B = instant2;
        this.C = instant3;
        this.D = timeInForce;
        this.E = instant4;
        this.F = instant5;
        this.G = tradingAutoTopUp;
        this.H = str;
        this.I = aVar;
        this.J = portfolioId;
        this.K = eVar;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: K1, reason: from getter */
    public final dfl.o0 getF104594l() {
        return this.f104531l;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: K7, reason: from getter */
    public final g getF104592h() {
        return this.f104529h;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: M2, reason: from getter */
    public final Instant getF() {
        return this.f;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: O3, reason: from getter */
    public final Instant getF104591g() {
        return this.f104528g;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: T0, reason: from getter */
    public final d getF104590c() {
        return this.f104527c;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: a3, reason: from getter */
    public final z getD() {
        return this.d;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: b8, reason: from getter */
    public final j getF104595m() {
        return this.f104532m;
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
        if (!(obj2 instanceof InvestFundOrder)) {
            return false;
        }
        InvestFundOrder investFundOrder = (InvestFundOrder) obj2;
        return Intrinsics.f(this.f104525a, investFundOrder.f104525a) && Intrinsics.f(this.f104526b, investFundOrder.f104526b) && this.f104527c == investFundOrder.f104527c && this.d == investFundOrder.d && Intrinsics.f(this.e, investFundOrder.e) && Intrinsics.f(this.f, investFundOrder.f) && Intrinsics.f(this.f104528g, investFundOrder.f104528g) && this.f104529h == investFundOrder.f104529h && this.i == investFundOrder.i && this.f104530j == investFundOrder.f104530j && Intrinsics.f(this.k, investFundOrder.k) && Intrinsics.f(this.f104531l, investFundOrder.f104531l) && this.f104532m == investFundOrder.f104532m && Intrinsics.f(this.f104533n, investFundOrder.f104533n) && Intrinsics.f(this.o, investFundOrder.o) && Intrinsics.f(this.f104534p, investFundOrder.f104534p) && Intrinsics.f(this.f104535q, investFundOrder.f104535q) && Intrinsics.f(this.f104536r, investFundOrder.f104536r) && Intrinsics.f(this.f104537s, investFundOrder.f104537s) && Intrinsics.f(this.f104538t, investFundOrder.f104538t) && Intrinsics.f(this.u, investFundOrder.u) && Intrinsics.f(this.v, investFundOrder.v) && Intrinsics.f(this.f104539w, investFundOrder.f104539w) && Intrinsics.f(this.f104540x, investFundOrder.f104540x) && Intrinsics.f(this.f104541y, investFundOrder.f104541y) && Intrinsics.f(this.z, investFundOrder.z) && Intrinsics.f(this.A, investFundOrder.A) && Intrinsics.f(this.B, investFundOrder.B) && Intrinsics.f(this.C, investFundOrder.C) && this.D == investFundOrder.D && Intrinsics.f(this.E, investFundOrder.E) && Intrinsics.f(this.F, investFundOrder.F) && Intrinsics.f(this.G, investFundOrder.G) && Intrinsics.f(this.H, investFundOrder.H) && this.I == investFundOrder.I && Intrinsics.f(this.J, investFundOrder.J) && this.K == investFundOrder.K;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getCreatedAt, reason: from getter */
    public final Instant getE() {
        return this.e;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF104588a() {
        return this.f104525a;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final o0 getI() {
        return this.i;
    }

    public final int hashCode() {
        int iC = b.c(b.c((this.d.hashCode() + ((this.f104527c.hashCode() + p.a.c(this.f104525a.hashCode() * 31, 31, this.f104526b)) * 31)) * 31, 31, this.e), 31, this.f);
        Instant instant = this.f104528g;
        int iHashCode = (this.k.hashCode() + com.revolut.data.database.models.openbanking.d.f(this.f104530j, (this.i.hashCode() + y.b(this.f104529h, (iC + (instant == null ? 0 : instant.hashCode())) * 31, 31)) * 31, 31)) * 31;
        dfl.o0 o0Var = this.f104531l;
        int iF = v7.f(this.f104532m, (iHashCode + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        Boolean bool = this.f104533n;
        int iHashCode2 = (this.o.hashCode() + ((iF + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        dj0.d dVar = this.f104534p;
        int iC2 = v7.c(t61.a.d(this.v, v7.c(v7.c(p.a.c(v7.h(this.f104536r, p.a.c((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f104535q), 31), 31, this.f104537s), 31, this.f104538t), 31, this.u), 31), 31, this.f104539w);
        dj0.d dVar2 = this.f104540x;
        int iHashCode3 = (iC2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f104541y;
        int iHashCode4 = (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.z;
        int iHashCode5 = (iHashCode4 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        BigDecimal bigDecimal = this.A;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Instant instant2 = this.B;
        int iHashCode7 = (iHashCode6 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.C;
        int iHashCode8 = (this.D.hashCode() + ((iHashCode7 + (instant3 == null ? 0 : instant3.hashCode())) * 31)) * 31;
        Instant instant4 = this.E;
        int iHashCode9 = (iHashCode8 + (instant4 == null ? 0 : instant4.hashCode())) * 31;
        Instant instant5 = this.F;
        int iHashCode10 = (iHashCode9 + (instant5 == null ? 0 : instant5.hashCode())) * 31;
        TradingAutoTopUp tradingAutoTopUp = this.G;
        int iHashCode11 = (iHashCode10 + (tradingAutoTopUp == null ? 0 : tradingAutoTopUp.hashCode())) * 31;
        String str = this.H;
        int iHashCode12 = (iHashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        sel.a aVar = this.I;
        int iC3 = p.a.c((iHashCode12 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.J);
        e eVar = this.K;
        return iC3 + (eVar != null ? eVar.hashCode() : 0);
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: k5, reason: from getter */
    public final String getF104589b() {
        return this.f104526b;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: t, reason: from getter */
    public final r0 getF104593j() {
        return this.f104530j;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: u3, reason: from getter */
    public final Boolean getF104596n() {
        return this.f104533n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104525a);
        dest.writeString(this.f104526b);
        dest.writeString(this.f104527c.name());
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f104528g);
        dest.writeString(this.f104529h.name());
        dest.writeString(this.i.name());
        dest.writeString(this.f104530j.name());
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f104531l);
        dest.writeString(this.f104532m.name());
        Boolean bool = this.f104533n;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        this.o.writeToParcel(dest, i);
        dest.writeSerializable(this.f104534p);
        dest.writeString(this.f104535q);
        dest.writeSerializable(this.f104536r);
        dest.writeString(this.f104537s);
        dest.writeSerializable(this.f104538t);
        dest.writeSerializable(this.u);
        dest.writeSerializable(this.v);
        dest.writeSerializable(this.f104539w);
        dest.writeSerializable(this.f104540x);
        dest.writeSerializable(this.f104541y);
        dest.writeSerializable(this.z);
        dest.writeSerializable(this.A);
        dest.writeSerializable(this.B);
        dest.writeSerializable(this.C);
        dest.writeString(this.D.name());
        dest.writeSerializable(this.E);
        dest.writeSerializable(this.F);
        dest.writeParcelable(this.G, i);
        dest.writeString(this.H);
        sel.a aVar = this.I;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.J);
        e eVar = this.K;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
    }
}
