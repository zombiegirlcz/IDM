package pk8;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_progression.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        Clause textClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_progression_prompt_title, null, null, 14);
        Integer num = domainState.f236938a;
        if (num != null) {
            textClause = new TextLocalisedClause(R$string.junior_progression_prompt_subtitle, u.c(String.valueOf(num.intValue())), null, 12);
        } else {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new h(u.c(new PromptMarketingContentDelegate.Model("JUNIOR_PROGRESSION_PROMPT", textLocalisedClause, textClause, new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D171", null, null, null, 30), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.junior_progression_prompt_cta, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "JUNIOR_PROGRESSION_PROMPT_SUBMIT_LOADING_TAG", 30), null, null, null, null, null, null, null, null, null, null, null, 2096560)));
    }
}
