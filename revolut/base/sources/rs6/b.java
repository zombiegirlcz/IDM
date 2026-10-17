package rs6;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f257020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainer f257021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StoryNavBarContentView f257022c;

    public b(NavBarWithContainer navBarWithContainer, StoryNavBarContentView storyNavBarContentView, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f257020a = controllerContainerCoordinatorLayout;
        this.f257021b = navBarWithContainer;
        this.f257022c = storyNavBarContentView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f257020a;
    }
}
