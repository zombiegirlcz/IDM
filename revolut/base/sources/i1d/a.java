package i1d;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.semi_independent_onboarding.impl.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    @NotNull
    public static final C0903a Companion = new C0903a();

    /* JADX INFO: renamed from: i1d.a$a, reason: collision with other inner class name */
    public static final class C0903a {
        private C0903a() {
        }
    }

    public static PromptMarketingScreenContract$InputData a() {
        return new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.guardian_invitation_prompt_signup_title, null, null, 14), new TextLocalisedClause(R$string.guardian_invitation_prompt_signup_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D122", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.guardian_invitation_prompt_signup_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368);
    }
}
