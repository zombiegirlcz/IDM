package hx5;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import ip0.jm0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qta.f;
import yhm.j;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f156392a = j.b(new hul.c(14));

    public static final class a {
        private a() {
        }

        public static BigDecimal a(BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
            return bigDecimal.multiply(new BigDecimal(100)).setScale(2, RoundingMode.HALF_EVEN);
        }
    }

    public static final ArrayList a(b bVar, int i) {
        List listC = u.c(new jm0("PERFORMANCE_CHART_LIST_ID", null, f0.f322471a, false, null, null, i, true, 0, null, false, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, -198));
        ArrayList arrayList = new ArrayList(w.t(listC, 10));
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            jm0 jm0VarE = jm0.e((jm0) it8.next(), null, null, 0, 0, 0, 0, -257);
            int i2 = R$attr.uikit_dp0;
            int i3 = R$attr.uikit_dp16;
            yp0.b.p(jm0VarE, i2, i2, i3, i3);
            arrayList.add(jm0VarE);
        }
        return arrayList;
    }

    public static TextLocalisedClause b(f fVar, Custom custom) {
        switch (c.f156393a[fVar.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.wealth_history_range_1d, null, custom, 10);
            case 2:
                return new TextLocalisedClause(R$string.wealth_history_range_1w, null, custom, 10);
            case 3:
                return new TextLocalisedClause(R$string.wealth_history_range_1m, null, custom, 10);
            case 4:
                return new TextLocalisedClause(R$string.wealth_history_range_3, null, custom, 10);
            case 5:
                return new TextLocalisedClause(R$string.wealth_history_range_6m, null, custom, 10);
            case 6:
                return new TextLocalisedClause(R$string.wealth_history_range_1y, null, custom, 10);
            case 7:
                return new TextLocalisedClause(R$string.wealth_history_range_5y, null, custom, 10);
            case 8:
                return new TextLocalisedClause(R$string.wealth_history_range_all, null, custom, 10);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
