package srl;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f265248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f265249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f265250c;
    public final ScreenContentRecyclerView d;

    public b(ActionFooterView actionFooterView, NavBarWithToolbar navBarWithToolbar, ControllerContainerConstraintLayout controllerContainerConstraintLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f265248a = controllerContainerConstraintLayout;
        this.f265249b = actionFooterView;
        this.f265250c = navBarWithToolbar;
        this.d = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f265248a;
    }
}
