package ngb;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.feature.retail.salary_account.impl.salary_hub.reward_bottom_sheet.SalaryRewardBottomSheetController;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3ControllerContract$RewardInfo;
import java.time.Instant;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f90.b f215133a;

    public f(yik.h pricingPlanStringMapper, f90.b pluralFormatter) {
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(pluralFormatter, "pluralFormatter");
        this.f215133a = pluralFormatter;
    }

    public static SalaryRewardBottomSheetController b(f fVar, int i, List list, int i2, List list2, TextLocalisedClause textLocalisedClause, int i3, List list3, int i5) {
        List list4 = (i5 & 2) != 0 ? f0.f322471a : list;
        List list5 = (i5 & 8) != 0 ? f0.f322471a : list2;
        List list6 = (i5 & 64) != 0 ? f0.f322471a : list3;
        fVar.getClass();
        return new SalaryRewardBottomSheetController(new a(new TextLocalisedClause(i, list4, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), new TextLocalisedClause(i2, list5, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), textLocalisedClause, new TextLocalisedClause(i3, list6, null, 12)));
    }

    public final TextLocalisedClause a(SalaryHubV3ControllerContract$RewardInfo.RewardStatus rewardStatus) {
        if (rewardStatus instanceof SalaryHubV3ControllerContract$RewardInfo.RewardStatus.Locked) {
            Integer num = ((SalaryHubV3ControllerContract$RewardInfo.RewardStatus.Locked) rewardStatus).f83005a;
            if (num != null) {
                int iIntValue = num.intValue();
                return new TextLocalisedClause(R$string.salary_account_bottom_sheet_reward_unlocks_with_salary, u.c(new TextClause(this.f215133a.a("{0,ordinal}", Integer.valueOf(iIntValue)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            }
        } else if (rewardStatus instanceof SalaryHubV3ControllerContract$RewardInfo.RewardStatus.Coming) {
            Instant instant = ((SalaryHubV3ControllerContract$RewardInfo.RewardStatus.Coming) rewardStatus).f83004a;
            if (instant != null) {
                return new TextLocalisedClause(R$string.salary_account_rewards_unlocks_in, u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.Month(ka.SHORT), null, null, 12)), null, 12);
            }
        } else if (!Intrinsics.f(rewardStatus, SalaryHubV3ControllerContract$RewardInfo.RewardStatus.Other.f83006a)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}
