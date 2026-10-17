package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.ui.widget.ShadowedScrollView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentBulletedMessageBinding implements ViewBinding {

    @NonNull
    public final LinearLayout descriptionContainer;

    @NonNull
    public final TextView infoTextView;

    @NonNull
    public final TextView listHeader;

    @NonNull
    public final OnfidoButton next;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowedScrollView scrollView;

    @NonNull
    public final LinearLayout stepsContainer;

    @NonNull
    public final TextView subtitle;

    @NonNull
    public final TextView title;

    @NonNull
    public final ImageView topIcon;

    private OnfidoFragmentBulletedMessageBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull OnfidoButton onfidoButton, @NonNull ShadowedScrollView shadowedScrollView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView) {
        this.rootView = relativeLayout;
        this.descriptionContainer = linearLayout;
        this.infoTextView = textView;
        this.listHeader = textView2;
        this.next = onfidoButton;
        this.scrollView = shadowedScrollView;
        this.stepsContainer = linearLayout2;
        this.subtitle = textView3;
        this.title = textView4;
        this.topIcon = imageView;
    }

    @NonNull
    public static OnfidoFragmentBulletedMessageBinding bind(@NonNull View view) {
        int i = R.id.descriptionContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.infoTextView;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.listHeader;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.next;
                    OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
                    if (onfidoButton != null) {
                        i = R.id.scrollView;
                        ShadowedScrollView shadowedScrollView = (ShadowedScrollView) ViewBindings.findChildViewById(view, i);
                        if (shadowedScrollView != null) {
                            i = R.id.stepsContainer;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = R.id.subtitle;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.title;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = R.id.topIcon;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            return new OnfidoFragmentBulletedMessageBinding((RelativeLayout) view, linearLayout, textView, textView2, onfidoButton, shadowedScrollView, linearLayout2, textView3, textView4, imageView);
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
    public static OnfidoFragmentBulletedMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentBulletedMessageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_bulleted_message, viewGroup, false);
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
