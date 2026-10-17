package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.audio.ExpandablePillView;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoVolumeAwareViewBinding implements ViewBinding {

    @NonNull
    public final ExpandablePillView pillView;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RelativeLayout speaker;

    @NonNull
    public final TextView turnSoundOn;

    private OnfidoVolumeAwareViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull ExpandablePillView expandablePillView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.pillView = expandablePillView;
        this.speaker = relativeLayout2;
        this.turnSoundOn = textView;
    }

    @NonNull
    public static OnfidoVolumeAwareViewBinding bind(@NonNull View view) {
        int i = R.id.pillView;
        ExpandablePillView expandablePillView = (ExpandablePillView) ViewBindings.findChildViewById(view, i);
        if (expandablePillView != null) {
            i = R.id.speaker;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.turnSoundOn;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new OnfidoVolumeAwareViewBinding((RelativeLayout) view, expandablePillView, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoVolumeAwareViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoVolumeAwareViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_volume_aware_view, viewGroup, false);
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
