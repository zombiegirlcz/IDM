package aw3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f10706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f10707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsyncDiffRecyclerView f10708c;
    public final NavBarWithToolbar d;

    public n(ControllerContainerLinearLayout controllerContainerLinearLayout, ActionFooterView actionFooterView, AsyncDiffRecyclerView asyncDiffRecyclerView, NavBarWithToolbar navBarWithToolbar) {
        this.f10706a = controllerContainerLinearLayout;
        this.f10707b = actionFooterView;
        this.f10708c = asyncDiffRecyclerView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10706a;
    }
}
