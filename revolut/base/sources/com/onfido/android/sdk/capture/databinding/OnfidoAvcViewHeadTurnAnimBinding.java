package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.OnfidoAnimWebView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoAvcViewHeadTurnAnimBinding implements ViewBinding {

    @NonNull
    public final OnfidoAnimWebView animWebView;

    @NonNull
    private final FrameLayout rootView;

    private OnfidoAvcViewHeadTurnAnimBinding(@NonNull FrameLayout frameLayout, @NonNull OnfidoAnimWebView onfidoAnimWebView) {
        this.rootView = frameLayout;
        this.animWebView = onfidoAnimWebView;
    }

    @NonNull
    public static OnfidoAvcViewHeadTurnAnimBinding bind(@NonNull View view) {
        int i = R.id.animWebView;
        OnfidoAnimWebView onfidoAnimWebView = (OnfidoAnimWebView) ViewBindings.findChildViewById(view, i);
        if (onfidoAnimWebView != null) {
            return new OnfidoAvcViewHeadTurnAnimBinding((FrameLayout) view, onfidoAnimWebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoAvcViewHeadTurnAnimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoAvcViewHeadTurnAnimBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_avc_view_head_turn_anim, viewGroup, false);
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
