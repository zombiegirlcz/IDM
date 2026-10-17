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

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentLivenessIntroBinding implements ViewBinding {

    @NonNull
    public final LinearLayout descriptionContainer;

    @NonNull
    public final OnfidoButton next;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final LinearLayout stepsContainer;

    @NonNull
    public final TextView subtitle;

    @NonNull
    public final TextView title;

    @NonNull
    public final PlaybackControlsVideoPlayerView videoView;

    private OnfidoFragmentLivenessIntroBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull OnfidoButton onfidoButton, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull PlaybackControlsVideoPlayerView playbackControlsVideoPlayerView) {
        this.rootView = relativeLayout;
        this.descriptionContainer = linearLayout;
        this.next = onfidoButton;
        this.stepsContainer = linearLayout2;
        this.subtitle = textView;
        this.title = textView2;
        this.videoView = playbackControlsVideoPlayerView;
    }

    @NonNull
    public static OnfidoFragmentLivenessIntroBinding bind(@NonNull View view) {
        int i = R.id.descriptionContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.next;
            OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
            if (onfidoButton != null) {
                i = R.id.stepsContainer;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.subtitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.videoView;
                            PlaybackControlsVideoPlayerView playbackControlsVideoPlayerView = (PlaybackControlsVideoPlayerView) ViewBindings.findChildViewById(view, i);
                            if (playbackControlsVideoPlayerView != null) {
                                return new OnfidoFragmentLivenessIntroBinding((RelativeLayout) view, linearLayout, onfidoButton, linearLayout2, textView, textView2, playbackControlsVideoPlayerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoFragmentLivenessIntroBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentLivenessIntroBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_liveness_intro, viewGroup, false);
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
