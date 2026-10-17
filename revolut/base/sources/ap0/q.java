package ap0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptSuggestion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import mx0.a5;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8053c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(ValueAnimator valueAnimator, Object obj2, Object obj3, Object obj4, int i) {
        super(valueAnimator);
        this.f8052b = i;
        this.f8053c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f8052b) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((Ref$BooleanRef) this.e).f186407a = true;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8052b) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((n) this.f8053c).f8043a.onNext((ChatPromptSuggestion) this.d);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((Function1) this.f8053c).invoke(animator);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((Function1) this.f8053c).invoke(animator);
                break;
            default:
                a5 a5Var = (a5) this.d;
                Intrinsics.checkNotNullParameter(animator, "animator");
                if (!((Ref$BooleanRef) this.f8053c).f186407a) {
                    a5Var.f = (a5Var.d - a5Var.getPaddingTop()) - a5Var.getPaddingBottom();
                    a5Var.requestLayout();
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f8052b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f8052b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        switch (this.f8052b) {
            case 0:
                float fFloatValue = ((Float) z9h.n.g(animation, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                View view = (View) this.e;
                view.setScaleX(fFloatValue);
                view.setScaleY(fFloatValue);
                break;
            case 1:
                float fFloatValue2 = ((Float) z9h.n.g(animation, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                iu0.e eVar = (iu0.e) this.d;
                ((iu0.j) this.e).invoke(Integer.valueOf(ColorUtils.blendARGB(eVar.f168433b, eVar.f168434c, fFloatValue2)));
                break;
            case 2:
                float fFloatValue3 = ((Float) z9h.n.g(animation, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                iu0.e eVar2 = (iu0.e) this.d;
                ((Function1) this.e).invoke(Integer.valueOf(ColorUtils.blendARGB(eVar2.f168433b, eVar2.f168434c, fFloatValue3)));
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                a5 a5Var = (a5) this.d;
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                a5Var.e = ((Integer) animatedValue).intValue();
                a5Var.requestLayout();
                break;
        }
    }
}
