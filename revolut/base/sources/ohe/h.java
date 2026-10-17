package ohe;

import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h {
    public static final g a(TotalWealthCategoryKey totalWealthCategoryKey) {
        Intrinsics.checkNotNullParameter(totalWealthCategoryKey, "<this>");
        return totalWealthCategoryKey.equals(TotalWealthCategoryKey.Credit.INSTANCE) ? g.Liability : totalWealthCategoryKey instanceof TotalWealthCategoryKey.Youth ? g.Exempt : g.Asset;
    }
}
