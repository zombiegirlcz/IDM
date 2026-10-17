package rm1;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f255175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LegacyButtonContainerConstraintLayout f255176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f255177c;
    public final NavBarWithAvatar d;
    public final LargeActionButton e;
    public final LargeActionButton f;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout, FooterTextView footerTextView, NavBarWithAvatar navBarWithAvatar, LargeActionButton largeActionButton, LargeActionButton largeActionButton2) {
        this.f255175a = controllerContainerConstraintLayout;
        this.f255176b = legacyButtonContainerConstraintLayout;
        this.f255177c = footerTextView;
        this.d = navBarWithAvatar;
        this.e = largeActionButton;
        this.f = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f255175a;
    }
}
