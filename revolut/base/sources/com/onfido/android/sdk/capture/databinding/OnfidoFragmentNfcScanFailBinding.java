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
import com.onfido.android.sdk.capture.ui.camera.view.PlaybackControlsVideoPlayerView;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.ui.widget.ShadowedScrollView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentNfcScanFailBinding implements ViewBinding {

    @NonNull
    public final LinearLayout descriptionContainer;

    @NonNull
    public final OnfidoButton primaryAction;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowedScrollView scrollView;

    @NonNull
    public final OnfidoButton secondaryAction;

    @NonNull
    public final LinearLayout stepsContainer;

    @NonNull
    public final TextView title;

    @NonNull
    public final PlaybackControlsVideoPlayerView videoView;

    private OnfidoFragmentNfcScanFailBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull OnfidoButton onfidoButton, @NonNull ShadowedScrollView shadowedScrollView, @NonNull OnfidoButton onfidoButton2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull PlaybackControlsVideoPlayerView playbackControlsVideoPlayerView) {
        this.rootView = relativeLayout;
        this.descriptionContainer = linearLayout;
        this.primaryAction = onfidoButton;
        this.scrollView = shadowedScrollView;
        this.secondaryAction = onfidoButton2;
        this.stepsContainer = linearLayout2;
        this.title = textView;
        this.videoView = playbackControlsVideoPlayerView;
    }

    @NonNull
    public static OnfidoFragmentNfcScanFailBinding bind(@NonNull View view) {
        int i = R.id.descriptionContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.primaryAction;
            OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
            if (onfidoButton != null) {
                i = R.id.scrollView;
                ShadowedScrollView shadowedScrollView = (ShadowedScrollView) ViewBindings.findChildViewById(view, i);
                if (shadowedScrollView != null) {
                    i = R.id.secondaryAction;
                    OnfidoButton onfidoButton2 = (OnfidoButton) ViewBindings.findChildViewById(view, i);
                    if (onfidoButton2 != null) {
                        i = R.id.stepsContainer;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.title;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.videoView;
                                PlaybackControlsVideoPlayerView playbackControlsVideoPlayerView = (PlaybackControlsVideoPlayerView) ViewBindings.findChildViewById(view, i);
                                if (playbackControlsVideoPlayerView != null) {
                                    return new OnfidoFragmentNfcScanFailBinding((RelativeLayout) view, linearLayout, onfidoButton, shadowedScrollView, onfidoButton2, linearLayout2, textView, playbackControlsVideoPlayerView);
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
    public static OnfidoFragmentNfcScanFailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentNfcScanFailBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_nfc_scan_fail, viewGroup, false);
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
