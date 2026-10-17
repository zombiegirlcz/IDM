package cyd;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.statements.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f110086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f110087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f110088c;

    public a(LargeActionButton largeActionButton, BasicNavBar basicNavBar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f110086a = controllerContainerCoordinatorLayout;
        this.f110087b = largeActionButton;
        this.f110088c = basicNavBar;
    }

    public static a a(View view) {
        int i = R$id.goToButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            i = R$id.navBar;
            BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(view, i);
            if (basicNavBar != null) {
                i = R$id.recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                    return new a(largeActionButton, basicNavBar, (ControllerContainerCoordinatorLayout) view);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f110086a;
    }
}
