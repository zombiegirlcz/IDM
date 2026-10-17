package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes16.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private float trackLength;
    private boolean useStrokeCap;

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    private void drawLine(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f4, int i, int i2, int i3) {
        float f5;
        float fClamp = MathUtils.clamp(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float fClamp2 = MathUtils.clamp(f4, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float fLerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp);
        float fLerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp2);
        int iClamp = (int) ((MathUtils.clamp(fLerp, BitmapDescriptorFactory.HUE_RED, 0.01f) * i2) / 0.01f);
        float fClamp3 = 1.0f - MathUtils.clamp(fLerp2, 0.99f, 1.0f);
        float f6 = this.trackLength;
        int i5 = (int) ((fLerp * f6) + iClamp);
        int i6 = (int) ((fLerp2 * f6) - ((int) ((fClamp3 * i3) / 0.01f)));
        float f32 = (-f6) / 2.0f;
        if (i5 <= i6) {
            float f35 = this.displayedCornerRadius;
            float f36 = i5 + f35;
            float f37 = i6 - f35;
            float f41 = f35 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            if (f36 >= f37) {
                drawRoundedBlock(canvas, paint, new PointF(f36 + f32, BitmapDescriptorFactory.HUE_RED), new PointF(f37 + f32, BitmapDescriptorFactory.HUE_RED), f41, this.displayedTrackThickness);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f42 = f36 + f32;
            float f57 = f37 + f32;
            canvas.drawLine(f42, BitmapDescriptorFactory.HUE_RED, f57, BitmapDescriptorFactory.HUE_RED, paint);
            if (this.useStrokeCap || this.displayedCornerRadius <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f36 > BitmapDescriptorFactory.HUE_RED) {
                f5 = f41;
                drawRoundedBlock(canvas, paint, new PointF(f42, BitmapDescriptorFactory.HUE_RED), f5, this.displayedTrackThickness);
            } else {
                f5 = f41;
            }
            if (f37 < this.trackLength) {
                drawRoundedBlock(canvas, paint, new PointF(f57, BitmapDescriptorFactory.HUE_RED), f5, this.displayedTrackThickness);
            }
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, float f, float f4) {
        drawRoundedBlock(canvas, paint, pointF, null, f, f4);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, float f, boolean z, boolean z3) {
        this.trackLength = rect.width();
        float f4 = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(BitmapDescriptorFactory.HUE_RED, (rect.height() - f4) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f5 = this.trackLength / 2.0f;
        float f6 = f4 / 2.0f;
        canvas.clipRect(-f5, -f6, f5, f6);
        S s2 = this.spec;
        this.useStrokeCap = ((LinearProgressIndicatorSpec) s2).trackThickness / 2 == ((LinearProgressIndicatorSpec) s2).trackCornerRadius;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s2).trackThickness * f;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s2).trackThickness / 2, ((LinearProgressIndicatorSpec) s2).trackCornerRadius) * f;
        if (z || z3) {
            if ((z && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z3 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z3 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(BitmapDescriptorFactory.HUE_RED, ((1.0f - f) * ((LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f);
            }
        }
        if (z3 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, int i, int i2) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i, i2);
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        PointF pointF = new PointF((this.trackLength / 2.0f) - (this.displayedTrackThickness / 2.0f), BitmapDescriptorFactory.HUE_RED);
        S s2 = this.spec;
        drawRoundedBlock(canvas, paint, pointF, ((LinearProgressIndicatorSpec) s2).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s2).trackStopIndicatorSize);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i);
        float f = activeIndicator.startFraction;
        float f4 = activeIndicator.endFraction;
        int i2 = activeIndicator.gapSize;
        drawLine(canvas, paint, f, f4, iCompositeARGBWithAlpha, i2, i2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f4, int i, int i2, int i3) {
        drawLine(canvas, paint, f, f4, MaterialColors.compositeARGBWithAlpha(i, i2), i3, i3);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, PointF pointF2, float f, float f4) {
        float fMin = Math.min(f4, this.displayedTrackThickness);
        float f5 = f / 2.0f;
        float fMin2 = Math.min(f5, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f5, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
