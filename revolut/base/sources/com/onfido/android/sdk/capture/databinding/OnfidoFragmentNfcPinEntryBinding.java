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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentNfcPinEntryBinding implements ViewBinding {

    @NonNull
    public final TextView btnSkip;

    @NonNull
    public final OnfidoButton continueButton;

    @NonNull
    public final TextView description;

    @NonNull
    public final ImageView helperIcon;

    @NonNull
    public final LinearLayout helperLayout;

    @NonNull
    public final TextView helperText;

    @NonNull
    public final TextInputEditText pinInputEditText;

    @NonNull
    public final TextInputLayout pinInputLayout;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView title;

    private OnfidoFragmentNfcPinEntryBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull OnfidoButton onfidoButton, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView4) {
        this.rootView = linearLayout;
        this.btnSkip = textView;
        this.continueButton = onfidoButton;
        this.description = textView2;
        this.helperIcon = imageView;
        this.helperLayout = linearLayout2;
        this.helperText = textView3;
        this.pinInputEditText = textInputEditText;
        this.pinInputLayout = textInputLayout;
        this.title = textView4;
    }

    @NonNull
    public static OnfidoFragmentNfcPinEntryBinding bind(@NonNull View view) {
        int i = R.id.btnSkip;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.continueButton;
            OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
            if (onfidoButton != null) {
                i = R.id.description;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.helperIcon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.helperLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.helperText;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.pinInputEditText;
                                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i);
                                if (textInputEditText != null) {
                                    i = R.id.pinInputLayout;
                                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                    if (textInputLayout != null) {
                                        i = R.id.title;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new OnfidoFragmentNfcPinEntryBinding((LinearLayout) view, textView, onfidoButton, textView2, imageView, linearLayout, textView3, textInputEditText, textInputLayout, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoFragmentNfcPinEntryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentNfcPinEntryBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_nfc_pin_entry, viewGroup, false);
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
