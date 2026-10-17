package h2e;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f148804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsView f148805b;

    public e(ControllerContainerFrameLayout controllerContainerFrameLayout, ActionsView actionsView) {
        this.f148804a = controllerContainerFrameLayout;
        this.f148805b = actionsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f148804a;
    }
}
