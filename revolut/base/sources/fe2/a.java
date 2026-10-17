package fe2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f134431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f134432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f134433c;
    public final NavBarBottomSheet d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, FooterTextView footerTextView, NavBarBottomSheet navBarBottomSheet) {
        this.f134431a = controllerContainerConstraintLayout;
        this.f134432b = largeActionButton;
        this.f134433c = footerTextView;
        this.d = navBarBottomSheet;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f134431a;
    }
}
