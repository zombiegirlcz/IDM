package q64;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends RecyclerView.OnScrollListener implements AppBarLayout.OnOffsetChangedListener {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f242476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenContentRecyclerView f242477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f242478c;
    public final q56.o d;
    public boolean e;
    public boolean f;

    public c(ControllerContainerCoordinatorLayout root, ScreenContentRecyclerView recyclerView, TwinVerticalButton twinVerticalButton, q56.o action) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(twinVerticalButton, "twinVerticalButton");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f242476a = root;
        this.f242477b = recyclerView;
        this.f242478c = twinVerticalButton;
        this.d = action;
    }

    public final boolean b() {
        View viewFindViewByPosition;
        if (!this.e || !this.f) {
            ScreenContentRecyclerView screenContentRecyclerView = this.f242477b;
            RecyclerView.LayoutManager layoutManager = screenContentRecyclerView.getLayoutManager();
            Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            RecyclerView.Adapter adapter = screenContentRecyclerView.getAdapter();
            if (iFindLastVisibleItemPosition == (adapter != null ? adapter.getItemCount() : 0) - 1 && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition)) != null) {
                int[] iArr = {0, 0};
                viewFindViewByPosition.getLocationOnScreen(iArr);
                Context context = this.f242478c.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (viewFindViewByPosition.getHeight() + iArr[1] <= this.f242476a.getHeight() - kli.a.k(context, 160.0f)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        this.f = !this.f242477b.canScrollVertically(1);
        this.e = Math.abs(i) == appBarLayout.getTotalScrollRange();
        this.d.invoke(Boolean.valueOf(b()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f = !recyclerView.canScrollVertically(1);
        this.d.invoke(Boolean.valueOf(b()));
    }
}
