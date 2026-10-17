package tol;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.sso.api.R$string;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements p {
    @Override // jki.p
    public final m a(i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f(u.c(new PromptMarketingContentDelegate.Model("PromptId", new TextLocalisedClause(R$string.disabled_passcode_assistant_title, null, null, 14), new TextLocalisedClause(R$string.disabled_passcode_assistant_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D083", null, null, null, 30), null), null, null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.common_action_open_settings_app, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560)));
    }
}
