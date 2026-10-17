package aw3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f10727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f10728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitImageView f10729c;
    public final NavBarWithToolbar d;
    public final ScreenContentRecyclerView e;

    public u(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, ActionFooterView actionFooterView, UIKitImageView uIKitImageView, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f10727a = controllerContainerCoordinatorLayout;
        this.f10728b = actionFooterView;
        this.f10729c = uIKitImageView;
        this.d = navBarWithToolbar;
        this.e = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10727a;
    }
}
