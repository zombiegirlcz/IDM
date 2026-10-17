package com.revolut.kompot.common.flow.permissions;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private b() {
    }

    public static PromptMarketingContentDelegate.Model a(PermissionsFlowContract$Explanation.PromptScreen promptScreen) {
        Intrinsics.checkNotNullParameter(promptScreen, "<this>");
        Clause clause = promptScreen.f98340a;
        Clause clause2 = promptScreen.f98341b;
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(promptScreen.d, null);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button(promptScreen.f98342c, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        Clause clause3 = promptScreen.f;
        return new PromptMarketingContentDelegate.Model("PROMPT_CONTENT_LIST_ID", clause, clause2, mediaContent, null, null, promptScreen.e, null, null, button, clause3 != null ? new PromptMarketingContentDelegate.Model.Button(clause3, (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54) : null, null, null, null, null, null, null, null, null, null, null, 2095536);
    }
}
