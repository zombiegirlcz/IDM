package o8a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f222966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f222967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f222968c;
    public final LargeActionButton d;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, FooterTextView footerTextView, BasicNavBar basicNavBar, LargeActionButton largeActionButton) {
        this.f222966a = controllerContainerConstraintLayout;
        this.f222967b = footerTextView;
        this.f222968c = basicNavBar;
        this.d = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f222966a;
    }
}
