package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.BulletStepView;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.ui.widget.ShadowedScrollView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentPermissionsRecoveryBinding implements ViewBinding {

    @NonNull
    public final LinearLayout descriptionContainer;

    @NonNull
    public final BulletStepView recoveryBulletMessage;

    @NonNull
    public final BulletStepView recoveryBulletMessage2;

    @NonNull
    public final TextView recoverySubtitle;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowedScrollView scrollView;

    @NonNull
    public final OnfidoButton settingsButton;

    @NonNull
    public final TextView title;

    private OnfidoFragmentPermissionsRecoveryBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull BulletStepView bulletStepView, @NonNull BulletStepView bulletStepView2, @NonNull TextView textView, @NonNull ShadowedScrollView shadowedScrollView, @NonNull OnfidoButton onfidoButton, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.descriptionContainer = linearLayout;
        this.recoveryBulletMessage = bulletStepView;
        this.recoveryBulletMessage2 = bulletStepView2;
        this.recoverySubtitle = textView;
        this.scrollView = shadowedScrollView;
        this.settingsButton = onfidoButton;
        this.title = textView2;
    }

    @NonNull
    public static OnfidoFragmentPermissionsRecoveryBinding bind(@NonNull View view) {
        int i = R.id.descriptionContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.recoveryBulletMessage;
            BulletStepView bulletStepView = (BulletStepView) ViewBindings.findChildViewById(view, i);
            if (bulletStepView != null) {
                i = R.id.recoveryBulletMessage2;
                BulletStepView bulletStepView2 = (BulletStepView) ViewBindings.findChildViewById(view, i);
                if (bulletStepView2 != null) {
                    i = R.id.recoverySubtitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.scrollView;
                        ShadowedScrollView shadowedScrollView = (ShadowedScrollView) ViewBindings.findChildViewById(view, i);
                        if (shadowedScrollView != null) {
                            i = R.id.settingsButton;
                            OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
                            if (onfidoButton != null) {
                                i = R.id.title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new OnfidoFragmentPermissionsRecoveryBinding((RelativeLayout) view, linearLayout, bulletStepView, bulletStepView2, textView, shadowedScrollView, onfidoButton, textView2);
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
    public static OnfidoFragmentPermissionsRecoveryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentPermissionsRecoveryBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_permissions_recovery, viewGroup, false);
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
