package ayl;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit.payments.send_message_transition.SendingMessageAnimationContainerLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendingMessageAnimationContainerLayout f11261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f11262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f11263c;
    public final View d;
    public final LegacyButtonContainerConstraintLayout e;
    public final SmallActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NavBarWithAvatar f11264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScreenContentRecyclerView f11265h;
    public final SendingMessageAnimationContainerLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SmallActionButton f11266j;
    public final SmallActionButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SmallActionButton f11267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecyclerView f11268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final BackgroundWallpaperView f11269n;
    public final ScreenContentRecyclerView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ChatInputView f11270p;

    public b(SendingMessageAnimationContainerLayout sendingMessageAnimationContainerLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout, View view, LegacyButtonContainerConstraintLayout legacyButtonContainerConstraintLayout, SmallActionButton smallActionButton, NavBarWithAvatar navBarWithAvatar, ScreenContentRecyclerView screenContentRecyclerView, SendingMessageAnimationContainerLayout sendingMessageAnimationContainerLayout2, SmallActionButton smallActionButton2, SmallActionButton smallActionButton3, SmallActionButton smallActionButton4, RecyclerView recyclerView, BackgroundWallpaperView backgroundWallpaperView, ScreenContentRecyclerView screenContentRecyclerView2, ChatInputView chatInputView) {
        this.f11261a = sendingMessageAnimationContainerLayout;
        this.f11262b = frameLayout;
        this.f11263c = constraintLayout;
        this.d = view;
        this.e = legacyButtonContainerConstraintLayout;
        this.f = smallActionButton;
        this.f11264g = navBarWithAvatar;
        this.f11265h = screenContentRecyclerView;
        this.i = sendingMessageAnimationContainerLayout2;
        this.f11266j = smallActionButton2;
        this.k = smallActionButton3;
        this.f11267l = smallActionButton4;
        this.f11268m = recyclerView;
        this.f11269n = backgroundWallpaperView;
        this.o = screenContentRecyclerView2;
        this.f11270p = chatInputView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f11261a;
    }
}
