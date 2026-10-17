package vu0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.xh0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.w5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends ViewGroup implements o, rr0.d {

    @NotNull
    public static final a Companion = new a();
    public final j A;
    public final fp0.p B;
    public boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f292154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f292155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f292156c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f292157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f292158h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f292159j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f292160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final GradientDrawable f292161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iv0.s f292162n;
    public final AppCompatImageView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ProgressSwitcher f292163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final UIKitTextView f292164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m f292165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f292166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f292167t;
    public boolean u;
    public ValueAnimator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f292168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rr0.g f292169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f292170y;
    public int z;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f292154a = kli.a.k(context, 46.0f);
        this.f292155b = kli.a.k(context, 2.0f);
        this.f292156c = kli.a.k(context, 16.0f);
        this.d = kli.a.k(context, 4.0f);
        this.e = kli.a.k(context, 10.0f);
        this.f = kli.a.k(context, 64.0f);
        this.f292157g = kli.a.k(context, 80.0f);
        this.f292158h = kli.a.k(context, 100.0f);
        float fK = kli.a.k(context, 23.0f);
        this.i = fK;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fK);
        this.f292161m = gradientDrawable;
        iv0.s sVar = new iv0.s(fK, true);
        this.f292162n = sVar;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.o = appCompatImageView;
        ProgressSwitcher progressSwitcher = new ProgressSwitcher(context, null, 6, 0);
        progressSwitcher.setBackground(gradientDrawable);
        progressSwitcher.setOutlineProvider(sVar);
        progressSwitcher.setClipToOutline(true);
        int iK = kli.a.k(context, 24.0f);
        progressSwitcher.setProgressSize(iK);
        progressSwitcher.addView(appCompatImageView, new FrameLayout.LayoutParams(iK, iK, 17));
        this.f292163p = progressSwitcher;
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        uIKitTextView.setGravity(17);
        uIKitTextView.setMaxLines(1);
        uIKitTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.f292164q = uIKitTextView;
        this.f292167t = 1.0f;
        rr0.g gVarB = vc.s.b(this, false);
        this.f292169x = gVarB;
        this.f292170y = kli.a.s(R$attr.uikit_colorGreyTone50, context);
        this.A = this;
        fp0.p.Companion.getClass();
        this.B = fp0.m.a(this, gp0.b.f145198a);
        setClickable(true);
        setFocusable(true);
        gVarB.i = false;
        addView(progressSwitcher);
        addView(uIKitTextView);
        this.f292166s = BitmapDescriptorFactory.HUE_RED;
        setAlpha(BitmapDescriptorFactory.HUE_RED * this.f292167t);
        setScaleX(0.37f);
        setScaleY(0.37f);
        a(false, true);
    }

    private final void setLoading(boolean z) {
        this.f292168w = z;
        b();
    }

    @Override // rr0.d
    public final void L(boolean z) {
        setLoading(z);
        this.f292163p.setProgressVisible(z);
    }

    @Override // vu0.o
    public final void O(n side, float f, float f4, float f5, boolean z) {
        Intrinsics.checkNotNullParameter(side, "side");
        float f6 = kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float f32 = (0.63f * f6) + 0.37f;
        this.f292166s = f6;
        setAlpha(f6 * this.f292167t);
        setScaleX(f32);
        setScaleY(f32);
        if (this.u != z) {
            this.u = z;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f292167t, z ? 0.2f : 1.0f);
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.setInterpolator(jq0.r.f177394c);
            valueAnimatorOfFloat.addUpdateListener(new w5(this, 18));
            valueAnimatorOfFloat.start();
            this.v = valueAnimatorOfFloat;
        }
        if (getWidth() == this.k && getHeight() == this.f292160l) {
            return;
        }
        onLayout(true, getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // vu0.o
    public final efm.r R() {
        return this.f292169x.u;
    }

    @Override // sy0.a
    public final rr0.f V() {
        return this.f292169x.V();
    }

    public final void a(boolean z, boolean z3) {
        if (z3 || this.C != z) {
            this.C = z;
            int i = z ? R$attr.internal_textAppearanceEmphasis2 : R$attr.internal_textAppearanceBody3;
            UIKitTextView uIKitTextView = this.f292164q;
            jb3.l.e(uIKitTextView, i);
            uIKitTextView.setTextColor(this.C ? this.z : this.f292170y);
            b();
        }
    }

    public final void b() {
        int i = 0;
        this.o.setVisibility(this.C ? 4 : 0);
        if (this.C && this.f292168w) {
            i = 4;
        }
        this.f292164q.setVisibility(i);
    }

    @Override // vu0.o
    public final void b0() {
        this.f292169x.b0();
    }

    @Override // vu0.o
    @NotNull
    public fp0.p getClickHandler() {
        return this.B;
    }

    @Override // vu0.o
    public final boolean l() {
        return this.C;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        gq0.g.b(info);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int width = getWidth();
        this.k = width;
        this.f292160l = getHeight();
        boolean z3 = this.C;
        ProgressSwitcher progressSwitcher = this.f292163p;
        if (z3) {
            rr0.c.a(progressSwitcher, this, this, 12288, width, 0, 0, 0, 0, 496);
            rr0.c.a(this.f292164q, progressSwitcher, progressSwitcher, 12288, 0, 0, 0, 0, 0, 504);
            return;
        }
        rr0.c.a(progressSwitcher, this, this, 5120, width - (getMeasuredWidth() - progressSwitcher.getMeasuredWidth()), 0, (getHeight() - ((this.f292154a + this.f292155b) + this.f292164q.getMeasuredHeight())) / 2, 0, 0, 432);
        rr0.c.a(this.f292164q, progressSwitcher, progressSwitcher, 4128, 0, 0, this.f292155b, 0, 0, 440);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        int i5;
        int size = View.MeasureSpec.getSize(i2);
        int iD = rr0.i.d(i);
        int i6 = this.f292159j;
        int i21 = this.f292157g;
        UIKitTextView uIKitTextView = this.f292164q;
        if (i6 == 0) {
            uIKitTextView.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f292159j = uIKitTextView.getMeasuredHeight();
        }
        int i22 = this.f292155b;
        int i32 = this.f292154a;
        a((i22 + i32) + this.f292159j > size, false);
        if (this.C) {
            i21 = this.f292158h;
        }
        int iMin = Math.min(i21, iD);
        boolean z = this.C;
        if (z) {
            i3 = 0;
        } else {
            i3 = this.f;
            if (i3 > iMin) {
                i3 = iMin;
            }
        }
        int i33 = (z ? this.f292156c : this.d) * 2;
        int i43 = iMin - i33;
        if (i43 < 0) {
            i43 = 0;
        }
        int iCeil = (int) Math.ceil(Layout.getDesiredWidth(uIKitTextView.getText(), uIKitTextView.getPaint()));
        if (iCeil <= i43) {
            i43 = iCeil;
        }
        uIKitTextView.measure(View.MeasureSpec.makeMeasureSpec(i43, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iResolveSize = View.resolveSize(kotlin.ranges.f.g(uIKitTextView.getMeasuredWidth() + i33, i3, iMin), i);
        boolean z3 = this.C;
        if (z3) {
            int measuredHeight = (this.e * 2) + uIKitTextView.getMeasuredHeight();
            f = measuredHeight / 2.0f;
            i5 = measuredHeight;
            i32 = iResolveSize;
        } else {
            if (z3) {
                throw new NoWhenBranchMatchedException();
            }
            f = this.i;
            i5 = i32;
        }
        iv0.s sVar = this.f292162n;
        float f4 = sVar.f168696a;
        ProgressSwitcher progressSwitcher = this.f292163p;
        if (f4 != f) {
            sVar.f168696a = f;
            this.f292161m.setCornerRadius(f);
            progressSwitcher.invalidateOutline();
        }
        rr0.i.a(progressSwitcher, i32, i5);
        setMeasuredDimension(iResolveSize, size);
    }

    @Override // vu0.o
    public void setModel(@NotNull m newModel) {
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        m mVar = this.f292165r;
        SwipeToActionDelegate.SwipeAction swipeAction = newModel.f292172a;
        Clause clause = swipeAction.f53507c;
        boolean z = mVar == null;
        boolean z3 = z || !Intrinsics.f(mVar.f292172a.f53506b, swipeAction.f53506b);
        boolean z4 = z || !Intrinsics.f(mVar.f292172a.f53507c, clause);
        boolean z6 = z || l.c(mVar) != l.c(newModel);
        AppCompatImageView appCompatImageView = this.o;
        if (z3) {
            yy0.f.e(or0.u.k(this).Q(), swipeAction.f53506b, appCompatImageView, null, null, 12);
        }
        UIKitTextView uIKitTextView = this.f292164q;
        if (z4) {
            kli.a.b(uIKitTextView, clause, ty0.f.f275450a);
        }
        if (z6) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(l.a(l.c(newModel)), context);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iS2 = kli.a.s(l.b(l.c(newModel)), context2);
            appCompatImageView.setColorFilter(iS2, PorterDuff.Mode.SRC_ATOP);
            this.f292161m.setColor(iS);
            ProgressSwitcher progressSwitcher = this.f292163p;
            progressSwitcher.setProgressTintColor(iS2);
            this.z = iS2;
            if (!this.C) {
                iS2 = this.f292170y;
            }
            uIKitTextView.setTextColor(iS2);
            xh0 xh0VarC = l.c(newModel);
            getClickHandler().c(new gp0.h(new hp0.c(null, null, 3), new gp0.f(gp0.c.FOREGROUND, progressSwitcher), new fp0.d(new Color.Solid(l.b(xh0VarC)), new Color.Solid(l.a(xh0VarC)), true)));
        }
        this.f292165r = newModel;
    }

    @Override // vu0.o
    @NotNull
    public j getView() {
        return this.A;
    }
}
