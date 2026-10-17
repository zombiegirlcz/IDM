package nfj;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.address.common.impl.flow.screen.select.SelectAddressScreen;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_history.CreditCardLimitHistoryController;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_bank_selection.PixBankSelectionScreen;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.institutions.IndiaNetBankingInstitutionsScreen;
import com.revolut.feature.junior_tasks.api.navigation.JuniorTasksListDestination;
import com.revolut.feature.pay_later.impl.ui.activation.ActivationController;
import com.revolut.feature.pay_later.impl.ui.repaymentslist.PayLaterRepaymentsListScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreen;
import com.revolut.feature.retail.salary_account.impl.salary_hub.reward_bottom_sheet.SalaryRewardBottomSheetController;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms.TermsViewerController;
import com.revolut.feature.sca_prompt.impl.trusted_entities.TrustedEntitiesScreen;
import com.revolut.feature.transactions.impl.ui.pending.screen.PendingTransactionScreen;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlow;
import com.revolut.feature.travel.miles.impl.ui.screen.transaction.TravelMilesTransactionsListScreen;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.list.TrustedMerchantsListController;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.portfolio_updates.PortfolioUpdatesScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.result.ScreenerResultScreen;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class j2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j2((s2) this.v, continuation, 0);
            case 1:
                return new j2((SalaryRewardBottomSheetController) this.v, continuation, 1);
            case 2:
                return new j2((TravelMilesFlightSearchDashboardPagerFlow) this.v, continuation, 2);
            case 3:
                return new j2((PortfolioUpdatesScreen) this.v, continuation, 3);
            case 4:
                return new j2((nhc.i) this.v, continuation, 4);
            case 5:
                return new j2((SelectAddressScreen) this.v, continuation, 5);
            case 6:
                return new j2((TravelMilesTransactionsListScreen) this.v, continuation, 6);
            case 7:
                return new j2((tji.f) this.v, continuation, 7);
            case 8:
                return new j2((ActivationController) this.v, continuation, 8);
            case 9:
                return new j2((nje.n) this.v, continuation, 9);
            case 10:
                return new j2((TrustedMerchantsListController) this.v, continuation, 10);
            case 11:
                return new j2((PixBankSelectionScreen) this.v, continuation, 11);
            case 12:
                return new j2((nk6.j) this.v, continuation, 12);
            case 13:
                return new j2((PayLaterRepaymentsListScreen) this.v, continuation, 13);
            case 14:
                return new j2((IndiaNetBankingInstitutionsScreen) this.v, continuation, 14);
            case 15:
                return new j2((CountrySelectionScreen) this.v, continuation, 15);
            case 16:
                return new j2((PendingTransactionScreen) this.v, continuation, 16);
            case 17:
                return new j2((no.z) this.v, continuation, 17);
            case 18:
                return new j2((no.r1) this.v, continuation, 18);
            case 19:
                return new j2((com.google.firebase.messaging.u) this.v, continuation, 19);
            case 20:
                return new j2((nol.c) this.v, continuation, 20);
            case 21:
                return new j2((com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b) this.v, continuation, 21);
            case 22:
                return new j2((ScreenerResultScreen) this.v, continuation, 22);
            case 23:
                return new j2((Ref$BooleanRef) this.v, continuation, 23);
            case 24:
                return new j2((TermsViewerController) this.v, continuation, 24);
            case 25:
                return new j2((GroupTransactionsScreen) this.v, continuation, 25);
            case 26:
                return new j2((TrustedEntitiesScreen) this.v, continuation, 26);
            case 27:
                return new j2((CreditCardLimitHistoryController) this.v, continuation, 27);
            case 28:
                return new j2((ntf.r) this.v, continuation, 28);
            default:
                return new j2((nu5.c) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j2) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((j2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((j2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((j2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((j2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((j2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((j2) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((j2) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((j2) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((j2) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((j2) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v120, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v130, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v145, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = 2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s2 s2Var = (s2) this.v;
                d2 d2Var = s2.Companion;
                return s2Var.h();
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ngb.d) ((SalaryRewardBottomSheetController) this.v).U.getValue()).C2(ngb.b.f215130a);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a) ((TravelMilesFlightSearchDashboardPagerFlow) this.v).e3()).B2();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ngh.h) ((PortfolioUpdatesScreen) this.v).L.getValue()).B2();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                chc.b0 b0Var = (chc.b0) j6.a.k(chc.b0.class, ((nhc.i) this.v).f215413b, "KEY_RENT_AND_BILLS_LINKED_PAYMENTS");
                if (b0Var != null) {
                    return dhc.c.d(b0Var);
                }
                return null;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SelectAddressScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((nig.g) ((TravelMilesTransactionsListScreen) this.v).e3()).B2();
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tji.f) this.v).a();
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nj9.n nVar = (nj9.n) ((ActivationController) this.v).d();
                zh9.m1 m1Var = ((nj9.h) ((vkm.j2) nVar.f216430s.f22677a).getValue()).f216420c;
                if (m1Var == null) {
                    throw new IllegalArgumentException("if tab is clicked, selectedOption content can't be null");
                }
                zh9.t1 t1VarB = m1Var.b();
                int i2 = t1VarB == null ? -1 : nj9.k.f216423a[t1VarB.ordinal()];
                if (i2 == -1) {
                    nVar.l2(new cam.q(m1Var.a(), 8, nVar, ), new nb6.p(1, nVar.f216427p, di9.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 10));
                    return Unit.f186387a;
                }
                if (i2 == 1) {
                    Intrinsics.checkNotNullParameter("An operation is not implemented: migration flow (application)", "message");
                    throw new NotImplementedError("An operation is not implemented: migration flow (application)");
                }
                if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Button shouldn't be clickable in state:" + m1Var.b()).toString());
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nje.n nVar2 = (nje.n) this.v;
                List list = (List) ((nje.f) nVar2.t2()).f216456a.getContent();
                koi.j jVar = list != null ? (koi.j) zhm.d0.d0(list) : null;
                ActionWidgetDelegate.Model model = jVar instanceof ActionWidgetDelegate.Model ? (ActionWidgetDelegate.Model) jVar : null;
                Object obj3 = model != null ? model.f51596l : null;
                if ((obj3 instanceof fkd.r0 ? (fkd.r0) obj3 : 0) == 0) {
                    nVar2.f216473x.f246831b.k(Unit.f186387a);
                } else {
                    nVar2.x2(new ble.a0(list, model, i));
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TrustedMerchantsListController) this.v).c3(njg.c.f216509a);
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((nk6.j) ((PixBankSelectionScreen) this.v).d3()).B2();
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((w21.o) ((xg6.j) ((nk6.j) this.v).o).f305582a).i.g(Unit.f186387a, true);
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PayLaterRepaymentsListScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((nm6.j) ((IndiaNetBankingInstitutionsScreen) this.v).N.getValue()).B2();
                return Unit.f186387a;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.country_selection.b bVar = (com.revolut.sso.impl.ui.country_selection.b) ((CountrySelectionScreen) this.v).d();
                cli.y yVar = bVar.f106507r;
                if (!((nml.g) ((vkm.j2) yVar.f22677a).getValue()).d.getLoading()) {
                    bVar.C2(new nml.h(((nml.g) ((vkm.j2) yVar.f22677a).getValue()).f217378a));
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PendingTransactionScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fo.f fVar = ((no.z) this.v).f217887j;
                synchronized (fVar) {
                    try {
                        fVar.d = fVar.d || !fVar.e.isEmpty();
                        ao.h hVarC = fVar.c();
                        LinkedHashSet linkedHashSet = fVar.e;
                        ArrayList arrayList = new ArrayList(zhm.w.t(linkedHashSet, 10));
                        Iterator it8 = linkedHashSet.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(kli.a.C((fo.i) it8.next()));
                        }
                        hVarC.getClass();
                        DBUtil.performBlocking((RoomDatabase) hVarC.f7847b, false, true, new amh.j(hVarC, arrayList, 11));
                        fVar.e.clear();
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                no.r1 r1Var = (no.r1) this.v;
                Object objC = r1Var.f217837b.c();
                return new Pair(objC != null ? r1Var.f217838c.e(objC).f281496a : null, ((uo.o) r1Var.d).e(objC, null));
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.google.firebase.messaging.u uVar = (com.google.firebase.messaging.u) this.v;
                Object objC2 = ((uo.b) uVar.f49546b).c();
                return new Pair(objC2, objC2 != null ? ((uo.q0) uVar.f49547c).e(objC2) : null);
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((nol.c) this.v).invoke();
                return Unit.f186387a;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b bVar2 = (com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b) this.v;
                if (bVar2.o.f218156c) {
                    bVar2.C1(new JuniorTasksListDestination(bVar2.f77371t, (ZoomTransitionAnimation.Widgets) null, 2));
                } else {
                    oki.h.D2(bVar2.v);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth_discovery.impl.screener.screens.result.a) ((nqh.c) ((ScreenerResultScreen) this.v).T.getValue())).I2();
                return Unit.f186387a;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((Ref$BooleanRef) this.v).f186407a = true;
                return Unit.f186387a;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((nrc.e) ((TermsViewerController) this.v).N.getValue()).B2();
                return Unit.f186387a;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((GroupTransactionsScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.sca_prompt.impl.trusted_entities.a) ((TrustedEntitiesScreen) this.v).R2()).B2();
                return Unit.f186387a;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((nt4.g) ((CreditCardLimitHistoryController) this.v).R.getValue()).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ntf.r) this.v).B2();
                return Unit.f186387a;
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((nu5.c) this.v).f219217a.G(Boolean.TRUE, "AUTO_EARN_SECTION_DISMISSED_KEY", wim.z.d(kotlin.jvm.internal.o0.b(Boolean.TYPE)));
                return Unit.f186387a;
        }
    }
}
