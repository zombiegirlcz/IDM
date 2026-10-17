package jhe;

import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryListDestination;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$InputData;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements aii.p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TotalWealthCategoryListDestination) {
            return new TotalWealthCategoryListScreen(new TotalWealthCategoryListContract$InputData(((TotalWealthCategoryListDestination) destination).f89580a));
        }
        return null;
    }
}
