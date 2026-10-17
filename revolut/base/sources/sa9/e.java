package sa9;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.impl.R$string;
import ip0.ak0;
import ip0.iq;
import ip0.yt;
import java.util.List;
import qv0.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    public final ListCellDelegate.Model a() {
        return new ListCellDelegate.Model("PERSONAL_AGREEMENTS", new j8(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextLocalisedClause(R$string.credit_lead_disclosure_our_agreements_title, null, null, 14), new TextLocalisedClause(R$string.credit_lead_disclosure_our_agreements_content, v.k(new TextLocalisedClause(R$string.credit_lead_disclosure_esign_consent_link, null, new Click(30, (Integer) null, (Object) null, "e_sign_link_id", false), 10), new TextLocalisedClause(R$string.lead_disclosure_cardholder_agreement_link, null, new Click(30, (Integer) null, (Object) null, "cardholder_agreement_link_id", false), 10), new TextLocalisedClause(R$string.credit_lead_disclosure_privacy_policy_link, null, new Click(30, (Integer) null, (Object) null, "PRIVACY_LINK_ID", false), 10), new TextLocalisedClause(R$string.credit_lead_disclosure_revolut_personal_terms_link, null, new Click(30, (Integer) null, (Object) null, "TERMS_LINK_ID", false), 10)), null, 12), false, null, null, 0, 0, 0, 0, 4064);
    }

    public final ListCellDelegate.Model b() {
        return new ListCellDelegate.Model("card_issuing_disclosure_id", new j8(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextLocalisedClause(R$string.credit_lead_disclosure_card_issuing_title, null, null, 14), new TextLocalisedClause(R$string.credit_lead_disclosure_card_issuing_content, u.c(new TextLocalisedClause(R$string.credit_lead_disclosure_cardholder_agreement_link, null, new Click(30, (Integer) null, (Object) null, "cardholder_agreement_link_id", false), 10)), null, 12), false, null, null, 0, 0, 0, 0, 4064);
    }

    public final ListCellDelegate.Model c() {
        return new ListCellDelegate.Model("deposit_protection_disclosure_id", new j8(new ResourceImage(R$drawable.uikit_icn_24_insurance, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextLocalisedClause(R$string.credit_lead_disclosure_deposit_protection_title, null, null, 14), new TextLocalisedClause(R$string.credit_lead_disclosure_deposit_protection_content, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
    }

    public final InputChecklistDelegate.Model d(boolean z) {
        InputChecklistDelegate.Model model = new InputChecklistDelegate.Model("country_explicit_consent_item_id", new TextLocalisedClause(R$string.credit_pcw_signup_consents_checkbox_title, null, null, 14), z, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248);
        yp0.b.l(model, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
        return model;
    }

    public final i e() {
        TextDelegate.Model model = new TextDelegate.Model("CREDIT_FOOTER", new TextLocalisedClause(R$string.credit_lead_disclosure_footer_content, v.k(new TextLocalisedClause(R$string.credit_lead_disclosure_esign_consent_link, null, new Click(30, (Integer) null, (Object) null, "e_sign_link_id", false), 10), new TextLocalisedClause(R$string.credit_lead_disclosure_lead_bank_cardholder_agreement_link, null, new Click(30, (Integer) null, (Object) null, "cardholder_agreement_link_id", false), 10), new TextLocalisedClause(R$string.credit_lead_disclosure_lead_bank_privacy_policy_link, null, new Click(30, (Integer) null, (Object) null, "PRIVACY_LINK_ID", false), 10), new TextLocalisedClause(R$string.credit_lead_disclosure_revolut_privacy_policy_link, null, new Click(30, (Integer) null, (Object) null, "PRIVACY_LINK_ID", false), 10), new TextLocalisedClause(R$string.credit_cfsb_disclosure_revolut_personal_terms_link, null, new Click(30, (Integer) null, (Object) null, "TERMS_LINK_ID", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
        yp0.b.r(model, R$attr.uikit_dp8, R$attr.uikit_dp24, 0, 0, 12);
        return model;
    }
}
