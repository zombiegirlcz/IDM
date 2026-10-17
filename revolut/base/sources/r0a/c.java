package r0a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.payments.social.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, mz9.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments/social/impl/databinding/ScreenTransferOnlyChatBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.transferOnlyScreen_buttonsContainer;
        if (((LinearLayout) ViewBindings.findChildViewById(p0, i)) != null) {
            ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
            i = R$id.transferOnlyScreen_footerButtonsContainer;
            if (((LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.transferOnlyScreen_footerNote;
                FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
                if (footerTextView != null) {
                    i = R$id.transferOnlyScreen_navBar;
                    NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
                    if (navBarWithAvatar != null) {
                        i = R$id.transferOnlyScreen_recyclerView;
                        ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                        if (screenContentRecyclerView != null) {
                            i = R$id.transferOnlyScreen_requestButtonSmall;
                            SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                            if (smallActionButton != null) {
                                i = R$id.transferOnlyScreen_sendButtonSmall;
                                SmallActionButton smallActionButton2 = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                                if (smallActionButton2 != null) {
                                    i = R$id.transferOnlyScreen_suggestionWrapper;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
                                    if (frameLayout != null) {
                                        i = R$id.transferOnlyScreen_wallpaperView;
                                        BackgroundWallpaperView backgroundWallpaperView = (BackgroundWallpaperView) ViewBindings.findChildViewById(p0, i);
                                        if (backgroundWallpaperView != null) {
                                            return new mz9.a(controllerContainerConstraintLayout, footerTextView, navBarWithAvatar, screenContentRecyclerView, smallActionButton, smallActionButton2, frameLayout, backgroundWallpaperView);
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
