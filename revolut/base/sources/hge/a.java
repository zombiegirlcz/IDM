package hge;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f152166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f152167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f152168c;

    public a(LargeActionButton largeActionButton, BasicNavBar basicNavBar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f152166a = controllerContainerCoordinatorLayout;
        this.f152167b = largeActionButton;
        this.f152168c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f152166a;
    }
}
