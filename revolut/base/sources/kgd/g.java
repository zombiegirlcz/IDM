package kgd;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f183966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f183967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f183968c;

    public g(ControllerContainerFrameLayout controllerContainerFrameLayout, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f183966a = controllerContainerFrameLayout;
        this.f183967b = navBarWithToolbar;
        this.f183968c = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f183966a;
    }
}
