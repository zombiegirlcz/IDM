package mi9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f205621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f205622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f205623c;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, BasicNavBar basicNavBar, LargeActionButton largeActionButton) {
        this.f205621a = controllerContainerConstraintLayout;
        this.f205622b = basicNavBar;
        this.f205623c = largeActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f205621a;
    }
}
