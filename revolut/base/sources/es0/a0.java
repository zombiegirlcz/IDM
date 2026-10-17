package es0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f128781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GradientDrawable f128782c;
    public int d;
    public float e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f128783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f128784h;
    public ValueAnimator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f128785j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0 f128786l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Context context) {
        super(context);
        this.f128786l = b0Var;
        this.d = -1;
        this.f = -1;
        this.f128783g = -1;
        this.f128784h = -1;
        this.f128785j = -1;
        this.k = -1;
        setWillNotDraw(false);
        this.f128781b = new Paint();
        this.f128782c = new GradientDrawable();
    }

    public final void a(d0 d0Var, RectF rectF) {
        int contentWidth = d0Var.getContentWidth();
        int iH = (int) b0.h(getContext(), 24);
        if (contentWidth < iH) {
            contentWidth = iH;
        }
        int right = (d0Var.getRight() + d0Var.getLeft()) / 2;
        int i = contentWidth / 2;
        rectF.set(right - i, BitmapDescriptorFactory.HUE_RED, right + i, BitmapDescriptorFactory.HUE_RED);
    }

    public final void b() {
        int left;
        int right;
        b0 b0Var = this.f128786l;
        RectF rectF = b0Var.f;
        View childAt = getChildAt(this.d);
        if (childAt == null || childAt.getWidth() <= 0) {
            left = -1;
            right = -1;
        } else {
            left = childAt.getLeft();
            right = childAt.getRight();
            if (!b0Var.E && (childAt instanceof d0)) {
                a((d0) childAt, rectF);
                left = (int) rectF.left;
                right = (int) rectF.right;
            }
            if (this.e > BitmapDescriptorFactory.HUE_RED && this.d < getChildCount() - 1) {
                View childAt2 = getChildAt(this.d + 1);
                int left2 = childAt2.getLeft();
                int right2 = childAt2.getRight();
                if (!b0Var.E && (childAt2 instanceof d0)) {
                    a((d0) childAt2, rectF);
                    left2 = (int) rectF.left;
                    right2 = (int) rectF.right;
                }
                float f = this.e;
                float f4 = 1.0f - f;
                left = (int) ((left * f4) + (left2 * f));
                right = (int) ((f4 * right) + (f * right2));
            }
        }
        if (left == this.f && right == this.f128783g) {
            return;
        }
        this.f = left;
        this.f128783g = right;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public final void c(boolean z, int i, int i2) {
        b0 b0Var = this.f128786l;
        RectF rectF = b0Var.f;
        View childAt = getChildAt(i);
        if (childAt == null) {
            b();
            return;
        }
        int left = childAt.getLeft();
        int right = childAt.getRight();
        if (!b0Var.E && (childAt instanceof d0)) {
            a((d0) childAt, rectF);
            left = (int) rectF.left;
            right = (int) rectF.right;
        }
        int i3 = this.f;
        int i5 = this.f128783g;
        if (i3 == left && i5 == right) {
            return;
        }
        if (z) {
            this.f128785j = i3;
            this.k = i5;
        }
        y yVar = new y(this, left, right);
        if (!z) {
            this.i.removeAllUpdateListeners();
            this.i.addUpdateListener(yVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.i = valueAnimator;
        valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimator.addUpdateListener(yVar);
        valueAnimator.addListener(new z(this, i, 0));
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        b0 b0Var = this.f128786l;
        Drawable drawable = b0Var.f128798p;
        int height = 0;
        int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        int i = this.f128780a;
        if (i >= 0) {
            intrinsicHeight = i;
        }
        int i2 = b0Var.B;
        if (i2 == 0) {
            height = getHeight() - intrinsicHeight;
            intrinsicHeight = getHeight();
        } else if (i2 == 1) {
            height = (getHeight() - intrinsicHeight) / 2;
            intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
        } else if (i2 != 2) {
            intrinsicHeight = i2 != 3 ? 0 : getHeight();
        }
        int i3 = this.f;
        if (i3 >= 0 && this.f128783g > i3) {
            Drawable drawable2 = b0Var.f128798p;
            if (drawable2 == null) {
                drawable2 = this.f128782c;
            }
            Drawable drawableMutate = DrawableCompat.wrap(drawable2).mutate();
            drawableMutate.setBounds(this.f, height, this.f128783g, intrinsicHeight);
            Paint paint = this.f128781b;
            if (paint != null) {
                DrawableCompat.setTintMode(drawableMutate, PorterDuff.Mode.DST);
                if (drawableMutate instanceof GradientDrawable) {
                    ((GradientDrawable) drawableMutate).setColor(paint.getColor());
                } else {
                    DrawableCompat.setTint(drawableMutate, paint.getColor());
                }
            }
            drawableMutate.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            b();
        } else {
            c(false, this.d, -1);
        }
        this.f128784h = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            this.f128784h = childAt.getWidth() + this.f128784h;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        b0 b0Var = this.f128786l;
        boolean z = true;
        if (b0Var.z == 1 || b0Var.C == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) b0.h(getContext(), 16)) * 2)) {
                boolean z3 = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != BitmapDescriptorFactory.HUE_RED) {
                        layoutParams.width = iMax;
                        layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
                        z3 = true;
                    }
                }
                z = z3;
            } else {
                b0Var.z = 0;
                b0Var.u(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }
}
