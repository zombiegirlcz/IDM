package et0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f129009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f129010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ValueAnimator valueAnimator, e eVar, int i) {
        super(valueAnimator);
        this.f129009b = i;
        this.f129010c = eVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f129009b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f129009b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f129009b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f129009b) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                e eVar = this.f129010c;
                Context context = eVar.e;
                Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
                int iK = kli.a.k(context, 1.0f);
                Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
                int iK2 = kli.a.k(context, 5.0f);
                ImageView imageView = eVar.d;
                imageView.setPadding(iK2, iK, iK2, iK);
                yy0.f.e(or0.u.k(imageView).Q(), eVar.f, eVar.d, null, null, 12);
                imageView.setVisibility(0);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(animator, "animator");
                this.f129010c.d.setVisibility(0);
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                this.f129010c.f129021c.cancel();
                break;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        switch (this.f129009b) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                View view = this.f129010c.f129020b;
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setTranslationY(((Float) animatedValue).floatValue());
                break;
            case 2:
                float fFloatValue = (((Float) z9h.n.g(animation, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue() * 0.1f) + 0.9f;
                e eVar = this.f129010c;
                eVar.d.setScaleX(fFloatValue);
                eVar.d.setScaleY(fFloatValue);
                break;
            case 3:
                float fFloatValue2 = ((Float) z9h.n.g(animation, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                e eVar2 = this.f129010c;
                eVar2.f129020b.setScaleX(fFloatValue2);
                eVar2.f129020b.setScaleY(fFloatValue2);
                break;
            case 4:
                float fFloatValue3 = ((Float) z9h.n.g(animation, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                e eVar3 = this.f129010c;
                eVar3.f129019a.setScaleX(fFloatValue3);
                eVar3.f129019a.setScaleY(fFloatValue3);
                break;
            case 5:
                float fFloatValue4 = ((Float) z9h.n.g(animation, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                float f = 0.9f * fFloatValue4;
                e eVar4 = this.f129010c;
                eVar4.d.setScaleX(f);
                eVar4.d.setScaleY(f);
                eVar4.d.setAlpha(fFloatValue4);
                break;
            default:
                this.f129010c.f129020b.setAlpha(((Float) z9h.n.g(animation, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
        }
    }
}
