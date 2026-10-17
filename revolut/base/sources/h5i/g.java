package h5i;

import aw0.o9;
import aw0.u0;
import c7i.h0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_api.models.OrderQuoteExtraData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderRate;
import d4i.i;
import g7b.q;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import p5k.p;
import p5k.r;
import p5k.u;
import r10.w;
import s5i.h;
import s5i.k;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements i, h {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f149567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e5i.b f149568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f149569c;
    public final w d;
    public final p5k.a e;
    public final p f;

    public g(k helper, l4i.c convertedOrderQuoteCalculator, e5i.b effectiveRateDescriptionMapper, l4i.a amountConverter, gte.a featureToggleInteractor, w creditCardTopupExchangeSummaryMapper, p5k.a creditCardTransferInterestMapper, p transferBreakdownInterestMapper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(convertedOrderQuoteCalculator, "convertedOrderQuoteCalculator");
        Intrinsics.checkNotNullParameter(effectiveRateDescriptionMapper, "effectiveRateDescriptionMapper");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardTopupExchangeSummaryMapper, "creditCardTopupExchangeSummaryMapper");
        Intrinsics.checkNotNullParameter(creditCardTransferInterestMapper, "creditCardTransferInterestMapper");
        Intrinsics.checkNotNullParameter(transferBreakdownInterestMapper, "transferBreakdownInterestMapper");
        this.f149567a = helper;
        this.f149568b = effectiveRateDescriptionMapper;
        this.f149569c = featureToggleInteractor;
        this.d = creditCardTopupExchangeSummaryMapper;
        this.e = creditCardTransferInterestMapper;
        this.f = transferBreakdownInterestMapper;
    }

    public static qv0.i c(g gVar, OrderQuote orderQuote, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return gVar.o(orderQuote, z, new b(3), f.f149566a);
    }

    public static TextLocalisedClause i(y3i.c cVar) {
        return cVar.f310738h == y3i.a.COST ? new TextLocalisedClause(R$string.market_data_exchange_breakdown_total_cost, null, null, 14) : new TextLocalisedClause(R$string.market_data_exchange_breakdown_total_credit, null, null, 14);
    }

    public static TextClause k(boolean z, ChargeBreakdown chargeBreakdown) {
        ChargeEntry chargeEntry;
        List list = chargeBreakdown.f104723b;
        if (!z || list.size() != 1) {
            list = null;
        }
        if (list == null || (chargeEntry = (ChargeEntry) d0.b0(list)) == null) {
            return null;
        }
        return new TextClause(chargeEntry.f104725a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static OrderQuote p(OrderQuote orderQuote, y3i.c cVar) {
        ChargeBreakdown chargeBreakdown = orderQuote.f104755g.f104731a;
        ChargeBreakdown fees = cVar.f310736c;
        if (Intrinsics.f(chargeBreakdown, fees)) {
            return orderQuote;
        }
        Charges charges = orderQuote.f104755g;
        ChargeBreakdown taxes = charges.f104732b;
        ChargeBreakdown chargeBreakdown2 = charges.f104733c;
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        return OrderQuote.a(orderQuote, null, null, null, null, new Charges(fees, taxes, chargeBreakdown2), 33554367);
    }

    public final qv0.i b(OrderQuote orderQuote, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f149567a.a(orderQuote, cellTitle);
    }

    public final qv0.i d(OrderQuote orderQuote) {
        if (!((jte.d) this.f149569c).c(PaymentsToggles$PaymentsChargesMigration.f79158c)) {
            return null;
        }
        b parcel = new b(1);
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        s5i.g cellTitle = s5i.g.f260089a;
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f149567a.h(orderQuote, parcel, cellTitle);
    }

    @Override // s5i.h
    public final qv0.i e(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f149567a.e(orderQuote, parcel, cellTitle, bVar);
    }

    public final qv0.i f(OrderQuote orderQuote, Function1 function1) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        return this.f149567a.c(orderQuote, function1);
    }

    public final qv0.i g(OrderQuote orderQuote, dj0.d dVar, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f149567a.d(orderQuote, dVar, cellTitle);
    }

    public final CellDetailsDelegate.Model h(Amount amount, Function0 function0) {
        return new CellDetailsDelegate.Model("breakdown.exchanged", (Clause) function0.invoke(), l4i.a.d(amount) ? new MoneyClause(l4i.a.b(amount), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : e4i.c.a(amount, null, null, null, null, null, 63), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.lang.Object[], qv0.i[]] */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.revolut.core.ui_kit.models.Style, dj0.d, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v11, types: [h5i.g] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.lang.Object[], qv0.i[]] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    @Override // d4i.i
    public final List j(OrderQuote orderQuote, d4i.h itemsConfig, OrderQuoteExtraData orderQuoteExtraData) {
        int i;
        List listL;
        OrderQuoteExtraData.CreditCardQuoteExtraData.Interest interest;
        OrderQuoteExtraData.CreditCardQuoteExtraData.Interest interest2;
        List list;
        CellDetailsActionDelegate.Model model;
        final g gVar;
        int i2;
        qv0.i iVarL;
        List listL2;
        ?? r152;
        Amount amount;
        d4i.e eVar;
        y3i.c cVar;
        f8l.b bVar;
        Amount amount2;
        Amount amount3;
        boolean z;
        ?? model2;
        OrderQuote priceDescription;
        qv0.i iVar;
        ?? model3;
        char c2;
        ?? L;
        ?? r153;
        ArrayList arrayList;
        ?? G;
        Pair pair;
        OrderQuote orderQuoteA;
        final ?? r154;
        xi0.b bVar2;
        xi0.b bVar3;
        boolean z3;
        qv0.i iVarB;
        boolean z4 = itemsConfig.e;
        Intrinsics.checkNotNullParameter(orderQuote, "quote");
        Intrinsics.checkNotNullParameter(itemsConfig, "itemsConfig");
        if (orderQuoteExtraData instanceof OrderQuoteExtraData.TopupExtraData.CreditCard) {
            return this.d.j(orderQuote, itemsConfig, orderQuoteExtraData);
        }
        d4i.g gVar2 = itemsConfig.f111334b;
        boolean z6 = itemsConfig.f111333a;
        f8l.e eVar2 = orderQuote.k;
        OrderRate orderRate = orderQuote.f104757j;
        int i3 = e.f149563a[eVar2.ordinal()];
        int i5 = 2;
        int i6 = 5;
        final int i21 = 1;
        if (i3 == 1) {
            qv0.i iVarF = null;
            int i22 = 8;
            int i32 = 7;
            if (gVar2 instanceof d4i.e) {
                d4i.e eVar3 = (d4i.e) gVar2;
                final y3i.c cVarA = l4i.c.a(orderQuote);
                qv0.i iVarB2 = eVar3.f111327a ? b(orderQuote, new b(6)) : null;
                if (eVar3.d) {
                    Amount amount4 = cVarA.e;
                    Amount amount5 = cVarA.f;
                    d4i.d dVar = new d4i.d(amount4.f104718b, amount5.f104718b);
                    xi0.a aVar = xi0.b.Companion;
                    String str = amount4.f104718b.f104720b;
                    aVar.getClass();
                    model = new CellDetailsActionDelegate.Model("CRYPTO_PRICE_ID", new TextLocalisedClause(R$string.market_data_exchange_breakdown_price, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), t5l.a.a(xi0.a.a(str), xi0.a.a(amount5.f104718b.f104720b), orderRate.f104793b, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 16), false, false, u0.LARGE, dVar, 0, 0, 32096);
                } else {
                    model = null;
                }
                CellDetailsDelegate.Model modelH = eVar3.f111329c ? h(cVarA.f310735b, new h43.b(i32)) : null;
                if (eVar3.f111328b) {
                    gVar = this;
                    i2 = 7;
                    iVarL = h.l(gVar, p(orderQuote, cVarA), new b(i32), new b(i22), null, 8);
                } else {
                    gVar = this;
                    i2 = 7;
                    iVarL = null;
                }
                qv0.i iVarG = eVar3.e ? gVar.g(orderQuote, null, new Function1(gVar) { // from class: h5i.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        OrderQuote estimatedTotal = (OrderQuote) obj2;
                        switch (i21) {
                            case 0:
                                Intrinsics.checkNotNullParameter(estimatedTotal, "$this$estimatedTotal");
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(estimatedTotal, "$this$estimatedTotal");
                                break;
                        }
                        return g.i(cVarA);
                    }
                }) : null;
                if (eVar3.f111330g) {
                    iVarF = new CellDetailsSwitcherDelegate.Model("ID_INVEST_WEEKLY_SWITCHER", new TextLocalisedClause(R$string.market_data_exchange_summary_investWeekly, null, null, 14), eVar3.f111331h, true, 0, null, null, null, 4080);
                }
                qv0.i iVarD = d(orderQuote);
                if (cVarA.f310737g == y3i.b.CRYPTO_FIRST) {
                    qv0.i[] elements = new qv0.i[i2];
                    elements[0] = iVarB2;
                    elements[1] = model;
                    elements[2] = modelH;
                    elements[3] = iVarL;
                    elements[4] = iVarD;
                    elements[5] = iVarG;
                    elements[6] = iVarF;
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    listL = kotlin.collections.d.L(elements);
                } else {
                    qv0.i[] elements2 = new qv0.i[i2];
                    elements2[0] = iVarB2;
                    elements2[1] = iVarL;
                    elements2[2] = iVarD;
                    elements2[3] = modelH;
                    elements2[4] = model;
                    elements2[5] = iVarG;
                    elements2[6] = iVarF;
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    listL = kotlin.collections.d.L(elements2);
                }
            } else {
                if (!Intrinsics.f(gVar2, d4i.f.f111332a)) {
                    throw new NoWhenBranchMatchedException();
                }
                OrderQuoteExtraData.CreditCardQuoteExtraData creditCardQuoteExtraData = orderQuoteExtraData instanceof OrderQuoteExtraData.CreditCardQuoteExtraData ? (OrderQuoteExtraData.CreditCardQuoteExtraData) orderQuoteExtraData : null;
                boolean z11 = creditCardQuoteExtraData != null && creditCardQuoteExtraData.f97008a;
                y3i.c cVarA2 = l4i.c.a(orderQuote);
                CellDetailsDelegate.Model modelH2 = h(cVarA2.f310735b, new h43.b(i6));
                OrderQuote orderQuoteP = p(orderQuote, cVarA2);
                boolean z12 = z11;
                qv0.i iVarL2 = h.l(this, orderQuoteP, new q(this, z11, 6), new gae.a(this, z11, orderQuoteP), null, 8);
                u uVarB = this.e.b((creditCardQuoteExtraData == null || (interest2 = creditCardQuoteExtraData.f97009b) == null) ? null : interest2.f97011a, (creditCardQuoteExtraData == null || (interest = creditCardQuoteExtraData.f97009b) == null) ? null : interest.f97012b, creditCardQuoteExtraData != null ? creditCardQuoteExtraData.f97010c : null);
                CellDetailsActionDelegate.Model modelC = this.f.c(uVarB);
                r rVar = uVarB instanceof r ? (r) uVarB : null;
                dj0.d dVar2 = rVar != null ? rVar.f233179a : null;
                qv0.i iVarB3 = b(orderQuote, new b(5));
                qv0.i iVarC = c(this, orderQuote, z4, 4);
                if (z12) {
                    iVarC = null;
                }
                if (z12) {
                    modelH2 = null;
                }
                qv0.i iVarD2 = d(orderQuote);
                if (z6) {
                    i = 2;
                    iVarF = f(orderQuote, new b(i));
                } else {
                    i = 2;
                }
                qv0.i iVarG2 = g(orderQuote, dVar2, new g48.h(z12, orderQuote, this, 5));
                qv0.i[] elements3 = new qv0.i[8];
                elements3[0] = iVarB3;
                elements3[1] = iVarC;
                elements3[i] = modelH2;
                elements3[3] = iVarL2;
                elements3[4] = iVarD2;
                elements3[5] = iVarF;
                elements3[6] = modelC;
                elements3[7] = iVarG2;
                Intrinsics.checkNotNullParameter(elements3, "elements");
                listL = kotlin.collections.d.L(elements3);
            }
            list = listL;
        } else {
            if (i3 != 2 && i3 != 3) {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Recurring order type is not supported");
            }
            if (gVar2 instanceof d4i.e) {
                d4i.e eVar4 = (d4i.e) gVar2;
                OrderQuoteExtraData.CryptoOrderQuoteExtraData cryptoOrderQuoteExtraData = orderQuoteExtraData instanceof OrderQuoteExtraData.CryptoOrderQuoteExtraData ? (OrderQuoteExtraData.CryptoOrderQuoteExtraData) orderQuoteExtraData : null;
                wd6.h hVar = cryptoOrderQuoteExtraData != null ? cryptoOrderQuoteExtraData.f97013a : null;
                Double d = cryptoOrderQuoteExtraData != null ? cryptoOrderQuoteExtraData.f97014b : null;
                int i33 = hVar == null ? -1 : e.f149565c[hVar.ordinal()];
                TextLocalisedClause textLocalisedClause = i33 != 1 ? i33 != 2 ? i33 != 3 ? i33 != 4 ? new TextLocalisedClause(R$string.market_data_transaction_breakdown_rate, null, null, 14) : new TextLocalisedClause(R$string.cryptobuysell_fx_orders_stop_detail_price, null, null, 14) : new TextLocalisedClause(R$string.cryptobuysell_fx_orders_limit_detail_price, null, null, 14) : new TextLocalisedClause(R$string.cryptobuysell_fx_orders_stop_loss_detail_price, null, null, 14) : new TextLocalisedClause(R$string.cryptobuysell_fx_orders_take_profit_detail_price, null, null, 14);
                boolean z29 = hVar == wd6.h.STOP || hVar == wd6.h.LIMIT;
                f8l.b bVar4 = orderQuote.f104752a;
                f8l.b bVar5 = orderQuote.f104753b;
                Amount amount6 = orderQuote.d;
                Amount amount7 = orderQuote.f;
                Amount amount8 = orderQuote.f104754c;
                Amount amount9 = orderQuote.e;
                int[] iArr = e.f149564b;
                int i43 = iArr[bVar4.ordinal()];
                if (i43 == 1) {
                    amount = amount8;
                } else {
                    if (i43 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    amount = amount9;
                }
                boolean zB = r6.b.B(xi0.b.Companion, amount.f104718b.f104720b);
                boolean z31 = z29 && !zB;
                y3i.c cVarA3 = l4i.c.a(orderQuote);
                if (eVar4.f111327a) {
                    if (!z29 || zB) {
                        eVar = eVar4;
                        cVar = cVarA3;
                        bVar = bVar5;
                        amount2 = amount6;
                        amount3 = amount7;
                        z = z29;
                        z3 = false;
                        priceDescription = orderQuote;
                        iVarB = b(priceDescription, new h3d.a(28));
                    } else {
                        Amount amount10 = amount6 == null ? amount8 : amount6;
                        z = z29;
                        eVar = eVar4;
                        amount2 = amount6;
                        amount3 = amount7;
                        cVar = cVarA3;
                        bVar = bVar5;
                        z3 = false;
                        priceDescription = orderQuote;
                        iVarB = b(OrderQuote.a(orderQuote, amount7 == null ? amount9 : amount7, null, amount10, null, null, 33554411), new h3d.a(27));
                    }
                    iVar = iVarB;
                    model2 = z3;
                } else {
                    eVar = eVar4;
                    cVar = cVarA3;
                    bVar = bVar5;
                    amount2 = amount6;
                    amount3 = amount7;
                    z = z29;
                    model2 = 0;
                    priceDescription = orderQuote;
                    iVar = null;
                }
                if (eVar.d) {
                    BigDecimal bigDecimal = orderRate.f104793b;
                    int i59 = iArr[bVar.ordinal()];
                    if (i59 == 1) {
                        bVar2 = a.a.L(amount9).f115083b;
                    } else {
                        if (i59 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar2 = a.a.L(amount8).f115083b;
                    }
                    int i66 = iArr[bVar.ordinal()];
                    if (i66 == 1) {
                        bVar3 = a.a.L(amount8).f115083b;
                    } else {
                        if (i66 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar3 = a.a.L(amount9).f115083b;
                    }
                    RateClause rateClause = new RateClause(bigDecimal, bVar2, new RateClause.Format.Default(bVar3, true), model2);
                    Intrinsics.checkNotNullParameter(priceDescription, "$this$priceDescription");
                    model3 = new CellDetailsDelegate.Model("breakdown.price", textLocalisedClause, rateClause, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                } else {
                    model3 = model2;
                }
                final y3i.c cVar2 = cVar;
                ?? H = eVar.f111329c ? h(cVar2.f310735b, new h43.b(6)) : model2;
                if (eVar.f111328b) {
                    c2 = 0;
                    L = h.l(this, p(priceDescription, cVar2), new h3d.a(29), new b(0), null, 8);
                } else {
                    c2 = 0;
                    L = model2;
                }
                qv0.i iVarD3 = d(orderQuote);
                ?? elements4 = new qv0.i[2];
                elements4[c2] = L;
                elements4[1] = iVarD3;
                Intrinsics.checkNotNullParameter(elements4, "elements");
                List listL3 = kotlin.collections.d.L(elements4);
                ArrayList arrayListE0 = z31 ? d0.E0(v.l(H), listL3) : d0.E0(listL3, v.l(H));
                if (eVar.e) {
                    if (!z || zB) {
                        g gVar3 = this;
                        arrayList = arrayListE0;
                        if (z) {
                            orderQuoteA = OrderQuote.a(orderQuote, amount2 == null ? amount8 : amount2, null, amount3 == null ? amount9 : amount3, null, null, 33554411);
                            r154 = gVar3;
                        } else {
                            orderQuoteA = OrderQuote.a(orderQuote, null, null, amount3 == null ? amount9 : amount3, null, null, 33554415);
                            r154 = gVar3;
                        }
                    } else {
                        r154 = this;
                        arrayList = arrayListE0;
                        orderQuoteA = OrderQuote.a(orderQuote, amount3 == null ? amount9 : amount3, null, amount2 == null ? amount8 : amount2, null, null, 33554411);
                    }
                    final int i74 = 0;
                    G = r154.g(orderQuoteA, model2, new Function1(r154) { // from class: h5i.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            OrderQuote estimatedTotal = (OrderQuote) obj2;
                            switch (i74) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(estimatedTotal, "$this$estimatedTotal");
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(estimatedTotal, "$this$estimatedTotal");
                                    break;
                            }
                            return g.i(cVar2);
                        }
                    });
                    r153 = r154;
                } else {
                    r153 = this;
                    arrayList = arrayListE0;
                    G = model2;
                }
                if (d != null && eVar.i) {
                    double dDoubleValue = d.doubleValue();
                    int i92 = iArr[bVar.ordinal()];
                    if (i92 == 1) {
                        pair = new Pair(amount8, amount9);
                    } else {
                        if (i92 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pair = new Pair(amount9, amount8);
                    }
                    model2 = new CellDetailsActionDelegate.Model("CRYPTO_PRICE_ID", new TextLocalisedClause(R$string.cryptobuysell_fx_orders_current_price_title, model2, model2, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), com.revolut.core.ui_kit.models.b.b(a.a.L((Amount) pair.f186385a).f115083b, a.a.L((Amount) pair.f186386b).f115083b, dDoubleValue, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254)), false, false, u0.LARGE, null, 0, 0, ISO781611.BIOMETRIC_INFORMATION_TEMPLATE_TAG);
                }
                ?? elements5 = {model3, model2, iVar};
                Intrinsics.checkNotNullParameter(elements5, "elements");
                listL2 = d0.E0(v.l(G), d0.E0(arrayList, kotlin.collections.d.L(elements5)));
                r152 = r153;
            } else {
                g gVar4 = this;
                qv0.i iVarC2 = c(gVar4, orderQuote, z4, 4);
                qv0.i iVarB4 = gVar4.b(orderQuote, new h0(orderQuote, i5));
                qv0.i iVarF2 = z6 ? gVar4.f(orderQuote, new b(i5)) : null;
                qv0.i iVarD4 = d(orderQuote);
                qv0.i iVarG3 = gVar4.g(orderQuote, null, new h0(orderQuote, 3));
                Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
                gVar4.f149567a.getClass();
                Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
                qv0.i[] elements6 = {iVarC2, iVarB4, iVarF2, iVarD4, iVarG3, new CellDetailsDelegate.Model("breakdown.expireBy", new TextLocalisedClause(R$string.market_data_exchange_currency_expire_by, null, null, 14), new TextLocalisedClause(R$string.market_data_exchange_currency_never, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)};
                Intrinsics.checkNotNullParameter(elements6, "elements");
                listL2 = kotlin.collections.d.L(elements6);
                r152 = gVar4;
            }
            list = listL2;
        }
        yp0.b.k(list, 0, 0, 0, 0, 31);
        return list;
    }

    @Override // s5i.h
    public final qv0.i o(OrderQuote orderQuote, boolean z, Function1 parcel, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f149567a.o(orderQuote, z, parcel, cellTitle);
    }
}
