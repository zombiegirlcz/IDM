package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoWorkflowRetryFragmentBinding implements ViewBinding {

    @NonNull
    public final TextView description;

    @NonNull
    public final OnfidoButton retryButton;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView title;

    private OnfidoWorkflowRetryFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull OnfidoButton onfidoButton, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.description = textView;
        this.retryButton = onfidoButton;
        this.title = textView2;
    }

    @NonNull
    public static OnfidoWorkflowRetryFragmentBinding bind(@NonNull View view) {
        int i = R.id.description;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.retryButton;
            OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
            if (onfidoButton != null) {
                i = R.id.title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new OnfidoWorkflowRetryFragmentBinding((LinearLayout) view, textView, onfidoButton, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoWorkflowRetryFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoWorkflowRetryFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_workflow_retry_fragment, viewGroup, false);
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
