package cd5;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.g2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.retail.feature.crypto.asset_details.api.R$plurals;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsActionDelegate.Model a(int i, StakingProduct stakingProduct) {
        return new CellDetailsActionDelegate.Model("STAKING_REWARDS_LIST_ID", new TextLocalisedClause(R$string.crypto_asset_details_staking_rewards_first, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedQuantityClause(R$plurals.crypto_asset_details_staking_countdown_value, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24), null, false, true, null, null, new oc5.c(stakingProduct), 0, 0, 0, 0, 4192100);
    }

    public final List b(vtd.c stakingRewards, StakingProduct stakingProduct) {
        CellDetailsDelegate.Model model;
        Intrinsics.checkNotNullParameter(stakingRewards, "stakingRewards");
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        Integer num = stakingRewards.f292102c;
        Object objA = null;
        if (stakingRewards.f292101b.k()) {
            if (num != null && num.intValue() == 0) {
                objA = a(1, stakingProduct);
            } else if (num != null && num.intValue() > 0) {
                objA = a(num.intValue(), stakingProduct);
            } else if (num != null && num.intValue() < 0) {
                model = new CellDetailsDelegate.Model("STAKING_REWARDS_LIST_ID", new TextLocalisedClause(R$string.crypto_asset_details_staking_rewards_first, null, null, 14), new TextLocalisedQuantityClause(R$plurals.crypto_asset_details_staking_countdown_value, (Number) 1, u.c(1), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 8), new TextLocalisedClause(R$string.crypto_asset_details_staking_rewards_overdue, null, null, 14), null, false, 1, g2.CENTER, oc5.d.f224104a, null, null, 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, null, 0, 0, 0, 0, 1039616);
            }
            return v.l(objA);
        }
        model = new CellDetailsDelegate.Model("STAKING_REWARDS_LIST_ID", new TextLocalisedClause(R$string.crypto_asset_details_staking_rewards_lifetime, null, null, 14), new MoneyClause(stakingRewards.f292101b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        objA = model;
        return v.l(objA);
    }
}
