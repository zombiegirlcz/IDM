package q3a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LabeledVerticalScrollView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f241921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LabeledVerticalScrollView f241922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f241923c;
    public final ScreenContentRecyclerView d;

    public c(ControllerContainerFrameLayout controllerContainerFrameLayout, LabeledVerticalScrollView labeledVerticalScrollView, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f241921a = controllerContainerFrameLayout;
        this.f241922b = labeledVerticalScrollView;
        this.f241923c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f241921a;
    }
}
