package af7;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f3931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsView f3932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitImageView f3933c;
    public final UIKitImageView d;
    public final ConstraintLayout e;
    public final UIKitTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitImageView f3934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f3935h;
    public final UIKitImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final UIKitTextView f3936j;
    public final NavBarWithToolbar k;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ActionsView actionsView, UIKitImageView uIKitImageView, UIKitImageView uIKitImageView2, ConstraintLayout constraintLayout, UIKitTextView uIKitTextView, UIKitImageView uIKitImageView3, UIKitTextView uIKitTextView2, UIKitImageView uIKitImageView4, UIKitTextView uIKitTextView3, NavBarWithToolbar navBarWithToolbar) {
        this.f3931a = controllerContainerConstraintLayout;
        this.f3932b = actionsView;
        this.f3933c = uIKitImageView;
        this.d = uIKitImageView2;
        this.e = constraintLayout;
        this.f = uIKitTextView;
        this.f3934g = uIKitImageView3;
        this.f3935h = uIKitTextView2;
        this.i = uIKitImageView4;
        this.f3936j = uIKitTextView3;
        this.k = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3931a;
    }
}
