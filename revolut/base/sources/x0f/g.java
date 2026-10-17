package x0f;

import com.revolut.feature.alipay.impl.ui.qr.scanner.AlipayPlusQrScannerFlowContract$Step;
import com.revolut.feature.apm.core.ui.impl.ui.pending.ApmPendingScreen;
import com.revolut.feature.apm.spin.impl.ui.settings.SpinSettingsScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.split_by_currency.SplitByCurrencyScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.SigningMethodsInfoScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.collection.details.CharitiesCollectionDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list.InstitutionsListScreen;
import com.revolut.feature.incentive_reward.impl.ui.lottery.enrollment.screen.LotteryEnrollmentController;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreen;
import com.revolut.feature.shops.impl.ui.bid_screen.ShopsItemsBidScreen;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetController;
import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.esim.impl.ui.screens.help.EsimHelpScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.EsimMobilePlanPaymentsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.a;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import xid.d;
import xn6.j;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((ExternalCardDetailsScreen) this.v, continuation, 0);
            case 1:
                return new g((hf0.a) this.v, continuation, 1);
            case 2:
                return new g((ApmPendingScreen) this.v, continuation, 2);
            case 3:
                return new g((x22.f) this.v, continuation, 3);
            case 4:
                return new g((x2g.o) this.v, continuation, 4);
            case 5:
                return new g((x60.c) this.v, continuation, 5);
            case 6:
                return new g((xa0.b) this.v, continuation, 6);
            case 7:
                return new g((xai.a) this.v, continuation, 7);
            case 8:
                return new g((CharitiesCollectionDetailsScreen) this.v, continuation, 8);
            case 9:
                return new g((SpinSettingsScreen) this.v, continuation, 9);
            case 10:
                return new g((SplitByCurrencyScreen) this.v, continuation, 10);
            case 11:
                return new g((SigningMethodsInfoScreen) this.v, continuation, 11);
            case 12:
                return new g((xe7.d) this.v, continuation, 12);
            case 13:
                return new g((SharedCompletedAlertsScreen) this.v, continuation, 13);
            case 14:
                return new g((LotteryEnrollmentController) this.v, continuation, 14);
            case 15:
                return new g((xg8.j) this.v, continuation, 15);
            case 16:
                return new g((EsimHelpScreen) this.v, continuation, 16);
            case 17:
                return new g((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c) this.v, continuation, 17);
            case 18:
                return new g((xia.b) this.v, continuation, 18);
            case 19:
                return new g((ShopsItemsBidScreen) this.v, continuation, 19);
            case 20:
                return new g((xid.l) this.v, continuation, 20);
            case 21:
                return new g((EsimInfoBottomSheetScreen) this.v, continuation, 21);
            case 22:
                return new g((xjl.h) this.v, continuation, 22);
            case 23:
                return new g((com.revolut.feature.alipay.impl.ui.qr.scanner.a) this.v, continuation, 23);
            case 24:
                return new g((vfg.p) this.v, continuation, 24);
            case 25:
                return new g((EsimMobilePlanPaymentsScreen) this.v, continuation, 25);
            case 26:
                return new g((com.revolut.sso.impl.ui.consent.app.b) this.v, continuation, 26);
            case 27:
                return new g((xm5.d) this.v, continuation, 27);
            case 28:
                return new g((SetupBudgetController) this.v, continuation, 28);
            default:
                return new g((InstitutionsListScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v71, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v98, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((y) ((ExternalCardDetailsScreen) obj3).e3()).C2(j.f301590a);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hf0.a aVar3 = (hf0.a) obj3;
                phm.a aVar4 = (phm.a) aVar3.a().get(xmg.a.class);
                b60.a aVar5 = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar5 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", xmg.a.class, " is not found"));
                }
                xmg.a aVar6 = (xmg.a) aVar5.b();
                CoroutineScope coroutineScopeA = aVar6.f307252n.a();
                vc.s.j(coroutineScopeA);
                ymg.a aVar7 = aVar6.i;
                cng.b bVarA = aVar7.a();
                vc.s.j(bVarA);
                hng.b selectedRegisteredIdentityIdRepository = aVar7.b();
                vc.s.j(selectedRegisteredIdentityIdRepository);
                ang.f userInteractor = aVar6.e();
                Intrinsics.checkNotNullParameter(selectedRegisteredIdentityIdRepository, "selectedRegisteredIdentityIdRepository");
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                smd.s sVar = new smd.s();
                sVar.f264432a = selectedRegisteredIdentityIdRepository;
                sVar.f264433b = userInteractor;
                new zmg.e(coroutineScopeA, bVarA, sVar).init();
                phm.a aVar8 = (phm.a) aVar3.a().get(r4l.a.class);
                b60.a aVar9 = aVar8 != null ? (b60.a) aVar8.get() : null;
                if (aVar9 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", r4l.a.class, " is not found"));
                }
                ((nri.a) ((t4l.a) ((r4l.a) aVar9.b()).f251513g.get())).init();
                return Unit.f186387a;
            case 2:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ApmPendingScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 3:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x22.f) obj3).C2(c12.s.f20349a);
                return Unit.f186387a;
            case 4:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x2g.o) obj3).u = null;
                return Unit.f186387a;
            case 5:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x60.c) obj3).clear();
                return Unit.f186387a;
            case 6:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xa0.b) obj3).f303770n.invoke();
                return Unit.f186387a;
            case 7:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xai.a) obj3).f303893c.incrementAndGet();
                return Unit.f186387a;
            case 8:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xb6.h) ((CharitiesCollectionDetailsScreen) obj3).X.getValue()).u2();
                return Unit.f186387a;
            case 9:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SpinSettingsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 10:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SplitByCurrencyScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 11:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.a) ((xe4.f) ((SigningMethodsInfoScreen) obj3).O.getValue())).I2(xe4.d.f304531a);
                return Unit.f186387a;
            case 12:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(ve7.n.class, ((xe7.d) obj3).f304544c, "INCENTIVE_EXPERIMENTS_KEY");
            case 13:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SharedCompletedAlertsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 14:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xg7.i) ((xg7.e) ((LotteryEnrollmentController) obj3).O.getValue())).B2();
                return Unit.f186387a;
            case 15:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wg8.b bVar = (wg8.b) ((xg8.j) obj3).d.T2("ASSET_STORAGE_KEY", wg8.b.class);
                if (bVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                dj0.d dVarV = hx7.a.v(bVar.getCurrentBalance());
                jo3.b bVarE = bVar.getSavingBalance();
                dj0.d dVarV2 = bVarE != null ? hx7.a.v(bVarE) : null;
                long jA = bVar.getConfirmedDate();
                ig8.h hVarA = ug8.a.a(bVar.getState(), bVar.getFailureReason());
                Boolean boolH = bVar.getU18AccountWillBeClosed();
                boolean zBooleanValue = boolH != null ? boolH.booleanValue() : true;
                boolean zF = bVar.getShowAssetsTransferPendingAction();
                wg8.a aVarD = bVar.getGuardian();
                ig8.i iVar = new ig8.i(dVarV, dVarV2, jA, hVarA, zBooleanValue, zF, aVarD != null ? new ig8.f(aVarD.getId(), aVarD.getFirstName(), aVarD.getLastName()) : null);
                od0.i.Companion.getClass();
                return od0.h.a(iVar);
            case 16:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((EsimHelpScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 17:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c) obj3).C2(a.b.f103170a);
                return Unit.f186387a;
            case 18:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((xia.b) obj3).f306317c.T2("PRO_POST_ACTIVATION_KEY", via.a.class);
            case 19:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xid.l) ((xid.h) ((ShopsItemsBidScreen) obj3).T.getValue())).C2(d.c.f306327a);
                return Unit.f186387a;
            case 20:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xid.l) obj3).f306339r.a();
                return Unit.f186387a;
            case 21:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xij.c) ((xij.b) ((EsimInfoBottomSheetScreen) obj3).V.getValue())).B2();
                return Unit.f186387a;
            case 22:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xjl.h hVar = (xjl.h) obj3;
                if (hVar.f306558b.I0("KEY_SSO_FLOW_SCOPE")) {
                    hVar.f306557a.remove("KEY_SSO_FLOW_SCOPE");
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.alipay.impl.ui.qr.scanner.a aVar32 = (com.revolut.feature.alipay.impl.ui.qr.scanner.a) obj3;
                oki.h.t2(aVar32, aVar32.f61078r, AlipayPlusQrScannerFlowContract$Step.Camera.f61075a, false, TransitionAnimation.NONE.f98393a, false, 8);
                return Unit.f186387a;
            case 24:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wl0.c cVar = (wl0.c) ((vfg.p) obj3).f288633b;
                wl0.i iVarA = cVar.f298341b.a();
                if (cVar.d() == wl0.o.NONE) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "BioSignatureControllerModelExtensionImpl", "Biometric is not available for bio signature", null, null, 16);
                } else if (iVarA != wl0.i.GOOGLE) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "BioSignatureControllerModelExtensionImpl", "Unsupported prompt type " + iVarA + " for bio signature", null, null, 16);
                } else {
                    if (cVar.c().equals(rm0.d.f255149a)) {
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.b(rd0.c.DEBUG, "BioSignatureControllerModelExtensionImpl", "Bio signature eligibility check passed", null, null, 16);
                        return Boolean.valueOf(z);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "BioSignatureControllerModelExtensionImpl", "User didn't opt-in biometric authentication, biometricState=".concat(cVar.c().getClass().getName()), null, null, 16);
                }
                z = false;
                return Boolean.valueOf(z);
            case 25:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xlj.g) ((xlj.e) ((EsimMobilePlanPaymentsScreen) obj3).S.getValue())).B2();
                return Unit.f186387a;
            case 26:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.sso.impl.ui.consent.app.b) obj3).v);
                return Unit.f186387a;
            case 27:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xm5.d dVar = (xm5.d) obj3;
                if (dVar.o.d != null) {
                    dVar.C1(u0.b(new FinishCommand(0, null, null, 6)));
                } else {
                    dVar.C2(km5.c.f185719a);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SetupBudgetController) obj3).R2().B2();
                return Unit.f186387a;
            default:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xn6.o) ((InstitutionsListScreen) obj3).e3()).C2(j.a.f307325a);
                return Unit.f186387a;
        }
    }
}
