package akl;

import androidx.room.util.DBUtil;
import au6.c3;
import au6.m2;
import au6.m3;
import au6.r3;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.common.models.onboarding.BusinessCategory;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_list.CoverageListScreen;
import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreen;
import com.revolut.feature.retail.savings.impl.core.calculator.presentation.SavingsCalculatorScreen;
import com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.TransferWidgetCustomisationScreen;
import com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.TransferWidgetCustomisationScreenContract$BottomSheetState;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.usedexpiredcards.RevPointsGiftcardsUsedExpiredCardsScreen;
import com.revolut.feature.security_hub.impl.ui.lost_card.LostCardController;
import com.revolut.feature.tab.lifestyle.impl.ui.documents.LifestyleDocumentsScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.where_to_find_tin.WhereToFindTinBottomSheetScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.india.details.IndiaStoredMethodDetailsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishFragmentNavigateCommand;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.RewardsHubChallengeHistoryScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsController;
import com.revolut.sso.impl.ui.external_entry.external_entry.choose_account.ChooseAccountScreen;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e0((f0) this.v, continuation, 0);
            case 1:
                return new e0((SavingsCalculatorScreen) this.v, continuation, 1);
            case 2:
                return new e0((LifestyleDocumentsScreen) this.v, continuation, 2);
            case 3:
                return new e0((ChooseAccountScreen) this.v, continuation, 3);
            case 4:
                return new e0((apd.f) this.v, continuation, 4);
            case 5:
                return new e0((TransferWidgetCustomisationScreen) this.v, continuation, 5);
            case 6:
                return new e0((WhereToFindTinBottomSheetScreen) this.v, continuation, 6);
            case 7:
                return new e0((are.b) this.v, continuation, 7);
            case 8:
                return new e0((atk.i) this.v, continuation, 8);
            case 9:
                return new e0((atk.l) this.v, continuation, 9);
            case 10:
                return new e0((au6.f) this.v, continuation, 10);
            case 11:
                return new e0((au6.v) this.v, continuation, 11);
            case 12:
                return new e0((au6.r1) this.v, continuation, 12);
            case 13:
                return new e0((au6.x1) this.v, continuation, 13);
            case 14:
                return new e0((m2) this.v, continuation, 14);
            case 15:
                return new e0((c3) this.v, continuation, 15);
            case 16:
                return new e0((m3) this.v, continuation, 16);
            case 17:
                return new e0((r3) this.v, continuation, 17);
            case 18:
                return new e0((RewardsHubChallengeHistoryScreen) this.v, continuation, 18);
            case 19:
                return new e0((CoverageListScreen) this.v, continuation, 19);
            case 20:
                return new e0((LostCardController) this.v, continuation, 20);
            case 21:
                return new e0((CfdDetailsController) this.v, continuation, 21);
            case 22:
                return new e0((aw.u) this.v, continuation, 22);
            case 23:
                return new e0((aw.c0) this.v, continuation, 23);
            case 24:
                return new e0((awd.c) this.v, continuation, 24);
            case 25:
                return new e0((ProfileScannerScreen) this.v, continuation, 25);
            case 26:
                return new e0((com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f) this.v, continuation, 26);
            case 27:
                return new e0((RevPointsGiftcardsUsedExpiredCardsScreen) this.v, continuation, 27);
            case 28:
                return new e0((axe.b) this.v, continuation, 28);
            default:
                return new e0((IndiaStoredMethodDetailsScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v142, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v2, types: [es6.c] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v7, types: [es6.c] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v21, types: [es6.c[]] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        List list;
        ?? r142;
        es6.b bVar;
        boolean z;
        int i = this.u;
        int i2 = 3;
        ArrayList arrayList = null;
        int i3 = 0;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return f0.a((f0) obj3);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((alb.j) ((alb.f) ((SavingsCalculatorScreen) obj3).Q.getValue())).B2();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((LifestyleDocumentsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ChooseAccountScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((apd.f) obj3).f8166h.c(false);
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a aVar7 = (com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a) ((TransferWidgetCustomisationScreen) obj3).T2();
                TransferWidgetCustomisationScreenContract$BottomSheetState transferWidgetCustomisationScreenContract$BottomSheetState = ((aqb.f) aVar7.t2()).f8282a;
                if (Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.SelectAccount.f83390a)) {
                    aVar7.x2(new aqb.s(i3));
                } else if (Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.Customise.f83388a)) {
                    aVar7.z2();
                } else {
                    if (!(transferWidgetCustomisationScreenContract$BottomSheetState instanceof TransferWidgetCustomisationScreenContract$BottomSheetState.TopUp) && !Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.Withdraw.f83393a) && !Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.SpareChange.f83391a) && !Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.Goal.f83389a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar7.C1(new BridgeDestination(new FinishFragmentNavigateCommand(0)));
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((aqe.f) ((WhereToFindTinBottomSheetScreen) obj3).R.getValue()).B2();
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar = ((are.b) obj3).f8692c;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType kTypeB = kotlin.jvm.internal.o0.b(zqe.f.class);
                companion.getClass();
                List list2 = (List) eVar.T2("TEEN_PROFILE_CACHE_KEY", wim.z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                if (list2 != null) {
                    return yqe.a.a(list2);
                }
                return null;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((atk.i) obj3).d.Z2();
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                atk.l lVar = (atk.l) obj3;
                lVar.X2(lVar.f9094p, new a26.p(lVar, 4));
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                au6.f fVar = (au6.f) obj3;
                ue0.c cVar = fVar.f9525c;
                com.revolut.feature.freelancer.impl.network.models.b bVar2 = (com.revolut.feature.freelancer.impl.network.models.b) cVar.T2("KEY_VALID_PRO_ACCOUNT_DETAILS", com.revolut.feature.freelancer.impl.network.models.b.class);
                FreelancerAccountOnboardingState.Onboarded onboarded = bVar2 != null ? new FreelancerAccountOnboardingState.Onboarded(fVar.e.a(bVar2)) : null;
                if (onboarded != null) {
                    return onboarded;
                }
                boolean zF = Intrinsics.f(j6.a.k(Boolean.TYPE, cVar, "STORAGE_KEY_IS_MERCHANT_ONBOARDED"), Boolean.FALSE);
                lr6.u uVar = (lr6.u) cVar.T2("STORAGE_CACHE_KEY_MERCHANT_PENDING_REASON", lr6.u.class);
                if (zF && uVar != null) {
                    return new FreelancerAccountOnboardingState.Pending(uVar);
                }
                if (zF) {
                    return FreelancerAccountOnboardingState.NotOnboarded.f73272a;
                }
                return null;
            case 11:
                au6.v vVar = (au6.v) obj3;
                skm.r rVar = vVar.i;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    if (vVar.f9637g.a()) {
                        is6.a aVar14 = vVar.e;
                        List list3 = (List) DBUtil.performBlocking(aVar14.f168111a, true, false, new is2.t(aVar14, i2));
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it8 = list3.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(bu6.a.c((ks6.k) it8.next()));
                        }
                        j2 j2Var = vVar.f9639j;
                        do {
                            value = j2Var.getValue();
                            list = (List) value;
                            if (list == null) {
                                list = arrayList2;
                            }
                        } while (!j2Var.h(value, list));
                    }
                    Unit unit = Unit.f186387a;
                    rVar.U(unit);
                    return unit;
                } catch (Throwable th10) {
                    rVar.U(Unit.f186387a);
                    throw th10;
                }
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List<ks6.t> list4 = (List) DBUtil.performBlocking(((au6.r1) obj3).f9608b.f168128a, true, false, new ip4.m(26));
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                for (ks6.t tVar : list4) {
                    Map map = ft6.k.f137948a;
                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                    arrayList3.add(new BusinessCategory(tVar.f189256a, tVar.f189257b, tVar.d, tVar.e, tVar.f, tVar.f189258c));
                }
                return arrayList3;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(zr6.a.class, ((au6.x1) obj3).f9658c, "CACHE_KEY_FREELANCER_PRICING_PLAN");
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = ((m2) obj3).f9572c;
                Type type = l21.d.e;
                Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
                return cVar2.T2("STORAGE_KEY_TRADING_NAME_ENABLED", type);
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                os6.b bVar3 = ((c3) obj3).d;
                List list5 = (List) DBUtil.performBlocking(bVar3.f229240a, true, false, new oqk.c(bVar3, 7));
                if (list5.isEmpty()) {
                    list5 = null;
                }
                List list6 = list5;
                if (list6 == null) {
                    return null;
                }
                List list7 = list6;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list7, 10));
                Iterator it9 = list7.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(bu6.f.c((ps6.b) it9.next()));
                }
                return arrayList4;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar2 = ((m3) obj3).f9575c;
                KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                KType kTypeB2 = kotlin.jvm.internal.o0.b(du6.g.class);
                companion2.getClass();
                List list8 = (List) eVar2.T2("STORAGE_CACHE_KEY_TAX_POCKETS", wim.z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB2))));
                if (list8 == null) {
                    return null;
                }
                List<du6.g> list9 = list8;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list9, 10));
                for (du6.g gVar : list9) {
                    Object obj4 = bu6.g.f18689a;
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    String strC = gVar.getId();
                    String strD = gVar.getMoneyBoxId();
                    String strE = gVar.getState();
                    ?? Values = es6.c.values();
                    int length = Values.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            r142 = Values[i5];
                            if (!kotlin.text.a0.z(r142.name(), strE, true)) {
                                i5++;
                            }
                        } else {
                            r142 = arrayList;
                        }
                    }
                    if (r142 == 0) {
                        r142 = es6.c.UNKNOWN;
                    }
                    ?? r122 = r142;
                    String strA = gVar.getAutomaticAllocation();
                    es6.b[] bVarArrValues = es6.b.values();
                    int length2 = bVarArrValues.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length2) {
                            bVar = bVarArrValues[i6];
                            if (!kotlin.text.a0.z(bVar.name(), strA, true)) {
                                i6++;
                            }
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar == null) {
                        bVar = es6.b.UNKNOWN;
                    }
                    arrayList5.add(new es6.d(strC, strD, r122, bVar, gVar.getFixedAllocationRate()));
                    arrayList = null;
                }
                return arrayList5;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                os6.d dVar = ((r3) obj3).f9614c;
                List list10 = (List) DBUtil.performBlocking(dVar.f229246a, true, false, new oqk.c(dVar, 8));
                if (list10.isEmpty()) {
                    list10 = null;
                }
                List list11 = list10;
                if (list11 != null) {
                    List list12 = list11;
                    arrayList = new ArrayList(zhm.w.t(list12, 10));
                    Iterator it10 = list12.iterator();
                    while (it10.hasNext()) {
                        arrayList.add(bu6.f.a((ps6.i) it10.next()));
                    }
                }
                return arrayList;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((RewardsHubChallengeHistoryScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CoverageListScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((avc.r) ((avc.f) ((LostCardController) obj3).M.getValue())).B2();
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((avk.h0) ((avk.k) ((CfdDetailsController) obj3).f103913r0.getValue())).B2();
                return Unit.f186387a;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((aw.u) obj3).d.incrementAndGet();
                return Unit.f186387a;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((aw.c0) obj3).f10143a.c();
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                awd.c cVar3 = (awd.c) obj3;
                List list13 = (List) p.a.j(nwd.d.class, KTypeProjection.INSTANCE, List.class, cVar3.f10761b, "STORAGE_KEY_STAKING_PRODUCTS_V2");
                if (list13 != null) {
                    return cVar3.d.e(list13);
                }
                return null;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ProfileScannerScreen profileScannerScreen = (ProfileScannerScreen) obj3;
                xu.f fVar2 = profileScannerScreen.S;
                if (fVar2 == null) {
                    Intrinsics.r("cameraDelegate");
                    throw null;
                }
                if (fVar2.f) {
                    fVar2.f308842g = !fVar2.f308842g;
                    iam.e eVar3 = (iam.e) fVar2.i.getValue();
                    nam.e newConfiguration = new nam.e(fVar2.f308842g ? new fbm.d(uam.c.f, 1) : new fbm.d(uam.c.d, 1));
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(newConfiguration, "newConfiguration");
                    eVar3.f160064a.B(new mam.a(true, new abm.c(eVar3, newConfiguration, i2)));
                    z = fVar2.f308842g;
                } else {
                    z = fVar2.f308842g;
                }
                j2 j2Var2 = ((com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f) profileScannerScreen.a3()).v.f292656b;
                Boolean boolValueOf = Boolean.valueOf(z);
                j2Var2.getClass();
                j2Var2.g(null, boolValueOf);
                return Unit.f186387a;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f fVar3 = (com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f) obj3;
                fVar3.f79666t.getClass();
                fVar3.X1(ax9.i.a());
                return Unit.f186387a;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((axb.j) ((axb.g) ((RevPointsGiftcardsUsedExpiredCardsScreen) obj3).R.getValue())).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(yte.k.class, ((axe.b) obj3).f10932c, "POST_ACTIVATION_CONFIG_KEY");
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((aye.m) ((IndiaStoredMethodDetailsScreen) obj3).N.getValue()).C2(aye.e.f11138a);
                return Unit.f186387a;
        }
    }
}
