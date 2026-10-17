package hn3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LabeledVerticalScrollView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f154036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f154037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f154038c;
    public final LabeledVerticalScrollView d;
    public final NavBarWithToolbar e;
    public final ScreenContentRecyclerView f;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, TwinVerticalButton twinVerticalButton, LabeledVerticalScrollView labeledVerticalScrollView, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f154036a = controllerContainerConstraintLayout;
        this.f154037b = largeActionButton;
        this.f154038c = twinVerticalButton;
        this.d = labeledVerticalScrollView;
        this.e = navBarWithToolbar;
        this.f = screenContentRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f154036a;
    }
}
