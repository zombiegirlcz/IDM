package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.facealignment;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util.OvalRect;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.WindowHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/facealignment/FaceAlignmentFrameView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bottomLeftCorner", "Landroid/graphics/drawable/Drawable;", "bottomRightCorner", "cornerWidth", "", "pulseAnimator", "Landroid/animation/ObjectAnimator;", "topLeftCorner", "topRightCorner", "getDrawablePaddingCompensation", "onAttachedToWindow", "", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "startPulseAnimation", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceAlignmentFrameView extends View {
    private static final float DRAWABLE_PADDING_COMPENSATION = 50.0f;
    private static final float DRAWABLE_PADDING_COMPENSATION_LOW_DENSITY = 24.0f;
    private static final long PULSE_ANIM_DURATION = 750;
    private static final float PULSE_ANIM_SCALE_UP_VALUE = 1.04f;
    private final Drawable bottomLeftCorner;
    private final Drawable bottomRightCorner;
    private final float cornerWidth;
    private ObjectAnimator pulseAnimator;
    private final Drawable topLeftCorner;
    private final Drawable topRightCorner;

    public FaceAlignmentFrameView(Context context) {
        super(context);
        this.cornerWidth = getContext().getResources().getDimensionPixelSize(R.dimen.onfido_avc_align_face_frame_corner_size);
        this.topLeftCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_top_left_corner);
        this.topRightCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_top_rigth_corner);
        this.bottomLeftCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_bottom_left_corner);
        this.bottomRightCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_bottom_rigth_corner);
    }

    private final float getDrawablePaddingCompensation() {
        return getContext().getResources().getDisplayMetrics().densityDpi >= 240 ? DRAWABLE_PADDING_COMPENSATION : DRAWABLE_PADDING_COMPENSATION_LOW_DENSITY;
    }

    private final void startPulseAnimation() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", PULSE_ANIM_SCALE_UP_VALUE), PropertyValuesHolder.ofFloat("scaleY", PULSE_ANIM_SCALE_UP_VALUE));
        objectAnimatorOfPropertyValuesHolder.setDuration(PULSE_ANIM_DURATION);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfPropertyValuesHolder.start();
        this.pulseAnimator = objectAnimatorOfPropertyValuesHolder;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startPulseAnimation();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.pulseAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        OvalRect ovalRect = OvalRect.INSTANCE;
        int width = getWidth();
        int height = getHeight();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RectF rectF = ovalRect.get(width, height, WindowHelperKt.getWindowSizeClass(context)).toRectF();
        float f = -getDrawablePaddingCompensation();
        rectF.inset(f, f);
        Drawable drawable = this.topLeftCorner;
        if (drawable != null) {
            float f4 = rectF.left;
            float f5 = rectF.top;
            float f6 = this.cornerWidth;
            drawable.setBounds((int) f4, (int) f5, (int) (f4 + f6), (int) (f5 + f6));
        }
        Drawable drawable2 = this.topLeftCorner;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = this.topRightCorner;
        if (drawable3 != null) {
            float f32 = rectF.right;
            float f35 = this.cornerWidth;
            float f36 = rectF.top;
            drawable3.setBounds((int) (f32 - f35), (int) f36, (int) f32, (int) (f36 + f35));
        }
        Drawable drawable4 = this.topRightCorner;
        if (drawable4 != null) {
            drawable4.draw(canvas);
        }
        Drawable drawable5 = this.bottomRightCorner;
        if (drawable5 != null) {
            float f37 = rectF.right;
            float f41 = this.cornerWidth;
            float f42 = rectF.bottom;
            drawable5.setBounds((int) (f37 - f41), (int) (f42 - f41), (int) f37, (int) f42);
        }
        Drawable drawable6 = this.bottomRightCorner;
        if (drawable6 != null) {
            drawable6.draw(canvas);
        }
        Drawable drawable7 = this.bottomLeftCorner;
        if (drawable7 != null) {
            float f57 = rectF.left;
            float f69 = rectF.bottom;
            float f75 = this.cornerWidth;
            drawable7.setBounds((int) f57, (int) (f69 - f75), (int) (f57 + f75), (int) f69);
        }
        Drawable drawable8 = this.bottomLeftCorner;
        if (drawable8 != null) {
            drawable8.draw(canvas);
        }
    }

    public FaceAlignmentFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cornerWidth = getContext().getResources().getDimensionPixelSize(R.dimen.onfido_avc_align_face_frame_corner_size);
        this.topLeftCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_top_left_corner);
        this.topRightCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_top_rigth_corner);
        this.bottomLeftCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_bottom_left_corner);
        this.bottomRightCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_bottom_rigth_corner);
    }

    public FaceAlignmentFrameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.cornerWidth = getContext().getResources().getDimensionPixelSize(R.dimen.onfido_avc_align_face_frame_corner_size);
        this.topLeftCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_top_left_corner);
        this.topRightCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_top_rigth_corner);
        this.bottomLeftCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_bottom_left_corner);
        this.bottomRightCorner = ContextCompat.getDrawable(getContext(), R.drawable.onfido_avc_frame_bottom_rigth_corner);
    }
}
