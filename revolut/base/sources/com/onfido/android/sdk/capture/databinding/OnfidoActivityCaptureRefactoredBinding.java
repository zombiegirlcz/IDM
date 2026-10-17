package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoActivityCaptureRefactoredBinding implements ViewBinding {

    @NonNull
    public final CameraSourcePreview cameraPreview;

    @NonNull
    public final RelativeLayout content;

    @NonNull
    public final FrameLayout contentLayout;

    @NonNull
    public final FrameLayout overlayContainer;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final Toolbar toolbar;

    private OnfidoActivityCaptureRefactoredBinding(@NonNull RelativeLayout relativeLayout, @NonNull CameraSourcePreview cameraSourcePreview, @NonNull RelativeLayout relativeLayout2, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull Toolbar toolbar) {
        this.rootView = relativeLayout;
        this.cameraPreview = cameraSourcePreview;
        this.content = relativeLayout2;
        this.contentLayout = frameLayout;
        this.overlayContainer = frameLayout2;
        this.toolbar = toolbar;
    }

    @NonNull
    public static OnfidoActivityCaptureRefactoredBinding bind(@NonNull View view) {
        int i = R.id.cameraPreview;
        CameraSourcePreview cameraSourcePreview = (CameraSourcePreview) ViewBindings.findChildViewById(view, i);
        if (cameraSourcePreview != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.contentLayout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.overlayContainer;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
                    if (toolbar != null) {
                        return new OnfidoActivityCaptureRefactoredBinding(relativeLayout, cameraSourcePreview, relativeLayout, frameLayout, frameLayout2, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoActivityCaptureRefactoredBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoActivityCaptureRefactoredBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_activity_capture_refactored, viewGroup, false);
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
