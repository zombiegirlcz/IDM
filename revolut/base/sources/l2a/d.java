package l2a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f191728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicNavBar f191729b;

    public d(ControllerContainerConstraintLayout controllerContainerConstraintLayout, BasicNavBar basicNavBar) {
        this.f191728a = controllerContainerConstraintLayout;
        this.f191729b = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f191728a;
    }
}
