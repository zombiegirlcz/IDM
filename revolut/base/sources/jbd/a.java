package jbd;

import android.view.View;
import android.widget.ViewSwitcher;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f172622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f172623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f172624c;
    public final NavBarWithContainer d;
    public final ScreenContentRecyclerView e;
    public final StoryNavBarContentView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewSwitcher f172625g;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, LargeActionButton largeActionButton, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithContainer navBarWithContainer, ScreenContentRecyclerView screenContentRecyclerView, StoryNavBarContentView storyNavBarContentView, ViewSwitcher viewSwitcher) {
        this.f172622a = controllerContainerFrameLayout;
        this.f172623b = largeActionButton;
        this.f172624c = controllerContainerCoordinatorLayout;
        this.d = navBarWithContainer;
        this.e = screenContentRecyclerView;
        this.f = storyNavBarContentView;
        this.f172625g = viewSwitcher;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f172622a;
    }
}
