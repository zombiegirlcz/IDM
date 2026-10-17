package mx0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class m2 extends ConstraintLayout implements ix0.w0 {

    @NotNull
    public static final s1 Companion = new s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ix0.c2 f209811b;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f209812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j2 f209813h;
    public eq0.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f209814j;
    public ValueAnimator k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnimatedBackgroundView f209815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BasicNavBar f209816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ProductIntroView f209817n;
    public final LargeActionButton o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FooterTextView f209818p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ix0.h2 f209819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ix0.h2 f209820r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ix0.h2 f209821s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ix0.h2 f209822t;
    public View u;
    public final ihm.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public zkm.d f209823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n1 f209824x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f209811b = new ix0.c2(this);
        LayoutInflater.from(context).inflate(R$layout.internal_view_fullscreen_product_intro, this);
        this.f209815l = (AnimatedBackgroundView) findViewById(R$id.fullscreenProductIntro_background);
        BasicNavBar basicNavBar = (BasicNavBar) findViewById(R$id.fullscreenProductIntro_basicHeader);
        this.f209816m = basicNavBar;
        ProductIntroView productIntroView = (ProductIntroView) findViewById(R$id.fullscreenProductIntro_productIntro);
        this.f209817n = productIntroView;
        TextView flatActionButton = (TextView) findViewById(R$id.fullscreenProductIntro_flatActionButton);
        LargeActionButton largeActionButton = (LargeActionButton) findViewById(R$id.fullscreenProductIntro_largeActionButton);
        this.o = largeActionButton;
        FooterTextView footerText = (FooterTextView) findViewById(R$id.fullscreenProductIntro_footerText);
        this.f209818p = footerText;
        Intrinsics.checkNotNullExpressionValue(flatActionButton, "flatActionButton");
        ix0.h2 h2Var = new ix0.h2(flatActionButton);
        this.f209819q = h2Var;
        Intrinsics.checkNotNullExpressionValue(largeActionButton, "largeActionButton");
        ix0.h2 h2Var2 = new ix0.h2(largeActionButton);
        this.f209820r = h2Var2;
        Intrinsics.checkNotNullExpressionValue(footerText, "footerText");
        ix0.h2 h2Var3 = new ix0.h2(footerText);
        this.f209821s = h2Var3;
        this.v = v0.a.d("create(...)");
        this.f209824x = new n1(this, 0);
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        basicNavBar.f59210a.f57403b.subscribe(new mv9.h(19, new m1(this, 1)));
        te0.w.a0(productIntroView.f56312x, new mqg.b(18)).subscribe(new mv9.h(20, new m1(this, 2)));
        productIntroView.f56312x.subscribe(new mv9.h(21, new mm7.h(1, this, m2.class, "handleActionButtonGlow", "handleActionButtonGlow(Lcom/revolut/core/ui_kit/internal/views/ProductIntroView$State;)V", 0, 24)));
        h2Var.d(false);
        h2Var2.d(false);
        h2Var3.d(false);
        setClipChildren(false);
        aw0.x8 x8VarA = rr0.l.a(context);
        foh.i.e(this, x8VarA.f10609a, x8VarA.f10610b, x8VarA.f10611c, x8VarA.e);
    }

    public static boolean l0(k2 k2Var) {
        e2 e2Var;
        i2 i2Var;
        if (k2Var == null) {
            return true;
        }
        if (!(k2Var instanceof j2)) {
            k2Var = null;
        }
        j2 j2Var = (j2) k2Var;
        if (j2Var == null || (e2Var = j2Var.f209771b) == null || (i2Var = e2Var.f209668a) == null) {
            return true;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(mx0.q1 r12) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.m2.f0(mx0.q1):void");
    }

    public final void g0(j2 j2Var) {
        ix0.h2 h2Var = this.f209822t;
        if (h2Var != null) {
            h2Var.c();
        }
        View view = this.u;
        if (view != null) {
            view.setVisibility(j2Var.f209771b.d != null ? 4 : 0);
        }
    }

    public final boolean getAllowReuseAfterClose() {
        return this.f209812g;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ix0.w0, ix0.v0
    public boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable() || ((Boolean) jo0.g.f176836t.getValue()).booleanValue();
    }

    public final efm.r h0() {
        efm.r rVarI0 = i0();
        efm.r rVarSwitchMap = i0().take(1L).switchMap(new mv9.h(25, new m1(this, 3)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarMergeWith = rVarI0.mergeWith(rVarSwitchMap);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    public final efm.r i0() {
        efm.r map = te0.w.a0(this.f209817n.f56312x, new mul.k(21)).distinct(new mv9.h(23, new mul.k(22))).map(new mv9.h(24, new mul.k(23)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(mx0.k2 r20, eq0.a r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.m2.j0(mx0.k2, eq0.a):void");
    }

    public final void m0(final List list, final List list2, final View[] viewArr, Function1 function1) {
        ArrayList arrayList;
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.k = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        final long jMax = Math.max(600L, 400L);
        final Interpolator interpolator = rr0.k.f256628a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final float fL = kli.a.l(context, 20.0f);
        if (viewArr != null) {
            arrayList = new ArrayList(viewArr.length);
            for (View view : viewArr) {
                arrayList.add(Float.valueOf(view.getTranslationY()));
            }
        } else {
            arrayList = null;
        }
        final ArrayList arrayList2 = arrayList;
        ValueAnimator valueAnimator2 = this.k;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(jMax);
        }
        ValueAnimator valueAnimator3 = this.k;
        if (valueAnimator3 != null) {
            valueAnimator3.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator4 = this.k;
        if (valueAnimator4 != null) {
            valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mx0.p1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animation) {
                    List list3;
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    float animatedFraction = animation.getAnimatedFraction() * jMax;
                    float f = animatedFraction / 400;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    float f4 = animatedFraction / 600;
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    }
                    Interpolator interpolator2 = interpolator;
                    float interpolation = interpolator2.getInterpolation(f);
                    float f5 = 1.0f - interpolation;
                    float interpolation2 = interpolator2.getInterpolation(f4);
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        ((View) it8.next()).setAlpha(interpolation);
                    }
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        ((View) it9.next()).setAlpha(f5);
                    }
                    View[] viewArr2 = viewArr;
                    if (viewArr2 == null || (list3 = arrayList2) == null) {
                        return;
                    }
                    int length = viewArr2.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        View view2 = viewArr2[i];
                        view2.setAlpha(interpolation);
                        view2.setTranslationY(((1.0f - interpolation2) * fL) + ((Number) list3.get(i2)).floatValue());
                        i++;
                        i2++;
                    }
                }
            });
        }
        ValueAnimator valueAnimator5 = this.k;
        if (valueAnimator5 != null) {
            valueAnimator5.addListener(new au0.l5(function1, 15));
        }
        ValueAnimator valueAnimator6 = this.k;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f209811b.c(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        skm.c2 c2VarE = skm.e0.e();
        skm.p0 p0Var = skm.p0.f264001a;
        this.f209823w = skm.e0.c(kotlin.coroutines.e.d(c2VarE, zkm.o.f323119a.e));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        zkm.d dVar = this.f209823w;
        if (dVar != null) {
            skm.e0.k(dVar, null);
        }
        this.f209823w = null;
        this.f209822t = null;
        View view = this.u;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f209824x);
        }
        this.u = null;
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.k = null;
    }

    public final void setAllowReuseAfterClose(boolean z) {
        this.f209812g = z;
    }
}
