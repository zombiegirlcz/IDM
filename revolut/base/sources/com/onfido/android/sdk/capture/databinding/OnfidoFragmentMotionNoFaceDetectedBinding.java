package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentMotionNoFaceDetectedBinding implements ViewBinding {

    @NonNull
    public final ImageView noFaceDetectedErrorIcon;

    @NonNull
    public final OnfidoButton noFaceDetectedStartRecording;

    @NonNull
    private final LinearLayout rootView;

    private OnfidoFragmentMotionNoFaceDetectedBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull OnfidoButton onfidoButton) {
        this.rootView = linearLayout;
        this.noFaceDetectedErrorIcon = imageView;
        this.noFaceDetectedStartRecording = onfidoButton;
    }

    @NonNull
    public static OnfidoFragmentMotionNoFaceDetectedBinding bind(@NonNull View view) {
        int i = R.id.noFaceDetectedErrorIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.noFaceDetectedStartRecording;
            OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
            if (onfidoButton != null) {
                return new OnfidoFragmentMotionNoFaceDetectedBinding((LinearLayout) view, imageView, onfidoButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoFragmentMotionNoFaceDetectedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentMotionNoFaceDetectedBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_motion_no_face_detected, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
