package com.onfido.android.sdk.capture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onfido.android.sdk.capture.R;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoBulletStepViewBinding implements ViewBinding {

    @NonNull
    public final View bottomSeparator;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ImageView stepIcon;

    @NonNull
    public final TextView stepNumber;

    @NonNull
    public final RelativeLayout stepNumberContainer;

    @NonNull
    public final TextView stepTitle;

    @NonNull
    public final View topSeparator;

    private OnfidoBulletStepViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2, @NonNull View view2) {
        this.rootView = relativeLayout;
        this.bottomSeparator = view;
        this.stepIcon = imageView;
        this.stepNumber = textView;
        this.stepNumberContainer = relativeLayout2;
        this.stepTitle = textView2;
        this.topSeparator = view2;
    }

    @NonNull
    public static OnfidoBulletStepViewBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.bottomSeparator;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            i = R.id.stepIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.stepNumber;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.stepNumberContainer;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.stepTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.topSeparator))) != null) {
                            return new OnfidoBulletStepViewBinding((RelativeLayout) view, viewFindChildViewById2, imageView, textView, relativeLayout, textView2, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnfidoBulletStepViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnfidoBulletStepViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.onfido_bullet_step_view, viewGroup, false);
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
