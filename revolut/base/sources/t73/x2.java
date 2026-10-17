package t73;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreenContract$InputData;
import com.revolut.feature.checkout.models.CheckoutOrder;
import h6e.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.hc;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class x2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3 f268569b;

    public /* synthetic */ x2(d3 d3Var, int i) {
        this.f268568a = i;
        this.f268569b = d3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        AccountId.Joint joint;
        h93.f0 f0Var;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        Object next9;
        Object next10;
        Object next11;
        Object next12;
        Object objPrevious;
        int i = this.f268568a;
        int i2 = 2;
        int i3 = 4;
        d3 d3Var = this.f268569b;
        switch (i) {
            case 0:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                return rd0.e.c(g6e.a.a(d3Var.f268451q, pockets, f.e.f149640a, null, false, 12), kotlin.coroutines.g.f186406a);
            case 1:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                return rd0.e.c(g6e.a.a(d3Var.f268451q, pockets2, f.d.f149639a, null, false, 12), kotlin.coroutines.g.f186406a);
            case 2:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                ArrayList<h93.f0> arrayList = new ArrayList();
                for (Object obj3 : cards) {
                    if (((h93.f0) obj3).y()) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (h93.f0 f0Var2 : arrayList) {
                    l93.f fVar = d3Var.f268450p;
                    String cardId = f0Var2.f150110a;
                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                    z6l.s sVar = ((ha3.x) fVar).f;
                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                    v6l.b1 b1Var = (v6l.b1) sVar.f319829a;
                    b1Var.getClass();
                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                    arrayList2.add(rd0.e.c(rd0.e.b(b1Var.f286440y.e(cardId, w4l.i.f294643c)), kotlin.coroutines.g.f186406a).map(new z2(new avc.o(f0Var2, 21), 0)));
                }
                d3Var.getClass();
                efm.r rVarDefaultIfEmpty = efm.r.combineLatest(arrayList2, new z2(new y2(8), i3)).startWith(zhm.r0.g()).defaultIfEmpty(zhm.r0.g());
                Intrinsics.checkNotNullExpressionValue(rVarDefaultIfEmpty, "defaultIfEmpty(...)");
                return ue0.e.H(rVarDefaultIfEmpty, zhm.h0.f322473a, new y2(9));
            case 3:
                Data jointAccountIdData = (Data) obj2;
                Intrinsics.checkNotNullParameter(jointAccountIdData, "jointAccountIdData");
                od0.i iVar = (od0.i) jointAccountIdData.getContent();
                return (iVar == null || (joint = (AccountId.Joint) iVar.f224257a) == null) ? zi0.c.j(zhm.f0.f322471a) : sh3.a.c(d3Var.e, zhm.u.c(pi3.s.CARD), joint, null, 4).map(new z2(new y2(6), i2));
            case 4:
                List checkoutOrders = (List) obj2;
                Intrinsics.checkNotNullParameter(checkoutOrders, "checkoutOrders");
                d3Var.getClass();
                if (checkoutOrders.isEmpty()) {
                    efm.r rVarJust = efm.r.just(zhm.f0.f322471a);
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    return rVarJust;
                }
                List<CheckoutOrder> list = checkoutOrders;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                for (CheckoutOrder checkoutOrder : list) {
                    arrayList3.add(new s63.d(checkoutOrder, com.revolut.feature.checkout.models.a.a(checkoutOrder)));
                }
                efm.r rVarJust2 = efm.r.just(arrayList3);
                Intrinsics.checkNotNullExpressionValue(rVarJust2, "just(...)");
                return rVarJust2;
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                h93.f0 f0Var3 = (h93.f0) pair.f186386b;
                od0.i iVar2 = (od0.i) data.getContent();
                AccountId.Joint joint2 = iVar2 != null ? (AccountId.Joint) iVar2.f224257a : null;
                CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = d3Var.f268441a;
                com.revolut.domain.interactors.transactions.a aVar = d3Var.k;
                nhf.a aVar2 = d3Var.f268447l;
                AccountId accountId = cardsCarouselScreenContract$InputData.f65408c;
                String str = f0Var3.u;
                String str2 = joint2 != null ? joint2.f51413b : null;
                AccountId accountId2 = joint2;
                if (!Intrinsics.f(str, str2)) {
                    accountId2 = accountId;
                }
                if (accountId2 instanceof AccountId.Personal) {
                    efm.r rVarD = com.revolut.domain.interactors.transactions.a.d(aVar, d3.b(f0Var3, null), zhm.u.c(tof.i1.f272794a), 4, TransactionsSort.STARTED_DATE_DESC, null, 16);
                    efm.r map = ((njf.j) aVar2).f().map(new t45.a(new y2(1), 28));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    return te0.w.l(rVarD, ue0.e.H(map, zhm.h0.f322473a, new y2(2)));
                }
                if (!(accountId2 instanceof AccountId.Joint)) {
                    throw new NoWhenBranchMatchedException();
                }
                AccountId.Joint joint3 = (AccountId.Joint) accountId2;
                efm.r rVarD2 = com.revolut.domain.interactors.transactions.a.d(aVar, d3.b(f0Var3, joint3), zhm.u.c(new hc(joint3.f51413b, null)), 4, TransactionsSort.STARTED_DATE_DESC, null, 16);
                efm.r map2 = ((njf.j) aVar2).b(accountId2).map(new t45.a(new y2(3), 29));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return te0.w.l(rVarD2, ue0.e.H(map2, zhm.h0.f322473a, new y2(4)));
            case 6:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                od0.i iVar3 = (od0.i) data2.getContent();
                if (iVar3 != null && iVar3.d()) {
                    return osg.b.g(d3Var.o, w4l.h.f294642c, io3.l.CURRENT, null, null, null, null, (AccountId) iVar3.c(), 60);
                }
                efm.r rVarJust3 = efm.r.just(new Data(zhm.f0.f322471a, data2.getError(), data2.getLoading()));
                Intrinsics.h(rVarJust3);
                return rVarJust3;
            default:
                vf0.j jVar = (vf0.j) obj2;
                Intrinsics.checkNotNullParameter(jVar, "<destruct>");
                s63.c cVar = (s63.c) jVar.f288445a;
                od0.i iVar4 = (od0.i) jVar.f288446b;
                Map map3 = (Map) jVar.f288447c;
                yt8.c cVar2 = (yt8.c) jVar.d;
                e7l.f fVar2 = (e7l.f) jVar.e;
                Data data3 = (Data) jVar.f;
                od0.i iVar5 = (od0.i) jVar.f288448g;
                List list2 = (List) jVar.f288449h;
                boolean zBooleanValue = ((Boolean) jVar.i).booleanValue();
                od0.i iVar6 = (od0.i) jVar.f288450j;
                List list3 = (List) jVar.k;
                Data data4 = (Data) jVar.f288451l;
                Data data5 = (Data) jVar.f288452m;
                s63.f fVar3 = (s63.f) jVar.f288453n;
                CardsStateSnapshot$SubscriptionsContent cardsStateSnapshot$SubscriptionsContent = (CardsStateSnapshot$SubscriptionsContent) jVar.o;
                h93.f0 f0Var4 = (h93.f0) iVar4.f224257a;
                if (f0Var4 == null || !cVar.f260109a.contains(f0Var4)) {
                    if (f0Var4 != null) {
                        List list4 = cVar.f260109a;
                        d3Var.getClass();
                        if (!list4.isEmpty()) {
                            ListIterator listIterator = list4.listIterator(list4.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    objPrevious = listIterator.previous();
                                    if (gc0.c.q((h93.f0) objPrevious, f0Var4)) {
                                    }
                                } else {
                                    objPrevious = null;
                                }
                            }
                            f0Var = (h93.f0) objPrevious;
                            if (f0Var == null) {
                                f0Var = (h93.f0) zhm.d0.b0(list4);
                            }
                            if (!Intrinsics.f(f0Var.f150110a, f0Var4.f150110a)) {
                                d3Var.u.onNext(Unit.f186387a);
                            }
                            d3Var.v.onNext(f0Var);
                            f0Var4 = f0Var;
                        }
                        f0Var4 = null;
                    } else {
                        List list5 = cVar.f260109a;
                        d3Var.getClass();
                        if (!list5.isEmpty()) {
                            try {
                                CardScreenAction cardScreenAction = d3Var.f268441a.d;
                                if (cardScreenAction instanceof CardScreenAction.AddToGooglePay) {
                                    Iterator it8 = list5.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            next11 = it8.next();
                                            if (Intrinsics.f(((h93.f0) next11).f150110a, ((CardScreenAction.AddToGooglePay) cardScreenAction).f65326a)) {
                                            }
                                        } else {
                                            next11 = null;
                                        }
                                    }
                                    f0Var = (h93.f0) next11;
                                    if (f0Var == null) {
                                        Iterator it9 = list5.iterator();
                                        while (true) {
                                            if (it9.hasNext()) {
                                                next12 = it9.next();
                                                if (((h93.f0) next12).J()) {
                                                }
                                            } else {
                                                next12 = null;
                                            }
                                        }
                                        f0Var = (h93.f0) next12;
                                        if (f0Var == null) {
                                            throw new IllegalStateException("No eligible for adding to GPay card for AddToGooglePay action");
                                        }
                                    }
                                } else if (cardScreenAction instanceof CardScreenAction.AddToGooglePayDialog) {
                                    Iterator it10 = list5.iterator();
                                    while (true) {
                                        if (it10.hasNext()) {
                                            next10 = it10.next();
                                            if (Intrinsics.f(((h93.f0) next10).f150110a, ((CardScreenAction.AddToGooglePayDialog) cardScreenAction).f65327a)) {
                                            }
                                        } else {
                                            next10 = null;
                                        }
                                    }
                                    f0Var = (h93.f0) next10;
                                    if (f0Var == null) {
                                        throw new IllegalStateException("No card by id for AddToGooglePayDialog action");
                                    }
                                } else if (Intrinsics.f(cardScreenAction, CardScreenAction.CreateDisposableCard.f65328a)) {
                                    Iterator it11 = list5.iterator();
                                    while (true) {
                                        if (it11.hasNext()) {
                                            next9 = it11.next();
                                            if (((h93.f0) next9).X()) {
                                            }
                                        } else {
                                            next9 = null;
                                        }
                                    }
                                    f0Var = (h93.f0) next9;
                                    if (f0Var == null) {
                                        throw new IllegalStateException("No retail disposable card for CreateDisposableCard action");
                                    }
                                } else if (Intrinsics.f(cardScreenAction, CardScreenAction.SelectDisposableCard.f65336a)) {
                                    Iterator it12 = list5.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            next8 = it12.next();
                                            if (((h93.f0) next8).X()) {
                                            }
                                        } else {
                                            next8 = null;
                                        }
                                    }
                                    f0Var = (h93.f0) next8;
                                    if (f0Var == null) {
                                        throw new IllegalStateException("No retail disposable card for SelectDisposableCard action");
                                    }
                                } else if (Intrinsics.f(cardScreenAction, CardScreenAction.Idle.f65329a) || Intrinsics.f(cardScreenAction, CardScreenAction.OrderNew.f65331a)) {
                                    f0Var = (h93.f0) zhm.d0.b0(list5);
                                } else if (cardScreenAction instanceof CardScreenAction.ShowBlockedDueToPinOrCVVDialog) {
                                    Iterator it13 = list5.iterator();
                                    while (true) {
                                        if (it13.hasNext()) {
                                            next7 = it13.next();
                                            if (Intrinsics.f(((h93.f0) next7).f150110a, ((CardScreenAction.ShowBlockedDueToPinOrCVVDialog) cardScreenAction).f65337a)) {
                                            }
                                        } else {
                                            next7 = null;
                                        }
                                    }
                                    f0Var = (h93.f0) next7;
                                    if (f0Var == null) {
                                        throw new IllegalStateException("No card by id for ShowBlockedDueToPinOrCVVDialog action");
                                    }
                                } else if (cardScreenAction instanceof CardScreenAction.UnblockPinAndCVV) {
                                    Iterator it14 = list5.iterator();
                                    while (true) {
                                        if (it14.hasNext()) {
                                            next6 = it14.next();
                                            if (Intrinsics.f(((h93.f0) next6).f150110a, ((CardScreenAction.UnblockPinAndCVV) cardScreenAction).f65338a)) {
                                            }
                                        } else {
                                            next6 = null;
                                        }
                                    }
                                    f0Var = (h93.f0) next6;
                                    if (f0Var == null) {
                                        throw new IllegalStateException("No card by id for UnblockPinAndCVV action");
                                    }
                                } else if (cardScreenAction instanceof CardScreenAction.PinTriesConfirmation) {
                                    Iterator it15 = list5.iterator();
                                    while (true) {
                                        if (it15.hasNext()) {
                                            next5 = it15.next();
                                            if (Intrinsics.f(((h93.f0) next5).f150110a, ((CardScreenAction.PinTriesConfirmation) cardScreenAction).f65332a)) {
                                            }
                                        } else {
                                            next5 = null;
                                        }
                                    }
                                    f0Var = (h93.f0) next5;
                                    if (f0Var == null) {
                                        throw new IllegalStateException("No card by id for PinTriesConfirmation action");
                                    }
                                } else if (cardScreenAction instanceof CardScreenAction.Select) {
                                    Iterator it16 = list5.iterator();
                                    while (true) {
                                        if (it16.hasNext()) {
                                            next4 = it16.next();
                                            if (Intrinsics.f(((h93.f0) next4).f150110a, ((CardScreenAction.Select) cardScreenAction).f65333a)) {
                                            }
                                        } else {
                                            next4 = null;
                                        }
                                    }
                                    f0Var = (h93.f0) next4;
                                    if (f0Var == null) {
                                        throw new IllegalStateException("No card by id for Select action");
                                    }
                                } else if (cardScreenAction instanceof CardScreenAction.Unfreeze) {
                                    Iterator it17 = list5.iterator();
                                    while (true) {
                                        if (it17.hasNext()) {
                                            next3 = it17.next();
                                            if (Intrinsics.f(((h93.f0) next3).f150110a, ((CardScreenAction.Unfreeze) cardScreenAction).f65339a)) {
                                            }
                                        } else {
                                            next3 = null;
                                        }
                                    }
                                    f0Var = (h93.f0) next3;
                                    if (f0Var == null) {
                                        throw new IllegalStateException("No card by id for Unfreeze action");
                                    }
                                } else if (cardScreenAction instanceof CardScreenAction.OneClickActivate) {
                                    Iterator it18 = list5.iterator();
                                    while (true) {
                                        if (it18.hasNext()) {
                                            next2 = it18.next();
                                            if (Intrinsics.f(((h93.f0) next2).f150110a, ((CardScreenAction.OneClickActivate) cardScreenAction).f65330a)) {
                                            }
                                        } else {
                                            next2 = null;
                                        }
                                    }
                                    f0Var = (h93.f0) next2;
                                    if (f0Var == null) {
                                        throw new IllegalStateException("No card by id for OneClickActivate action");
                                    }
                                } else {
                                    if (!(cardScreenAction instanceof CardScreenAction.VirtualCardDesignChanged)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Iterator it19 = list5.iterator();
                                    while (true) {
                                        if (it19.hasNext()) {
                                            next = it19.next();
                                            if (Intrinsics.f(((h93.f0) next).f150110a, ((CardScreenAction.VirtualCardDesignChanged) cardScreenAction).f65340a.f150110a)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    f0Var = (h93.f0) next;
                                    if (f0Var == null) {
                                        throw new IllegalStateException("No card by id for VirtualCardDesignChanged action");
                                    }
                                }
                            } catch (Exception e) {
                                zhm.h0 h0Var = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, "CardsScreenStateSnapshot", null, e, h0Var);
                                f0Var = (h93.f0) zhm.d0.b0(list5);
                            }
                            d3Var.v.onNext(f0Var);
                            f0Var4 = f0Var;
                        }
                        f0Var4 = null;
                    }
                }
                boolean z = cVar.f260111c;
                List list6 = cVar.f260109a;
                List list7 = (List) data3.getContent();
                if (list7 == null) {
                    list7 = zhm.f0.f322471a;
                }
                List list8 = list7;
                od0.i.Companion.getClass();
                od0.i iVarA = od0.h.a(f0Var4);
                Intrinsics.h(iVar5);
                e93.e eVar = (e93.e) iVar6.f224257a;
                d3Var.getClass();
                od0.i iVar7 = (od0.i) data4.getContent();
                return new s63.g(z, list6, list8, list2, iVarA, iVar5, cVar2, fVar2, zBooleanValue, eVar, list3, od0.h.a(iVar7 != null ? (zh9.y0) iVar7.f224257a : null), fVar3, cardsStateSnapshot$SubscriptionsContent, data5, cVar.f260110b, map3);
        }
    }
}
