package ktb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f189514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerFrameLayout f189515b;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ControllerContainerFrameLayout controllerContainerFrameLayout) {
        this.f189514a = controllerContainerCoordinatorLayout;
        this.f189515b = controllerContainerFrameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f189514a;
    }
}
