package xjj;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class g {
    public g(unj.f mobilePlanCallTimeFormatter) {
        Intrinsics.checkNotNullParameter(mobilePlanCallTimeFormatter, "mobilePlanCallTimeFormatter");
    }

    public final CellDetailsDelegate.Model a(String listId, boolean z, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (z) {
            return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_details_calls, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_unlimited, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 30712);
        }
        if (l2 != null && l3 != null) {
            long jLongValue = l3.longValue();
            return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_details_calls_remaining, null, null, 14), (Image) null, 0, false, 30), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(String.valueOf(unj.f.a(l2.longValue())), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.esim_common_template_slash_mins, u.c(Long.valueOf(unj.f.a(jLongValue))), new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 8))), null, null, null, null, 0, null, false, false, null, null, 30712);
        }
        if (l3 == null) {
            return null;
        }
        long jLongValue2 = l3.longValue();
        return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_details_calls_remaining, null, null, 14), (Image) null, 0, false, 30), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(String.valueOf(unj.f.a(jLongValue2)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.esim_common_template_slash_mins, u.c(Long.valueOf(unj.f.a(jLongValue2))), new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 8))), null, null, null, null, 0, null, false, false, null, null, 30712);
    }
}
