package o8a;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f222972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LegacyButtonContainerConstraintLayout f222973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f222974c;
    public final NavBarWithAvatar d;
    public final LargeActionButton e;
    public final LargeActionButton f;

    public d(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout, FooterTextView footerTextView, NavBarWithAvatar navBarWithAvatar, LargeActionButton largeActionButton, LargeActionButton largeActionButton2) {
        this.f222972a = controllerContainerConstraintLayout;
        this.f222973b = legacyButtonContainerConstraintLayout;
        this.f222974c = footerTextView;
        this.d = navBarWithAvatar;
        this.e = largeActionButton;
        this.f = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f222972a;
    }
}
