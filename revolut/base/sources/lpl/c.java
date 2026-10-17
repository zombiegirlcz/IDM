package lpl;

import androidx.work.BackoffPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import aw0.n6;
import com.revolut.biometric_verification.impl.ui.step.document.intro.BiometricVerificationDocumentIntroScreen;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.apm.core.ui.impl.ui.list.ApmListScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedcreditlistv2.LoanRefinancedCreditListV2Controller;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collections_list.CryptoCollectionsController;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.transfer_assets.DeFiTransferAssetsScreen;
import com.revolut.feature.defi.settings.impl.ui.settings.DeFiSettingsScreen;
import com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.FreelancerMerchantTermsScreen;
import com.revolut.feature.global_markets.impl.ui.redesign.flow.GlobalMarketsRedesignFlow;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.manage.ManagePolicyScreen;
import com.revolut.feature.payments_migration.impl.ui.screen.no_cards.NoCardsController;
import com.revolut.feature.retail.cfd.impl.screens.riskwarning.CfdRiskWarningController;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.CobrandedCardsPlanHubRewardInfoScreen;
import com.revolut.feature.revolut_shop.ui.screen.payment_method.PaymentMethodScreen;
import com.revolut.feature.revolutpay.impl.ui.deferred_payment.DeferredPaymentScreen;
import com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.HiddenAccountsAndTransactionsController;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.search_list.SearchListScreen;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.details.ConnectedClientScreen;
import com.revolut.utils.job.workers.ApmMultibancoDynamicFeaturesWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import m1e.l;
import m8d.h0;
import mii.q;
import mri.w;
import nii.l1;
import nii.n1;
import te0.t;
import vkm.j2;
import yhm.o;
import z50.k;
import zhm.f0;
import zhm.r0;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((ConnectedClientScreen) this.v, continuation, 0);
            case 1:
                return new c((ManagePolicyScreen) this.v, continuation, 1);
            case 2:
                return new c((lr.e) this.v, continuation, 2);
            case 3:
                return new c((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a) this.v, continuation, 3);
            case 4:
                return new c((BiometricVerificationDocumentIntroScreen) this.v, continuation, 4);
            case 5:
                return new c((lte.b) this.v, continuation, 5);
            case 6:
                return new c((HiddenAccountsAndTransactionsController) this.v, continuation, 6);
            case 7:
                return new c((com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a) this.v, continuation, 7);
            case 8:
                return new c((TransitSectionScreen) this.v, continuation, 8);
            case 9:
                return new c((com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a) this.v, continuation, 9);
            case 10:
                return new c((CryptoCollectionsController) this.v, continuation, 10);
            case 11:
                return new c((FreelancerMerchantTermsScreen) this.v, continuation, 11);
            case 12:
                return new c((m0l.c) this.v, continuation, 12);
            case 13:
                return new c((l) this.v, continuation, 13);
            case 14:
                return new c((ApmListScreen) this.v, continuation, 14);
            case 15:
                return new c((IllegalArgumentException) this.v, continuation, 15);
            case 16:
                return new c((CfdRiskWarningController) this.v, continuation, 16);
            case 17:
                return new c((PaymentMethodScreen) this.v, continuation, 17);
            case 18:
                return new c((SearchListScreen) this.v, continuation, 18);
            case 19:
                return new c((v20.c) this.v, continuation, 19);
            case 20:
                return new c((DeFiTransferAssetsScreen) this.v, continuation, 20);
            case 21:
                return new c((com.revolut.feature.joint.impl.ui.withdraw.b) this.v, continuation, 21);
            case 22:
                return new c((DeFiSettingsScreen) this.v, continuation, 22);
            case 23:
                return new c((NoCardsController) this.v, continuation, 23);
            case 24:
                return new c((br3.a) this.v, continuation, 24);
            case 25:
                return new c((LoanRefinancedCreditListV2Controller) this.v, continuation, 25);
            case 26:
                return new c((CobrandedCardsPlanHubRewardInfoScreen) this.v, continuation, 26);
            case 27:
                return new c((GlobalMarketsRedesignFlow) this.v, continuation, 27);
            case 28:
                return new c((DeferredPaymentScreen) this.v, continuation, 28);
            default:
                return new c((h0) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((l1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 16:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v75, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List listV0;
        rd7.h gVar;
        int i = this.u;
        aii.q qVar = aii.q.f5292a;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ConnectedClientScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ManagePolicyScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                File[] fileArrListFiles = ((lr.e) obj3).f199342b.listFiles();
                return (fileArrListFiles == null || (listV0 = kotlin.collections.d.v0(fileArrListFiles)) == null) ? f0.f322471a : listV0;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a aVar5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a) obj3;
                aVar5.H2(aVar5.f87937q, new lph.c(aVar5.o.a("ACCOUNT.linked_account"), 1));
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((BiometricVerificationDocumentIntroScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return (List) ((lte.b) obj3).f199855b.getValue();
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.a) ((luc.h) ((HiddenAccountsAndTransactionsController) obj3).P.getValue())).B2();
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a) obj3).s1();
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TransitSectionScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a aVar12 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a) obj3;
                aVar12.C2(new lxe.e(((lxe.d) ((j2) aVar12.f90772r.f22677a).getValue()).f200559a));
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((CryptoCollectionsController) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.a) ((FreelancerMerchantTermsScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m0l.c) obj3).C2(qVar);
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) obj3).C2(qVar);
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ApmListScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw ((IllegalArgumentException) obj3);
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m4b.g gVar2 = (m4b.g) ((m4b.c) ((CfdRiskWarningController) obj3).S.getValue());
                p2b.i iVar = gVar2.o;
                ((t) iVar.f232200a.f140258b.getValue()).set(Long.valueOf(iVar.f232201b.a()));
                gVar2.C2(a2b.f.f724a);
                return Unit.f186387a;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                zji.d dVar = ((m4c.h) ((PaymentMethodScreen) obj3).N.getValue()).f226129n;
                Unit unit = Unit.f186387a;
                dVar.a(unit);
                return unit;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((SearchListScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List uploads = ((v20.c) obj3).getUploads();
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (Object obj4 : uploads) {
                    int i3 = i2 + 1;
                    Pair pair = null;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    v20.b upload = ((v20.a) obj4).getUpload();
                    if (k.d(upload.getMediaType())) {
                        File file = upload.i;
                        if (file == null || !file.exists()) {
                            file = null;
                        }
                        String thumbnailUrl = upload.getThumbnailUrl();
                        if (thumbnailUrl == null || !Intrinsics.f(upload.getContentUploaded(), Boolean.TRUE)) {
                            thumbnailUrl = null;
                        }
                        Map thumbnailUrlHeaders = upload.getThumbnailUrlHeaders();
                        if (file != null) {
                            gVar = new rd7.f(file, (String) null);
                        } else if (thumbnailUrl != null) {
                            if (thumbnailUrlHeaders == null) {
                                thumbnailUrlHeaders = r0.g();
                            }
                            gVar = new rd7.g(thumbnailUrl, new UrlImage.SimpleCustomHeaders(y0.b("X-Device-Id"), thumbnailUrlHeaders), 8);
                        } else {
                            gVar = null;
                        }
                        if (gVar != null) {
                            pair = new Pair(new Integer(i2), gVar.b(upload.getCaption()));
                        }
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i2 = i3;
                }
                return arrayList;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m56.f) ((DeFiTransferAssetsScreen) obj3).P.getValue()).B2();
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.joint.impl.ui.withdraw.b) obj3).B2();
                return Unit.f186387a;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m66.g) ((m66.e) ((DeFiSettingsScreen) obj3).L.getValue())).B2();
                return Unit.f186387a;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((NoCardsController) obj3).c3(m6a.a.f203038a);
                return Unit.f186387a;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                nzl.a aVar28 = (nzl.a) ((w) ((br3.a) obj3).f17874b);
                aVar28.f221092a.enqueueUniqueWork("Manages installation of MBWay SDK module", ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(o0.f186429a.b(ApmMultibancoDynamicFeaturesWorker.class)).setConstraints(aVar28.b()).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 1L, TimeUnit.MINUTES).build());
                return Unit.f186387a;
            case 25:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((LoanRefinancedCreditListV2Controller) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 26:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.c) ((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.b) ((CobrandedCardsPlanHubRewardInfoScreen) obj3).Q.getValue())).B2();
                return Unit.f186387a;
            case 27:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.global_markets.impl.ui.redesign.flow.a) ((m87.b) ((GlobalMarketsRedesignFlow) obj3).O.getValue())).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((DeferredPaymentScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h0) obj3).u2();
                return Unit.f186387a;
        }
    }
}
