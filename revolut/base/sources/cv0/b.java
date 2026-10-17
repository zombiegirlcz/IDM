package cv0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import kotlin.jvm.internal.Intrinsics;
import yp0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TagView f109215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f109216c;
    public final /* synthetic */ ValueAnimator d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ValueAnimator valueAnimator, TagView tagView, boolean z, ValueAnimator valueAnimator2) {
        super(valueAnimator);
        this.f109215b = tagView;
        this.f109216c = z;
        this.d = valueAnimator2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        int i = !this.f109216c ? 1 : 0;
        TagView.Companion companion = TagView.INSTANCE;
        TagView tagView = this.f109215b;
        tagView.f(i);
        tagView.o = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        TagView.Companion companion = TagView.INSTANCE;
        this.f109215b.f(2);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = this.d.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        TagView tagView = this.f109215b;
        tagView.f57632p = fFloatValue;
        tagView.setExpansion(fFloatValue);
    }
}
