package mx0;

import android.view.animation.Animation;
import com.revolut.core.ui_kit.internal.views.AnimatedImageSwitcher;
import com.revolut.core.ui_kit.views.ChatInputView;

/* JADX INFO: loaded from: classes20.dex */
public final class g4 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b4 f209713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedImageSwitcher f209714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatInputView f209715c;

    public g4(b4 b4Var, AnimatedImageSwitcher animatedImageSwitcher, ChatInputView chatInputView) {
        this.f209713a = b4Var;
        this.f209714b = animatedImageSwitcher;
        this.f209715c = chatInputView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.f209713a == null) {
            this.f209714b.setVisibility(8);
            int i = ChatInputView.I0;
            this.f209715c.E(false);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
