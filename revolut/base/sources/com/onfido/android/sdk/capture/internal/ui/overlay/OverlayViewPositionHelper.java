package com.onfido.android.sdk.capture.internal.ui.overlay;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.OverlayMetrics;
import com.onfido.android.sdk.capture.ui.camera.OverlayView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0006\u0010(\u001a\u00020\u0005J\u0012\u0010)\u001a\u00020*2\b\b\u0002\u0010#\u001a\u00020$H\u0002J\u0018\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$J\u0018\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010 \u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/overlay/OverlayViewPositionHelper;", "", "context", "Landroid/content/Context;", "aspectRatio", "", "horizontalWeights", "Lcom/onfido/android/sdk/capture/internal/ui/overlay/OverlayViewHorizontalWeights;", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "listener", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView$Listener;", "(Landroid/content/Context;FLcom/onfido/android/sdk/capture/internal/ui/overlay/OverlayViewHorizontalWeights;Lcom/onfido/android/sdk/capture/ui/CaptureType;Lcom/onfido/android/sdk/capture/ui/camera/OverlayView$Listener;)V", "canvasRect", "Landroid/graphics/Rect;", "getListener", "()Lcom/onfido/android/sdk/capture/ui/camera/OverlayView$Listener;", "setListener", "(Lcom/onfido/android/sdk/capture/ui/camera/OverlayView$Listener;)V", "overlayMetrics", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "getOverlayMetrics", "()Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "setOverlayMetrics", "(Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;)V", "overlayViewRectangle", "Landroid/graphics/RectF;", "rectangleTopMargin", "getRectangleTopMargin", "()F", "rectangleTopMargin$delegate", "Lkotlin/Lazy;", "visibleRectangle", "createRectF", "horizontalWeight", "isProofOfAddress", "", "getOverlayHeight", "", "getOverlayWidth", "getVerticalWeight", "onOverlayMetricHasChanged", "", "onViewLaidOut", "updateVisibleHorizontalWeight", "weight", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OverlayViewPositionHelper {
    private final float aspectRatio;

    @NotNull
    private final Rect canvasRect;

    @NotNull
    private final CaptureType captureType;

    @NotNull
    private Context context;

    @NotNull
    private final OverlayViewHorizontalWeights horizontalWeights;
    private OverlayView.Listener listener;

    @NotNull
    private OverlayMetrics overlayMetrics;

    @NotNull
    private RectF overlayViewRectangle;

    /* JADX INFO: renamed from: rectangleTopMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rectangleTopMargin;

    @NotNull
    private RectF visibleRectangle;

    public OverlayViewPositionHelper(@NotNull Context context, float f, @NotNull OverlayViewHorizontalWeights horizontalWeights, @NotNull CaptureType captureType, OverlayView.Listener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(horizontalWeights, "horizontalWeights");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        this.context = context;
        this.aspectRatio = f;
        this.horizontalWeights = horizontalWeights;
        this.captureType = captureType;
        this.listener = listener;
        this.canvasRect = new Rect();
        this.rectangleTopMargin = j.b(new OverlayViewPositionHelper$rectangleTopMargin$2(this));
        this.overlayViewRectangle = new RectF();
        RectF rectF = new RectF();
        this.visibleRectangle = rectF;
        this.overlayMetrics = new OverlayMetrics(rectF, this.overlayViewRectangle, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0);
    }

    private final RectF createRectF(float horizontalWeight, boolean isProofOfAddress) {
        int overlayWidth = getOverlayWidth(horizontalWeight) / 2;
        int overlayHeight = getOverlayHeight(horizontalWeight) / 2;
        int iWidth = this.canvasRect.width() / 2;
        float f = overlayHeight;
        float rectangleTopMargin = (isProofOfAddress ? getRectangleTopMargin() / 2 : getRectangleTopMargin()) + f;
        float overlayHeight2 = horizontalWeight == this.horizontalWeights.getSmallHorizontalWeight() ? (getOverlayHeight(this.horizontalWeights.getBigHorizontalWeight()) - getOverlayHeight(this.horizontalWeights.getSmallHorizontalWeight())) / 2 : 0;
        return new RectF(iWidth - overlayWidth, (rectangleTopMargin - f) + overlayHeight2, iWidth + overlayWidth, rectangleTopMargin + f + overlayHeight2);
    }

    public static /* synthetic */ RectF createRectF$default(OverlayViewPositionHelper overlayViewPositionHelper, float f, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        return overlayViewPositionHelper.createRectF(f, z);
    }

    private final int getOverlayHeight(float horizontalWeight) {
        return (int) (getOverlayWidth(horizontalWeight) * this.aspectRatio);
    }

    private final int getOverlayWidth(float horizontalWeight) {
        return (int) (this.canvasRect.width() * horizontalWeight);
    }

    private final float getRectangleTopMargin() {
        return ((Number) this.rectangleTopMargin.getValue()).floatValue();
    }

    private final void onOverlayMetricHasChanged(boolean isProofOfAddress) {
        this.overlayViewRectangle = createRectF(this.horizontalWeights.getBigHorizontalWeight(), isProofOfAddress);
        RectF rectFCreateRectF = createRectF(this.horizontalWeights.getVisibleHorizontalWeight(), isProofOfAddress);
        this.visibleRectangle = rectFCreateRectF;
        OverlayMetrics overlayMetrics = new OverlayMetrics(rectFCreateRectF, this.overlayViewRectangle, this.horizontalWeights.getBigHorizontalWeight(), getVerticalWeight(), this.canvasRect.height(), this.canvasRect.width());
        this.overlayMetrics = overlayMetrics;
        OverlayView.Listener listener = this.listener;
        if (listener != null) {
            listener.onOverlayMetrics(overlayMetrics);
        }
    }

    public static /* synthetic */ void onOverlayMetricHasChanged$default(OverlayViewPositionHelper overlayViewPositionHelper, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = false;
        }
        overlayViewPositionHelper.onOverlayMetricHasChanged(z);
    }

    public static /* synthetic */ void onViewLaidOut$default(OverlayViewPositionHelper overlayViewPositionHelper, Rect rect, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        overlayViewPositionHelper.onViewLaidOut(rect, z);
    }

    public static /* synthetic */ void updateVisibleHorizontalWeight$default(OverlayViewPositionHelper overlayViewPositionHelper, float f, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        overlayViewPositionHelper.updateVisibleHorizontalWeight(f, z);
    }

    public final OverlayView.Listener getListener() {
        return this.listener;
    }

    @NotNull
    public final OverlayMetrics getOverlayMetrics() {
        return this.overlayMetrics;
    }

    public final float getVerticalWeight() {
        return getOverlayHeight(this.horizontalWeights.getBigHorizontalWeight()) / this.canvasRect.height();
    }

    public final void onViewLaidOut(@NotNull Rect canvasRect, boolean isProofOfAddress) {
        Intrinsics.checkNotNullParameter(canvasRect, "canvasRect");
        if (Intrinsics.f(canvasRect, this.canvasRect)) {
            return;
        }
        this.canvasRect.set(canvasRect);
        onOverlayMetricHasChanged(isProofOfAddress);
    }

    public final void setListener(OverlayView.Listener listener) {
        this.listener = listener;
    }

    public final void setOverlayMetrics(@NotNull OverlayMetrics overlayMetrics) {
        Intrinsics.checkNotNullParameter(overlayMetrics, "<set-?>");
        this.overlayMetrics = overlayMetrics;
    }

    public final void updateVisibleHorizontalWeight(float weight, boolean isProofOfAddress) {
        boolean z = this.horizontalWeights.getVisibleHorizontalWeight() == weight;
        this.horizontalWeights.setVisibleHorizontalWeight(weight);
        if (z) {
            return;
        }
        onOverlayMetricHasChanged(isProofOfAddress);
    }

    public /* synthetic */ OverlayViewPositionHelper(Context context, float f, OverlayViewHorizontalWeights overlayViewHorizontalWeights, CaptureType captureType, OverlayView.Listener listener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, f, overlayViewHorizontalWeights, captureType, (i & 16) != 0 ? null : listener);
    }
}
