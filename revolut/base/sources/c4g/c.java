package c4g;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f21251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f21252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f21253c;
    public final LinearLayout d;
    public final UIKitTextView e;
    public final UIKitTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitTextView f21254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProgressSwitcher f21255h;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, LinearLayout linearLayout, UIKitTextView uIKitTextView, UIKitTextView uIKitTextView2, UIKitTextView uIKitTextView3, ProgressSwitcher progressSwitcher) {
        this.f21251a = controllerContainerCoordinatorLayout;
        this.f21252b = largeActionButton;
        this.f21253c = navBarWithToolbar;
        this.d = linearLayout;
        this.e = uIKitTextView;
        this.f = uIKitTextView2;
        this.f21254g = uIKitTextView3;
        this.f21255h = progressSwitcher;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f21251a;
    }
}
