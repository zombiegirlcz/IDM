package z8k;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.q implements Function1 {
    public static final k f = new k();

    public k() {
        super(1, u8k.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/payments/peer_to_peer/impl/databinding/ScreenTransferPeerToPeerAmountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
        int i = R$id.transferScreen_footerContainer;
        LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout = (LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i);
        if (legacyButtonContainerConstraintLayout != null) {
            i = R$id.transferScreen_footerView;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
            if (footerTextView != null) {
                i = R$id.transferScreen_navigationBar;
                NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithAvatar != null) {
                    i = R$id.transferScreen_reactionsKeyboard;
                    ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) ViewBindings.findChildViewById(p0, i);
                    if (reactionsKeyboardView != null) {
                        i = R$id.transferScreen_recyclerView;
                        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                        if (screenContentRecyclerView != null) {
                            i = R$id.transferScreen_scheduleButton;
                            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                            if (largeActionButton != null) {
                                i = R$id.transferScreen_submitButton;
                                LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                                if (largeActionButton2 != null) {
                                    i = R$id.transferScreen_wallpaperView;
                                    BackgroundWallpaperView backgroundWallpaperView = (BackgroundWallpaperView) ViewBindings.findChildViewById(p0, i);
                                    if (backgroundWallpaperView != null) {
                                        return new u8k.a(controllerContainerConstraintLayout, controllerContainerConstraintLayout, legacyButtonContainerConstraintLayout, footerTextView, navBarWithAvatar, reactionsKeyboardView, screenContentRecyclerView, largeActionButton, largeActionButton2, backgroundWallpaperView);
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
