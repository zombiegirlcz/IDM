package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.detector.rectangle.RectDetectorFrame;
import com.onfido.android.sdk.capture.ui.ZoomImageView;
import com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons;
import com.onfido.android.sdk.capture.ui.camera.OverlayTextView;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview;
import com.onfido.android.sdk.capture.ui.widget.WatermarkView;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentSelfieCaptureBinding implements ViewBinding {

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
    public final ImageView flipArrow;

    @NonNull
    public final FragmentContainerView fragmentContainer;

    @NonNull
    public final RectDetectorFrame onfidoAccessibleRectDetectorFrame;

    @NonNull
    public final OverlayTextView overlayTextContainer;

    @NonNull
    public final OnfidoCaptureValidationBubble postCaptureValidationBubble;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final View toolbar;

    @NonNull
    public final WatermarkView watermark;

    @NonNull
    public final FrameLayout watermarkLayout;

    private OnfidoFragmentSelfieCaptureBinding(@NonNull RelativeLayout relativeLayout, @NonNull CameraSourcePreview cameraSourcePreview, @NonNull PreviewView previewView, @NonNull ConfirmationStepButtons confirmationStepButtons, @NonNull ZoomImageView zoomImageView, @NonNull RelativeLayout relativeLayout2, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FragmentContainerView fragmentContainerView, @NonNull RectDetectorFrame rectDetectorFrame, @NonNull OverlayTextView overlayTextView, @NonNull OnfidoCaptureValidationBubble onfidoCaptureValidationBubble, @NonNull View view, @NonNull WatermarkView watermarkView, @NonNull FrameLayout frameLayout2) {
        this.rootView = relativeLayout;
        this.cameraViewCamera1 = cameraSourcePreview;
        this.cameraViewCameraX = previewView;
        this.confirmationButtons = confirmationStepButtons;
        this.confirmationImage = zoomImageView;
        this.content = relativeLayout2;
        this.contentLayout = frameLayout;
        this.flipArrow = imageView;
        this.fragmentContainer = fragmentContainerView;
        this.onfidoAccessibleRectDetectorFrame = rectDetectorFrame;
        this.overlayTextContainer = overlayTextView;
        this.postCaptureValidationBubble = onfidoCaptureValidationBubble;
        this.toolbar = view;
        this.watermark = watermarkView;
        this.watermarkLayout = frameLayout2;
    }

    @NonNull
    public static OnfidoFragmentSelfieCaptureBinding bind(@NonNull View view) {
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
                            i = R.id.flipArrow;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.fragmentContainer;
                                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                if (fragmentContainerView != null) {
                                    i = R.id.onfido_accessible_rect_detector_frame;
                                    RectDetectorFrame rectDetectorFrame = (RectDetectorFrame) ViewBindings.findChildViewById(view, i);
                                    if (rectDetectorFrame != null) {
                                        i = R.id.overlayTextContainer;
                                        OverlayTextView overlayTextView = (OverlayTextView) ViewBindings.findChildViewById(view, i);
                                        if (overlayTextView != null) {
                                            i = R.id.postCaptureValidationBubble;
                                            OnfidoCaptureValidationBubble onfidoCaptureValidationBubble = (OnfidoCaptureValidationBubble) ViewBindings.findChildViewById(view, i);
                                            if (onfidoCaptureValidationBubble != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbar))) != null) {
                                                i = R.id.watermark;
                                                WatermarkView watermarkView = (WatermarkView) ViewBindings.findChildViewById(view, i);
                                                if (watermarkView != null) {
                                                    i = R.id.watermarkLayout;
                                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (frameLayout2 != null) {
                                                        return new OnfidoFragmentSelfieCaptureBinding(relativeLayout, cameraSourcePreview, previewView, confirmationStepButtons, zoomImageView, relativeLayout, frameLayout, imageView, fragmentContainerView, rectDetectorFrame, overlayTextView, onfidoCaptureValidationBubble, viewFindChildViewById, watermarkView, frameLayout2);
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
    public static OnfidoFragmentSelfieCaptureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentSelfieCaptureBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_selfie_capture, viewGroup, false);
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
