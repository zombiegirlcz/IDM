package dok;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final CompositeClause a(List list) {
        Click click;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<PricingPlanTextDescriptor> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (PricingPlanTextDescriptor pricingPlanTextDescriptor : list2) {
            String str = pricingPlanTextDescriptor.f81148a;
            PricingPlanTextDescriptor.Action action = pricingPlanTextDescriptor.f81149b;
            if (action == null) {
                click = null;
            } else {
                if (!(action instanceof PricingPlanTextDescriptor.Action.UrlNavigation)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str2 = ((PricingPlanTextDescriptor.Action.UrlNavigation) action).f81150a;
                click = new Click(28, (Integer) null, (Object) str2, str2, false);
            }
            arrayList.add(new TextClause(str, (Style) click, (Integer) null, false, (o9) null, (List) null, 124));
        }
        return new CompositeClause(arrayList, null, null, null, 14);
    }

    public static MoneyClause b(dj0.d dVar, MoneyClause.Format format, Style style, o9 sensitivity, int i) {
        if ((i & 1) != 0) {
            format = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        }
        if ((i & 2) != 0) {
            style = null;
        }
        if ((i & 4) != 0) {
            sensitivity = o9.NON_SENSITIVE;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        return new MoneyClause(dVar, format, style, sensitivity);
    }

    public static TimeClause c(DateTime dateTime) {
        TimeClause.Format.INSTANCE.getClass();
        TimeClause.Format.DateMedium format = TimeClause.Format.f57959a;
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return new TimeClause(dateTime.getMillis(), format, null, null, 12);
    }

    public static final Clause d(Clause clause, Custom custom) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        return custom != null ? new CompositeClause(u.c(clause), null, custom, null, 10) : clause;
    }
}
