package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoLoadingViewCircleContainerBinding implements ViewBinding {

    @NonNull
    private final FrameLayout rootView;

    private OnfidoLoadingViewCircleContainerBinding(@NonNull FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @NonNull
    public static OnfidoLoadingViewCircleContainerBinding bind(@NonNull View view) {
        if (view != null) {
            return new OnfidoLoadingViewCircleContainerBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static OnfidoLoadingViewCircleContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoLoadingViewCircleContainerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_loading_view_circle_container, viewGroup, false);
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
