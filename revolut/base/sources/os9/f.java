package os9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.slider.RadialSliderView;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.payments.groups.impl.mappers.settings.GroupSettingsAction;
import com.revolut.feature.payments.groups.impl.ui_chat.members.GroupChatMembersScreen;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import ip0.no;
import ip0.p10;
import ip0.s7;
import ip0.t10;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import jsl.g0;
import jsl.j0;
import jsl.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229267a;

    public /* synthetic */ f(int i) {
        this.f229267a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f229267a) {
            case 0:
                RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = GroupChatMembersScreen.f79369e0;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.u;
                if (obj3 instanceof GroupSettingsAction) {
                    return (GroupSettingsAction) obj3;
                }
                return null;
            case 1:
                LargeActionButtonDelegate.Model it9 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = GroupChatMembersScreen.f79369e0;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj4 = it9.i;
                if (obj4 instanceof wr9.c) {
                    return (wr9.c) obj4;
                }
                return null;
            case 2:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (CardOwner) it10.getContent();
            case 3:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                return Boolean.valueOf(!list.isEmpty());
            case 4:
                Intrinsics.checkNotNullParameter((osk.c) obj2, "$this$update");
                return new osk.c(null, null, null, null);
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new no("analysts-widgets-targets-loading-listId");
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new no("analysts-widgets-ratings-loading-listId");
            case 7:
                ChargeBreakdown it11 = (ChargeBreakdown) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Optional.of(it11);
            case 8:
                InvestOrder it12 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return tsl.g.b(it12);
            case 9:
                tsl.f it13 = (tsl.f) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                if (it13 instanceof tsl.c) {
                    return (tsl.c) it13;
                }
                return null;
            case 10:
                x it14 = (x) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f178251a;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Optional.empty();
            case 12:
                od0.i it15 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Optional.ofNullable(it15.g());
            case 13:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Optional.empty();
            case 14:
                InvestOrder it16 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return tsl.g.b(it16);
            case 15:
                InvestOrder it17 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(com.revolut.retail.trading.core.domain.orders.a.l(it17));
            case 16:
                return ((x) obj2).f178251a;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                t10 t10Var = new t10("MUTUAL_FUND_ORDER_DETAILS_CELL_NEXT_PRICE_PUBLICATION_INFO_LOADING", p10.f165755a);
                yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(t10Var);
                List listK = v.k(new s7("MUTUAL_FUND_ORDER_DETAILS_CELL_STATUS", 0, 0, 0, 0, false, null, 126), new s7("MUTUAL_FUND_ORDER_DETAILS_CELL_EXECUTION_DATE", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                List listK2 = v.k(new s7("MUTUAL_FUND_ORDER_DETAILS_CELL_AMOUNT", 0, 0, 0, 0, false, null, 126), new s7("MUTUAL_FUND_ORDER_DETAILS_CELL_FEES", 0, 0, 0, 0, false, null, 126), new s7("MUTUAL_FUND_ORDER_DETAILS_CELL_TRADE_VALUE", 0, 0, 0, 0, false, null, 126), new s7("MUTUAL_FUND_ORDER_DETAILS_CELL_CURRENT_PRICE", 0, 0, 0, 0, false, null, 126), new s7("MUTUAL_FUND_ORDER_DETAILS_CELL_ESTIMATED_SHARES", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                eVarB.addAll(listK2);
                s7 s7Var = new s7("MUTUAL_FUND_ORDER_DETAILS_CELL_ACCOUNT", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var);
                s7 s7Var2 = new s7("MUTUAL_FUND_ORDER_DETAILS_CELL_FAQ_BUTTON_LOADING", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var2);
                return new j0(g0.f178213a, zhm.u.a(eVarB));
            case 18:
                e7l.f it18 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                od0.h hVar = od0.i.Companion;
                e7l.c cVar = it18.f123387p1;
                hVar.getClass();
                return od0.h.a(cVar);
            case 19:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                return Boolean.valueOf(!list2.isEmpty());
            case 20:
                ot1.c updateExtraData = (ot1.c) obj2;
                Intrinsics.checkNotNullParameter(updateExtraData, "$this$updateExtraData");
                TransferTrustData trustData = com.revolut.feature.transfer.models.transfer.a.b(updateExtraData.f229396b);
                ApmQuote apmQuote = updateExtraData.f229395a;
                e7l.c cVar2 = updateExtraData.f229397c;
                Intrinsics.checkNotNullParameter(trustData, "trustData");
                return new ot1.c(apmQuote, trustData, cVar2);
            case 21:
                Throwable it19 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it19, h0Var2);
                return f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return otk.i.f229733a;
            case 23:
                ((Integer) obj2).getClass();
                int i = RadialSliderView.f57534q;
                return Unit.f186387a;
            case 24:
                List it20 = (List) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return n14.k.H(it20);
            case 25:
                ou6.h update = (ou6.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ou6.h.a(update, null, null, null, null, false, LDSFile.EF_SOD_TAG);
            case 26:
                ou6.h update2 = (ou6.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ou6.h.a(update2, null, null, null, null, false, 31);
            case 27:
                ou6.h update3 = (ou6.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter = update3.d;
                return ou6.h.a(update3, null, null, acquiringOrderFilter != null ? acquiringOrderFilter.j9(o0.f186429a.b(AcquiringOrderFilter.FractionalAmount.class)) : null, null, false, LDSFile.EF_SOD_TAG);
            case 28:
                ou6.h update4 = (ou6.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter2 = update4.d;
                return ou6.h.a(update4, null, null, acquiringOrderFilter2 != null ? acquiringOrderFilter2.j9(o0.f186429a.b(AcquiringOrderFilter.Currency.class)) : null, null, false, LDSFile.EF_SOD_TAG);
            default:
                ou6.h update5 = (ou6.h) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter3 = update5.d;
                return ou6.h.a(update5, null, null, acquiringOrderFilter3 != null ? acquiringOrderFilter3.j9(o0.f186429a.b(AcquiringOrderFilter.DateRange.class)) : null, null, false, LDSFile.EF_SOD_TAG);
        }
    }
}
