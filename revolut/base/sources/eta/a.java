package eta;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.ui_easter_egg.EmojiEmitterView;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f129395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmojiEmitterView f129396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f129397c;
    public final NavBarWithBigTile d;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, EmojiEmitterView emojiEmitterView, LargeActionButton largeActionButton, NavBarWithBigTile navBarWithBigTile) {
        this.f129395a = controllerContainerCoordinatorLayout;
        this.f129396b = emojiEmitterView;
        this.f129397c = largeActionButton;
        this.d = navBarWithBigTile;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f129395a;
    }
}
