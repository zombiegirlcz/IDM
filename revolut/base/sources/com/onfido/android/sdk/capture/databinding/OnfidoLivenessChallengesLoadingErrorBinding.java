package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoLivenessChallengesLoadingErrorBinding implements ViewBinding {

    @NonNull
    public final OnfidoButton reloadButton;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final Toolbar toolbar;

    private OnfidoLivenessChallengesLoadingErrorBinding(@NonNull RelativeLayout relativeLayout, @NonNull OnfidoButton onfidoButton, @NonNull Toolbar toolbar) {
        this.rootView = relativeLayout;
        this.reloadButton = onfidoButton;
        this.toolbar = toolbar;
    }

    @NonNull
    public static OnfidoLivenessChallengesLoadingErrorBinding bind(@NonNull View view) {
        int i = R.id.reloadButton;
        OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
        if (onfidoButton != null) {
            i = R.id.toolbar;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
            if (toolbar != null) {
                return new OnfidoLivenessChallengesLoadingErrorBinding((RelativeLayout) view, onfidoButton, toolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoLivenessChallengesLoadingErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoLivenessChallengesLoadingErrorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_liveness_challenges_loading_error, viewGroup, false);
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
