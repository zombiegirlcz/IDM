package k24;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.CreditOfferParcel;
import com.revolut.feature.credit.application.plugins.api.models.config.AgreementsScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CreditOfferConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CreditOperationStatusCheckConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.ManualUnderwritingScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.core.R$string;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import k24.h;
import k24.j;
import kotlin.Pair;
import zhm.q0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wi0.b f180321b;

    public /* synthetic */ a(int i, wi0.b bVar) {
        this.f180320a = i;
        this.f180321b = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Map mapP;
        int i = this.f180320a;
        wi0.b bVar = this.f180321b;
        switch (i) {
            case 0:
                ju3.a aVar = ju3.a.CONSENTS_V1;
                j24.b.Companion.getClass();
                Pair pair = new Pair(aVar, j24.b.C);
                Pair pair2 = new Pair(ju3.a.OFFER, new CreditOfferConfig(new CreditOfferParcel(true)));
                ju3.a aVar2 = ju3.a.DOCUMENTS_AGREEMENTS;
                AgreementsScreenConfig.INSTANCE.getClass();
                Map mapK = r0.k(pair, pair2, new Pair(aVar2, AgreementsScreenConfig.Companion.a()), new Pair(ju3.a.MANUAL_UNDERWRITING, j24.b.D));
                b.Companion.getClass();
                return new ju3.c(r0.p(mapK, r0.g()), bVar);
            case 1:
                c.Companion.getClass();
                Pair pair3 = new Pair(ju3.a.OFFER, new CreditOfferConfig(new CreditOfferParcel(true)));
                ju3.a aVar3 = ju3.a.DOCUMENTS_AGREEMENTS;
                AgreementsScreenConfig.INSTANCE.getClass();
                return new ju3.c(r0.k(pair3, new Pair(aVar3, AgreementsScreenConfig.Companion.a())), bVar);
            case 2:
                WaitingPopupScreenConfig waitingPopupScreenConfig = f.f180323a;
                Map mapC = q0.c(new Pair(ju3.a.MANUAL_UNDERWRITING, new ManualUnderwritingScreenConfig(f.f180323a, f.f180324b)));
                ju3.a aVar4 = ju3.a.DOCUMENTS_AGREEMENTS;
                AgreementsScreenConfig.INSTANCE.getClass();
                return new ju3.c(r0.p(mapC, q0.c(new Pair(aVar4, AgreementsScreenConfig.Companion.a()))), bVar);
            case 3:
                g.Companion.getClass();
                Pair pair4 = new Pair(ju3.a.OFFER, new CreditOfferConfig(new CreditOfferParcel(true)));
                ju3.a aVar5 = ju3.a.DOCUMENTS_AGREEMENTS;
                AgreementsScreenConfig.INSTANCE.getClass();
                return new ju3.c(r0.k(pair4, new Pair(aVar5, AgreementsScreenConfig.Companion.a())), bVar);
            case 4:
                wi0.b.Companion.getClass();
                if (bVar.equals(wi0.b.t2)) {
                    h.Companion.getClass();
                    Map mapA = h.a.a();
                    j24.b.Companion.getClass();
                    mapP = r0.q(r0.p(mapA, j24.a.a()), new Pair(ju3.a.CHECK_B, new CreditOperationStatusCheckConfig(v.k(new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_credit_history_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_history_check_subtitle, null, null, 14)), new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_credit_offer_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_offer_check_subtitle, null, null, 14)), new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_credit_score_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_score_check_subtitle, null, null, 14))), CapturePresenter.MANUAL_FALLBACK_DELAY_MS, 7, CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, new WaitingPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_button_got_it, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_button_turn_notifications_on, null, null, 14)), v.k(it3.f.RISK_B_PASSED, it3.f.INCOME_CHECK_SKIPPED, it3.f.INCOME_FETCH_STARTED, it3.f.INCOME_FETCH_FINISHED, it3.f.INCOME_CHECK_PASSED))));
                } else {
                    h.Companion.getClass();
                    Map mapA2 = h.a.a();
                    j24.b.Companion.getClass();
                    mapP = r0.p(mapA2, j24.a.a());
                }
                return new ju3.c(mapP, bVar);
            case 5:
                return new ju3.c(r0.g(), bVar);
            case 6:
                wi0.b.Companion.getClass();
                wi0.b bVar2 = wi0.b.f297781v1;
                if (bVar.equals(bVar2)) {
                    ju3.a aVar6 = ju3.a.CONSENTS_V1;
                    j24.b.Companion.getClass();
                    LinkedHashMap linkedHashMapP = r0.p(r0.k(new Pair(aVar6, j24.b.C), new Pair(ju3.a.DOCUMENTS_AGREEMENTS, new AgreementsScreenConfig(new AgreementsScreenConfig.Disclaimer(new TextLocalisedClause(R$string.loan_application_doc_sign_doc_list_warning, null, null, 14), com.revolut.feature.credit.application.plugins.api.models.config.a.ALL_DOCUMENTS_ACCEPTED))), new Pair(ju3.a.CHECK_B, new CreditOperationStatusCheckConfig(v.k(new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_running_credit_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_history_check_subtitle, null, null, 14)), new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_credit_offer_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_offer_check_subtitle, null, null, 14)), new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_credit_score_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_score_check_subtitle, null, null, 14))), CapturePresenter.MANUAL_FALLBACK_DELAY_MS, 7, CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, new WaitingPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_button_got_it, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_button_turn_notifications_on, null, null, 14)), null))), r0.k(new Pair(ju3.a.SPOUSAL_CONSENT_PARTNER, j24.b.f170677g), new Pair(ju3.a.SPOUSAL_CONSENT_INITIATOR_FAILED, j24.b.i), new Pair(ju3.a.SPOUSAL_CONSENT_INITIATOR_CHECKING, j24.b.f170680l), new Pair(ju3.a.SPOUSAL_CONSENT_INITIATOR_REQUEST_CONSENT, j24.b.f170682n), new Pair(ju3.a.SPOUSAL_CONSENT_INITIATOR_WAITING, j24.b.f170683p), new Pair(ju3.a.SPOUSAL_CONSENT_INITIATOR_PARTNER_DECLINED, j24.b.f170687t), new Pair(ju3.a.SPOUSAL_CONSENT_PARTNER_INIT_POPUP, j24.b.A), new Pair(ju3.a.SPOUSAL_CONSENT_PARTNER_WAITING_POPUP, j24.b.B), new Pair(ju3.a.SPOUSAL_CONSENT_INITIATOR_FAILED_POPUP, j24.b.k), new Pair(ju3.a.SPOUSAL_CONSENT_INITIATOR_WAITING_POPUP, j24.b.f170685r), new Pair(ju3.a.SPOUSAL_CONSENT_INITIATOR_PARTNER_DECLINED_POPUP, j24.b.v), new Pair(ju3.a.SPOUSAL_CONSENT_INITIATOR_PARTNER_NOT_MATCHED_POPUP, j24.b.f170689x), new Pair(ju3.a.MANUAL_UNDERWRITING, j24.b.D)));
                    j.Companion.getClass();
                    return new ju3.c(r0.p(linkedHashMapP, j.a.a()), bVar2);
                }
                wi0.b bVar3 = wi0.b.t2;
                if (bVar.equals(bVar3)) {
                    Pair pair5 = new Pair(ju3.a.CHECK_B, new CreditOperationStatusCheckConfig(v.k(new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_running_credit_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_history_check_subtitle, null, null, 14)), new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_credit_offer_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_offer_check_subtitle, null, null, 14)), new CreditOperationStatusCheckConfig.SpinnerContent(new TextLocalisedClause(R$string.credit_application_credit_score_check_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_score_check_subtitle, null, null, 14))), CapturePresenter.MANUAL_FALLBACK_DELAY_MS, 7, CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, new WaitingPopupScreenConfig(new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_title, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_button_got_it, null, null, 14), new TextLocalisedClause(R$string.credit_application_credit_check_holding_info_button_turn_notifications_on, null, null, 14)), v.k(it3.f.RISK_B_PASSED, it3.f.INCOME_CHECK_SKIPPED, it3.f.INCOME_FETCH_STARTED, it3.f.INCOME_FETCH_FINISHED, it3.f.INCOME_CHECK_PASSED)));
                    ju3.a aVar7 = ju3.a.DOCUMENTS_AGREEMENTS;
                    AgreementsScreenConfig.INSTANCE.getClass();
                    Map mapK2 = r0.k(pair5, new Pair(aVar7, AgreementsScreenConfig.Companion.a()));
                    j.Companion.getClass();
                    return new ju3.c(r0.p(mapK2, j.a.a()), bVar3);
                }
                wi0.b bVar4 = wi0.b.p0;
                if (bVar.equals(bVar4)) {
                    Map mapC2 = q0.c(new Pair(ju3.a.DOCUMENTS_AGREEMENTS, new AgreementsScreenConfig(new AgreementsScreenConfig.Disclaimer(new TextLocalisedClause(R$string.loan_application_doc_sign_doc_list_uk_below_warning, null, null, 14), com.revolut.feature.credit.application.plugins.api.models.config.a.ALL_DOCUMENTS_ACCEPTED))));
                    j.Companion.getClass();
                    return new ju3.c(r0.p(mapC2, j.a.a()), bVar4);
                }
                wi0.b bVar5 = wi0.b.f297770q3;
                if (bVar.equals(bVar5)) {
                    Pair pair6 = new Pair(ju3.a.DOCUMENTS_AGREEMENTS, new AgreementsScreenConfig(new AgreementsScreenConfig.Disclaimer(new TextLocalisedClause(R$string.loan_application_doc_sign_doc_list_uk_below_warning, null, null, 14), com.revolut.feature.credit.application.plugins.api.models.config.a.ALL_DOCUMENTS_ACCEPTED)));
                    ju3.a aVar8 = ju3.a.AUTO_PAY;
                    j24.b.Companion.getClass();
                    Map mapK3 = r0.k(pair6, new Pair(aVar8, j24.b.e));
                    j.Companion.getClass();
                    return new ju3.c(r0.p(mapK3, j.a.a()), bVar5);
                }
                wi0.b bVar6 = wi0.b.L0;
                if (bVar.equals(bVar6)) {
                    Map mapC3 = q0.c(new Pair(ju3.a.DOCUMENTS_AGREEMENTS, new AgreementsScreenConfig(new AgreementsScreenConfig.Disclaimer(new TextLocalisedClause(R$string.loan_home_warning_ie, null, null, 14), com.revolut.feature.credit.application.plugins.api.models.config.a.ALWAYS))));
                    j.Companion.getClass();
                    return new ju3.c(r0.p(mapC3, j.a.a()), bVar6);
                }
                if (!bVar.equals(wi0.b.D2)) {
                    return j.b(bVar, new AgreementsScreenConfig(new AgreementsScreenConfig.Disclaimer(new TextLocalisedClause(R$string.loan_application_doc_sign_doc_list_warning, null, null, 14), com.revolut.feature.credit.application.plugins.api.models.config.a.ALL_DOCUMENTS_ACCEPTED)));
                }
                AgreementsScreenConfig.INSTANCE.getClass();
                return j.b(bVar, AgreementsScreenConfig.Companion.a());
            case 7:
                WaitingPopupScreenConfig waitingPopupScreenConfig2 = k.f180325a;
                Map mapC4 = q0.c(new Pair(ju3.a.MANUAL_UNDERWRITING, new ManualUnderwritingScreenConfig(k.f180325a, k.f180326b)));
                ju3.a aVar9 = ju3.a.DOCUMENTS_AGREEMENTS;
                AgreementsScreenConfig.INSTANCE.getClass();
                return new ju3.c(r0.p(mapC4, q0.c(new Pair(aVar9, AgreementsScreenConfig.Companion.a()))), bVar);
            case 8:
                l.Companion.getClass();
                ju3.a aVar10 = ju3.a.MANUAL_UNDERWRITING;
                j24.b.Companion.getClass();
                return new ju3.c(q0.c(new Pair(aVar10, j24.b.D)), bVar);
            case 9:
                return m.b(bVar);
            case 10:
                n.Companion.getClass();
                ju3.a aVar11 = ju3.a.MANUAL_UNDERWRITING;
                j24.b.Companion.getClass();
                Pair pair7 = new Pair(aVar11, j24.b.D);
                ju3.a aVar12 = ju3.a.DOCUMENTS_AGREEMENTS;
                AgreementsScreenConfig.INSTANCE.getClass();
                return new ju3.c(r0.k(pair7, new Pair(aVar12, AgreementsScreenConfig.Companion.a())), bVar);
            default:
                p.Companion.getClass();
                ju3.a aVar13 = ju3.a.MANUAL_UNDERWRITING;
                j24.b.Companion.getClass();
                return new ju3.c(q0.c(new Pair(aVar13, j24.b.D)), bVar);
        }
    }

    public /* synthetic */ a(o oVar, wi0.b bVar, int i) {
        this.f180320a = i;
        this.f180321b = bVar;
    }

    public /* synthetic */ a(wi0.b bVar, j jVar) {
        this.f180320a = 6;
        this.f180321b = bVar;
    }
}
