package ytk;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.t10;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f316834a;

    public a(c percentageClauseMapper) {
        Intrinsics.checkNotNullParameter(percentageClauseMapper, "percentageClauseMapper");
        this.f316834a = percentageClauseMapper;
    }

    public static ArrayList a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            t10 t10Var = new t10(a0.d.n("indicator-text-loading-", i2));
            yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(t10Var);
        }
        return arrayList;
    }

    public static List b(Clause value, String indicatorName, int i, int i2) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        RowDelegate.Model model = new RowDelegate.Model("indicator-header-".concat(indicatorName), null, new TextLocalisedClause(i, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(value, null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
        model.B = R$attr.uikit_dp0;
        Unit unit = Unit.f186387a;
        List listK = v.k(model, new PlainTextDelegate.Model("indicator-text-".concat(indicatorName), (UrlImage) null, (Clause) null, new TextLocalisedClause(i2, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32744));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public final List c(Function0 percentValueAccessor, String indicatorName, int i, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(percentValueAccessor, "percentValueAccessor");
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        BigDecimal bigDecimal = (BigDecimal) percentValueAccessor.invoke();
        if (bigDecimal == null) {
            return f0.f322471a;
        }
        Clause clauseB = c.b(this.f316834a, bigDecimal, null, d.ONE, 2);
        if (num != null) {
            clauseB = new TextLocalisedClause(num.intValue(), u.c(clauseB), null, 12);
        }
        return b(clauseB, indicatorName, i, i2);
    }
}
