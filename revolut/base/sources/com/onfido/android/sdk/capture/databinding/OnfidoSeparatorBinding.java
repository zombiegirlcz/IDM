package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoSeparatorBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    private OnfidoSeparatorBinding(@NonNull View view) {
        this.rootView = view;
    }

    @NonNull
    public static OnfidoSeparatorBinding bind(@NonNull View view) {
        if (view != null) {
            return new OnfidoSeparatorBinding(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static OnfidoSeparatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static OnfidoSeparatorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_separator, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
