package k50;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.revolut.chat_core.R$id;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d2 extends kotlin.jvm.internal.q implements Function1 {
    public static final d2 f = new d2();

    public d2() {
        super(1, a60.g.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/chat_core/databinding/ScreenMessagesListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.airBackground;
        AirChatBackgroundView airChatBackgroundView = (AirChatBackgroundView) ViewBindings.findChildViewById(p0, i);
        if (airChatBackgroundView != null) {
            i = R$id.background;
            AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
            if (animatedBackgroundView != null) {
                i = R$id.bottomContainer;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
                if (frameLayout != null) {
                    i = R$id.coordinatorLayout;
                    ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) ViewBindings.findChildViewById(p0, i);
                    if (controllerContainerCoordinatorLayout != null) {
                        i = R$id.f51198fab;
                        SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                        if (smallActionButton != null) {
                            i = R$id.fabAnchor;
                            Space space = (Space) ViewBindings.findChildViewById(p0, i);
                            if (space != null) {
                                i = R$id.inputLayout;
                                ChatInputLayoutView chatInputLayoutView = (ChatInputLayoutView) ViewBindings.findChildViewById(p0, i);
                                if (chatInputLayoutView != null) {
                                    i = R$id.navBarWithToolbar;
                                    NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                                    if (navBarWithToolbar != null) {
                                        i = R$id.promptContainer;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(p0, i);
                                        if (nestedScrollView != null) {
                                            i = R$id.promptView;
                                            ChatPromptView chatPromptView = (ChatPromptView) ViewBindings.findChildViewById(p0, i);
                                            if (chatPromptView != null) {
                                                i = R$id.recyclerView;
                                                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                                                if (screenContentRecyclerView != null) {
                                                    ControllerContainerFrameLayout controllerContainerFrameLayout = (ControllerContainerFrameLayout) p0;
                                                    i = R$id.verticalSnapLayout;
                                                    VerticalSnapLayout verticalSnapLayout = (VerticalSnapLayout) ViewBindings.findChildViewById(p0, i);
                                                    if (verticalSnapLayout != null) {
                                                        return new a60.g(controllerContainerFrameLayout, airChatBackgroundView, animatedBackgroundView, frameLayout, controllerContainerCoordinatorLayout, smallActionButton, space, chatInputLayoutView, navBarWithToolbar, nestedScrollView, chatPromptView, screenContentRecyclerView, verticalSnapLayout);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
