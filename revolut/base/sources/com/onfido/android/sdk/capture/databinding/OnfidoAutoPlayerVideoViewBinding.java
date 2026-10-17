package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.camera.liveness.intro.error.LoadingErrorState;
import com.onfido.android.sdk.capture.ui.widget.LoadingView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoAutoPlayerVideoViewBinding implements ViewBinding {

    @NonNull
    public final LoadingErrorState loadingErrorState;

    @NonNull
    public final LoadingView progressBar;

    @NonNull
    public final FrameLayout root;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ImageButton videoPlayButton;

    @NonNull
    public final TextureView videoPlayer;

    private OnfidoAutoPlayerVideoViewBinding(@NonNull FrameLayout frameLayout, @NonNull LoadingErrorState loadingErrorState, @NonNull LoadingView loadingView, @NonNull FrameLayout frameLayout2, @NonNull ImageButton imageButton, @NonNull TextureView textureView) {
        this.rootView = frameLayout;
        this.loadingErrorState = loadingErrorState;
        this.progressBar = loadingView;
        this.root = frameLayout2;
        this.videoPlayButton = imageButton;
        this.videoPlayer = textureView;
    }

    @NonNull
    public static OnfidoAutoPlayerVideoViewBinding bind(@NonNull View view) {
        int i = R.id.loadingErrorState;
        LoadingErrorState loadingErrorState = (LoadingErrorState) ViewBindings.findChildViewById(view, i);
        if (loadingErrorState != null) {
            i = R.id.progressBar;
            LoadingView loadingView = (LoadingView) ViewBindings.findChildViewById(view, i);
            if (loadingView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = R.id.videoPlayButton;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton != null) {
                    i = R.id.videoPlayer;
                    TextureView textureView = (TextureView) ViewBindings.findChildViewById(view, i);
                    if (textureView != null) {
                        return new OnfidoAutoPlayerVideoViewBinding(frameLayout, loadingErrorState, loadingView, frameLayout, imageButton, textureView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoAutoPlayerVideoViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoAutoPlayerVideoViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_auto_player_video_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
