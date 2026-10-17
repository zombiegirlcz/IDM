package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import cfl.j;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import k4l.d;
import k4l.o0;
import k4l.r0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;
import r6.b;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/InvestCommodityOrder;", "Lcom/revolut/retail/trading/core/domain/orders/InvestOrder;", "", "toString", "()Ljava/lang/String;", "ErrorCode", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestCommodityOrder implements InvestOrder {

    @NotNull
    public static final Parcelable.Creator<InvestCommodityOrder> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f104509c;
    public final z d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f104510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f104511h;
    public final o0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r0 f104512j;
    public final Pair k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dfl.o0 f104513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f104514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f104515n;
    public final dj0.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dj0.d f104516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dj0.d f104517q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dj0.d f104518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final BigDecimal f104519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Instant f104520t;
    public final sel.a u;
    public final Instant v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ErrorCode f104521w;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/InvestCommodityOrder$ErrorCode;", "Landroid/os/Parcelable;", "code", "", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ErrorCode implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ErrorCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f104522a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ErrorCode(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ErrorCode[i];
            }
        }

        public /* synthetic */ ErrorCode(int i) {
            this.f104522a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof ErrorCode) {
                return this.f104522a == ((ErrorCode) obj2).f104522a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f104522a);
        }

        public final String toString() {
            return j6.a.l(this.f104522a, "ErrorCode(code=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f104522a);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean bool;
            ErrorCode errorCodeCreateFromParcel;
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
            dj0.d dVar = (dj0.d) parcel.readSerializable();
            dj0.d dVar2 = (dj0.d) parcel.readSerializable();
            dj0.d dVar3 = (dj0.d) parcel.readSerializable();
            dj0.d dVar4 = (dj0.d) parcel.readSerializable();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            Instant instant4 = (Instant) parcel.readSerializable();
            sel.a aVarValueOf = parcel.readInt() == 0 ? null : sel.a.valueOf(parcel.readString());
            Instant instant5 = (Instant) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                errorCodeCreateFromParcel = null;
                bool = boolValueOf;
            } else {
                bool = boolValueOf;
                errorCodeCreateFromParcel = ErrorCode.CREATOR.createFromParcel(parcel);
            }
            return new InvestCommodityOrder(string, string2, dVarValueOf, zVarValueOf, instant, instant2, instant3, gVarValueOf, o0VarValueOf, r0VarValueOf, pair, o0Var, jVarValueOf, bool, dVar, dVar2, dVar3, dVar4, bigDecimal, instant4, aVarValueOf, instant5, errorCodeCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestCommodityOrder[i];
        }
    }

    public InvestCommodityOrder(String id10, String compoundId, d accountType, z instrumentType, Instant createdAt, Instant updatedAt, Instant instant, g side, o0 state, r0 orderType, Pair currencyPair, dfl.o0 o0Var, j accountHolderType, Boolean bool, dj0.d dVar, dj0.d value, dj0.d dVar2, dj0.d dVar3, BigDecimal bigDecimal, Instant instant2, sel.a aVar, Instant instant3, ErrorCode errorCode) {
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
        Intrinsics.checkNotNullParameter(value, "value");
        this.f104507a = id10;
        this.f104508b = compoundId;
        this.f104509c = accountType;
        this.d = instrumentType;
        this.e = createdAt;
        this.f = updatedAt;
        this.f104510g = instant;
        this.f104511h = side;
        this.i = state;
        this.f104512j = orderType;
        this.k = currencyPair;
        this.f104513l = o0Var;
        this.f104514m = accountHolderType;
        this.f104515n = bool;
        this.o = dVar;
        this.f104516p = value;
        this.f104517q = dVar2;
        this.f104518r = dVar3;
        this.f104519s = bigDecimal;
        this.f104520t = instant2;
        this.u = aVar;
        this.v = instant3;
        this.f104521w = errorCode;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: K1, reason: from getter */
    public final dfl.o0 getF104513l() {
        return this.f104513l;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: K7, reason: from getter */
    public final g getF104511h() {
        return this.f104511h;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: M2, reason: from getter */
    public final Instant getF() {
        return this.f;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: O3, reason: from getter */
    public final Instant getF104510g() {
        return this.f104510g;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: T0, reason: from getter */
    public final d getF104509c() {
        return this.f104509c;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: a3, reason: from getter */
    public final z getD() {
        return this.d;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: b8, reason: from getter */
    public final j getF104514m() {
        return this.f104514m;
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
        if (!(obj2 instanceof InvestCommodityOrder)) {
            return false;
        }
        InvestCommodityOrder investCommodityOrder = (InvestCommodityOrder) obj2;
        return Intrinsics.f(this.f104507a, investCommodityOrder.f104507a) && Intrinsics.f(this.f104508b, investCommodityOrder.f104508b) && this.f104509c == investCommodityOrder.f104509c && this.d == investCommodityOrder.d && Intrinsics.f(this.e, investCommodityOrder.e) && Intrinsics.f(this.f, investCommodityOrder.f) && Intrinsics.f(this.f104510g, investCommodityOrder.f104510g) && this.f104511h == investCommodityOrder.f104511h && this.i == investCommodityOrder.i && this.f104512j == investCommodityOrder.f104512j && Intrinsics.f(this.k, investCommodityOrder.k) && Intrinsics.f(this.f104513l, investCommodityOrder.f104513l) && this.f104514m == investCommodityOrder.f104514m && Intrinsics.f(this.f104515n, investCommodityOrder.f104515n) && Intrinsics.f(this.o, investCommodityOrder.o) && Intrinsics.f(this.f104516p, investCommodityOrder.f104516p) && Intrinsics.f(this.f104517q, investCommodityOrder.f104517q) && Intrinsics.f(this.f104518r, investCommodityOrder.f104518r) && Intrinsics.f(this.f104519s, investCommodityOrder.f104519s) && Intrinsics.f(this.f104520t, investCommodityOrder.f104520t) && this.u == investCommodityOrder.u && Intrinsics.f(this.v, investCommodityOrder.v) && Intrinsics.f(this.f104521w, investCommodityOrder.f104521w);
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getCreatedAt, reason: from getter */
    public final Instant getE() {
        return this.e;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF104507a() {
        return this.f104507a;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final o0 getI() {
        return this.i;
    }

    public final int hashCode() {
        int iC = b.c(b.c((this.d.hashCode() + ((this.f104509c.hashCode() + p.a.c(this.f104507a.hashCode() * 31, 31, this.f104508b)) * 31)) * 31, 31, this.e), 31, this.f);
        Instant instant = this.f104510g;
        int iHashCode = (this.k.hashCode() + com.revolut.data.database.models.openbanking.d.f(this.f104512j, (this.i.hashCode() + y.b(this.f104511h, (iC + (instant == null ? 0 : instant.hashCode())) * 31, 31)) * 31, 31)) * 31;
        dfl.o0 o0Var = this.f104513l;
        int iF = v7.f(this.f104514m, (iHashCode + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31);
        Boolean bool = this.f104515n;
        int iHashCode2 = (iF + (bool == null ? 0 : bool.hashCode())) * 31;
        dj0.d dVar = this.o;
        int iC2 = v7.c((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f104516p);
        dj0.d dVar2 = this.f104517q;
        int iHashCode3 = (iC2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f104518r;
        int iHashCode4 = (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        BigDecimal bigDecimal = this.f104519s;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Instant instant2 = this.f104520t;
        int iHashCode6 = (iHashCode5 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        sel.a aVar = this.u;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Instant instant3 = this.v;
        int iHashCode8 = (iHashCode7 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        ErrorCode errorCode = this.f104521w;
        return iHashCode8 + (errorCode != null ? Integer.hashCode(errorCode.f104522a) : 0);
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: k5, reason: from getter */
    public final String getF104508b() {
        return this.f104508b;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: t, reason: from getter */
    public final r0 getF104512j() {
        return this.f104512j;
    }

    @Override // com.revolut.retail.trading.core.domain.orders.InvestOrder
    /* JADX INFO: renamed from: u3, reason: from getter */
    public final Boolean getF104515n() {
        return this.f104515n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104507a);
        dest.writeString(this.f104508b);
        dest.writeString(this.f104509c.name());
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f104510g);
        dest.writeString(this.f104511h.name());
        dest.writeString(this.i.name());
        dest.writeString(this.f104512j.name());
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f104513l);
        dest.writeString(this.f104514m.name());
        Boolean bool = this.f104515n;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeSerializable(this.o);
        dest.writeSerializable(this.f104516p);
        dest.writeSerializable(this.f104517q);
        dest.writeSerializable(this.f104518r);
        dest.writeSerializable(this.f104519s);
        dest.writeSerializable(this.f104520t);
        sel.a aVar = this.u;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeSerializable(this.v);
        ErrorCode errorCode = this.f104521w;
        if (errorCode == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        int i2 = errorCode.f104522a;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(i2);
    }
}
