package q03;

import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import au0.j4;
import com.revolut.chat.ui.messageslist.widgets.ChatWidgetException;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$State;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$PagerItem;
import com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.TravelExperienceLocationPickerScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.balance.picker.legacy.impl.BalanceScreenContract$Configuration;
import ip0.bj0;
import ip0.cj0;
import ip0.s7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lk0.h;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f241071b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f241070a = i;
        this.f241071b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f241070a;
        int i2 = 5;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        int i3 = 1;
        Continuation continuation = null;
        Object obj3 = this.f241071b;
        switch (i) {
            case 0:
                e03.b data = (e03.b) obj2;
                Intrinsics.checkNotNullParameter(data, "content");
                u03.j jVar = ((com.revolut.feature.card_management.impl.ui.kompot.settings.b) obj3).f64911r;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                efm.r map = jVar.f276048b.a(data.f121380a, data.f121385j).map(new ty1.c(new twg.a(data, jVar, 13), 26));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return rd0.e.b(map);
            case 1:
                h93.f0 card = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                return rd0.e.b(((h0) obj3).f241075g.a(card));
            case 2:
                q09.c0 c0Var = (q09.c0) obj3;
                q09.l updateState = (q09.l) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                LinkedHashMap linkedHashMapZ = r0.z(updateState.f241193b);
                linkedHashMapZ.put(c0Var.f241182a, c0Var);
                Unit unit = Unit.f186387a;
                return q09.l.a(updateState, null, linkedHashMapZ, null, 5);
            case 3:
                pz0.a aVar = (pz0.a) obj3;
                q09.l updateState2 = (q09.l) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return q09.l.a(updateState2, null, null, aVar == null ? bj0.f163619a : new cj0(aVar), 3);
            case 4:
                u09.f course = (u09.f) obj2;
                Intrinsics.checkNotNullParameter(course, "course");
                return new q09.y(course.f, (u09.q) obj3);
            case 5:
                KProperty[] kPropertyArr = RevPointsTransactionsListScreen.f83871e0;
                com.revolut.feature.rev_points.impl.ui.transactions.list.d dVar = (com.revolut.feature.rev_points.impl.ui.transactions.list.d) ((RevPointsTransactionsListScreen) obj3).k3();
                dVar.getClass();
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "event");
                dVar.f83895y.onNext(event);
                return Unit.f186387a;
            case 6:
                com.revolut.feature.rev_points.impl.ui.transactions.list.b bVar = (com.revolut.feature.rev_points.impl.ui.transactions.list.b) obj2;
                return bVar instanceof q0c.l ? q0c.l.a((q0c.l) bVar, null, null, null, ((syb.b) ((com.revolut.feature.rev_points.impl.ui.a) obj3)).f266645a, false, null, null, null, false, false, 1015) : bVar;
            case 7:
                return TextContextMenuModifierKt.collectTextContextMenuData$lambda$0$0((TextContextMenuBuilderScope) obj3, (Function1) obj2);
            case 8:
                q1a.b bVar2 = (q1a.b) obj3;
                q1a.e splitBillsResult = (q1a.e) obj2;
                Intrinsics.checkNotNullParameter(splitBillsResult, "splitBillsResult");
                pfm.h hVarN = pd.b.n(skm.p0.f264003c, new pwb.p(bVar2, continuation, i2));
                j6k.o oVar = ((u6k.h) bVar2.f241409b).f277624a;
                pfm.a aVar2 = new pfm.a(te0.w.H0(oVar.e(), oVar.c()), new j4e.c(22, new j6k.d(oVar, i3)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return efm.b.p(hVarN, aVar2).D(splitBillsResult);
            case 9:
                q2e.h update = (q2e.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return q2e.h.a(update, null, ((StoreBrandDetailFlowContract$PagerItem) obj3).getF94249a(), null, null, null, null, null, false, false, false, false, null, null, null, null, 65533);
            case 10:
                q2e.h update2 = (q2e.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return q2e.h.a(update2, null, null, null, null, null, ((v2e.o) ((v2e.p) obj3)).f285723a, null, false, false, false, false, null, null, null, null, 65503);
            case 11:
                return q2e.h.a((q2e.h) obj2, null, null, null, null, null, null, null, false, false, false, false, null, null, (tvb.c) obj3, null, 57343);
            case 12:
                w0g.q qVar = (w0g.q) obj3;
                Unit it8 = (Unit) obj2;
                KProperty[] kPropertyArr2 = TravelExperienceLocationPickerScreen.f0;
                Intrinsics.checkNotNullParameter(it8, "it");
                e0m.e.a(qVar.f293733b);
                NavBarWithToolbar navBarWithToolbar = qVar.f293733b;
                navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
                navBarWithToolbar.i0();
                return Unit.f186387a;
            case 13:
                return ((g1i.l0) ((q2i.f) obj3).f241660h).k();
            case 14:
                BalanceScreenContract$Configuration balanceScreenContract$Configuration = (BalanceScreenContract$Configuration) obj3;
                q2j.d item = (q2j.d) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                xi0.b bVarE = item.e();
                Set set = balanceScreenContract$Configuration.f99577j;
                if ((set == null || !set.contains(item.e().f306286a)) && ((balanceScreenContract$Configuration.e || !cp5.d.z(bVarE)) && ((balanceScreenContract$Configuration.f || cp5.d.z(bVarE)) && ((balanceScreenContract$Configuration.f99575g || !cp5.d.y(bVarE)) && (balanceScreenContract$Configuration.f99576h || cp5.d.y(bVarE)))))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                List list = (List) obj2;
                mri.w wVar = ((q2k.e) obj3).e;
                Intrinsics.h(list);
                ((nzl.a) wVar).a(((kq2.b) zhm.d0.b0(list)).f188296a);
                return Unit.f186387a;
            case 16:
                yp0.h0 change = (yp0.h0) obj2;
                KProperty[] kPropertyArr3 = SelectorScreen.f65290n0;
                Intrinsics.checkNotNullParameter(change, "change");
                ScreenContentRecyclerView cardPaymentMethodSelectorRecyclerView = ((SelectorScreen) obj3).h3().d;
                Intrinsics.checkNotNullExpressionValue(cardPaymentMethodSelectorRecyclerView, "cardPaymentMethodSelectorRecyclerView");
                knm.b.v(change.e - change.f315732c, cardPaymentMethodSelectorRecyclerView);
                return Unit.f186387a;
            case 17:
                q43.s updateState3 = (q43.s) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return q43.s.a(updateState3, null, null, null, null, ((q43.y) ((com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d) obj3)).f242054a, null, null, null, null, null, 4063);
            case 18:
                q43.z zVar = (q43.z) obj3;
                q43.s updateState4 = (q43.s) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                for (q43.b0 b0Var : updateState4.f242044c) {
                    if (Intrinsics.f(b0Var.b(), zVar.f242055a)) {
                        return q43.s.a(updateState4, null, null, null, b0Var, null, null, null, null, null, null, 4079);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 19:
                q43.s updateState5 = (q43.s) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return q43.s.a(updateState5, null, null, null, null, null, null, new x33.f(zhm.u.c((PocketWithSubaccount) obj3)), null, null, null, 3967);
            case 20:
                q43.s updateState6 = (q43.s) obj2;
                Intrinsics.checkNotNullParameter(updateState6, "$this$updateState");
                return q43.s.a(updateState6, null, null, null, (q43.b0) obj3, null, null, null, null, null, null, 4079);
            case 21:
                CreditAddressV2FlowContract$State update3 = (CreditAddressV2FlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                List previousAddresses = ((s44.j) ((s44.k) obj3)).f259759a;
                update3.getClass();
                Intrinsics.checkNotNullParameter(previousAddresses, "previousAddresses");
                return new CreditAddressV2FlowContract$State(previousAddresses);
            case 22:
                q49.c update4 = (q49.c) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return q49.c.a(update4, null, null, null, ((q49.h) obj3).f242090q.a(), 7);
            case 23:
                return q4a.f.a((q4a.f) obj2, false, false, null, (WhoToTransferFilter) obj3, null, false, null, null, 503);
            case 24:
                return q4a.f.a((q4a.f) obj2, false, false, null, null, null, false, null, (q4a.g) obj3, 383);
            case 25:
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                return new q4a.k((List) loadingItems.invoke(), (q4a.i) obj3);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                lw0.a aVarA = q4b.h.a(((q4b.e) obj3).f242121b);
                ArrayList arrayList = new ArrayList(3);
                for (int i5 = 0; i5 < 3; i5++) {
                    arrayList.add(new s7(a0.d.n("cfd-spread-breakdown-loading-", i5), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new cii.b(null, arrayList, aVarA);
            case 27:
                q50.q qVar2 = (q50.q) obj3;
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                v20.j0 j0Var = qVar2.f242262c;
                UUID serverId = j0Var.getServerId();
                if (serverId == null) {
                    serverId = j0Var.getId();
                }
                ChatWidgetException chatWidgetException = new ChatWidgetException("Widget lifecycle error for msgId=" + serverId + ", type=" + j0Var.getWidget().f285419a, throwable);
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, chatWidgetException, h0Var);
                qVar2.a();
                qVar2.b(null);
                return Unit.f186387a;
            case 28:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (wz5.a) ((q53.c) obj3).f242290b.get("KEY_SALES_TIPS_SETTINGS");
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(((jt0.b) obj3).v0((Stack) pair.f186385a, (BackendFlow) ((od0.i) pair.f186386b).f224257a));
        }
    }

    public /* synthetic */ h(q4b.h hVar, q4b.e eVar) {
        this.f241070a = 26;
        this.f241071b = eVar;
    }
}
