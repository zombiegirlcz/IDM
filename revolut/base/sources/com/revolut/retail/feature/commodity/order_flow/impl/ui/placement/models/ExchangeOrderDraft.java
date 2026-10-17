package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dj0.d;
import f8l.f;
import i7j.c;
import i7j.g;
import i7j.j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import wd6.h;
import wd6.i;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/models/ExchangeOrderDraft;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "i7j/c", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeOrderDraft implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExchangeOrderDraft> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyDetails f99885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyDetails f99886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f99887c;
    public final i d;
    public final h e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f99888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigDecimal f99889h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f99890j;
    public final double k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BigDecimal f99891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecurringBuySettings f99892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f99893n;
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f99894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wd6.c f99895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f99896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f99897s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final OrderQuote f99898t;
    public final boolean u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f99899w;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<MoneyDetails> creator = MoneyDetails.CREATOR;
            MoneyDetails moneyDetailsCreateFromParcel = creator.createFromParcel(parcel);
            MoneyDetails moneyDetailsCreateFromParcel2 = creator.createFromParcel(parcel);
            e eVarValueOf = e.valueOf(parcel.readString());
            i iVarValueOf = i.valueOf(parcel.readString());
            h hVarValueOf = h.valueOf(parcel.readString());
            j jVarValueOf = j.valueOf(parcel.readString());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), ExchangePocket.CREATOR.createFromParcel(parcel));
            }
            double d = parcel.readDouble();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            RecurringBuySettings recurringBuySettingsCreateFromParcel = parcel.readInt() == 0 ? null : RecurringBuySettings.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            d dVar = (d) parcel.readSerializable();
            c cVarValueOf = parcel.readInt() == 0 ? null : c.valueOf(parcel.readString());
            wd6.c cVarValueOf2 = wd6.c.valueOf(parcel.readString());
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int iE = 0;
            while (iE != i3) {
                iE = j6.a.e(ExchangeOrderDraft.class, parcel, arrayList, iE, 1);
                i3 = i3;
            }
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readSerializable() == null) {
                return new ExchangeOrderDraft(moneyDetailsCreateFromParcel, moneyDetailsCreateFromParcel2, eVarValueOf, iVarValueOf, hVarValueOf, jVarValueOf, bigDecimal, bigDecimal2, lValueOf, linkedHashMap, d, bigDecimal3, recurringBuySettingsCreateFromParcel, z, dVar, cVarValueOf, cVarValueOf2, arrayList, dValueOf, (OrderQuote) parcel.readParcelable(ExchangeOrderDraft.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : f.valueOf(parcel.readString()));
            }
            throw new ClassCastException();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangeOrderDraft[i];
        }
    }

    public ExchangeOrderDraft(MoneyDetails topMoneyDetails, MoneyDetails bottomMoneyDetails, e exchangeMode, i exchangePocketType, h orderType, j inputPosition, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l2, Map pockets, double d, BigDecimal bigDecimal3, RecurringBuySettings recurringBuySettings, boolean z, d dVar, c cVar, wd6.c currencyMode, List limits, Double d5, OrderQuote orderQuote, boolean z3, String idempotencyKey, f fVar) {
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
        this.f99885a = topMoneyDetails;
        this.f99886b = bottomMoneyDetails;
        this.f99887c = exchangeMode;
        this.d = exchangePocketType;
        this.e = orderType;
        this.f = inputPosition;
        this.f99888g = bigDecimal;
        this.f99889h = bigDecimal2;
        this.i = l2;
        this.f99890j = pockets;
        this.k = d;
        this.f99891l = bigDecimal3;
        this.f99892m = recurringBuySettings;
        this.f99893n = z;
        this.o = dVar;
        this.f99894p = cVar;
        this.f99895q = currencyMode;
        this.f99896r = limits;
        this.f99897s = d5;
        this.f99898t = orderQuote;
        this.u = z3;
        this.v = idempotencyKey;
        this.f99899w = fVar;
    }

    public static ExchangeOrderDraft a(ExchangeOrderDraft exchangeOrderDraft, MoneyDetails moneyDetails, MoneyDetails moneyDetails2, i iVar, h hVar, j jVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l2, Map map, double d, BigDecimal bigDecimal3, RecurringBuySettings recurringBuySettings, boolean z, d dVar, c cVar, List list, OrderQuote orderQuote, int i) {
        MoneyDetails topMoneyDetails = (i & 1) != 0 ? exchangeOrderDraft.f99885a : moneyDetails;
        MoneyDetails bottomMoneyDetails = (i & 2) != 0 ? exchangeOrderDraft.f99886b : moneyDetails2;
        e exchangeMode = exchangeOrderDraft.f99887c;
        i exchangePocketType = (i & 8) != 0 ? exchangeOrderDraft.d : iVar;
        h orderType = (i & 16) != 0 ? exchangeOrderDraft.e : hVar;
        j inputPosition = (i & 32) != 0 ? exchangeOrderDraft.f : jVar;
        BigDecimal bigDecimal4 = (i & 64) != 0 ? exchangeOrderDraft.f99888g : bigDecimal;
        BigDecimal bigDecimal5 = (i & 128) != 0 ? exchangeOrderDraft.f99889h : bigDecimal2;
        Long l3 = (i & 256) != 0 ? exchangeOrderDraft.i : l2;
        Map pockets = (i & 512) != 0 ? exchangeOrderDraft.f99890j : map;
        double d5 = (i & 1024) != 0 ? exchangeOrderDraft.k : d;
        BigDecimal bigDecimal6 = (i & 2048) != 0 ? exchangeOrderDraft.f99891l : bigDecimal3;
        RecurringBuySettings recurringBuySettings2 = (i & 4096) != 0 ? exchangeOrderDraft.f99892m : recurringBuySettings;
        boolean z3 = (i & 8192) != 0 ? exchangeOrderDraft.f99893n : z;
        d dVar2 = (i & 16384) != 0 ? exchangeOrderDraft.o : dVar;
        c cVar2 = (32768 & i) != 0 ? exchangeOrderDraft.f99894p : cVar;
        wd6.c currencyMode = exchangeOrderDraft.f99895q;
        List limits = (131072 & i) != 0 ? exchangeOrderDraft.f99896r : list;
        Double d6 = exchangeOrderDraft.f99897s;
        if ((i & 524288) != 0) {
            exchangeOrderDraft.getClass();
        }
        OrderQuote orderQuote2 = (i & PKIFailureInfo.badCertTemplate) != 0 ? exchangeOrderDraft.f99898t : orderQuote;
        boolean z4 = exchangeOrderDraft.u;
        String idempotencyKey = exchangeOrderDraft.v;
        BigDecimal bigDecimal7 = bigDecimal4;
        f fVar = exchangeOrderDraft.f99899w;
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
        return new ExchangeOrderDraft(topMoneyDetails, bottomMoneyDetails, exchangeMode, exchangePocketType, orderType, inputPosition, bigDecimal7, bigDecimal5, l3, pockets, d5, bigDecimal6, recurringBuySettings2, z3, dVar2, cVar2, currencyMode, limits, d6, orderQuote2, z4, idempotencyKey, fVar);
    }

    public final n9l.a b() {
        return new n9l.a(this.f99885a.f99903a, this.f99886b.f99903a, this.k, null, null, null);
    }

    public final boolean c() {
        MoneyDetails moneyDetails = this.f99885a;
        g gVar = moneyDetails.d;
        boolean z = gVar == null || gVar == g.ESTIMATED;
        MoneyDetails moneyDetails2 = this.f99886b;
        g gVar2 = moneyDetails2.d;
        boolean z3 = gVar2 == null || gVar2 == g.ESTIMATED;
        Long l2 = moneyDetails.f99904b;
        return !this.f99893n && this.f99898t != null && z && z3 && (l2 != null && moneyDetails2.f99904b != null && (l2.longValue() > 0L ? 1 : (l2.longValue() == 0L ? 0 : -1)) > 0 && (moneyDetails2.f99904b.longValue() > 0L ? 1 : (moneyDetails2.f99904b.longValue() == 0L ? 0 : -1)) > 0) && (this.e != h.RECURRING || (this.f99892m != null && cp5.d.A(moneyDetails2.f99903a) && this.d == i.CURRENT));
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
        return Intrinsics.f(this.f99885a, exchangeOrderDraft.f99885a) && Intrinsics.f(this.f99886b, exchangeOrderDraft.f99886b) && this.f99887c == exchangeOrderDraft.f99887c && this.d == exchangeOrderDraft.d && this.e == exchangeOrderDraft.e && this.f == exchangeOrderDraft.f && Intrinsics.f(this.f99888g, exchangeOrderDraft.f99888g) && Intrinsics.f(this.f99889h, exchangeOrderDraft.f99889h) && Intrinsics.f(this.i, exchangeOrderDraft.i) && Intrinsics.f(this.f99890j, exchangeOrderDraft.f99890j) && Double.compare(this.k, exchangeOrderDraft.k) == 0 && Intrinsics.f(this.f99891l, exchangeOrderDraft.f99891l) && Intrinsics.f(this.f99892m, exchangeOrderDraft.f99892m) && this.f99893n == exchangeOrderDraft.f99893n && Intrinsics.f(this.o, exchangeOrderDraft.o) && this.f99894p == exchangeOrderDraft.f99894p && this.f99895q == exchangeOrderDraft.f99895q && Intrinsics.f(this.f99896r, exchangeOrderDraft.f99896r) && Intrinsics.f(this.f99897s, exchangeOrderDraft.f99897s) && Intrinsics.f(this.f99898t, exchangeOrderDraft.f99898t) && this.u == exchangeOrderDraft.u && Intrinsics.f(this.v, exchangeOrderDraft.v) && this.f99899w == exchangeOrderDraft.f99899w;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + v1.c.b(this.e, (this.d.hashCode() + y.g(this.f99887c, (this.f99886b.hashCode() + (this.f99885a.hashCode() * 31)) * 31, 31)) * 31, 31)) * 31;
        BigDecimal bigDecimal = this.f99888g;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f99889h;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l2 = this.i;
        int iC = b.c(p.a.e((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f99890j), this.k, 31);
        BigDecimal bigDecimal3 = this.f99891l;
        int iHashCode4 = (iC + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        RecurringBuySettings recurringBuySettings = this.f99892m;
        int iC2 = j6.a.c((iHashCode4 + (recurringBuySettings == null ? 0 : recurringBuySettings.hashCode())) * 31, 31, this.f99893n);
        d dVar = this.o;
        int iHashCode5 = (iC2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.f99894p;
        int iD = p.a.d((this.f99895q.hashCode() + ((iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31, 31, this.f99896r);
        Double d = this.f99897s;
        int iHashCode6 = (iD + (d == null ? 0 : d.hashCode())) * 961;
        OrderQuote orderQuote = this.f99898t;
        int iC3 = p.a.c(j6.a.c((iHashCode6 + (orderQuote == null ? 0 : orderQuote.hashCode())) * 31, 31, this.u), 31, this.v);
        f fVar = this.f99899w;
        return iC3 + (fVar != null ? fVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f99885a.writeToParcel(dest, i);
        this.f99886b.writeToParcel(dest, i);
        dest.writeString(this.f99887c.name());
        dest.writeString(this.d.name());
        dest.writeString(this.e.name());
        dest.writeString(this.f.name());
        dest.writeSerializable(this.f99888g);
        dest.writeSerializable(this.f99889h);
        Long l2 = this.i;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Iterator itZ = j6.a.z(this.f99890j, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            ((ExchangePocket) entry.getValue()).writeToParcel(dest, i);
        }
        dest.writeDouble(this.k);
        dest.writeSerializable(this.f99891l);
        RecurringBuySettings recurringBuySettings = this.f99892m;
        if (recurringBuySettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            recurringBuySettings.writeToParcel(dest, i);
        }
        dest.writeInt(this.f99893n ? 1 : 0);
        dest.writeSerializable(this.o);
        c cVar = this.f99894p;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeString(this.f99895q.name());
        Iterator itV = p.a.v(this.f99896r, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Double d = this.f99897s;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        dest.writeSerializable(null);
        dest.writeParcelable(this.f99898t, i);
        dest.writeInt(this.u ? 1 : 0);
        dest.writeString(this.v);
        f fVar = this.f99899w;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
    }
}
