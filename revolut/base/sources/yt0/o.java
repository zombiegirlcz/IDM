package yt0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import au0.p2;
import au0.t4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.internal.views.linearlayout.UIKitLinearLayout;
import com.revolut.core.ui_kit.internal.views.modal.ModalTopSpacerView;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.core.ui_kit.utils.TagKeyTarget;
import ix0.i1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yna.j1;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends i0 {

    @NotNull
    private static final n Companion = new n();
    public final ParcelableViewTarget k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f316580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f316581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Insets f316582n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f316583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f316584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OvershootInterpolator f316585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinearInterpolator f316586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f316587t;
    public final float u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.core.ui_kit.views.o modalView, ParcelableViewTarget anchor) {
        super(modalView);
        Intrinsics.checkNotNullParameter(modalView, "modalView");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.k = anchor;
        Insets NONE = Insets.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f316582n = NONE;
        Context context = modalView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.o = kli.a.k(context, 16.0f);
        this.f316583p = new int[2];
        this.f316584q = new AccelerateDecelerateInterpolator();
        this.f316585r = new OvershootInterpolator();
        this.f316586s = new LinearInterpolator();
        Intrinsics.checkNotNullExpressionValue(modalView.getContext(), "getContext(...)");
        this.f316587t = kli.a.k(r4, 32.0f);
        Intrinsics.checkNotNullExpressionValue(modalView.getContext(), "getContext(...)");
        this.u = kli.a.k(r3, 24.0f);
    }

    public final void A(int i) {
        View content$ui_kit_components_release = this.f316561a.getContent$ui_kit_components_release();
        if (content$ui_kit_components_release == null || content$ui_kit_components_release.getLayoutParams().height == i) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = content$ui_kit_components_release.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i;
        content$ui_kit_components_release.setLayoutParams(layoutParams);
    }

    public final void B(int i) {
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        if (oVar.getFrame$ui_kit_components_release().getLayoutParams().height == i) {
            return;
        }
        UIKitLinearLayout frame$ui_kit_components_release = oVar.getFrame$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release, "<get-frame>(...)");
        ViewGroup.LayoutParams layoutParams = frame$ui_kit_components_release.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i;
        frame$ui_kit_components_release.setLayoutParams(layoutParams2);
    }

    @Override // yt0.i0, mx0.aa
    public final void a(lki.s onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        m();
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        if (!oVar.isLaidOut() || oVar.isLayoutRequested()) {
            oVar.addOnLayoutChangeListener(new bx0.v(this, onTransitionEnd, 16));
        } else {
            y(true, onTransitionEnd);
        }
    }

    @Override // yt0.i0, mx0.aa
    public final void b() {
        m();
        y(false, new j1(19));
    }

    @Override // yt0.i0, mx0.aa
    public final void e() {
        w(false, new j1(20));
    }

    @Override // yt0.i0, mx0.aa
    public final WindowInsets f(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        int iDisplayCutout = WindowInsetsCompat.Type.displayCutout() | iSystemBars;
        Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        Insets insets3 = windowInsetsCompat.getInsets(iDisplayCutout);
        Intrinsics.checkNotNullExpressionValue(insets3, "getInsets(...)");
        this.f316582n = insets3;
        int i = insets2.bottom;
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        if (oVar.getFrame$ui_kit_components_release().getPaddingBottom() != i) {
            UIKitLinearLayout frame$ui_kit_components_release = oVar.getFrame$ui_kit_components_release();
            Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release, "<get-frame>(...)");
            knm.b.v(i, frame$ui_kit_components_release);
        }
        if (oVar.getFrame$ui_kit_components_release().getVisibility() == 0) {
            if (!oVar.isLaidOut() || oVar.isLayoutRequested()) {
                oVar.addOnLayoutChangeListener(new cli.u(this, 21));
            } else {
                u();
            }
        }
        Insets insetsOf = Insets.of(insets2.left, 0, insets2.right, 0);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        WindowInsets windowInsets = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, insetsOf).build().toWindowInsets();
        return windowInsets == null ? insets : windowInsets;
    }

    @Override // yt0.i0, mx0.aa
    public final void init() {
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        View knobContainer$ui_kit_components_release = oVar.getKnobContainer$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(knobContainer$ui_kit_components_release, "<get-knobContainer>(...)");
        knobContainer$ui_kit_components_release.setVisibility(8);
        oVar.getFrame$ui_kit_components_release().setVisibility(4);
        ModalTopSpacerView topPaddingSpace$ui_kit_components_release = oVar.getTopPaddingSpace$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(topPaddingSpace$ui_kit_components_release, "<get-topPaddingSpace>(...)");
        topPaddingSpace$ui_kit_components_release.setVisibility(8);
        oVar.setClipToPadding(false);
        oVar.setClipChildren(false);
        oVar.getFrame$ui_kit_components_release().setClipToPadding(false);
        oVar.getFrame$ui_kit_components_release().setClipChildren(false);
        oVar.getContentContainer$ui_kit_components_release().setClipChildren(false);
        Context context = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rr0.o oVar2 = rr0.o.BOTTOM_SHEET;
        int iD = rr0.q.d(context, oVar2);
        Context context2 = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float fB = rr0.q.b(context2, oVar2);
        this.f316580l = Math.max(iD, (int) fB);
        iv0.s sVar = new iv0.s(fB, false);
        z(iD, this.f316580l, -2);
        A(-2);
        oVar.getContentContainer$ui_kit_components_release().setOutlineProvider(sVar);
        oVar.getContentContainer$ui_kit_components_release().setClipToOutline(true);
        or0.m.a(oVar);
        oVar.setOnClickListener(new p2(this, 18));
        B(-2);
        oVar.getContentContainer$ui_kit_components_release().setFitsReadableArea(true);
    }

    @Override // yt0.i0, mx0.aa
    public final void k() {
        super.k();
        if (this.f316561a.getFrame$ui_kit_components_release().getVisibility() == 0) {
            u();
        }
    }

    @Override // yt0.i0, mx0.aa
    public final void l(mhd.b onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        w(true, onTransitionEnd);
    }

    @Override // yt0.i0, mx0.aa
    public final void reset() {
        super.reset();
        ValueAnimator valueAnimator = this.f316581m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f316581m = null;
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        oVar.getFrame$ui_kit_components_release().setVisibility(0);
        oVar.getTopPaddingSpace$ui_kit_components_release().setVisibility(0);
        this.f316580l = 0;
        oVar.setClipToPadding(true);
        oVar.setClipChildren(true);
        oVar.getFrame$ui_kit_components_release().setClipToPadding(true);
        oVar.getFrame$ui_kit_components_release().setClipChildren(true);
        if (oVar.getFrame$ui_kit_components_release().getPaddingBottom() != 0) {
            UIKitLinearLayout frame$ui_kit_components_release = oVar.getFrame$ui_kit_components_release();
            Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release, "<get-frame>(...)");
            knm.b.v(0, frame$ui_kit_components_release);
        }
        oVar.getContentContainer$ui_kit_components_release().setClipChildren(true);
        oVar.getContentContainer$ui_kit_components_release().setClipToOutline(false);
        oVar.getContentContainer$ui_kit_components_release().setOutlineProvider(null);
        oVar.getContentContainer$ui_kit_components_release().setAlpha(1.0f);
        oVar.getContentContainer$ui_kit_components_release().setScaleX(1.0f);
        oVar.getContentContainer$ui_kit_components_release().setScaleY(1.0f);
        oVar.getContentContainer$ui_kit_components_release().setTranslationY(BitmapDescriptorFactory.HUE_RED);
        View viewV = v();
        if (viewV != null) {
            viewV.setScaleX(1.0f);
            viewV.setScaleY(1.0f);
        }
        or0.m.a(oVar);
        or0.u.o(oVar);
        B(-1);
        z(0, 0, -1);
        A(-1);
    }

    public final void t(long j2, Function0 function0, boolean z) {
        View viewV = v();
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        if (viewV == null) {
            viewV = oVar.getContentContainer$ui_kit_components_release();
        }
        final View view = viewV;
        final float alpha = oVar.getContentContainer$ui_kit_components_release().getAlpha();
        final float scaleX = view.getScaleX();
        final float translationY = oVar.getContentContainer$ui_kit_components_release().getTranslationY();
        float f = BitmapDescriptorFactory.HUE_RED;
        final float f4 = z ? 1.0f : 0.0f;
        final float f5 = z ? 1.0f : 0.75f;
        if (!z) {
            f = -this.u;
        }
        final float f6 = f;
        final BaseInterpolator baseInterpolator = z ? this.f316585r : this.f316586s;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yt0.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                o oVar2 = this.f316575a;
                float interpolation = oVar2.f316584q.getInterpolation(it8.getAnimatedFraction());
                float interpolation2 = baseInterpolator.getInterpolation(it8.getAnimatedFraction());
                float fB = i1.b(alpha, f4, interpolation);
                com.revolut.core.ui_kit.views.o oVar3 = oVar2.f316561a;
                oVar3.getContentContainer$ui_kit_components_release().setAlpha(fB);
                oVar3.getContentContainer$ui_kit_components_release().setTranslationY(i1.b(translationY, f6, interpolation2));
                float fB2 = i1.b(scaleX, f5, interpolation2);
                View view2 = view;
                view2.setScaleX(fB2);
                view2.setScaleY(fB2);
                oVar2.s(fB, null);
            }
        });
        valueAnimatorOfFloat.addListener(new t4(this, function0, 4));
        valueAnimatorOfFloat.start();
        this.f316581m = valueAnimatorOfFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt0.o.u():void");
    }

    public final View v() {
        TagKeyTarget tagKeyTarget = new TagKeyTarget(l.f316574b);
        UIKitFrameLayout contentContainer$ui_kit_components_release = this.f316561a.getContentContainer$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(contentContainer$ui_kit_components_release, "<get-contentContainer>(...)");
        return js0.d.a(tagKeyTarget, contentContainer$ui_kit_components_release);
    }

    public final void w(boolean z, Function0 function0) {
        ValueAnimator valueAnimator = this.f316581m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f316581m = null;
        if (z) {
            t(150L, new yff.b(this, function0, 24), false);
            return;
        }
        x(BitmapDescriptorFactory.HUE_RED, 0.75f, -this.u);
        this.f316561a.getFrame$ui_kit_components_release().setVisibility(4);
        function0.invoke();
    }

    public final void x(float f, float f4, float f5) {
        View viewV = v();
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        if (viewV == null) {
            viewV = oVar.getContentContainer$ui_kit_components_release();
        }
        oVar.getContentContainer$ui_kit_components_release().setAlpha(f);
        oVar.getContentContainer$ui_kit_components_release().setTranslationY(f5);
        viewV.setScaleX(f4);
        viewV.setScaleY(f4);
        s(f, null);
    }

    public final void y(boolean z, Function0 function0) {
        ValueAnimator valueAnimator = this.f316581m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f316581m = null;
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        oVar.getContentContainer$ui_kit_components_release().setTranslationY(BitmapDescriptorFactory.HUE_RED);
        oVar.getFrame$ui_kit_components_release().setVisibility(0);
        u();
        if (z) {
            x(BitmapDescriptorFactory.HUE_RED, 0.1f, -this.f316587t);
            t(500L, function0, true);
        } else {
            x(1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED);
            function0.invoke();
        }
    }

    public final void z(int i, int i2, int i3) {
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        ViewGroup.LayoutParams layoutParams = oVar.getContentContainer$ui_kit_components_release().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.getMarginStart() == i && marginLayoutParams.getMarginEnd() == i && marginLayoutParams.bottomMargin == i2 && marginLayoutParams.height == i3) {
            return;
        }
        UIKitFrameLayout contentContainer$ui_kit_components_release = oVar.getContentContainer$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(contentContainer$ui_kit_components_release, "<get-contentContainer>(...)");
        ViewGroup.LayoutParams layoutParams2 = contentContainer$ui_kit_components_release.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(i);
        marginLayoutParams2.setMarginEnd(i);
        marginLayoutParams2.bottomMargin = i2;
        marginLayoutParams2.height = i3;
        contentContainer$ui_kit_components_release.setLayoutParams(marginLayoutParams2);
    }
}
