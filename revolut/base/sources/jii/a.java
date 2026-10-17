package jii;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f174491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f174492b;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, AnimatedBackgroundView animatedBackgroundView) {
        this.f174491a = controllerContainerFrameLayout;
        this.f174492b = animatedBackgroundView;
    }

    public static a a(View view) {
        int i = R$id.background;
        AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(view, i);
        if (animatedBackgroundView != null) {
            i = R$id.container;
            if (((ControllerContainerFrameLayout) ViewBindings.findChildViewById(view, i)) != null) {
                return new a((ControllerContainerFrameLayout) view, animatedBackgroundView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f174491a;
    }
}
