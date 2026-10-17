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
public final class r {
    public static CellDetailsDelegate.Model a(String listId, boolean z, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (z) {
            return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_details_sms, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_unlimited, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 30712);
        }
        if (l2 != null && l3 != null) {
            return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_details_sms_remaining, null, null, 14), (Image) null, 0, false, 30), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(String.valueOf(l2.longValue()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.esim_common_template_slash_texts, u.c(l3), new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 8))), null, null, null, null, 0, null, false, false, null, null, 30712);
        }
        if (l3 == null) {
            return null;
        }
        return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_details_sms_remaining, null, null, 14), (Image) null, 0, false, 30), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(String.valueOf(l3.longValue()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.esim_common_template_slash_texts, u.c(l3), new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 8))), null, null, null, null, 0, null, false, false, null, null, 30712);
    }
}
