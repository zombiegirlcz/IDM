package com.onfido.android.sdk.capture.audio;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.databinding.OnfidoVolumeAwareViewBinding;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.android.sdk.capture.utils.listeners.AnimatorListener;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import rim.d;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001AB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u00104\u001a\u000205J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000fH\u0002J\u0016\u00109\u001a\u0002052\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u0002050;J\b\u0010<\u001a\u000207H\u0002J\u0012\u0010=\u001a\u0002052\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0006\u0010@\u001a\u000205R\u0014\u0010\t\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010 \u001a\u00020\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000bR\u0014\u0010$\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000bR\u0014\u0010&\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u000bR\u0014\u0010(\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u000bR\u0014\u0010*\u001a\u00020+8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b0\u00101¨\u0006B"}, d2 = {"Lcom/onfido/android/sdk/capture/audio/VolumeWarningView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actualTextHeight", "getActualTextHeight", "()I", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoVolumeAwareViewBinding;", "currentSystemFontScale", "", "getCurrentSystemFontScale", "()F", "maxTextWidth", "getMaxTextWidth", "minHeight", "getMinHeight", "outerHorizontalMargin", "getOuterHorizontalMargin", "speakerSize", "getSpeakerSize", "textHorizontalMargin", "getTextHorizontalMargin", "textLineHeight", "getTextLineHeight", "textLineSpacingAdd", "getTextLineSpacingAdd", "textMaxLines", "getTextMaxLines$onfido_capture_sdk_core_release$annotations", "()V", "getTextMaxLines$onfido_capture_sdk_core_release", "textTopMargin", "getTextTopMargin", "textVerticalMargin", "getTextVerticalMargin", "textWidth", "getTextWidth", "turnSoundOn", "Landroid/widget/TextView;", "getTurnSoundOn$onfido_capture_sdk_core_release", "()Landroid/widget/TextView;", "volumePillHeightAnimator", "Landroid/animation/ValueAnimator;", "getVolumePillHeightAnimator", "()Landroid/animation/ValueAnimator;", "volumePillHeightAnimator$delegate", "Lkotlin/Lazy;", "deflate", "", "hasFinishedForwardAnimation", "", "animationFraction", "inflate", "onFinished", "Lkotlin/Function0;", "isAnimationInProgress", "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "stopAnimation", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VolumeWarningView extends RelativeLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long HEIGHT_ANIMATION_DURATION_MS = 200;
    private static final float LINE_HEIGHT_EXTRA_MULTIPLIER_ABOVE_SCALE = 0.5f;
    private static final float MAX_FONT_SIZE_SCALE_FOR_DEFAULT_LINE_HEIGHT = 1.1f;

    @NotNull
    private final OnfidoVolumeAwareViewBinding binding;

    /* JADX INFO: renamed from: volumePillHeightAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy volumePillHeightAnimator;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/audio/VolumeWarningView$Companion;", "", "()V", "HEIGHT_ANIMATION_DURATION_MS", "", "LINE_HEIGHT_EXTRA_MULTIPLIER_ABOVE_SCALE", "", "MAX_FONT_SIZE_SCALE_FOR_DEFAULT_LINE_HEIGHT", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.audio.VolumeWarningView$deflate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3664invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3664invoke() {
            VolumeWarningView.this.getVolumePillHeightAnimator().reverse();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.audio.VolumeWarningView$inflate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19661 extends u implements Function0<Unit> {
        public static final C19661 INSTANCE = new C19661();

        public C19661() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3665invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3665invoke();
            return Unit.f186387a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VolumeWarningView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getActualTextHeight() {
        return d.c(((this.binding.turnSoundOn.getMaxLines() - 1) * getTextLineSpacingAdd()) + (this.binding.turnSoundOn.getMaxLines() * getTextLineHeight()) + getTextVerticalMargin());
    }

    private final float getCurrentSystemFontScale() {
        return getResources().getConfiguration().fontScale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMaxTextWidth() {
        Object parent = getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
        return ((View) parent).getWidth() - getOuterHorizontalMargin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMinHeight() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iDimen = ContextUtilsKt.dimen(context, R.dimen.onfido_audio_speaker_size);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return (ContextUtilsKt.dimen(context2, R.dimen.onfido_audio_pill_icon_margin) * 2) + iDimen;
    }

    private final int getOuterHorizontalMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        return layoutParams2.leftMargin + layoutParams2.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpeakerSize() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iDimen = ContextUtilsKt.dimen(context, R.dimen.onfido_audio_speaker_size);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return (ContextUtilsKt.dimen(context2, R.dimen.onfido_audio_pill_icon_margin) * 2) + iDimen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTextHorizontalMargin() {
        ViewGroup.LayoutParams layoutParams = this.binding.turnSoundOn.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        return layoutParams2.leftMargin + layoutParams2.rightMargin;
    }

    private final float getTextLineHeight() {
        return this.binding.turnSoundOn.getPaint().getFontMetrics().descent - this.binding.turnSoundOn.getPaint().getFontMetrics().ascent;
    }

    private final float getTextLineSpacingAdd() {
        return this.binding.turnSoundOn.getLineSpacingExtra();
    }

    public static /* synthetic */ void getTextMaxLines$onfido_capture_sdk_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTextTopMargin() {
        return Math.round((getSpeakerSize() - getTextLineHeight()) / 2.0f);
    }

    private final int getTextVerticalMargin() {
        ViewGroup.LayoutParams layoutParams = this.binding.turnSoundOn.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        return layoutParams2.topMargin + layoutParams2.bottomMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTextWidth() {
        TextView turnSoundOn = this.binding.turnSoundOn;
        Intrinsics.checkNotNullExpressionValue(turnSoundOn, "turnSoundOn");
        return ViewExtensionsKt.getTextPixelsWidth$default(turnSoundOn, BitmapDescriptorFactory.HUE_RED, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator getVolumePillHeightAnimator() {
        return (ValueAnimator) this.volumePillHeightAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasFinishedForwardAnimation(float animationFraction) {
        return animationFraction == 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void inflate$default(VolumeWarningView volumeWarningView, Function0 function0, int i, Object obj2) {
        if ((i & 1) != 0) {
            function0 = C19661.INSTANCE;
        }
        volumeWarningView.inflate(function0);
    }

    private final boolean isAnimationInProgress() {
        return getVolumePillHeightAnimator().isRunning() || this.binding.pillView.isAnimationInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$4$lambda$3(OnfidoVolumeAwareViewBinding this_apply, Context context, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(context, "$context");
        this_apply.speaker.onTouchEvent(motionEvent);
        Intrinsics.h(motionEvent);
        Intrinsics.h(view);
        this_apply.pillView.setColor(ContextUtilsKt.colorFromAttr(context, ViewExtensionsKt.isPressedAndContainedInView(motionEvent, view) ? R.attr.onfidoColorActionMainPressed : R.attr.onfidoColorActionMain));
        return false;
    }

    public final void deflate() {
        if (!this.binding.pillView.hasWidth() || isAnimationInProgress()) {
            return;
        }
        this.binding.turnSoundOn.setAlpha(BitmapDescriptorFactory.HUE_RED);
        OnfidoVolumeAwareViewBinding onfidoVolumeAwareViewBinding = this.binding;
        onfidoVolumeAwareViewBinding.pillView.shrink(onfidoVolumeAwareViewBinding.turnSoundOn.getMaxLines() <= 1, new AnonymousClass1());
    }

    public final int getTextMaxLines$onfido_capture_sdk_core_release() {
        if (getCurrentSystemFontScale() > 1.0f) {
            return (int) Math.ceil((getMinHeight() - getTextVerticalMargin()) / (getTextLineHeight() + getTextLineSpacingAdd()));
        }
        return 1;
    }

    @NotNull
    public final TextView getTurnSoundOn$onfido_capture_sdk_core_release() {
        TextView turnSoundOn = this.binding.turnSoundOn;
        Intrinsics.checkNotNullExpressionValue(turnSoundOn, "turnSoundOn");
        return turnSoundOn;
    }

    public final void inflate(@NotNull final Function0<Unit> onFinished) {
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        if (this.binding.pillView.hasWidth() || isAnimationInProgress()) {
            onFinished.invoke();
            return;
        }
        this.binding.turnSoundOn.setMaxLines(getTextMaxLines$onfido_capture_sdk_core_release());
        ValueAnimator volumePillHeightAnimator = getVolumePillHeightAnimator();
        volumePillHeightAnimator.addListener(new AnimatorListener() { // from class: com.onfido.android.sdk.capture.audio.VolumeWarningView$inflate$2$1
            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
                AnimatorListener.DefaultImpls.onAnimationCancel(this, animator);
            }

            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                AnimatorListener.DefaultImpls.onAnimationEnd(this, animation);
                onFinished.invoke();
            }

            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
                AnimatorListener.DefaultImpls.onAnimationRepeat(this, animator);
            }

            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                AnimatorListener.DefaultImpls.onAnimationStart(this, animator);
            }
        });
        volumePillHeightAnimator.start();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        if (info != null) {
            info.setContentDescription(this.binding.turnSoundOn.getText());
        }
        if (info == null) {
            return;
        }
        info.setClassName(Button.class.getName());
    }

    public final void stopAnimation() {
        if (getVolumePillHeightAnimator().isRunning()) {
            getVolumePillHeightAnimator().removeAllListeners();
            getVolumePillHeightAnimator().cancel();
        }
        if (this.binding.pillView.isAnimationInProgress()) {
            this.binding.pillView.stopAnimation();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VolumeWarningView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolumeWarningView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoVolumeAwareViewBinding onfidoVolumeAwareViewBindingInflate = OnfidoVolumeAwareViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoVolumeAwareViewBindingInflate, "inflate(...)");
        this.binding = onfidoVolumeAwareViewBindingInflate;
        setWillNotDraw(false);
        if (getCurrentSystemFontScale() > MAX_FONT_SIZE_SCALE_FOR_DEFAULT_LINE_HEIGHT) {
            TextView textView = onfidoVolumeAwareViewBindingInflate.turnSoundOn;
            textView.setLineSpacing(TypedValue.applyDimension(0, textView.getLineSpacingExtra() * 0.5f, getResources().getDisplayMetrics()), 1.0f);
        }
        TextView turnSoundOn = onfidoVolumeAwareViewBindingInflate.turnSoundOn;
        Intrinsics.checkNotNullExpressionValue(turnSoundOn, "turnSoundOn");
        ViewExtensionsKt.changeLayoutParams(turnSoundOn, new VolumeWarningView$1$1(this));
        setOnTouchListener(new ar0.a(onfidoVolumeAwareViewBindingInflate, context, 1));
        this.volumePillHeightAnimator = j.b(new VolumeWarningView$volumePillHeightAnimator$2(this));
    }

    public /* synthetic */ VolumeWarningView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
