package vi9;

import aw0.ka;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import ip0.n40;
import ip0.o40;
import ip0.r40;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class z {
    public static r40 a(r0 r0Var, zh9.p pVar, int i, int i2) {
        if (czi.c.E(pVar, r0Var)) {
            return b(pVar, r0Var, i, i2, new TextLocalisedClause(R$string.pay_later_plan_amount_dot_due, zhm.u.c(sx4.f.b(3, null, null, czi.c.v(pVar))), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), new TextLocalisedClause(R$string.pay_later_plan_outstanding_repayment_sub_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorTerracotta), false, null, false, null, 254), 10), R$attr.uikit_colorTerracotta);
        }
        int i3 = w.f289557b[pVar.e.ordinal()];
        if (i3 == 1) {
            return b(pVar, r0Var, i, i2, new TextLocalisedClause(R$string.pay_later_plan_amount_dot_scheduled, zhm.u.c(sx4.f.b(3, null, null, czi.c.v(pVar))), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), null, R$attr.uikit_colorGreyTone10);
        }
        if (i3 == 2) {
            return b(pVar, r0Var, i, i2, new TextLocalisedClause(R$string.pay_later_plan_amount_dot_due_today, zhm.u.c(sx4.f.b(3, null, null, czi.c.v(pVar))), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), new TextLocalisedClause(R$string.pay_later_plan_outstanding_repayment_sub_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorTerracotta), false, null, false, null, 254), 10), R$attr.uikit_colorTerracotta);
        }
        if (i3 == 3) {
            return b(pVar, r0Var, i, i2, new TextLocalisedClause(R$string.pay_later_plan_amount_dot_overdue, zhm.u.c(sx4.f.b(3, null, null, czi.c.v(pVar))), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), new TextLocalisedClause(R$string.pay_later_plan_overdue_repayment_sub_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), R$attr.uikit_colorRed);
        }
        if (i3 == 4) {
            return b(pVar, r0Var, i, i2, new TextLocalisedClause(R$string.pay_later_plan_param_dot_cancelled, zhm.u.c(sx4.f.b(3, null, null, czi.c.s(pVar))), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), null, R$attr.uikit_colorBlue);
        }
        if (i3 == 5) {
            return b(pVar, r0Var, i, i2, new TextLocalisedClause(R$string.pay_later_plan_amount_dot_paid, zhm.u.c(sx4.f.b(3, null, null, czi.c.s(pVar))), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), null, R$attr.uikit_colorBlue);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final r40 b(zh9.p pVar, r0 r0Var, int i, int i2, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i3) {
        TimeClause timeClause = new TimeClause(czi.c.n(pVar).getMillis(), new TimeClause.Format.DayAndMonth(ka.SHORT), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
        int i5 = R$string.pay_later_repayments_number_of_count;
        int i6 = pVar.f322316a;
        Object[] elements = {timeClause, new TextLocalisedClause(i5, zhm.v.k(Integer.valueOf(i6 + 1), Integer.valueOf(r0Var.B.size())), null, 12)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new r40(a0.d.n("plan-progress-", i6), null, textLocalisedClause, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause(Integer.valueOf(R$attr.uikit_colorGreyTone50)), null, null, 12), textLocalisedClause2, zhm.u.c(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246)), i3, true, new o40(n40.PAST), i == 0 ? R$attr.uikit_dp16 : R$attr.uikit_dp4, i == i2 ? R$attr.uikit_dp16 : R$attr.uikit_dp4, R$attr.uikit_dp0, new bi9.b(new zh9.y(pVar, r0Var)), 2050);
    }
}
