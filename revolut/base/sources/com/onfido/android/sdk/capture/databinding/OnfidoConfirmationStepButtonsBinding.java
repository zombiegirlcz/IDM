package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoConfirmationStepButtonsBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    private OnfidoConfirmationStepButtonsBinding(@NonNull View view) {
        this.rootView = view;
    }

    @NonNull
    public static OnfidoConfirmationStepButtonsBinding bind(@NonNull View view) {
        if (view != null) {
            return new OnfidoConfirmationStepButtonsBinding(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static OnfidoConfirmationStepButtonsBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.onfido_confirmation_step_buttons, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
