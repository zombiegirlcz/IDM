package u2i;

import com.revolut.data.model.Data;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276693a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f276694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f276695c;

    public /* synthetic */ v(p pVar, y yVar) {
        this.f276695c = pVar;
        this.f276694b = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        od0.i orderQuoteOptional;
        y yVar;
        p pVar;
        efm.r rVarH;
        dj0.d dVarB;
        switch (this.f276693a) {
            case 0:
                r rVar = this.f276694b.f276701a;
                b2i.b orderSummary = (b2i.b) obj2;
                Intrinsics.checkNotNullParameter(orderSummary, "orderSummary");
                p pVar2 = this.f276695c;
                return ((pVar2 instanceof o) && ((o) pVar2).f276685a && orderSummary.f11942a == wd6.h.RECURRING) ? rVar.K0() : rVar.o2();
            default:
                vf0.g gVar = (vf0.g) obj2;
                Intrinsics.checkNotNullParameter(gVar, "<destruct>");
                Pair pair = (Pair) gVar.f288428a;
                Data data = (Data) gVar.f288429b;
                wi0.b bVar = (wi0.b) gVar.f288430c;
                Data data2 = (Data) gVar.d;
                Boolean bool = (Boolean) gVar.e;
                od0.i iVar = (od0.i) gVar.f;
                sh5.c cVar = (sh5.c) gVar.f288431g;
                Data data3 = (Data) gVar.f288432h;
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                b2i.b bVar2 = (b2i.b) obj3;
                Object obj4 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                Data data4 = (Data) obj4;
                p pVar3 = this.f276695c;
                if (pVar3 instanceof o) {
                    orderQuoteOptional = iVar;
                } else {
                    od0.i.Companion.getClass();
                    orderQuoteOptional = od0.i.f224256b;
                }
                y yVar2 = this.f276694b;
                k kVar = yVar2.k;
                wd6.h orderType = bVar2.f11942a;
                h hVar = (h) kVar;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(orderQuoteOptional, "orderQuoteOptional");
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                OrderQuote orderQuote = (OrderQuote) orderQuoteOptional.g();
                if (orderQuote == null) {
                    rVarH = te0.w.h(f0.f322471a);
                    yVar = yVar2;
                    pVar = pVar3;
                } else if (e1.x(orderQuote)) {
                    l4i.a aVar = hVar.f276675m;
                    f8l.b bVar3 = orderQuote.f104753b;
                    yVar = yVar2;
                    f8l.b bVar4 = orderQuote.f104752a;
                    pVar = pVar3;
                    f8l.b bVar5 = f8l.b.TO;
                    if (bVar3 == bVar5) {
                        f8l.b bVar6 = f8l.b.FROM;
                        if (bVar4 == bVar6) {
                            Amount amountI = e1.i(orderQuote, bVar6);
                            aVar.getClass();
                            dVarB = l4i.a.b(amountI);
                        } else {
                            Amount amountJ = e1.j(orderQuote, bVar6);
                            if (amountJ == null) {
                                amountJ = e1.i(orderQuote, bVar6);
                            }
                            aVar.getClass();
                            dVarB = l4i.a.b(amountJ);
                        }
                    } else if (bVar4 == bVar5) {
                        Amount amount = orderQuote.f104755g.f104731a.f104724c;
                        if (amount != null) {
                            Amount amountX = a.a.x(e1.i(orderQuote, bVar5), amount);
                            aVar.getClass();
                            dVarB = l4i.a.b(amountX);
                        } else {
                            Amount amountI2 = e1.i(orderQuote, bVar5);
                            aVar.getClass();
                            dVarB = l4i.a.b(amountI2);
                        }
                    } else {
                        Amount amountI3 = e1.i(orderQuote, bVar5);
                        aVar.getClass();
                        dVarB = l4i.a.b(amountI3);
                    }
                    rVarH = hVar.O(dVarB, orderType);
                } else {
                    yVar = yVar2;
                    pVar = pVar3;
                    if (e1.w(orderQuote)) {
                        tga.k kVar2 = hVar.f276674l;
                        kVar2.getClass();
                        UpgradeEntryPointItemContract$ItemType.ReviewOrder.Commodity type = UpgradeEntryPointItemContract$ItemType.ReviewOrder.Commodity.f80980a;
                        Intrinsics.checkNotNullParameter(type, "type");
                        rVarH = m70.a.g(kVar2.c(type), null, new tc6.b(22), 1).map(new u21.a(13, new u21.b(14)));
                        Intrinsics.checkNotNullExpressionValue(rVarH, "map(...)");
                    } else {
                        rVarH = te0.w.h(f0.f322471a);
                    }
                }
                return rVarH.map(new u21.a(17, new u(yVar, pVar, bVar2, orderQuoteOptional, data4, bVar, data3, iVar, data, bool, data2, cVar)));
        }
    }

    public /* synthetic */ v(y yVar, p pVar) {
        this.f276694b = yVar;
        this.f276695c = pVar;
    }
}
