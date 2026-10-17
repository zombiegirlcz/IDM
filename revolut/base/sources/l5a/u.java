package l5a;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.revolutpay.impl.ui.request_cvv.RequestCvvScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlowContract$PagerItem;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreen;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192219a;

    public /* synthetic */ u(int i) {
        this.f192219a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f192219a;
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 0:
                return ((PersistedBackground) obj2).f63743a.f63742b;
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return f0.f322471a;
            case 2:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return yp0.b.h(zhm.u.c(nb0.b(pb0.Companion, "CHECK_IN_LOADING_ROW", false, 0, false, 30)), new gu("CHECK_IN_LOADING_SUBHEADER", 0, 0, 30), null, 0, 126);
            case 3:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(!it10.getLoading());
            case 4:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return zhm.u.c(InvestorUpdateHistoryFlowContract$PagerItem.Loading.f91357a);
            case 5:
                xzg.c typeParameters = (xzg.c) obj2;
                Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
                if (typeParameters instanceof xzg.b) {
                    return d0.k0(((xzg.b) typeParameters).f309972a, "_", null, null, 0, null, 62);
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                x7h.a it12 = (x7h.a) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return x7h.c.a(it12);
            case 7:
                c8h.b it13 = (c8h.b) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                od0.h hVar = od0.i.Companion;
                PortfolioRecurringOrder portfolioRecurringOrderA = b8h.a.a(it13);
                hVar.getClass();
                return od0.h.a(portfolioRecurringOrderA);
            case 8:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it14 = list2.iterator();
                while (it14.hasNext()) {
                    arrayList.add(b8h.a.a((c8h.b) it14.next()));
                }
                return arrayList;
            case 9:
                CellDetailsActionDelegate.Model it15 = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr = CommodityOrderReviewScreen.X;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(Intrinsics.f(it15.f51781a, "SUMMARY_PRICE"));
            case 10:
                CellDetailsActionDelegate.Model it16 = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = CommodityOrderReviewScreen.X;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj3 = it16.f51787l;
                if (obj3 instanceof n7j.f) {
                    return (n7j.f) obj3;
                }
                return null;
            case 11:
                LargeActionButtonDelegate.Model it17 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = CommodityOrderReviewScreen.X;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(Intrinsics.f(it17.f52613a, "COMMODITY_PRICE_DESCRIPTION_GOT_IY_BUTTON_ID"));
            case 12:
                ty0.a it18 = (ty0.a) obj2;
                KProperty[] kPropertyArr4 = CommodityOrderReviewScreen.X;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(Intrinsics.f(it18.f275445a, "COMMODITY_LEARN_MORE_TEXT_ID"));
            case 13:
                l7j.g it19 = (l7j.g) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return (OrderQuote) it19.f192671b.getContent();
            case 14:
                l7j.g it20 = (l7j.g) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f192670a;
            case 15:
                Function0 defaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultLoadingItems, "defaultLoadingItems");
                int i2 = R$string.loan_management_repayment_v2_review_payment_v2_title;
                m70.a.c(t0.f186434a);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, zhm.u.c(""), null, 12);
                List list3 = (List) defaultLoadingItems.invoke();
                n6.Companion.getClass();
                return new l85.i(new aw0.e(false, null, null, m6.a(), null, null, 55), textLocalisedClause, list3);
            case 16:
                Function0 it21 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return f0.f322471a;
            case 17:
                l8f.b it22 = (l8f.b) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22;
            case 18:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new l8k.f((List) getDefaultLoadingItems.invoke(), false);
            case 19:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return new l8k.e(user, j6.a.q("revolut.me/", user.f));
            case 20:
                l92.a update = (l92.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = Data.copy$default(update.f193023a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(data, "data");
                return new l92.a(data);
            case 21:
                Function0 it23 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                gu guVar = new gu("ID_LOADING_HEADER", 0, 0, 30);
                pb0 pb0VarB = nb0.b(pb0.Companion, "ID_LOADING_ITEM", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(guVar, pb0VarB);
            case 22:
                Function0 it24 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return new Data(null, null, true, 3, null);
            case 23:
                InputTextDelegate.TextData it25 = (InputTextDelegate.TextData) obj2;
                KProperty[] kPropertyArr5 = RequestCvvScreen.f84514b0;
                Intrinsics.checkNotNullParameter(it25, "it");
                return Boolean.valueOf(Intrinsics.f(it25.f52597a, "CVV_INPUT_FIELD_ID"));
            case 24:
                InputTextDelegate.TextData it26 = (InputTextDelegate.TextData) obj2;
                KProperty[] kPropertyArr6 = RequestCvvScreen.f84514b0;
                Intrinsics.checkNotNullParameter(it26, "it");
                return it26.f52598b.toString();
            case 25:
                Throwable it27 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 26:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new l9j.g((vtd.c) ((od0.i) rVar.f314201a).f224257a, (ej0.b) ((od0.i) rVar.f314203c).f224257a, (ej0.b) ((od0.i) rVar.f314202b).f224257a);
            case 27:
                Throwable it28 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 28:
                vtd.c it29 = (vtd.c) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it29);
            default:
                Throwable it30 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it30, "it");
                od0.i.Companion.getClass();
                return iVar;
        }
    }

    public /* synthetic */ u(cli.n nVar, int i) {
        this.f192219a = i;
    }
}
