package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.ui.widget.WatermarkView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoHostedWebModuleFragmentLayoutBinding implements ViewBinding {

    @NonNull
    public final ImageView errorIcon;

    @NonNull
    public final TextView errorTitle;

    @NonNull
    public final WebView onfidoWebView;

    @NonNull
    public final OnfidoButton reloadButton;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final WatermarkView watermark;

    @NonNull
    public final ConstraintLayout webViewErrorLayout;

    private OnfidoHostedWebModuleFragmentLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull WebView webView, @NonNull OnfidoButton onfidoButton, @NonNull WatermarkView watermarkView, @NonNull ConstraintLayout constraintLayout) {
        this.rootView = linearLayout;
        this.errorIcon = imageView;
        this.errorTitle = textView;
        this.onfidoWebView = webView;
        this.reloadButton = onfidoButton;
        this.watermark = watermarkView;
        this.webViewErrorLayout = constraintLayout;
    }

    @NonNull
    public static OnfidoHostedWebModuleFragmentLayoutBinding bind(@NonNull View view) {
        int i = R.id.errorIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.errorTitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.onfidoWebView;
                WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
                if (webView != null) {
                    i = R.id.reloadButton;
                    OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
                    if (onfidoButton != null) {
                        i = R.id.watermark;
                        WatermarkView watermarkView = (WatermarkView) ViewBindings.findChildViewById(view, i);
                        if (watermarkView != null) {
                            i = R.id.webViewErrorLayout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                return new OnfidoHostedWebModuleFragmentLayoutBinding((LinearLayout) view, imageView, textView, webView, onfidoButton, watermarkView, constraintLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoHostedWebModuleFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoHostedWebModuleFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_hosted_web_module_fragment_layout, viewGroup, false);
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
