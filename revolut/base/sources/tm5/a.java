package tm5;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.DateInputView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f272156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f272157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateInputView f272158c;
    public final NavBarWithToolbar d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, DateInputView dateInputView, NavBarWithToolbar navBarWithToolbar) {
        this.f272156a = controllerContainerConstraintLayout;
        this.f272157b = largeActionButton;
        this.f272158c = dateInputView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f272156a;
    }
}
