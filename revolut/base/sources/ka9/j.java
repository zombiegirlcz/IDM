package ka9;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.onboarding.can_not_open_account.CanNotOpenAccountScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CanNotOpenAccountScreenContract$InputData f182451a;

    public j(CanNotOpenAccountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f182451a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j domainState) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.signup_registration_cannot_open_account_title, null, null, 14);
        CanNotOpenAccountScreenContract$InputData canNotOpenAccountScreenContract$InputData = this.f182451a;
        int i = i.f182450a[canNotOpenAccountScreenContract$InputData.f78398a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.signup_registration_cannot_open_account_subtitle, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.signup_registration_cannot_open_account_subtitle_foreign_applicant, null, null, 14);
        }
        return new f(u.c(new PromptMarketingContentDelegate.Model("CAN_NOT_OPEN_ACCOUNT_PROMPT_ID", textLocalisedClause2, textLocalisedClause, new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D076", null, null, null, 30), null), null, null, canNotOpenAccountScreenContract$InputData.f78399b ? new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.common_action_log_out, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560)));
    }
}
