package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoAvcViewHeadTurnTickIconBinding implements ViewBinding {

    @NonNull
    private final ImageView rootView;

    private OnfidoAvcViewHeadTurnTickIconBinding(@NonNull ImageView imageView) {
        this.rootView = imageView;
    }

    @NonNull
    public static OnfidoAvcViewHeadTurnTickIconBinding bind(@NonNull View view) {
        if (view != null) {
            return new OnfidoAvcViewHeadTurnTickIconBinding((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static OnfidoAvcViewHeadTurnTickIconBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoAvcViewHeadTurnTickIconBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_avc_view_head_turn_tick_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}
