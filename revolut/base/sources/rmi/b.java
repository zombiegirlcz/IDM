package rmi;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.PhotoHeaderView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f255342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PhotoHeaderView f255343b;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, PhotoHeaderView photoHeaderView) {
        this.f255342a = controllerContainerCoordinatorLayout;
        this.f255343b = photoHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f255342a;
    }
}
