package et0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.google.android.material.animation.AnimationUtils;
import kotlin.jvm.internal.Intrinsics;
import mx0.m4;

/* JADX INFO: loaded from: classes19.dex */
public final class y extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f129147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f129148c;
    public final /* synthetic */ int d;
    public final /* synthetic */ kp0.u e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ValueAnimator valueAnimator, z zVar, int i, int i2, kp0.u uVar, int i3) {
        super(valueAnimator);
        this.f129147b = zVar;
        this.f129148c = i;
        this.d = i2;
        this.e = uVar;
        this.f = i3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        z zVar = this.f129147b;
        p attachmentsView = zVar.getAttachmentsView();
        if (attachmentsView != null) {
            attachmentsView.setAlpha(1.0f);
        }
        m4 replyToView = zVar.getReplyToView();
        if (replyToView != null) {
            replyToView.setAlpha(1.0f);
        }
        zVar.e();
        zVar.f129160q = false;
        zVar.g();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        float f = 1.0f - fFloatValue;
        int iLerp = AnimationUtils.lerp(this.f129148c, this.d, fFloatValue);
        z zVar = this.f129147b;
        goi.h hVar = zVar.f129152c;
        if (hVar.f145169b) {
            hVar.a(iLerp, true);
        }
        lq0.p inputTransitionController$ui_kit_components_release = zVar.getInputTransitionController$ui_kit_components_release();
        if (inputTransitionController$ui_kit_components_release != null) {
            inputTransitionController$ui_kit_components_release.b(fFloatValue);
        }
        kp0.u uVar = this.e;
        uVar.itemView.setTranslationY(this.f * f);
        uVar.itemView.setAlpha(fFloatValue);
        p attachmentsView = zVar.getAttachmentsView();
        if (attachmentsView != null) {
            attachmentsView.setAlpha(f);
        }
        m4 replyToView = zVar.getReplyToView();
        if (replyToView != null) {
            replyToView.setAlpha(f);
        }
    }
}
