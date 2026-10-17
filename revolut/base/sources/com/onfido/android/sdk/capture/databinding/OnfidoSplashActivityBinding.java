package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoSplashActivityBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout loadingView;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final OnfidoProgressLayoutBinding spinner;

    private OnfidoSplashActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull OnfidoProgressLayoutBinding onfidoProgressLayoutBinding) {
        this.rootView = relativeLayout;
        this.loadingView = relativeLayout2;
        this.spinner = onfidoProgressLayoutBinding;
    }

    @NonNull
    public static OnfidoSplashActivityBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.spinner;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            return new OnfidoSplashActivityBinding(relativeLayout, relativeLayout, OnfidoProgressLayoutBinding.bind(viewFindChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoSplashActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoSplashActivityBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_splash_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
