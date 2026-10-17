package mm2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.CroppingLayoutView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f207137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f207138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CroppingLayoutView f207139c;
    public final BasicNavBar d;

    public c(ControllerContainerFrameLayout controllerContainerFrameLayout, LargeActionButton largeActionButton, CroppingLayoutView croppingLayoutView, BasicNavBar basicNavBar) {
        this.f207137a = controllerContainerFrameLayout;
        this.f207138b = largeActionButton;
        this.f207139c = croppingLayoutView;
        this.d = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f207137a;
    }
}
