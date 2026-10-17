package ok3;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.KeyboardSuggestionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f225895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithToolbar f225896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KeyboardSuggestionsView f225897c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, NavBarWithToolbar navBarWithToolbar, KeyboardSuggestionsView keyboardSuggestionsView) {
        this.f225895a = controllerContainerCoordinatorLayout;
        this.f225896b = navBarWithToolbar;
        this.f225897c = keyboardSuggestionsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f225895a;
    }
}
