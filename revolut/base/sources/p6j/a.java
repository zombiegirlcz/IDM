package p6j;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f233338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f233339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f233340c;
    public final ActionFooterView d;

    public a(ActionFooterView actionFooterView, NavBarWithToolbar navBarWithToolbar, ControllerContainerConstraintLayout controllerContainerConstraintLayout, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f233338a = controllerContainerConstraintLayout;
        this.f233339b = navBarWithToolbar;
        this.f233340c = screenContentRecyclerView;
        this.d = actionFooterView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f233338a;
    }
}
