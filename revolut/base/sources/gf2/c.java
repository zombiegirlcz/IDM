package gf2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f143337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LegacyButtonContainerConstraintLayout f143338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f143339c;
    public final CutoutImageView d;
    public final NavBarWithAvatar e;
    public final LargeActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LargeActionButton f143340g;

    public c(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout, FooterTextView footerTextView, CutoutImageView cutoutImageView, NavBarWithAvatar navBarWithAvatar, LargeActionButton largeActionButton, LargeActionButton largeActionButton2) {
        this.f143337a = controllerContainerConstraintLayout;
        this.f143338b = legacyButtonContainerConstraintLayout;
        this.f143339c = footerTextView;
        this.d = cutoutImageView;
        this.e = navBarWithAvatar;
        this.f = largeActionButton;
        this.f143340g = largeActionButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f143337a;
    }
}
