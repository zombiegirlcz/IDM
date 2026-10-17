package amc;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f6295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f6296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinHorizontalButton f6297c;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, BasicNavBar basicNavBar, TwinHorizontalButton twinHorizontalButton) {
        this.f6295a = controllerContainerConstraintLayout;
        this.f6296b = basicNavBar;
        this.f6297c = twinHorizontalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f6295a;
    }
}
