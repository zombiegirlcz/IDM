package yjb;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.jd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.api.challenge.navigation.SavingsChallengePrizeCelebrationDestination;
import com.revolut.feature.retail.savings.api.challenge.navigation.SavingsChallengeTrackerDestination;
import com.revolut.feature.retail.savings.impl.challenge.presentation.tracking.SavingsChallengeTrackerContract$InputData;
import com.revolut.feature.retail.savings.impl.challenge.presentation.tracking.SavingsChallengeTrackerController;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qib.j;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f314445a;

    public d(ImmutableSet deeplinkGateways, a challengePrizeCelebrationPromptProvider) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(challengePrizeCelebrationPromptProvider, "challengePrizeCelebrationPromptProvider");
        this.f314445a = deeplinkGateways;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SavingsChallengeTrackerDestination) {
            return new SavingsChallengeTrackerController(new SavingsChallengeTrackerContract$InputData(((SavingsChallengeTrackerDestination) destination).f83117a));
        }
        if (!(destination instanceof SavingsChallengePrizeCelebrationDestination)) {
            return null;
        }
        SavingsChallengePrizeCelebrationDestination savingsChallengePrizeCelebrationDestination = (SavingsChallengePrizeCelebrationDestination) destination;
        j type = savingsChallengePrizeCelebrationDestination.f83114a;
        dj0.d amount = savingsChallengePrizeCelebrationDestination.f83115b;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amount, "amount");
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.savings_challenge_celebration_title, zhm.u.c(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        int i = b.f314444a[type.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.savings_challenge_celebration_recurring_draw_description, zhm.u.c(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = null;
                return gc0.c.b(new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("challenge_prize_celebration_prompt", textLocalisedClause3, textLocalisedClause2, new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new UrlVideo("https://assets.revolut.com/mobile/savings/challenge/celebration/background_light.mp4", "https://assets.revolut.com/mobile/savings/challenge/celebration/background_dark.mp4", false, oz0.b.CENTER_CROP, false, (oz0.c) null, 112), null, jd.CENTER, 2), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.savings_challenge_celebration_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30)), new ak3.a(destination, 4));
            }
            textLocalisedClause = new TextLocalisedClause(R$string.savings_challenge_celebration_one_time_draw_description, null, null, 14);
        }
        textLocalisedClause2 = textLocalisedClause;
        return gc0.c.b(new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("challenge_prize_celebration_prompt", textLocalisedClause3, textLocalisedClause2, new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new UrlVideo("https://assets.revolut.com/mobile/savings/challenge/celebration/background_light.mp4", "https://assets.revolut.com/mobile/savings/challenge/celebration/background_dark.mp4", false, oz0.b.CENTER_CROP, false, (oz0.c) null, 112), null, jd.CENTER, 2), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.savings_challenge_celebration_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30)), new ak3.a(destination, 4));
    }

    @Override // aii.p
    public final Set h() {
        return this.f314445a;
    }
}
