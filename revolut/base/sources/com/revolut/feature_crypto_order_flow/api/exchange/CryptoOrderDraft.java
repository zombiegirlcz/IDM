package com.revolut.feature_crypto_order_flow.api.exchange;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature.recurring_buys.schedule.api.models.RecurringBuySettings;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dj0.d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kyh.g;
import kyh.i;
import m72.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import v1.c;
import wd6.e;
import wd6.h;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/api/exchange/CryptoOrderDraft;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kyh/i", "feature_crypto_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoOrderDraft implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoOrderDraft> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoExchangeContract$MoneyDetails f96689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoExchangeContract$MoneyDetails f96690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecurringBuySettings f96691c;
    public final g d;
    public final e e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f96692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigDecimal f96693h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f96694j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f96695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CryptoOrderPocketInfo f96696m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TakeProfitStopLoss f96697n;
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f96698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final OrderQuote f96699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final double f96700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Long f96701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f96702t;
    public final List u;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<CryptoExchangeContract$MoneyDetails> creator = CryptoExchangeContract$MoneyDetails.CREATOR;
            CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetailsCreateFromParcel = creator.createFromParcel(parcel);
            CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetailsCreateFromParcel2 = creator.createFromParcel(parcel);
            RecurringBuySettings recurringBuySettings = (RecurringBuySettings) parcel.readParcelable(CryptoOrderDraft.class.getClassLoader());
            g gVarValueOf = g.valueOf(parcel.readString());
            e eVarValueOf = e.valueOf(parcel.readString());
            h hVarValueOf = h.valueOf(parcel.readString());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CryptoOrderDraft.class, parcel, arrayList, iE, 1);
            }
            long j2 = parcel.readLong();
            boolean z = parcel.readInt() != 0;
            long j3 = parcel.readLong();
            CryptoOrderPocketInfo cryptoOrderPocketInfoCreateFromParcel = parcel.readInt() == 0 ? null : CryptoOrderPocketInfo.CREATOR.createFromParcel(parcel);
            TakeProfitStopLoss takeProfitStopLoss = (TakeProfitStopLoss) parcel.readParcelable(CryptoOrderDraft.class.getClassLoader());
            d dVar = (d) parcel.readSerializable();
            i iVarValueOf = parcel.readInt() == 0 ? null : i.valueOf(parcel.readString());
            OrderQuote orderQuote = (OrderQuote) parcel.readParcelable(CryptoOrderDraft.class.getClassLoader());
            double d = parcel.readDouble();
            Long lValueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readSerializable() != null) {
                throw new ClassCastException();
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iE2 = 0;
            while (true) {
                CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = cryptoExchangeContract$MoneyDetailsCreateFromParcel;
                if (iE2 == i2) {
                    return new CryptoOrderDraft(cryptoExchangeContract$MoneyDetailsCreateFromParcel, cryptoExchangeContract$MoneyDetailsCreateFromParcel2, recurringBuySettings, gVarValueOf, eVarValueOf, hVarValueOf, bigDecimal, bigDecimal2, arrayList, j2, z, j3, cryptoOrderPocketInfoCreateFromParcel, takeProfitStopLoss, dVar, iVarValueOf, orderQuote, d, lValueOf, z3, arrayList2);
                }
                iE2 = j6.a.e(CryptoOrderDraft.class, parcel, arrayList2, iE2, 1);
                cryptoExchangeContract$MoneyDetailsCreateFromParcel = cryptoExchangeContract$MoneyDetails;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoOrderDraft[i];
        }
    }

    public CryptoOrderDraft(CryptoExchangeContract$MoneyDetails topMoneyDetails, CryptoExchangeContract$MoneyDetails bottomMoneyDetails, RecurringBuySettings recurringBuySettings, g inputPosition, e exchangeMode, h orderType, BigDecimal bigDecimal, BigDecimal bigDecimal2, List limits, long j2, boolean z, long j3, CryptoOrderPocketInfo cryptoOrderPocketInfo, TakeProfitStopLoss takeProfitStopLoss, d dVar, i iVar, OrderQuote orderQuote, double d, Long l2, boolean z3, List balances) {
        Intrinsics.checkNotNullParameter(topMoneyDetails, "topMoneyDetails");
        Intrinsics.checkNotNullParameter(bottomMoneyDetails, "bottomMoneyDetails");
        Intrinsics.checkNotNullParameter(recurringBuySettings, "recurringBuySettings");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(balances, "balances");
        this.f96689a = topMoneyDetails;
        this.f96690b = bottomMoneyDetails;
        this.f96691c = recurringBuySettings;
        this.d = inputPosition;
        this.e = exchangeMode;
        this.f = orderType;
        this.f96692g = bigDecimal;
        this.f96693h = bigDecimal2;
        this.i = limits;
        this.f96694j = j2;
        this.k = z;
        this.f96695l = j3;
        this.f96696m = cryptoOrderPocketInfo;
        this.f96697n = takeProfitStopLoss;
        this.o = dVar;
        this.f96698p = iVar;
        this.f96699q = orderQuote;
        this.f96700r = d;
        this.f96701s = l2;
        this.f96702t = z3;
        this.u = balances;
    }

    public static CryptoOrderDraft a(CryptoOrderDraft cryptoOrderDraft, CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails, CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails2, RecurringBuySettings recurringBuySettings, g gVar, h hVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list, long j2, boolean z, long j3, CryptoOrderPocketInfo cryptoOrderPocketInfo, TakeProfitStopLoss takeProfitStopLoss, d dVar, i iVar, OrderQuote orderQuote, double d, Long l2, boolean z3, List list2, int i) {
        CryptoExchangeContract$MoneyDetails topMoneyDetails = (i & 1) != 0 ? cryptoOrderDraft.f96689a : cryptoExchangeContract$MoneyDetails;
        CryptoExchangeContract$MoneyDetails bottomMoneyDetails = (i & 2) != 0 ? cryptoOrderDraft.f96690b : cryptoExchangeContract$MoneyDetails2;
        RecurringBuySettings recurringBuySettings2 = (i & 4) != 0 ? cryptoOrderDraft.f96691c : recurringBuySettings;
        g inputPosition = (i & 8) != 0 ? cryptoOrderDraft.d : gVar;
        e exchangeMode = cryptoOrderDraft.e;
        h orderType = (i & 32) != 0 ? cryptoOrderDraft.f : hVar;
        BigDecimal bigDecimal3 = (i & 64) != 0 ? cryptoOrderDraft.f96692g : bigDecimal;
        BigDecimal bigDecimal4 = (i & 128) != 0 ? cryptoOrderDraft.f96693h : bigDecimal2;
        List limits = (i & 256) != 0 ? cryptoOrderDraft.i : list;
        long j5 = (i & 512) != 0 ? cryptoOrderDraft.f96694j : j2;
        boolean z4 = (i & 1024) != 0 ? cryptoOrderDraft.k : z;
        long j16 = (i & 2048) != 0 ? cryptoOrderDraft.f96695l : j3;
        BigDecimal bigDecimal5 = bigDecimal3;
        CryptoOrderPocketInfo cryptoOrderPocketInfo2 = (i & 4096) != 0 ? cryptoOrderDraft.f96696m : cryptoOrderPocketInfo;
        TakeProfitStopLoss takeProfitStopLoss2 = (i & 8192) != 0 ? cryptoOrderDraft.f96697n : takeProfitStopLoss;
        d dVar2 = (i & 16384) != 0 ? cryptoOrderDraft.o : dVar;
        i iVar2 = (i & 32768) != 0 ? cryptoOrderDraft.f96698p : iVar;
        OrderQuote orderQuote2 = (i & 65536) != 0 ? cryptoOrderDraft.f96699q : orderQuote;
        d dVar3 = dVar2;
        BigDecimal bigDecimal6 = bigDecimal4;
        double d5 = (i & 131072) != 0 ? cryptoOrderDraft.f96700r : d;
        OrderQuote orderQuote3 = orderQuote2;
        Long l3 = (i & 262144) != 0 ? cryptoOrderDraft.f96701s : l2;
        boolean z6 = (i & 524288) != 0 ? cryptoOrderDraft.f96702t : z3;
        cryptoOrderDraft.getClass();
        boolean z11 = z6;
        List balances = (i & PKIFailureInfo.badSenderNonce) != 0 ? cryptoOrderDraft.u : list2;
        cryptoOrderDraft.getClass();
        Intrinsics.checkNotNullParameter(topMoneyDetails, "topMoneyDetails");
        Intrinsics.checkNotNullParameter(bottomMoneyDetails, "bottomMoneyDetails");
        Intrinsics.checkNotNullParameter(recurringBuySettings2, "recurringBuySettings");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(balances, "balances");
        return new CryptoOrderDraft(topMoneyDetails, bottomMoneyDetails, recurringBuySettings2, inputPosition, exchangeMode, orderType, bigDecimal5, bigDecimal6, limits, j5, z4, j16, cryptoOrderPocketInfo2, takeProfitStopLoss2, dVar3, iVar2, orderQuote3, d5, l3, z11, balances);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoOrderDraft)) {
            return false;
        }
        CryptoOrderDraft cryptoOrderDraft = (CryptoOrderDraft) obj2;
        return Intrinsics.f(this.f96689a, cryptoOrderDraft.f96689a) && Intrinsics.f(this.f96690b, cryptoOrderDraft.f96690b) && Intrinsics.f(this.f96691c, cryptoOrderDraft.f96691c) && this.d == cryptoOrderDraft.d && this.e == cryptoOrderDraft.e && this.f == cryptoOrderDraft.f && Intrinsics.f(this.f96692g, cryptoOrderDraft.f96692g) && Intrinsics.f(this.f96693h, cryptoOrderDraft.f96693h) && Intrinsics.f(this.i, cryptoOrderDraft.i) && this.f96694j == cryptoOrderDraft.f96694j && this.k == cryptoOrderDraft.k && this.f96695l == cryptoOrderDraft.f96695l && Intrinsics.f(this.f96696m, cryptoOrderDraft.f96696m) && Intrinsics.f(this.f96697n, cryptoOrderDraft.f96697n) && Intrinsics.f(this.o, cryptoOrderDraft.o) && this.f96698p == cryptoOrderDraft.f96698p && Intrinsics.f(this.f96699q, cryptoOrderDraft.f96699q) && Double.compare(this.f96700r, cryptoOrderDraft.f96700r) == 0 && Intrinsics.f(this.f96701s, cryptoOrderDraft.f96701s) && this.f96702t == cryptoOrderDraft.f96702t && Intrinsics.f(this.u, cryptoOrderDraft.u);
    }

    public final int hashCode() {
        int iB = c.b(this.f, y.g(this.e, (this.d.hashCode() + ((this.f96691c.hashCode() + ((this.f96690b.hashCode() + (this.f96689a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31);
        BigDecimal bigDecimal = this.f96692g;
        int iHashCode = (iB + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f96693h;
        int iC = a0.d.c(j6.a.c(a0.d.c(p.a.d((iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31, 31, this.i), 31, this.f96694j), 31, this.k), 31, this.f96695l);
        CryptoOrderPocketInfo cryptoOrderPocketInfo = this.f96696m;
        int iHashCode2 = (iC + (cryptoOrderPocketInfo == null ? 0 : cryptoOrderPocketInfo.hashCode())) * 31;
        TakeProfitStopLoss takeProfitStopLoss = this.f96697n;
        int iHashCode3 = (iHashCode2 + (takeProfitStopLoss == null ? 0 : takeProfitStopLoss.hashCode())) * 31;
        d dVar = this.o;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i iVar = this.f96698p;
        int iHashCode5 = (iHashCode4 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        OrderQuote orderQuote = this.f96699q;
        int iC2 = b.c((iHashCode5 + (orderQuote == null ? 0 : orderQuote.hashCode())) * 31, this.f96700r, 31);
        Long l2 = this.f96701s;
        return this.u.hashCode() + j6.a.c((iC2 + (l2 != null ? l2.hashCode() : 0)) * 31, 961, this.f96702t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f96689a.writeToParcel(dest, i);
        this.f96690b.writeToParcel(dest, i);
        dest.writeParcelable(this.f96691c, i);
        dest.writeString(this.d.name());
        dest.writeString(this.e.name());
        dest.writeString(this.f.name());
        dest.writeSerializable(this.f96692g);
        dest.writeSerializable(this.f96693h);
        Iterator itV = p.a.v(this.i, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeLong(this.f96694j);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeLong(this.f96695l);
        CryptoOrderPocketInfo cryptoOrderPocketInfo = this.f96696m;
        if (cryptoOrderPocketInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cryptoOrderPocketInfo.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f96697n, i);
        dest.writeSerializable(this.o);
        i iVar = this.f96698p;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iVar.name());
        }
        dest.writeParcelable(this.f96699q, i);
        dest.writeDouble(this.f96700r);
        Long l2 = this.f96701s;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeInt(this.f96702t ? 1 : 0);
        dest.writeSerializable(null);
        Iterator itV2 = p.a.v(this.u, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }
}
