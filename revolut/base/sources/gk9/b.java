package gk9;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.r0;
import zh9.u0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vi9.b f144351a;

    public b(vi9.b merchantIconMapper) {
        Intrinsics.checkNotNullParameter(merchantIconMapper, "merchantIconMapper");
        this.f144351a = merchantIconMapper;
    }

    public static LayeredImage a(int i, int i2) {
        return LayeredImage.Companion.f(LayeredImage.INSTANCE, i, i2, R$attr.uikit_colorBackground, null, 2.0f, 2.0f, Float.valueOf(12.0f), 8);
    }

    public static RowDelegate.Model b(b bVar, r0 r0Var, MoneyClause moneyClause, Clause clause, LayeredImage layeredImage, int i) {
        ProgressStyle progressStyleC;
        Float fValueOf = Float.valueOf(0.3f);
        TimeClause timeClause = new TimeClause(r0Var.f322330h.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
        MoneyClause moneyClauseB = (i & 4) != 0 ? sx4.f.b(3, null, null, r0Var.f322331j) : moneyClause;
        LayeredImage layeredImage2 = (i & 16) != 0 ? null : layeredImage;
        if ((i & 32) != 0) {
            fValueOf = null;
        }
        String strQ = j6.a.q("id_plan_", r0Var.f322326a);
        Image imageC = bVar.f144351a.c(u0.Y(r0Var), fValueOf);
        if (u0.z(r0Var)) {
            ProgressStyle.Companion companion = ProgressStyle.INSTANCE;
            Intrinsics.checkNotNullParameter(r0Var, "<this>");
            progressStyleC = companion.a((int) ((u0.u(r0Var).f115082a * ((long) 100)) / u0.w(r0Var).f115082a));
        } else {
            progressStyleC = ProgressStyle.Companion.c(ProgressStyle.INSTANCE, 100, R$attr.uikit_colorGroupedBackground);
        }
        return new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(imageC, layeredImage2, progressStyleC, false, 24), new TextClause(r0Var.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, timeClause, null, null, 0, new RowDelegate.Model.c.b(moneyClauseB, clause, null, false, 124), false, null, false, null, null, null, null, null, null, new bi9.d(r0Var), null, 0, 0, 0, 0, 532675544);
    }

    public final RowDelegate.Model c(r0 plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        int i = a.f144350a[plan.f322335p.ordinal()];
        if (i == 1) {
            return b(this, plan, null, new TextLocalisedClause(R$string.pay_later_plans_amount_left, u.c(sx4.f.b(3, null, null, u0.x(plan))), null, 12), null, 54);
        }
        if (i == 2) {
            return b(this, plan, new MoneyClause(plan.f322331j, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, 8), new TextLocalisedClause(R$string.pay_later_plan_cancelled, null, null, 14), null, 18);
        }
        if (i == 3) {
            int i2 = R$attr.uikit_colorRed;
            return b(this, plan, null, new TextLocalisedClause(R$string.pay_later_plans_amount_overdue, u.c(sx4.f.b(3, null, null, u0.r(plan))), new Custom(Integer.valueOf(i2), false, null, false, null, 254), 8), a(R$drawable.uikit_icn_16_exclamation_mark_sign, i2), 38);
        }
        if (i == 4) {
            int i3 = R$attr.uikit_colorOrange;
            return b(this, plan, null, new TextLocalisedClause(R$string.pay_later_plans_amount_due_today, u.c(sx4.f.b(3, null, null, u0.r(plan))), new Custom(Integer.valueOf(i3), false, null, false, null, 254), 8), a(R$drawable.uikit_icn_16_exclamation_mark_sign, i3), 38);
        }
        if (i == 5) {
            return b(this, plan, null, new TextLocalisedClause(R$string.pay_later_plans_repaid, null, null, 14), null, 54);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final RowDelegate.Model d(zh9.i accountConfig, r0 plan) {
        Intrinsics.checkNotNullParameter(accountConfig, "accountConfig");
        Intrinsics.checkNotNullParameter(plan, "plan");
        if (!u0.D(accountConfig, plan)) {
            return c(plan);
        }
        int i = R$attr.uikit_colorOrange;
        return b(this, plan, null, new CompositeClause(v.k(sx4.f.b(3, null, null, u0.x(plan)), new TextLocalisedClause(R$string.pay_later_repayment_in_withdrawal, null, null, 14)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(i), false, null, false, null, 254), null, 8), a(R$drawable.uikit_icn_16_exclamation_mark_sign, i), 38);
    }

    public final RowDelegate.Model e(r0 plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        return b(this, plan, sx4.f.b(3, null, null, u0.x(plan)), new TextLocalisedClause(R$string.pay_later_plans_left_to_repay, null, null, 14), null, 50);
    }
}
