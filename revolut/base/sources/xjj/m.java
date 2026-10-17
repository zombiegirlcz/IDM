package xjj;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final unj.f f306544a;

    public m(unj.f mobilePlanCallTimeFormatter) {
        Intrinsics.checkNotNullParameter(mobilePlanCallTimeFormatter, "mobilePlanCallTimeFormatter");
        this.f306544a = mobilePlanCallTimeFormatter;
    }

    public static Click a(String str, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        return new Click(28, (Integer) null, (Object) new EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries(list), str, false);
    }

    public static CellDetailsDelegate.Model b(Boolean bool, Long l2, Long l3, List list, String str, int i, int i2, Function1 function1) {
        Clause clauseM;
        if (Intrinsics.f(bool, Boolean.TRUE)) {
            clauseM = new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_unlimited, null, a(str, list), 10);
        } else {
            if (l2 == null || l3 == null) {
                return null;
            }
            clauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(String.valueOf(((Number) function1.invoke(l2)).longValue()), (Style) a(str, list), (Integer) null, false, (o9) null, (List) null, 124), new TextLocalisedClause(i2, u.c(function1.invoke(l3)), a(str, list), 8)));
        }
        List list2 = list;
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), clauseM, null, new EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries(list), null, null, 0, null, !(list2 == null || list2.isEmpty()), false, null, null, 30648);
    }
}
