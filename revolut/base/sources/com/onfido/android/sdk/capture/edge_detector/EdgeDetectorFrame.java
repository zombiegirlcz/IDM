package com.onfido.android.sdk.capture.edge_detector;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/edge_detector/EdgeDetectorFrame;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "circlePaint", "Landroid/graphics/Paint;", "detectedEdgesPaint", "edgeDetectionState", "Lcom/onfido/android/sdk/capture/edge_detector/EdgeDetectionResults;", "halfLineWidth", "", "lineHeight", "lineWidth", "placeholderPaint", "whitePaint", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "update", "results", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EdgeDetectorFrame extends RelativeLayout {

    @NotNull
    private final Paint circlePaint;

    @NotNull
    private final Paint detectedEdgesPaint;

    @NotNull
    private EdgeDetectionResults edgeDetectionState;
    private final float halfLineWidth;
    private final float lineHeight;
    private final float lineWidth;

    @NotNull
    private final Paint placeholderPaint;

    @NotNull
    private final Paint whitePaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EdgeDetectorFrame(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = this.halfLineWidth;
        float f4 = width - f;
        float f5 = height - f;
        float f6 = width - this.lineHeight;
        canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f, width, f, this.placeholderPaint);
        float f32 = this.halfLineWidth;
        canvas.drawLine(f32, BitmapDescriptorFactory.HUE_RED, f32, height, this.placeholderPaint);
        canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f5, width, f5, this.placeholderPaint);
        canvas.drawLine(f4, BitmapDescriptorFactory.HUE_RED, f4, height, this.placeholderPaint);
        float f35 = this.halfLineWidth;
        canvas.drawLine(f35, height - this.lineHeight, f35, height, this.whitePaint);
        canvas.drawLine(f4, height - this.lineHeight, f4, height, this.whitePaint);
        float f36 = this.halfLineWidth;
        canvas.drawLine(f36, f36, f36, this.lineHeight, this.whitePaint);
        canvas.drawLine(f4, BitmapDescriptorFactory.HUE_RED, f4, this.lineHeight, this.whitePaint);
        float f37 = this.halfLineWidth;
        canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f37, this.lineHeight, f37, this.whitePaint);
        canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f5, this.lineHeight, f5, this.whitePaint);
        canvas.drawLine(f6, f5, width, f5, this.whitePaint);
        float f41 = this.halfLineWidth;
        canvas.drawLine(f6, f41, width, f41, this.whitePaint);
        if (this.edgeDetectionState.getLeftEdgeDetected()) {
            canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.lineHeight, this.circlePaint);
            canvas.drawCircle(width, BitmapDescriptorFactory.HUE_RED, this.lineHeight, this.circlePaint);
            float f42 = this.halfLineWidth;
            canvas.drawLine(f42, f42, f42, this.lineHeight, this.detectedEdgesPaint);
            float f57 = this.halfLineWidth;
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f57, width, f57, this.detectedEdgesPaint);
            canvas.drawLine(f4, BitmapDescriptorFactory.HUE_RED, f4, this.lineHeight, this.detectedEdgesPaint);
        }
        if (this.edgeDetectionState.getBottomEdgeDetected()) {
            canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.lineHeight, this.circlePaint);
            canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, height, this.lineHeight, this.circlePaint);
            float f69 = this.halfLineWidth;
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f69, this.lineHeight, f69, this.detectedEdgesPaint);
            float f75 = this.halfLineWidth;
            canvas.drawLine(f75, BitmapDescriptorFactory.HUE_RED, f75, height, this.detectedEdgesPaint);
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f5, this.lineHeight, f5, this.detectedEdgesPaint);
        }
        if (this.edgeDetectionState.getRightEdgeDetected()) {
            canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, height, this.lineHeight, this.circlePaint);
            canvas.drawCircle(width, height, this.lineHeight, this.circlePaint);
            float f77 = this.halfLineWidth;
            canvas.drawLine(f77, height - this.lineHeight, f77, height, this.detectedEdgesPaint);
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f5, width, f5, this.detectedEdgesPaint);
            canvas.drawLine(f4, height - this.lineHeight, f4, height, this.detectedEdgesPaint);
        }
        if (this.edgeDetectionState.getTopEdgeDetected()) {
            canvas.drawCircle(width, BitmapDescriptorFactory.HUE_RED, this.lineHeight, this.circlePaint);
            canvas.drawCircle(width, height, this.lineHeight, this.circlePaint);
            canvas.drawLine(f6, f5, width, f5, this.detectedEdgesPaint);
            canvas.drawLine(f4, BitmapDescriptorFactory.HUE_RED, f4, height, this.detectedEdgesPaint);
            float f81 = this.halfLineWidth;
            canvas.drawLine(f6, f81, width, f81, this.detectedEdgesPaint);
        }
    }

    public final void update(@NotNull EdgeDetectionResults results) {
        Intrinsics.checkNotNullParameter(results, "results");
        this.edgeDetectionState = results;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EdgeDetectorFrame(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EdgeDetectorFrame(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        float fDimenInt = ContextUtilsKt.dimenInt(context, R.dimen.onfido_capture_frame_stroke_width);
        this.lineWidth = fDimenInt;
        this.lineHeight = ContextUtilsKt.dimenInt(context, R.dimen.onfido_capture_frame_stroke_height);
        this.halfLineWidth = fDimenInt / 2;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(ContextUtilsKt.color(context, R.color.onfido_light_300_o_30));
        paint.setStrokeWidth(fDimenInt);
        this.placeholderPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(ContextUtilsKt.color(context, R.color.onfido_white));
        paint2.setStrokeWidth(fDimenInt);
        this.whitePaint = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setColor(ContextUtilsKt.color(context, R.color.onfidoPrimaryButtonColor));
        paint3.setStrokeWidth(fDimenInt);
        this.detectedEdgesPaint = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(ContextUtilsKt.color(context, R.color.onfidoPrimaryButtonColor));
        this.circlePaint = paint4;
        this.edgeDetectionState = new EdgeDetectionResults(false, false, false, false);
        setWillNotDraw(false);
    }

    public /* synthetic */ EdgeDetectorFrame(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
