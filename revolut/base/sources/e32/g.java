package e32;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e(u.c(new PromptMarketingContentDelegate.Model("SUCCESS_PROMPT_ID", new TextLocalisedClause(R$string.apm_payment_confirmed_title, null, null, 14), new TextLocalisedClause(R$string.apm_payment_confirmed_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D091", null, null, null, 30), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), null, null, null, null, null, null, null, null, null, null, null, 2096560)));
    }
}
