package oud;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.staking.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f229854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f229855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f229856c;

    public a(LargeActionButton largeActionButton, NavBarWithAvatar navBarWithAvatar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f229854a = controllerContainerCoordinatorLayout;
        this.f229855b = largeActionButton;
        this.f229856c = navBarWithAvatar;
    }

    public static a a(View view) {
        int i = R$id.screenStaking_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            i = R$id.screenStaking_navBarWithAvatar;
            NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(view, i);
            if (navBarWithAvatar != null) {
                i = R$id.screenStaking_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                    return new a(largeActionButton, navBarWithAvatar, (ControllerContainerCoordinatorLayout) view);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f229854a;
    }
}
