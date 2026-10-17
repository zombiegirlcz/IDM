package z1i;

import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryContract$Configuration;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import ip0.s7;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import sgm.e3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b9k.f f318830b;

    public /* synthetic */ k(b9k.f fVar, int i) {
        this.f318829a = i;
        this.f318830b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r rVarB;
        switch (this.f318829a) {
            case 0:
                b2i.b order = (b2i.b) obj2;
                Intrinsics.checkNotNullParameter(order, "order");
                boolean z = czi.c.z(order);
                b9k.f fVar = this.f318830b;
                if (!z) {
                    t2i.b bVar = (t2i.b) fVar.f13817b;
                    efm.r rVarSwitchMap = bVar.d().map(new yzc.a(21, new l(0))).distinctUntilChanged().switchMap(new yzc.a(22, new k(fVar, 2)));
                    Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                    efm.r rVarD = bVar.d();
                    efm.r rVarX = bVar.k().x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    efm.r map = te0.w.m(rVarSwitchMap, rVarD, rVarX).map(new yzc.a(20, new k(fVar, 1)));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    return map;
                }
                if (order.f11942a == wd6.h.TAKE_PROFIT_STOP_LOSS) {
                    e3 e3Var = (e3) fVar.f;
                    y2i.c cVar = (y2i.c) e3Var.f262806b;
                    y2i.a aVar = cVar.f310666a;
                    g1i.d0 d0Var = (g1i.d0) aVar;
                    efm.r rVarL3 = d0Var.L3();
                    efm.r rVarK3 = d0Var.K3();
                    efm.r rVarF = z9h.n.f(null, null, false, 7, null);
                    Intrinsics.checkNotNullExpressionValue(rVarF, "just(...)");
                    efm.r map2 = te0.w.n(rVarL3, rVarK3, rVarF, cVar.d).map(new y25.c(new y1.a(cVar, 9), 6));
                    Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                    g1i.d0 d0Var2 = (g1i.d0) aVar;
                    efm.r map3 = te0.w.l(d0Var2.L3(), d0Var2.K3()).map(new y25.c(new y25.d(cVar, 5), 7));
                    Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                    efm.r rVarSwitchMap2 = map3.switchMap(new n(new z2.a(e3Var, 7), 22));
                    Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
                    efm.r map4 = te0.w.l(map2, rVarSwitchMap2).map(new n(new l(18), 21));
                    IntRange intRange = new IntRange(1, 5, 1);
                    ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                    vim.f it8 = intRange.iterator();
                    while (it8.f289625c) {
                        arrayList.add(new s7(a0.d.n("LOADING_CRYPTO_DETAILS_", it8.nextInt()), 0, 0, 0, 0, false, null, 126));
                    }
                    yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                    rVarB = map4.startWith(arrayList);
                    Intrinsics.checkNotNullExpressionValue(rVarB, "startWith(...)");
                } else {
                    rVarB = ((u2i.y) ((u2i.q) fVar.f13816a)).b(new u2i.o(((OrderSummaryContract$Configuration) fVar.e).f96918b));
                }
                return rVarB.map(new yzc.a(19, new z1.c(order, fVar, 2)));
            case 1:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                od0.i iVar = (od0.i) rVar.f314201a;
                b2i.b orderSummary = (b2i.b) rVar.f314202b;
                wi0.b bVar2 = (wi0.b) rVar.f314203c;
                j jVar = (j) this.f318830b.f13818c;
                boolean zN = com.bumptech.glide.d.n(bVar2);
                jVar.getClass();
                Intrinsics.checkNotNullParameter(orderSummary, "orderSummary");
                OrderQuote orderQuote = orderSummary.f11950n;
                return zhm.d0.E0(zhm.v.l(iVar.g()), orderQuote != null ? jVar.f318828a.j(orderQuote, new d4i.h(zN, d4i.f.f111332a, null, null, false, 60), null) : zhm.f0.f322471a);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                String value = (String) pair.f186386b;
                if (!zBooleanValue) {
                    od0.i.Companion.getClass();
                    return te0.w.h(od0.i.f224256b);
                }
                tga.k kVar = (tga.k) this.f318830b.d;
                if (value != null) {
                    Intrinsics.checkNotNullParameter(value, "value");
                } else {
                    value = null;
                }
                return kVar.b(new mga.o(value));
        }
    }
}
