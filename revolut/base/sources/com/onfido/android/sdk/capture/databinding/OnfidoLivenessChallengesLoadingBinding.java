package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingErrorView;
import com.onfido.android.sdk.capture.ui.widget.LoadingView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoLivenessChallengesLoadingBinding implements ViewBinding {

    @NonNull
    public final LivenessChallengesLoadingErrorView errorView;

    @NonNull
    public final LoadingView loadingView;

    @NonNull
    private final RelativeLayout rootView;

    private OnfidoLivenessChallengesLoadingBinding(@NonNull RelativeLayout relativeLayout, @NonNull LivenessChallengesLoadingErrorView livenessChallengesLoadingErrorView, @NonNull LoadingView loadingView) {
        this.rootView = relativeLayout;
        this.errorView = livenessChallengesLoadingErrorView;
        this.loadingView = loadingView;
    }

    @NonNull
    public static OnfidoLivenessChallengesLoadingBinding bind(@NonNull View view) {
        int i = R.id.errorView;
        LivenessChallengesLoadingErrorView livenessChallengesLoadingErrorView = (LivenessChallengesLoadingErrorView) ViewBindings.findChildViewById(view, i);
        if (livenessChallengesLoadingErrorView != null) {
            i = R.id.loadingView;
            LoadingView loadingView = (LoadingView) ViewBindings.findChildViewById(view, i);
            if (loadingView != null) {
                return new OnfidoLivenessChallengesLoadingBinding((RelativeLayout) view, livenessChallengesLoadingErrorView, loadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoLivenessChallengesLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoLivenessChallengesLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_liveness_challenges_loading, viewGroup, false);
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
