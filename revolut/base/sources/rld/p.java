package rld;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.md;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import com.revolut.feature.slot_manager.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tld.d f255030a;

    public p(tld.d promptMarketingContentMapper) {
        Intrinsics.checkNotNullParameter(promptMarketingContentMapper, "promptMarketingContentMapper");
        this.f255030a = promptMarketingContentMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Media urlImage;
        PromptMarketingContentDelegate.Model.Content backgroundMediaContent;
        PromptMarketingContentDelegate.Model.BackgroundType backgroundType;
        pd pdVar;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SlotDefaultPrompt prompt = domainState.f255018a;
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        SlotDefaultPrompt.Content content = prompt.f87320b;
        tld.b bVar = this.f255030a.f272051a;
        SlotDefaultPrompt.BackgroundMedia backgroundMedia = content.f;
        List list = content.f87330g;
        SlotDefaultPrompt.LayoutType layoutType = content.d;
        boolean z = layoutType != SlotDefaultPrompt.LayoutType.MODAL_STORY;
        Intrinsics.checkNotNullParameter(backgroundMedia, "backgroundMedia");
        String str = bVar.f272049a.d() ? backgroundMedia.f87324a : backgroundMedia.f87325b;
        int i = tld.a.f272048a[uld.b.a(str).ordinal()];
        if (i == 1) {
            urlImage = new UrlImage(str, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            urlImage = new UrlVideo(str, (String) null, z, oz0.b.CENTER_CROP, false, (oz0.c) null, 114);
        }
        TextClause textClause = new TextClause(content.f87327a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(content.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i2 = layoutType == null ? -1 : tld.c.f272050a[layoutType.ordinal()];
        if (i2 == -1 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            backgroundMediaContent = new PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent(urlImage);
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            backgroundMediaContent = new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(urlImage, null, null, 6);
        }
        int i3 = layoutType == null ? -1 : tld.c.f272050a[layoutType.ordinal()];
        if (i3 == -1 || i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
            backgroundType = PromptMarketingContentDelegate.Model.BackgroundType.Default.f53100a;
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            backgroundType = PromptMarketingContentDelegate.Model.BackgroundType.Dialog.f53101a;
        }
        int i5 = layoutType == null ? -1 : tld.c.f272050a[layoutType.ordinal()];
        if (i5 == -1) {
            pdVar = pd.REGULAR;
        } else if (i5 != 1) {
            if (i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            pdVar = pd.REGULAR;
        } else {
            pdVar = pd.BLACK;
        }
        pd pdVar2 = pdVar;
        ResourceImage resourceImage = content.f87328b ? new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.common_action_dismiss, null, null, 14), 126) : null;
        SlotDefaultPrompt.Action action = (SlotDefaultPrompt.Action) d0.e0(0, list);
        PromptMarketingContentDelegate.Model.Button button = action != null ? new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.slot_manager_prompt_main_action, u.c(action.f87321a), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62) : null;
        SlotDefaultPrompt.Action action2 = (SlotDefaultPrompt.Action) d0.e0(1, list);
        PromptMarketingContentDelegate.Model.Button button2 = action2 != null ? new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.slot_manager_prompt_secondary_action, u.c(action2.f87321a), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62) : null;
        String str2 = content.f87331h;
        return new i(u.c(new PromptMarketingContentDelegate.Model("prompt_list_id", textClause, textClause2, backgroundMediaContent, backgroundType, pdVar2, resourceImage, null, null, button, button2, null, str2 != null ? new PromptMarketingContentDelegate.Model.Footer(new HtmlClause(0, 30, (Integer) null, (Object) null, str2), md.BELOW_BUTTONS) : null, null, null, null, null, null, null, null, null, 2091392)));
    }
}
