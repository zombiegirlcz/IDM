package l3d;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.model.Data;
import com.revolut.feature.categorisation.api.model.AnalyticsAccountPocketSource;
import com.revolut.feature.credit.application.plugins.impl.ui.address.flow.CreditAddressFlowContract$State;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.data.model.Policy;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import le.u1;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import org.joda.time.DateTime;
import tof.i3;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f191883b;

    public /* synthetic */ a(int i, String str, Object obj2) {
        this.f191882a = i;
        this.f191883b = str;
    }

    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i3 i3Var;
        Object obj3;
        Object obj4;
        vm3.b bVar;
        Collection collection;
        int i = this.f191882a;
        Object bVar2 = null;
        String uniqueTransactionReference = this.f191883b;
        switch (i) {
            case 0:
                z3d.d watchlist = (z3d.d) obj2;
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                return Boolean.valueOf(Intrinsics.f(watchlist.f319250a, uniqueTransactionReference));
            case 1:
                return CreditAddressFlowContract$State.a((CreditAddressFlowContract$State) obj2, uniqueTransactionReference, null, null, 6);
            case 2:
                l68.e update = (l68.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return l68.e.a(update, uniqueTransactionReference, null, 27);
            case 3:
                l68.e update2 = (l68.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return l68.e.a(update2, null, uniqueTransactionReference, 23);
            case 4:
                l7f.c update3 = (l7f.c) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return l7f.c.a(update3, null, uniqueTransactionReference, 1);
            case 5:
                l97.i update4 = (l97.i) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return l97.i.n(update4, this.f191883b, null, null, null, null, null, 30);
            case 6:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM post_termination_plan WHERE planId = ? limit 1");
                try {
                    if (uniqueTransactionReference == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, uniqueTransactionReference);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "planId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amountDue");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "discountedAmount");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "leftToRepay");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repaymentDay");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remainingRepayments");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimumRepayment");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "maximumRepayment");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggestedRepayment");
                    ma5.a aVar = sQLiteStatementPrepare.step() ? new ma5.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow5)), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6)), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), sQLiteStatementPrepare.getLong(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow12))) : null;
                    sQLiteStatementPrepare.close();
                    return aVar;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 7:
                lb0.p update5 = (lb0.p) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return lb0.p.a(update5, null, uniqueTransactionReference, null, 5);
            case 8:
                lbc.m update6 = (lbc.m) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return lbc.m.a(update6, null, null, null, gc0.c.A(update6.d, uniqueTransactionReference), false, 55);
            case 9:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : pockets) {
                    if (Intrinsics.f(((io3.d) obj5).f163145a, uniqueTransactionReference)) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(new AnalyticsAccountPocketSource.PocketSource((io3.d) it8.next()));
                }
                return arrayList2;
            case 10:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186386b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list) {
                    if (Intrinsics.f(((io3.d) obj6).f163145a, uniqueTransactionReference)) {
                        arrayList3.add(obj6);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(new AnalyticsAccountPocketSource.PocketSource((io3.d) it9.next()));
                }
                return arrayList4;
            case 11:
                Data categoriesData = (Data) obj2;
                Intrinsics.checkNotNullParameter(categoriesData, "categoriesData");
                List list2 = (List) categoriesData.getContent();
                if (list2 != null) {
                    Iterator it10 = list2.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            Object next = it10.next();
                            if (Intrinsics.f(((i3) next).getId(), uniqueTransactionReference)) {
                                obj3 = next;
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    i3Var = (i3) obj3;
                } else {
                    i3Var = null;
                }
                return new Data(i3Var, categoriesData.getError(), categoriesData.getLoading());
            case 12:
                lee.g update7 = (lee.g) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                update7.getClass();
                Intrinsics.checkNotNullParameter(uniqueTransactionReference, "uniqueTransactionReference");
                return new lee.g(uniqueTransactionReference);
            case 13:
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a update8 = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a.a(update8, this.f191883b, null, null, null, null, null, null, null, false, 510);
            case 14:
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a update9 = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a.a(update9, null, this.f191883b, null, null, null, null, null, null, false, 509);
            case 15:
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a update10 = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a.a(update10, null, null, this.f191883b, null, null, null, null, null, false, 507);
            case 16:
                lig.g update11 = (lig.g) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return lig.g.a(update11, this.f191883b, null, null, null, 10);
            case 17:
                ljc.g update12 = (ljc.g) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return ljc.g.a(update12, null, null, null, null, this.f191883b, 31);
            case 18:
                ApplicationForm it11 = (ApplicationForm) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(Intrinsics.f(it11.f75166a, uniqueTransactionReference));
            case 19:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                Iterator it12 = items.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next2 = it12.next();
                        if (Intrinsics.f(((Policy) next2).f75286a, uniqueTransactionReference)) {
                            obj4 = next2;
                        }
                    } else {
                        obj4 = null;
                    }
                }
                return (Policy) obj4;
            case 20:
                return lm1.e.a((lm1.e) obj2, null, uniqueTransactionReference, 13);
            case 21:
                lm3.a update13 = (lm3.a) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return lm3.a.a(update13, null, null, null, null, this.f191883b, false, 95);
            case 22:
                lm3.a update14 = (lm3.a) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return lm3.a.a(update14, null, null, null, this.f191883b, null, false, LDSFile.EF_DG15_TAG);
            case 23:
                lm3.a update15 = (lm3.a) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                if (Intrinsics.f(uniqueTransactionReference, "ITEM_ID_TAB_PHONE")) {
                    bVar = vm3.b.PHONE;
                } else if (Intrinsics.f(uniqueTransactionReference, "ITEM_ID_TAB_EMAIL")) {
                    bVar = vm3.b.EMAIL;
                } else {
                    hx7.e.h(new IllegalStateException(p.a.p("Unrecognized tab id '", uniqueTransactionReference, "'")));
                    bVar = update15.f196865b;
                }
                return lm3.a.a(update15, bVar, null, null, null, null, false, ISO781611.SMT_TAG);
            case 24:
                lol.f updateState = (lol.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Intrinsics.checkNotNullParameter(uniqueTransactionReference, "secret");
                return lol.f.a(updateState, uniqueTransactionReference, false, false, 6);
            case 25:
                List<jp8.c> tasks = (List) obj2;
                Intrinsics.checkNotNullParameter(tasks, "tasks");
                Object obj7 = ip8.b.f167679a;
                Intrinsics.checkNotNullParameter(tasks, "<this>");
                ArrayList<dp8.b> arrayList5 = new ArrayList();
                for (jp8.c cVar : tasks) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    dp8.h hVar = (dp8.h) u1.v(cVar.getState(), ip8.b.f167679a);
                    if (hVar != null) {
                        String strG = cVar.getId();
                        String strH = cVar.getJuniorId();
                        String strB = cVar.getCoparentId();
                        String strI = cVar.getName();
                        dj0.d dVarO = mo3.a.o(cVar.getReward());
                        String strF = cVar.getIconUrl();
                        if (strF == null) {
                            strF = "";
                        }
                        String str = strF;
                        String strD = cVar.getDescription();
                        DateTime dateTime = new DateTime(cVar.getCreatedDate());
                        Long lA = cVar.getCompletedDate();
                        DateTime dateTime2 = lA != null ? new DateTime(lA.longValue()) : null;
                        Long lK = cVar.getStartDate();
                        DateTime dateTime3 = lK != null ? new DateTime(lK.longValue()) : null;
                        dp8.d dVar = (dp8.d) u1.v(cVar.getFrequency(), ip8.b.f167680b);
                        if (dVar == null) {
                            dVar = dp8.d.ONE_OFF;
                        }
                        bVar2 = new dp8.b(strG, strH, strB, strI, hVar, dVarO, str, strD, dateTime, dateTime2, dateTime3, dVar);
                    }
                    if (bVar2 != null) {
                        arrayList5.add(bVar2);
                    }
                    bVar2 = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (dp8.b bVar3 : arrayList5) {
                    String str2 = bVar3.f116832b;
                    Object objO = linkedHashMap.get(str2);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str2);
                    }
                    ((List) objO).add(bVar3);
                }
                LinkedHashMap linkedHashMapZ = r0.z(linkedHashMap);
                return (Intrinsics.f(uniqueTransactionReference, "ALL_TASKS") || linkedHashMapZ.containsKey(uniqueTransactionReference)) ? linkedHashMapZ : r0.q(linkedHashMapZ, new Pair(uniqueTransactionReference, zhm.f0.f322471a));
            case 26:
                Map map = (Map) obj2;
                Intrinsics.checkNotNullParameter(map, "map");
                List list3 = (List) map.get(uniqueTransactionReference);
                return list3 == null ? zhm.f0.f322471a : list3;
            case 27:
                lph.a update16 = (lph.a) obj2;
                Intrinsics.checkNotNullParameter(update16, "$this$update");
                return lph.a.a(update16, null, this.f191883b, null, false, 13);
            case 28:
                List recipientSettings = (List) obj2;
                Intrinsics.checkNotNullParameter(recipientSettings, "recipientSettings");
                Iterator it13 = recipientSettings.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next3 = it13.next();
                        if (Intrinsics.f(((RecipientPaymentsSettings) next3).f79672a, uniqueTransactionReference)) {
                            bVar2 = next3;
                        }
                    }
                }
                RecipientPaymentsSettings recipientPaymentsSettings = (RecipientPaymentsSettings) bVar2;
                if (recipientPaymentsSettings == null || (collection = recipientPaymentsSettings.f79674c) == null) {
                    collection = zhm.f0.f322471a;
                }
                RecipientPaymentsSettings.INSTANCE.getClass();
                RecipientPaymentsSettings.Setting settingA = RecipientPaymentsSettings.Companion.a();
                ArrayList arrayListF1 = zhm.d0.f1(collection);
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    arrayListF1.add(settingA);
                } else {
                    Iterator it14 = collection2.iterator();
                    while (it14.hasNext()) {
                        if (((RecipientPaymentsSettings.Setting) it14.next()).f79675a == settingA.f79675a) {
                        }
                    }
                    arrayListF1.add(settingA);
                }
                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayListF1, 10));
                Iterator it15 = arrayListF1.iterator();
                while (it15.hasNext()) {
                    arrayList6.add(jy9.b.a((RecipientPaymentsSettings.Setting) it15.next()));
                }
                return arrayList6;
            default:
                lu6.l update17 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update17, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter = update17.f200048b;
                String strL = m70.a.l(uniqueTransactionReference);
                String strZ6 = acquiringOrderFilter != null ? acquiringOrderFilter.Z6() : null;
                return lu6.l.a(update17, null, (strL == null && strZ6 == null) ? acquiringOrderFilter != null ? acquiringOrderFilter.j9(o0.f186429a.b(AcquiringOrderFilter.FractionalAmount.class)) : null : com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a.J2(acquiringOrderFilter, new AcquiringOrderFilter.FractionalAmount(strL, strZ6)), 5);
        }
    }

    public /* synthetic */ a(String str, int i) {
        this.f191882a = i;
        this.f191883b = str;
    }
}
