package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoLoadingErrorBinding implements ViewBinding {

    @NonNull
    public final TextView errorMessage;

    @NonNull
    public final FrameLayout reloadButton;

    @NonNull
    public final View reloadButtonBackground;

    @NonNull
    private final LinearLayout rootView;

    private OnfidoLoadingErrorBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull View view) {
        this.rootView = linearLayout;
        this.errorMessage = textView;
        this.reloadButton = frameLayout;
        this.reloadButtonBackground = view;
    }

    @NonNull
    public static OnfidoLoadingErrorBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.errorMessage;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.reloadButton;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.reloadButtonBackground))) != null) {
                return new OnfidoLoadingErrorBinding((LinearLayout) view, textView, frameLayout, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoLoadingErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoLoadingErrorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_loading_error, viewGroup, false);
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
