package ce7;

import android.view.View;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f23403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundView f23404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f23405c;
    public final TextView d;

    public c(ControllerContainerConstraintLayout controllerContainerConstraintLayout, AnimatedBackgroundView animatedBackgroundView, TextView textView, TextView textView2) {
        this.f23403a = controllerContainerConstraintLayout;
        this.f23404b = animatedBackgroundView;
        this.f23405c = textView;
        this.d = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f23403a;
    }
}
