package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes16.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private boolean useStrokeCap;

    public CircularDrawingDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    private void drawArc(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f4, int i, int i2, int i3) {
        float f5 = f4 >= f ? f4 - f : (f4 + 1.0f) - f;
        float f6 = f % 1.0f;
        if (this.totalTrackLengthFraction < 1.0f) {
            float f32 = f6 + f5;
            if (f32 > 1.0f) {
                drawArc(canvas, paint, f6, 1.0f, i, i2, 0);
                drawArc(canvas, paint, 1.0f, f32, i, 0, i3);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        if (f6 == BitmapDescriptorFactory.HUE_RED && f5 >= 0.99f) {
            f5 += (((degrees * 2.0f) / 360.0f) * (f5 - 0.99f)) / ROUND_CAP_RAMP_DOWN_THRESHHOLD;
        }
        float fLerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f6);
        float fLerp2 = MathUtils.lerp(BitmapDescriptorFactory.HUE_RED, this.totalTrackLengthFraction, f5);
        float degrees2 = (float) Math.toDegrees(i2 / this.adjustedRadius);
        float degrees3 = ((fLerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.adjustedRadius));
        float f35 = (fLerp * 360.0f) + degrees2;
        if (degrees3 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f36 = degrees * 2.0f;
        if (degrees3 < f36) {
            float f37 = degrees3 / f36;
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, (degrees * f37) + f35, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness, f37);
            return;
        }
        float f41 = this.adjustedRadius;
        RectF rectF = new RectF(-f41, -f41, f41, f41);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f42 = f35 + degrees;
        canvas.drawArc(rectF, f42, degrees3 - f36, false, paint);
        if (this.useStrokeCap || this.displayedCornerRadius <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        drawRoundedBlock(canvas, paint, f42, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
        drawRoundedBlock(canvas, paint, (f35 + degrees3) - degrees, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f4, float f5) {
        drawRoundedBlock(canvas, paint, f, f4, f5, 1.0f);
    }

    private int getSize() {
        S s2 = this.spec;
        return (((CircularProgressIndicatorSpec) s2).indicatorInset * 2) + ((CircularProgressIndicatorSpec) s2).indicatorSize;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, float f, boolean z, boolean z3) {
        float fWidth = rect.width() / getPreferredWidth();
        float fHeight = rect.height() / getPreferredHeight();
        S s2 = this.spec;
        float f4 = (((CircularProgressIndicatorSpec) s2).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s2).indicatorInset;
        canvas.translate((f4 * fWidth) + rect.left, (f4 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f5 = -f4;
        canvas.clipRect(f5, f5, f4, f4);
        S s3 = this.spec;
        this.useStrokeCap = ((CircularProgressIndicatorSpec) s3).trackThickness / 2 <= ((CircularProgressIndicatorSpec) s3).trackCornerRadius;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) s3).trackThickness * f;
        this.displayedCornerRadius = Math.min(((CircularProgressIndicatorSpec) s3).trackThickness / 2, ((CircularProgressIndicatorSpec) s3).trackCornerRadius) * f;
        S s4 = this.spec;
        float f6 = (((CircularProgressIndicatorSpec) s4).indicatorSize - ((CircularProgressIndicatorSpec) s4).trackThickness) / 2.0f;
        this.adjustedRadius = f6;
        if (z || z3) {
            if ((z && ((CircularProgressIndicatorSpec) s4).showAnimationBehavior == 2) || (z3 && ((CircularProgressIndicatorSpec) s4).hideAnimationBehavior == 1)) {
                this.adjustedRadius = (((1.0f - f) * ((CircularProgressIndicatorSpec) s4).trackThickness) / 2.0f) + f6;
            } else if ((z && ((CircularProgressIndicatorSpec) s4).showAnimationBehavior == 1) || (z3 && ((CircularProgressIndicatorSpec) s4).hideAnimationBehavior == 2)) {
                this.adjustedRadius = f6 - (((1.0f - f) * ((CircularProgressIndicatorSpec) s4).trackThickness) / 2.0f);
            }
        }
        if (z3 && ((CircularProgressIndicatorSpec) s4).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, int i, int i2) {
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i);
        float f = activeIndicator.startFraction;
        float f4 = activeIndicator.endFraction;
        int i2 = activeIndicator.gapSize;
        drawArc(canvas, paint, f, f4, iCompositeARGBWithAlpha, i2, i2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f4, int i, int i2, int i3) {
        drawArc(canvas, paint, f, f4, MaterialColors.compositeARGBWithAlpha(i, i2), i3, i3);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f4, float f5, float f6) {
        float fMin = (int) Math.min(f5, this.displayedTrackThickness);
        float f32 = f4 / 2.0f;
        float fMin2 = Math.min(f32, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f4) / 2.0f, fMin / 2.0f, f32);
        canvas.save();
        double d = f;
        canvas.translate((float) (Math.cos(Math.toRadians(d)) * ((double) this.adjustedRadius)), (float) (Math.sin(Math.toRadians(d)) * ((double) this.adjustedRadius)));
        canvas.rotate(f);
        canvas.scale(f6, f6);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
