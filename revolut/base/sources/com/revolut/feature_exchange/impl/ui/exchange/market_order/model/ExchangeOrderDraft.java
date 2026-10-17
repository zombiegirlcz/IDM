package com.revolut.feature_exchange.impl.ui.exchange.market_order.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dj0.d;
import f8l.f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import r1i.b;
import wd6.c;
import wd6.e;
import wd6.h;
import wd6.i;
import wp5.y;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange/market_order/model/ExchangeOrderDraft;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "r1i/b", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeOrderDraft implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExchangeOrderDraft> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyDetails f96879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyDetails f96880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f96881c;
    public final i d;
    public final h e;
    public final TakeProfitStopLoss f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r1i.h f96882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigDecimal f96883h;
    public final BigDecimal i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f96884j;
    public final Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final double f96885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f96886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f96887n;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f96888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f96889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f96890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final OrderQuote f96891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f96892t;
    public final Set u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f96893w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f96894x;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<MoneyDetails> creator = MoneyDetails.CREATOR;
            MoneyDetails moneyDetailsCreateFromParcel = creator.createFromParcel(parcel);
            MoneyDetails moneyDetailsCreateFromParcel2 = creator.createFromParcel(parcel);
            e eVarValueOf = e.valueOf(parcel.readString());
            i iVarValueOf = i.valueOf(parcel.readString());
            h hVarValueOf = h.valueOf(parcel.readString());
            TakeProfitStopLoss takeProfitStopLoss = (TakeProfitStopLoss) parcel.readParcelable(ExchangeOrderDraft.class.getClassLoader());
            r1i.h hVarValueOf2 = r1i.h.valueOf(parcel.readString());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int i2 = 0;
            while (i2 != i) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(ExchangeOrderDraft.class.getClassLoader()));
                i2++;
                i = i;
            }
            double d = parcel.readDouble();
            boolean z = parcel.readInt() != 0;
            d dVar = (d) parcel.readSerializable();
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            c cVarValueOf = c.valueOf(parcel.readString());
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int iE = 0;
            while (iE != i3) {
                iE = j6.a.e(ExchangeOrderDraft.class, parcel, arrayList, iE, 1);
                i3 = i3;
            }
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readSerializable() != null) {
                throw new ClassCastException();
            }
            OrderQuote orderQuote = (OrderQuote) parcel.readParcelable(ExchangeOrderDraft.class.getClassLoader());
            Double d5 = dValueOf;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashSet2.add(xi0.e.valueOf(parcel.readString()));
                }
                linkedHashSet = linkedHashSet2;
            }
            return new ExchangeOrderDraft(moneyDetailsCreateFromParcel, moneyDetailsCreateFromParcel2, eVarValueOf, iVarValueOf, hVarValueOf, takeProfitStopLoss, hVarValueOf2, bigDecimal, bigDecimal2, lValueOf, linkedHashMap, d, z, dVar, bVarValueOf, cVarValueOf, arrayList, d5, orderQuote, z3, linkedHashSet, parcel.readString(), parcel.readInt() == 0 ? null : f.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangeOrderDraft[i];
        }
    }

    public ExchangeOrderDraft(MoneyDetails topMoneyDetails, MoneyDetails bottomMoneyDetails, e exchangeMode, i exchangePocketType, h orderType, TakeProfitStopLoss takeProfitStopLoss, r1i.h inputPosition, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l2, Map pockets, double d, boolean z, d dVar, b bVar, c currencyMode, List limits, Double d5, OrderQuote orderQuote, boolean z3, Set set, String idempotencyKey, f fVar, String str) {
        Intrinsics.checkNotNullParameter(topMoneyDetails, "topMoneyDetails");
        Intrinsics.checkNotNullParameter(bottomMoneyDetails, "bottomMoneyDetails");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(exchangePocketType, "exchangePocketType");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f96879a = topMoneyDetails;
        this.f96880b = bottomMoneyDetails;
        this.f96881c = exchangeMode;
        this.d = exchangePocketType;
        this.e = orderType;
        this.f = takeProfitStopLoss;
        this.f96882g = inputPosition;
        this.f96883h = bigDecimal;
        this.i = bigDecimal2;
        this.f96884j = l2;
        this.k = pockets;
        this.f96885l = d;
        this.f96886m = z;
        this.f96887n = dVar;
        this.o = bVar;
        this.f96888p = currencyMode;
        this.f96889q = limits;
        this.f96890r = d5;
        this.f96891s = orderQuote;
        this.f96892t = z3;
        this.u = set;
        this.v = idempotencyKey;
        this.f96893w = fVar;
        this.f96894x = str;
    }

    public static ExchangeOrderDraft a(ExchangeOrderDraft exchangeOrderDraft, MoneyDetails moneyDetails, MoneyDetails moneyDetails2, e eVar, i iVar, h hVar, TakeProfitStopLoss takeProfitStopLoss, r1i.h hVar2, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l2, Map map, double d, boolean z, d dVar, b bVar, List list, OrderQuote orderQuote, boolean z3, int i) {
        MoneyDetails topMoneyDetails = (i & 1) != 0 ? exchangeOrderDraft.f96879a : moneyDetails;
        MoneyDetails bottomMoneyDetails = (i & 2) != 0 ? exchangeOrderDraft.f96880b : moneyDetails2;
        e exchangeMode = (i & 4) != 0 ? exchangeOrderDraft.f96881c : eVar;
        i exchangePocketType = (i & 8) != 0 ? exchangeOrderDraft.d : iVar;
        h orderType = (i & 16) != 0 ? exchangeOrderDraft.e : hVar;
        TakeProfitStopLoss takeProfitStopLoss2 = (i & 32) != 0 ? exchangeOrderDraft.f : takeProfitStopLoss;
        r1i.h inputPosition = (i & 64) != 0 ? exchangeOrderDraft.f96882g : hVar2;
        BigDecimal bigDecimal3 = (i & 128) != 0 ? exchangeOrderDraft.f96883h : bigDecimal;
        BigDecimal bigDecimal4 = (i & 256) != 0 ? exchangeOrderDraft.i : bigDecimal2;
        Long l3 = (i & 512) != 0 ? exchangeOrderDraft.f96884j : l2;
        Map pockets = (i & 1024) != 0 ? exchangeOrderDraft.k : map;
        double d5 = (i & 2048) != 0 ? exchangeOrderDraft.f96885l : d;
        boolean z4 = (i & 4096) != 0 ? exchangeOrderDraft.f96886m : z;
        d dVar2 = (i & 8192) != 0 ? exchangeOrderDraft.f96887n : dVar;
        b bVar2 = (i & 16384) != 0 ? exchangeOrderDraft.o : bVar;
        c currencyMode = exchangeOrderDraft.f96888p;
        List limits = (65536 & i) != 0 ? exchangeOrderDraft.f96889q : list;
        Double d6 = exchangeOrderDraft.f96890r;
        if ((i & 262144) != 0) {
            exchangeOrderDraft.getClass();
        }
        OrderQuote orderQuote2 = (i & 524288) != 0 ? exchangeOrderDraft.f96891s : orderQuote;
        boolean z6 = (i & PKIFailureInfo.badCertTemplate) != 0 ? exchangeOrderDraft.f96892t : z3;
        Set set = exchangeOrderDraft.u;
        String idempotencyKey = exchangeOrderDraft.v;
        TakeProfitStopLoss takeProfitStopLoss3 = takeProfitStopLoss2;
        f fVar = exchangeOrderDraft.f96893w;
        String str = exchangeOrderDraft.f96894x;
        exchangeOrderDraft.getClass();
        Intrinsics.checkNotNullParameter(topMoneyDetails, "topMoneyDetails");
        Intrinsics.checkNotNullParameter(bottomMoneyDetails, "bottomMoneyDetails");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(exchangePocketType, "exchangePocketType");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        return new ExchangeOrderDraft(topMoneyDetails, bottomMoneyDetails, exchangeMode, exchangePocketType, orderType, takeProfitStopLoss3, inputPosition, bigDecimal3, bigDecimal4, l3, pockets, d5, z4, dVar2, bVar2, currencyMode, limits, d6, orderQuote2, z6, set, idempotencyKey, fVar, str);
    }

    public final n9l.a b() {
        return new n9l.a(this.f96879a.f96897a, this.f96880b.f96897a, this.f96885l, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangeOrderDraft)) {
            return false;
        }
        ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) obj2;
        return Intrinsics.f(this.f96879a, exchangeOrderDraft.f96879a) && Intrinsics.f(this.f96880b, exchangeOrderDraft.f96880b) && this.f96881c == exchangeOrderDraft.f96881c && this.d == exchangeOrderDraft.d && this.e == exchangeOrderDraft.e && Intrinsics.f(this.f, exchangeOrderDraft.f) && this.f96882g == exchangeOrderDraft.f96882g && Intrinsics.f(this.f96883h, exchangeOrderDraft.f96883h) && Intrinsics.f(this.i, exchangeOrderDraft.i) && Intrinsics.f(this.f96884j, exchangeOrderDraft.f96884j) && Intrinsics.f(this.k, exchangeOrderDraft.k) && Double.compare(this.f96885l, exchangeOrderDraft.f96885l) == 0 && this.f96886m == exchangeOrderDraft.f96886m && Intrinsics.f(this.f96887n, exchangeOrderDraft.f96887n) && this.o == exchangeOrderDraft.o && this.f96888p == exchangeOrderDraft.f96888p && Intrinsics.f(this.f96889q, exchangeOrderDraft.f96889q) && Intrinsics.f(this.f96890r, exchangeOrderDraft.f96890r) && Intrinsics.f(this.f96891s, exchangeOrderDraft.f96891s) && this.f96892t == exchangeOrderDraft.f96892t && Intrinsics.f(this.u, exchangeOrderDraft.u) && Intrinsics.f(this.v, exchangeOrderDraft.v) && this.f96893w == exchangeOrderDraft.f96893w && Intrinsics.f(this.f96894x, exchangeOrderDraft.f96894x);
    }

    public final int hashCode() {
        int iB = v1.c.b(this.e, (this.d.hashCode() + y.g(this.f96881c, (this.f96880b.hashCode() + (this.f96879a.hashCode() * 31)) * 31, 31)) * 31, 31);
        TakeProfitStopLoss takeProfitStopLoss = this.f;
        int iHashCode = (this.f96882g.hashCode() + ((iB + (takeProfitStopLoss == null ? 0 : takeProfitStopLoss.hashCode())) * 31)) * 31;
        BigDecimal bigDecimal = this.f96883h;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.i;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l2 = this.f96884j;
        int iC = j6.a.c(m72.b.c(p.a.e((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.k), this.f96885l, 31), 31, this.f96886m);
        d dVar = this.f96887n;
        int iHashCode4 = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.o;
        int iD = p.a.d((this.f96888p.hashCode() + ((iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31, this.f96889q);
        Double d = this.f96890r;
        int iHashCode5 = (iD + (d == null ? 0 : d.hashCode())) * 961;
        OrderQuote orderQuote = this.f96891s;
        int iC2 = j6.a.c((iHashCode5 + (orderQuote == null ? 0 : orderQuote.hashCode())) * 31, 31, this.f96892t);
        Set set = this.u;
        int iC3 = p.a.c((iC2 + (set == null ? 0 : set.hashCode())) * 31, 31, this.v);
        f fVar = this.f96893w;
        int iHashCode6 = (iC3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.f96894x;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f96879a.writeToParcel(dest, i);
        this.f96880b.writeToParcel(dest, i);
        dest.writeString(this.f96881c.name());
        dest.writeString(this.d.name());
        dest.writeString(this.e.name());
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f96882g.name());
        dest.writeSerializable(this.f96883h);
        dest.writeSerializable(this.i);
        Long l2 = this.f96884j;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        Iterator itZ = j6.a.z(this.k, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), i);
        }
        dest.writeDouble(this.f96885l);
        dest.writeInt(this.f96886m ? 1 : 0);
        dest.writeSerializable(this.f96887n);
        b bVar = this.o;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.f96888p.name());
        Iterator itV = p.a.v(this.f96889q, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Double d = this.f96890r;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        dest.writeSerializable(null);
        dest.writeParcelable(this.f96891s, i);
        dest.writeInt(this.f96892t ? 1 : 0);
        Set set = this.u;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = kii.e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString(((xi0.e) itQ.next()).name());
            }
        }
        dest.writeString(this.v);
        f fVar = this.f96893w;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        dest.writeString(this.f96894x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExchangeOrderDraft(MoneyDetails topMoneyDetails, MoneyDetails bottomMoneyDetails, e exchangeMode, i exchangePocketType, h orderType, r1i.h inputPosition, Map map, c currencyMode, Set set, String idempotencyKey, f fVar, String str, int i) {
        Map pockets = (i & 512) != 0 ? r0.g() : map;
        f0 limits = f0.f322471a;
        Set set2 = (65536 & i) != 0 ? null : set;
        f fVar2 = (262144 & i) != 0 ? null : fVar;
        String str2 = (i & PKIFailureInfo.badSenderNonce) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(topMoneyDetails, "topMoneyDetails");
        Intrinsics.checkNotNullParameter(bottomMoneyDetails, "bottomMoneyDetails");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(exchangePocketType, "exchangePocketType");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this(topMoneyDetails, bottomMoneyDetails, exchangeMode, exchangePocketType, orderType, null, inputPosition, null, null, null, pockets, 0.0d, false, null, null, currencyMode, limits, null, null, true, set2, idempotencyKey, fVar2, str2);
    }
}
