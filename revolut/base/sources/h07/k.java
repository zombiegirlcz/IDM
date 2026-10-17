package h07;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_business_email_verification_prompt_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_business_email_verification_prompt_subtitle, u.c(domainState.f148196a), null, 12);
        ad adVar = new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30), false);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.freelancer_business_email_verification_prompt_action_go_to_inbox, null, null, 14);
        LargeActionButton.ButtonStyle.FlatButton flatButton = LargeActionButton.ButtonStyle.o;
        long j2 = domainState.f148197b;
        return new g(u.c(new PromptContentDelegate.Model("ITEM_ID_CHECK_EMAIL_PROMPT", textLocalisedClause, textLocalisedClause2, null, adVar, resourceImage, null, null, false, textLocalisedClause3, j2 == 0 ? new TextLocalisedClause(R$string.freelancer_business_email_verification_prompt_action_resend_code, null, null, 14) : new TextLocalisedClause(R$string.freelancer_business_email_verification_prompt_action_resend_code_in, u.c(Long.valueOf(j2)), null, 12), null, null, defaultFilledButton, flatButton, null, false, null, j2 == 0, null, null, null, null, null, null, null, null, null, 536582600)));
    }
}
