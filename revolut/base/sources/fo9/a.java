package fo9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlowContract$PagerItem;
import com.revolut.feature.credit.application.close.provider.CancellationDialogProvider$CancellationConfirmationOption;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreen;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreen;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.StockFinancialsStatementFragment;
import com.revolut.shared.feature.wealth.models.config.Links;
import ft4.a0;
import ft4.y;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import le.u1;
import tof.a3;
import z0h.i0;
import z0h.p1;
import z0h.t1;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136839a;

    public /* synthetic */ a(int i) {
        this.f136839a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yoj.a aVar;
        ?? arrayList;
        Object next;
        String str;
        Object obj3 = null;
        switch (this.f136839a) {
            case 0:
                RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = CounterPartyDetailsScreen.V;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj4 = it8.u;
                if (obj4 instanceof a3) {
                    return (a3) obj4;
                }
                return null;
            case 1:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new q((List) getDefaultLoadingItems.invoke());
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                pb0 pb0Var = new pb0("LIST_ID_TRANSACTIONS_LIST_LOADING");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(pb0Var);
            case 3:
                List trips = (List) obj2;
                Intrinsics.checkNotNullParameter(trips, "trips");
                od0.h hVar = od0.i.Companion;
                Iterator it9 = trips.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next2 = it9.next();
                        if (((Trip) next2).a()) {
                            obj3 = next2;
                        }
                    }
                }
                hVar.getClass();
                return od0.h.a(obj3);
            case 4:
                t1 disclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                Links links = disclaimersData.f318563a;
                hel.b bVar = disclaimersData.f318564b;
                return new p1(zhm.u.c(new i0(links, bVar)), bVar);
            case 5:
                ParcelableDestination destination = (ParcelableDestination) obj2;
                Intrinsics.checkNotNullParameter(destination, "destination");
                return u0.e(destination);
            case 6:
                List<epj.a> features = (List) obj2;
                Intrinsics.checkNotNullParameter(features, "features");
                ArrayList arrayList2 = new ArrayList();
                for (epj.a aVar2 : features) {
                    Object obj5 = dpj.a.f116886a;
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    yoj.c cVar = (yoj.c) u1.v(aVar2.getName(), dpj.a.f116886a);
                    yoj.d dVar = (yoj.d) u1.v(aVar2.getState(), dpj.a.f116887b);
                    if (cVar == null || dVar == null) {
                        aVar = null;
                    } else {
                        List listA = aVar2.getInvites();
                        if (listA != null) {
                            List<epj.b> list = listA;
                            arrayList = new ArrayList(w.t(list, 10));
                            for (epj.b bVar2 : list) {
                                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                                arrayList.add(new yoj.g(bVar2.getId(), bVar2.getInviteeId(), bVar2.getInviteeFullName()));
                            }
                        } else {
                            arrayList = f0.f322471a;
                        }
                        Map mapC = aVar2.getProperties();
                        if (mapC == null) {
                            mapC = r0.g();
                        }
                        aVar = new yoj.a(cVar, dVar, arrayList, mapC);
                    }
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                }
                return new yoj.f(arrayList2);
            case 7:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(!it10.getLoading());
            case 8:
                LargeActionButtonDelegate.Model it11 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj6 = it11.i;
                if (obj6 instanceof CancellationDialogProvider$CancellationConfirmationOption) {
                    return (CancellationDialogProvider$CancellationConfirmationOption) obj6;
                }
                return null;
            case 9:
                rp0.p it12 = (rp0.p) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12 == rp0.p.USER);
            case 10:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 11:
                Boolean updatesLoaded = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(updatesLoaded, "updatesLoaded");
                return Boolean.valueOf(!updatesLoaded.booleanValue());
            case 12:
                al0.a networkState = (al0.a) obj2;
                Intrinsics.checkNotNullParameter(networkState, "networkState");
                return Boolean.valueOf(networkState == al0.a.ONLINE);
            case 13:
                Intrinsics.checkNotNullParameter((al0.a) obj2, "it");
                return new Throwable();
            case 14:
                fo3.c it13 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f136801a;
            case 15:
                efm.i observable = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(observable, "observable");
                return observable.b(100L, TimeUnit.MILLISECONDS);
            case 16:
                zx0.i it14 = (zx0.i) obj2;
                KProperty[] kPropertyArr2 = JuniorTransferAmountScreen.i0;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj7 = it14.f326000g;
                if (obj7 instanceof h9i.c) {
                    return (h9i.c) obj7;
                }
                return null;
            case 17:
                fr8.l updateState = (fr8.l) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                m70.a.c(t0.f186434a);
                return fr8.l.a(updateState, 0L, null, "", null, null, null, null, null, null, 507);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new fr8.o(f0.f322471a, null, null);
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Map map = (Map) pair.f186385a;
                List list2 = (List) pair.f186386b;
                ArrayList arrayList3 = new ArrayList(map.size());
                Iterator it15 = map.entrySet().iterator();
                while (it15.hasNext()) {
                    arrayList3.add((JuniorBankingProfile) ((Map.Entry) it15.next()).getValue());
                }
                List<JuniorBankingProfile> listP0 = d0.P0(arrayList3, new fs2.n());
                ArrayList arrayList4 = new ArrayList();
                for (JuniorBankingProfile juniorBankingProfile : listP0) {
                    String str2 = juniorBankingProfile.f77103j;
                    String str3 = juniorBankingProfile.f77099b;
                    Iterator it16 = list2.iterator();
                    while (true) {
                        if (it16.hasNext()) {
                            next = it16.next();
                            if (Intrinsics.f(((psg.a) next).f239485b, juniorBankingProfile.f77103j)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    psg.a aVar3 = (psg.a) next;
                    BlockedPaymentsListFlowContract$PagerItem blockedPaymentsListFlowContract$PagerItem = (aVar3 == null || (str = aVar3.f239484a) == null) ? null : new BlockedPaymentsListFlowContract$PagerItem(new ContentUser.Junior(str2, str3, str), str2);
                    if (blockedPaymentsListFlowContract$PagerItem != null) {
                        arrayList4.add(blockedPaymentsListFlowContract$PagerItem);
                    }
                }
                return arrayList4;
            case 20:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new pr5.b(n14.k.N((List) pair2.f186386b), (List) pair2.f186385a);
            case 21:
                Map it17 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.values();
            case 22:
                Map it18 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                ArrayList arrayList5 = new ArrayList();
                for (Map.Entry entry : it18.entrySet()) {
                    Object key = entry.getKey();
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        key = null;
                    }
                    String str4 = (String) key;
                    if (str4 != null) {
                        arrayList5.add(str4);
                    }
                }
                return arrayList5;
            case 23:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                return Unit.f186387a;
            case 24:
                int i = StockFinancialsStatementFragment.f103802k0;
                Intrinsics.checkNotNullParameter((FullScreenStateDelegate.Model) obj2, "it");
                return Unit.f186387a;
            case 25:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return d0.E0((List) pair3.f186386b, (List) pair3.f186385a);
            case 26:
                ListSubheaderDelegate.Model it19 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Object obj8 = it19.f52715m;
                if (obj8 instanceof esk.a) {
                    return (esk.a) obj8;
                }
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 28:
                ft2.e update = (ft2.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ft2.e.a(update, null, 1);
            default:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                ft4.k kVar = (ft4.k) pair4.f186385a;
                a0 a0Var = (a0) pair4.f186386b;
                y yVar = a0Var instanceof y ? (y) a0Var : null;
                return new ft4.l(kVar, yVar != null ? yVar.f137933a : null);
        }
    }
}
