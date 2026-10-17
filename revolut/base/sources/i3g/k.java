package i3g;

import aw0.o9;
import bjl.p0;
import c03.q;
import ch.qos.logback.core.CoreConstants;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import com.revolut.feature.junior.account_activation.impl.ui.screen.terms_conditions.TermsAndConditionsDetailsScreenContract$InputData;
import com.revolut.feature.junior_core.models.configuration.Links;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.push_to_card.api.model.AdditionalFieldOption;
import com.revolut.feature.push_to_card.api.model.TextFieldContent;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.model.AdditionalFieldInput;
import ip0.kr;
import ip0.lr;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import pqa.l;
import q35.g0;
import rh8.m;
import yp0.r;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zph.p;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158220a = 14;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f158221b;

    public k(i5b.k settingsMapper) {
        Intrinsics.checkNotNullParameter(settingsMapper, "settingsMapper");
        this.f158221b = settingsMapper;
    }

    private final o a(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        ProductSelectionDelegate.Model modelB;
        List listC;
        ProductSelectionDelegate.Model modelA;
        int i;
        int i2;
        ProductSelectionDelegate.Model model;
        int i3;
        int i5;
        int i6;
        int i21;
        o85.d domainState = (o85.d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LoanDetails loanDetails = domainState.f222935a;
        Loan loan = loanDetails.f70144a;
        LoanState loanState = loan.i;
        if ((loanState instanceof LoanState.Terminated) || (loanState instanceof LoanState.Cancelled) || (loanState instanceof LoanState.Forbearance) || (loanState instanceof LoanState.Planned) || (loanState instanceof LoanState.Repaid) || (loanState instanceof LoanState.Healthy)) {
            textLocalisedClause = new TextLocalisedClause(R$string.loan_management_repayment_type_picker_header_title_healthy, null, null, 14);
        } else {
            if (!(loanState instanceof LoanState.Outstanding) && !(loanState instanceof LoanState.Overdue)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.loan_management_repayment_type_picker_header_title_unhealthy, null, null, 14);
        }
        LoanState state = loan.i;
        b95.a product = loan.o;
        boolean z = state instanceof LoanState.Terminated;
        if (z || (state instanceof LoanState.Cancelled) || (state instanceof LoanState.Planned) || (state instanceof LoanState.Forbearance) || (state instanceof LoanState.Repaid) || (state instanceof LoanState.Healthy)) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_repayment_type_picker_header_subtitle_healthy, null, null, 14);
        } else {
            if (!(state instanceof LoanState.Outstanding) && !(state instanceof LoanState.Overdue)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_repayment_type_picker_header_subtitle_unhealthy, null, null, 14);
        }
        o85.g gVar = new o85.g(textLocalisedClause, textLocalisedClause2);
        aim.e eVarB = u.b();
        p85.f fVar = (p85.f) this.f158221b;
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        boolean z3 = state instanceof LoanState.Outstanding;
        if (z3) {
            ProductSelectionDelegate.Model model2 = new ProductSelectionDelegate.Model("PARTIAL_REPAYMENT_ITEM_ID", p85.b.a(R$drawable.uikit_icn_24_exclamation_triangle), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_outstanding_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_outstanding_subtitle, u.c(sx4.f.b(3, null, null, ((LoanState.Outstanding) state).f70190a)), null, 12), null, null, null, false, false, false, 1008);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model2);
        } else if (state instanceof LoanState.Overdue) {
            ProductSelectionDelegate.Model model3 = new ProductSelectionDelegate.Model("PARTIAL_REPAYMENT_ITEM_ID", p85.b.a(R$drawable.uikit_icn_24_exclamation_triangle), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_overdue_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_overdue_subtitle, u.c(sx4.f.b(3, null, null, ((LoanState.Overdue) state).f70193a)), null, 12), null, null, null, false, false, false, 1008);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model3);
        } else if (z) {
            ProductSelectionDelegate.Model model4 = new ProductSelectionDelegate.Model("PARTIAL_REPAYMENT_ITEM_ID", p85.b.a(R$drawable.uikit_icn_24_exclamation_triangle), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_terminated_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_terminated_subtitle, u.c(sx4.f.b(3, null, null, ((LoanState.Terminated) state).f70198a)), null, 12), null, null, null, false, false, false, 1008);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model4);
        } else if (state instanceof LoanState.Cancelled) {
            ProductSelectionDelegate.Model model5 = new ProductSelectionDelegate.Model("PARTIAL_REPAYMENT_ITEM_ID", p85.b.a(R$drawable.uikit_icn_24_exclamation_triangle), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_cancelled_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_cancelled_subtitle, u.c(sx4.f.b(3, null, null, ((LoanState.Cancelled) state).f70185a)), null, 12), null, null, null, false, false, false, 1008);
            yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model5);
        } else {
            if (!(state instanceof LoanState.Forbearance) && !(state instanceof LoanState.Planned) && !(state instanceof LoanState.Repaid) && !(state instanceof LoanState.Healthy)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = loanDetails.f70152n.d;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                p85.a aVar = fVar.f233867a;
                wi0.b countryCode = loan.f70112h;
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                o85.e eVar = (!aVar.f233861a.contains(countryCode) && aVar.f233862b.contains(countryCode)) ? o85.e.ReduceRepayments : o85.e.ReduceTerm;
                int i22 = p85.e.f233865b[eVar.ordinal()];
                if (i22 == 1) {
                    modelB = p85.f.b(product);
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modelB = p85.f.a();
                }
                listC = u.c(modelB);
            } else {
                List list3 = list;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    int i32 = p85.e.f233864a[((g0) it8.next()).ordinal()];
                    if (i32 == 1) {
                        modelA = p85.f.a();
                    } else if (i32 == 2) {
                        modelA = p85.f.b(product);
                    } else {
                        if (i32 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modelA = new ProductSelectionDelegate.Model("EARLY_REPAYMENT_ITEM_ID", p85.b.a(R$drawable.uikit_icn_24_calendar_recurring), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_healthy_loan_early_repayment_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_repayment_type_picker_payment_type_healthy_loan_early_repayment_subtitle, null, null, 14), null, null, null, false, false, false, 1008);
                        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                    }
                    arrayList.add(modelA);
                }
                listC = arrayList;
            }
        }
        eVarB.addAll(listC);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(product, "product");
        if (z3 || (state instanceof LoanState.Overdue)) {
            int[] iArr = p85.c.f233863a;
            int i33 = iArr[product.ordinal()];
            if (i33 == 1 || i33 == 2) {
                i = R$string.loan_management_repayment_type_picker_payment_type_settlement_unhealthy_loan_title;
            } else {
                if (i33 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.loan_management_repayment_type_picker_payment_type_settlement_unhealthy_mortgage_title;
            }
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i, null, null, 14);
            int i43 = iArr[product.ordinal()];
            if (i43 == 1 || i43 == 2) {
                i2 = R$string.loan_management_repayment_type_picker_payment_type_settlement_unhealthy_loan_subtitle;
            } else {
                if (i43 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.loan_management_repayment_type_picker_payment_type_settlement_unhealthy_mortgage_subtitle;
            }
            model = new ProductSelectionDelegate.Model("FULL_REPAYMENT_ITEM_ID", p85.b.a(R$drawable.uikit_icn_24_loan_checked), textLocalisedClause3, new TextLocalisedClause(i2, null, null, 14), null, null, null, false, false, false, 1008);
        } else if (z || (state instanceof LoanState.Cancelled)) {
            int[] iArr2 = p85.c.f233863a;
            int i59 = iArr2[product.ordinal()];
            if (i59 == 1 || i59 == 2) {
                i3 = R$string.loan_management_repayment_type_picker_payment_type_settlement_cancelled_loan_title;
            } else {
                if (i59 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R$string.loan_management_repayment_type_picker_payment_type_settlement_cancelled_mortgage_title;
            }
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i3, null, null, 14);
            int i66 = iArr2[product.ordinal()];
            if (i66 == 1 || i66 == 2) {
                i5 = R$string.loan_management_repayment_type_picker_payment_type_settlement_cancelled_loan_subtitle;
            } else {
                if (i66 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = R$string.loan_management_repayment_type_picker_payment_type_settlement_cancelled_mortgage_subtitle;
            }
            model = new ProductSelectionDelegate.Model("FULL_REPAYMENT_ITEM_ID", p85.b.a(R$drawable.uikit_icn_24_loan_checked), textLocalisedClause4, new TextLocalisedClause(i5, null, null, 14), null, null, null, false, false, false, 1008);
        } else {
            if (!(state instanceof LoanState.Forbearance) && !(state instanceof LoanState.Planned) && !(state instanceof LoanState.Repaid) && !(state instanceof LoanState.Healthy)) {
                throw new NoWhenBranchMatchedException();
            }
            int[] iArr3 = p85.c.f233863a;
            int i74 = iArr3[product.ordinal()];
            if (i74 == 1 || i74 == 2) {
                i6 = R$string.loan_management_repayment_type_picker_payment_type_settlement_healthy_loan_title;
            } else {
                if (i74 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i6 = R$string.loan_management_repayment_type_picker_payment_type_settlement_healthy_mortgage_title;
            }
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(i6, null, null, 14);
            int i92 = iArr3[product.ordinal()];
            if (i92 == 1 || i92 == 2) {
                i21 = R$string.loan_management_repayment_type_picker_payment_type_settlement_healthy_loan_subtitle;
            } else {
                if (i92 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i21 = R$string.loan_management_repayment_type_picker_payment_type_settlement_healthy_mortgage_subtitle;
            }
            model = new ProductSelectionDelegate.Model("FULL_REPAYMENT_ITEM_ID", p85.b.a(R$drawable.uikit_icn_24_loan_checked), textLocalisedClause5, new TextLocalisedClause(i21, null, null, 14), null, null, null, false, false, false, 1008);
        }
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        return new o85.h(gVar, u.a(eVarB));
    }

    private final o b(cli.j jVar) {
        Clause textClause;
        mek.g domainState = (mek.g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        oek.a aVar = (oek.a) this.f158221b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f204700a;
        mek.h hVar = domainState.d;
        InputTextDelegate.Model model = new InputTextDelegate.Model("INPUT_FIRST_NAME_ID", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_add_input_name, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, true, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("INPUT_LAST_NAME_ID", new TextClause(domainState.f204701b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_add_input_last_name, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, true, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        LocalDate localDate = domainState.e;
        if (localDate != null) {
            textClause = new TimeClause(ebm.a.P(localDate), TimeClause.Format.DateEditable.f57960b, null, null, 12);
        } else {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("INPUT_DOB_ID", textClause, new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_add_input_dop, null, null, 14), null, false, null, null, null, null, null, null, false, null, null, false, false, 2, 0, null, true, false, null, false, null, false, false, false, null, null, 0, -35651592, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model4 = new InputTextDelegate.Model("INPUT_EMAIL_ID", new TextClause(domainState.f204702c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_add_input_email, null, null, 14), null, false, hVar.f204706b ? new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_add_input_email_hint_optional, null, null, 14) : null, null, null, null, null, null, false, null, null, !hVar.f204706b, false, 32, 0, null, true, false, null, false, null, false, false, false, null, null, 0, -304218248, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model5 = new RowDelegate.Model("USE_MY_ADDRESS_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_utilities, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_add_input_address_toggle, null, null, 14), null, 0, null, null, null, 0, new vf(domainState.f, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832);
        yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
        koi.j[] elements = {model, model2, model3, model4, !aVar.f224614a.f102589a.getF102594b() ? model5 : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new mek.k(kotlin.collections.d.L(elements), new mek.i(new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_add_header_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_add_header_subtitle, null, null, 14)), domainState.f204703g);
    }

    private final o d(cli.j jVar) {
        RowDelegate.Model modelA;
        TextLocalisedClause textLocalisedClause;
        p68.e domainState = (p68.e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        OnboardingTerms onboardingTerms = domainState.f233226a;
        RowDelegate.Model modelA2 = m.a(R$drawable.uikit_icn_24_shield, new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_signup_details_confirmation_us_terms_and_conditions_consent_header, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_signup_details_confirmation_us_terms_and_conditions_consent_description, null, null, 14), "DATA_CONSENT_ID");
        RowDelegate.Model modelA3 = m.a(R$drawable.uikit_icn_24_statement, new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_signup_details_confirmation_us_terms_and_conditions_collection_header, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_signup_details_confirmation_us_terms_and_conditions_collection_description, null, null, 14), "DATA_COLLECTION_ID");
        if (onboardingTerms == null || !onboardingTerms.f76954a) {
            modelA = null;
        } else {
            String str = onboardingTerms.f76956c.f76908c;
            if (str == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Deposit terms are null for the US user");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
            modelA = m.a(R$drawable.uikit_icn_24_insurance, new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_signup_details_confirmation_us_terms_and_conditions_deposit_protection_header, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_signup_details_confirmation_us_terms_and_conditions_deposit_protection_description, u.c(new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_signup_details_confirmation_us_terms_and_conditions_deposit_protection_link_fdic_prepaid_card, null, new Click(28, (Integer) null, (Object) str, "DATA_DEPOSIT_CLICK_ID", false), 10)), null, 12), "DATA_DEPOSIT_ID");
        }
        qv0.i[] elements = {modelA2, modelA3, modelA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_signup_details_confirmation_us_terms_and_conditions_header, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        OnboardingTerms onboardingTerms2 = domainState.f233226a;
        if (onboardingTerms2 != null) {
            Links links = onboardingTerms2.f76956c;
            Intrinsics.checkNotNullParameter(onboardingTerms2, "onboardingTerms");
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_signup_details_confirmation_terms_acceptance_us_format, v.k(new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_signup_details_confirmation_us_privacy_statement, null, new Click(28, (Integer) null, (Object) links.f76907b, "ID_CLAUSE_PRIVACY_STATEMENT", false), 10), new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.rev_u18_signup_details_confirmation_cardholder_terms, null, new Click(28, (Integer) null, (Object) links.f76906a, "ID_CLAUSE_CARD_HOLDER_TERMS", false), 10)), null, 12);
        } else {
            textLocalisedClause = null;
        }
        return new p68.g(listL, resourceImage, textLocalisedClause2, textLocalisedClause, ((TermsAndConditionsDetailsScreenContract$InputData) this.f158221b).f76696a);
    }

    private final o e(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        pm9.d domainState = (pm9.d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f237485b, new pj9.n(23), new pj9.m(15), new ox2.d(this, domainState, 15));
        PayeesFlowType payeesFlowType = domainState.f237484a;
        boolean z = payeesFlowType instanceof PayeesFlowType.RequireAuthentication;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_requires_authentication_title, null, null, 14);
        } else {
            if (!(payeesFlowType instanceof PayeesFlowType.Blocked)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_blocked_title, null, null, 14);
        }
        if (z) {
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_requires_authentication_subtitle, null, null, 14);
        } else {
            if (!(payeesFlowType instanceof PayeesFlowType.Blocked)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_blocked_subtitle, null, null, 14);
        }
        return new pm9.e(textLocalisedClause, textLocalisedClause2, list);
    }

    private final o f(cli.j jVar) {
        boolean z;
        sqa.c cVar;
        InputTextDelegate.Model modelA;
        String string;
        pqa.i domainState = (pqa.i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        sqa.c cVar2 = (sqa.c) this.f158221b;
        List fieldInputs = domainState.f238709a;
        Intrinsics.checkNotNullParameter(fieldInputs, "fieldInputs");
        List<AdditionalFieldInput> list = fieldInputs;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (AdditionalFieldInput additionalFieldInput : list) {
            if (additionalFieldInput instanceof AdditionalFieldInput.TextInput) {
                sqa.e eVar = cVar2.f265035a;
                AdditionalFieldInput.TextInput field = (AdditionalFieldInput.TextInput) additionalFieldInput;
                Intrinsics.checkNotNullParameter(field, "field");
                String strA = sqa.a.a(field);
                boolean zA = eVar.f265036a.a(strA);
                uqa.b bVar = field.e;
                TextFieldContent textFieldContent = field.f81563b;
                boolean z3 = bVar == uqa.b.InvalidFilled || (!zA && bVar == uqa.b.Invalid);
                TextClause textClause = new TextClause(field.f81564c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str = textFieldContent.d;
                String str2 = textFieldContent.e;
                TextClause textClause2 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                if (str2 != null) {
                    StringBuilder sb6 = new StringBuilder();
                    int i = 0;
                    boolean z4 = false;
                    while (i < str2.length()) {
                        char cCharAt = str2.charAt(i);
                        Character[] elements = {Character.valueOf(CoreConstants.CURLY_LEFT), Character.valueOf(CoreConstants.CURLY_RIGHT)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        sqa.c cVar3 = cVar2;
                        if (kotlin.collections.d.y0(elements).contains(Character.valueOf(cCharAt))) {
                            Unit unit = Unit.f186387a;
                        } else if (cCharAt == '[') {
                            Unit unit2 = Unit.f186387a;
                            z4 = true;
                        } else if (cCharAt == ']') {
                            Unit unit3 = Unit.f186387a;
                            z4 = false;
                        } else if (z4) {
                            Character[] elements2 = {'0', '9'};
                            Intrinsics.checkNotNullParameter(elements2, "elements");
                            if (kotlin.collections.d.y0(elements2).contains(Character.valueOf(cCharAt))) {
                                sb6.append("#");
                            } else {
                                Character[] elements3 = {'A', 'a'};
                                Intrinsics.checkNotNullParameter(elements3, "elements");
                                if (kotlin.collections.d.y0(elements3).contains(Character.valueOf(cCharAt))) {
                                    sb6.append("X");
                                } else {
                                    Character[] elements4 = {Character.valueOf(CoreConstants.DASH_CHAR), '_'};
                                    Intrinsics.checkNotNullParameter(elements4, "elements");
                                    if (kotlin.collections.d.y0(elements4).contains(Character.valueOf(cCharAt))) {
                                        sb6.append("∗");
                                    } else if (cCharAt == 8230) {
                                        m70.a.t(t0.f186434a);
                                        sb6.append(" ");
                                        sb6.append(cCharAt);
                                    } else {
                                        sb6.append((char) 8727);
                                    }
                                }
                            }
                        } else {
                            sb6.append(cCharAt);
                        }
                        i++;
                        cVar2 = cVar3;
                    }
                    cVar = cVar2;
                    string = sb6.toString();
                } else {
                    cVar = cVar2;
                    string = null;
                }
                modelA = new InputTextDelegate.Model(strA, textClause, textClause2, string != null ? new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, str2 != null, null, false, z3 ? new TextLocalisedClause(com.revolut.feature.push_to_card.impl.R$string.push2card_new_recipient_error_mask_validation, null, null, 14) : null, null, null, null, null, null, false, null, null, z3, false, false, false, textFieldContent.f81520b ? kr.f165065a : new lr(1), 0, null, null, false, zA, null, null, true, f0.f322471a, false, false, null, false, false, 0, false, false, null, field, null, null, 0, R$attr.uikit_dp8, 0, 0, -1679949984, 56831);
                yp0.b.l(modelA, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, null, false, 60);
            } else {
                cVar = cVar2;
                if (!(additionalFieldInput instanceof AdditionalFieldInput.DropdownInput)) {
                    throw new NoWhenBranchMatchedException();
                }
                AdditionalFieldInput.DropdownInput field2 = (AdditionalFieldInput.DropdownInput) additionalFieldInput;
                Intrinsics.checkNotNullParameter(field2, "field");
                String strA2 = sqa.a.a(field2);
                AdditionalFieldOption additionalFieldOption = field2.f81561c;
                modelA = r.a(new InputTextDelegate.Model(strA2, additionalFieldOption != null ? new TextClause(additionalFieldOption.f81508b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextClause(field2.f81560b.f81517b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, field2, null, null, 0, R$attr.uikit_dp8, 0, 0, -131216, 56831));
                yp0.b.l(modelA, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, null, false, 60);
            }
            arrayList.add(modelA);
            cVar2 = cVar;
        }
        List fieldInputs2 = domainState.f238709a;
        Intrinsics.checkNotNullParameter(fieldInputs2, "fieldInputs");
        if (fieldInputs2.isEmpty()) {
            z = false;
            break;
        }
        List<AdditionalFieldInput> list2 = fieldInputs2;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (AdditionalFieldInput additionalFieldInput2 : list2) {
                if (!(additionalFieldInput2 instanceof AdditionalFieldInput.TextInput)) {
                    if (!(additionalFieldInput2 instanceof AdditionalFieldInput.DropdownInput)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((AdditionalFieldInput.DropdownInput) additionalFieldInput2).f81561c == null) {
                        z = false;
                        break;
                    }
                } else {
                    if (((AdditionalFieldInput.TextInput) additionalFieldInput2).e != uqa.b.Valid) {
                        z = false;
                        break;
                    }
                }
            }
        }
        z = true;
        return new l(arrayList, new pqa.h(z));
    }

    public static TextLocalisedClause g(String str) {
        return new TextLocalisedClause(R$string.credit_application_constructor_tabbed_content_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v8 ??, still in use, count: 1, list:
          (r15v8 ?? I:qv0.n) from 0x0513: INVOKE (r15v8 ?? I:qv0.n), (r16v4 ?? I:int), (r17v2 ?? I:int), (r18v1 ?? I:int), (r19v2 ?? I:int), (r20v2 ?? I:int) STATIC call: yp0.b.r(qv0.n, int, int, int, int, int):void A[MD:(qv0.n, int, int, int, int, int):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // cli.n
    public final cli.o c(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v8 ??, still in use, count: 1, list:
          (r15v8 ?? I:qv0.n) from 0x0513: INVOKE (r15v8 ?? I:qv0.n), (r16v4 ?? I:int), (r17v2 ?? I:int), (r18v1 ?? I:int), (r19v2 ?? I:int), (r20v2 ?? I:int) STATIC call: yp0.b.r(qv0.n, int, int, int, int, int):void A[MD:(qv0.n, int, int, int, int, int):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r87v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    public k(qjg.g itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f158221b = itemsMapper;
    }

    public k(r1g.c upcomingBookingItemMapper) {
        Intrinsics.checkNotNullParameter(upcomingBookingItemMapper, "upcomingBookingItemMapper");
        this.f158221b = upcomingBookingItemMapper;
    }

    public k(q contentProvider) {
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        this.f158221b = contentProvider;
    }

    public k(TermsAndConditionsDetailsScreenContract$InputData inputData, lh8.a juniorExtendedTermsMapperInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorExtendedTermsMapperInteractor, "juniorExtendedTermsMapperInteractor");
        this.f158221b = inputData;
    }

    public k(a reviewsItemMapper) {
        Intrinsics.checkNotNullParameter(reviewsItemMapper, "reviewsItemMapper");
        this.f158221b = reviewsItemMapper;
    }

    public k(lxi.b itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f158221b = itemsMapper;
    }

    public k(mzb.c learnItemMapper) {
        Intrinsics.checkNotNullParameter(learnItemMapper, "learnItemMapper");
        this.f158221b = learnItemMapper;
    }

    public k(ny5.j mapper, CryptoSortingPickerInputData inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f158221b = inputData;
    }

    public k(p optionsMapper) {
        Intrinsics.checkNotNullParameter(optionsMapper, "optionsMapper");
        this.f158221b = optionsMapper;
    }

    public k(oll.e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f158221b = inputData;
    }

    public k(i79.c inboxListItemMapper) {
        Intrinsics.checkNotNullParameter(inboxListItemMapper, "inboxListItemMapper");
        this.f158221b = inboxListItemMapper;
    }

    public k(oek.a itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f158221b = itemsMapper;
    }

    public k(sqa.c fieldsMapper, vqa.a validator) {
        Intrinsics.checkNotNullParameter(fieldsMapper, "fieldsMapper");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f158221b = fieldsMapper;
    }

    public k(nd.m groupEmailMapper, nd.n groupPhoneMapper, jpc.e interactor) {
        Intrinsics.checkNotNullParameter(groupEmailMapper, "groupEmailMapper");
        Intrinsics.checkNotNullParameter(groupPhoneMapper, "groupPhoneMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f158221b = interactor;
    }

    public k(x03.f itemsProvider) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        this.f158221b = itemsProvider;
    }

    public k(p85.f loanRepaymentTypePartialRepaymentItemMapper, p85.d loanRepaymentTypeFullRepaymentItemMapper) {
        Intrinsics.checkNotNullParameter(loanRepaymentTypePartialRepaymentItemMapper, "loanRepaymentTypePartialRepaymentItemMapper");
        Intrinsics.checkNotNullParameter(loanRepaymentTypeFullRepaymentItemMapper, "loanRepaymentTypeFullRepaymentItemMapper");
        this.f158221b = loanRepaymentTypePartialRepaymentItemMapper;
    }

    public k(vn8.f juniorPlanProductMapper) {
        Intrinsics.checkNotNullParameter(juniorPlanProductMapper, "juniorPlanProductMapper");
        this.f158221b = juniorPlanProductMapper;
    }

    public k(l7b.b itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f158221b = itemsMapper;
    }

    public k(lnk.b itemsProvider) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        this.f158221b = itemsProvider;
    }

    public k(nob.a automationsContentMapper) {
        Intrinsics.checkNotNullParameter(automationsContentMapper, "automationsContentMapper");
        this.f158221b = automationsContentMapper;
    }

    public k(ry6.b itemMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f158221b = itemMapper;
    }

    public k(DebtDetailsControllerContract$InputData inputData, l94.a fieldMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(fieldMapper, "fieldMapper");
        this.f158221b = inputData;
    }

    public k(km9.g paymentRecipientMapper) {
        Intrinsics.checkNotNullParameter(paymentRecipientMapper, "paymentRecipientMapper");
        this.f158221b = paymentRecipientMapper;
    }

    public k(mzd.b productSectionMapper) {
        Intrinsics.checkNotNullParameter(productSectionMapper, "productSectionMapper");
        this.f158221b = productSectionMapper;
    }

    public k(p0 revolutSsoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        this.f158221b = ((rqk.k) revolutSsoDependenciesProvider).f256588h;
    }

    public k(nd.n sectionsMapper, qbc.a itemMapper) {
        Intrinsics.checkNotNullParameter(sectionsMapper, "sectionsMapper");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f158221b = sectionsMapper;
    }

    public k(v7b.f summaryItemsMapper, v7b.e transactionItemsMapper) {
        Intrinsics.checkNotNullParameter(summaryItemsMapper, "summaryItemsMapper");
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        this.f158221b = transactionItemsMapper;
    }

    public k(w74.a tabScreenUIContentMapper, ix4.b checkboxValidator) {
        Intrinsics.checkNotNullParameter(tabScreenUIContentMapper, "tabScreenUIContentMapper");
        Intrinsics.checkNotNullParameter(checkboxValidator, "checkboxValidator");
        this.f158221b = tabScreenUIContentMapper;
    }

    public k(yik.g pricingPlanAvatarMapper, dl3.f contactsMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanAvatarMapper, "pricingPlanAvatarMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f158221b = contactsMapper;
    }
}
