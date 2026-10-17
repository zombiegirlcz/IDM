package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentNfcDeviceNotSupportedBinding implements ViewBinding {

    @NonNull
    public final OnfidoButton btnExit;

    @NonNull
    public final ImageView icon;

    @NonNull
    public final OnfidoWatermarkLayoutBinding onfidoInclude3;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView subtitle;

    @NonNull
    public final TextView title;

    private OnfidoFragmentNfcDeviceNotSupportedBinding(@NonNull LinearLayout linearLayout, @NonNull OnfidoButton onfidoButton, @NonNull ImageView imageView, @NonNull OnfidoWatermarkLayoutBinding onfidoWatermarkLayoutBinding, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.btnExit = onfidoButton;
        this.icon = imageView;
        this.onfidoInclude3 = onfidoWatermarkLayoutBinding;
        this.subtitle = textView;
        this.title = textView2;
    }

    @NonNull
    public static OnfidoFragmentNfcDeviceNotSupportedBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.btnExit;
        OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
        if (onfidoButton != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.onfidoInclude3))) != null) {
                OnfidoWatermarkLayoutBinding onfidoWatermarkLayoutBindingBind = OnfidoWatermarkLayoutBinding.bind(viewFindChildViewById);
                i = R.id.subtitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new OnfidoFragmentNfcDeviceNotSupportedBinding((LinearLayout) view, onfidoButton, imageView, onfidoWatermarkLayoutBindingBind, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoFragmentNfcDeviceNotSupportedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentNfcDeviceNotSupportedBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_nfc_device_not_supported, viewGroup, false);
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
