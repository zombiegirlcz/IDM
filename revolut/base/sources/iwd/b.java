package iwd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.R$plurals;
import com.revolut.feature.staking.api.R$string;
import com.revolut.feature.staking.api.model.StakingModes;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements aud.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttd.a f169084a;

    public b(ttd.a interestRateFormatter) {
        Intrinsics.checkNotNullParameter(interestRateFormatter, "interestRateFormatter");
        this.f169084a = interestRateFormatter;
    }

    public static RowDelegate.Model a(int i, Clause clause, TextLocalisedClause textLocalisedClause, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause, null, 0, clause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536860632);
    }

    public final List b(StakingModes.StakingMode stakingProductMode) {
        int i;
        Intrinsics.checkNotNullParameter(stakingProductMode, "stakingProductMode");
        RowDelegate.Model modelA = null;
        RowDelegate.Model modelA2 = a(R$drawable.uikit_icn_24_percent, new TextLocalisedClause(R$string.staking_details_earn_description, null, null, 14), new TextLocalisedClause(R$string.crypto_asset_details_section_investment_earn_earn_up_to_title, u.c(((wud.b) this.f169084a).b(stakingProductMode.getF88076a(), true)), null, 12), "EARN_ROW_LIST_ID");
        int d = stakingProductMode.getD();
        RowDelegate.Model modelA3 = a(R$drawable.uikit_icn_24_calendar_recurring, new TextLocalisedClause(R$string.staking_details_rewards_description_timing, null, null, 14), d != 1 ? d != 7 ? new TextLocalisedClause(R$string.staking_details_rewards_title_days, u.c(Integer.valueOf(d)), null, 12) : new TextLocalisedClause(R$string.staking_details_rewards_title_weekly, null, null, 14) : new TextLocalisedClause(R$string.staking_details_rewards_title_daily, null, null, 14), "REWARDS_ROW_LIST_ID");
        RowDelegate.Model modelA4 = a(R$drawable.uikit_icn_24_all_time, new TextLocalisedQuantityClause(R$plurals.staking_details_warm_up_description, Integer.valueOf(stakingProductMode.getF88077b()), u.c(Integer.valueOf(stakingProductMode.getF88077b())), (Style) null, 24), new TextLocalisedClause(R$string.staking_details_warm_up_title, null, null, 14), "WARM_UP_ROW_LIST_ID");
        StakingModes.Manual manual = stakingProductMode instanceof StakingModes.Manual ? (StakingModes.Manual) stakingProductMode : null;
        if (manual != null && (i = manual.f88078c) > 0) {
            modelA = a(R$drawable.uikit_icn_24_exclamation_triangle, new TextLocalisedQuantityClause(R$plurals.staking_details_unstaking_description, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24), new TextLocalisedClause(R$string.staking_details_unstaking_title, null, null, 14), "UNSTAKING_ROW_LIST_ID");
        }
        i[] elements = {modelA2, modelA3, modelA4, modelA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }
}
