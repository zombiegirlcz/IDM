package eck;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.jd;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h(u.c(new PromptMarketingContentDelegate.Model("enable_birthday_sharing_button", domainState.f124759a ? new TextLocalisedClause(R$string.premium_birthday_sharing_prompt_title, null, null, 14) : new TextLocalisedClause(R$string.premium_birthday_sharing_prompt_onboarding_title, null, null, 14), new TextLocalisedClause(R$string.premium_birthday_sharing_prompt_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(ybk.a.f312384a, null, jd.CENTER, 2), PromptMarketingContentDelegate.Model.BackgroundType.Default.f53100a, pd.REGULAR, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.premium_birthday_sharing_prompt_actions_enable, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "enable_birthday_sharing_button", 30), null, null, null, null, null, null, null, null, null, null, null, 2095488)));
    }
}
