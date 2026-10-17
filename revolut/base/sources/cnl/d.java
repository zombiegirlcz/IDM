package cnl;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.sso.api.R$string;
import jki.i;
import jki.j;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements p {
    @Override // jki.p
    public final m a(i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new b(u.c(new PromptMarketingContentDelegate.Model("FACE_CHALLENGE_PROMPT_ID", new TextLocalisedClause(R$string.revolut_sso_login_biometry_check_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_biometry_check_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d007", null, null, null, 30), null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097072)));
    }
}
