package amc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.KeyboardSuggestionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f6298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f6299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f6300c;
    public final KeyboardSuggestionsView d;

    public b(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, KeyboardSuggestionsView keyboardSuggestionsView) {
        this.f6298a = controllerContainerCoordinatorLayout;
        this.f6299b = largeActionButton;
        this.f6300c = navBarWithToolbar;
        this.d = keyboardSuggestionsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f6298a;
    }
}
