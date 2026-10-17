package mm5;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.tfr.validation.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l(u.c(new PromptMarketingContentDelegate.Model("actionRequiredListId", new TextLocalisedClause(R$string.crypto_tfr_validation_action_required_popup_title, null, null, 14), new TextLocalisedClause(R$string.crypto_tfr_validation_action_required_popup_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(new LayeredImage(u.c(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_wallet, (Integer) null, 12.0f, 12.0f, 12.0f, 12.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 66)), (Float) null, (Float) null, 14), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.crypto_tfr_validation_action_required_popup_main_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "ACTION_BUTTON_TAG", 30), null, null, null, null, null, null, null, new TextLocalisedClause(R$string.crypto_tfr_validation_action_required_popup_link_title, null, null, 14), null, null, null, 1965488)));
    }
}
