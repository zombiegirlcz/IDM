package ap0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.google.android.material.animation.AnimationUtils;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatPromptView f8022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8023c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ValueAnimator valueAnimator, ChatPromptView chatPromptView, float f, float f4, float f5, float f6) {
        super(valueAnimator);
        this.f8022b = chatPromptView;
        this.f8023c = f;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        ChatPromptView.Companion companion = ChatPromptView.INSTANCE;
        this.f8022b.l();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        ChatPromptView.Companion companion = ChatPromptView.INSTANCE;
        this.f8022b.l();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        float fLerp = AnimationUtils.lerp(this.f8023c, this.d, fFloatValue);
        ChatPromptView chatPromptView = this.f8022b;
        chatPromptView.setTransitionProgress(fLerp);
        chatPromptView.setTitleTransitionAlpha(AnimationUtils.lerp(this.e, this.f, fFloatValue));
    }
}
