package zl7;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static final void a(BaseRecyclerViewScreen baseRecyclerViewScreen, NavBarWithToolbar appBarLayout, RecyclerView recyclerView, Function1 action) {
        Intrinsics.checkNotNullParameter(baseRecyclerViewScreen, "<this>");
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(action, "action");
        d dVar = new d(recyclerView, action);
        appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) dVar);
        recyclerView.addOnScrollListener(dVar);
        baseRecyclerViewScreen.k2(new zf5.b(appBarLayout, 1, dVar, recyclerView));
    }
}
