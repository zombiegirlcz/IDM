package wxb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f300807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f300808b;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, AnimatedBackgroundView animatedBackgroundView) {
        this.f300807a = controllerContainerFrameLayout;
        this.f300808b = animatedBackgroundView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f300807a;
    }
}
