package ayl;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit.payments.send_message_transition.SendingMessageAnimationContainerLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendingMessageAnimationContainerLayout f11254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SmallActionButton f11255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SmallActionButton f11256c;
    public final ConstraintLayout d;
    public final AppCompatTextView e;
    public final SmallActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChatInputView f11257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScreenContentRecyclerView f11258h;
    public final NavBarWithAvatar i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ScreenContentRecyclerView f11259j;
    public final SendingMessageAnimationContainerLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BackgroundWallpaperView f11260l;

    public a(SendingMessageAnimationContainerLayout sendingMessageAnimationContainerLayout, SmallActionButton smallActionButton, SmallActionButton smallActionButton2, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, SmallActionButton smallActionButton3, ChatInputView chatInputView, ScreenContentRecyclerView screenContentRecyclerView, NavBarWithAvatar navBarWithAvatar, ScreenContentRecyclerView screenContentRecyclerView2, SendingMessageAnimationContainerLayout sendingMessageAnimationContainerLayout2, BackgroundWallpaperView backgroundWallpaperView) {
        this.f11254a = sendingMessageAnimationContainerLayout;
        this.f11255b = smallActionButton;
        this.f11256c = smallActionButton2;
        this.d = constraintLayout;
        this.e = appCompatTextView;
        this.f = smallActionButton3;
        this.f11257g = chatInputView;
        this.f11258h = screenContentRecyclerView;
        this.i = navBarWithAvatar;
        this.f11259j = screenContentRecyclerView2;
        this.k = sendingMessageAnimationContainerLayout2;
        this.f11260l = backgroundWallpaperView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f11254a;
    }
}
