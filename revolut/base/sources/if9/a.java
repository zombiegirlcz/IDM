package if9;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f160966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithAvatar f160967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f160968c;
    public final LargeActionButton d;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, NavBarWithAvatar navBarWithAvatar, LargeActionButton largeActionButton, LargeActionButton largeActionButton2) {
        this.f160966a = controllerContainerConstraintLayout;
        this.f160967b = navBarWithAvatar;
        this.f160968c = largeActionButton;
        this.d = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f160966a;
    }
}
