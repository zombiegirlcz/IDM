package rs6;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f257017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainer f257018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StoryNavBarContentView f257019c;

    public a(NavBarWithContainer navBarWithContainer, StoryNavBarContentView storyNavBarContentView, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f257017a = controllerContainerCoordinatorLayout;
        this.f257018b = navBarWithContainer;
        this.f257019c = storyNavBarContentView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f257017a;
    }
}
