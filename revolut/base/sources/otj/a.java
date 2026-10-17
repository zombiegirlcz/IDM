package otj;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.MarketingPhotoHeaderContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f229719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MarketingPhotoHeaderContentView f229720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainer f229721c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, MarketingPhotoHeaderContentView marketingPhotoHeaderContentView, NavBarWithContainer navBarWithContainer) {
        this.f229719a = controllerContainerCoordinatorLayout;
        this.f229720b = marketingPhotoHeaderContentView;
        this.f229721c = navBarWithContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f229719a;
    }
}
