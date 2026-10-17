package yt0;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$attr;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.internal.views.linearlayout.UIKitLinearLayout;
import com.revolut.core.ui_kit.internal.views.modal.ModalTopSpacerView;
import com.revolut.core.ui_kit.utils.TagKeyTarget;
import com.revolut.core.ui_kit.views.ModalViewContainerBehavior;
import ix0.i1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import mx0.aa;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yp0.j0;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements aa {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.o f316594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f316595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mhd.b f316596c;
    public lki.s d;
    public final e0 e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f316597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewPager2 f316598h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f316599j;
    public final b0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArgbEvaluator f316600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f316601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f316602n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybh.c0 f316603p;

    public v(com.revolut.core.ui_kit.views.o modalView) {
        Intrinsics.checkNotNullParameter(modalView, "modalView");
        this.f316594a = modalView;
        this.f316595b = new ifm.b();
        Context context = modalView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.e = new e0(context);
        Context context2 = modalView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f = rr0.q.d(context2, rr0.o.FULLSCREEN_PAGED);
        Context context3 = modalView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f316597g = kli.a.k(context3, 4.0f);
        this.k = new b0(modalView, new yq0.e(this, 9), new yea.l(1, this, v.class, "onTransformProgressChanged", "onTransformProgressChanged(F)V", 0, 14));
        this.f316600l = new ArgbEvaluator();
        Context context4 = modalView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.f316601m = kli.a.s(R$attr.internal_colorModalPopupDimmer, context4);
        this.o = new Object();
        this.f316603p = new ybh.c0(this);
    }

    @Override // mx0.aa
    public final void a(lki.s onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        this.d = onTransitionEnd;
        com.revolut.core.ui_kit.views.o oVar = this.f316594a;
        if (!oVar.isLaidOut() || oVar.isLayoutRequested()) {
            oVar.addOnLayoutChangeListener(new cli.u(this, 22));
        } else {
            p();
        }
    }

    @Override // mx0.aa
    public final void b() {
        p();
    }

    @Override // mx0.aa
    public final void e() {
        m().setState(5);
    }

    @Override // mx0.aa
    public final WindowInsets f(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        Context context = this.f316594a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        float f = 16.0f - (12.0f / 2);
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        int iK = kli.a.k(context, f);
        int i = insets2.top;
        float f5 = i - iK;
        if (f5 >= BitmapDescriptorFactory.HUE_RED) {
            f4 = f5;
        }
        e0 e0Var = this.e;
        if (f4 != e0Var.f316536c) {
            e0Var.f316536c = f4;
            e0Var.f316534a = true;
        }
        Insets insetsOf = Insets.of(insets2.left, i, insets2.right, insets2.bottom + this.f316599j);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        return new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, insetsOf).build().toWindowInsets();
    }

    @Override // mx0.aa
    public final void i() {
        m().setState(3);
    }

    @Override // mx0.aa
    public final void init() throws Throwable {
        com.revolut.core.ui_kit.views.o modalViewContainerView = this.f316594a;
        View knobContainer$ui_kit_components_release = modalViewContainerView.getKnobContainer$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(knobContainer$ui_kit_components_release, "<get-knobContainer>(...)");
        knobContainer$ui_kit_components_release.setVisibility(8);
        ModalTopSpacerView topPaddingSpace$ui_kit_components_release = modalViewContainerView.getTopPaddingSpace$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(topPaddingSpace$ui_kit_components_release, "<get-topPaddingSpace>(...)");
        topPaddingSpace$ui_kit_components_release.setVisibility(8);
        UIKitLinearLayout frame$ui_kit_components_release = modalViewContainerView.getFrame$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release, "<get-frame>(...)");
        ViewGroup.LayoutParams layoutParams = frame$ui_kit_components_release.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        ModalViewContainerBehavior.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(modalViewContainerView, "modalViewContainerView");
        Context context = modalViewContainerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams2.setBehavior(new ModalViewContainerBehavior(context, modalViewContainerView));
        frame$ui_kit_components_release.setLayoutParams(layoutParams2);
        m().setHideable(true);
        m().setSkipCollapsed(true);
        m().setState(5);
        m().addBottomSheetCallback(new s(this));
        ModalViewContainerBehavior modalViewContainerBehaviorM = m();
        ybh.c0 delegate = this.f316603p;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        modalViewContainerBehaviorM.f58788n = delegate;
        modalViewContainerBehaviorM.f58782c.requestLayout();
        b0 b0Var = this.k;
        js0.c touchTracker$ui_kit_components_release = b0Var.f316518a.getTouchTracker$ui_kit_components_release();
        x listener = b0Var.f316525m;
        touchTracker$ui_kit_components_release.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = touchTracker$ui_kit_components_release.f178090b;
        if (!arrayList.contains(listener)) {
            arrayList.add(listener);
        }
        ModalViewContainerBehavior modalViewContainerBehaviorM2 = ((v) b0Var.f316519b.f315964b).m();
        a0 listener2 = b0Var.f316524l;
        Intrinsics.checkNotNullParameter(listener2, "listener");
        ArrayList arrayList2 = modalViewContainerBehaviorM2.f58787m;
        if (!arrayList2.contains(listener2)) {
            arrayList2.add(listener2);
            WeakReference weakReference = modalViewContainerBehaviorM2.f58784h;
            View view = weakReference != null ? (View) weakReference.get() : null;
            WeakReference weakReference2 = modalViewContainerBehaviorM2.i;
            au0.o oVar = weakReference2 != null ? (au0.o) weakReference2.get() : null;
            b0 b0Var2 = listener2.f316517a;
            b0Var2.c(view instanceof RecyclerView ? (RecyclerView) view : null);
            w listener3 = b0Var2.k;
            if (!Intrinsics.f(b0Var2.e, oVar)) {
                au0.o oVar2 = b0Var2.e;
                if (oVar2 != null) {
                    Intrinsics.checkNotNullParameter(listener3, "listener");
                    oVar2.f9295g.remove(listener3);
                }
                b0Var2.e = oVar;
                if (oVar != null) {
                    Intrinsics.checkNotNullParameter(listener3, "listener");
                    oVar.f9295g.add(listener3);
                }
            }
            b0Var2.f316520c.invoke(Float.valueOf(i1.b(b0Var2.a(), 1.0f, b0Var2.f316522h)));
        }
        this.f316595b.a(modalViewContainerView.getNonCancelableActivator().f169293c.doFinally(new ty7.b(this, 28)).subscribe(new ypg.l(new yo7.p(this, 22), 19)));
        TagKeyTarget tagKeyTarget = new TagKeyTarget(zv0.c.f325571b);
        UIKitFrameLayout contentContainer$ui_kit_components_release = modalViewContainerView.getContentContainer$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(contentContainer$ui_kit_components_release, "<get-contentContainer>(...)");
        View viewA = js0.d.a(tagKeyTarget, contentContainer$ui_kit_components_release);
        ViewPager2 viewPager2 = (ViewPager2) (viewA instanceof ViewPager2 ? viewA : null);
        this.f316598h = viewPager2;
        if (viewPager2 != null) {
            j0.a(viewPager2).addOnChildAttachStateChangeListener(new u(this));
            RecyclerView recyclerViewA = j0.a(viewPager2);
            int childCount = recyclerViewA.getChildCount();
            for (int i = 0; i < childCount; i++) {
                o(recyclerViewA.getChildAt(i));
            }
            viewPager2.setPageTransformer(new ypg.l(this, 20));
            return;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            throw new IllegalStateException("unable to find modal pager");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            Throwable thA = yhm.m.a(yhm.o.a(th10));
            if (thA != null) {
                hx7.e.n(thA);
            }
        }
    }

    @Override // mx0.aa
    public final void k() {
        this.f316602n = true;
    }

    @Override // mx0.aa
    public final void l(mhd.b onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        if (m().getState() == 5) {
            onTransitionEnd.invoke();
        } else {
            this.f316596c = onTransitionEnd;
            m().setState(5);
        }
    }

    public final ModalViewContainerBehavior m() {
        ModalViewContainerBehavior.Companion companion = ModalViewContainerBehavior.INSTANCE;
        UIKitLinearLayout frame$ui_kit_components_release = this.f316594a.getFrame$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release, "<get-frame>(...)");
        companion.getClass();
        return ModalViewContainerBehavior.Companion.a(frame$ui_kit_components_release);
    }

    public final void n(View view) {
        ViewPager2 viewPager2 = this.f316598h;
        if (viewPager2 != null && view.isLaidOut()) {
            float scaleX = view.getScaleX() * viewPager2.getMeasuredWidth();
            float measuredWidth = viewPager2.getMeasuredWidth();
            float f = (measuredWidth - scaleX) - this.f316597g;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = 0.0f;
            }
            view.setTranslationX(kotlin.ranges.f.f(view.getLeft() / measuredWidth, -1.0f, 1.0f) * (-f));
        }
    }

    public final void o(View view) {
        view.setClipToOutline(true);
        view.setOutlineProvider(this.e);
        if (view.getBackground() == null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackgroundColor(kli.a.s(com.revolut.core.ui_kit_resources.R$attr.uikit_windowBackground, context));
        }
        q(view);
    }

    public final void p() {
        m().setState(3);
        if (this.f316602n) {
            return;
        }
        lki.s sVar = this.d;
        if (sVar != null) {
            this.d = null;
            sVar.invoke();
        }
        r(1.0f);
    }

    public final void q(View view) {
        ViewPager2 viewPager2 = this.f316598h;
        if (viewPager2 == null) {
            return;
        }
        if (this.e.f316534a) {
            view.invalidateOutline();
        }
        if (viewPager2.getMeasuredWidth() == 0) {
            return;
        }
        float measuredWidth = viewPager2.getMeasuredWidth();
        float fB = i1.b(m72.b.a(this.f, 2.0f, measuredWidth, measuredWidth), 1.0f, this.i);
        view.setScaleX(fB);
        view.setScaleY(fB);
        n(view);
    }

    public final void r(float f) {
        Object objEvaluate = this.f316600l.evaluate(kotlin.ranges.f.f(f + 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f), 0, Integer.valueOf(this.f316601m));
        Intrinsics.checkNotNullExpressionValue(objEvaluate, "evaluate(...)");
        this.f316594a.setBackgroundColor(((Number) objEvaluate).intValue());
    }

    @Override // mx0.aa
    public final void reset() {
        m().setState(5);
        ModalViewContainerBehavior modalViewContainerBehaviorM = m();
        ybh.c0 delegate = this.f316603p;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        if (modalViewContainerBehaviorM.f58788n == delegate) {
            modalViewContainerBehaviorM.f58788n = null;
            modalViewContainerBehaviorM.f58782c.requestLayout();
        }
        b0 b0Var = this.k;
        ValueAnimator valueAnimator = b0Var.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        b0Var.i = null;
        b0Var.f316522h = BitmapDescriptorFactory.HUE_RED;
        js0.c touchTracker$ui_kit_components_release = b0Var.f316518a.getTouchTracker$ui_kit_components_release();
        x listener = b0Var.f316525m;
        touchTracker$ui_kit_components_release.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        touchTracker$ui_kit_components_release.f178090b.remove(listener);
        ModalViewContainerBehavior modalViewContainerBehaviorM2 = ((v) b0Var.f316519b.f315964b).m();
        a0 listener2 = b0Var.f316524l;
        Intrinsics.checkNotNullParameter(listener2, "listener");
        modalViewContainerBehaviorM2.f58787m.remove(listener2);
        b0Var.c(null);
        w listener3 = b0Var.k;
        if (!Intrinsics.f(b0Var.e, null)) {
            au0.o oVar = b0Var.e;
            if (oVar != null) {
                Intrinsics.checkNotNullParameter(listener3, "listener");
                oVar.f9295g.remove(listener3);
            }
            b0Var.e = null;
        }
        b0Var.f316521g = true;
        this.f316595b.d();
        this.f316599j = 0;
        this.f316602n = false;
    }
}
