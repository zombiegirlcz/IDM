package pq7;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kl7.j0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pnh.a0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements jki.p {
    public static FixedTabsDelegate.Model b(j0 j0Var) {
        int i;
        j0[] j0VarArrValues = j0.values();
        ArrayList arrayList = new ArrayList(j0VarArrValues.length);
        for (j0 j0Var2 : j0VarArrValues) {
            String code = j0Var2.getCode();
            Intrinsics.checkNotNullParameter(j0Var2, "<this>");
            int i2 = xl7.k.f306951b[j0Var2.ordinal()];
            if (i2 == 1) {
                i = R$string.car_insurance_smart_driving_score_history_window_one_month;
            } else if (i2 == 2) {
                i = R$string.car_insurance_smart_driving_score_history_window_two_months;
            } else if (i2 == 3) {
                i = R$string.car_insurance_smart_driving_score_history_window_six_months;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.car_insurance_smart_driving_score_history_window_one_year;
            }
            arrayList.add(new FixedTabs.Item(code, new TextLocalisedClause(i, null, null, 14), (AnalyticsContext) null, 12));
        }
        return new FixedTabsDelegate.Model("DRIVING_SCORE_HISTORY_TAB", arrayList, j0Var.getCode(), false, null, SyslogConstants.LOG_CLOCK);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listC = u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "SMART_DRIVING_FAQ", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124));
        List list = (List) iii.c.f(domainState.f238690a, new a0(26), new pof.e(10), new p2b.a(this, 21));
        Data data = domainState.f238691b;
        j0 j0Var = domainState.f238692c;
        return new k(d0.E0((List) iii.c.f(data, new o(this, j0Var), new plb.g(this, j0Var, 14), new p40.n(this, j0Var, 16)), list), listC);
    }
}
