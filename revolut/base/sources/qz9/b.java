package qz9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleLoadingDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.feature.payments.messaging.data.api.model.TransferLinkItem;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.payments.social.impl.R$string;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen.TransferOnlyChatScreen;
import com.revolut.feature.transfer.core.models.CountryProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tof.a3;
import tof.i7;
import tof.na;
import tof.va;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250414a;

    public /* synthetic */ b(int i) {
        this.f250414a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objValueOf;
        int i = this.f250414a;
        od0.i iVar = od0.i.f224256b;
        boolean z = false;
        switch (i) {
            case 0:
                PersistedBackground it8 = (PersistedBackground) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f63743a.f63742b;
            case 1:
                List countryProfiles = (List) obj2;
                Intrinsics.checkNotNullParameter(countryProfiles, "countryProfiles");
                List list = countryProfiles;
                int iB = q0.b(w.t(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj3 : list) {
                    linkedHashMap.put(((CountryProfile) obj3).f92231a, obj3);
                }
                return linkedHashMap;
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return r0.g();
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                Map map = (Map) pair.f186386b;
                List<MoneyRequest> list3 = list2;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                for (MoneyRequest moneyRequest : list3) {
                    Set set = dv9.b.f118061a;
                    arrayList.add(dv9.b.a(moneyRequest, null, (CountryProfile) map.get(moneyRequest.f60323p)));
                }
                return arrayList;
            case 4:
                od0.i optionalBoolean = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalBoolean, "optionalBoolean");
                return Boolean.valueOf(Intrinsics.f(optionalBoolean.g(), Boolean.TRUE));
            case 5:
                od0.i settingOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(settingOptional, "settingOptional");
                RecipientPaymentsSettings.Setting setting = (RecipientPaymentsSettings.Setting) settingOptional.g();
                RecipientPaymentsSettings.Setting.Value value = setting != null ? setting.f79676b : null;
                RecipientPaymentsSettings.Setting.Value.LongNumber longNumber = value instanceof RecipientPaymentsSettings.Setting.Value.LongNumber ? (RecipientPaymentsSettings.Setting.Value.LongNumber) value : null;
                od0.h hVar = od0.i.Companion;
                objValueOf = longNumber != null ? Long.valueOf(longNumber.f79678a) : null;
                hVar.getClass();
                return od0.h.a(objValueOf);
            case 6:
                List juniorPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(juniorPockets, "juniorPockets");
                od0.h hVar2 = od0.i.Companion;
                List list4 = juniorPockets;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((io3.d) it9.next()).f163145a);
                }
                na naVar = new na(new va(d0.i1(arrayList2)));
                hVar2.getClass();
                return od0.h.a(naVar);
            case 7:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return te0.w.g(d0.d0(transactions));
            case 8:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list5 = (List) pair2.f186385a;
                Map map2 = (Map) pair2.f186386b;
                List<a3> list6 = list5;
                ArrayList arrayList3 = new ArrayList(w.t(list6, 10));
                for (a3 a3Var : list6) {
                    Set set2 = dv9.b.f118061a;
                    arrayList3.add(dv9.b.b(a3Var, (CountryProfile) map2.get(a3Var.d)));
                }
                return arrayList3;
            case 9:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return new m((List) pair3.f186386b, (i7) pair3.f186385a);
            case 10:
                List transactions2 = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions2, "transactions");
                return Boolean.valueOf(!transactions2.isEmpty());
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 12:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                do3.n nVar = (do3.n) pair4.f186385a;
                n38.a aVar = (n38.a) ((od0.i) pair4.f186386b).f224257a;
                objValueOf = aVar != null ? l38.a.b(aVar, nVar.f116408a) : null;
                od0.i.Companion.getClass();
                return new Pair(nVar, od0.h.a(objValueOf));
            case 13:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                List[] elements = {(List) pair5.f186385a, (List) pair5.f186386b};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return d0.P0(w.u(kotlin.collections.d.L(elements)), new q());
            case 14:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new Data(null, it10, false, 5, null);
            case 15:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List transactionItems = (List) rVar.f314201a;
                List list7 = (List) rVar.f314202b;
                List paymentLinkItems = (List) rVar.f314203c;
                Intrinsics.checkNotNullParameter(transactionItems, "transactionItems");
                Intrinsics.checkNotNullParameter(paymentLinkItems, "paymentLinkItems");
                if (!paymentLinkItems.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it11 = paymentLinkItems.iterator();
                    while (it11.hasNext()) {
                        linkedHashSet.add(((P2PChatItem) it11.next()).getF79578a());
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : transactionItems) {
                        P2PChatItem p2PChatItem = (P2PChatItem) obj4;
                        TransferLinkItem transferLinkItem = p2PChatItem instanceof TransferLinkItem ? (TransferLinkItem) p2PChatItem : null;
                        if (!d0.T(linkedHashSet, transferLinkItem != null ? transferLinkItem.f79582h : null)) {
                            arrayList4.add(obj4);
                        }
                    }
                    transactionItems = arrayList4;
                }
                return d0.E0(paymentLinkItems, d0.E0(list7, transactionItems));
            case 16:
                od0.i moneyOpt = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(moneyOpt, "moneyOpt");
                return moneyOpt.d() ? zhm.u.c(new tz9.a(new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.social_payments_chat_send_button, null, null, 14), new MoneyClause((dj0.d) moneyOpt.c(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12))) : f0.f322471a;
            case 17:
                Set currencies = (Set) obj2;
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                Set set3 = currencies;
                int iB2 = q0.b(w.t(set3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj5 : set3) {
                    xi0.b.Companion.getClass();
                    linkedHashMap2.put(obj5, cp5.d.J(xi0.a.a((String) obj5)));
                }
                return linkedHashMap2;
            case 18:
                Object[] array = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(array, "array");
                List listV0 = kotlin.collections.d.v0(array);
                Intrinsics.i(listV0, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract.RemoteStoriesModel>");
                return listV0;
            case 19:
                int i2 = qzb.s.f250512a[((m1c.r0) obj2).f201447a.ordinal()];
                if (i2 == 1) {
                    return "opted_in";
                }
                if (i2 == 2) {
                    return "opted_out";
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 21:
                yvh.b autoInvest = (yvh.b) obj2;
                Intrinsics.checkNotNullParameter(autoInvest, "autoInvest");
                if (autoInvest.f317177b && autoInvest.f == yvh.f.SPARE_CHANGE && autoInvest.e == yvh.h.CURRENT_POCKET) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                Boolean it12 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(!it12.booleanValue());
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 24:
                vf0.h hVar3 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar3, "<destruct>");
                Set set4 = (Set) hVar3.f288433a;
                List list8 = (List) hVar3.f288434b;
                List list9 = (List) hVar3.f288435c;
                do3.n nVar2 = (do3.n) hVar3.d;
                List list10 = list8;
                int iB3 = q0.b(w.t(list10, 10));
                if (iB3 < 16) {
                    iB3 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB3);
                for (Object obj6 : list10) {
                    linkedHashMap3.put(((FreelancerTaxProfile) obj6).f73475b, obj6);
                }
                List list11 = list9;
                int iB4 = q0.b(w.t(list11, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB4 >= 16 ? iB4 : 16);
                for (Object obj7 : list11) {
                    linkedHashMap4.put(((TaxHubCalendarEvent) obj7).f73484b, obj7);
                }
                return new r07.f(set4, linkedHashMap3, linkedHashMap4, do3.q.y(nVar2));
            case 25:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 26:
                KProperty[] kPropertyArr = TransferOnlyChatScreen.f79800a0;
                Object f53090n = ((qv0.p) obj2).getF();
                if (f53090n instanceof ChatItem) {
                    return (ChatItem) f53090n;
                }
                return null;
            case 27:
                r0a.i it13 = (r0a.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f250735b;
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gw0.t tVar = gw0.t.SINGLE_TAIL;
                return zhm.v.k(new ChatBubbleLoadingDelegate.Model("LOADING_ITEM_1", new gw0.i(tVar), null, null, 28), new ChatBubbleLoadingDelegate.Model("LOADING_ITEM_2", new gw0.j(tVar), null, null, 28));
            default:
                r0e.g update = (r0e.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data taxYears = new Data(null, null, true, 3, null);
                update.getClass();
                Intrinsics.checkNotNullParameter(taxYears, "taxYears");
                return new r0e.g(taxYears);
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f250414a = i;
    }
}
