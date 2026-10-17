package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoVideoViewBinding implements ViewBinding {

    @NonNull
    public final ImageButton play;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextureView videoView;

    private OnfidoVideoViewBinding(@NonNull View view, @NonNull ImageButton imageButton, @NonNull TextureView textureView) {
        this.rootView = view;
        this.play = imageButton;
        this.videoView = textureView;
    }

    @NonNull
    public static OnfidoVideoViewBinding bind(@NonNull View view) {
        int i = R.id.play;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.videoView;
            TextureView textureView = (TextureView) ViewBindings.findChildViewById(view, i);
            if (textureView != null) {
                return new OnfidoVideoViewBinding(view, imageButton, textureView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoVideoViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.onfido_video_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
