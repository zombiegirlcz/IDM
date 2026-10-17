package shb;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.jd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.salary_account.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        shb.a domainState = (shb.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.salary_switch_assistant_entry_title;
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254);
        PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent fullScreenMediaContent = new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new UrlImage("https://assets.revolut.com/published-assets-v3/ec4a5c00-f550-4b3e-8dd5-1f9adf5377c4/ce83a6b1-8ea6-44d7-87ab-023a123070df.png", null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, jd.BOTTOM, 2);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.salary_switch_assistant_entry_primary_button, null, null, 14);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) textLocalisedClause, (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.d, false, (String) null, 54);
        String str = null;
        return new e(u.c(new PromptMarketingContentDelegate.Model("LIST_ID_SWITCH_ASSISTANT_ENTRY_CONTENT", new TextLocalisedClause(i, null, custom, 10), new TextLocalisedClause(R$string.salary_switch_assistant_entry_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorWhite_70), false, null, false, null, 254), 10), fullScreenMediaContent, null, null, resourceImage, null, null, button, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.salary_switch_assistant_entry_secondary_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58727c, false, str, 54), null, null, str, null, null, null, null, null, null, null, 2095536)));
    }
}
