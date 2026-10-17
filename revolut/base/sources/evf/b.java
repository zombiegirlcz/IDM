package evf;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.DateInputView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f129787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f129788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateInputView f129789c;
    public final NavBarWithToolbar d;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, DateInputView dateInputView, NavBarWithToolbar navBarWithToolbar) {
        this.f129787a = controllerContainerConstraintLayout;
        this.f129788b = largeActionButton;
        this.f129789c = dateInputView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f129787a;
    }
}
