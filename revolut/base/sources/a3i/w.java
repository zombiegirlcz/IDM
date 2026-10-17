package a3i;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.config.AgreementsScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CreditOperationStatusCheckConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.LoanSelectBackupCardFlowContract$State;
import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$State;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.youTransactor.uCube.rpc.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l15.f;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wi0.b f1165b;

    public /* synthetic */ w(int i, wi0.b bVar) {
        this.f1164a = i;
        this.f1165b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        f.a aVar;
        switch (this.f1164a) {
            case 0:
                return l.a((l) obj2, null, this.f1165b, false, 11);
            case 1:
                baf.i update = (baf.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return baf.i.a(update, null, null, this.f1165b, false, false, Constants.TAG_FB_CHARGING_STATUS);
            case 2:
                return bg9.a.a((bg9.a) obj2, zi0.c.P(this.f1165b, false, null, 3), null, null, 6);
            case 3:
                xi0.b.Companion.getClass();
                return bh9.a.a((bh9.a) obj2, null, xi0.a.b(this.f1165b), null, null, 59);
            case 4:
                jo6.k update2 = (jo6.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return jo6.k.a(update2, null, null, false, this.f1165b, null, 47);
            case 5:
                jo6.k kVar = (jo6.k) obj2;
                wi0.b bVar = this.f1165b;
                return jo6.k.a(kVar, null, null, bVar != null, bVar, null, 39);
            case 6:
                cl4.d cashback = (cl4.d) obj2;
                Intrinsics.checkNotNullParameter(cashback, "cashback");
                wi0.b.Companion.getClass();
                wi0.b bVar2 = wi0.b.f297781v1;
                wi0.b bVar3 = this.f1165b;
                if (bVar3.equals(bVar2)) {
                    ju3.a aVar2 = ju3.a.CONSENTS_V1;
                    j24.b.Companion.getClass();
                    LinkedHashMap linkedHashMapP = r0.p(r0.k(new Pair(aVar2, j24.b.C), new Pair(ju3.a.DOCUMENTS_AGREEMENTS, new AgreementsScreenConfig(new AgreementsScreenConfig.Disclaimer(new TextLocalisedClause(R$string.credit_card_application_doc_sign_doc_list_warning, null, null, 14), com.revolut.feature.credit.application.plugins.api.models.config.a.ALL_DOCUMENTS_ACCEPTED)))), j24.a.a());
                    k24.e.Companion.getClass();
                    return new ju3.c(r0.p(linkedHashMapP, k24.d.a(cashback)), bVar2);
                }
                wi0.b bVar4 = wi0.b.t2;
                if (bVar3.equals(bVar4)) {
                    Pair pair = new Pair(ju3.a.CHECK_B, new CreditOperationStatusCheckConfig(zhm.v.k(new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_credit_history_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_history_check_subtitle, null, null, 14)), new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_credit_offer_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_offer_check_subtitle, null, null, 14)), new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_credit_score_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_score_check_subtitle, null, null, 14))), CapturePresenter.MANUAL_FALLBACK_DELAY_MS, 7, CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, new WaitingPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_button_got_it, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_button_turn_notifications_on, null, null, 14)), zhm.v.k(it3.f.RISK_B_PASSED, it3.f.INCOME_CHECK_SKIPPED, it3.f.INCOME_FETCH_STARTED, it3.f.INCOME_FETCH_FINISHED, it3.f.INCOME_CHECK_PASSED)));
                    ju3.a aVar3 = ju3.a.DOCUMENTS_AGREEMENTS;
                    AgreementsScreenConfig.INSTANCE.getClass();
                    Map mapK = r0.k(pair, new Pair(aVar3, AgreementsScreenConfig.Companion.a()));
                    k24.e.Companion.getClass();
                    return new ju3.c(r0.p(mapK, k24.d.a(cashback)), bVar4);
                }
                wi0.b bVar5 = wi0.b.p0;
                if (bVar3.equals(bVar5)) {
                    Map mapC = q0.c(new Pair(ju3.a.DOCUMENTS_AGREEMENTS, new AgreementsScreenConfig(new AgreementsScreenConfig.Disclaimer(new TextLocalisedClause(R$string.credit_card_application_doc_sign_doc_list_uk_below_warning, null, null, 14), com.revolut.feature.credit.application.plugins.api.models.config.a.ALL_DOCUMENTS_ACCEPTED))));
                    k24.e.Companion.getClass();
                    return new ju3.c(r0.p(mapC, k24.d.a(cashback)), bVar5);
                }
                wi0.b bVar6 = wi0.b.f297770q3;
                if (bVar3.equals(bVar6)) {
                    ju3.a aVar4 = ju3.a.DOCUMENTS_AGREEMENTS;
                    AgreementsScreenConfig.INSTANCE.getClass();
                    Pair pair2 = new Pair(aVar4, AgreementsScreenConfig.Companion.a());
                    ju3.a aVar5 = ju3.a.AUTO_PAY;
                    j24.b.Companion.getClass();
                    Map mapK2 = r0.k(pair2, new Pair(aVar5, j24.b.f));
                    k24.e.Companion.getClass();
                    return new ju3.c(r0.p(mapK2, k24.d.a(cashback)), bVar6);
                }
                wi0.b bVar7 = wi0.b.L0;
                if (!bVar3.equals(bVar7)) {
                    ju3.a aVar6 = ju3.a.CONSENTS_V1;
                    j24.b.Companion.getClass();
                    Map mapK3 = r0.k(new Pair(aVar6, j24.b.C), new Pair(ju3.a.DOCUMENTS_AGREEMENTS, new AgreementsScreenConfig(new AgreementsScreenConfig.Disclaimer(new TextLocalisedClause(R$string.credit_card_application_doc_sign_doc_list_warning, null, null, 14), com.revolut.feature.credit.application.plugins.api.models.config.a.ALL_DOCUMENTS_ACCEPTED))));
                    k24.e.Companion.getClass();
                    return new ju3.c(r0.p(mapK3, k24.d.a(cashback)), bVar3);
                }
                ju3.a aVar7 = ju3.a.DOCUMENTS_AGREEMENTS;
                AgreementsScreenConfig.INSTANCE.getClass();
                Pair pair3 = new Pair(aVar7, AgreementsScreenConfig.Companion.a());
                ju3.a aVar8 = ju3.a.AUTO_PAY;
                j24.b.Companion.getClass();
                Map mapK4 = r0.k(pair3, new Pair(aVar8, j24.b.f));
                k24.e.Companion.getClass();
                return new ju3.c(r0.p(mapK4, k24.d.a(cashback)), bVar7);
            case 7:
                return l10.p.a((l10.p) obj2, null, null, this.f1165b, 383);
            case 8:
                Map it8 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                wi0.b bVar8 = this.f1165b;
                l15.b bVar9 = (l15.b) it8.get(bVar8);
                return (bVar9 == null || (aVar = bVar9.f191455a) == null) ? new l15.d(bVar8) : aVar;
            case 9:
                ((LoanSelectBackupCardFlowContract$State) obj2).getClass();
                return new LoanSelectBackupCardFlowContract$State(this.f1165b);
            case 10:
                KycConsolidatedFlowContract$State update3 = (KycConsolidatedFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                wi0.b bVar10 = update3.f77730a;
                boolean z = update3.d;
                wi0.b bVar11 = this.f1165b;
                return new KycConsolidatedFlowContract$State(bVar10, bVar11, bVar11, z);
            case 11:
                StakingProduct stakingProduct = ((vwd.f) obj2).f292704a;
                Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
                return new vwd.f(stakingProduct, this.f1165b);
            case 12:
                return x0f.h.a((x0f.h) obj2, null, null, zi0.c.P(this.f1165b, false, null, 3), null, 27);
            default:
                return zgj.r.a((zgj.r) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f1165b, 16383);
        }
    }

    public /* synthetic */ w(k24.e eVar, wi0.b bVar) {
        this.f1164a = 6;
        this.f1165b = bVar;
    }
}
