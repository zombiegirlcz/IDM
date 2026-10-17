package i7b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.gf;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardChallenge;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardInfo;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7b.a f159228a;

    public g(c7b.a iconMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f159228a = iconMapper;
    }

    public final RowDelegate.Model a(CobrandedCardsPlanHubInfoRewardChallenge challenge, int i) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        String str = challenge.f82390h;
        CobrandedCardsPlanHubInfoRewardInfo cobrandedCardsPlanHubInfoRewardInfo = challenge.f82389g;
        Object cobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel = str != null ? new CobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel(str) : cobrandedCardsPlanHubInfoRewardInfo;
        String strN = a0.d.n("list_id_challenge_item_", i);
        TextClause textClause = new TextClause(challenge.f82386a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = challenge.f82387b;
        TextClause textClause2 = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        Float f = challenge.e;
        gf gfVar = f != null ? new gf(rim.d.c(f.floatValue() * 100)) : null;
        return new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(this.f159228a.b(challenge.f82388c), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), Intrinsics.f(challenge.d, "SUCCESS") ? new SuccessCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), textClause, null, 0, textClause2, null, null, 0, challenge.f82390h != null ? new pf(new TextLocalisedClause(R$string.cobrand_plan_hub_rewards_tab_choose_reward, null, null, 14), null, null, false, null, null, 510) : null, cobrandedCardsPlanHubInfoRewardInfo != null, null, false, challenge.f ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, gfVar, cobrandedCardsPlanHubRewardsScreenContract$RewardSelectionParcel, null, 0, 0, 0, 0, 530559960);
    }
}
