package ng8;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LogoWithTaglineView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f215122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LogoWithTaglineView f215123b;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LogoWithTaglineView logoWithTaglineView) {
        this.f215122a = controllerContainerConstraintLayout;
        this.f215123b = logoWithTaglineView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f215122a;
    }
}
