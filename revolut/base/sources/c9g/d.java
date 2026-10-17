package c9g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f22387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f22388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithBigTile f22389c;
    public final ScreenContentRecyclerView d;

    public d(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithBigTile navBarWithBigTile, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f22387a = controllerContainerCoordinatorLayout;
        this.f22388b = largeActionButton;
        this.f22389c = navBarWithBigTile;
        this.d = screenContentRecyclerView;
    }

    public static d a(View view) {
        int i = R$id.roomDetailsScreen_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) view;
            int i2 = R$id.roomDetailsScreen_navBarPhoto;
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(view, i2);
            if (navBarWithBigTile != null) {
                i2 = R$id.roomDetailsScreen_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i2);
                if (screenContentRecyclerView != null) {
                    return new d(controllerContainerCoordinatorLayout, largeActionButton, navBarWithBigTile, screenContentRecyclerView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f22387a;
    }
}
