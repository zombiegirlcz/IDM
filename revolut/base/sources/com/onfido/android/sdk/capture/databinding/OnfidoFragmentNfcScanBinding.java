package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.camera.view.PlaybackControlsVideoPlayerView;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentNfcScanBinding implements ViewBinding {

    @NonNull
    public final OnfidoButton btnStartScanning;

    @NonNull
    public final OnfidoWatermarkLayoutBinding onfidoInclude3;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout stepsContainer;

    @NonNull
    public final TextView title;

    @NonNull
    public final TextView tvPinDisclaimer;

    @NonNull
    public final PlaybackControlsVideoPlayerView videoView;

    private OnfidoFragmentNfcScanBinding(@NonNull LinearLayout linearLayout, @NonNull OnfidoButton onfidoButton, @NonNull OnfidoWatermarkLayoutBinding onfidoWatermarkLayoutBinding, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull PlaybackControlsVideoPlayerView playbackControlsVideoPlayerView) {
        this.rootView = linearLayout;
        this.btnStartScanning = onfidoButton;
        this.onfidoInclude3 = onfidoWatermarkLayoutBinding;
        this.stepsContainer = linearLayout2;
        this.title = textView;
        this.tvPinDisclaimer = textView2;
        this.videoView = playbackControlsVideoPlayerView;
    }

    @NonNull
    public static OnfidoFragmentNfcScanBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.btnStartScanning;
        OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
        if (onfidoButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.onfidoInclude3))) != null) {
            OnfidoWatermarkLayoutBinding onfidoWatermarkLayoutBindingBind = OnfidoWatermarkLayoutBinding.bind(viewFindChildViewById);
            i = R.id.stepsContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tvPinDisclaimer;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.videoView;
                        PlaybackControlsVideoPlayerView playbackControlsVideoPlayerView = (PlaybackControlsVideoPlayerView) ViewBindings.findChildViewById(view, i);
                        if (playbackControlsVideoPlayerView != null) {
                            return new OnfidoFragmentNfcScanBinding((LinearLayout) view, onfidoButton, onfidoWatermarkLayoutBindingBind, linearLayout, textView, textView2, playbackControlsVideoPlayerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoFragmentNfcScanBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentNfcScanBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_nfc_scan, viewGroup, false);
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
