package af7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f3928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoryNavBarContentView f3929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainer f3930c;

    public a(NavBarWithContainer navBarWithContainer, StoryNavBarContentView storyNavBarContentView, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f3928a = controllerContainerCoordinatorLayout;
        this.f3929b = storyNavBarContentView;
        this.f3930c = navBarWithContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3928a;
    }
}
