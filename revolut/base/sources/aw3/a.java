package aw3;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f10666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsyncDiffRecyclerView f10667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ControllerContainerLinearLayout f10668c;
    public final LargeActionButton d;
    public final NavBarWithToolbar e;
    public final ScreenContentRecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TwinVerticalButton f10669g;

    public a(ControllerContainerLinearLayout controllerContainerLinearLayout, AsyncDiffRecyclerView asyncDiffRecyclerView, ControllerContainerLinearLayout controllerContainerLinearLayout2, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, ScreenContentRecyclerView screenContentRecyclerView, TwinVerticalButton twinVerticalButton) {
        this.f10666a = controllerContainerLinearLayout;
        this.f10667b = asyncDiffRecyclerView;
        this.f10668c = controllerContainerLinearLayout2;
        this.d = largeActionButton;
        this.e = navBarWithToolbar;
        this.f = screenContentRecyclerView;
        this.f10669g = twinVerticalButton;
    }

    public static a a(View view) {
        int i = R$id.calculatorScreen_bottomRecyclerView;
        AsyncDiffRecyclerView asyncDiffRecyclerView = (AsyncDiffRecyclerView) ViewBindings.findChildViewById(view, i);
        if (asyncDiffRecyclerView != null) {
            i = R$id.calculatorScreen_footerContainer;
            ControllerContainerLinearLayout controllerContainerLinearLayout = (ControllerContainerLinearLayout) ViewBindings.findChildViewById(view, i);
            if (controllerContainerLinearLayout != null) {
                i = R$id.calculatorScreen_gradient;
                if (((LinearLayout) ViewBindings.findChildViewById(view, i)) != null) {
                    i = R$id.calculatorScreen_largeButton;
                    LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
                    if (largeActionButton != null) {
                        i = R$id.calculatorScreen_navBarWithToolbar;
                        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i);
                        if (navBarWithToolbar != null) {
                            i = R$id.calculatorScreen_recyclerView;
                            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i);
                            if (screenContentRecyclerView != null) {
                                i = R$id.calculatorScreen_twinVerticalButton;
                                TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(view, i);
                                if (twinVerticalButton != null) {
                                    return new a((ControllerContainerLinearLayout) view, asyncDiffRecyclerView, controllerContainerLinearLayout, largeActionButton, navBarWithToolbar, screenContentRecyclerView, twinVerticalButton);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f10666a;
    }
}
