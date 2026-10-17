package zz9;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit.payments.R$id;
import com.revolut.ui_kit.payments.send_message_transition.SendingMessageAnimationContainerLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, ayl.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/ui_kit/payments/databinding/ScreenPeerToPeerChatBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View viewFindChildViewById;
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.bottomButtonsContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(p0, i);
        if (frameLayout != null) {
            i = R$id.chatScreen_actionButtonsContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(p0, i);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(p0, (i = R$id.chatScreen_bottomBackground))) != null) {
                i = R$id.chatScreen_chatContentContainer;
                LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout = (LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i);
                if (legacyButtonContainerConstraintLayout != null) {
                    i = R$id.chatScreen_firstSmallButton;
                    SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                    if (smallActionButton != null) {
                        i = R$id.chatScreen_navBar;
                        NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
                        if (navBarWithAvatar != null) {
                            i = R$id.chatScreen_recyclerView;
                            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                            if (screenContentRecyclerView != null) {
                                SendingMessageAnimationContainerLayout sendingMessageAnimationContainerLayout = (SendingMessageAnimationContainerLayout) p0;
                                i = R$id.chatScreen_secondaryActionButtonSmall;
                                SmallActionButton smallActionButton2 = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                                if (smallActionButton2 != null) {
                                    i = R$id.chatScreen_sendAmountButtonTiny;
                                    SmallActionButton smallActionButton3 = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                                    if (smallActionButton3 != null) {
                                        i = R$id.chatScreen_sendButtonSmall;
                                        SmallActionButton smallActionButton4 = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                                        if (smallActionButton4 != null) {
                                            i = R$id.chatScreen_topAlignedRecyclerView;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(p0, i);
                                            if (recyclerView != null) {
                                                i = R$id.chatScreen_wallpaperView;
                                                BackgroundWallpaperView backgroundWallpaperView = (BackgroundWallpaperView) ViewBindings.findChildViewById(p0, i);
                                                if (backgroundWallpaperView != null) {
                                                    i = R$id.chatScreen_warning;
                                                    ScreenContentRecyclerView screenContentRecyclerView2 = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                                                    if (screenContentRecyclerView2 != null) {
                                                        i = R$id.inputView;
                                                        ChatInputView chatInputView = (ChatInputView) ViewBindings.findChildViewById(p0, i);
                                                        if (chatInputView != null) {
                                                            return new ayl.b(sendingMessageAnimationContainerLayout, frameLayout, constraintLayout, viewFindChildViewById, legacyButtonContainerConstraintLayout, smallActionButton, navBarWithAvatar, screenContentRecyclerView, sendingMessageAnimationContainerLayout, smallActionButton2, smallActionButton3, smallActionButton4, recyclerView, backgroundWallpaperView, screenContentRecyclerView2, chatInputView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
