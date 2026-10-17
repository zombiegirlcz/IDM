package p97;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.globalsearch.models.RetailGlobalSearchContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class d {
    public static List a(GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == RetailGlobalSearchContext.LIFESTYLE_HOME ? v.k(t97.d.ONLINE_SHOPS, t97.d.STAYS) : context == RetailGlobalSearchContext.WEALTH_HOME ? v.k(t97.d.TRADE, t97.d.MOST_TRADED, t97.d.TOP_MOVERS, t97.d.SCREENER) : v.k(t97.d.CONVERTER, t97.d.ATMS, t97.d.LEARN, t97.d.HELP, t97.d.REV_POINTS);
    }
}
