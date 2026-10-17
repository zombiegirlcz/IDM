package lve;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerLinearLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerLinearLayout f200366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f200367b;

    public c(ControllerContainerLinearLayout controllerContainerLinearLayout, BasicNavBar basicNavBar) {
        this.f200366a = controllerContainerLinearLayout;
        this.f200367b = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f200366a;
    }
}
