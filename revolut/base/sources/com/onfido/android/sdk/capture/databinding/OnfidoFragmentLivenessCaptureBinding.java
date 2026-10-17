package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.detector.rectangle.RectDetectorFrame;
import com.onfido.android.sdk.capture.ui.ZoomImageView;
import com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons;
import com.onfido.android.sdk.capture.ui.camera.OverlayTextView;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayView;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview;
import com.onfido.android.sdk.capture.ui.widget.WatermarkView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentLivenessCaptureBinding implements ViewBinding {

    @NonNull
    public final CameraSourcePreview cameraViewCamera1;

    @NonNull
    public final PreviewView cameraViewCameraX;

    @NonNull
    public final ConfirmationStepButtons confirmationButtons;

    @NonNull
    public final ZoomImageView confirmationImage;

    @NonNull
    public final RelativeLayout content;

    @NonNull
    public final FrameLayout contentLayout;

    @NonNull
    public final FragmentContainerView fragmentContainer;

    @NonNull
    public final LivenessOverlayView livenessOverlayView;

    @NonNull
    public final RectDetectorFrame onfidoAccessibleRectDetectorFrame;

    @NonNull
    public final OverlayTextView overlayTextContainer;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final OnfidoViewVideoRecordingIndicatorBinding videoRecordingContainer;

    @NonNull
    public final WatermarkView watermark;

    @NonNull
    public final FrameLayout watermarkLayout;

    private OnfidoFragmentLivenessCaptureBinding(@NonNull RelativeLayout relativeLayout, @NonNull CameraSourcePreview cameraSourcePreview, @NonNull PreviewView previewView, @NonNull ConfirmationStepButtons confirmationStepButtons, @NonNull ZoomImageView zoomImageView, @NonNull RelativeLayout relativeLayout2, @NonNull FrameLayout frameLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull LivenessOverlayView livenessOverlayView, @NonNull RectDetectorFrame rectDetectorFrame, @NonNull OverlayTextView overlayTextView, @NonNull Toolbar toolbar, @NonNull OnfidoViewVideoRecordingIndicatorBinding onfidoViewVideoRecordingIndicatorBinding, @NonNull WatermarkView watermarkView, @NonNull FrameLayout frameLayout2) {
        this.rootView = relativeLayout;
        this.cameraViewCamera1 = cameraSourcePreview;
        this.cameraViewCameraX = previewView;
        this.confirmationButtons = confirmationStepButtons;
        this.confirmationImage = zoomImageView;
        this.content = relativeLayout2;
        this.contentLayout = frameLayout;
        this.fragmentContainer = fragmentContainerView;
        this.livenessOverlayView = livenessOverlayView;
        this.onfidoAccessibleRectDetectorFrame = rectDetectorFrame;
        this.overlayTextContainer = overlayTextView;
        this.toolbar = toolbar;
        this.videoRecordingContainer = onfidoViewVideoRecordingIndicatorBinding;
        this.watermark = watermarkView;
        this.watermarkLayout = frameLayout2;
    }

    @NonNull
    public static OnfidoFragmentLivenessCaptureBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.cameraViewCamera1;
        CameraSourcePreview cameraSourcePreview = (CameraSourcePreview) ViewBindings.findChildViewById(view, i);
        if (cameraSourcePreview != null) {
            i = R.id.cameraViewCameraX;
            PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i);
            if (previewView != null) {
                i = R.id.confirmationButtons;
                ConfirmationStepButtons confirmationStepButtons = (ConfirmationStepButtons) ViewBindings.findChildViewById(view, i);
                if (confirmationStepButtons != null) {
                    i = R.id.confirmationImage;
                    ZoomImageView zoomImageView = (ZoomImageView) ViewBindings.findChildViewById(view, i);
                    if (zoomImageView != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i = R.id.contentLayout;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.fragmentContainer;
                            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                            if (fragmentContainerView != null) {
                                i = R.id.livenessOverlayView;
                                LivenessOverlayView livenessOverlayView = (LivenessOverlayView) ViewBindings.findChildViewById(view, i);
                                if (livenessOverlayView != null) {
                                    i = R.id.onfido_accessible_rect_detector_frame;
                                    RectDetectorFrame rectDetectorFrame = (RectDetectorFrame) ViewBindings.findChildViewById(view, i);
                                    if (rectDetectorFrame != null) {
                                        i = R.id.overlayTextContainer;
                                        OverlayTextView overlayTextView = (OverlayTextView) ViewBindings.findChildViewById(view, i);
                                        if (overlayTextView != null) {
                                            i = R.id.toolbar;
                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
                                            if (toolbar != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.videoRecordingContainer))) != null) {
                                                OnfidoViewVideoRecordingIndicatorBinding onfidoViewVideoRecordingIndicatorBindingBind = OnfidoViewVideoRecordingIndicatorBinding.bind(viewFindChildViewById);
                                                i = R.id.watermark;
                                                WatermarkView watermarkView = (WatermarkView) ViewBindings.findChildViewById(view, i);
                                                if (watermarkView != null) {
                                                    i = R.id.watermarkLayout;
                                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (frameLayout2 != null) {
                                                        return new OnfidoFragmentLivenessCaptureBinding(relativeLayout, cameraSourcePreview, previewView, confirmationStepButtons, zoomImageView, relativeLayout, frameLayout, fragmentContainerView, livenessOverlayView, rectDetectorFrame, overlayTextView, toolbar, onfidoViewVideoRecordingIndicatorBindingBind, watermarkView, frameLayout2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoFragmentLivenessCaptureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentLivenessCaptureBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_liveness_capture, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
