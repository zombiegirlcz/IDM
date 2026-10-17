package jd1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.numpad.PosNumpadView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f172938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PosNumpadView f172939b;

    public m(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, PosNumpadView posNumpadView) {
        this.f172938a = controllerContainerCoordinatorLayout;
        this.f172939b = posNumpadView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f172938a;
    }
}
