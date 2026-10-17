package md8;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_consent.api.navigation.ConsentTypeId;
import com.revolut.feature.junior_consent.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import m9d.j1;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f204528a;

    public t(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f204528a = inputData;
    }

    public static r a(ConsentTypeId consentTypeId, String str) {
        TextLocalisedClause textLocalisedClause;
        if (consentTypeId instanceof ConsentTypeId.DataManagementConsentId) {
            int i = s.f204525a[((ConsentTypeId.DataManagementConsentId) consentTypeId).f76864b.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.junior_consent_change_data_management_login_prompt_title, null, null, 14);
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.junior_consent_change_request_prompt_title, null, null, 14);
            }
            return new r(textLocalisedClause, new TextLocalisedClause(R$string.junior_consent_change_request_prompt_subtitle, zhm.u.c(str), null, 12), new TextLocalisedClause(R$string.junior_consent_change_request_prompt_benefits, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "LINK_CLICK_ID", false), 10), new TextLocalisedClause(R$string.junior_consent_change_request_prompt_action_allow, null, null, 14), (TextLocalisedClause) null, 32);
        }
        if (consentTypeId instanceof ConsentTypeId.ConsentName) {
            switch (s.f204526b[((ConsentTypeId.ConsentName) consentTypeId).f76860a.ordinal()]) {
                case 1:
                    throw new IllegalStateException("JuniorConsentRequestPromptScreen do not support FIRST_PARTY_MARKETING yet");
                case 2:
                    throw new IllegalStateException("JuniorConsentRequestPromptScreen do not support THIRD_PARTY_MARKETING yet");
                case 3:
                    throw new IllegalStateException("JuniorConsentRequestPromptScreen do not support BLANK_CARD_DELIVERY yet");
                case 4:
                    throw new IllegalStateException("JuniorConsentRequestPromptScreen do not support FIRST_PARTY_NFC_PAYMENTS yet");
                case 5:
                    return new r(new TextLocalisedClause(R$string.junior_consent_change_request_prompt_title, null, null, 14), new TextLocalisedClause(R$string.junior_consent_change_request_prompt_subtitle, zhm.u.c(str), null, 12), new TextLocalisedClause(R$string.junior_consent_change_request_prompt_benefits, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.junior_consent_change_request_prompt_action_allow, null, null, 14), new TextLocalisedClause(R$string.junior_consent_change_request_prompt_action_not_now, null, null, 14), 1);
                case 6:
                    return new r(true, new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_prompt_title, null, null, 14), new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_prompt_subtitle, null, null, 14), new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_prompt_terms_url, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "LINK_CLICK_ID", false), 10), new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_prompt_action_allow_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_prompt_action_reject_title, null, null, 14));
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!(consentTypeId instanceof ConsentTypeId.ConsentRequestId)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = s.f204527c[((ConsentTypeId.ConsentRequestId) consentTypeId).f76862b.ordinal()];
        if (i2 == 1) {
            return new r(new TextLocalisedClause(R$string.junior_consent_change_request_prompt_title, null, null, 14), new TextLocalisedClause(R$string.junior_consent_change_request_prompt_subtitle, zhm.u.c(str), null, 12), new TextLocalisedClause(R$string.junior_consent_change_request_prompt_benefits, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.junior_consent_change_request_prompt_action_allow, null, null, 14), new TextLocalisedClause(R$string.junior_consent_change_request_prompt_action_not_now, null, null, 14), 1);
        }
        if (i2 == 2) {
            return new r(true, new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_prompt_title, null, null, 14), new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_prompt_subtitle, null, null, 14), new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_prompt_terms_url, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "LINK_CLICK_ID", false), 10), new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_prompt_action_allow_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.junior_consent_change_request_payment_link_prompt_action_reject_title, null, null, 14));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final koi.j b(r rVar) {
        boolean z = rVar.f204522a;
        TextLocalisedClause textLocalisedClause = rVar.f204524c;
        d dVar = this.f204528a;
        if (!z) {
            return new PromptContentDelegate.Model("PROMPT_LIST_ID", rVar.f204523b, textLocalisedClause, rVar.d, new ad(dVar.f204506c, false), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, rVar.e, rVar.f, null, null, LargeActionButton.ButtonStyle.f58725a, LargeActionButton.ButtonStyle.f58726b, null, false, "PRIMARY_BUTTON_LOADING_TAG", false, "SECONDARY_BUTTON_LOADING_TAG", null, null, PromptContentDelegate.Model.BackgroundType.Dialog.f53074a, null, null, null, null, null, 531995072);
        }
        TextLocalisedClause textLocalisedClause2 = rVar.f204523b;
        TextLocalisedClause textLocalisedClause3 = rVar.d;
        Clause compositeClause = textLocalisedClause3 != null ? new CompositeClause(zhm.v.k(textLocalisedClause, textLocalisedClause3), new TextClause(a0.C(m70.a.o(t0.f186434a), 2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : textLocalisedClause;
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(dVar.f204506c, null);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) rVar.e, (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, "PRIMARY_BUTTON_LOADING_TAG", 22);
        Clause clause = rVar.f;
        return new PromptMarketingContentDelegate.Model("PROMPT_LIST_ID", textLocalisedClause2, compositeClause, mediaContent, PromptMarketingContentDelegate.Model.BackgroundType.Dialog.f53101a, null, resourceImage, null, null, button, clause != null ? new PromptMarketingContentDelegate.Model.Button(clause, (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, "SECONDARY_BUTTON_LOADING_TAG", 22) : null, null, null, null, null, null, null, null, null, null, null, 2095520);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Data data;
        List listC;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data2 = domainState.f204503a;
        try {
            Object content = data2.getContent();
            if (content != null) {
                listC = zhm.u.c(b(a(this.f204528a.f204505b, (String) content)));
            } else {
                listC = null;
            }
            data = new Data(listC, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        return new f((List) iii.c.f(data, new md0.c(3), new j1(22), new ldj.g(27)));
    }
}
