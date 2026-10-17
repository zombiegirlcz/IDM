package ew2;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.nd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.retail.common.ui.R$string;

/* JADX INFO: loaded from: classes21.dex */
public final class w implements cli.n {
    public static PromptMarketingContentDelegate.Model.Content.MediaContent a(Image image) {
        if (image != null) {
            return new PromptMarketingContentDelegate.Model.Content.MediaContent(image, nd.LINEAR_REVEAL);
        }
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        return new PromptMarketingContentDelegate.Model.Content.MediaContent(new TextImage("", 0, 0, 0, 0, 0, 206), null);
    }

    public static PromptMarketingContentDelegate.Model b(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, Image image, ResourceImage resourceImage) {
        return new PromptMarketingContentDelegate.Model("PROMPT_ID", textLocalisedClause, textLocalisedClause2, a(image), null, null, resourceImage, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.common_action_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), null, null, null, null, null, null, null, null, null, null, null, 2096560);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r34) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ew2.w.c(cli.j):cli.o");
    }
}
