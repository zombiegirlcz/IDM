package com.revolut.trading.orders.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import ip0.v7;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k4l.d;
import k4l.r0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import ne0.a;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/trading/orders/domain/models/InvestOrdersParams;", "", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "OrdersAll", "OrdersByCurrency", "OrdersByCurrencies", "a", "Lcom/revolut/trading/orders/domain/models/InvestOrdersParams$OrdersAll;", "Lcom/revolut/trading/orders/domain/models/InvestOrdersParams$OrdersByCurrencies;", "Lcom/revolut/trading/orders/domain/models/InvestOrdersParams$OrdersByCurrency;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InvestOrdersParams implements a, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/domain/models/InvestOrdersParams$OrdersAll;", "Lcom/revolut/trading/orders/domain/models/InvestOrdersParams;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrdersAll extends InvestOrdersParams {

        @NotNull
        public static final Parcelable.Creator<OrdersAll> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f106800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f106801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106802c;
        public final Boolean d;
        public final h0 e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Boolean boolValueOf2 = null;
                d dVarValueOf = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new OrdersAll(dVarValueOf, boolValueOf, string, boolValueOf2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrdersAll[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OrdersAll() {
            this((d) null, (Boolean) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 15);
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: T0, reason: from getter */
        public final d getF106807b() {
            return this.f106800a;
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: a */
        public final Set getF() {
            return this.e;
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Boolean getF106808c() {
            return this.f106801b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrdersAll)) {
                return false;
            }
            OrdersAll ordersAll = (OrdersAll) obj2;
            return this.f106800a == ordersAll.f106800a && Intrinsics.f(this.f106801b, ordersAll.f106801b) && Intrinsics.f(this.f106802c, ordersAll.f106802c) && Intrinsics.f(this.d, ordersAll.d);
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getD() {
            return this.f106802c;
        }

        public final int hashCode() {
            d dVar = this.f106800a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            Boolean bool = this.f106801b;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.f106802c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.d;
            return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: u3, reason: from getter */
        public final Boolean getE() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            d dVar = this.f106800a;
            if (dVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dVar.name());
            }
            Boolean bool = this.f106801b;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            dest.writeString(this.f106802c);
            Boolean bool2 = this.d;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool2);
            }
        }

        public OrdersAll(d dVar, Boolean bool, String str, Boolean bool2) {
            this.f106800a = dVar;
            this.f106801b = bool;
            this.f106802c = str;
            this.d = bool2;
            this.e = h0.f322473a;
        }

        public /* synthetic */ OrdersAll(d dVar, Boolean bool, String str, int i) {
            this((i & 1) != 0 ? null : dVar, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (Boolean) null);
        }
    }

    private InvestOrdersParams() {
    }

    /* JADX INFO: renamed from: T0 */
    public abstract d getF106807b();

    /* JADX INFO: renamed from: a */
    public abstract Set getF();

    public final List b() {
        List listC;
        Boolean f106808c = getF106808c();
        if (f106808c == null) {
            listC = null;
        } else if (f106808c.booleanValue()) {
            listC = u.c(r0.RECURRING);
        } else {
            EnumEntries enumEntriesA = r0.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : enumEntriesA) {
                if (!oi0.d.B((r0) obj2)) {
                    arrayList.add(obj2);
                }
            }
            listC = arrayList;
        }
        return listC == null ? f0.f322471a : listC;
    }

    /* JADX INFO: renamed from: c */
    public abstract Boolean getF106808c();

    public final InvestOrdersParams d(Boolean bool) {
        if (this instanceof OrdersAll) {
            OrdersAll ordersAll = (OrdersAll) this;
            return new OrdersAll(ordersAll.f106800a, bool, ordersAll.f106802c, ordersAll.d);
        }
        if (this instanceof OrdersByCurrency) {
            OrdersByCurrency ordersByCurrency = (OrdersByCurrency) this;
            b currency = ordersByCurrency.f106806a;
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new OrdersByCurrency(currency, ordersByCurrency.f106807b, bool, ordersByCurrency.d, ordersByCurrency.e);
        }
        if (!(this instanceof OrdersByCurrencies)) {
            throw new NoWhenBranchMatchedException();
        }
        OrdersByCurrencies ordersByCurrencies = (OrdersByCurrencies) this;
        Set currencies = ordersByCurrencies.f106803a;
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        return new OrdersByCurrencies(currencies, ordersByCurrencies.f106804b, bool, ordersByCurrencies.d, ordersByCurrencies.e);
    }

    /* JADX INFO: renamed from: g */
    public abstract String getD();

    @Override // ne0.a
    public final String getKey() throws IOException {
        d f106807b = getF106807b();
        String string = f106807b != null ? f106807b.toString() : null;
        Set f = getF();
        ArrayList arrayList = new ArrayList(w.t(f, 10));
        Iterator it8 = f.iterator();
        while (it8.hasNext()) {
            arrayList.add(((b) it8.next()).f306286a);
        }
        String strK0 = d0.k0(d0.O0(arrayList), ",", null, null, 0, null, 62);
        String str = strK0.length() > 0 ? strK0 : null;
        Boolean f106808c = getF106808c();
        Object[] elements = {"INVEST_ORDERS_KEY", string, str, f106808c != null ? com.google.android.gms.internal.mlkit_vision_face.a.r("standing=", f106808c.booleanValue()) : null, getD(), getE()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62);
    }

    /* JADX INFO: renamed from: u3 */
    public abstract Boolean getE();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/domain/models/InvestOrdersParams$OrdersByCurrencies;", "Lcom/revolut/trading/orders/domain/models/InvestOrdersParams;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrdersByCurrencies extends InvestOrdersParams {

        @NotNull
        public static final Parcelable.Creator<OrdersByCurrencies> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f106803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f106804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f106805c;
        public final String d;
        public final Boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                while (iD != i) {
                    iD = v7.d(parcel, linkedHashSet, iD, 1);
                }
                Boolean boolValueOf2 = null;
                d dVarValueOf = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new OrdersByCurrencies(linkedHashSet, dVarValueOf, boolValueOf, string, boolValueOf2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrdersByCurrencies[i];
            }
        }

        public OrdersByCurrencies(Set currencies, d dVar, Boolean bool, String str, Boolean bool2) {
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            this.f106803a = currencies;
            this.f106804b = dVar;
            this.f106805c = bool;
            this.d = str;
            this.e = bool2;
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: T0, reason: from getter */
        public final d getF106807b() {
            return this.f106804b;
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Set getF() {
            return this.f106803a;
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Boolean getF106808c() {
            return this.f106805c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrdersByCurrencies)) {
                return false;
            }
            OrdersByCurrencies ordersByCurrencies = (OrdersByCurrencies) obj2;
            return Intrinsics.f(this.f106803a, ordersByCurrencies.f106803a) && this.f106804b == ordersByCurrencies.f106804b && Intrinsics.f(this.f106805c, ordersByCurrencies.f106805c) && Intrinsics.f(this.d, ordersByCurrencies.d) && Intrinsics.f(this.e, ordersByCurrencies.e);
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = this.f106803a.hashCode() * 31;
            d dVar = this.f106804b;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Boolean bool = this.f106805c;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.e;
            return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: u3, reason: from getter */
        public final Boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f106803a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            d dVar = this.f106804b;
            if (dVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dVar.name());
            }
            Boolean bool = this.f106805c;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            dest.writeString(this.d);
            Boolean bool2 = this.e;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool2);
            }
        }

        public /* synthetic */ OrdersByCurrencies(Set set, d dVar, int i) {
            this(set, (i & 2) != 0 ? null : dVar, null, null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/domain/models/InvestOrdersParams$OrdersByCurrency;", "Lcom/revolut/trading/orders/domain/models/InvestOrdersParams;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrdersByCurrency extends InvestOrdersParams {

        @NotNull
        public static final Parcelable.Creator<OrdersByCurrency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f106806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f106807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f106808c;
        public final String d;
        public final Boolean e;
        public final Set f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVar = (b) parcel.readSerializable();
                Boolean boolValueOf2 = null;
                d dVarValueOf = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new OrdersByCurrency(bVar, dVarValueOf, boolValueOf, string, boolValueOf2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrdersByCurrency[i];
            }
        }

        public OrdersByCurrency(b currency, d dVar, Boolean bool, String str, Boolean bool2) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f106806a = currency;
            this.f106807b = dVar;
            this.f106808c = bool;
            this.d = str;
            this.e = bool2;
            this.f = y0.b(currency);
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: T0, reason: from getter */
        public final d getF106807b() {
            return this.f106807b;
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Set getF() {
            return this.f;
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Boolean getF106808c() {
            return this.f106808c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrdersByCurrency)) {
                return false;
            }
            OrdersByCurrency ordersByCurrency = (OrdersByCurrency) obj2;
            return Intrinsics.f(this.f106806a, ordersByCurrency.f106806a) && this.f106807b == ordersByCurrency.f106807b && Intrinsics.f(this.f106808c, ordersByCurrency.f106808c) && Intrinsics.f(this.d, ordersByCurrency.d) && Intrinsics.f(this.e, ordersByCurrency.e);
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = this.f106806a.hashCode() * 31;
            d dVar = this.f106807b;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Boolean bool = this.f106808c;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.e;
            return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Override // com.revolut.trading.orders.domain.models.InvestOrdersParams
        /* JADX INFO: renamed from: u3, reason: from getter */
        public final Boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f106806a);
            d dVar = this.f106807b;
            if (dVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dVar.name());
            }
            Boolean bool = this.f106808c;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            dest.writeString(this.d);
            Boolean bool2 = this.e;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool2);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ OrdersByCurrency(b bVar, d dVar, String str, int i) {
            Boolean bool = Boolean.TRUE;
            this(bVar, (i & 2) != 0 ? null : dVar, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool);
        }
    }
}
