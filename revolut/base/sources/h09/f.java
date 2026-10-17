package h09;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.learn.shared.impl.R$string;
import com.revolut.feature.learn.shared.models.domain.LearnReward;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(LearnReward.ToInvestAccount toInvestAccount, boolean z) {
        return new TextLocalisedClause(z ? R$string.investmentlearn_reward_earned_to_invest : R$string.investmentlearn_reward_earn_to_invest, u.c(new MoneyClause(toInvestAccount.f78028a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
    }

    public static TextLocalisedClause b(LearnReward.ToPocket toPocket, boolean z) {
        return new TextLocalisedClause(z ? R$string.investmentlearn_reward_earned_in_money : R$string.investmentlearn_reward_earn_in_money, v.k(new MoneyClause(toPocket.f78029a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), toPocket.f78030b), null, 12);
    }

    public static e c(LearnReward reward, boolean z, boolean z3, boolean z4, boolean z6) {
        Clause clauseB;
        Float fValueOf = Float.valueOf(12.0f);
        Intrinsics.checkNotNullParameter(reward, "reward");
        if (z) {
            clauseB = new TextLocalisedClause(R$string.investmentlearn_course_overview_lesson_completed_title, null, null, 14);
        } else if (z3) {
            clauseB = new TextLocalisedClause(R$string.investmentlearn_reward_no_reward, null, null, 14);
        } else if (z4) {
            clauseB = z6 ? new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorWhite), fValueOf, fValueOf, 16), new TextLocalisedClause(R$string.investmentlearn_reward_no_reward_abuse, null, null, 14)), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : new TextLocalisedClause(R$string.investmentlearn_reward_no_reward_abuse, null, null, 14);
        } else {
            clauseB = reward instanceof LearnReward.ToPocket ? b((LearnReward.ToPocket) reward, false) : reward instanceof LearnReward.ToInvestAccount ? a((LearnReward.ToInvestAccount) reward, false) : null;
        }
        return new e(clauseB, z ? Integer.valueOf(R$drawable.uikit_icn_16_check) : null, z ? Integer.valueOf(R$attr.uikit_colorWhite) : null);
    }

    public static e d(LearnReward reward, boolean z) {
        TextLocalisedClause textLocalisedClauseA;
        Intrinsics.checkNotNullParameter(reward, "reward");
        if (reward instanceof LearnReward.ToPocket) {
            textLocalisedClauseA = b((LearnReward.ToPocket) reward, z);
        } else if (reward instanceof LearnReward.ToInvestAccount) {
            textLocalisedClauseA = a((LearnReward.ToInvestAccount) reward, z);
        } else {
            if (!(reward instanceof LearnReward.NoReward)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClauseA = null;
        }
        return new e(textLocalisedClauseA, z ? Integer.valueOf(R$drawable.uikit_icn_16_check) : null, z ? Integer.valueOf(R$attr.uikit_colorAccent) : null);
    }
}
