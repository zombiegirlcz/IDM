package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoAvcFragmentHostBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout avcHostLoadingView;

    @NonNull
    public final FragmentContainerView fragmentContainerView;

    @NonNull
    private final FrameLayout rootView;

    private OnfidoAvcFragmentHostBinding(@NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout, @NonNull FragmentContainerView fragmentContainerView) {
        this.rootView = frameLayout;
        this.avcHostLoadingView = relativeLayout;
        this.fragmentContainerView = fragmentContainerView;
    }

    @NonNull
    public static OnfidoAvcFragmentHostBinding bind(@NonNull View view) {
        int i = R.id.avcHostLoadingView;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.fragmentContainerView;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                return new OnfidoAvcFragmentHostBinding((FrameLayout) view, relativeLayout, fragmentContainerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoAvcFragmentHostBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoAvcFragmentHostBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_avc_fragment_host, viewGroup, false);
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
