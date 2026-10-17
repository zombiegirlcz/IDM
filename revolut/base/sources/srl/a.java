package srl;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f265246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TwinHorizontalButton f265247b;

    public a(ControllerContainerFrameLayout controllerContainerFrameLayout, TwinHorizontalButton twinHorizontalButton) {
        this.f265246a = controllerContainerFrameLayout;
        this.f265247b = twinHorizontalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f265246a;
    }
}
