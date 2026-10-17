package com.revolut.uicomponent.toolbar.app_bar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.R$attr;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.uicomponent.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010 \u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%\"\u0004\b'\u0010\u001aR\"\u0010(\u001a\u00020\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\u001aR.\u0010+\u001a\u0004\u0018\u00010\f2\b\u0010*\u001a\u0004\u0018\u00010\f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b \u0010/R\"\u00100\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%\"\u0004\b2\u0010\u001a¨\u00063"}, d2 = {"Lcom/revolut/uicomponent/toolbar/app_bar/CustomViewRevolutToolbar;", "Lcom/revolut/uicomponent/toolbar/app_bar/BaseToolbar;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "customViewLayoutId", "Landroid/view/View;", "inflateCustomView", "(Landroid/content/Context;I)Landroid/view/View;", "", "init", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "applyAttrs", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "visible", "setCustomViewVisibility", "(Z)V", "animated", "(ZZ)V", "withAnimation", "hideTitle", "showTitle", "setCustomView", "(I)V", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "isShowing", "setShowing", "isHiding", "setHiding", "value", "customView", "Landroid/view/View;", "getCustomView", "()Landroid/view/View;", "(Landroid/view/View;)V", "adjustCustomViewBounds", "getAdjustCustomViewBounds", "setAdjustCustomViewBounds", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public class CustomViewRevolutToolbar extends BaseToolbar implements ny0.h {
    private boolean adjustCustomViewBounds;
    private View customView;
    private final boolean fitsReadableArea;
    private boolean isHiding;
    private boolean isShowing;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomViewRevolutToolbar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View inflateCustomView(Context context, int customViewLayoutId) {
        View viewInflate = LayoutInflater.from(context).inflate(customViewLayoutId, (ViewGroup) this, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.BaseToolbar
    public void applyAttrs(@NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.applyAttrs(context, attrs);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.RevolutToolbar);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            if (this.customView == null) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.RevolutToolbar_rtb_custom_view_layout, 0);
                if (resourceId != 0) {
                    this.customView = inflateCustomView(context, resourceId);
                }
                this.adjustCustomViewBounds = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RevolutToolbar_rtb_adjust_custom_view_margins, false);
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th10) {
            typedArrayObtainStyledAttributes.recycle();
            throw th10;
        }
    }

    public final boolean getAdjustCustomViewBounds() {
        return this.adjustCustomViewBounds;
    }

    public final View getCustomView() {
        return this.customView;
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return this.fitsReadableArea;
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.BaseToolbar
    public void hideTitle(boolean withAnimation) {
        View view;
        if (!withAnimation) {
            if (getMeasuredHeight() == 0) {
                measure(0, 0);
            }
            View view2 = this.customView;
            if (view2 != null) {
                view2.setTranslationY(getMeasuredHeight());
                return;
            }
            return;
        }
        float measuredHeight = getMeasuredHeight();
        View view3 = this.customView;
        if (Intrinsics.a(measuredHeight, view3 != null ? Float.valueOf(view3.getTranslationY()) : null) || this.isHiding || (view = this.customView) == null) {
            return;
        }
        view.animate().cancel();
        this.isHiding = true;
        view.animate().setInterpolator(new AccelerateDecelerateInterpolator()).translationY(getHeight()).setListener(new AnimatorListenerAdapter() { // from class: com.revolut.uicomponent.toolbar.app_bar.CustomViewRevolutToolbar$hideTitle$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0.setHiding(false);
            }
        }).start();
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.BaseToolbar
    public void init(@NotNull Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.init(context, attrs);
        View view = this.customView;
        if (view != null) {
            addView(view);
        }
    }

    /* JADX INFO: renamed from: isHiding, reason: from getter */
    public final boolean getIsHiding() {
        return this.isHiding;
    }

    /* JADX INFO: renamed from: isShowing, reason: from getter */
    public final boolean getIsShowing() {
        return this.isShowing;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.adjustCustomViewBounds) {
            View view = this.customView;
            if ((view != null ? view.getLayoutParams() : null) instanceof ViewGroup.MarginLayoutParams) {
                this.adjustCustomViewBounds = false;
                View view2 = this.customView;
                ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                View view3 = this.customView;
                Object parent = view3 != null ? view3.getParent() : null;
                Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
                ((View) parent).getWidth();
                marginLayoutParams.width = (getMeasuredWidth() - marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd();
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.setMarginEnd(0);
                marginLayoutParams.rightMargin = 0;
                measure(widthMeasureSpec, heightMeasureSpec);
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }
    }

    public final void setAdjustCustomViewBounds(boolean z) {
        this.adjustCustomViewBounds = z;
    }

    public final void setCustomView(View view) {
        this.customView = view;
    }

    public final void setCustomViewVisibility(boolean visible) {
        setCustomViewVisibility(visible, true);
    }

    public final void setHiding(boolean z) {
        this.isHiding = z;
    }

    public final void setShowing(boolean z) {
        this.isShowing = z;
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.BaseToolbar
    public void showTitle(boolean withAnimation) {
        View view;
        if (!withAnimation) {
            View view2 = this.customView;
            if (view2 != null) {
                view2.animate().cancel();
                view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                return;
            }
            return;
        }
        if (this.isShowing || (view = this.customView) == null) {
            return;
        }
        view.animate().cancel();
        this.isShowing = true;
        view.animate().setInterpolator(new AccelerateDecelerateInterpolator()).translationY(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() { // from class: com.revolut.uicomponent.toolbar.app_bar.CustomViewRevolutToolbar$showTitle$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0.setShowing(false);
            }
        }).start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomViewRevolutToolbar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setCustomView(int customViewLayoutId) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View viewInflateCustomView = inflateCustomView(context, customViewLayoutId);
        this.customView = viewInflateCustomView;
        addView(viewInflateCustomView);
    }

    public final void setCustomViewVisibility(boolean visible, boolean animated) {
        if (this.customView == null) {
            return;
        }
        if (visible) {
            showTitle(animated);
        } else {
            hideTitle(animated);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomViewRevolutToolbar(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CustomViewRevolutToolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.toolbarStyle : i);
    }
}
