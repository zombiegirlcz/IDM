package com.revolut.uicomponent.toolbar.app_bar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core_ui_custom_font.TypefaceTextView;

/* JADX INFO: loaded from: classes12.dex */
@yhm.d
public final class RevolutToolbar extends BaseToolbar implements ny0.h {
    private boolean isHiding;
    private boolean isShowing;
    private TypefaceTextView title;

    public RevolutToolbar(Context context) {
        super(context);
    }

    private void setupDefaultTitleView(@NonNull Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        setContentInsetsAbsolute(0, dp2Px(32));
        TypefaceTextView typefaceTextView = new TypefaceTextView(context);
        this.title = typefaceTextView;
        typefaceTextView.setTextSize(20.0f);
        this.title.setMaxLines(1);
        this.title.setEllipsize(TextUtils.TruncateAt.END);
        this.title.setTypeface(v01.f.b(getContext(), "R_Medium"));
        this.title.setTextColor(kli.a.s(R$attr.uikit_colorForeground, getContext()));
        this.title.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.title.setGravity(8388627);
        this.title.setPivotX(r5.getWidth() / 2);
        this.title.setPivotY(r5.getHeight() / 2);
        frameLayout.addView(this.title);
        addView(frameLayout);
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.BaseToolbar
    public void applyAttrs(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super.applyAttrs(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Toolbar);
        try {
            setTitle(typedArrayObtainStyledAttributes.getResourceId(R$styleable.Toolbar_title, 0));
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.Toolbar_titleTextColor)) {
                this.title.setTextColor(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.Toolbar_titleTextColor));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.BaseToolbar
    public void hideTitle(boolean z) {
        if (!z) {
            if (getMeasuredHeight() == 0) {
                measure(0, 0);
            }
            this.title.setTranslationY(getMeasuredHeight());
        } else {
            if (getMeasuredHeight() == this.title.getTranslationY() || this.isHiding) {
                return;
            }
            this.title.animate().cancel();
            this.isHiding = true;
            this.title.animate().setInterpolator(new AccelerateDecelerateInterpolator()).translationY(getHeight()).setListener(new AnimatorListenerAdapter() { // from class: com.revolut.uicomponent.toolbar.app_bar.RevolutToolbar.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    RevolutToolbar.this.isHiding = false;
                }
            }).start();
        }
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.BaseToolbar
    public void init(@NonNull Context context, AttributeSet attributeSet) {
        setupDefaultTitleView(context);
        super.init(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i) {
        if (i == 0) {
            return;
        }
        setTitle(getContext().getText(i));
    }

    public void setTitleGravity(int i) {
        this.title.setGravity(i);
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.BaseToolbar
    public void showTitle() {
        showTitle(true);
    }

    public RevolutToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        TypefaceTextView typefaceTextView = this.title;
        if (typefaceTextView == null) {
            return;
        }
        typefaceTextView.setText(charSequence);
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.BaseToolbar
    public void showTitle(boolean z) {
        if (!z) {
            this.title.animate().cancel();
            this.title.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        } else {
            if (this.isShowing) {
                return;
            }
            this.title.animate().cancel();
            this.isShowing = true;
            this.title.animate().setInterpolator(new AccelerateDecelerateInterpolator()).translationY(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() { // from class: com.revolut.uicomponent.toolbar.app_bar.RevolutToolbar.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    RevolutToolbar.this.isShowing = false;
                }
            }).start();
        }
    }

    public RevolutToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
