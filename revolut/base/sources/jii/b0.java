package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f174498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f174499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f174500c;
    public final ScreenContentRecyclerView d;

    public b0(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithAvatar navBarWithAvatar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f174498a = controllerContainerCoordinatorLayout;
        this.f174499b = largeActionButton;
        this.f174500c = navBarWithAvatar;
        this.d = screenContentRecyclerView;
    }

    public static b0 a(View view) {
        int i = R$id.goToButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            i = R$id.navBarWithAvatar;
            NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(view, i);
            if (navBarWithAvatar != null) {
                i = R$id.recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                if (screenContentRecyclerView != null) {
                    return new b0((ControllerContainerCoordinatorLayout) view, largeActionButton, navBarWithAvatar, screenContentRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174498a;
    }
}
