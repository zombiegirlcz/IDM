package mw9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ProfileCardView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f209414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f209415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProfileCardView f209416c;

    public c(ControllerContainerFrameLayout controllerContainerFrameLayout, LargeActionButton largeActionButton, ProfileCardView profileCardView) {
        this.f209414a = controllerContainerFrameLayout;
        this.f209415b = largeActionButton;
        this.f209416c = profileCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f209414a;
    }
}
