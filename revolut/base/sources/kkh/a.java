package kkh;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f185065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f185066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f185067c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f185065a = controllerContainerCoordinatorLayout;
        this.f185066b = navBarWithToolbar;
        this.f185067c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f185065a;
    }
}
