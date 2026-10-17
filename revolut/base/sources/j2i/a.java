package j2i;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.retail.common.ui.activity.delegate.keyboardsuggestions.KeyboardSuggestionsDelegate;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import d01.g;
import ehe.n;
import g1i.d0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l2i.f;
import l2i.i;
import m1i.k;
import pfm.m;
import r1i.h;
import wd6.e;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f170898b;

    public /* synthetic */ a(d dVar, int i) {
        this.f170897a = i;
        this.f170898b = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        switch (this.f170897a) {
            case 0:
                d dVar = this.f170898b;
                l4i.a aVar = dVar.k;
                i iVar = dVar.i;
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                e eVar = draft.f96881c;
                h hVar = draft.f96882g;
                BigDecimal bigDecimal = draft.f96883h;
                MoneyDetails moneyDetails = draft.f96879a;
                MoneyDetails moneyDetails2 = draft.f96880b;
                e eVar2 = e.BUY;
                CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
                if (eVar == eVar2) {
                    long j2 = moneyDetails2.f96899c;
                    xi0.b currency = moneyDetails2.f96897a;
                    dj0.d dVar2 = new dj0.d(j2, currency);
                    aVar.getClass();
                    Amount balanceAmount = l4i.a.e(dVar2);
                    Amount amountO = d.O(r1i.d.f(draft), currency);
                    Limit.LowerRestrictionLimit lowerRestrictionLimitE = r1i.d.e(draft);
                    Amount amountO2 = lowerRestrictionLimitE != null ? d.O(lowerRestrictionLimitE, currency) : null;
                    Amount upperLimitAmount = amountO != null ? dVar.N(amountO, bigDecimal, currency) : null;
                    Amount lowerLimitAmount = amountO2 != null ? dVar.N(amountO2, bigDecimal, currency) : null;
                    boolean z3 = moneyDetails2.d == r1i.e.EXCEEDED_BALANCE;
                    Intrinsics.checkNotNullParameter(draft, "<this>");
                    boolean z4 = r1i.d.g(draft, hVar).d == r1i.e.EXCEEDED_CRYPTO_LIMIT;
                    Intrinsics.checkNotNullParameter(draft, "<this>");
                    z = r1i.d.g(draft, hVar).d == r1i.e.FAILED_CRYPTO_LOWER_LIMIT;
                    if ((z3 || z4) && upperLimitAmount != null && Intrinsics.f(upperLimitAmount.f104718b.f104720b, balanceAmount.f104718b.f104720b)) {
                        xi0.b targetCurrency = moneyDetails.f96897a;
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(upperLimitAmount, "upperLimitAmount");
                        Intrinsics.checkNotNullParameter(balanceAmount, "balanceAmount");
                        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
                        if (a.a.e(upperLimitAmount, balanceAmount) <= 0) {
                            balanceAmount = upperLimitAmount;
                        }
                        return u.c(new d01.b("BUY_MAXIMUM_KEYBOARD_SUGGESTION_ID", new TextLocalisedClause(R$string.cryptobuysell_editor_suggestion_buy_max_format, n.x(targetCurrency, ticker, null, 4), null, 12), new f(balanceAmount), false, null, null, 56));
                    }
                    if (z && lowerLimitAmount != null) {
                        xi0.b displayedBuyMinCurrency = moneyDetails.f96897a;
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(lowerLimitAmount, "lowerLimitAmount");
                        Intrinsics.checkNotNullParameter(displayedBuyMinCurrency, "displayedBuyMinCurrency");
                        return u.c(new d01.b("BUY_MINIMUM_KEYBOARD_SUGGESTION_ID", new TextLocalisedClause(R$string.cryptobuysell_editor_suggestion_buy_min_format, n.x(displayedBuyMinCurrency, ticker, null, 4), null, 12), new f(lowerLimitAmount), false, null, null, 56));
                    }
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Iterable iterable = (List) i.f.get(currency.f306286a);
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    Iterable iterable2 = iterable;
                    ArrayList<dj0.d> arrayList = new ArrayList(w.t(iterable2, 10));
                    Iterator it8 = iterable2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(new dj0.d(cp5.d.k(currency) * ((Number) it8.next()).longValue(), currency));
                    }
                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                    for (dj0.d dVar3 : arrayList) {
                        arrayList2.add(new d01.b(j6.a.q("PREDEFINED_ITEM_SUGGESTION_ID", dVar3.f115083b.f306286a), new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new f(l4i.a.e(dVar3)), false, null, null, 56));
                    }
                    return arrayList2;
                }
                Intrinsics.checkNotNullParameter(draft, "<this>");
                MoneyDetails moneyDetailsG = r1i.d.g(draft, hVar);
                long j3 = moneyDetails.f96899c;
                xi0.b targetCurrency2 = moneyDetails.f96897a;
                dj0.d dVar4 = new dj0.d(j3, targetCurrency2);
                aVar.getClass();
                Amount balanceAmount2 = l4i.a.e(dVar4);
                Asset asset = balanceAmount2.f104718b;
                BigDecimal bigDecimal2 = bigDecimal != null ? new BigDecimal(String.valueOf(Math.abs(1.0d) / Math.abs(bigDecimal.doubleValue()))) : null;
                Amount amountO3 = d.O(r1i.d.f(draft), targetCurrency2);
                Limit.LowerRestrictionLimit lowerRestrictionLimitE2 = r1i.d.e(draft);
                Amount amountO4 = lowerRestrictionLimitE2 != null ? d.O(lowerRestrictionLimitE2, targetCurrency2) : null;
                Amount upperLimitAmount2 = dVar.N(amountO3, bigDecimal2, targetCurrency2);
                Amount lowerLimitAmount2 = dVar.N(amountO4, bigDecimal2, targetCurrency2);
                boolean z6 = moneyDetails.d == r1i.e.EXCEEDED_BALANCE;
                r1i.e eVar3 = moneyDetailsG.d;
                boolean z11 = eVar3 == r1i.e.EXCEEDED_CRYPTO_LIMIT;
                z = eVar3 == r1i.e.FAILED_CRYPTO_LOWER_LIMIT;
                if ((z6 || z11) && upperLimitAmount2 != null && Intrinsics.f(upperLimitAmount2.f104718b.f104720b, asset.f104720b)) {
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(upperLimitAmount2, "upperLimitAmount");
                    Intrinsics.checkNotNullParameter(balanceAmount2, "balanceAmount");
                    Intrinsics.checkNotNullParameter(targetCurrency2, "targetCurrency");
                    if (a.a.e(upperLimitAmount2, balanceAmount2) <= 0) {
                        balanceAmount2 = upperLimitAmount2;
                    }
                    return u.c(new d01.b("SELL_MAXIMUM_KEYBOARD_SUGGESTION_ID", new TextLocalisedClause(R$string.cryptobuysell_editor_suggestion_sell_max_format, n.x(targetCurrency2, ticker, null, 4), null, 12), new f(balanceAmount2), false, null, null, 56));
                }
                if (z && lowerLimitAmount2 != null) {
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(lowerLimitAmount2, "lowerLimitAmount");
                    Intrinsics.checkNotNullParameter(targetCurrency2, "displayedSellMinCurrency");
                    return u.c(new d01.b("SELL_MINIMUM_KEYBOARD_SUGGESTION_ID", new TextLocalisedClause(R$string.cryptobuysell_editor_suggestion_sell_min_format, n.x(targetCurrency2, ticker, null, 4), null, 12), new f(lowerLimitAmount2), false, null, null, 56));
                }
                if (hVar == h.TOP) {
                    iVar.getClass();
                    return i.a();
                }
                if (upperLimitAmount2 == null || !Intrinsics.f(upperLimitAmount2.f104718b.f104720b, asset.f104720b)) {
                    return f0.f322471a;
                }
                if (r1i.d.j(draft)) {
                    iVar.getClass();
                    return i.a();
                }
                iVar.getClass();
                Intrinsics.checkNotNullParameter(upperLimitAmount2, "upperLimitAmount");
                Intrinsics.checkNotNullParameter(balanceAmount2, "balanceAmount");
                Intrinsics.checkNotNullParameter(targetCurrency2, "targetCurrency");
                if (a.a.e(upperLimitAmount2, balanceAmount2) <= 0) {
                    balanceAmount2 = upperLimitAmount2;
                }
                return u.c(new d01.b("SELL_ALL_KEYBOARD_SUGGESTION_ID", new TextLocalisedClause(R$string.fx_orders_editor_suggestion_sell_all_format, n.x(targetCurrency2, ticker, null, 4), null, 12), new f(balanceAmount2), false, null, null, 56));
            case 1:
                List items = (List) obj2;
                spi.a aVar2 = this.f170898b.f170902h;
                Intrinsics.h(items);
                KeyboardSuggestionsDelegate keyboardSuggestionsDelegate = (KeyboardSuggestionsDelegate) aVar2;
                keyboardSuggestionsDelegate.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                g gVarE0 = jh.d.f(keyboardSuggestionsDelegate.f98560h).e0();
                if (gVarE0 != null) {
                    Intrinsics.checkNotNullParameter(items, "items");
                    ((iz0.e) gVarE0).g("legacy_source_id", items);
                }
                return Unit.f186387a;
            default:
                k kVar = this.f170898b.f170903j;
                d01.b item = (d01.b) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj3 = item.f110279c;
                if (obj3 instanceof f) {
                    Amount amount = ((f) obj3).f191801a;
                    d0 d0Var = (d0) kVar;
                    d0Var.getClass();
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    return d0Var.R3(new g0f.f(d0Var, amount, 15));
                }
                if (!(obj3 instanceof l2i.g)) {
                    return m.f235744a;
                }
                int i = ((l2i.g) obj3).f191802a;
                d0 d0Var2 = (d0) kVar;
                d0Var2.getClass();
                return d0Var2.R3(new abf.n(d0Var2, i, 8));
        }
    }
}
