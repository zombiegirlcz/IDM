package yt0;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import au0.u4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.internal.views.linearlayout.UIKitLinearLayout;
import com.revolut.core.ui_kit.internal.views.modal.ModalTopSpacerView;
import com.revolut.core.ui_kit.utils.ViewIdTarget;
import com.revolut.core.ui_kit.views.ModalViewContainerBehavior;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.ModalDestination;
import ix0.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import mx0.ba;
import mx0.ca;
import mx0.da;
import mx0.hd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends i0 {

    @NotNull
    public static final b Companion = new b();
    public boolean A;
    public final ArrayList B;
    public final com.revolut.core.ui_kit.views.o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final da f316543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ifm.b f316544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public hd f316545n;
    public WeakReference o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f316546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WindowInsets f316547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f316548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f316549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f316550t;
    public iv0.s u;
    public j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f316551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f316552x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f316553y;
    public final ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.core.ui_kit.views.o modalView, da mode) {
        super(modalView);
        Intrinsics.checkNotNullParameter(modalView, "modalView");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.k = modalView;
        this.f316543l = mode;
        this.f316544m = new ifm.b();
        this.f316548r = new Object();
        this.f316549s = new Rect();
        this.f316553y = new ArrayList();
        this.z = new ArrayList();
        this.B = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    public static final void t(h hVar, boolean z) {
        View view;
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(hVar.f316561a.getFrame$ui_kit_components_release());
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        da daVar = hVar.f316543l;
        if (daVar instanceof ca) {
            ca caVar = (ca) daVar;
            Float f = caVar.f209641c;
            float fFloatValue = f != null ? f.floatValue() : caVar.f209640b;
            j jVar = hVar.v;
            if (jVar != null) {
                bottomSheetBehaviorFrom.setPeekHeight(((int) (r0.getHeight() * fFloatValue)) + (jVar.d() ? jVar.f316570g : jVar.f316567a.getFrame$ui_kit_components_release().getPaddingBottom()));
            }
            if (((Boolean) jo0.g.k.getValue()).booleanValue() || !z || (view = (View) zhm.d0.e0(0, hVar.k.getFooterViews())) == null) {
                return;
            }
            view.setTranslationY(bottomSheetBehaviorFrom.getPeekHeight() - r0.getHeight());
        }
    }

    public static final void u(h hVar) {
        hVar.A = true;
        ArrayList arrayList = hVar.B;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((Function0) it8.next()).invoke();
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yt0.i0, mx0.aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(lki.s r15) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt0.h.a(lki.s):void");
    }

    @Override // yt0.i0, mx0.aa
    public final void b() {
        m();
        w();
        y();
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        if (!oVar.isLaidOut() || oVar.isLayoutRequested()) {
            oVar.addOnLayoutChangeListener(new e(this, 1));
        } else {
            t(this, true);
            u(this);
        }
        s(1.0f, null);
    }

    @Override // mx0.aa
    public final boolean c(ModalDestination.Style incomingStyle) {
        Intrinsics.checkNotNullParameter(incomingStyle, "incomingStyle");
        if (!Intrinsics.f(this.f316543l, ba.f209616a)) {
            return false;
        }
        if (incomingStyle instanceof ModalDestination.Style.BOTTOM_DIALOG) {
            return true;
        }
        if ((incomingStyle instanceof ModalDestination.Style.ContextualAlert) || (incomingStyle instanceof ModalDestination.Style.Custom) || (incomingStyle instanceof ModalDestination.Style.ExpandableBottomDialog) || (incomingStyle instanceof ModalDestination.Style.FULLSCREEN_FADE) || (incomingStyle instanceof ModalDestination.Style.FULLSCREEN_IMMEDIATE) || (incomingStyle instanceof ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM) || (incomingStyle instanceof ModalDestination.Style.FullscreenPaged) || (incomingStyle instanceof ModalDestination.Style.POPUP)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // mx0.aa
    public final void d(ebi.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = this.z;
        for (int iJ = zhm.v.j(arrayList); -1 < iJ; iJ--) {
            if (Intrinsics.f((ebi.a) arrayList.get(iJ), listener)) {
                arrayList.remove(iJ);
            }
        }
    }

    @Override // yt0.i0, mx0.aa
    public final WindowInsets f(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.f316547q = insets;
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
        da daVar = this.f316543l;
        if ((daVar instanceof ca) && ((ca) daVar).f209639a == -1) {
            if (this.f316546p != iK) {
                or0.u.z(oVar, 0, iK, 0, 0, false, 29);
                this.f316546p = iK;
            }
        } else if (daVar instanceof ba) {
            oVar.getTopPaddingSpace$ui_kit_components_release().setMinimalHeight(iK);
        }
        j jVar = this.v;
        if (jVar != null) {
            jVar.f316570g = insets2.bottom;
        }
        Insets insetsOf = Insets.of(insets2.left, 0, insets2.right, insets2.bottom);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        WindowInsets windowInsets = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, insetsOf).build().toWindowInsets();
        return windowInsets == null ? insets : windowInsets;
    }

    @Override // mx0.aa
    public final void g(ebi.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.z.add(listener);
    }

    @Override // mx0.aa
    public final void h(ek2.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = this.f316553y;
        for (int iJ = zhm.v.j(arrayList); -1 < iJ; iJ--) {
            if (Intrinsics.f((ek2.g) arrayList.get(iJ), listener)) {
                arrayList.remove(iJ);
            }
        }
    }

    @Override // mx0.aa
    public final void i() {
        setExpandableModalState(zv0.b.EXPANDED);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yt0.i0, mx0.aa
    public final void init() {
        int i;
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        View knobContainer$ui_kit_components_release = oVar.getKnobContainer$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(knobContainer$ui_kit_components_release, "<get-knobContainer>(...)");
        knobContainer$ui_kit_components_release.setVisibility(0);
        ModalTopSpacerView topPaddingSpace$ui_kit_components_release = oVar.getTopPaddingSpace$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(topPaddingSpace$ui_kit_components_release, "<get-topPaddingSpace>(...)");
        topPaddingSpace$ui_kit_components_release.setVisibility(0);
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
        iv0.s sVar = new iv0.s(fB, false);
        boolean zBooleanValue = ((Boolean) jo0.g.k.getValue()).booleanValue();
        if (zBooleanValue) {
            i = 0;
        } else {
            if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            i = (int) fB;
        }
        sVar.e.bottom = i;
        this.u = sVar;
        com.revolut.core.ui_kit.views.o modalViewContainerView = this.k;
        da daVar = this.f316543l;
        j jVar = new j(modalViewContainerView, daVar, sVar, iD);
        this.v = jVar;
        UIKitFrameLayout contentContainer$ui_kit_components_release = oVar.getContentContainer$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(contentContainer$ui_kit_components_release, "<get-contentContainer>(...)");
        ViewGroup.LayoutParams layoutParams = contentContainer$ui_kit_components_release.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(iD);
        marginLayoutParams.setMarginEnd(iD);
        marginLayoutParams.bottomMargin = 0;
        contentContainer$ui_kit_components_release.setLayoutParams(marginLayoutParams);
        oVar.getContentContainer$ui_kit_components_release().setOutlineProvider(sVar);
        oVar.getContentContainer$ui_kit_components_release().setClipToOutline(true);
        if (((Boolean) jo0.g.k.getValue()).booleanValue()) {
            UIKitLinearLayout frame$ui_kit_components_release = oVar.getFrame$ui_kit_components_release();
            a listener = new a(jVar);
            frame$ui_kit_components_release.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            List arrayList = frame$ui_kit_components_release.f57234c;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (frame$ui_kit_components_release.f57234c == null) {
                frame$ui_kit_components_release.f57234c = arrayList;
            } else if (!arrayList.contains(listener)) {
            }
            arrayList.add(listener);
        }
        Context context3 = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        if (!kli.a.q(context3) && !daVar.a()) {
            ViewCompat.setElevation(oVar.getContentContainer$ui_kit_components_release(), 16.0f);
            Context context4 = oVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            int iS = kli.a.s(R$attr.uikit_colorGreyTone50, context4);
            oVar.getContentContainer$ui_kit_components_release().setOutlineAmbientShadowColor(iS);
            oVar.getContentContainer$ui_kit_components_release().setOutlineSpotShadowColor(iS);
        }
        wk.a aVar = new wk.a(this, 3);
        View[] elements = {daVar.a() ? oVar : null, daVar.a() ? oVar.getTopPaddingSpace$ui_kit_components_release() : null, oVar.getKnobContainer$ui_kit_components_release()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it8 = kotlin.collections.d.L(elements).iterator();
        while (it8.hasNext()) {
            ((View) it8.next()).setOnClickListener(aVar);
        }
        if (daVar.a()) {
            oVar.setSideSpaceClickListener$ui_kit_components_release(aVar);
        }
        if (((Boolean) jo0.g.k.getValue()).booleanValue()) {
            if (daVar instanceof ba) {
                ViewCompat.setOnApplyWindowInsetsListener(oVar.getContentContainer$ui_kit_components_release(), new ypg.l(this, 21));
            } else if (!(daVar instanceof ca)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        ModalViewContainerBehavior.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(modalViewContainerView, "modalViewContainerView");
        ModalViewContainerBehavior modalViewContainerBehavior = new ModalViewContainerBehavior(modalViewContainerView);
        UIKitLinearLayout frame$ui_kit_components_release2 = oVar.getFrame$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release2, "<get-frame>(...)");
        ViewGroup.LayoutParams layoutParams2 = frame$ui_kit_components_release2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.LayoutParams layoutParams3 = (CoordinatorLayout.LayoutParams) layoutParams2;
        layoutParams3.setBehavior(modalViewContainerBehavior);
        frame$ui_kit_components_release2.setLayoutParams(layoutParams3);
        ifm.b bVar = this.f316544m;
        r(modalViewContainerBehavior, bVar);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(oVar.getFrame$ui_kit_components_release());
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        bottomSheetBehaviorFrom.setHideable(true);
        bottomSheetBehaviorFrom.setState(5);
        if (daVar instanceof ca) {
            ca caVar = (ca) daVar;
            if (caVar.f209641c != null) {
                bottomSheetBehaviorFrom.setFitToContents(false);
                bottomSheetBehaviorFrom.setHalfExpandedRatio(caVar.f209640b);
            }
            bottomSheetBehaviorFrom.setSkipCollapsed(false);
        } else {
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
        }
        bottomSheetBehaviorFrom.addBottomSheetCallback(new d(jVar, this, bottomSheetBehaviorFrom));
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f186407a = true;
        int i2 = 18;
        bVar.a(efm.r.combineLatest(oVar.getPopupStyleActivator().f169293c, oVar.getEmbeddedContentActivator$ui_kit_components_release().f169293c, new ypg.l(new yi3.d(this, i2), 17)).subscribe(new ypg.l(new yrb.i(jVar, ref$BooleanRef, 9), i2)));
        oVar.getContentContainer$ui_kit_components_release().setFitsReadableArea(true);
    }

    @Override // mx0.aa
    public final void j(ek2.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f316553y.add(listener);
        yff.b bVar = new yff.b(this, listener, 22);
        if (this.A) {
            bVar.invoke();
        } else {
            this.B.add(bVar);
        }
    }

    @Override // yt0.i0, mx0.aa
    public final void k() {
        super.k();
        if (this.f316543l instanceof ca) {
            com.revolut.core.ui_kit.views.o oVar = this.f316561a;
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(oVar.getFrame$ui_kit_components_release());
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            WindowInsets rootWindowInsets = this.f316547q;
            if (rootWindowInsets == null) {
                rootWindowInsets = oVar.getRootWindowInsets();
            }
            Intrinsics.h(rootWindowInsets);
            if (x0.c(rootWindowInsets)) {
                bottomSheetBehaviorFrom.setState(3);
                bottomSheetBehaviorFrom.setSkipCollapsed(true);
            } else {
                bottomSheetBehaviorFrom.setSkipCollapsed(false);
            }
        }
        j jVar = this.v;
        if (jVar != null) {
            if (jVar.d()) {
                float f = jVar.e;
                if (f != BitmapDescriptorFactory.HUE_RED) {
                    jVar.b(f);
                }
            }
            tp4.d dVar = jVar.f316572j;
            if (dVar != null) {
                jVar.f316572j = null;
                dVar.invoke();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yt0.i0, mx0.aa
    public final void l(mhd.b onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        if (((Boolean) jo0.g.k.getValue()).booleanValue()) {
            WeakReference weakReference = this.o;
            View view = weakReference != null ? (View) weakReference.get() : null;
            com.revolut.core.ui_kit.views.o oVar = this.f316561a;
            ViewParent parent = oVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            boolean z = (BottomSheetBehavior.from(oVar.getFrame$ui_kit_components_release()).getState() == 5 || view == null || viewGroup == null || !x(view, true)) ? false : true;
            if (z) {
                Object token = this.f316548r;
                Intrinsics.checkNotNullParameter(token, "token");
                this.e = token;
                v(view, viewGroup, true, onTransitionEnd);
            } else {
                if (view == null || view.getVisibility() != 4) {
                    view = null;
                }
                Object obj2 = or0.u.f228038a;
                if (view != null && (view.getVisibility() != 0 || view.getAlpha() != 1.0f)) {
                    if (view.getVisibility() != 0) {
                        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        view.setVisibility(0);
                    }
                    if (view.getAlpha() < 1.0f) {
                        view.animate().alpha(1.0f).start();
                    }
                }
            }
            this.o = null;
            if (z) {
                return;
            }
        }
        super.l(onTransitionEnd);
    }

    @Override // yt0.i0
    public final com.revolut.core.ui_kit.views.o o() {
        if (this.k.getPopupStyleActivator().a()) {
            return super.o();
        }
        com.revolut.core.ui_kit.views.o oVarN = n();
        if (oVarN == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(h.class, "class");
        if (!h.class.isInstance(oVarN.f59578s) || oVarN.getPopupStyleActivator().a()) {
            return null;
        }
        return oVarN;
    }

    @Override // yt0.i0
    public final void q(float f) {
        boolean zA = this.f316543l.a();
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        if (!zA) {
            oVar.setBackground(null);
            return;
        }
        Context context = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Object objEvaluate = this.f316562b.evaluate(f, 0, Integer.valueOf(kli.a.s(com.revolut.core.ui_kit.R$attr.internal_colorModalPopupDimmer, context)));
        Intrinsics.i(objEvaluate, "null cannot be cast to non-null type kotlin.Number");
        oVar.setBackgroundColor(((Number) objEvaluate).intValue());
    }

    @Override // yt0.i0, mx0.aa
    public final void reset() {
        super.reset();
        this.f316544m.d();
        this.f316551w = false;
        this.A = false;
        this.B.clear();
        this.f316552x = BitmapDescriptorFactory.HUE_RED;
        this.f316547q = null;
        j jVar = this.v;
        if (jVar != null) {
            com.revolut.core.ui_kit.views.o oVar = jVar.f316567a;
            ValueAnimator valueAnimator = jVar.f316571h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            jVar.f316571h = null;
            jVar.f316572j = null;
            jVar.e = BitmapDescriptorFactory.HUE_RED;
            jVar.f = BitmapDescriptorFactory.HUE_RED;
            jVar.f316570g = 0;
            ks0.j jVar2 = ks0.l.Companion;
            UIKitLinearLayout frame$ui_kit_components_release = oVar.getFrame$ui_kit_components_release();
            Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release, "<get-frame>(...)");
            jVar2.getClass();
            ks0.l lVarA = ks0.j.a(frame$ui_kit_components_release);
            Object token = jVar.i;
            Intrinsics.checkNotNullParameter(token, "token");
            if (lVarA.f189080b.remove(token) != null) {
                lVarA.a();
            }
            oVar.getContentContainer$ui_kit_components_release().setScaleX(1.0f);
            UIKitFrameLayout contentContainer$ui_kit_components_release = oVar.getContentContainer$ui_kit_components_release();
            Intrinsics.checkNotNullExpressionValue(contentContainer$ui_kit_components_release, "<get-contentContainer>(...)");
            Intrinsics.checkNotNullParameter(contentContainer$ui_kit_components_release, "<this>");
            contentContainer$ui_kit_components_release.resetPivot();
            oVar.getTopPaddingSpace$ui_kit_components_release().setOnLayoutExtraHeightProvider(null);
            UIKitLinearLayout frame$ui_kit_components_release2 = oVar.getFrame$ui_kit_components_release();
            Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release2, "<get-frame>(...)");
            ViewGroup.LayoutParams layoutParams = frame$ui_kit_components_release2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -1;
            frame$ui_kit_components_release2.setLayoutParams(layoutParams);
        }
        this.f316553y.clear();
        this.z.clear();
        com.revolut.core.ui_kit.views.o oVar2 = this.f316561a;
        oVar2.getTopPaddingSpace$ui_kit_components_release().setMinimalHeight(0);
        oVar2.getContentContainer$ui_kit_components_release().setFitsReadableArea(false);
        oVar2.setSideSpaceClickListener$ui_kit_components_release(null);
    }

    @Override // mx0.aa
    public final void setExpandableModalState(zv0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(state, "state");
        yff.b bVar = new yff.b(this, state, 23);
        if (this.A) {
            bVar.invoke();
        } else {
            this.B.add(bVar);
        }
    }

    public final void v(View view, ViewGroup viewGroup, boolean z, Function0 function0) {
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        UIKitFrameLayout expandedView = oVar.getContentContainer$ui_kit_components_release();
        hd hdVar = this.f316545n;
        if (hdVar != null) {
            ViewParent parent = hdVar.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(hdVar);
            }
            this.f316545n = null;
        }
        if (!z) {
            this.o = new WeakReference(view);
            oVar.getFrame$ui_kit_components_release().setClipToPadding(false);
            oVar.setClipChildren(false);
        }
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        hd hdVar2 = new hd(context, null, 6, 0);
        viewGroup.addView(hdVar2, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f316545n = hdVar2;
        Intrinsics.h(expandedView);
        Intrinsics.checkNotNullParameter(expandedView, "expandedView");
        jy0.m mVar = new jy0.m(view, hdVar2, expandedView, hdVar2.e, hdVar2.f209743h, z, null);
        mVar.f179274h = new yq0.e(this, 8);
        ValueAnimator valueAnimatorF = mVar.f();
        valueAnimatorF.addUpdateListener(new pxl.b(this, z, 1));
        valueAnimatorF.addListener(new u4(this, z, view, function0));
        valueAnimatorF.start();
    }

    public final void w() {
        int i;
        int height;
        da daVar = this.f316543l;
        if (!(daVar instanceof ca) || (i = ((ca) daVar).f209639a) == -1) {
            return;
        }
        com.revolut.core.ui_kit.views.o oVar = this.f316561a;
        Context context = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = z92.f.i(context);
        View viewFindViewById = activityI != null ? activityI.findViewById(R.id.content) : null;
        View viewA = viewFindViewById != null ? js0.d.a(new ViewIdTarget(i), viewFindViewById) : null;
        if (viewA != null) {
            int[] iArr = new int[2];
            viewA.getLocationOnScreen(iArr);
            height = viewA.getHeight() + iArr[1];
        } else {
            height = 0;
        }
        or0.u.z(oVar, 0, height, 0, 0, false, 29);
    }

    public final boolean x(View view, boolean z) {
        boolean z3 = !z ? view.getVisibility() != 0 : view.getVisibility() == 8;
        if (view.isAttachedToWindow() && z3 && view.getWidth() > 0 && view.getHeight() > 0) {
            Rect rect = this.f316549s;
            if (view.getGlobalVisibleRect(rect)) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iG = c8g.c.G(context);
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                if (rect.top >= iG - kli.a.k(context2, 275.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void y() {
        int i;
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(this.f316561a.getFrame$ui_kit_components_release());
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        da daVar = this.f316543l;
        if (daVar instanceof ca) {
            i = ((ca) daVar).f209641c != null ? 6 : 4;
        } else {
            if (!(daVar instanceof ba)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 3;
        }
        bottomSheetBehaviorFrom.setState(i);
    }
}
