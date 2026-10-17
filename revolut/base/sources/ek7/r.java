package ek7;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance.impl.R$string;
import ip0.iq;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class r {
    public static y a(i domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        t tVar = new t(new TextLocalisedClause(R$string.cfac_claim_review_claim_details_consent_title, null, null, 14), new TextLocalisedClause(R$string.cfac_claim_review_claim_details_consent_subtitle, null, null, 14), null, 28);
        boolean z = domainState.f126966j;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cfac_claim_review_claim_details_agreements_submitted_true, null, null, 14);
        iq iqVar = iq.CHECK_BUTTON;
        List listK = v.k(new InputChecklistDelegate.Model("ID_CONFIRMATION_ITEM", textLocalisedClause, z, false, null, iqVar, null, null, null, null, 0, 0, 0, 524248), new InputChecklistDelegate.Model("ID_NON_REFUNDABLE_ITEM", new TextLocalisedClause(R$string.cfac_claim_review_claim_details_agreements_non_refundable, null, null, 14), domainState.k, false, null, iqVar, null, null, null, null, 0, 0, 0, 524248), new InputChecklistDelegate.Model("ID_PRIVACY_POLICY_ITEM", new TextLocalisedClause(R$string.cfac_claim_review_claim_details_agreements_privacy_policy_text, u.c(new TextLocalisedClause(R$string.cfac_claim_review_claim_details_agreements_privacy_policy, null, new Click(30, (Integer) null, (Object) null, "ID_PRIVACY_POLICY_CLICK_CLAUSE", false), 10)), null, 12), domainState.f126967l, false, null, iqVar, null, null, null, null, 0, 0, 0, 524248));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        List list = listK;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_CLAIM_SUBMIT_BUTTON_ITEM", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.cfac_claim_review_claim_details_action_submit, null, null, 14), domainState.f126966j && domainState.k && domainState.f126967l, null, null, null, null, 968);
        yp0.b.l(model, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        return new y(d0.F0(model, list), tVar, rp0.l.WINDOW, null, null, null, 1016);
    }
}
