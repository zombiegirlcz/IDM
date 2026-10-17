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
public final class OnfidoFragmentPermissionsRequestBinding implements ViewBinding {

    @NonNull
    public final LinearLayout descriptionContainer;

    @NonNull
    public final OnfidoButton enable;

    @NonNull
    public final ImageView permissionRequestIcon;

    @NonNull
    public final TextView requestDenyExplanation;

    @NonNull
    public final TextView requestSubtitle;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowedScrollView scrollView;

    @NonNull
    public final TextView title;

    private OnfidoFragmentPermissionsRequestBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull OnfidoButton onfidoButton, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ShadowedScrollView shadowedScrollView, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.descriptionContainer = linearLayout;
        this.enable = onfidoButton;
        this.permissionRequestIcon = imageView;
        this.requestDenyExplanation = textView;
        this.requestSubtitle = textView2;
        this.scrollView = shadowedScrollView;
        this.title = textView3;
    }

    @NonNull
    public static OnfidoFragmentPermissionsRequestBinding bind(@NonNull View view) {
        int i = R.id.descriptionContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.enable;
            OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
            if (onfidoButton != null) {
                i = R.id.permissionRequestIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.requestDenyExplanation;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.requestSubtitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.scrollView;
                            ShadowedScrollView shadowedScrollView = (ShadowedScrollView) ViewBindings.findChildViewById(view, i);
                            if (shadowedScrollView != null) {
                                i = R.id.title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new OnfidoFragmentPermissionsRequestBinding((RelativeLayout) view, linearLayout, onfidoButton, imageView, textView, textView2, shadowedScrollView, textView3);
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
    public static OnfidoFragmentPermissionsRequestBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentPermissionsRequestBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_permissions_request, viewGroup, false);
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
