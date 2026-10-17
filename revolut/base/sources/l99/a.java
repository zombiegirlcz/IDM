package l99;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import uc0.b;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    @NotNull
    public static final C1097a Companion = new C1097a();

    /* JADX INFO: renamed from: l99.a$a, reason: collision with other inner class name */
    public static final class C1097a {
        private C1097a() {
        }
    }

    public static PromptMarketingScreenContract$InputData a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, String str) {
        return new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model(str, textLocalisedClause, textLocalisedClause2, new PromptMarketingContentDelegate.Model.Content.MediaContent(new LottieImage(b.a("mobile/lotties", "revolut_app"), R$attr.uikit_colorForeground, Constants.TAG_EMV_L2_CHECKSUM), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) textLocalisedClause3, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30);
    }
}
