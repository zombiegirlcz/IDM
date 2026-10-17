package d7d;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.shared.consent.prompt.builder.api.model.ConsentPromptData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements p {
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ConsentPromptData consentPromptData = domainState.f111922a;
        Clause clause = consentPromptData.f86087b;
        Clause clause2 = consentPromptData.f86088c;
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button(consentPromptData.e, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        ConsentPromptData consentPromptData2 = domainState.f111922a;
        return new g(u.c(new PromptMarketingContentDelegate.Model("PROMPT_CONTENT_DELEGATE_SCREEN", clause, clause2, new PromptMarketingContentDelegate.Model.Content.MediaContent(consentPromptData2.d, null), null, null, consentPromptData2.k, null, null, button, new PromptMarketingContentDelegate.Model.Button(consentPromptData2.f, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, 2095536)));
    }
}
