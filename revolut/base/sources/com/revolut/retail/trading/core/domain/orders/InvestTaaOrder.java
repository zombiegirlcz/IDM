package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import cfl.j;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/InvestTaaOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestOrder$InvestSecuritiesOrder;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestTaaOrder implements InvestOrder.InvestSecuritiesOrder {

    @NotNull
    public static final Parcelable.Creator<InvestTaaOrder> CREATOR = new a();
    public final Instant A;
    public final q0 B;
    public final Instant C;
    public final Instant D;
    public final TradingAutoTopUp E;
    public final String F;
    public final sel.a G;
    public final String H;
    public final e I;
    public final Boolean J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f104632c;
    public final z d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f104633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f104634h;
    public final o0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r0 f104635j;
    public final Pair k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dfl.o0 f104636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f104637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dj0.d f104638n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f104639p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f104640q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dj0.d f104641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dj0.d f104642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BigDecimal f104643t;
    public final dj0.d u;
    public final dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dj0.d f104644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final dj0.d f104645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BigDecimal f104646y;
    public final Instant z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
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
            dj0.d dVar = (dj0.d) parcel.readSerializable();
            String string3 = parcel.readString();
            q qVar = (q) parcel.readSerializable();
            String string4 = parcel.readString();
            dj0.d dVar2 = (dj0.d) parcel.readSerializable();
            dj0.d dVar3 = (dj0.d) parcel.readSerializable();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            dj0.d dVar4 = (dj0.d) parcel.readSerializable();
            dj0.d dVar5 = (dj0.d) parcel.readSerializable();
            dj0.d dVar6 = (dj0.d) parcel.readSerializable();
            dj0.d dVar7 = (dj0.d) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            Instant instant4 = (Instant) parcel.readSerializable();
            Instant instant5 = (Instant) parcel.readSerializable();
            q0 q0VarValueOf = q0.valueOf(parcel.readString());
            Instant instant6 = (Instant) parcel.readSerializable();
            Instant instant7 = (Instant) parcel.readSerializable();
            TradingAutoTopUp tradingAutoTopUp = (TradingAutoTopUp) parcel.readParcelable(InvestTaaOrder.class.getClassLoader());
            String string5 = parcel.readString();
            Boolean boolValueOf = null;
            sel.a aVarValueOf = parcel.readInt() == 0 ? null : sel.a.valueOf(parcel.readString());
            String string6 = parcel.readString();
            e eVarValueOf = parcel.readInt() == 0 ? null : e.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InvestTaaOrder(string, string2, dVarValueOf, zVarValueOf, instant, instant2, instant3, gVarValueOf, o0VarValueOf, r0VarValueOf, pair, o0Var, jVarValueOf, dVar, string3, qVar, string4, dVar2, dVar3, bigDecimal, dVar4, dVar5, dVar6, dVar7, bigDecimal2, instant4, instant5, q0VarValueOf, instant6, instant7, tradingAutoTopUp, string5, aVarValueOf, string6, eVarValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestTaaOrder[i];
        }
    }

    public InvestTaaOrder(String id10, String compoundId, d accountType, z instrumentType, Instant createdAt, Instant updatedAt, Instant instant, g side, o0 state, r0 orderType, Pair currencyPair, dfl.o0 o0Var, j accountHolderType, dj0.d dVar, String symbol, q value, String instrumentName, dj0.d estimatedNet, dj0.d estimatedPrice, BigDecimal estimatedQuantity, dj0.d estimatedTotal, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4, BigDecimal bigDecimal, Instant instant2, Instant instant3, q0 timeInForce, Instant instant4, Instant instant5, TradingAutoTopUp tradingAutoTopUp, String str, sel.a aVar, String portfolioId, e eVar, Boolean bool) {
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
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        Intrinsics.checkNotNullParameter(estimatedNet, "estimatedNet");
        Intrinsics.checkNotNullParameter(estimatedPrice, "estimatedPrice");
        Intrinsics.checkNotNullParameter(estimatedQuantity, "estimatedQuantity");
        Intrinsics.checkNotNullParameter(estimatedTotal, "estimatedTotal");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f104630a = id10;
        this.f104631b = compoundId;
        this.f104632c = accountType;
        this.d = instrumentType;
        this.e = createdAt;
        this.f = updatedAt;
        this.f104633g = instant;
        this.f104634h = side;
        this.i = state;
        this.f104635j = orderType;
        this.k = currencyPair;
        this.f104636l = o0Var;
        this.f104637m = accountHolderType;
        this.f104638n = dVar;
        this.o = symbol;
        this.f104639p = value;
        this.f104640q = instrumentName;
        this.f104641r = estimatedNet;
        this.f104642s = estimatedPrice;
        this.f104643t = estimatedQuantity;
        this.u = estimatedTotal;
        this.v = dVar2;
        this.f104644w = dVar3;
        this.f104645x = dVar4;
        this.f104646y = bigDecimal;
        this.z = instant2;
        this.A = instant3;
        this.B = timeInForce;
        this.C = instant4;
        this.D = instant5;
        this.E = tradingAutoTopUp;
        this.F = str;
        this.G = aVar;
        this.H = portfolioId;
        this.I = eVar;
        this.J = bool;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: B1, reason: from getter */
    public final dj0.d getF104638n() {
        return this.f104638n;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: K1, reason: from getter */
    public final dfl.o0 getF104636l() {
        return this.f104636l;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: K7, reason: from getter */
    public final g getF104634h() {
        return this.f104634h;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: L, reason: from getter */
    public final sel.a getG() {
        return this.G;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: M2, reason: from getter */
    public final Instant getF() {
        return this.f;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: O1, reason: from getter */
    public final String getF104640q() {
        return this.f104640q;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: O3, reason: from getter */
    public final Instant getF104633g() {
        return this.f104633g;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: O4, reason: from getter */
    public final dj0.d getF104642s() {
        return this.f104642s;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final Instant getC() {
        return this.C;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: T0, reason: from getter */
    public final d getF104632c() {
        return this.f104632c;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: T2, reason: from getter */
    public final q0 getB() {
        return this.B;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: W1, reason: from getter */
    public final dj0.d getV() {
        return this.v;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: X, reason: from getter */
    public final e getI() {
        return this.I;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: Z7, reason: from getter */
    public final Instant getD() {
        return this.D;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: a3, reason: from getter */
    public final z getD() {
        return this.d;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: b8, reason: from getter */
    public final j getF104637m() {
        return this.f104637m;
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
        if (!(obj2 instanceof InvestTaaOrder)) {
            return false;
        }
        InvestTaaOrder investTaaOrder = (InvestTaaOrder) obj2;
        return Intrinsics.f(this.f104630a, investTaaOrder.f104630a) && Intrinsics.f(this.f104631b, investTaaOrder.f104631b) && this.f104632c == investTaaOrder.f104632c && this.d == investTaaOrder.d && Intrinsics.f(this.e, investTaaOrder.e) && Intrinsics.f(this.f, investTaaOrder.f) && Intrinsics.f(this.f104633g, investTaaOrder.f104633g) && this.f104634h == investTaaOrder.f104634h && this.i == investTaaOrder.i && this.f104635j == investTaaOrder.f104635j && Intrinsics.f(this.k, investTaaOrder.k) && Intrinsics.f(this.f104636l, investTaaOrder.f104636l) && this.f104637m == investTaaOrder.f104637m && Intrinsics.f(this.f104638n, investTaaOrder.f104638n) && Intrinsics.f(this.o, investTaaOrder.o) && Intrinsics.f(this.f104639p, investTaaOrder.f104639p) && Intrinsics.f(this.f104640q, investTaaOrder.f104640q) && Intrinsics.f(this.f104641r, investTaaOrder.f104641r) && Intrinsics.f(this.f104642s, investTaaOrder.f104642s) && Intrinsics.f(this.f104643t, investTaaOrder.f104643t) && Intrinsics.f(this.u, investTaaOrder.u) && Intrinsics.f(this.v, investTaaOrder.v) && Intrinsics.f(this.f104644w, investTaaOrder.f104644w) && Intrinsics.f(this.f104645x, investTaaOrder.f104645x) && Intrinsics.f(this.f104646y, investTaaOrder.f104646y) && Intrinsics.f(this.z, investTaaOrder.z) && Intrinsics.f(this.A, investTaaOrder.A) && this.B == investTaaOrder.B && Intrinsics.f(this.C, investTaaOrder.C) && Intrinsics.f(this.D, investTaaOrder.D) && Intrinsics.f(this.E, investTaaOrder.E) && Intrinsics.f(this.F, investTaaOrder.F) && this.G == investTaaOrder.G && Intrinsics.f(this.H, investTaaOrder.H) && this.I == investTaaOrder.I && Intrinsics.f(this.J, investTaaOrder.J);
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getH() {
        return this.H;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: g7, reason: from getter */
    public final Instant getZ() {
        return this.z;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: getAutoTopUp, reason: from getter */
    public final TradingAutoTopUp getE() {
        return this.E;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getCreatedAt, reason: from getter */
    public final Instant getE() {
        return this.e;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF104630a() {
        return this.f104630a;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final o0 getI() {
        return this.i;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: getSymbol, reason: from getter */
    public final String getO() {
        return this.o;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final q getF104639p() {
        return this.f104639p;
    }

    public final int hashCode() {
        int iC = b.c(b.c((this.d.hashCode() + ((this.f104632c.hashCode() + p.a.c(this.f104630a.hashCode() * 31, 31, this.f104631b)) * 31)) * 31, 31, this.e), 31, this.f);
        Instant instant = this.f104633g;
        int iHashCode = (this.k.hashCode() + com.revolut.data.database.models.openbanking.d.f(this.f104635j, (this.i.hashCode() + y.b(this.f104634h, (iC + (instant == null ? 0 : instant.hashCode())) * 31, 31)) * 31, 31)) * 31;
        dfl.o0 o0Var = this.f104636l;
        int iF = v7.f(this.f104637m, (iHashCode + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        dj0.d dVar = this.f104638n;
        int iC2 = v7.c(t61.a.d(this.f104643t, v7.c(v7.c(p.a.c(v7.h(this.f104639p, p.a.c((iF + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.o), 31), 31, this.f104640q), 31, this.f104641r), 31, this.f104642s), 31), 31, this.u);
        dj0.d dVar2 = this.v;
        int iHashCode2 = (iC2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f104644w;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.f104645x;
        int iHashCode4 = (iHashCode3 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        BigDecimal bigDecimal = this.f104646y;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Instant instant2 = this.z;
        int iHashCode6 = (iHashCode5 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.A;
        int iHashCode7 = (this.B.hashCode() + ((iHashCode6 + (instant3 == null ? 0 : instant3.hashCode())) * 31)) * 31;
        Instant instant4 = this.C;
        int iHashCode8 = (iHashCode7 + (instant4 == null ? 0 : instant4.hashCode())) * 31;
        Instant instant5 = this.D;
        int iHashCode9 = (iHashCode8 + (instant5 == null ? 0 : instant5.hashCode())) * 31;
        TradingAutoTopUp tradingAutoTopUp = this.E;
        int iHashCode10 = (iHashCode9 + (tradingAutoTopUp == null ? 0 : tradingAutoTopUp.hashCode())) * 31;
        String str = this.F;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        sel.a aVar = this.G;
        int iC3 = p.a.c((iHashCode11 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.H);
        e eVar = this.I;
        int iHashCode12 = (iC3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Boolean bool = this.J;
        return iHashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final Instant getA() {
        return this.A;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: j1, reason: from getter */
    public final BigDecimal getF104643t() {
        return this.f104643t;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: k4, reason: from getter */
    public final dj0.d getU() {
        return this.u;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: k5, reason: from getter */
    public final String getF104631b() {
        return this.f104631b;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: q4, reason: from getter */
    public final dj0.d getF104645x() {
        return this.f104645x;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: r2, reason: from getter */
    public final dj0.d getF104641r() {
        return this.f104641r;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder
    /* JADX INFO: renamed from: s3, reason: from getter */
    public final BigDecimal getF104646y() {
        return this.f104646y;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: t, reason: from getter */
    public final r0 getF104635j() {
        return this.f104635j;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: u3, reason: from getter */
    public final Boolean getJ() {
        return this.J;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104630a);
        dest.writeString(this.f104631b);
        dest.writeString(this.f104632c.name());
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f104633g);
        dest.writeString(this.f104634h.name());
        dest.writeString(this.i.name());
        dest.writeString(this.f104635j.name());
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f104636l);
        dest.writeString(this.f104637m.name());
        dest.writeSerializable(this.f104638n);
        dest.writeString(this.o);
        dest.writeSerializable(this.f104639p);
        dest.writeString(this.f104640q);
        dest.writeSerializable(this.f104641r);
        dest.writeSerializable(this.f104642s);
        dest.writeSerializable(this.f104643t);
        dest.writeSerializable(this.u);
        dest.writeSerializable(this.v);
        dest.writeSerializable(this.f104644w);
        dest.writeSerializable(this.f104645x);
        dest.writeSerializable(this.f104646y);
        dest.writeSerializable(this.z);
        dest.writeSerializable(this.A);
        dest.writeString(this.B.name());
        dest.writeSerializable(this.C);
        dest.writeSerializable(this.D);
        dest.writeParcelable(this.E, i);
        dest.writeString(this.F);
        sel.a aVar = this.G;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.H);
        e eVar = this.I;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
        Boolean bool = this.J;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
