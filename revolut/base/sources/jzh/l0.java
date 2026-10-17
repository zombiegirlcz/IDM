package jzh;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.PricingPlanUpgradeEntryPointApi$Toggles;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.api.models.AutoStakingData;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import d9.e1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f179838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f179839x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.order_summary.a f179840y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i, com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f179840y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l0 l0Var = new l0(0, this.f179840y, continuation);
                l0Var.f179838w = flowCollector;
                l0Var.f179839x = obj3;
                return l0Var.invokeSuspend(Unit.f186387a);
            case 1:
                l0 l0Var2 = new l0(1, this.f179840y, continuation);
                l0Var2.f179838w = flowCollector;
                l0Var2.f179839x = obj3;
                return l0Var2.invokeSuspend(Unit.f186387a);
            default:
                l0 l0Var3 = new l0(2, this.f179840y, continuation);
                l0Var3.f179838w = flowCollector;
                l0Var3.f179839x = obj3;
                return l0Var3.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.coroutines.Continuation, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        OrderQuote orderQuote;
        dj0.d dVarB;
        Amount amount;
        String str;
        ?? r92;
        Flow flowQ;
        Flow flowH;
        Asset asset;
        ?? r98;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f179838w;
                    vkm.d dVarU = o7.b.u(this.f179840y.f96780r, (OrderQuoteParams) this.f179839x);
                    this.f179838w = null;
                    this.f179839x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarU, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f179838w;
                    CryptoOrderDraft draft = (CryptoOrderDraft) this.f179839x;
                    tzh.k kVar = this.f179840y.v;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(draft, "draft");
                    xi0.b bVar = draft.f96689a.f96683a;
                    if (draft.e == wd6.e.BUY && draft.f == wd6.h.MARKET && cp5.d.z(bVar)) {
                        yud.g gVar2 = kVar.f275977c;
                        w4l.h hVar = w4l.h.f294642c;
                        gVar = nim.a.v(zh9.u0.i(nim.a.y(nim.a.v(gVar2.d(bVar, hVar), new tyg.g(11)), new tyg.g(12)), nim.a.y(kVar.f275976b.a(bVar), new tyg.g(9)), nim.a.y(nim.a.v(rd0.e.b(kVar.f275975a.M(hVar, io3.l.CURRENT, null, io3.i.INTERNAL, io3.j.PERSONAL, qsg.a.DEFAULT, AccountId.Personal.f51414a)), new ou5.a(23, bVar)), new tyg.g(10))), new tyg.g(8));
                    } else {
                        gVar = new go.g(zi0.c.P(new AutoStakingData(null, null, null), false, null, 3), 2);
                    }
                    this.f179838w = null;
                    this.f179839x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar3 = this.f179840y;
                OrderSummaryScreenContract$InputData orderSummaryScreenContract$InputData = aVar3.o;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f179838w;
                    s sVar = (s) this.f179839x;
                    if (sVar instanceof h0) {
                        h0 h0Var = (h0) sVar;
                        Data data = h0Var.f179825b;
                        if (data == null || (orderQuote = (OrderQuote) data.getContent()) == null) {
                            Data data2 = h0Var.f179826c;
                            orderQuote = data2 != null ? (OrderQuote) data2.getContent() : null;
                        }
                    } else if (sVar instanceof u) {
                        orderQuote = (OrderQuote) ((u) sVar).f179860c.getContent();
                    } else {
                        if (!(sVar instanceof e0) && !(sVar instanceof g0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        orderQuote = orderSummaryScreenContract$InputData.f96775a.f96699q;
                    }
                    if (orderQuote == null) {
                        flowH = vkm.i.f290039a;
                        r98 = 0;
                    } else {
                        wd6.h orderType = orderSummaryScreenContract$InputData.f96775a.f;
                        mzh.a aVar5 = aVar3.f96783w;
                        Object obj3 = aVar3.f96784x.f158330b;
                        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
                        f8l.b bVar2 = orderQuote.f104753b;
                        Charges charges = orderQuote.f104755g;
                        f8l.b bVar3 = orderQuote.f104752a;
                        f8l.b bVar4 = f8l.b.TO;
                        if (bVar2 == bVar4) {
                            f8l.b bVar5 = f8l.b.FROM;
                            if (bVar3 == bVar5) {
                                dVarB = l4i.a.b(e1.i(orderQuote, bVar5));
                            } else {
                                Amount amountJ = e1.j(orderQuote, bVar5);
                                if (amountJ == null) {
                                    amountJ = e1.i(orderQuote, bVar5);
                                }
                                dVarB = l4i.a.b(amountJ);
                            }
                        } else {
                            dVarB = (bVar3 != bVar4 || (amount = charges.f104731a.f104724c) == null) ? l4i.a.b(e1.i(orderQuote, bVar4)) : l4i.a.b(a.a.x(e1.i(orderQuote, bVar4), amount));
                        }
                        dj0.d transactionAmount = dVarB;
                        String value = aVar3.B.b("order_summary_price_quote");
                        if (value == null) {
                            value = null;
                        }
                        gte.a aVar6 = aVar3.z;
                        PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBannersPt2Crypto revampedPremiumContextualBannersPt2Crypto = PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBannersPt2Crypto.f80976c;
                        if (((jte.d) aVar6).c(revampedPremiumContextualBannersPt2Crypto)) {
                            CryptoOrderDraft draft2 = ((r) ((j2) aVar3.E.f22677a).getValue()).f179847a;
                            Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
                            Intrinsics.checkNotNullParameter(draft2, "draft");
                            ChargeBreakdown chargeBreakdown = charges.f104731a;
                            Amount amount2 = chargeBreakdown.f104722a;
                            str = amount2.f104718b.f104720b;
                            Amount amount3 = chargeBreakdown.f104724c;
                            String str2 = (amount3 == null || (asset = amount3.f104718b) == null) ? null : asset.f104720b;
                            int i5 = e0i.e.f121723a[draft2.d.ordinal()];
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                boolean z = cp5.d.z(draft2.f96689a.f96683a);
                                wd6.e eVar = draft2.e;
                                String str3 = (!(eVar == wd6.e.BUY && z) && (eVar != wd6.e.SELL || z)) ? orderQuote.e.f104718b.f104720b : orderQuote.f104754c.f104718b.f104720b;
                                if (amount3 != null && Intrinsics.f(str2, str3)) {
                                    amount2 = amount3;
                                } else if (!Intrinsics.f(str, str3)) {
                                    amount2 = null;
                                }
                                if (amount2 != null) {
                                    str = str3;
                                }
                            }
                        } else {
                            str = null;
                        }
                        mzh.e eVar2 = (mzh.e) aVar5;
                        eVar2.getClass();
                        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
                        Intrinsics.checkNotNullParameter(orderType, "orderType");
                        e0i.d dVar = eVar2.f210772p;
                        j2 isPlanUpgraded = eVar2.f210775s.f148132c;
                        dVar.getClass();
                        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
                        Intrinsics.checkNotNullParameter(orderType, "orderType");
                        Intrinsics.checkNotNullParameter(isPlanUpgraded, "isPlanUpgraded");
                        if (((jte.d) dVar.f121722b).c(revampedPremiumContextualBannersPt2Crypto)) {
                            tga.k kVar2 = dVar.f121721a;
                            if (value != null) {
                                Intrinsics.checkNotNullParameter(value, "value");
                            } else {
                                value = null;
                            }
                            flowQ = kVar2.d(new mga.k(value, str));
                            r92 = 0;
                        } else {
                            r92 = 0;
                            flowQ = vkm.q.Q(isPlanUpgraded, new a67.c((Continuation) (false ? 1 : 0), (Object) dVar, (Object) transactionAmount, (Object) orderType, 15));
                        }
                        lfg.d0 d0Var = new lfg.d0(flowQ, 13);
                        if (((Boolean) eVar2.f210776t.getValue()).booleanValue()) {
                            flowH = mo3.a.h(new vkm.q0(new lkf.v(yh5.b.e(d0Var, ((gld.f0) eVar2.f210771n).f144638l.h(), new v1(new mll.c0(eVar2, r92, 14))), eVar2, 26), new mpd.p(eVar2, r92, 20), 1), new mgh.i(eVar2, 12), new mv5.h(22), 2);
                            r98 = r92;
                        } else {
                            flowH = mo3.a.g(d0Var, r92, new mv5.h(21), 1);
                            r98 = r92;
                        }
                    }
                    this.f179838w = r98;
                    this.f179839x = r98;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowH, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
