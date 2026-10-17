package o2k;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f221661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LegacyButtonContainerConstraintLayout f221662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f221663c;
    public final NavBarWithAvatar d;
    public final LargeActionButton e;
    public final LargeActionButton f;

    public e(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout, FooterTextView footerTextView, NavBarWithAvatar navBarWithAvatar, LargeActionButton largeActionButton, LargeActionButton largeActionButton2) {
        this.f221661a = controllerContainerConstraintLayout;
        this.f221662b = legacyButtonContainerConstraintLayout;
        this.f221663c = footerTextView;
        this.d = navBarWithAvatar;
        this.e = largeActionButton;
        this.f = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f221661a;
    }
}
