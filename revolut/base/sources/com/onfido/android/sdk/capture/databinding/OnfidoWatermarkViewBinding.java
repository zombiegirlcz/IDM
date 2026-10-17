package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoWatermarkViewBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView cobrandImageView;

    @NonNull
    public final TextView companyNameTextView;

    @NonNull
    public final TextView poweredByTextView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatImageView watermarkImageView;

    private OnfidoWatermarkViewBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull AppCompatImageView appCompatImageView2) {
        this.rootView = linearLayout;
        this.cobrandImageView = appCompatImageView;
        this.companyNameTextView = textView;
        this.poweredByTextView = textView2;
        this.watermarkImageView = appCompatImageView2;
    }

    @NonNull
    public static OnfidoWatermarkViewBinding bind(@NonNull View view) {
        int i = R.id.cobrandImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.companyNameTextView;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.poweredByTextView;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.watermarkImageView;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        return new OnfidoWatermarkViewBinding((LinearLayout) view, appCompatImageView, textView, textView2, appCompatImageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoWatermarkViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoWatermarkViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_watermark_view, viewGroup, false);
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
