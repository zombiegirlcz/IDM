package ema;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f127641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f127642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f127643c;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, BasicNavBar basicNavBar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f127641a = controllerContainerCoordinatorLayout;
        this.f127642b = basicNavBar;
        this.f127643c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f127641a;
    }
}
