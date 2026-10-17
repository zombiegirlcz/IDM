package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoCaptureValidationBubbleBinding implements ViewBinding {

    @NonNull
    public final FrameLayout bubbleIconBackground;

    @NonNull
    public final LinearLayout bubbleRoot;

    @NonNull
    public final TextView bubbleSubtitle;

    @NonNull
    public final TextView bubbleTitle;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ImageView warningIcon;

    private OnfidoCaptureValidationBubbleBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView) {
        this.rootView = linearLayout;
        this.bubbleIconBackground = frameLayout;
        this.bubbleRoot = linearLayout2;
        this.bubbleSubtitle = textView;
        this.bubbleTitle = textView2;
        this.warningIcon = imageView;
    }

    @NonNull
    public static OnfidoCaptureValidationBubbleBinding bind(@NonNull View view) {
        int i = R.id.bubbleIconBackground;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.bubbleSubtitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.bubbleTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.warningIcon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        return new OnfidoCaptureValidationBubbleBinding(linearLayout, frameLayout, linearLayout, textView, textView2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoCaptureValidationBubbleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoCaptureValidationBubbleBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_capture_validation_bubble, viewGroup, false);
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
