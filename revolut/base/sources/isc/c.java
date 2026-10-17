package isc;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.sca_prompt.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import nd.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f168174a;

    public c(dsc.a dependenciesProvider, k beneficiaryNameProvider, msc.a legalEntityProvider) {
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Intrinsics.checkNotNullParameter(beneficiaryNameProvider, "beneficiaryNameProvider");
        Intrinsics.checkNotNullParameter(legalEntityProvider, "legalEntityProvider");
        this.f168174a = beneficiaryNameProvider;
    }

    public static PromptMarketingContentDelegate.Model.Button a() {
        return new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.crypto_sca_prompt_action_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, "SCA_PROMPT_PRIMARY_BUTTON_TAG", 22);
    }

    public static PromptMarketingContentDelegate.Model.Button b() {
        return new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.crypto_sca_prompt_action_not_now, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, "SCA_PROMPT_SECONDARY_BUTTON_TAG", 22);
    }
}
