package wwj;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.impl.userauth.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    public h(pwj.b notificationsPermissionUiProvider) {
        Intrinsics.checkNotNullParameter(notificationsPermissionUiProvider, "notificationsPermissionUiProvider");
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e(u.c(new PromptMarketingContentDelegate.Model("NOTIFICATIONS_PERMISSION_PROMPT_ID", new TextLocalisedClause(R$string.general_dialog_turn_on_notifications_title2, null, null, 14), new TextLocalisedClause(R$string.general_dialog_turn_on_notifications_text2, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(LottieImage.Companion.a(LottieImage.INSTANCE, uc0.b.a("mobile/onboarding/animations", "prompt_notification"), true, false, new LottieImage.ColorOverride.TintedWithAttr(R$attr.uikit_colorForeground), null, Constants.TAG_EMV_L2_CHECKSUM), null), null, null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.general_dialog_turn_on_notifications_action_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_not_now, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, 2095536)));
    }
}
