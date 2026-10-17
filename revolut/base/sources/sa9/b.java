package sa9;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.impl.R$string;
import ip0.yt;
import java.util.List;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements d {
    @Override // sa9.d
    public final List b() {
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_lab, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        yt ytVar = yt.TOP;
        ListCellDelegate.Model model = new ListCellDelegate.Model("beta_tester_agreement_id", new j8(resourceImage, ytVar), new TextLocalisedClause(R$string.terms_beta_tester_agreement_title, null, null, 14), new TextLocalisedClause(R$string.terms_beta_tester_agreement_description, u.c(new TextLocalisedClause(R$string.terms_link_beta_tester_agreement, null, new Click(30, (Integer) null, (Object) null, "beta_tester_agreement_link_id", false), 10)), null, 12), false, null, null, 0, 0, 0, 0, 4064);
        yp0.b.l(model, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, null, false, 60);
        List listC = u.c(model);
        List listK = v.k(new ListCellDelegate.Model("in_our_agreements_disclosure_id", new j8(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.terms_our_agreement_title, null, null, 14), new TextLocalisedClause(R$string.terms_our_agreement_description, v.k(new TextLocalisedClause(R$string.terms_link_agreement, null, new Click(30, (Integer) null, (Object) null, "cardholder_agreement_link_id", false), 10), new TextLocalisedClause(R$string.terms_link_terms_and_conditions, null, new Click(30, (Integer) null, (Object) null, "TERMS_LINK_ID", false), 10), new TextLocalisedClause(R$string.terms_link_privacy_policy, null, new Click(30, (Integer) null, (Object) null, "PRIVACY_LINK_ID", false), 10)), null, 12), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("in_partner_bank_agreement_id", new j8(new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.terms_partner_bank_agreement_title, null, null, 14), new TextLocalisedClause(R$string.terms_partner_bank_agreement_description, u.c(new TextLocalisedClause(R$string.terms_link_travel_card, null, new Click(30, (Integer) null, (Object) null, "travel_card_link_id", false), 10)), null, 12), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("in_declaration_disclosure_id", new j8(new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.terms_declaration_title, null, null, 14), new TextLocalisedClause(R$string.terms_declaration_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4064));
        yp0.b.k(listK, R$attr.uikit_dp0, R$attr.uikit_dp32, 0, 0, 28);
        return d0.E0(listK, listC);
    }

    @Override // sa9.d
    public final List c(boolean z) {
        return f0.f322471a;
    }

    @Override // sa9.d
    public final List d() {
        return f0.f322471a;
    }
}
