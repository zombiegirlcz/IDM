package hs0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f154847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f154848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f154849c;
    public boolean d;
    public final /* synthetic */ c e;

    public b(c cVar, TextView view, CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.e = cVar;
        this.f154847a = view;
        this.f154848b = charSequence;
        this.f154849c = charSequence2;
    }

    public final void a() {
        this.d = true;
        TextView textView = this.f154847a;
        if (TextUtils.equals(this.f154848b, textView.getText())) {
            textView.setText(this.f154849c);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.d) {
            return;
        }
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.d) {
            return;
        }
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f154847a.setText(this.f154848b);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        c cVar = this.e;
        float f = cVar.f154851a;
        float f4 = cVar.f154852b;
        Intrinsics.checkNotNullParameter(animator, "animator");
        float animatedFraction = animator.getAnimatedFraction();
        TextView textView = this.f154847a;
        if (animatedFraction < 0.5f) {
            float f5 = animatedFraction * 2.0f;
            textView.setAlpha(1.0f - ((1.0f - f) * f5));
            textView.setScaleX(1.0f - ((1.0f - f4) * f5));
            textView.setScaleY(1.0f - ((1.0f - f4) * f5));
            return;
        }
        float f6 = (animatedFraction * 2.0f) - 1.0f;
        textView.setAlpha(((1.0f - f) * f6) + f);
        textView.setScaleX(((1.0f - f4) * f6) + f4);
        textView.setScaleY(((1.0f - f4) * f6) + f4);
        if (this.d) {
            return;
        }
        a();
    }
}
