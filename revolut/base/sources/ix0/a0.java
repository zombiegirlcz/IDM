package ix0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.text.Spannable;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f169207b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f169208c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f169209g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ValueAnimator valueAnimator, Ref$BooleanRef ref$BooleanRef, jq0.t tVar, boolean z, Function0 function0, Ref$BooleanRef ref$BooleanRef2) {
        super(valueAnimator);
        this.d = ref$BooleanRef;
        this.e = tVar;
        this.f169208c = z;
        this.f = function0;
        this.f169209g = ref$BooleanRef2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f169207b) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((Ref$BooleanRef) this.f169209g).f186407a = true;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f169207b) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((Ref$ObjectRef) this.d).f186409a = null;
                break;
            default:
                jq0.t tVar = (jq0.t) this.e;
                View view = tVar.f177400a;
                Intrinsics.checkNotNullParameter(animator, "animator");
                if (!((Ref$BooleanRef) this.d).f186407a) {
                    view.setClipBounds(null);
                    if (!this.f169208c) {
                        view.setVisibility(8);
                        tVar.f = BitmapDescriptorFactory.HUE_RED;
                        tVar.d();
                    }
                }
                Function0 function0 = (Function0) this.f;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f169207b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f169207b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        switch (this.f169207b) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                b0 b0Var = (b0) this.f;
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                b0Var.i = ((Float) animatedValue).floatValue();
                if (this.f169208c) {
                    CharSequence charSequence = (CharSequence) this.f169209g;
                    if (charSequence instanceof Spannable) {
                        b0Var.a((Spannable) charSequence);
                    }
                }
                View view = (View) ((Ref$ObjectRef) this.e).f186409a;
                if (view != null) {
                    view.postInvalidateOnAnimation();
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                jq0.t tVar = (jq0.t) this.e;
                Rect rect = tVar.f177402c;
                Object animatedValue2 = animation.getAnimatedValue();
                Intrinsics.i(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                tVar.f = ((Float) animatedValue2).floatValue();
                tVar.d();
                View view2 = tVar.f177400a;
                int height = view2.getVisibility() == 8 ? 0 : view2.getHeight() - ((int) tVar.f);
                rect.set(0, 0, view2.getWidth(), height);
                view2.setClipBounds(rect);
                Function1 function1 = tVar.d;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(height));
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ValueAnimator valueAnimator, Ref$ObjectRef ref$ObjectRef, b0 b0Var, boolean z, CharSequence charSequence, Ref$ObjectRef ref$ObjectRef2) {
        super(valueAnimator);
        this.d = ref$ObjectRef;
        this.f = b0Var;
        this.f169208c = z;
        this.f169209g = charSequence;
        this.e = ref$ObjectRef2;
    }
}
