package es0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.ripple.RippleUtils;
import es0.b0;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 extends LinearLayout {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f128816n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0.a f128817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f128818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f128819c;
    public View d;
    public BadgeDrawable e;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f128820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f128821h;
    public Drawable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f128822j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f128823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0 f128824m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b0 b0Var, Context context, boolean z) {
        super(context);
        this.f128824m = b0Var;
        this.k = false;
        this.f128823l = 2;
        this.f128822j = z;
        g(context);
        setGravity(17);
        ViewCompat.setPaddingRelative(this, b0Var.f128793h, b0Var.i, b0Var.f128794j, b0Var.k);
        setOrientation(!b0Var.D ? 1 : 0);
        setClickable(true);
        ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
    }

    private BadgeDrawable getBadge() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getContentWidth() {
        View[] viewArr = {this.f128818b, this.f128819c, this.f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    @NonNull
    private BadgeDrawable getOrCreateBadge() {
        if (this.e == null) {
            this.e = BadgeDrawable.create(getContext());
        }
        d();
        BadgeDrawable badgeDrawable = this.e;
        if (badgeDrawable != null) {
            return badgeDrawable;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongClickEnabled(boolean z) {
        this.k = z;
    }

    public final void c() {
        if (this.e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.d;
            if (view != null) {
                BadgeUtils.detachBadgeDrawable(this.e, view);
                this.d = null;
            }
        }
    }

    public final void d() {
        b0.a aVar;
        if (this.e != null) {
            if (this.f != null) {
                c();
                return;
            }
            ImageView imageView = this.f128819c;
            FrameLayout frameLayout = null;
            if (imageView != null && (aVar = this.f128817a) != null && aVar.f128807b != null) {
                if (this.d == imageView) {
                    e(imageView);
                    return;
                }
                c();
                ImageView imageView2 = this.f128819c;
                if (this.e == null || imageView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                BadgeDrawable badgeDrawable = this.e;
                if ((imageView2 == this.f128819c || imageView2 == this.f128818b) && BadgeUtils.USE_COMPAT_PARENT) {
                    frameLayout = (FrameLayout) imageView2.getParent();
                }
                BadgeUtils.attachBadgeDrawable(badgeDrawable, imageView2, frameLayout);
                this.d = imageView2;
                return;
            }
            TextView textView = this.f128818b;
            if (textView == null || this.f128817a == null) {
                c();
                return;
            }
            if (this.d == textView) {
                e(textView);
                return;
            }
            c();
            TextView textView2 = this.f128818b;
            if (this.e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
            }
            BadgeDrawable badgeDrawable2 = this.e;
            if ((textView2 == this.f128819c || textView2 == this.f128818b) && BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout = (FrameLayout) textView2.getParent();
            }
            BadgeUtils.attachBadgeDrawable(badgeDrawable2, textView2, frameLayout);
            this.d = textView2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if ((drawable == null || !drawable.isStateful()) ? false : this.i.setState(drawableState)) {
            invalidate();
            this.f128824m.invalidate();
        }
    }

    public final void e(View view) {
        BadgeDrawable badgeDrawable = this.e;
        if (badgeDrawable == null || view != this.d) {
            return;
        }
        FrameLayout frameLayout = null;
        if ((view == this.f128819c || view == this.f128818b) && BadgeUtils.USE_COMPAT_PARENT) {
            frameLayout = (FrameLayout) view.getParent();
        }
        BadgeUtils.setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
    }

    public final void f() {
        ViewGroup viewGroup;
        Drawable drawable;
        ViewGroup viewGroup2;
        b0.a aVar = this.f128817a;
        Drawable drawableMutate = null;
        View view = aVar != null ? aVar.f : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.f = view;
            TextView textView = this.f128818b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f128819c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f128819c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f128820g = textView2;
            if (textView2 != null) {
                this.f128823l = TextViewCompat.getMaxLines(textView2);
            }
            this.f128821h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view2 = this.f;
            if (view2 != null) {
                removeView(view2);
                this.f = null;
            }
            this.f128820g = null;
            this.f128821h = null;
        }
        boolean z = false;
        if (this.f == null) {
            if (this.f128819c == null) {
                if (BadgeUtils.USE_COMPAT_PARENT) {
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    addView(frameLayout, 0);
                    viewGroup2 = frameLayout;
                } else {
                    viewGroup2 = this;
                }
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.google.android.material.R.layout.design_layout_tab_icon, viewGroup2, false);
                this.f128819c = imageView2;
                viewGroup2.addView(imageView2, 0);
            }
            if (aVar != null && (drawable = aVar.f128807b) != null) {
                drawableMutate = DrawableCompat.wrap(drawable).mutate();
            }
            b0 b0Var = this.f128824m;
            if (drawableMutate != null) {
                DrawableCompat.setTintList(drawableMutate, b0Var.f128797n);
                PorterDuff.Mode mode = b0Var.f128799q;
                if (mode != null) {
                    DrawableCompat.setTintMode(drawableMutate, mode);
                }
            }
            if (this.f128818b == null) {
                if (BadgeUtils.USE_COMPAT_PARENT) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    addView(frameLayout2);
                    viewGroup = frameLayout2;
                } else {
                    viewGroup = this;
                }
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.google.android.material.R.layout.design_layout_tab_text, viewGroup, false);
                this.f128818b = textView3;
                viewGroup.addView(textView3);
                this.f128823l = TextViewCompat.getMaxLines(this.f128818b);
            }
            jb3.l.f(this.f128818b, b0Var.f128795l);
            ColorStateList colorStateList = b0Var.f128796m;
            if (colorStateList != null) {
                this.f128818b.setTextColor(colorStateList);
            }
            h(this.f128818b, this.f128819c);
            d();
            ImageView imageView3 = this.f128819c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new bx0.v(this, imageView3));
            }
            TextView textView4 = this.f128818b;
            if (textView4 != null) {
                textView4.addOnLayoutChangeListener(new bx0.v(this, textView4));
            }
        } else {
            TextView textView5 = this.f128820g;
            if (textView5 != null || this.f128821h != null) {
                h(textView5, this.f128821h);
            }
        }
        if (aVar != null && !TextUtils.isEmpty(aVar.d)) {
            setContentDescription(aVar.d);
        }
        if (aVar != null && aVar.a()) {
            z = true;
        }
        setSelected(z);
    }

    public final void g(Context context) {
        b0 b0Var = this.f128824m;
        int i = b0Var.f128802t;
        if (i != 0) {
            Drawable drawable = AppCompatResources.getDrawable(context, i);
            this.i = drawable;
            if (drawable != null && drawable.isStateful()) {
                this.i.setState(getDrawableState());
            }
        } else {
            this.i = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Drawable rippleDrawable = gradientDrawable;
        if (b0Var.o != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateListConvertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(b0Var.o);
            boolean z = b0Var.F;
            GradientDrawable gradientDrawable3 = gradientDrawable;
            if (z) {
                gradientDrawable3 = null;
            }
            rippleDrawable = new RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable3, z ? null : gradientDrawable2);
        }
        ViewCompat.setBackground(this, rippleDrawable);
        b0Var.invalidate();
    }

    public b0.a getTab() {
        return this.f128817a;
    }

    public final void h(TextView textView, ImageView imageView) {
        Drawable drawable;
        b0.a aVar = this.f128817a;
        Drawable drawableMutate = (aVar == null || (drawable = aVar.f128807b) == null) ? null : DrawableCompat.wrap(drawable).mutate();
        b0.a aVar2 = this.f128817a;
        CharSequence charSequence = aVar2 != null ? aVar2.f128808c : null;
        if (imageView != null) {
            if (drawableMutate != null) {
                imageView.setImageDrawable(drawableMutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            } else {
                textView.setText(charSequence);
                this.f128817a.getClass();
                textView.setVisibility(0);
                setVisibility(0);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iH = (zIsEmpty || imageView.getVisibility() != 0) ? 0 : (int) b0.h(getContext(), 8);
            if (this.f128824m.D) {
                if (iH != MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) {
                    MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, iH);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iH != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iH;
                MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        b0.a aVar3 = this.f128817a;
        TooltipCompat.setTooltipText(this, zIsEmpty ? aVar3 != null ? aVar3.d : null : null);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.e;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.e.getContentDescription()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.f128817a.e, 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        accessibilityNodeInfoCompatWrap.setRoleDescription("Tab");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        b0 b0Var = this.f128824m;
        int tabMaxWidth = b0Var.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(b0Var.u, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f128818b != null) {
            float f = b0Var.f128800r;
            int i3 = this.f128823l;
            ImageView imageView = this.f128819c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f128818b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = b0Var.f128801s;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.f128818b.getTextSize();
            int lineCount = this.f128818b.getLineCount();
            int maxLines = TextViewCompat.getMaxLines(this.f128818b);
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (b0Var.C == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.f128818b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f128818b.setTextSize(0, f);
                this.f128818b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.widget.FrameLayout, es0.u] */
    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f128817a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        b0.a aVar = this.f128817a;
        if (aVar.i) {
            ?? r110 = this.f128824m.f128789a;
            if (r110 != 0) {
                r110.g(aVar);
            }
        } else {
            aVar.b();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, es0.v] */
    @Override // android.view.View
    public final boolean performLongClick() {
        b0 b0Var = this.f128824m;
        if (b0Var.f128790b == null || !this.k) {
            return false;
        }
        boolean zPerformLongClick = super.performLongClick();
        b0Var.f128790b.e(this.f128817a);
        return zPerformLongClick;
    }

    public void setFakeTab(boolean z) {
        this.f128822j = z;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.f128818b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f128819c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(b0.a aVar) {
        if (aVar != this.f128817a) {
            this.f128817a = aVar;
            f();
        }
    }
}
