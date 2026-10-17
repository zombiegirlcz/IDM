package lk1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f196184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FooterTextView f196185b;

    public c(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, FooterTextView footerTextView) {
        this.f196184a = controllerContainerCoordinatorLayout;
        this.f196185b = footerTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f196184a;
    }
}
