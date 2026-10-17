package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.WatermarkView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoWatermarkLayoutBinding implements ViewBinding {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final WatermarkView watermark;

    @NonNull
    public final FrameLayout watermarkLayout;

    private OnfidoWatermarkLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull WatermarkView watermarkView, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.watermark = watermarkView;
        this.watermarkLayout = frameLayout2;
    }

    @NonNull
    public static OnfidoWatermarkLayoutBinding bind(@NonNull View view) {
        int i = R.id.watermark;
        WatermarkView watermarkView = (WatermarkView) ViewBindings.findChildViewById(view, i);
        if (watermarkView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new OnfidoWatermarkLayoutBinding(frameLayout, watermarkView, frameLayout);
    }

    @NonNull
    public static OnfidoWatermarkLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoWatermarkLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_watermark_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
