package gl8;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.PhoneInputTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f144570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f144571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f144572c;
    public final PhoneInputTextView d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, NavBarWithToolbar navBarWithToolbar, PhoneInputTextView phoneInputTextView) {
        this.f144570a = controllerContainerConstraintLayout;
        this.f144571b = largeActionButton;
        this.f144572c = navBarWithToolbar;
        this.d = phoneInputTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f144570a;
    }
}
