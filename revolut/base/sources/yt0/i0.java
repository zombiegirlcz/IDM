package yt0;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.collection.ArrayMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.revolut.core.ui_kit.internal.views.linearlayout.UIKitLinearLayout;
import com.revolut.core.ui_kit.internal.views.modal.ModalTopSpacerView;
import com.revolut.core.ui_kit.views.ModalViewContainerBehavior;
import com.revolut.core.ui_kit_resources.R$attr;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import mx0.aa;
import mx0.ja;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class i0 implements aa {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.o f316561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArgbEvaluator f316562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mhd.b f316563c;
    public lki.s d;
    public Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ifm.b f316564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f316565h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeakReference f316566j;

    public i0(com.revolut.core.ui_kit.views.o view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f316561a = view;
        this.f316562b = new ArgbEvaluator();
        this.f = new Object();
        this.f316564g = new ifm.b();
        this.f316565h = new Object();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        float f = 16.0f - (12.0f / 2);
        this.i = kli.a.k(context, f < BitmapDescriptorFactory.HUE_RED ? 0.0f : f);
    }

    @Override // mx0.aa
    public void a(lki.s onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        m();
        this.d = onTransitionEnd;
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        if (!oVar.isLaidOut() || oVar.isLayoutRequested()) {
            oVar.addOnLayoutChangeListener(new cli.u(this, 23));
        } else {
            BottomSheetBehavior.from(oVar.getFrame$ui_kit_components_release()).setState(3);
        }
    }

    @Override // mx0.aa
    public void b() {
        m();
        BottomSheetBehavior.from(this.f316561a.getFrame$ui_kit_components_release()).setState(3);
        s(1.0f, null);
    }

    @Override // mx0.aa
    public void e() {
        BottomSheetBehavior.from(this.f316561a.getFrame$ui_kit_components_release()).setState(5);
        s(BitmapDescriptorFactory.HUE_RED, null);
    }

    @Override // mx0.aa
    public WindowInsets f(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i = insets2.top;
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        Context context = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 8.0f) + i;
        if (oVar.getTopPaddingSpace$ui_kit_components_release().getHeight() != iK) {
            ModalTopSpacerView topPaddingSpace$ui_kit_components_release = oVar.getTopPaddingSpace$ui_kit_components_release();
            Intrinsics.checkNotNullExpressionValue(topPaddingSpace$ui_kit_components_release, "<get-topPaddingSpace>(...)");
            ViewGroup.LayoutParams layoutParams = topPaddingSpace$ui_kit_components_release.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = iK;
            topPaddingSpace$ui_kit_components_release.setLayoutParams(marginLayoutParams);
        }
        Insets insetsOf = Insets.of(insets2.left, 0, insets2.right, insets2.bottom);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        WindowInsets windowInsets = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, insetsOf).build().toWindowInsets();
        return windowInsets == null ? insets : windowInsets;
    }

    @Override // mx0.aa
    public void init() {
        com.revolut.core.ui_kit.views.o modalViewContainerView = this.f316561a;
        View knobContainer$ui_kit_components_release = modalViewContainerView.getKnobContainer$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(knobContainer$ui_kit_components_release, "<get-knobContainer>(...)");
        knobContainer$ui_kit_components_release.setVisibility(8);
        ModalTopSpacerView topPaddingSpace$ui_kit_components_release = modalViewContainerView.getTopPaddingSpace$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(topPaddingSpace$ui_kit_components_release, "<get-topPaddingSpace>(...)");
        topPaddingSpace$ui_kit_components_release.setVisibility(0);
        modalViewContainerView.setClipToPadding(false);
        modalViewContainerView.getContentContainer$ui_kit_components_release().setOutlineProvider(new g0());
        modalViewContainerView.getContentContainer$ui_kit_components_release().setClipToOutline(true);
        wk.a aVar = new wk.a(this, 4);
        Iterator it8 = zhm.v.k(modalViewContainerView, modalViewContainerView.getTopPaddingSpace$ui_kit_components_release(), modalViewContainerView.getKnobContainer$ui_kit_components_release()).iterator();
        while (it8.hasNext()) {
            ((View) it8.next()).setOnClickListener(aVar);
        }
        modalViewContainerView.setSideSpaceClickListener$ui_kit_components_release(aVar);
        ModalViewContainerBehavior.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(modalViewContainerView, "modalViewContainerView");
        ModalViewContainerBehavior modalViewContainerBehavior = new ModalViewContainerBehavior(modalViewContainerView);
        UIKitLinearLayout frame$ui_kit_components_release = modalViewContainerView.getFrame$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release, "<get-frame>(...)");
        ViewGroup.LayoutParams layoutParams = frame$ui_kit_components_release.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        layoutParams2.setBehavior(modalViewContainerBehavior);
        frame$ui_kit_components_release.setLayoutParams(layoutParams2);
        r(modalViewContainerBehavior, this.f316564g);
        modalViewContainerBehavior.setHideable(true);
        modalViewContainerBehavior.setSkipCollapsed(true);
        modalViewContainerBehavior.setState(5);
        modalViewContainerBehavior.addBottomSheetCallback(new h0(this));
        ViewCompat.setOnApplyWindowInsetsListener(modalViewContainerView.getContentContainer$ui_kit_components_release(), new ypg.l(this, 21));
        modalViewContainerView.getContentContainer$ui_kit_components_release().setFitsReadableArea(true);
    }

    @Override // mx0.aa
    public void k() {
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        oVar.getFrame$ui_kit_components_release().setPivotX(oVar.getWidth() / 2);
        oVar.getFrame$ui_kit_components_release().setPivotY(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // mx0.aa
    public void l(mhd.b onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(this.f316561a.getFrame$ui_kit_components_release());
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        if (bottomSheetBehaviorFrom.getState() == 5) {
            onTransitionEnd.invoke();
        } else {
            this.f316563c = onTransitionEnd;
            bottomSheetBehaviorFrom.setState(5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void m() {
        View content$ui_kit_components_release = this.f316561a.getContent$ui_kit_components_release();
        if (content$ui_kit_components_release != null && content$ui_kit_components_release.getBackground() == null) {
            int i = ((Boolean) jo0.g.k.getValue()).booleanValue() ? R$attr.uikit_colorGroupedBackground : R$attr.uikit_windowBackground;
            Context context = content$ui_kit_components_release.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            content$ui_kit_components_release.setBackgroundColor(kli.a.s(i, context));
        }
    }

    public final com.revolut.core.ui_kit.views.o n() {
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        ViewParent parent = oVar.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        int iIndexOfChild = viewGroup.indexOfChild(oVar);
        while (true) {
            iIndexOfChild--;
            if (-1 >= iIndexOfChild) {
                return null;
            }
            View childAt = viewGroup.getChildAt(iIndexOfChild);
            com.revolut.core.ui_kit.views.o oVar2 = childAt instanceof com.revolut.core.ui_kit.views.o ? (com.revolut.core.ui_kit.views.o) childAt : null;
            if (oVar2 != null && !oVar2.f59581x.a()) {
                return oVar2;
            }
        }
    }

    public com.revolut.core.ui_kit.views.o o() {
        com.revolut.core.ui_kit.views.o oVarN = n();
        if (oVarN == null) {
            return null;
        }
        if (!Intrinsics.f(oVarN.getStyle(), ja.f209785a)) {
            Intrinsics.checkNotNullParameter(h.class, "class");
            if (!h.class.isInstance(oVarN.f59578s) || !oVarN.getPopupStyleActivator().a()) {
                return null;
            }
        }
        return oVarN;
    }

    public final void p() {
        com.revolut.core.ui_kit.views.o oVar;
        WeakReference weakReference = this.f316566j;
        this.f316566j = null;
        if (weakReference == null || (oVar = (com.revolut.core.ui_kit.views.o) weakReference.get()) == null) {
            return;
        }
        UIKitLinearLayout frame$ui_kit_components_release = oVar.getFrame$ui_kit_components_release();
        Object token = this.f;
        if (frame$ui_kit_components_release != null) {
            ks0.l.Companion.getClass();
            ks0.l lVarA = ks0.j.a(frame$ui_kit_components_release);
            Intrinsics.checkNotNullParameter(token, "token");
            if (lVarA.f189080b.remove(token) != null) {
                lVarA.a();
            }
        }
        ks0.i foregroundDimmer$ui_kit_components_release = oVar.getForegroundDimmer$ui_kit_components_release();
        foregroundDimmer$ui_kit_components_release.getClass();
        Intrinsics.checkNotNullParameter(token, "token");
        ArrayMap arrayMap = foregroundDimmer$ui_kit_components_release.d;
        if ((arrayMap != null ? (Float) arrayMap.remove(token) : null) != null) {
            foregroundDimmer$ui_kit_components_release.a();
        }
    }

    public void q(float f) {
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        Context context = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Object objEvaluate = this.f316562b.evaluate(f, 0, Integer.valueOf(kli.a.s(com.revolut.core.ui_kit.R$attr.internal_colorModalPopupDimmer, context)));
        Intrinsics.i(objEvaluate, "null cannot be cast to non-null type kotlin.Number");
        oVar.setBackgroundColor(((Number) objEvaluate).intValue());
    }

    public final void r(ModalViewContainerBehavior behavior, ifm.b disposable) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        int i = 10;
        disposable.a(this.f316561a.getNonCancelableActivator().f169293c.doFinally(new xza.a(behavior, this, i)).subscribe(new ypg.l(new yrb.i(behavior, this, i), 22)));
    }

    @Override // mx0.aa
    public void reset() {
        this.f316564g.d();
        p();
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        oVar.setBackground(null);
        UIKitLinearLayout frame$ui_kit_components_release = oVar.getFrame$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release, "<get-frame>(...)");
        ViewGroup.LayoutParams layoutParams = frame$ui_kit_components_release.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        layoutParams2.setBehavior(null);
        frame$ui_kit_components_release.setLayoutParams(layoutParams2);
        ViewCompat.setOnApplyWindowInsetsListener(oVar.getContentContainer$ui_kit_components_release(), null);
        oVar.getContentContainer$ui_kit_components_release().setFitsReadableArea(false);
        oVar.setSideSpaceClickListener$ui_kit_components_release(null);
    }

    public final void s(float f, Object obj2) {
        if (Intrinsics.f(this.e, obj2)) {
            com.revolut.core.ui_kit.views.o oVarO = o();
            WeakReference weakReference = this.f316566j;
            if ((weakReference != null ? (com.revolut.core.ui_kit.views.o) weakReference.get() : null) != oVarO) {
                p();
                if (oVarO != null) {
                    this.f316566j = new WeakReference(oVarO);
                }
            }
            if (oVarO == null) {
                q(f);
                return;
            }
            float f4 = 1 - (0.100000024f * f);
            ks0.j jVar = ks0.l.Companion;
            UIKitLinearLayout frame$ui_kit_components_release = oVarO.getFrame$ui_kit_components_release();
            Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release, "<get-frame>(...)");
            jVar.getClass();
            ks0.l lVarA = ks0.j.a(frame$ui_kit_components_release);
            Float fValueOf = Float.valueOf((-f) * 8.0f);
            Float fValueOf2 = Float.valueOf(f4);
            Float fValueOf3 = Float.valueOf(f4);
            Object token = this.f;
            ks0.l.d(lVarA, token, fValueOf, fValueOf2, fValueOf3, 2);
            ks0.i foregroundDimmer$ui_kit_components_release = oVarO.getForegroundDimmer$ui_kit_components_release();
            foregroundDimmer$ui_kit_components_release.getClass();
            Intrinsics.checkNotNullParameter(token, "token");
            ArrayMap arrayMap = foregroundDimmer$ui_kit_components_release.d;
            if (arrayMap == null) {
                arrayMap = new ArrayMap();
                foregroundDimmer$ui_kit_components_release.d = arrayMap;
            }
            arrayMap.put(token, Float.valueOf(f));
            foregroundDimmer$ui_kit_components_release.a();
        }
    }
}
