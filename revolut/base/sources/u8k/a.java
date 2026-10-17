package u8k;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f278248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f278249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LegacyButtonContainerConstraintLayout f278250c;
    public final FooterTextView d;
    public final NavBarWithAvatar e;
    public final ReactionsKeyboardView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScreenContentRecyclerView f278251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LargeActionButton f278252h;
    public final LargeActionButton i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BackgroundWallpaperView f278253j;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, ControllerContainerConstraintLayout controllerContainerConstraintLayout2, LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout, FooterTextView footerTextView, NavBarWithAvatar navBarWithAvatar, ReactionsKeyboardView reactionsKeyboardView, ScreenContentRecyclerView screenContentRecyclerView, LargeActionButton largeActionButton, LargeActionButton largeActionButton2, BackgroundWallpaperView backgroundWallpaperView) {
        this.f278248a = controllerContainerConstraintLayout;
        this.f278249b = controllerContainerConstraintLayout2;
        this.f278250c = legacyButtonContainerConstraintLayout;
        this.d = footerTextView;
        this.e = navBarWithAvatar;
        this.f = reactionsKeyboardView;
        this.f278251g = screenContentRecyclerView;
        this.f278252h = largeActionButton;
        this.i = largeActionButton2;
        this.f278253j = backgroundWallpaperView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f278248a;
    }
}
