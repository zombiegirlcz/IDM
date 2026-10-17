package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f174506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatefulAnimatedBackground f174507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ControllerContainerFrameLayout f174508c;

    public d(ControllerContainerFrameLayout controllerContainerFrameLayout, StatefulAnimatedBackground statefulAnimatedBackground, ControllerContainerFrameLayout controllerContainerFrameLayout2) {
        this.f174506a = controllerContainerFrameLayout;
        this.f174507b = statefulAnimatedBackground;
        this.f174508c = controllerContainerFrameLayout2;
    }

    public static d a(View view) {
        int i = R$id.background;
        StatefulAnimatedBackground statefulAnimatedBackground = (StatefulAnimatedBackground) ViewBindings.findChildViewById(view, i);
        if (statefulAnimatedBackground != null) {
            i = R$id.container;
            ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) ViewBindings.findChildViewById(view, i);
            if (controllerContainerFrameLayout != null) {
                return new d((ControllerContainerFrameLayout) view, statefulAnimatedBackground, controllerContainerFrameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174506a;
    }
}
