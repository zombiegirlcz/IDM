package mx0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.internal.views.swipeablecards.SwipeableCardHeaderView;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.subscriptions.impl.mark_recurring.MarkRecurringTransactionsActivity;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_impl.ui.delegates.faq.FaqDelegateContract$ClauseClickParcel;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class v9 extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v9(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k1j.c cVar;
        pi3.d dVar;
        int i;
        int i2;
        int i3 = this.f;
        pfm.m mVar = pfm.m.f235744a;
        ArrayList arrayList = null;
        int i5 = 1;
        switch (i3) {
            case 0:
                q9 p0 = (q9) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((ihm.f) this.receiver).onNext(p0);
                return Unit.f186387a;
            case 1:
                s9 p03 = (s9) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((ihm.f) this.receiver).onNext(p03);
                return Unit.f186387a;
            case 2:
                ty0.a p010 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                ((ihm.f) this.receiver).onNext(p010);
                return Unit.f186387a;
            case 3:
                ((SwipeableCardHeaderView) this.receiver).setProgress(((Number) obj2).floatValue());
                return Unit.f186387a;
            case 4:
                NaviCommand p011 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                ((sri.m) this.receiver).c(p011);
                return Unit.f186387a;
            case 5:
                iw5.a p012 = (iw5.a) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a) this.receiver).C2(p012);
                return Unit.f186387a;
            case 6:
                RevPointsSpareChangeControllerApi$Result p013 = (RevPointsSpareChangeControllerApi$Result) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                ((x1c.a) ((o1c.a) this.receiver)).Z2(p013);
                return Unit.f186387a;
            case 7:
                e7l.f p014 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                ((n0k.c) this.receiver).getClass();
                LinkedHashSet linkedHashSet = p014.M;
                xi0.a aVar = xi0.b.Companion;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(linkedHashSet, 10));
                Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    t61.a.A(aVar, (String) it8.next(), arrayList2);
                }
                Set set = p014.T;
                List list = p014.P0;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(((e7l.h) it9.next()).f123408a);
                    }
                }
                Collection[] elements = {arrayList2, set, arrayList};
                Intrinsics.checkNotNullParameter(elements, "elements");
                ArrayList arrayListU = zhm.w.u(kotlin.collections.d.L(elements));
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListU, 10));
                Iterator it10 = arrayListU.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(((xi0.b) it10.next()).f306286a);
                }
                return zhm.d0.i1(arrayList3);
            case 8:
                List balanceWrappers = (List) obj2;
                Intrinsics.checkNotNullParameter(balanceWrappers, "p0");
                ((n2j.l) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(balanceWrappers, "balanceWrappers");
                boolean zIsEmpty = balanceWrappers.isEmpty();
                m2j.a aVar2 = m2j.a.f202010a;
                if (zIsEmpty) {
                    return aVar2;
                }
                List list3 = balanceWrappers;
                boolean z = list3 instanceof Collection;
                if (z && list3.isEmpty()) {
                    cVar = k1j.c.TRADING_ACCOUNTS;
                } else {
                    Iterator it11 = list3.iterator();
                    while (it11.hasNext()) {
                        if (((BalanceWrapper) it11.next()).getF99407g() != k1j.a.TRADING_ACCOUNTS) {
                            if (!z || !list3.isEmpty()) {
                                Iterator it12 = list3.iterator();
                                while (it12.hasNext()) {
                                    if (((BalanceWrapper) it12.next()).getF99407g() != k1j.a.JOINT_TRADING_ACCOUNTS) {
                                        r6.b.D("Mixed balances types!");
                                        return aVar2;
                                    }
                                }
                            }
                            cVar = k1j.c.JOINT_TRADING_ACCOUNTS;
                        }
                    }
                    cVar = k1j.c.TRADING_ACCOUNTS;
                }
                return new m2j.b(new k1j.b(cVar, null, balanceWrappers, 6));
            case 9:
                String p015 = (String) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                n33.f2 f2Var = (n33.f2) this.receiver;
                f2Var.getClass();
                if (Intrinsics.f(p015, "MENU_NOT_NOW_ITEM_ID")) {
                    CardOrderAccountWrapper cardOrderAccountWrapper = f2Var.f211716s.f65210c;
                    if (cardOrderAccountWrapper instanceof CardOrderAccountWrapper.Junior) {
                        return f2Var.X();
                    }
                    if (!(cardOrderAccountWrapper instanceof CardOrderAccountWrapper.Regular)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r6.b.r("Unreachable place. You need to to implement logic for this case.");
                    return mVar;
                }
                if (!Intrinsics.f(p015, "MENU_INFORMATION_ITEM_ID")) {
                    throw new IllegalStateException(a10.b.s("id ", p015, " hasn't been processed yet"));
                }
                n33.r2 r2Var = (n33.r2) f2Var.f211713p;
                v60.i commandsSubject = r2Var.f211802p;
                i4b.f fVar = r2Var.f211795c;
                Intrinsics.checkNotNullParameter(commandsSubject, "commandsSubject");
                ((z3e.c) fVar.f158330b).a("CARDS_WELCOME_STORY");
                pfm.n nVar = new pfm.n(new a31.l(commandsSubject, 22), i5);
                Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                return nVar;
            case 10:
                String p016 = (String) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                n33.f2 f2Var2 = (n33.f2) this.receiver;
                n33.u uVar = f2Var2.f211713p;
                if (Intrinsics.f(p016, "LIST_ID_ACTION_CANCEL")) {
                    n33.r2 r2Var2 = (n33.r2) uVar;
                    n33.s2 s2Var = (n33.s2) r2Var2.e;
                    NaviCommand naviCommand = (NaviCommand) ((od0.i) s2Var.e.getValue(s2Var, n33.s2.f211807p[3]).get()).f224257a;
                    if (naviCommand != null) {
                        return new pfm.h(new n33.l2(r2Var2, naviCommand, 9), 2);
                    }
                    r6.b.r("Unreachable place. OrderNewCardContract.State.onSkipCommand is null.");
                    return mVar;
                }
                if (!Intrinsics.f(p016, "BACK_DIALOG_SECONDARY_BUTTON_ID")) {
                    pfm.h hVar = new pfm.h(new i1i.a(f2Var2, 17), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    return hVar;
                }
                n33.r2 r2Var3 = (n33.r2) uVar;
                r2Var3.getClass();
                pfm.h hVar2 = new pfm.h(new n33.h2(r2Var3, i5), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 11:
                NaviCommand p017 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                ((sri.m) this.receiver).c(p017);
                return Unit.f186387a;
            case 12:
                NaviCommand p018 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                ((sri.m) this.receiver).c(p018);
                return Unit.f186387a;
            case 13:
                npi.d p019 = (npi.d) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                ((npi.c) ((npi.f) this.receiver)).Q(p019);
                return Unit.f186387a;
            case 14:
                StatusViewConfiguration p020 = (StatusViewConfiguration) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                ((k3l.d) ((k3l.b) this.receiver)).O(p020);
                return Unit.f186387a;
            case 15:
                k3l.j dialogResult = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(dialogResult, "p0");
                n33.r2 r2Var4 = (n33.r2) ((n33.u) this.receiver);
                r2Var4.getClass();
                Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                if (!Intrinsics.f(dialogResult.a().getF104385a(), "CARD_CHECKOUT_ORDER_DIALOG_ID")) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                Parcelable f = dialogResult.a().getF();
                Intrinsics.i(f, "null cannot be cast to non-null type com.revolut.feature.checkout.models.CheckoutOrder");
                CheckoutOrder checkoutOrder = (CheckoutOrder) f;
                if (dialogResult instanceof k3l.h) {
                    n33.t0 t0Var = (n33.t0) r2Var4.d;
                    t0Var.getClass();
                    Intrinsics.checkNotNullParameter(checkoutOrder, "checkoutOrder");
                    return t0Var.D.c(checkoutOrder);
                }
                if (dialogResult instanceof k3l.i) {
                    return new pfm.h(new la8.j(r2Var4, checkoutOrder, 21), 2);
                }
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 16:
                Data cancelOrderResult = (Data) obj2;
                Intrinsics.checkNotNullParameter(cancelOrderResult, "p0");
                n33.r2 r2Var5 = (n33.r2) ((n33.u) this.receiver);
                r2Var5.getClass();
                Intrinsics.checkNotNullParameter(cancelOrderResult, "cancelOrderResult");
                if (!zi0.c.E(cancelOrderResult)) {
                    return mVar;
                }
                CheckoutOrder checkoutOrder2 = (CheckoutOrder) cancelOrderResult.getContent();
                if (checkoutOrder2 == null || (dVar = checkoutOrder2.d) == null) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                h93.l0 l0Var = dVar.f236396n;
                return dVar.i ? r2Var5.h(l0Var, null) : r2Var5.g(l0Var, null);
            case 17:
                OrderQuote p021 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                ((n5i.d) this.receiver).getClass();
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.market_data_price_faq_commodity_title, null, null, 14);
                int i6 = n5i.c.f212588a[p021.f104753b.ordinal()];
                if (i6 == 1) {
                    i = R$string.market_data_price_faq_commodity_description_sell;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.market_data_price_faq_commodity_description_buy;
                }
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
                TermsScope.INSTANCE.getClass();
                return new l5i.j(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), zhm.v.k(textLocalisedClause2, new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) new FaqDelegateContract$ClauseClickParcel.Terms(TermsScope.f90371l), "COMMODITY_TERMS", false), 10))), textLocalisedClause);
            case 18:
                OrderQuote p022 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                ((n5i.f) this.receiver).getClass();
                Asset assetK = d9.e1.k(p022);
                Amount amount = p022.f104754c;
                Amount amount2 = p022.e;
                f8l.b bVar = p022.f104753b;
                f8l.c cVar2 = assetK.f104719a;
                if (!d9.e1.w(p022) || cVar2 == f8l.c.CRYPTO) {
                    int i21 = n5i.e.f212593a[bVar.ordinal()];
                    if (i21 == 1) {
                        return new l5i.m(amount.f104718b, amount2.f104718b);
                    }
                    if (i21 == 2) {
                        return new l5i.m(amount2.f104718b, amount.f104718b);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.market_data_price_faq_commodity_title, null, null, 14);
                int i22 = n5i.e.f212593a[bVar.ordinal()];
                if (i22 == 1) {
                    i2 = cVar2 == f8l.c.COMMODITY ? R$string.market_data_price_faq_commodity_description_sell : R$string.market_data_price_faq_commodity_description_buy;
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = cVar2 == f8l.c.COMMODITY ? R$string.market_data_price_faq_commodity_description_buy : R$string.market_data_price_faq_commodity_description_sell;
                }
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i2, null, null, 14);
                TermsScope.INSTANCE.getClass();
                return new l5i.j(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), zhm.v.k(textLocalisedClause4, new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) new FaqDelegateContract$ClauseClickParcel.Terms(TermsScope.f90371l), "COMMODITY_TERMS", false), 10))), textLocalisedClause3);
            case 19:
                l68.g p023 = (l68.g) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                com.revolut.feature.junior.account_activation.impl.ui.screen.request.c cVar3 = (com.revolut.feature.junior.account_activation.impl.ui.screen.request.c) this.receiver;
                if (p023 instanceof l68.f) {
                    cVar3.H2(cVar3.v, new n1.y(p023, 24));
                    return Unit.f186387a;
                }
                cVar3.getClass();
                throw new NoWhenBranchMatchedException();
            case 20:
                j68.g p024 = (j68.g) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                com.revolut.feature.junior.account_activation.impl.ui.screen.request.c cVar4 = (com.revolut.feature.junior.account_activation.impl.ui.screen.request.c) this.receiver;
                if (p024 instanceof j68.f) {
                    cVar4.H2(cVar4.v, new n1.y(p024, 23));
                    return Unit.f186387a;
                }
                cVar4.getClass();
                throw new NoWhenBranchMatchedException();
            case 21:
                n8i.f0 p025 = (n8i.f0) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                com.revolut.feature_move_money.impl.topup.a aVar3 = (com.revolut.feature_move_money.impl.topup.a) this.receiver;
                aVar3.getClass();
                if (p025 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3.H2(aVar3.M, new n8i.b1(aVar3, p025.f213424a, i5));
                return Unit.f186387a;
            case 22:
                m9i.c giphyGifSearchResult = (m9i.c) obj2;
                Intrinsics.checkNotNullParameter(giphyGifSearchResult, "p0");
                ((l9i.a) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(giphyGifSearchResult, "giphyGifSearchResult");
                return new i9i.d(l9i.a.b(giphyGifSearchResult.getData(), i9i.b.GIF));
            case 23:
                m9i.c giphyGifSearchResult2 = (m9i.c) obj2;
                Intrinsics.checkNotNullParameter(giphyGifSearchResult2, "p0");
                ((l9i.a) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(giphyGifSearchResult2, "giphyGifSearchResult");
                return new i9i.d(l9i.a.b(giphyGifSearchResult2.getData(), i9i.b.STICKER));
            case 24:
                NaviCommand p026 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                ((sri.m) this.receiver).c(p026);
                return Unit.f186387a;
            case 25:
                List p027 = (List) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                ((MarkRecurringTransactionsActivity) ((nae.i) this.receiver)).setItems(p027);
                return Unit.f186387a;
            case 26:
                Throwable p028 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a.O2((com.revolut.shared.feature.suspicious_transaction.impl.flow.a) this.receiver, p028);
                return Boolean.TRUE;
            case 27:
                Throwable p029 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a.O2((com.revolut.shared.feature.suspicious_transaction.impl.flow.a) this.receiver, p029);
                return Boolean.TRUE;
            case 28:
                Throwable p030 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a.O2((com.revolut.shared.feature.suspicious_transaction.impl.flow.a) this.receiver, p030);
                return Boolean.TRUE;
            default:
                Throwable p031 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p031, "p0");
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a.O2((com.revolut.shared.feature.suspicious_transaction.impl.flow.a) this.receiver, p031);
                return Boolean.TRUE;
        }
    }
}
