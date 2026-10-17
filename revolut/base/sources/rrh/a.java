package rrh;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f256839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TwinHorizontalButton f256840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TwinVerticalButton f256841c;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, TwinHorizontalButton twinHorizontalButton, TwinVerticalButton twinVerticalButton) {
        this.f256839a = controllerContainerConstraintLayout;
        this.f256840b = twinHorizontalButton;
        this.f256841c = twinVerticalButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f256839a;
    }
}
