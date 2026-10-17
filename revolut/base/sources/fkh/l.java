package fkh;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.x5;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogControllerContract$BuySectionClickParcel;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogControllerContract$SeeAllUnsettledBuyOrdersParcel;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogControllerContract$SeeAllUnsettledSellTransactionsParcel;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogControllerContract$SellSectionClickParcel;
import com.revolut.retail.trading.core.domain.orders.InvestOrderExtended;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final htl.f f135839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1h.e f135840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UnsettledDialogInputData f135841c;

    public l(htl.f investOrdersCommonMapper, f1h.e investTransactionsCommonMapper, gkh.a investOrdersFilterProvider, gkh.b investTransactionsFilterProvider, UnsettledDialogInputData inputData) {
        Intrinsics.checkNotNullParameter(investOrdersCommonMapper, "investOrdersCommonMapper");
        Intrinsics.checkNotNullParameter(investTransactionsCommonMapper, "investTransactionsCommonMapper");
        Intrinsics.checkNotNullParameter(investOrdersFilterProvider, "investOrdersFilterProvider");
        Intrinsics.checkNotNullParameter(investTransactionsFilterProvider, "investTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f135839a = investOrdersCommonMapper;
        this.f135840b = investTransactionsCommonMapper;
        this.f135841c = inputData;
    }

    public static lw0.a b(UnsettledDialogInputData unsettledDialogInputData) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        pih.j jVar = unsettledDialogInputData.f95928b;
        int[] iArr = k.f135838a;
        int i = iArr[jVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_dialog_unsettled_orders_title, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_dialog_unsettled_sell_orders_title, null, null, 14);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_dialog_unsettled_buy_orders_title, null, null, 14);
        }
        int i2 = iArr[unsettledDialogInputData.f95928b.ordinal()];
        if (i2 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_cash_info_dialog_unsettled_orders_description, null, null, 14);
        } else if (i2 == 2) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_cash_info_dialog_unsettled_sell_orders_description, null, null, 14);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_cash_info_dialog_unsettled_buy_orders_description, null, null, 14);
        }
        return new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
    }

    public final List a(Optional optional, boolean z, int i) throws Throwable {
        List list = (List) gj7.b.m(optional);
        if (ue0.e.n(list)) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        UnsettledDialogInputData unsettledDialogInputData = this.f135841c;
        arrayList.add(new ExpandableCellDelegate.Model("LIST_ID_UNSETTLED_BUY_ORDERS_HEADER", textLocalisedClause, new x5(new MoneyClause(unsettledDialogInputData.f95927a.f183151g, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), z, UnsettledDialogControllerContract$BuySectionClickParcel.f95975a));
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            List<InvestOrderExtended> listV0 = d0.V0(list, 2);
            ArrayList arrayList3 = new ArrayList();
            for (InvestOrderExtended investOrderExtended : listV0) {
                qv0.i iVarA = ((htl.k) this.f135839a).a(investOrderExtended, false, new htl.e(investOrderExtended, gkh.a.a(unsettledDialogInputData.f95927a), true));
                qv0.l lVar = iVarA instanceof qv0.l ? (qv0.l) iVarA : null;
                if (lVar != null) {
                    arrayList3.add(lVar);
                }
            }
            a0.x(arrayList3, arrayList2);
            if (list.size() > 2) {
                arrayList2.add(new LargeActionButtonDelegate.Model("LIST_ID_UNSETTLED_BUY_ORDERS_SEE_ALL_BUTTON", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.wealth_view_all, null, null, 14), false, null, null, UnsettledDialogControllerContract$SeeAllUnsettledBuyOrdersParcel.f95979a, null, 744));
            }
            i26.l.E(arrayList2);
        }
        a0.x(arrayList2, arrayList);
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cii.b bVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f135827a;
        Data data2 = domainState.f135828b;
        Data dataT = (data == null || data2 == null) ? null : t1.t(data, data2);
        return (dataT == null || (bVar = (cii.b) iii.c.f(dataT, new f(this, 2), new fgj.g(this, 11), new f0e.i(this, domainState, 13))) == null) ? new cii.b(null, f0.f322471a, null) : bVar;
    }

    public final List d(Optional optional, boolean z, int i) {
        e0h.a aVar = (e0h.a) gj7.b.m(optional);
        List list = aVar != null ? aVar.f121715a : null;
        if (ue0.e.n(list)) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        UnsettledDialogInputData unsettledDialogInputData = this.f135841c;
        arrayList.add(new ExpandableCellDelegate.Model("LIST_ID_UNSETTLED_SELL_ORDERS_HEADER", textLocalisedClause, new x5(new MoneyClause(unsettledDialogInputData.f95927a.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), z, UnsettledDialogControllerContract$SellSectionClickParcel.f95981a));
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            List<InvestTransaction> listV0 = d0.V0(list, 2);
            ArrayList arrayList3 = new ArrayList();
            for (InvestTransaction investTransaction : listV0) {
                q1h.b bVar = new q1h.b(q1h.a.ONLY_TIME);
                kel.b cashHolding = unsettledDialogInputData.f95927a;
                Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
                InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
                kel.a aVar2 = cashHolding.f183148a;
                String str = aVar2.f183146b;
                xi0.a aVar3 = xi0.b.Companion;
                String str2 = aVar2.e;
                aVar3.getClass();
                List listC = u.c(xi0.a.a(str2));
                Boolean bool = Boolean.TRUE;
                companion.getClass();
                RowDelegate.Model modelA = this.f135840b.a(investTransaction, bVar, new f1h.d(investTransaction, InvestTransactionsFilter.Companion.c(str, listC, bool), true));
                if (modelA == null) {
                    modelA = null;
                }
                if (modelA != null) {
                    arrayList3.add(modelA);
                }
            }
            a0.x(arrayList3, arrayList2);
            if (list.size() > 2) {
                arrayList2.add(new LargeActionButtonDelegate.Model("LIST_ID_UNSETTLED_SELL_ORDERS_SEE_ALL_BUTTON", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.wealth_view_all, null, null, 14), false, null, null, UnsettledDialogControllerContract$SeeAllUnsettledSellTransactionsParcel.f95980a, null, 744));
            }
            i26.l.E(arrayList2);
        }
        a0.x(arrayList2, arrayList);
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
