package a60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.chat.background.AirChatBackgroundView;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptView;
import com.revolut.core.ui_kit.gesture_control.VerticalSnapLayout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.ChatInputLayoutView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerFrameLayout f1522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AirChatBackgroundView f1523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundView f1524c;
    public final FrameLayout d;
    public final ControllerContainerCoordinatorLayout e;
    public final SmallActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Space f1525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ChatInputLayoutView f1526h;
    public final NavBarWithToolbar i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final NestedScrollView f1527j;
    public final ChatPromptView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ScreenContentRecyclerView f1528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final VerticalSnapLayout f1529m;

    public g(ControllerContainerFrameLayout controllerContainerFrameLayout, AirChatBackgroundView airChatBackgroundView, AnimatedBackgroundView animatedBackgroundView, FrameLayout frameLayout, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, SmallActionButton smallActionButton, Space space, ChatInputLayoutView chatInputLayoutView, NavBarWithToolbar navBarWithToolbar, NestedScrollView nestedScrollView, ChatPromptView chatPromptView, ScreenContentRecyclerView screenContentRecyclerView, VerticalSnapLayout verticalSnapLayout) {
        this.f1522a = controllerContainerFrameLayout;
        this.f1523b = airChatBackgroundView;
        this.f1524c = animatedBackgroundView;
        this.d = frameLayout;
        this.e = controllerContainerCoordinatorLayout;
        this.f = smallActionButton;
        this.f1525g = space;
        this.f1526h = chatInputLayoutView;
        this.i = navBarWithToolbar;
        this.f1527j = nestedScrollView;
        this.k = chatPromptView;
        this.f1528l = screenContentRecyclerView;
        this.f1529m = verticalSnapLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f1522a;
    }
}
