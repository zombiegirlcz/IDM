package g31;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementIncidentItem;
import com.revolut.core.model.FileExtension;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.feature.cash_topup.impl.ui.flow.select.SelectCashTopUpFlowContract$Step;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$State;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsCollectionAssetsTypeFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.joint.api.models.JointDeeplink;
import com.revolut.feature.joint.impl.account.model.JointTopUpMethodsAction;
import com.revolut.feature.joint.impl.account.model.JointTopUpMoneyAction;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$Step;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.teen.accounts.api.model.TeenAccountPayload;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flow.init_top_up.InitTopUpFlowContract$Step;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveControllerApi$Result;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$Step;
import dcl.g0;
import dcl.s0;
import dej.o3;
import ft3.d1;
import g48.b0;
import g48.r0;
import g48.z;
import gv9.j;
import h2c.o;
import hi9.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l5i.q;
import okhttp3.ResponseBody;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import pcd.s;
import rnf.m;
import rnf.u;
import tof.a3;
import w4l.k;
import yhm.r;
import yki.l;
import z0h.i0;
import z0h.t1;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f140173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f140174c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(hha.d dVar, hha.i iVar, String str) {
        this.f140172a = 18;
        this.f140173b = dVar;
        this.d = iVar;
        this.f140174c = str;
    }

    private final Object a(Object obj2) {
        hob.d dVar = (hob.d) this.f140173b;
        s sVar = (s) this.f140174c;
        Long l2 = (Long) this.d;
        Boolean moveMoneyEligible = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(moveMoneyEligible, "moveMoneyEligible");
        if (moveMoneyEligible.booleanValue()) {
            dVar.getClass();
            return u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.AddNewScheduledPayment(hob.d.i(sVar), l2), (Set) null, 6), null));
        }
        return new FeatureCommand(new VaultsKompotFeatureConfig.RecurringTransfer(new VaultsKompotFeatureConfig.RecurringTransfer.Config(20, l2, sVar.f234881a, sVar.getCurrency(), sVar.e())));
    }

    private final Object b(Object obj2) {
        a3 a3Var = (a3) this.f140173b;
        m mVar = (m) this.f140174c;
        hof.d dVar = (hof.d) this.d;
        r rVar = (r) obj2;
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        Data data = (Data) rVar.f314201a;
        od0.i iVar = (od0.i) rVar.f314202b;
        boolean zBooleanValue = ((Boolean) rVar.f314203c).booleanValue();
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        u uVar = mVar.f255666a;
        uVar.getClass();
        thf.a aVarM = ((bnf.r) dVar.f154282b).m(a3Var, false);
        uVar.getClass();
        return new hof.a(a3Var, aVarM, zBooleanValue, null, (ChargeBreakdown) data.getContent(), (qv0.i) iVar.f224257a);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        Object next;
        qzi.g gVar;
        Map map;
        qzi.e eVar;
        String str;
        Style style;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClauseI;
        iv9.m mVar;
        KompotDestination kompotDestination;
        List listC;
        Object obj4;
        int i = this.f140172a;
        int i2 = 4;
        int i3 = 3;
        int i5 = 26;
        int i6 = -1;
        int i21 = 2;
        int i22 = 1;
        Object obj5 = this.d;
        Object obj6 = this.f140174c;
        Object obj7 = this.f140173b;
        switch (i) {
            case 0:
                h hVar = (h) obj7;
                List originalCategories = (List) obj2;
                Intrinsics.checkNotNullParameter(originalCategories, "originalCategories");
                hVar.f140180b.delete((String) obj6);
                hVar.d((String) obj5);
                return originalCategories;
            case 1:
                z zVar = (z) obj7;
                n38.a aVar = (n38.a) obj6;
                JointDeeplink.TopUpMethods topUpMethods = (JointDeeplink.TopUpMethods) obj5;
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Iterator it8 = pockets.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next2 = it8.next();
                        String str2 = ((io3.d) next2).f163147c;
                        xi0.b bVar = topUpMethods.f76485a;
                        if (Intrinsics.f(str2, bVar != null ? bVar.f306286a : null)) {
                            obj3 = next2;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                io3.d dVar = (io3.d) obj3;
                if (dVar == null) {
                    dVar = (io3.d) d0.b0(pockets);
                }
                AccountId.Joint jointC = l38.a.c(aVar);
                xi0.a aVar2 = xi0.b.Companion;
                String str3 = dVar.f163147c;
                aVar2.getClass();
                return zVar.c(jointC, new TabAccountsInitialPayload.Action(new JointTopUpMethodsAction(xi0.a.a(str3))));
            case 2:
                JointDeeplink.TopUp topUp = (JointDeeplink.TopUp) obj7;
                z zVar2 = (z) obj6;
                n38.a aVar3 = (n38.a) obj5;
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                Iterator it9 = pockets2.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        String str4 = ((io3.d) next).f163147c;
                        xi0.b bVar2 = topUp.f76483a;
                        if (Intrinsics.f(str4, bVar2 != null ? bVar2.f306286a : null)) {
                        }
                    } else {
                        next = null;
                    }
                }
                io3.d dVar2 = (io3.d) next;
                if (dVar2 == null) {
                    dVar2 = (io3.d) d0.b0(pockets2);
                }
                if (topUp.f76484b) {
                    AccountId.Joint jointC2 = l38.a.c(aVar3);
                    xi0.a aVar4 = xi0.b.Companion;
                    String str5 = dVar2.f163147c;
                    aVar4.getClass();
                    return zVar2.c(jointC2, new TabAccountsInitialPayload.Action(new JointTopUpMoneyAction(xi0.a.a(str5))));
                }
                TopUpConfig.Companion companion = TopUpConfig.INSTANCE;
                xi0.a aVar5 = xi0.b.Companion;
                String str6 = dVar2.f163147c;
                aVar5.getClass();
                ufm.b bVarM = efm.d0.m(u0.f(new InitTopUpDestination(TopUpConfig.Companion.c(companion, xi0.a.a(str6), null, new TopUpTarget.Joint(l38.a.c(aVar3)), null, 26))));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 3:
                List invitations = (List) obj2;
                Intrinsics.checkNotNullParameter(invitations, "invitations");
                return rd0.e.b(zi0.c.J(((r0) obj7).f140407g.e(new b0(invitations, (String) obj6), (k) obj5)));
            case 4:
                SelectCashTopUpFlowContract$Step selectCashTopUpFlowContract$Step = (SelectCashTopUpFlowContract$Step) obj7;
                com.revolut.feature.cash_topup.impl.ui.flow.select.a aVar6 = (com.revolut.feature.cash_topup.impl.ui.flow.select.a) obj6;
                l lVar = (l) obj5;
                com.revolut.kompot.common.flow.permissions.a result = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof sii.c) && !(result instanceof sii.d)) {
                    if (!Intrinsics.f(result, a.C0596a.f98352a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((SelectCashTopUpFlowContract$Step.LocationPermissions) selectCashTopUpFlowContract$Step).f65664a) {
                        oki.h.t2(aVar6, lVar, SelectCashTopUpFlowContract$Step.Map.f65665a, false, null, false, 12);
                    } else {
                        aVar6.C2(new cb3.c(null));
                        oki.h.D2(lVar);
                    }
                }
                return Unit.f186387a;
            case 5:
                String str7 = (String) obj6;
                gd0.f fVar = (gd0.f) obj7;
                kd0.a aVar7 = (kd0.a) obj5;
                List incidents = (List) obj2;
                Intrinsics.checkNotNullParameter(incidents, "incidents");
                Iterator it10 = incidents.iterator();
                int i32 = 0;
                while (true) {
                    if (it10.hasNext()) {
                        if (Intrinsics.f(((ChaosManagementIncidentItem) it10.next()).f51343a, str7)) {
                            i6 = i32;
                        } else {
                            i32++;
                        }
                    }
                }
                ArrayList arrayListF1 = d0.f1(incidents);
                arrayListF1.remove(i6);
                return new pfm.h(new gd0.a(fVar, aVar7, arrayListF1, 0), 2);
            case 6:
                gi9.c cVar = (gi9.c) obj7;
                ArrayList plansWithRepayments = (ArrayList) obj6;
                n planUpdate = (n) obj5;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(plansWithRepayments, "plansWithRepayments");
                Intrinsics.checkNotNullParameter(planUpdate, "planUpdate");
                ArrayList arrayList = new ArrayList(w.t(plansWithRepayments, 10));
                Iterator it11 = plansWithRepayments.iterator();
                while (it11.hasNext()) {
                    arrayList.add(((ki9.a) it11.next()).f184187a);
                }
                ArrayList arrayList2 = new ArrayList(w.t(plansWithRepayments, 10));
                Iterator it12 = plansWithRepayments.iterator();
                while (it12.hasNext()) {
                    arrayList2.add(((ki9.a) it12.next()).f184189c);
                }
                ArrayList arrayList3 = new ArrayList(w.t(plansWithRepayments, 10));
                Iterator it13 = plansWithRepayments.iterator();
                while (it13.hasNext()) {
                    arrayList3.add(((ki9.a) it13.next()).f184188b);
                }
                ArrayList arrayListU = w.u(arrayList3);
                RoomDatabase roomDatabase = cVar.f144100a;
                DBUtil.performBlocking(roomDatabase, false, true, new gi9.a(cVar, arrayList, i3));
                DBUtil.performBlocking(roomDatabase, false, true, new gi9.a(cVar, arrayList, 0));
                DBUtil.performBlocking(roomDatabase, false, true, new gi9.a(cVar, arrayList2, 1));
                DBUtil.performBlocking(roomDatabase, false, true, new gi9.a(cVar, arrayListU, i2));
                DBUtil.performBlocking(roomDatabase, false, true, new gbi.c(cVar, planUpdate, 19));
                return Unit.f186387a;
            case 7:
                od0.i outlet = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(outlet, "outlet");
                return ((gic.a) ((twg.c) obj7).f275019c).a((ggc.l) obj6, outlet, (kic.h) obj5);
            case 8:
                final gpk.c cVar2 = (gpk.c) obj7;
                final ArrayList validAlerts = (ArrayList) obj6;
                final ArrayList cancelledAlerts = (ArrayList) obj5;
                Intrinsics.checkNotNullParameter(validAlerts, "validAlerts");
                Intrinsics.checkNotNullParameter(cancelledAlerts, "cancelledAlerts");
                RoomDatabase roomDatabase2 = (RoomDatabase) cVar2.f145463a;
                final int i33 = 1;
                final int i43 = 0;
                DBUtil.performBlocking(roomDatabase2, false, true, new Function1() { // from class: gpk.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj8;
                        switch (i33) {
                            case 0:
                                ((g0) cVar2.f145465c).handleMultiple(sQLiteConnection, validAlerts);
                                break;
                            default:
                                ((s0) cVar2.f145464b).insert(sQLiteConnection, (Iterable) validAlerts);
                                break;
                        }
                        return null;
                    }
                });
                DBUtil.performBlocking(roomDatabase2, false, true, new Function1() { // from class: gpk.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj8;
                        switch (i43) {
                            case 0:
                                ((g0) cVar2.f145465c).handleMultiple(sQLiteConnection, cancelledAlerts);
                                break;
                            default:
                                ((s0) cVar2.f145464b).insert(sQLiteConnection, (Iterable) cancelledAlerts);
                                break;
                        }
                        return null;
                    }
                });
                return Unit.f186387a;
            case 9:
                qzi.a budget = (qzi.a) obj6;
                LocalDate now = (LocalDate) obj5;
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Map upcomingSpendingMap = (Map) rVar.f314201a;
                grj.e eVar2 = (grj.e) rVar.f314202b;
                uzi.b budgetingCycle = (uzi.b) rVar.f314203c;
                grj.a aVar8 = ((grj.f) obj7).e;
                LinkedHashMap regularSpendingMap = eVar2.f146028a;
                LinkedHashMap committedSpendingMap = eVar2.f146029b;
                ((grj.b) aVar8).getClass();
                Intrinsics.checkNotNullParameter(budget, "budget");
                Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
                Intrinsics.checkNotNullParameter(now, "now");
                Intrinsics.checkNotNullParameter(upcomingSpendingMap, "upcomingSpendingMap");
                Intrinsics.checkNotNullParameter(regularSpendingMap, "regularSpendingMap");
                Intrinsics.checkNotNullParameter(committedSpendingMap, "committedSpendingMap");
                dj0.d dVar3 = budget.f250648c;
                xi0.b bVar3 = dVar3.f115083b;
                long j2 = dVar3.f115082a;
                long jU0 = d0.U0(w.u(upcomingSpendingMap.values()));
                long jU02 = d0.U0(regularSpendingMap.values());
                long jU03 = d0.U0(committedSpendingMap.values());
                long j3 = (j2 - jU0) - jU03;
                long j5 = j3 - jU02;
                long j16 = jU02 + jU03;
                long j22 = budget.f250648c.f115082a - jU0;
                LocalDate localDatePlusDays = budget.e;
                LocalDate localDate = budget.f;
                long days = (long) ((((long) Days.daysBetween(localDatePlusDays, now).getDays()) + 1) * (j22 / (((long) Days.daysBetween(localDatePlusDays, localDate).getDays()) + 1)) * 1.05f);
                qzi.g gVar2 = (j22 <= j16 || j16 > days) ? (days > j16 || j16 > j22) ? qzi.g.OVERSPENT : qzi.g.NOT_ON_TRACK : qzi.g.ON_TRACK;
                ArrayList arrayList4 = new ArrayList();
                int i59 = 0;
                while (true) {
                    List list = (List) upcomingSpendingMap.get(localDatePlusDays);
                    long jU04 = list != null ? d0.U0(list) : 0L;
                    Long l2 = (Long) committedSpendingMap.get(localDatePlusDays);
                    long jLongValue = l2 != null ? l2.longValue() : 0L;
                    Long l3 = (Long) regularSpendingMap.get(localDatePlusDays);
                    long jLongValue2 = jU04 + jLongValue + (l3 != null ? l3.longValue() : 0L);
                    qzi.f fVar2 = (qzi.f) d0.e0(i59 - 1, arrayList4);
                    if (fVar2 != null) {
                        gVar = gVar2;
                        map = upcomingSpendingMap;
                        jLongValue2 = fVar2.f250653b.f115082a + jLongValue2;
                    } else {
                        gVar = gVar2;
                        map = upcomingSpendingMap;
                    }
                    arrayList4.add(new qzi.f(localDatePlusDays, new dj0.d(jLongValue2, bVar3)));
                    i59++;
                    localDatePlusDays = localDatePlusDays.plusDays(1);
                    Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
                    if (localDatePlusDays.compareTo((ReadablePartial) localDate) > 0) {
                        int i66 = grj.c.f146024a[budgetingCycle.f284679a.ordinal()];
                        if (i66 == 1) {
                            eVar = qzi.e.WEEKLY;
                        } else {
                            if (i66 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eVar = qzi.e.MONTHLY;
                        }
                        return new qzi.h(budget, now, gVar, arrayList4, new dj0.d(j3, bVar3), new dj0.d(j5, bVar3), new dj0.d(j16, bVar3), new dj0.d(jU0, bVar3), w.u(map.values()).size(), eVar);
                    }
                    gVar2 = gVar;
                    upcomingSpendingMap = map;
                }
                break;
            case 10:
                qzi.a aVar9 = (qzi.a) obj6;
                AccountId accountId = (AccountId) obj5;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Set set = (Set) pair.f186385a;
                do3.n nVar = (do3.n) pair.f186386b;
                q qVar = ((grj.f) obj7).f146031b;
                he3.d dVar4 = he3.d.SPENDINGS;
                Interval interval = new Interval(aVar9.e.toDateTimeAtStartOfDay(), aVar9.f.toDateTimeAtStartOfDay().plusDays(1).minusMillis(1));
                CategorisationFilter.Scope.PocketsIdSet pocketsIdSet = new CategorisationFilter.Scope.PocketsIdSet(set);
                if (accountId instanceof AccountId.Joint) {
                    str = ((AccountId.Joint) accountId).f51412a;
                } else {
                    if (!Intrinsics.f(accountId, AccountId.Personal.f51414a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = nVar.f116408a;
                }
                CategorisationFilter categorisationFilter = new CategorisationFilter(dVar4, pocketsIdSet, interval, null, null, null, null, null, y0.b(str), null, 760);
                AnalyticsAccountsSelection.Companion companion2 = AnalyticsAccountsSelection.INSTANCE;
                SpendingAnalyticsAccount spendingAnalyticsAccountB = com.revolut.retail.feature.api.a.b(accountId);
                companion2.getClass();
                efm.r map2 = rd0.e.c(qVar.a(new ge3.c(categorisationFilter, AnalyticsAccountsSelection.Companion.a(spendingAnalyticsAccountB), (Priority.HIGH) null, 12)), kotlin.coroutines.g.f186406a).map(new gqk.b(new gqa.a(17), 6));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return m70.a.g(map2, null, new gp3.n(16), 1);
            case 11:
                xpi.g gVar3 = (xpi.g) obj7;
                gu8.f fVar3 = (gu8.f) obj6;
                my8.r rVar2 = (my8.r) obj5;
                wi0.b bVar4 = (wi0.b) obj2;
                Intrinsics.h(bVar4);
                String str8 = bVar4.f297794a;
                n8b.a aVar10 = fVar3.f146888b;
                int[] iArr = gu8.e.f146886a;
                switch (iArr[rVar2.ordinal()]) {
                    case 1:
                        style = null;
                        textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_right_to_remain_short_title_document_id, null, null, 14);
                        break;
                    case 2:
                    case 3:
                    case 4:
                        style = null;
                        textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_right_to_remain_short_title, null, null, 14);
                        break;
                    case 5:
                        style = null;
                        textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_my_number_title, null, null, 14);
                        break;
                    case 6:
                        style = null;
                        textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_tax_residency_title, null, null, 14);
                        break;
                    case 7:
                        style = null;
                        textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_proof_of_address_title, null, null, 14);
                        break;
                    case 8:
                        style = null;
                        textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_student_title, null, null, 14);
                        break;
                    case 9:
                        style = null;
                        textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_diplomat_id_title, null, null, 14);
                        break;
                    case 10:
                        style = null;
                        textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_diplomat_card_title, null, null, 14);
                        break;
                    case 11:
                        style = null;
                        textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_residence_title, zhm.u.c(new TextClause(((o8b.c) aVar10).b(str8), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                        break;
                    case 12:
                        textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_name_verification_title, null, null, 14);
                        style = null;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.kyc_select_document_title, zhm.u.c(textLocalisedClause), style, 12);
                xpi.c cVar3 = (xpi.c) gVar3;
                cVar3.n0(textLocalisedClause2);
                cVar3.p0(textLocalisedClause2);
                switch (iArr[rVar2.ordinal()]) {
                    case 1:
                    case 3:
                        textLocalisedClauseI = fVar3.i(bVar4);
                        break;
                    case 2:
                    case 4:
                        textLocalisedClauseI = fVar3.i(bVar4);
                        break;
                    case 5:
                        textLocalisedClauseI = new TextLocalisedClause(R$string.kyc_select_document_my_number_description_text, null, null, 14);
                        break;
                    case 6:
                        textLocalisedClauseI = new TextLocalisedClause(R$string.kyc_select_document_tax_residency_description_text, null, null, 14);
                        break;
                    case 7:
                        textLocalisedClauseI = new TextLocalisedClause(R$string.kyc_select_document_proof_of_address_description_text, null, null, 14);
                        break;
                    case 8:
                        textLocalisedClauseI = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_student_description, null, null, 14);
                        break;
                    case 9:
                        textLocalisedClauseI = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_diplomat_id_description, null, null, 14);
                        break;
                    case 10:
                        textLocalisedClauseI = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_diplomat_card_description, null, null, 14);
                        break;
                    case 11:
                        textLocalisedClauseI = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_residence_description, zhm.u.c(new TextClause(((o8b.c) aVar10).b(str8), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                        break;
                    case 12:
                        textLocalisedClauseI = new TextLocalisedClause(R$string.kyc_select_document_name_verification_subtitle, null, null, 14);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                cVar3.Y(textLocalisedClauseI);
                cVar3.Z(true);
                cVar3.setVisible(true);
                if (rVar2 == my8.r.ADDRESS) {
                    cVar3.e0(((db9.d) fVar3.f146889c).c() ? Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow) : null);
                }
                return Unit.f186387a;
            case 12:
                j jVar = (j) obj7;
                iv9.a chatMessageEntity = (iv9.a) obj6;
                iv9.n sentMessageInfoEntity = (iv9.n) obj5;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(chatMessageEntity, "chatMessageEntity");
                Intrinsics.checkNotNullParameter(sentMessageInfoEntity, "sentMessageInfoEntity");
                chatMessageEntity.getClass();
                RoomDatabase roomDatabase3 = jVar.f147114a;
                DBUtil.performBlocking(roomDatabase3, false, true, new gv9.d(jVar, chatMessageEntity, i22));
                sentMessageInfoEntity.getClass();
                DBUtil.performBlocking(roomDatabase3, false, true, new gqd.s(jVar, sentMessageInfoEntity, 24));
                return Unit.f186387a;
            case 13:
                gv9.k kVar = (gv9.k) obj7;
                String str9 = (String) obj6;
                String str10 = (String) obj5;
                kVar.getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_message_reactions WHERE relatedEntityId = ? AND relatedEntityType = ?");
                try {
                    if (str9 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str9);
                    }
                    if (str10 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str10);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentMessageId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relatedEntityId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relatedEntityType");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatId");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isGroup");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reactions");
                    if (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0;
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        kVar.f147119c.getClass();
                        mVar = new iv9.m(text, text2, fv9.a.a(text5), text3, text4, z);
                    } else {
                        mVar = null;
                    }
                    sQLiteStatementPrepare.close();
                    return mVar;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 14:
                com.revolut.feature.topup_screen.impl.flow.init_top_up.a aVar11 = (com.revolut.feature.topup_screen.impl.flow.init_top_up.a) obj7;
                yki.b bVar5 = (yki.b) obj6;
                InitTopUpFlowContract$Step initTopUpFlowContract$Step = (InitTopUpFlowContract$Step) obj5;
                dii.g result2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof dii.e) {
                    oki.h.D2(bVar5);
                    aVar11.C1(u0.b(((InitTopUpFlowContract$Step.UnsupportedCurrencyDialog) initTopUpFlowContract$Step).f90626c));
                } else {
                    oki.h.D2(bVar5);
                }
                return Unit.f186387a;
            case 15:
                h0a.e eVar3 = (h0a.e) obj7;
                MessageType.PlanReferral planReferral = (MessageType.PlanReferral) obj6;
                cu9.i iVar = (cu9.i) obj5;
                dii.g result3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (Intrinsics.f(result3, dii.f.f115069a)) {
                    String str11 = planReferral.f79546b;
                    MessageItem messageItem = iVar.f108925c;
                    eVar3.getClass();
                    eVar3.T2(new gsh.w(eVar3, str11, messageItem, null, 9), new yi5.b(27));
                } else {
                    int i74 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a aVar12 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a) obj7;
                yvh.b bVar6 = (yvh.b) obj6;
                h2c.l lVar2 = (h2c.l) obj5;
                AutoInvestMoveControllerApi$Result result4 = (AutoInvestMoveControllerApi$Result) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (!(result4 instanceof AutoInvestMoveControllerApi$Result.Cancel)) {
                    if (!(result4 instanceof AutoInvestMoveControllerApi$Result.Move)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar12.l2(new dp4.y0(aVar12, bVar6, lVar2.a(), (Continuation) null, 4), new o(aVar12, i22));
                }
                return Unit.f186387a;
            case 17:
                return h2j.i.e((h2j.i) obj2, null, (xi0.b) obj7, (j1j.d) obj6, (xi0.b) obj5, null, null, null, null, null, null, null, 8161);
            case 18:
                CreditApplicationFlowContract$State update = (CreditApplicationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return CreditApplicationFlowContract$State.a(update, null, null, null, d1.c(update.d, gt3.c.PREMIUM, null, 5), new IntendedPricingPlan((hha.i) obj5, ((hha.d) obj7).f152287a, (String) obj6), null, 103);
            case 19:
                it3.d dVar5 = (it3.d) obj7;
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.application.d) obj6;
                h54.h hVar2 = (h54.h) obj5;
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof dii.e)) {
                    Continuation continuation = null;
                    if (output instanceof dii.f) {
                        dVar6.l2(new h54.n(dVar6, dVar5, continuation, i21), new yi5.b(i5));
                    } else {
                        int i92 = jli.h.f175850a;
                    }
                } else if (dVar5.f168328j.b()) {
                    dVar6.n2(new h54.n(dVar6, dVar5, null, 0), new whi.b(6));
                } else {
                    hVar2.invoke();
                }
                return Unit.f186387a;
            case 20:
                psg.a wallet = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                return new ha8.e((com.revolut.feature.junior_profile.api.models.a) obj7, ta6.a.A(wallet), (cfl.b) obj6, (u98.a) obj5);
            case 21:
                AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithTransferSubjectIdAndWealthAccountType withTransferSubjectIdAndWealthAccountType = (AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithTransferSubjectIdAndWealthAccountType) obj7;
                com.revolut.feature.wealth.impl.ui.flows.add_money.b bVar7 = (com.revolut.feature.wealth.impl.ui.flows.add_money.b) obj6;
                yki.b bVar8 = (yki.b) obj5;
                iah.f output2 = (iah.f) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (Intrinsics.f(output2, iah.e.f160027a) && (kompotDestination = withTransferSubjectIdAndWealthAccountType.f95180a) != null) {
                    bVar7.C1(kompotDestination);
                }
                oki.h.D2(bVar8);
                return Unit.f186387a;
            case 22:
                r10.a aVar13 = (r10.a) obj6;
                List installationStates = (List) obj2;
                Intrinsics.checkNotNullParameter(installationStates, "installationStates");
                Comparator comparatorThenComparing = new bm8.a(aVar13, ((dm0.d) aVar13.f250811a).b(), installationStates).thenComparing(new fad.i((o3) obj5, 18));
                Intrinsics.checkNotNullExpressionValue(comparatorThenComparing, "thenComparing(...)");
                return d0.P0((List) obj7, comparatorThenComparing);
            case 23:
                FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) obj6;
                List list2 = (List) obj5;
                hhd.h hVar3 = (hhd.h) obj2;
                List<FavouritesAssetTypeKey> list3 = (List) obj7;
                ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
                for (FavouritesAssetTypeKey favouritesAssetTypeKey2 : list3) {
                    arrayList5.add(new WatchlistAddAssetFlowContract$Step.Loaded(favouritesAssetTypeKey2, favouritesAssetTypeKey2.f86866a));
                }
                return hhd.h.a(hVar3, arrayList5, favouritesAssetTypeKey != null ? favouritesAssetTypeKey.f86866a : null, null, list2, null, 20);
            case 24:
                InstrumentsTrendCollectionId instrumentsTrendCollectionId = (InstrumentsTrendCollectionId) obj7;
                hi7.b bVar9 = (hi7.b) obj6;
                Map map3 = (Map) obj5;
                t1 disclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.MostTraded.f74902a)) {
                    bVar9.getClass();
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it14 = map3.entrySet().iterator();
                    while (it14.hasNext()) {
                        InstrumentsTrendCollectionFilterValue instrumentsTrendCollectionFilterValue = (InstrumentsTrendCollectionFilterValue) ((Map.Entry) it14.next()).getValue();
                        InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue = instrumentsTrendCollectionFilterValue instanceof InstrumentsCollectionAssetsTypeFilterValue ? (InstrumentsCollectionAssetsTypeFilterValue) instrumentsTrendCollectionFilterValue : null;
                        if (instrumentsCollectionAssetsTypeFilterValue != null) {
                            arrayList6.add(instrumentsCollectionAssetsTypeFilterValue);
                        }
                    }
                    InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue2 = (InstrumentsCollectionAssetsTypeFilterValue) d0.d0(arrayList6);
                    int i96 = instrumentsCollectionAssetsTypeFilterValue2 == null ? -1 : hi7.a.f152528a[instrumentsCollectionAssetsTypeFilterValue2.ordinal()];
                    if (i96 == -1 || i96 == 1) {
                        listC = zhm.u.c(new z0h.i(disclaimersData.f318563a, disclaimersData.f318564b));
                    } else if (i96 == 2) {
                        listC = zhm.u.c(new z0h.f(disclaimersData.f318563a, disclaimersData.f318564b));
                    } else if (i96 == 3) {
                        listC = zhm.u.c(new z0h.i(disclaimersData.f318563a, disclaimersData.f318564b));
                    } else if (i96 == 4) {
                        listC = zhm.u.c(new z0h.e(disclaimersData.f318563a, disclaimersData.f318564b));
                    } else {
                        if (i96 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listC = zhm.u.c(new z0h.g(disclaimersData.f318563a, disclaimersData.f318564b));
                    }
                } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.RecommendedBuy.f74905a)) {
                    listC = zhm.u.c(new z0h.h(disclaimersData.f318563a, disclaimersData.f318564b));
                } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.DividendLeaders.f74895a)) {
                    listC = zhm.u.c(new z0h.i(disclaimersData.f318563a, disclaimersData.f318564b));
                } else if (instrumentsTrendCollectionId instanceof InstrumentsTrendCollectionId.Bonds) {
                    listC = zhm.u.c(new z0h.e(disclaimersData.f318563a, disclaimersData.f318564b));
                } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.IndexEtfs.f74900a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.TechnologyEtfs.f74906a)) {
                    listC = zhm.u.c(new z0h.g(disclaimersData.f318563a, disclaimersData.f318564b));
                } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.MostShortedCfds.f74901a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.CfdsPnlDrivers.f74894a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.PopularStarterCfds.f74903a)) {
                    listC = zhm.u.c(new z0h.f(disclaimersData.f318563a, disclaimersData.f318564b));
                } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtnsCryptoExposure.f74897a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.PreciousMetalsEtcs.f74904a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtcsCommodityExposure.f74896a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtpsLeveraged.f74898a)) {
                    listC = zhm.u.c(new i0(disclaimersData.f318563a, disclaimersData.f318564b));
                } else {
                    if (!Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.FreeStocks.f74899a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r6.b.D("free stocks are not used in this flow");
                    listC = f0.f322471a;
                }
                return new fi7.i(listC, disclaimersData.f318564b);
            case 25:
                ResponseBody responseBody = (ResponseBody) obj2;
                Intrinsics.checkNotNullParameter(responseBody, "responseBody");
                ufm.c cVar4 = new ufm.c(new a80.b((Object) responseBody.byteStream(), obj7, (String) obj6, (Serializable) ((FileExtension) obj5).getF51399a(), 3), i21);
                Intrinsics.checkNotNullExpressionValue(cVar4, "fromCallable(...)");
                return cVar4;
            case 26:
                ConsentChallenge.Qr qr10 = (ConsentChallenge.Qr) obj7;
                com.revolut.sso.impl.ui.consent.qr.b bVar10 = (com.revolut.sso.impl.ui.consent.qr.b) obj6;
                ConsentChallenge.Qr.Delegated.Selection.Identity identity = (ConsentChallenge.Qr.Delegated.Selection.Identity) obj5;
                aml.g result5 = (aml.g) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (result5 instanceof aml.d) {
                    com.revolut.sso.api.models.b bVar11 = qr10.getE().f105902c.f105903a;
                    int i99 = bVar11 == null ? -1 : hml.e.f153989a[bVar11.ordinal()];
                    String str12 = "LOADING_TAG_BUTTON_CONTINUE";
                    if (i99 != -1) {
                        boolean z3 = true;
                        if (i99 == 1) {
                            bVar10.l2(new ack.o(bVar10, str12, z3, qr10.getF105924a(), (Continuation) null, 6), new yi5.b(i5));
                        } else {
                            if (i99 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.t2(bVar10, bVar10.v, new QrConsentFlowContract$Step.UnexpectedLocationCheck(qr10, identity), true, null, false, 12);
                        }
                    } else {
                        bVar10.l2(new ack.o((Object) bVar10, (Object) str12, false, (Object) qr10.getF105924a(), (Continuation) null, 6), new yi5.b(i5));
                    }
                } else if (result5 instanceof aml.e) {
                    bVar10.l2(new gsh.w(bVar10, "LOADING_TAG_BUTTON_REJECT", qr10.getF105924a(), null, 26), new hml.c(bVar10, i22));
                } else {
                    if (!(result5 instanceof aml.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(bVar10.v);
                }
                return Unit.f186387a;
            case 27:
                return a(obj2);
            case 28:
                return b(obj2);
            default:
                hqe.o oVar = (hqe.o) obj7;
                ProductAccountId productAccountId = (ProductAccountId) obj6;
                TeenAccountPayload.Pocket pocket = (TeenAccountPayload.Pocket) obj5;
                r rVar3 = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar3, "<destruct>");
                Pair pair2 = (Pair) rVar3.f314201a;
                TeenProfile teenProfile = (TeenProfile) rVar3.f314202b;
                Set set2 = (Set) rVar3.f314203c;
                fo3.c cVar5 = (fo3.c) pair2.f186385a;
                Iterator it15 = ((List) pair2.f186386b).iterator();
                while (true) {
                    if (it15.hasNext()) {
                        Object next3 = it15.next();
                        io3.d dVar7 = (io3.d) next3;
                        if (Intrinsics.f(dVar7.f163145a, pocket.f90327c) && dVar7.e == io3.l.CURRENT) {
                            obj4 = next3;
                        }
                    } else {
                        obj4 = null;
                    }
                }
                io3.d dVar8 = (io3.d) obj4;
                if (dVar8 != null) {
                    return oVar.f154691c.a(cVar5, dVar8, oVar.a(teenProfile), teenProfile, set2.contains(dVar8.f163145a));
                }
                throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId.f89729a, " cannot be found in the Teen product"));
        }
    }

    public /* synthetic */ e(Object obj2, int i, Object obj3, Object obj4) {
        this.f140172a = i;
        this.f140173b = obj2;
        this.f140174c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ e(String str, gd0.f fVar, kd0.a aVar) {
        this.f140172a = 5;
        this.f140174c = str;
        this.f140173b = fVar;
        this.d = aVar;
    }
}
