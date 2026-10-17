package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoCaptureButtonVideoBinding implements ViewBinding {

    @NonNull
    public final OnfidoButton livenessControlButton;

    @NonNull
    private final OnfidoButton rootView;

    private OnfidoCaptureButtonVideoBinding(@NonNull OnfidoButton onfidoButton, @NonNull OnfidoButton onfidoButton2) {
        this.rootView = onfidoButton;
        this.livenessControlButton = onfidoButton2;
    }

    @NonNull
    public static OnfidoCaptureButtonVideoBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        OnfidoButton onfidoButton = (OnfidoButton) view;
        return new OnfidoCaptureButtonVideoBinding(onfidoButton, onfidoButton);
    }

    @NonNull
    public static OnfidoCaptureButtonVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoCaptureButtonVideoBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_capture_button_video, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public OnfidoButton getRoot() {
        return this.rootView;
    }
}
