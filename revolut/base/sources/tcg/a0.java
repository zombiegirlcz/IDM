package tcg;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.RecurringDepositDetailsViewController;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import ip0.pb0;
import ip0.s7;
import ip0.um0;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tof.hc;
import tof.q6;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269776a;

    public /* synthetic */ a0(int i) {
        this.f269776a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f269776a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return f0.f322471a;
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return null;
            case 2:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 2);
                for (int i = 0; i < 2; i++) {
                    arrayListP.add(new s7(a0.d.n("RECURRING_TRANSFER_INFO_LOADING_", i), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 3:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return null;
            case 4:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new pb0("RECURRING_TRANSFER_PAYMENT_FROM_LIST_ID");
            case 5:
                ActionsView.Item it12 = (ActionsView.Item) obj2;
                KProperty[] kPropertyArr = RecurringDepositDetailsViewController.X;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj3 = it12.f58324n;
                if (obj3 instanceof tch.b0) {
                    return (tch.b0) obj3;
                }
                return null;
            case 6:
                um0 it13 = (um0) obj2;
                KProperty[] kPropertyArr2 = RecurringDepositDetailsViewController.X;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj4 = it13.d;
                if ((obj4 instanceof tch.c0 ? (tch.c0) obj4 : null) != null) {
                    return tch.x.f269850a;
                }
                return null;
            case 7:
                um0 it14 = (um0) obj2;
                KProperty[] kPropertyArr3 = RecurringDepositDetailsViewController.X;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj5 = it14.d;
                tch.c0 c0Var = obj5 instanceof tch.c0 ? (tch.c0) obj5 : null;
                if (c0Var != null) {
                    return c0Var.f269817a;
                }
                return null;
            case 8:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (PortfolioRecurringOrder) zhm.d0.d0(it15);
            case 9:
                ucj.b it16 = (ucj.b) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Intrinsics.checkNotNullParameter(it16, "<this>");
                xi0.a aVar = xi0.b.Companion;
                String strA = it16.getCurrency();
                aVar.getClass();
                xi0.b bVarA = xi0.a.a(strA);
                Instant instant = Instant.parse(it16.getUpdatedAt());
                Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
                List<ucj.a> listB = it16.getPriceTargets();
                ArrayList arrayList = new ArrayList(zhm.w.t(listB, 10));
                for (ucj.a aVar2 : listB) {
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    jo3.a aVarD = aVar2.getHigh();
                    dj0.d dVarO = aVarD != null ? mo3.a.o(aVarD) : null;
                    dj0.d dVarO2 = mo3.a.o(aVar2.getAverage());
                    jo3.a aVarE = aVar2.getLow();
                    dj0.d dVarO3 = aVarE != null ? mo3.a.o(aVarE) : null;
                    LocalDate localDate = LocalDate.parse(aVar2.getDate());
                    Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                    arrayList.add(new ncj.a(dVarO, dVarO2, dVarO3, localDate, aVar2.getCommentary()));
                }
                return new ncj.b(bVarA, instant, arrayList);
            case 10:
                tdc.m update = (tdc.m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return tdc.m.a(update, tdc.a.f269948a, null, false, null, null, 30);
            case 11:
                tdc.m it17 = (tdc.m) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.b();
            case 12:
                tdc.m it18 = (tdc.m) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return t1.t(it18.f269959b, new Data(it18.b(), null, false, 6, null));
            case 13:
                tdc.m it19 = (tdc.m) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f269958a;
            case 14:
                Function0 it20 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                List listC = zhm.u.c(CounterTextDelegate.Model.Companion.b(CounterTextDelegate.Model.INSTANCE, "REV_POINTS_POCKET_POINTS_EARNED_COUNTER_ITEM_ID", CounterTextDelegate.d.b.C0401b.f52175a, 0, 0, 0, 0, SyslogConstants.LOG_CLOCK));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 15:
                return h30.l.q("it", (od0.i) obj2);
            case 16:
                od0.i it21 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.c();
            case 17:
                lf8.c flags = (lf8.c) obj2;
                Intrinsics.checkNotNullParameter(flags, "flags");
                return Boolean.valueOf(flags.f194666a);
            case 18:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List<of8.b> list2 = list;
                int iB = q0.b(zhm.w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (of8.b bVar : list2) {
                    linkedHashMap.put(bVar.f224748a, bVar);
                }
                return linkedHashMap;
            case 19:
                do3.n it22 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f116408a;
            case 20:
                List walletProfiles = (List) obj2;
                Intrinsics.checkNotNullParameter(walletProfiles, "walletProfiles");
                List list3 = walletProfiles;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it23 = list3.iterator();
                while (it23.hasNext()) {
                    arrayList2.add(new hc(((psg.a) it23.next()).f239484a, null));
                }
                return (q6[]) arrayList2.toArray(new q6[0]);
            case 21:
                Map juniorsVirtualProduct = (Map) obj2;
                Intrinsics.checkNotNullParameter(juniorsVirtualProduct, "juniorsVirtualProduct");
                return Boolean.valueOf(juniorsVirtualProduct.containsValue(Boolean.TRUE));
            case 22:
                Map juniorProducts = (Map) obj2;
                Intrinsics.checkNotNullParameter(juniorProducts, "juniorProducts");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(juniorProducts.size()));
                for (Map.Entry entry : juniorProducts.entrySet()) {
                    Object key = entry.getKey();
                    pf8.q qVar = ((of8.b) entry.getValue()).i;
                    of8.a aVar3 = qVar != null ? qVar.f235524a : null;
                    linkedHashMap2.put(key, Boolean.valueOf((aVar3 == null ? -1 : te8.b0.f270055a[aVar3.ordinal()]) == 1));
                }
                return linkedHashMap2;
            case 23:
                of8.b juniorsVirtualProduct2 = (of8.b) obj2;
                Intrinsics.checkNotNullParameter(juniorsVirtualProduct2, "juniorsVirtualProduct");
                pf8.q qVar2 = juniorsVirtualProduct2.i;
                of8.a aVar4 = qVar2 != null ? qVar2.f235524a : null;
                return Boolean.valueOf((aVar4 != null ? te8.b0.f270055a[aVar4.ordinal()] : -1) == 1);
            case 24:
                Pair it24 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return ((qf1.l) it24.f186385a).name();
            case 25:
                mm0.o it25 = (mm0.o) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                if (!(it25 instanceof mm0.n) && !(it25 instanceof mm0.p)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                rlm.f Json = (rlm.f) obj2;
                Lazy lazy = tf5.c.f270226a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                Json.f255100b = false;
                return Unit.f186387a;
            case 27:
                xfb.o availability = (xfb.o) obj2;
                Intrinsics.checkNotNullParameter(availability, "availability");
                xfb.n nVar = availability.d;
                return nVar != null ? tfb.g.d(nVar.f305222b) : tfb.g.b();
            case 28:
                mgb.n salaryHubResponse = (mgb.n) obj2;
                Intrinsics.checkNotNullParameter(salaryHubResponse, "salaryHubResponse");
                if (salaryHubResponse instanceof mgb.l) {
                    mgb.f fVar = ((mgb.l) salaryHubResponse).f205252a.d;
                    return fVar != null ? tfb.g.d(fVar.f205237b) : tfb.g.b();
                }
                if (salaryHubResponse instanceof mgb.m) {
                    return tfb.g.b();
                }
                throw new NoWhenBranchMatchedException();
            default:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return Boolean.valueOf(v04.b.i(user.f116422w.f116401a));
        }
    }

    public /* synthetic */ a0(Object obj2, int i) {
        this.f269776a = i;
    }
}
