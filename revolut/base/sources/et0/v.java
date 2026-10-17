package et0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.internal.Intrinsics;
import mx0.m4;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f129120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f129121c;
    public final /* synthetic */ ChatBubbleView d;
    public final /* synthetic */ TextView e;
    public final /* synthetic */ TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f129122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f129123h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f129124j;
    public final /* synthetic */ ChatBubbleView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float[] f129125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f129126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f129127n;
    public final /* synthetic */ float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f129128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f129129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f129130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TextView f129131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f129132t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ValueAnimator valueAnimator, z zVar, View view, ChatBubbleView chatBubbleView, TextView textView, TextView textView2, float f, View view2, int i, int i2, ChatBubbleView chatBubbleView2, float[] fArr, int i3, float f4, float f5, float f6, float f32, boolean z, TextView textView3, float f35) {
        super(valueAnimator);
        this.f129120b = zVar;
        this.f129121c = view;
        this.d = chatBubbleView;
        this.e = textView;
        this.f = textView2;
        this.f129122g = f;
        this.f129123h = view2;
        this.i = i;
        this.f129124j = i2;
        this.k = chatBubbleView2;
        this.f129125l = fArr;
        this.f129126m = i3;
        this.f129127n = f4;
        this.o = f5;
        this.f129128p = f6;
        this.f129129q = f32;
        this.f129130r = z;
        this.f129131s = textView3;
        this.f129132t = f35;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        z zVar = this.f129120b;
        zVar.d.getInput$ui_kit_components_release().setAlpha(1.0f);
        m4 replyToView = zVar.getReplyToView();
        if (replyToView != null) {
            replyToView.setAlpha(1.0f);
        }
        p attachmentsView = zVar.getAttachmentsView();
        if (attachmentsView != null) {
            attachmentsView.setAlpha(1.0f);
        }
        this.f129121c.setVisibility(0);
        this.d.setAlpha(1.0f);
        this.e.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        zVar.e();
        zVar.f129162s = false;
        zVar.g();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        z zVar = this.f129120b;
        zVar.d.getInput$ui_kit_components_release().setAlpha(BitmapDescriptorFactory.HUE_RED);
        m4 replyToView = zVar.getReplyToView();
        if (replyToView != null) {
            replyToView.setAlpha(1.0f);
        }
        p attachmentsView = zVar.getAttachmentsView();
        if (attachmentsView != null) {
            attachmentsView.setAlpha(1.0f);
        }
        this.f.setTranslationX(this.f129122g);
        this.f129123h.setVisibility(4);
        zVar.f129162s = true;
        zVar.g();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        int i = this.f129124j;
        int iLerp = AnimationUtils.lerp(this.i, i, fFloatValue);
        z zVar = this.f129120b;
        float[] fArr = zVar.i;
        goi.h hVar = zVar.f129152c;
        if (hVar.f145169b) {
            hVar.a(iLerp, true);
        }
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = zVar.f129150a;
        ChatBubbleView chatBubbleView = this.k;
        float f = knm.b.f(chatBubbleView, controllerContainerCoordinatorLayout);
        float[] fArr2 = this.f129125l;
        fArr2[0] = f;
        float fH = knm.b.h(chatBubbleView, controllerContainerCoordinatorLayout);
        fArr2[1] = fH;
        float f4 = fArr2[0];
        float fLerp = AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.2f, 1.0f, fFloatValue);
        float f5 = this.f129127n;
        fArr[0] = AnimationUtils.lerp(f5, f4, fLerp);
        float f6 = this.o;
        fArr[1] = AnimationUtils.lerp(f6, (fH - this.f129126m) + (iLerp - r1), fLerp);
        float[] fArr3 = zVar.f;
        fArr3[0] = (this.f129128p + fArr[0]) - f5;
        fArr3[1] = (this.f129129q + fArr[1]) - f6;
        zVar.d.getInput$ui_kit_components_release().setAlpha(fLerp);
        if (this.f129130r) {
            float f32 = 1.0f - fLerp;
            m4 replyToView = zVar.getReplyToView();
            if (replyToView != null) {
                replyToView.setAlpha(f32);
            }
            p attachmentsView = zVar.getAttachmentsView();
            if (attachmentsView != null) {
                attachmentsView.setAlpha(f32);
            }
            this.f129131s.setTranslationX(f32 * this.f129132t);
        }
        lq0.p inputTransitionController$ui_kit_components_release = zVar.getInputTransitionController$ui_kit_components_release();
        if (inputTransitionController$ui_kit_components_release != null) {
            inputTransitionController$ui_kit_components_release.b(fFloatValue);
        }
        zVar.f129154h.setAlpha((int) AnimationUtils.lerp(255.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f, fFloatValue));
        chatBubbleView.setAlpha(fFloatValue <= 0.2f ? AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, 0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, fFloatValue) : AnimationUtils.lerp(0.4f, 1.0f, 0.2f, 1.0f, fFloatValue));
        zVar.invalidate();
    }
}
