package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoButtonBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton appCompatButton;

    @NonNull
    public final FrameLayout root;

    @NonNull
    private final FrameLayout rootView;

    private OnfidoButtonBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatButton appCompatButton, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.appCompatButton = appCompatButton;
        this.root = frameLayout2;
    }

    @NonNull
    public static OnfidoButtonBinding bind(@NonNull View view) {
        int i = R.id.appCompatButton;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new OnfidoButtonBinding(frameLayout, appCompatButton, frameLayout);
    }

    @NonNull
    public static OnfidoButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoButtonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_button, viewGroup, false);
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
