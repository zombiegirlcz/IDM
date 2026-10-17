package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoConfirmationStepButtonsVerticalBinding implements ViewBinding {

    @NonNull
    public final OnfidoButton buttonPrimary;

    @NonNull
    public final OnfidoButton buttonSecondary;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout verticalContainer;

    private OnfidoConfirmationStepButtonsVerticalBinding(@NonNull LinearLayout linearLayout, @NonNull OnfidoButton onfidoButton, @NonNull OnfidoButton onfidoButton2, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.buttonPrimary = onfidoButton;
        this.buttonSecondary = onfidoButton2;
        this.verticalContainer = linearLayout2;
    }

    @NonNull
    public static OnfidoConfirmationStepButtonsVerticalBinding bind(@NonNull View view) {
        int i = R.id.button_primary;
        OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
        if (onfidoButton != null) {
            i = R.id.button_secondary;
            OnfidoButton onfidoButton2 = (OnfidoButton) ViewBindings.findChildViewById(view, i);
            if (onfidoButton2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new OnfidoConfirmationStepButtonsVerticalBinding(linearLayout, onfidoButton, onfidoButton2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoConfirmationStepButtonsVerticalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoConfirmationStepButtonsVerticalBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_confirmation_step_buttons_vertical, viewGroup, false);
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
