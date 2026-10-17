package nae;

import au0.j4;
import aw0.j0;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.recurring_payments.api.RecurringPaymentApi$Toggles$PredictedSubscriptions;
import com.revolut.feature.subscriptions.api.subscriptionlist.SubscriptionListFeatureConfig;
import com.revolut.feature.subscriptions.impl.mark_recurring.MarkRecurringTransactionsContract$Configuration;
import com.revolut.feature.subscriptions.impl.mark_recurring.flow.MarkRecurringTransactionsFlowContract$SelectedTransaction;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import ip0.qd0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import m1i.l0;
import oma.r;
import te0.s;
import tof.a3;
import zhm.a0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f213872b;

    public /* synthetic */ k(q qVar, int i) {
        this.f213871a = i;
        this.f213872b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f213871a;
        final int i2 = 1;
        final int i3 = 0;
        q qVar = this.f213872b;
        switch (i) {
            case 0:
                g it8 = (g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((jte.d) qVar.u).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c) ? new pfm.h(new i1i.a(qVar, 20), 2) : new pfm.h(new la8.j(qVar, it8, 28), 2);
            case 1:
                String query = (String) obj2;
                pae.e eVar = qVar.f213881m;
                Intrinsics.h(query);
                eVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                ((pae.h) eVar.f234543c).w0().set(query);
                if (query.length() == 0) {
                    ((dqi.g) qVar.f213883p).N().scrollToPosition(0);
                }
                return Unit.f186387a;
            case 2:
                ((Boolean) obj2).getClass();
                ((dqi.g) qVar.f213883p).N().scrollToPosition(0);
                return Unit.f186387a;
            case 3:
                Intrinsics.checkNotNullParameter((k3l.j) obj2, "it");
                pae.g gVar = (pae.g) qVar.f213878h;
                gVar.getClass();
                pfm.h hVar = new pfm.h(new r(gVar, 5), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 4:
                qae.b bVar = qVar.f213879j;
                pae.c transactionsState = (pae.c) obj2;
                Intrinsics.checkNotNullParameter(transactionsState, "transactionsState");
                boolean zIsEmpty = transactionsState.f234536a.isEmpty();
                String searchQuery = transactionsState.d;
                if (!d0.W(searchQuery) && zIsEmpty) {
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                    return u.c(new FullScreenStateDelegate.Model("EMPTY_SEARCH_ITEM_LIST_ID", new TextLocalisedClause(R$string.recurring_payments_marking_no_results, null, null, 14), new TextLocalisedClause(R$string.recurring_payments_marking_no_transactions_for, u.c(searchQuery), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752));
                }
                if (zIsEmpty) {
                    bVar.getClass();
                    return u.c(new FullScreenStateDelegate.Model("NO_RECURRING_TRANSACTIONS_ITEM_LIST_ID", new TextLocalisedClause(R$string.recurring_payments_marking_no_transactions, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32756));
                }
                bVar.getClass();
                Intrinsics.checkNotNullParameter(transactionsState, "transactionsState");
                List list = transactionsState.f234536a;
                HashSet hashSet = transactionsState.f234538c;
                k71.q qVar2 = transactionsState.f234537b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list) {
                    a3 a3Var = (a3) obj3;
                    String strI = a0.d.i(a3Var.f272593h.getYear(), "_", a3Var.f272593h.getDayOfYear());
                    Object objO = linkedHashMap.get(strI);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, strI);
                    }
                    ((List) objO).add(obj3);
                }
                a3 a3Var2 = (a3) zhm.d0.d0(list);
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it9 = linkedHashMap.entrySet().iterator();
                while (it9.hasNext()) {
                    List list2 = (List) ((Map.Entry) it9.next()).getValue();
                    a3 a3Var3 = (a3) zhm.d0.b0(list2);
                    boolean zF = Intrinsics.f(a3Var3, a3Var2);
                    String strM = p.a.m(a3Var3.f272593h.getMillis(), "ITEM_GROUP_TITLE_LIST_ID_PREFIX");
                    TimeClause timeClause = new TimeClause(a3Var3.f272593h.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
                    int i5 = R$attr.uikit_dp32;
                    ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(strM, null, timeClause, null, null, null, j0.TRANSPARENT, null, null, false, false, a3Var3, null, zF ? R$attr.uikit_dp0 : i5, R$attr.uikit_dp16, i5, i5, 1044410);
                    List list3 = list2;
                    ArrayList<SelectableDelegate.Model> arrayList2 = new ArrayList(w.t(list3, 10));
                    Iterator it10 = list3.iterator();
                    while (it10.hasNext()) {
                        arrayList2.add(((anf.l) bVar.f244027a).p((a3) it10.next(), qVar2, new thf.h(false, false, 7)));
                    }
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                    for (SelectableDelegate.Model model2 : arrayList2) {
                        Object obj4 = ((RowDelegate.Model) model2.f53305b).u;
                        a3 a3Var4 = obj4 instanceof a3 ? (a3) obj4 : null;
                        arrayList3.add(SelectableDelegate.Model.e(model2, null, zhm.d0.T(hashSet, a3Var4 != null ? a3Var4.f272581b : null) ? qd0.SELECTED : qd0.UNSELECTED, null, null, 4194299));
                    }
                    int i6 = R$attr.uikit_dp0;
                    yp0.b.k(arrayList3, i6, i6, 0, 0, 28);
                    arrayList.add(i2b.a.q(model, arrayList3));
                }
                return w.u(arrayList);
            case 5:
                pae.c transactionsState2 = (pae.c) obj2;
                Intrinsics.checkNotNullParameter(transactionsState2, "transactionsState");
                boolean zIsEmpty2 = transactionsState2.f234536a.isEmpty();
                xpi.g gVar2 = qVar.i;
                if (zIsEmpty2) {
                    ((xpi.c) gVar2).d0(f0.f322471a);
                } else {
                    ((xpi.c) gVar2).d0(u.c(qVar.f213888w));
                }
                return Unit.f186387a;
            case 6:
                pae.e eVar2 = qVar.f213881m;
                SelectableDelegate.Model model3 = (SelectableDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                Object obj5 = ((RowDelegate.Model) model3.f53305b).u;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.transactions.models.Transaction");
                a3 transaction = (a3) obj5;
                if (model3.f53306c == qd0.SELECTED) {
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    pae.h hVar2 = (pae.h) eVar2.f234543c;
                    HashSet hashSet2 = (HashSet) hVar2.x0().get();
                    a0.D(hashSet2, new aqd.g(transaction, 9));
                    hVar2.x0().set(hashSet2);
                } else {
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    pae.h hVar3 = (pae.h) eVar2.f234543c;
                    HashSet hashSet3 = (HashSet) hVar3.x0().get();
                    hashSet3.add(new MarkRecurringTransactionsFlowContract$SelectedTransaction(transaction.f272581b, transaction.f272584c));
                    hVar3.x0().set(hashSet3);
                }
                return Unit.f186387a;
            case 7:
                pae.a aVar = qVar.f213878h;
                final AccountId accountId = qVar.f213886s.f89215a;
                final pae.g gVar3 = (pae.g) aVar;
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                pfm.h hVar4 = new pfm.h(new kfm.a() { // from class: pae.f
                    @Override // kfm.a
                    public final void run() {
                        int i21 = i3;
                        g gVar4 = gVar3;
                        AccountId accountId2 = accountId;
                        switch (i21) {
                            case 0:
                                gVar4.f234547a.onNext(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(new SubscriptionListFeatureConfig(null, y0.b(accountId2), 5))));
                                break;
                            default:
                                gVar4.f234547a.onNext(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(new SubscriptionListFeatureConfig(b9e.b.INACTIVE, y0.b(accountId2), 4))));
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                return hVar4;
            case 8:
                MarkRecurringTransactionsContract$Configuration markRecurringTransactionsContract$Configuration = qVar.f213886s;
                pae.a aVar2 = qVar.f213878h;
                LargeActionButtonDelegate.Model it11 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                String str = it11.f52613a;
                int iHashCode = str.hashCode();
                if (iHashCode != 178212915) {
                    if (iHashCode != 590648498) {
                        final AccountId accountId2 = markRecurringTransactionsContract$Configuration.f89215a;
                        final pae.g gVar4 = (pae.g) aVar2;
                        gVar4.getClass();
                        Intrinsics.checkNotNullParameter(accountId2, "accountId");
                        pfm.h hVar5 = new pfm.h(new kfm.a() { // from class: pae.f
                            @Override // kfm.a
                            public final void run() {
                                int i21 = i2;
                                g gVar42 = gVar4;
                                AccountId accountId22 = accountId2;
                                switch (i21) {
                                    case 0:
                                        gVar42.f234547a.onNext(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(new SubscriptionListFeatureConfig(null, y0.b(accountId22), 5))));
                                        break;
                                    default:
                                        gVar42.f234547a.onNext(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(new SubscriptionListFeatureConfig(b9e.b.INACTIVE, y0.b(accountId22), 4))));
                                        break;
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                        return hVar5;
                    }
                    final AccountId accountId22 = markRecurringTransactionsContract$Configuration.f89215a;
                    final pae.g gVar42 = (pae.g) aVar2;
                    gVar42.getClass();
                    Intrinsics.checkNotNullParameter(accountId22, "accountId");
                    pfm.h hVar52 = new pfm.h(new kfm.a() { // from class: pae.f
                        @Override // kfm.a
                        public final void run() {
                            int i21 = i2;
                            g gVar422 = gVar42;
                            AccountId accountId222 = accountId22;
                            switch (i21) {
                                case 0:
                                    gVar422.f234547a.onNext(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(new SubscriptionListFeatureConfig(null, y0.b(accountId222), 5))));
                                    break;
                                default:
                                    gVar422.f234547a.onNext(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(new SubscriptionListFeatureConfig(b9e.b.INACTIVE, y0.b(accountId222), 4))));
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar52, "fromAction(...)");
                    return hVar52;
                }
                if (str.equals("LIST_ID_GO_TO_MY_SUBSCRIPTIONS")) {
                    final AccountId accountId3 = markRecurringTransactionsContract$Configuration.f89215a;
                    final pae.g gVar5 = (pae.g) aVar2;
                    gVar5.getClass();
                    Intrinsics.checkNotNullParameter(accountId3, "accountId");
                    pfm.h hVar6 = new pfm.h(new kfm.a() { // from class: pae.f
                        @Override // kfm.a
                        public final void run() {
                            int i21 = i3;
                            g gVar422 = gVar5;
                            AccountId accountId222 = accountId3;
                            switch (i21) {
                                case 0:
                                    gVar422.f234547a.onNext(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(new SubscriptionListFeatureConfig(null, y0.b(accountId222), 5))));
                                    break;
                                default:
                                    gVar422.f234547a.onNext(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(new SubscriptionListFeatureConfig(b9e.b.INACTIVE, y0.b(accountId222), 4))));
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar6, "fromAction(...)");
                    return hVar6;
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "MarkRecurringTransactions", p.a.p("dialog button click for ", it11.f52613a, " not handled"), null, h0Var);
                return pfm.m.f235744a;
            case 9:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                pae.e eVar3 = qVar.f213881m;
                efm.d0 d0VarFirstOrError = ((pae.h) eVar3.f234543c).x0().c(s.f270018a).firstOrError();
                p8k.b bVar2 = new p8k.b(13, new pae.d(eVar3, i2));
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar2, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                pfm.a aVarE = new pfm.a(new pfm.a(mo3.a.w(hx7.a.O(o70.a.i(iVar), qVar.k, false, null, 24), qVar.f213880l), new a(new k(qVar, i3), 8), 4), mfm.f.f205044g, 1).e(new l0(qVar, i2));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 10:
                if (((dqi.j) obj2) == dqi.j.DRAGGING) {
                    e0m.e.b(((rpi.b) qVar.f213884q).f256387h, true);
                }
                return Unit.f186387a;
            case 11:
                ypi.i iVar2 = qVar.o;
                if (((Integer) obj2).intValue() > 0) {
                    iVar2.setVisible(true);
                    iVar2.f(new TextLocalisedClause(R$string.subscriptions_mark_as_subscription_title, null, null, 14));
                    qVar.N(true);
                } else {
                    iVar2.setVisible(false);
                    qVar.N(false);
                }
                return Unit.f186387a;
            case 12:
                String menuItemId = (String) obj2;
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (Intrinsics.f(menuItemId, "MENU_ITEM_SEARCH")) {
                    ((xpi.c) qVar.i).V(j4.FROM_CLICKED_BUTTON);
                    ((rpi.b) qVar.f213884q).N(true);
                }
                return Unit.f186387a;
            case 13:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                e0m.e.b(((rpi.b) qVar.f213884q).f256387h, false);
                ((xpi.c) qVar.i).N(j4.FROM_CLICKED_BUTTON);
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                pae.g gVar6 = (pae.g) qVar.f213878h;
                gVar6.getClass();
                pfm.h hVar7 = new pfm.h(new r(gVar6, 5), 2);
                Intrinsics.checkNotNullExpressionValue(hVar7, "fromAction(...)");
                return hVar7;
        }
    }
}
