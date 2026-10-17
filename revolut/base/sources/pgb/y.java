package pgb;

import aw0.ka;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.salary_account.impl.R$string;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    @NotNull
    private static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f235859a;

    public y(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f235859a = dateProvider;
    }

    public static tf b(int i, int i2) {
        return new tf(new yy0.j(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(i2), (List) null, (ImageTransformations) null, (Clause) null, 246)));
    }

    public static TextLocalisedClause c(tgb.l lVar) {
        Instant instant = lVar.f271149h;
        if (instant != null) {
            return new TextLocalisedClause(R$string.salary_account_rewards_active_until, zhm.u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.MonthAndYear(ka.SHORT, 2), null, null, 12)), null, 12);
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "SalaryHubV3RewardsSectionMapper", "Skipping " + lVar.f271145a + " reward in ACTIVE state: activeUntil is missing.", null, h0Var);
        return null;
    }

    public static TextLocalisedClause d(tgb.k kVar) {
        int i = x.f235858b[kVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.salary_account_rewards_salary_draw_subtitle_v3, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.salary_account_rewards_free_premium_subtitle_v3, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.salary_account_rewards_savings_boost_subtitle, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.salary_account_rewards_income_insurance_subtitle, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause e(tgb.l lVar) {
        switch (x.f235857a[lVar.f271146b.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.salary_account_rewards_to_activate, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.salary_account_rewards_active, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.salary_account_rewards_expiring, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10);
            case 4:
                return new TextLocalisedClause(R$string.salary_account_rewards_at_risk, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.salary_account_rewards_to_unlock, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.salary_account_rewards_state_section_title_unlocked, null, null, 14);
            case 7:
                Instant instant = lVar.e;
                if (instant != null) {
                    return new TextLocalisedClause(R$string.salary_account_rewards_unlocks_in, zhm.u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.Month(ka.SHORT), null, null, 12)), null, 12);
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(aim.e r55, java.util.List r56, com.revolut.core.ui_kit.models.TextLocalisedClause r57, tgb.j r58, java.lang.String r59) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pgb.y.a(aim.e, java.util.List, com.revolut.core.ui_kit.models.TextLocalisedClause, tgb.j, java.lang.String):void");
    }
}
