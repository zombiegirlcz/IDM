package xmb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f307100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollapsingActionButton f307101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarLargeCentred f307102c;
    public final ScreenContentRecyclerView d;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, CollapsingActionButton collapsingActionButton, NavBarLargeCentred navBarLargeCentred, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f307100a = controllerContainerCoordinatorLayout;
        this.f307101b = collapsingActionButton;
        this.f307102c = navBarLargeCentred;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f307100a;
    }
}
