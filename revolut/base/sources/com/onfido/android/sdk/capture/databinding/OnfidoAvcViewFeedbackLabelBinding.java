package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoAvcViewFeedbackLabelBinding implements ViewBinding {

    @NonNull
    public final TextView feedbackTextView;

    @NonNull
    private final TextView rootView;

    private OnfidoAvcViewFeedbackLabelBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.feedbackTextView = textView2;
    }

    @NonNull
    public static OnfidoAvcViewFeedbackLabelBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new OnfidoAvcViewFeedbackLabelBinding(textView, textView);
    }

    @NonNull
    public static OnfidoAvcViewFeedbackLabelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoAvcViewFeedbackLabelBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_avc_view_feedback_label, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
