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

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoScalableVideoViewBinding implements ViewBinding {

    @NonNull
    public final ImageButton play;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextureView videoView;

    private OnfidoScalableVideoViewBinding(@NonNull FrameLayout frameLayout, @NonNull ImageButton imageButton, @NonNull TextureView textureView) {
        this.rootView = frameLayout;
        this.play = imageButton;
        this.videoView = textureView;
    }

    @NonNull
    public static OnfidoScalableVideoViewBinding bind(@NonNull View view) {
        int i = R.id.play;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.videoView;
            TextureView textureView = (TextureView) ViewBindings.findChildViewById(view, i);
            if (textureView != null) {
                return new OnfidoScalableVideoViewBinding((FrameLayout) view, imageButton, textureView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoScalableVideoViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoScalableVideoViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_scalable_video_view, viewGroup, false);
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
