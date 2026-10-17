package w58;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.DateInputView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f294726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f294727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateInputView f294728c;
    public final NavBarWithToolbar d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, DateInputView dateInputView, NavBarWithToolbar navBarWithToolbar) {
        this.f294726a = controllerContainerConstraintLayout;
        this.f294727b = largeActionButton;
        this.f294728c = dateInputView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f294726a;
    }
}
