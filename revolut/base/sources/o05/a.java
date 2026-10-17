package o05;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.PhotoHeaderView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f221152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PhotoHeaderView f221153b;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, PhotoHeaderView photoHeaderView) {
        this.f221152a = controllerContainerCoordinatorLayout;
        this.f221153b = photoHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f221152a;
    }
}
