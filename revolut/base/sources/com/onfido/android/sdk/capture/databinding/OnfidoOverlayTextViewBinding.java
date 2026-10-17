package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoOverlayTextViewBinding implements ViewBinding {

    @NonNull
    public final TextView mainText;

    @NonNull
    public final RelativeLayout overlayTextContainer;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView secondaryText;

    private OnfidoOverlayTextViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.mainText = textView;
        this.overlayTextContainer = relativeLayout2;
        this.secondaryText = textView2;
    }

    @NonNull
    public static OnfidoOverlayTextViewBinding bind(@NonNull View view) {
        int i = R.id.mainText;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = R.id.secondaryText;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView2 != null) {
                return new OnfidoOverlayTextViewBinding(relativeLayout, textView, relativeLayout, textView2);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoOverlayTextViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoOverlayTextViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_overlay_text_view, viewGroup, false);
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
