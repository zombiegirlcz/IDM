package bs9;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
public final /* synthetic */ class h extends kotlin.jvm.internal.q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, ayl.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/ui_kit/payments/databinding/ScreenGroupChatConversationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.groupChatConversation_buttonPrimary;
        SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
        if (smallActionButton != null) {
            i = R$id.groupChatConversation_buttonSecondary;
            SmallActionButton smallActionButton2 = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
            if (smallActionButton2 != null) {
                i = R$id.groupChatConversation_buttonsContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(p0, i);
                if (constraintLayout != null) {
                    i = R$id.groupChatConversation_container;
                    if (((LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                        i = R$id.groupChatConversation_disclaimerView;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(p0, i);
                        if (appCompatTextView != null) {
                            i = R$id.groupChatConversation_firstSmallButton;
                            SmallActionButton smallActionButton3 = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
                            if (smallActionButton3 != null) {
                                i = R$id.groupChatConversation_inputView;
                                ChatInputView chatInputView = (ChatInputView) ViewBindings.findChildViewById(p0, i);
                                if (chatInputView != null) {
                                    i = R$id.groupChatConversation_mentionPicker;
                                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                                    if (screenContentRecyclerView != null) {
                                        i = R$id.groupChatConversation_navBar;
                                        NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
                                        if (navBarWithAvatar != null) {
                                            i = R$id.groupChatConversation_recyclerView;
                                            ScreenContentRecyclerView screenContentRecyclerView2 = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                                            if (screenContentRecyclerView2 != null) {
                                                SendingMessageAnimationContainerLayout sendingMessageAnimationContainerLayout = (SendingMessageAnimationContainerLayout) p0;
                                                i = R$id.groupChatConversation_wallpaperView;
                                                BackgroundWallpaperView backgroundWallpaperView = (BackgroundWallpaperView) ViewBindings.findChildViewById(p0, i);
                                                if (backgroundWallpaperView != null) {
                                                    return new ayl.a(sendingMessageAnimationContainerLayout, smallActionButton, smallActionButton2, constraintLayout, appCompatTextView, smallActionButton3, chatInputView, screenContentRecyclerView, navBarWithAvatar, screenContentRecyclerView2, sendingMessageAnimationContainerLayout, backgroundWallpaperView);
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
