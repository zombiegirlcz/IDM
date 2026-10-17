package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoDummyAccessibilityViewBinding implements ViewBinding {

    @NonNull
    public final View dummyAccessibility;

    @NonNull
    private final View rootView;

    private OnfidoDummyAccessibilityViewBinding(@NonNull View view, @NonNull View view2) {
        this.rootView = view;
        this.dummyAccessibility = view2;
    }

    @NonNull
    public static OnfidoDummyAccessibilityViewBinding bind(@NonNull View view) {
        if (view != null) {
            return new OnfidoDummyAccessibilityViewBinding(view, view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static OnfidoDummyAccessibilityViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static OnfidoDummyAccessibilityViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_dummy_accessibility_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
