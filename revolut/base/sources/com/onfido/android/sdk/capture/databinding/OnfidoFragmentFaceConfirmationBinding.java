package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.ui.widget.WatermarkView;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentFaceConfirmationBinding implements ViewBinding {

    @NonNull
    public final OnfidoCaptureValidationBubble captureValidationBubble;

    @NonNull
    public final OnfidoButton forceRetakePhotoButton;

    @NonNull
    public final TextView headerText;

    @NonNull
    public final ImageView previewImageView;

    @NonNull
    public final Barrier previewImageViewBottomBarrier;

    @NonNull
    public final Barrier previewImageViewTopBarrier;

    @NonNull
    public final OnfidoButton retakePhotoButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final OnfidoButton uploadPhotoButton;

    @NonNull
    public final WatermarkView watermark;

    @NonNull
    public final FrameLayout watermarkLayout;

    private OnfidoFragmentFaceConfirmationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull OnfidoCaptureValidationBubble onfidoCaptureValidationBubble, @NonNull OnfidoButton onfidoButton, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull OnfidoButton onfidoButton2, @NonNull OnfidoButton onfidoButton3, @NonNull WatermarkView watermarkView, @NonNull FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.captureValidationBubble = onfidoCaptureValidationBubble;
        this.forceRetakePhotoButton = onfidoButton;
        this.headerText = textView;
        this.previewImageView = imageView;
        this.previewImageViewBottomBarrier = barrier;
        this.previewImageViewTopBarrier = barrier2;
        this.retakePhotoButton = onfidoButton2;
        this.uploadPhotoButton = onfidoButton3;
        this.watermark = watermarkView;
        this.watermarkLayout = frameLayout;
    }

    @NonNull
    public static OnfidoFragmentFaceConfirmationBinding bind(@NonNull View view) {
        int i = R.id.captureValidationBubble;
        OnfidoCaptureValidationBubble onfidoCaptureValidationBubble = (OnfidoCaptureValidationBubble) ViewBindings.findChildViewById(view, i);
        if (onfidoCaptureValidationBubble != null) {
            i = R.id.forceRetakePhotoButton;
            OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
            if (onfidoButton != null) {
                i = R.id.headerText;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.previewImageView;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.previewImageViewBottomBarrier;
                        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                        if (barrier != null) {
                            i = R.id.previewImageViewTopBarrier;
                            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                            if (barrier2 != null) {
                                i = R.id.retakePhotoButton;
                                OnfidoButton onfidoButton2 = (OnfidoButton) ViewBindings.findChildViewById(view, i);
                                if (onfidoButton2 != null) {
                                    i = R.id.uploadPhotoButton;
                                    OnfidoButton onfidoButton3 = (OnfidoButton) ViewBindings.findChildViewById(view, i);
                                    if (onfidoButton3 != null) {
                                        i = R.id.watermark;
                                        WatermarkView watermarkView = (WatermarkView) ViewBindings.findChildViewById(view, i);
                                        if (watermarkView != null) {
                                            i = R.id.watermarkLayout;
                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                            if (frameLayout != null) {
                                                return new OnfidoFragmentFaceConfirmationBinding((ConstraintLayout) view, onfidoCaptureValidationBubble, onfidoButton, textView, imageView, barrier, barrier2, onfidoButton2, onfidoButton3, watermarkView, frameLayout);
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
    public static OnfidoFragmentFaceConfirmationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentFaceConfirmationBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_face_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
