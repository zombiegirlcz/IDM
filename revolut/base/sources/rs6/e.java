package rs6;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f257029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainer f257030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StoryNavBarContentView f257031c;

    public e(NavBarWithContainer navBarWithContainer, StoryNavBarContentView storyNavBarContentView, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f257029a = controllerContainerCoordinatorLayout;
        this.f257030b = navBarWithContainer;
        this.f257031c = storyNavBarContentView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f257029a;
    }
}
