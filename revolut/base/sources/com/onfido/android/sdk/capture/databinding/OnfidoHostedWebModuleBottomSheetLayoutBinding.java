package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoHostedWebModuleBottomSheetLayoutBinding implements ViewBinding {

    @NonNull
    public final ImageButton buttonClose;

    @NonNull
    public final View dragHandle;

    @NonNull
    public final LinearLayout hostedWebviewDialogLayout;

    @NonNull
    public final WebView onfidoBottomSheetWebView;

    @NonNull
    public final CircularProgressIndicator progressCircular;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ConstraintLayout topLayout;

    private OnfidoHostedWebModuleBottomSheetLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageButton imageButton, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull WebView webView, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull ConstraintLayout constraintLayout) {
        this.rootView = linearLayout;
        this.buttonClose = imageButton;
        this.dragHandle = view;
        this.hostedWebviewDialogLayout = linearLayout2;
        this.onfidoBottomSheetWebView = webView;
        this.progressCircular = circularProgressIndicator;
        this.topLayout = constraintLayout;
    }

    @NonNull
    public static OnfidoHostedWebModuleBottomSheetLayoutBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.buttonClose;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.dragHandle))) != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.onfidoBottomSheetWebView;
            WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
            if (webView != null) {
                i = R.id.progress_circular;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
                if (circularProgressIndicator != null) {
                    i = R.id.topLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        return new OnfidoHostedWebModuleBottomSheetLayoutBinding(linearLayout, imageButton, viewFindChildViewById, linearLayout, webView, circularProgressIndicator, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoHostedWebModuleBottomSheetLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoHostedWebModuleBottomSheetLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_hosted_web_module_bottom_sheet_layout, viewGroup, false);
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
