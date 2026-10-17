package oic;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rewards.api.model.rewards.OpenUrlAction;
import com.revolut.feature.rewards.api.model.rewards.RewardAction;
import com.revolut.feature.rewards.api.model.rewards.RewardFooter;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterButton;
import com.revolut.feature.rewards.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb8.a f225608a;

    public i(hic.b partnerRewardDetailsButtonConfigBuilder, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(partnerRewardDetailsButtonConfigBuilder, "partnerRewardDetailsButtonConfigBuilder");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f225608a = new kb8.a(uiKitResources, 2);
    }

    public static TextClause b(String str) {
        if (str != null) {
            String str2 = !d0.W(str) ? str : null;
            if (str2 != null) {
                return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
        }
        return null;
    }

    public static TextLocalisedClause c(String str) {
        return new TextLocalisedClause(R$string.perks_details_sheet_button_title_go_to, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    public static CompositeClause e(int i, int i2) {
        return new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_24_arrow_navigation, Integer.valueOf(i2), (Float) null, (Float) null, 28), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(i, null, null, 14)), null, null, null, 14);
    }

    public static TextLocalisedClause f(OpenUrlAction openUrlAction) {
        if (openUrlAction instanceof RewardAction.RedeemPromocodeAndOpenUrl) {
            return new TextLocalisedClause(R$string.perks_details_floating_button_title_copy_and_redeem, null, null, 14);
        }
        if (openUrlAction instanceof RewardAction.OpenUrl) {
            return new TextLocalisedClause(R$string.perks_details_sheet_button_title_shop_now, null, null, 14);
        }
        throw new IllegalStateException("Can accept only actions with url");
    }

    public final ResourceImage a(String str, boolean z) {
        Integer numA;
        if (str == null || (numA = this.f225608a.a(str)) == null) {
            return null;
        }
        return new ResourceImage(numA.intValue(), (Integer) null, (Integer) null, Integer.valueOf(z ? R$attr.uikit_colorBackground : R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d d(RewardAction rewardAction, boolean z, String str) {
        Intrinsics.checkNotNullParameter(rewardAction, "rewardAction");
        int i = z ? R$attr.uikit_colorWhite : R$attr.uikit_colorAccent;
        if (rewardAction instanceof RewardAction.RedeemPromocodeAndOpenUrl) {
            Clause clauseB = b(str);
            if (clauseB == null) {
                clauseB = f((OpenUrlAction) rewardAction);
            }
            return new a(14, clauseB, null, false);
        }
        if (rewardAction instanceof RewardAction.OpenUrl) {
            Clause clauseB2 = b(str);
            if (clauseB2 == null) {
                clauseB2 = f((OpenUrlAction) rewardAction);
            }
            return new a(14, clauseB2, null, false);
        }
        if (rewardAction instanceof RewardAction.Activate) {
            Clause clauseB3 = b(str);
            if (clauseB3 == null) {
                ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_lightning, Integer.valueOf(R$attr.uikit_colorWhite), (Float) null, (Float) null, 28);
                m70.a.t(t0.f186434a);
                clauseB3 = new CompositeClause(v.k(imageClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.perks_rewards_activatable_reward_button_activate, null, null, 14)), null, null, null, 14);
            }
            return new a(14, clauseB3, null, false);
        }
        if (rewardAction instanceof RewardAction.ExternalRegistration) {
            Clause clauseB4 = b(str);
            if (clauseB4 == null) {
                clauseB4 = c(((RewardAction.ExternalRegistration) rewardAction).f84818b);
            }
            return new a(14, clauseB4, null, false);
        }
        if (rewardAction instanceof RewardAction.OpenMap) {
            return new a(14, e(R$string.perks_details_action_button_directions_long, i), null, false);
        }
        if (rewardAction instanceof RewardAction.ComplexAction) {
            Clause clauseB5 = b(str);
            if (clauseB5 == null) {
                clauseB5 = f(((RewardAction.ComplexAction) rewardAction).f84813a);
            }
            return new c(clauseB5, e(R$string.perks_details_action_button_directions_short, i), null, null, null, false, false, 508);
        }
        if (rewardAction instanceof RewardAction.OpenPromoUrl) {
            return new a(14, c(((RewardAction.OpenPromoUrl) rewardAction).f84825b), null, false);
        }
        boolean z3 = rewardAction instanceof RewardAction.EmptyAction;
        b bVar = b.f225596a;
        if (z3) {
            return bVar;
        }
        if (rewardAction instanceof RewardAction.PartnerMembershipAction) {
            RewardAction.PartnerMembershipAction rewardAction2 = (RewardAction.PartnerMembershipAction) rewardAction;
            Intrinsics.checkNotNullParameter(rewardAction2, "rewardAction");
            if (rewardAction2 instanceof RewardAction.PartnerMembershipAction.RequestActivation) {
                return new a(10, new TextLocalisedClause(R$string.perks_details_floating_button_request_activation_title, null, null, 14), null, true);
            }
            if (rewardAction2 instanceof RewardAction.PartnerMembershipAction.Activated) {
                return new a(10, new TextLocalisedClause(R$string.perks_details_floating_button_offer_activated_title, null, null, 14), null, false);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(rewardAction instanceof RewardAction.Footer)) {
            throw new NoWhenBranchMatchedException();
        }
        RewardFooter rewardFooter = ((RewardAction.Footer) rewardAction).f84820a;
        RewardFooterButton rewardFooterButton = rewardFooter.f84852a;
        RewardFooterButton rewardFooterButton2 = rewardFooter.f84853b;
        if (rewardFooterButton != null && rewardFooterButton2 != null) {
            return new c(new TextClause(rewardFooterButton.f84865b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(rewardFooterButton2.f84865b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), a(rewardFooterButton.f84864a, true), a(rewardFooterButton2.f84864a, false), LargeActionButton.ButtonStyle.f, rewardFooterButton.d, rewardFooterButton2.d, 4);
        }
        if (rewardFooterButton == null) {
            rewardFooterButton = rewardFooterButton2;
        }
        return rewardFooterButton != null ? new a(2, new TextClause(rewardFooterButton.f84865b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), a(rewardFooterButton.f84864a, true), rewardFooterButton.d) : bVar;
    }
}
