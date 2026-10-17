package x3a;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.who_to_transfer.impl.R$plurals;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.contact_notify_prompt_title, null, null, 14);
        Integer num = domainState.f302717a;
        return new i(u.c(new PromptMarketingContentDelegate.Model("TEXT_LIST_ID", textLocalisedClause, num != null ? new TextLocalisedQuantityClause(R$plurals.onboarding_contact_notify_prompt_subtitle, num, u.c(num), (Style) null, 24) : new TextLocalisedClause(R$string.onboarding_contact_notify_prompt_subtitle_no_friends_count, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D211", null, null, null, 30), null), null, null, domainState.f302718b ? new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.payments_notify_friends_action_notify, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "PRIMARY_BUTTON_TAG", 30), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_not_now, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "SECONDARY_BUTTON_TAG", 30), null, null, null, null, null, null, null, null, null, null, 2095536)));
    }
}
