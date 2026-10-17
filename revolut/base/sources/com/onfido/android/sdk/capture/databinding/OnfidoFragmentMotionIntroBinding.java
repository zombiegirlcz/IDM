package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.OnfidoAnimWebView;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoFragmentMotionIntroBinding implements ViewBinding {

    @NonNull
    public final OnfidoAnimWebView animWebView;

    @NonNull
    public final TextView introDisclaimerView;

    @NonNull
    public final TextView motionIntroGuidanceBulletOne;

    @NonNull
    public final TextView motionIntroGuidanceBulletTwo;

    @NonNull
    public final OnfidoButton motionIntroStartRecordingButton;

    @NonNull
    public final TextView motionIntroSubtitle;

    @NonNull
    public final TextView motionIntroTitle;

    @NonNull
    private final LinearLayout rootView;

    private OnfidoFragmentMotionIntroBinding(@NonNull LinearLayout linearLayout, @NonNull OnfidoAnimWebView onfidoAnimWebView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull OnfidoButton onfidoButton, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.animWebView = onfidoAnimWebView;
        this.introDisclaimerView = textView;
        this.motionIntroGuidanceBulletOne = textView2;
        this.motionIntroGuidanceBulletTwo = textView3;
        this.motionIntroStartRecordingButton = onfidoButton;
        this.motionIntroSubtitle = textView4;
        this.motionIntroTitle = textView5;
    }

    @NonNull
    public static OnfidoFragmentMotionIntroBinding bind(@NonNull View view) {
        int i = R.id.animWebView;
        OnfidoAnimWebView onfidoAnimWebView = (OnfidoAnimWebView) ViewBindings.findChildViewById(view, i);
        if (onfidoAnimWebView != null) {
            i = R.id.introDisclaimerView;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.motion_intro_guidance_bullet_one;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.motion_intro_guidance_bullet_two;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.motionIntroStartRecordingButton;
                        OnfidoButton onfidoButton = (OnfidoButton) ViewBindings.findChildViewById(view, i);
                        if (onfidoButton != null) {
                            i = R.id.motion_intro_subtitle;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.motion_intro_title;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    return new OnfidoFragmentMotionIntroBinding((LinearLayout) view, onfidoAnimWebView, textView, textView2, textView3, onfidoButton, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoFragmentMotionIntroBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoFragmentMotionIntroBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_fragment_motion_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
