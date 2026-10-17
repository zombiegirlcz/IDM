package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.WatermarkView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoProgressDialogLayoutBinding implements ViewBinding {

    @NonNull
    public final CircularProgressIndicator onfidoProgressDialogIndicator;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitle;

    @NonNull
    public final TextView title;

    @NonNull
    public final WatermarkView watermark;

    private OnfidoProgressDialogLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WatermarkView watermarkView) {
        this.rootView = constraintLayout;
        this.onfidoProgressDialogIndicator = circularProgressIndicator;
        this.subtitle = textView;
        this.title = textView2;
        this.watermark = watermarkView;
    }

    @NonNull
    public static OnfidoProgressDialogLayoutBinding bind(@NonNull View view) {
        int i = R.id.onfido_progress_dialog_indicator;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
        if (circularProgressIndicator != null) {
            i = R.id.subtitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.watermark;
                    WatermarkView watermarkView = (WatermarkView) ViewBindings.findChildViewById(view, i);
                    if (watermarkView != null) {
                        return new OnfidoProgressDialogLayoutBinding((ConstraintLayout) view, circularProgressIndicator, textView, textView2, watermarkView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoProgressDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoProgressDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_progress_dialog_layout, viewGroup, false);
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
