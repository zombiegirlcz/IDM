package fv6;

import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.y1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreen;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.trading.orders.R$string;
import ip0.ak0;
import ip0.yj0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import z0h.k0;
import z0h.p1;
import z0h.t1;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138368a;

    public /* synthetic */ n(int i) {
        this.f138368a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f138368a) {
            case 0:
                g it8 = (g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f138360b;
            case 1:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 2:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 3:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 4:
                CandleStickGraphDelegate.a state = (CandleStickGraphDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                od0.h hVar = od0.i.Companion;
                y1 y1Var = state instanceof y1 ? (y1) state : null;
                hVar.getClass();
                return od0.h.a(y1Var);
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                nel.n nVar = (nel.n) pair.f186385a;
                t1 t1Var = (t1) pair.f186386b;
                Links links = t1Var.f318563a;
                hel.b bVar = t1Var.f318564b;
                return new p1(zhm.u.c(new k0(links, bVar, nVar.f214597c, nVar.i)), bVar);
            case 6:
                xdf.i it9 = (xdf.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f304438b;
            case 7:
                xdf.h it10 = (xdf.h) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f304436c;
            case 8:
                SourcePocket it11 = (SourcePocket) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.getF91784h();
            case 9:
                xi0.b it12 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(cp5.d.z(it12));
            case 10:
                List disclaimerMaps = (List) obj2;
                Intrinsics.checkNotNullParameter(disclaimerMaps, "disclaimerMaps");
                return r0.t(zhm.w.u(disclaimerMaps));
            case 11:
                rdh.a it13 = (rdh.a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.f253457a == rdh.b.ORDER_REVIEW_CRYPTO_RISK_WARNING);
            case 12:
                cvl.l it14 = (cvl.l) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f;
            case 13:
                cvl.l it15 = (cvl.l) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                d1h.g gVar = it15.f109494j;
                if (gVar != null) {
                    return gVar.f110649a;
                }
                return null;
            case 14:
                cvl.l it16 = (cvl.l) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f;
            case 15:
                xdf.i it17 = (xdf.i) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f304438b;
            case 16:
                xdf.h it18 = (xdf.h) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                l4l.a aVar = it18.f304435b;
                return Boolean.valueOf(aVar == l4l.a.TRADING_TAA_ISA || aVar == l4l.a.TRADING_TAA_JISA);
            case 17:
                xdf.h group = (xdf.h) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                return new Pair(new cvl.k(group.f304435b), new TextDelegate.Model("pocket_picker_disclaimer_" + group.f304435b, new TextLocalisedClause(R$string.wealth_trading_account_selector_unsettled_isa_note, null, null, 14), false, new ak0(yj0.START, null, 2), null, null, 0, 0, 0, 0, 2036));
            case 18:
                cvl.l it19 = (cvl.l) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f;
            case 19:
                xdf.i section = (xdf.i) obj2;
                Intrinsics.checkNotNullParameter(section, "section");
                return section.f304438b;
            case 20:
                SourcePocket it20 = (SourcePocket) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(it20.getF91792b() != null);
            case 21:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                nel.n nVar2 = (nel.n) pair2.f186385a;
                t1 t1Var2 = (t1) pair2.f186386b;
                return new p1(zhm.u.c(new WealthDisclaimersContract$Disclaimer$Investment.AccountSelector.Securities(t1Var2.f318564b, nVar2.i)), t1Var2.f318564b);
            case 22:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return new fwc.s((List) getDefaultLoadingItems3.invoke());
            case 23:
                FullScreenStateDelegate.Model it21 = (FullScreenStateDelegate.Model) obj2;
                KProperty[] kPropertyArr = TransportHubTicketsScreen.f0;
                Intrinsics.checkNotNullParameter(it21, "it");
                Object obj3 = it21.k;
                if (obj3 instanceof fwf.e) {
                    return (fwf.e) obj3;
                }
                return null;
            case 24:
                LargeActionButtonDelegate.Model it22 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = TransportHubTicketsScreen.f0;
                Intrinsics.checkNotNullParameter(it22, "it");
                Object obj4 = it22.i;
                if (obj4 instanceof fwf.e) {
                    return (fwf.e) obj4;
                }
                return null;
            case 25:
                RowDelegate.Model it23 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = TransportHubTicketsScreen.f0;
                Intrinsics.checkNotNullParameter(it23, "it");
                Object obj5 = it23.u;
                if (obj5 instanceof PurchasedTransitTicket) {
                    return (PurchasedTransitTicket) obj5;
                }
                return null;
            case 26:
                QRCodeDelegate.Model it24 = (QRCodeDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = TransportHubTicketsScreen.f0;
                Intrinsics.checkNotNullParameter(it24, "it");
                Object obj6 = it24.f53128j;
                if (obj6 instanceof PurchasedTransitTicket) {
                    return (PurchasedTransitTicket) obj6;
                }
                return null;
            case 27:
                RowDelegate.Model it25 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = TransportHubTicketsScreen.f0;
                Intrinsics.checkNotNullParameter(it25, "it");
                Object obj7 = it25.u;
                if (obj7 instanceof PurchasedTransitTicket.ToBeActivated) {
                    return (PurchasedTransitTicket.ToBeActivated) obj7;
                }
                return null;
            case 28:
                CellDetailsChevronDelegate.Model it26 = (CellDetailsChevronDelegate.Model) obj2;
                KProperty[] kPropertyArr6 = TransportHubTicketsScreen.f0;
                Intrinsics.checkNotNullParameter(it26, "it");
                return Boolean.valueOf(Intrinsics.f(it26.f51822a, "GET_HELP_ITEM_ID"));
            default:
                fwf.f updateState = (fwf.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return fwf.f.a(updateState, Data.copy$default(updateState.f138620a, null, null, true, 3, null), null, 2);
        }
    }
}
