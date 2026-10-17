package com.fourthline.vision.internal;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.fourthline.vision.internal.z;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class vf extends FrameLayout implements LifecycleObserver, ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xf f37027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d2 f37028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z7 f37029c;
    private final x d;
    private View e;
    private final y9 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FrameLayout.LayoutParams f37030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f37031h;
    private z i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vf(@NotNull Context context, AttributeSet attributeSet, @NotNull xf viewModel, @NotNull d2 mediaCodecDataSource, @NotNull z7 previewCalculator, @NotNull x cameraFocusManager) {
        this(context, attributeSet, 0, viewModel, mediaCodecDataSource, previewCalculator, cameraFocusManager, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(mediaCodecDataSource, "mediaCodecDataSource");
        Intrinsics.checkNotNullParameter(previewCalculator, "previewCalculator");
        Intrinsics.checkNotNullParameter(cameraFocusManager, "cameraFocusManager");
    }

    private final FrameLayout getOverlayContainer() {
        return (FrameLayout) this.f37031h.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private final void onPause() {
        WeakReference<z.a> listener;
        this.f37027a.stop();
        this.f.removeView(this.i);
        o8 mediaRecorderManager = this.f37027a.getMediaRecorderManager();
        if (mediaRecorderManager != null) {
            mediaRecorderManager.setVideoRecorder(null);
        }
        z zVar = this.i;
        if (zVar != null && (listener = zVar.getListener()) != null) {
            listener.clear();
        }
        this.i = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private final void onResume() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        z zVar = new z(context, null, 0, this.f37028b, 6, null);
        this.f.addView(zVar);
        zVar.setListener(new WeakReference<>(this.f37027a));
        o8 mediaRecorderManager = this.f37027a.getMediaRecorderManager();
        if (mediaRecorderManager != null) {
            mediaRecorderManager.setVideoRecorder(zVar);
        }
        this.i = zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout overlayContainer_delegate$lambda$0(Context context, vf vfVar) {
        FrameLayout frameLayout = new FrameLayout(context);
        vfVar.addView(frameLayout, vfVar.f37030g);
        return frameLayout;
    }

    public final void enableDebugView$fourthline_vision_release(@NotNull e2 consumer, boolean z) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Function0<Rect> contentDetectionAreaProvider$fourthline_vision_release = getContentDetectionAreaProvider$fourthline_vision_release();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f2 f2Var = new f2(contentDetectionAreaProvider$fourthline_vision_release, new dg(this, 10), z, null, context, null, 0, 96, null);
        f2Var.setDebugConsumer(consumer);
        addView(f2Var);
    }

    @NotNull
    public final Function0<Rect> getContentDetectionAreaProvider$fourthline_vision_release() {
        return this.d.getContentDetectionAreaProvider();
    }

    @Override // com.fourthline.vision.internal.ja
    public o8 getMediaRecorderManager() {
        return this.f37027a.getMediaRecorderManager();
    }

    public final View getOverlayView$fourthline_vision_release() {
        return this.e;
    }

    @NotNull
    public final Matrix getRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release() {
        return this.f37029c.getRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release();
    }

    @Override // com.fourthline.vision.internal.ja
    @NotNull
    public ka getScannerCallback() {
        return this.f37027a.getScannerCallback();
    }

    @Override // com.fourthline.vision.internal.ja
    public sd getStepConfig() {
        return this.f37027a.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.ja
    public int getStepsCount() {
        return this.f37027a.getStepsCount();
    }

    @Override // com.fourthline.vision.internal.ja
    public boolean isRunning() {
        return this.f37027a.isRunning();
    }

    @Override // com.fourthline.vision.internal.ja
    public void moveToNextStep() {
        this.f37027a.moveToNextStep();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (z) {
            z7 z7Var = this.f37029c;
            z7Var.setupTransformations(i3 - i, i5 - i2);
            this.d.setup(z7Var.getScreenRect$fourthline_vision_release(), z7Var.getCameraPreviewRect$fourthline_vision_release());
            this.f.setScreenRect(z7Var.getPreviewHolderScreenRect$fourthline_vision_release());
        }
    }

    @Override // com.fourthline.vision.internal.ja
    public void resetCurrentStep() {
        this.f37027a.resetCurrentStep();
    }

    @Override // com.fourthline.vision.internal.ja
    public void resetScanner() {
        this.f37027a.resetScanner();
    }

    public final void setContentDetectionAreaProvider$fourthline_vision_release(@NotNull Function0<Rect> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.d.setContentDetectionAreaProvider(function0);
    }

    public final void setOverlayView$fourthline_vision_release(View view) {
        if (!Intrinsics.f(view, this.e)) {
            if (view == null) {
                getOverlayContainer().removeAllViews();
            } else {
                getOverlayContainer().removeAllViews();
                getOverlayContainer().addView(view, this.f37030g);
            }
        }
        this.e = view;
    }

    @Override // com.fourthline.vision.internal.ja, com.fourthline.vision.internal.pd
    public void start() {
        this.f37027a.start();
    }

    @Override // com.fourthline.vision.internal.ja, com.fourthline.vision.internal.pd
    public void stop() {
        this.f37027a.stop();
    }

    @Override // com.fourthline.vision.internal.ja
    public void takeSnapshot() {
        this.f37027a.takeSnapshot();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vf(@NotNull Context context, @NotNull xf viewModel, @NotNull d2 mediaCodecDataSource, @NotNull z7 previewCalculator, @NotNull x cameraFocusManager) {
        this(context, null, 0, viewModel, mediaCodecDataSource, previewCalculator, cameraFocusManager, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(mediaCodecDataSource, "mediaCodecDataSource");
        Intrinsics.checkNotNullParameter(previewCalculator, "previewCalculator");
        Intrinsics.checkNotNullParameter(cameraFocusManager, "cameraFocusManager");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(@NotNull Context context, AttributeSet attributeSet, int i, @NotNull xf viewModel, @NotNull d2 mediaCodecDataSource, @NotNull z7 previewCalculator, @NotNull x cameraFocusManager) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(mediaCodecDataSource, "mediaCodecDataSource");
        Intrinsics.checkNotNullParameter(previewCalculator, "previewCalculator");
        Intrinsics.checkNotNullParameter(cameraFocusManager, "cameraFocusManager");
        this.f37027a = viewModel;
        this.f37028b = mediaCodecDataSource;
        this.f37029c = previewCalculator;
        this.d = cameraFocusManager;
        y9 y9Var = new y9(context);
        addView(y9Var);
        this.f = y9Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 8388727;
        this.f37030g = layoutParams;
        this.f37031h = yhm.j.b(new mh(context, this, 0));
        setBackgroundColor(-16777216);
    }

    public /* synthetic */ vf(Context context, AttributeSet attributeSet, int i, xf xfVar, d2 d2Var, z7 z7Var, x xVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, xfVar, d2Var, z7Var, xVar);
    }
}
