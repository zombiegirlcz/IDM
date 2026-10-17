package xjj;

import aw0.o9;
import aw0.t0;
import ch.qos.logback.core.util.FileSize;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
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
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gej.a f306538a;

    public h(gej.a bytesFormatter) {
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        this.f306538a = bytesFormatter;
    }

    public final CellDetailsDelegate.Model a(String listId, boolean z, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (z) {
            return new CellDetailsDelegate.Model(listId, new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_details_data, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_unlimited, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 30712);
        }
        gej.a aVar = this.f306538a;
        if (l2 != null && l3 != null) {
            long jLongValue = l2.longValue();
            long jLongValue2 = l3.longValue();
            t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_details_data_remaining, null, null, 14), (Image) null, 0, false, 30);
            ((ynj.a) aVar).getClass();
            return new CellDetailsDelegate.Model(listId, t0Var, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new NumberClause(ynj.a.b(jLongValue, FileSize.GB_COEFFICIENT), ynj.a.f315478a, null, null, 12), new TextLocalisedClause(R$string.esim_common_template_slash_data, u.c(gej.a.a(aVar, jLongValue2, null, 6)), new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 8))), null, null, null, null, 0, null, false, false, null, null, 30712);
        }
        if (l3 == null) {
            return null;
        }
        long jLongValue3 = l3.longValue();
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_details_data_remaining, null, null, 14), (Image) null, 0, false, 30);
        ((ynj.a) aVar).getClass();
        return new CellDetailsDelegate.Model(listId, t0Var2, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new NumberClause(ynj.a.b(jLongValue3, FileSize.GB_COEFFICIENT), ynj.a.f315478a, null, null, 12), new TextLocalisedClause(R$string.esim_common_template_slash_data, u.c(gej.a.a(aVar, jLongValue3, null, 6)), new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 8))), null, null, null, null, 0, null, false, false, null, null, 30712);
    }
}
