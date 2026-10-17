package yn1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f315079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithAvatar f315080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f315081c;
    public final LargeActionButton d;
    public final FooterTextView e;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, NavBarWithAvatar navBarWithAvatar, LargeActionButton largeActionButton, LargeActionButton largeActionButton2, FooterTextView footerTextView) {
        this.f315079a = controllerContainerConstraintLayout;
        this.f315080b = navBarWithAvatar;
        this.f315081c = largeActionButton;
        this.d = largeActionButton2;
        this.e = footerTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f315079a;
    }
}
