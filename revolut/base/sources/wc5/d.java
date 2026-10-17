package wc5;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.crypto.asset.details.api.dialog.StakingRewardsDialogDescriptor$Type;
import com.revolut.feature.staking.api.model.StakingInfo;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.retail.feature.crypto.asset_details.api.R$plurals;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Object textLocalisedQuantityClause;
        wc5.a domainState = (wc5.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        StakingRewardsDialogDescriptor$Type stakingRewardsDialogDescriptor$Type = domainState.f296343a;
        boolean z = stakingRewardsDialogDescriptor$Type instanceof StakingRewardsDialogDescriptor$Type.InPeriod;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealthcore_currency_details_staking_first_reward_info_title, null, null, 14);
        } else {
            if (!(stakingRewardsDialogDescriptor$Type instanceof StakingRewardsDialogDescriptor$Type.Overdue)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealthcore_currency_details_staking_taking_longer_info_title, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
        if (z) {
            int i = R$string.wealthcore_currency_details_staking_first_reward_info_subtitle;
            StakingProduct stakingProduct = ((StakingRewardsDialogDescriptor$Type.InPeriod) stakingRewardsDialogDescriptor$Type).f70775a;
            xi0.b bVar = stakingProduct.d;
            StakingInfo stakingInfo = stakingProduct.f88087b;
            String str = bVar.f306286a;
            Integer numValueOf = Integer.valueOf(stakingInfo.f88061b);
            int i2 = stakingInfo.d;
            if (i2 == 7) {
                textLocalisedQuantityClause = new TextLocalisedClause(R$string.crypto_asset_details_staking_first_reward_info_reward_frequency_weekly, null, null, 14);
            } else {
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.crypto_asset_details_staking_first_reward_info_reward_frequency, Integer.valueOf(i2), i2 == 0 ? f0.f322471a : u.c(Integer.valueOf(i2)), (Style) null, 24);
            }
            textLocalisedClause2 = new TextLocalisedClause(i, v.k(str, numValueOf, textLocalisedQuantityClause), null, 12);
        } else {
            if (!(stakingRewardsDialogDescriptor$Type instanceof StakingRewardsDialogDescriptor$Type.Overdue)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealthcore_currency_details_staking_taking_longer_info_subtitle, null, null, 14);
        }
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.crypto_asset_details_staking_first_reward_info_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), f0.f322471a, new lw0.a(textLocalisedClause3, textLocalisedClause2, null, null, false, 28));
    }
}
