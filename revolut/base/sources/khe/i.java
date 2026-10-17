package khe;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListScreen;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TotalWealthCategoryListScreen f184104a;

    public i(TotalWealthCategoryListScreen totalWealthCategoryListScreen) {
        this.f184104a = totalWealthCategoryListScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 0 || i == 1) {
            com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar = (com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) this.f184104a.d();
            a2 a2Var = aVar.E;
            if (a2Var != null) {
                a2Var.f(null);
            }
            aVar.f89598t.a();
            aVar.H2(aVar.F, new kh4.b(5));
        }
    }
}
