package p36;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f232690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f232691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithAvatar f232692c;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, NavBarWithAvatar navBarWithAvatar) {
        this.f232690a = controllerContainerConstraintLayout;
        this.f232691b = largeActionButton;
        this.f232692c = navBarWithAvatar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f232690a;
    }
}
