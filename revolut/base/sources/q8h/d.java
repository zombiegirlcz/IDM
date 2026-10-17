package q8h;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f243080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionFooterView f243081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasicNavBar f243082c;

    public d(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ActionFooterView actionFooterView, BasicNavBar basicNavBar) {
        this.f243080a = controllerContainerConstraintLayout;
        this.f243081b = actionFooterView;
        this.f243082c = basicNavBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f243080a;
    }
}
