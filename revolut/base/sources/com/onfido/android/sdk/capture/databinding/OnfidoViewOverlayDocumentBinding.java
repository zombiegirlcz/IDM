package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.camera.OverlayView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoViewOverlayDocumentBinding implements ViewBinding {

    @NonNull
    private final OverlayView rootView;

    private OnfidoViewOverlayDocumentBinding(@NonNull OverlayView overlayView) {
        this.rootView = overlayView;
    }

    @NonNull
    public static OnfidoViewOverlayDocumentBinding bind(@NonNull View view) {
        if (view != null) {
            return new OnfidoViewOverlayDocumentBinding((OverlayView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static OnfidoViewOverlayDocumentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoViewOverlayDocumentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_view_overlay_document, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public OverlayView getRoot() {
        return this.rootView;
    }
}
