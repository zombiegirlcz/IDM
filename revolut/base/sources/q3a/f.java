package q3a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBar;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f241930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBar f241931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f241932c;

    public f(ControllerContainerFrameLayout controllerContainerFrameLayout, NavBar navBar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f241930a = controllerContainerFrameLayout;
        this.f241931b = navBar;
        this.f241932c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f241930a;
    }
}
