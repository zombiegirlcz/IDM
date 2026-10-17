package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.camera.liveness.turn.LivenessProgressArrow;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoChallengeMovementBinding implements ViewBinding {

    @NonNull
    public final LivenessProgressArrow arrow;

    @NonNull
    public final LinearLayout challenge;

    @NonNull
    public final OnfidoCaptureValidationBubble livenessErrorsBubble;

    @NonNull
    public final TextView movementTitleFirst;

    @NonNull
    public final TextView movementTitleSecond;

    @NonNull
    private final RelativeLayout rootView;

    private OnfidoChallengeMovementBinding(@NonNull RelativeLayout relativeLayout, @NonNull LivenessProgressArrow livenessProgressArrow, @NonNull LinearLayout linearLayout, @NonNull OnfidoCaptureValidationBubble onfidoCaptureValidationBubble, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.arrow = livenessProgressArrow;
        this.challenge = linearLayout;
        this.livenessErrorsBubble = onfidoCaptureValidationBubble;
        this.movementTitleFirst = textView;
        this.movementTitleSecond = textView2;
    }

    @NonNull
    public static OnfidoChallengeMovementBinding bind(@NonNull View view) {
        int i = R.id.arrow;
        LivenessProgressArrow livenessProgressArrow = (LivenessProgressArrow) ViewBindings.findChildViewById(view, i);
        if (livenessProgressArrow != null) {
            i = R.id.challenge;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.livenessErrorsBubble;
                OnfidoCaptureValidationBubble onfidoCaptureValidationBubble = (OnfidoCaptureValidationBubble) ViewBindings.findChildViewById(view, i);
                if (onfidoCaptureValidationBubble != null) {
                    i = R.id.movementTitleFirst;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.movementTitleSecond;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new OnfidoChallengeMovementBinding((RelativeLayout) view, livenessProgressArrow, linearLayout, onfidoCaptureValidationBubble, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoChallengeMovementBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoChallengeMovementBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_challenge_movement, viewGroup, false);
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
