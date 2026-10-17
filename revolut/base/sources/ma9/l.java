package ma9;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.onboarding.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h(u.c(new PromptMarketingContentDelegate.Model("CONTACTS_PERMISSION_PROMPT_ID", new TextLocalisedClause(R$string.signup_registration_contacts_title, null, null, 14), new TextLocalisedClause(R$string.signup_registration_contacts_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D082", null, null, null, 30), null), null, null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.signup_registration_contacts_action_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_not_now, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, new PromptMarketingContentDelegate.Model.Footer(new TextLocalisedClause(R$string.signup_registration_contacts_footer, null, null, 14)), null, null, null, null, null, null, null, null, 2091440)));
    }
}
