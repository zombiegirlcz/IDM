package k4l;

import com.revolut.retail.trading.core.domain.orders.TradingAutoTopUp;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import ip0.v7;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f181008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bfl.g f181009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f181010c;
    public final q0 d;
    public final dfl.q e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ej0.b f181011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f181012h;
    public final ej0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateTime f181013j;
    public final y k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sel.a f181014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TradingAutoTopUp f181015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s f181016n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TradingOrderExitStrategies f181017p;

    public z(v identifier, bfl.g side, r0 type, q0 timeInForce, dfl.q value, dj0.d dVar, ej0.b bVar, dj0.d dVar2, ej0.b bVar2, DateTime dateTime, y yVar, sel.a aVar, TradingAutoTopUp tradingAutoTopUp, s idempotencyKey, String str, TradingOrderExitStrategies tradingOrderExitStrategies) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f181008a = identifier;
        this.f181009b = side;
        this.f181010c = type;
        this.d = timeInForce;
        this.e = value;
        this.f = dVar;
        this.f181011g = bVar;
        this.f181012h = dVar2;
        this.i = bVar2;
        this.f181013j = dateTime;
        this.k = yVar;
        this.f181014l = aVar;
        this.f181015m = tradingAutoTopUp;
        this.f181016n = idempotencyKey;
        this.o = str;
        this.f181017p = tradingOrderExitStrategies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f181008a, zVar.f181008a) && this.f181009b == zVar.f181009b && this.f181010c == zVar.f181010c && this.d == zVar.d && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f181011g, zVar.f181011g) && Intrinsics.f(this.f181012h, zVar.f181012h) && Intrinsics.f(this.i, zVar.i) && Intrinsics.f(this.f181013j, zVar.f181013j) && Intrinsics.f(this.k, zVar.k) && this.f181014l == zVar.f181014l && Intrinsics.f(this.f181015m, zVar.f181015m) && Intrinsics.f(this.f181016n, zVar.f181016n) && Intrinsics.f(this.o, zVar.o) && Intrinsics.f(this.f181017p, zVar.f181017p);
    }

    public final int hashCode() {
        int iH = v7.h(this.e, (this.d.hashCode() + com.revolut.data.database.models.openbanking.d.f(this.f181010c, wp5.y.b(this.f181009b, this.f181008a.hashCode() * 31, 31), 31)) * 31, 31);
        dj0.d dVar = this.f;
        int iHashCode = (iH + (dVar == null ? 0 : dVar.hashCode())) * 31;
        ej0.b bVar = this.f181011g;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        dj0.d dVar2 = this.f181012h;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        ej0.b bVar2 = this.i;
        int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        DateTime dateTime = this.f181013j;
        int iHashCode5 = (iHashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        y yVar = this.k;
        int iHashCode6 = (iHashCode5 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        sel.a aVar = this.f181014l;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        TradingAutoTopUp tradingAutoTopUp = this.f181015m;
        int iC = p.a.c((iHashCode7 + (tradingAutoTopUp == null ? 0 : tradingAutoTopUp.hashCode())) * 31, 31, this.f181016n.f181002a);
        String str = this.o;
        int iHashCode8 = (iC + (str == null ? 0 : str.hashCode())) * 961;
        TradingOrderExitStrategies tradingOrderExitStrategies = this.f181017p;
        return iHashCode8 + (tradingOrderExitStrategies != null ? tradingOrderExitStrategies.hashCode() : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(String securityRef, bfl.g side, r0 type, q0 timeInForce, dfl.q value, dj0.d dVar, ej0.b bVar, dj0.d dVar2, ej0.b bVar2, DateTime dateTime, y yVar, sel.a aVar, TradingAutoTopUp tradingAutoTopUp, s idempotencyKey, String str, TradingOrderExitStrategies tradingOrderExitStrategies) {
        this(new u(securityRef), side, type, timeInForce, value, dVar, bVar, dVar2, bVar2, dateTime, yVar, aVar, tradingAutoTopUp, idempotencyKey, str, tradingOrderExitStrategies);
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(Pair ccyPair, bfl.g side, r0 type, q0 timeInForce, dfl.a value, s idempotencyKey) {
        this(new t(ccyPair), side, type, timeInForce, value, (dj0.d) null, (ej0.b) null, (dj0.d) null, (ej0.b) null, (DateTime) null, (y) null, (sel.a) null, (TradingAutoTopUp) null, idempotencyKey, (String) null, (TradingOrderExitStrategies) null);
        Intrinsics.checkNotNullParameter(ccyPair, "ccyPair");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
    }
}
