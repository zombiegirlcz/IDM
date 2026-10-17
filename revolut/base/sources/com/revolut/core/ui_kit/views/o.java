package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$attr;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.base.UIKitView;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.internal.views.linearlayout.UIKitLinearLayout;
import com.revolut.core.ui_kit.internal.views.modal.ModalTopSpacerView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ModalViewContainerBehavior;
import ix0.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;
import mx0.aa;
import mx0.ea;
import mx0.fa;
import mx0.ga;
import mx0.ha;
import mx0.ia;
import mx0.ja;
import mx0.ka;
import mx0.la;
import mx0.x8;
import mx0.y9;
import org.jetbrains.annotations.NotNull;
import yt0.d0;
import yt0.i0;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends CoordinatorLayout implements zv0.a, ny0.h {
    public final la A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f59566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f59567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f59568c;
    public final js0.c d;
    public View.OnClickListener e;
    public final GestureDetector f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function0 f59569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f59570h;
    public final x8 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f59571j;
    public final UIKitLinearLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UIKitFrameLayout f59572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UIKitView f59573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f59574n;
    public final View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ModalTopSpacerView f59575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public FrameLayout f59576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y9 f59577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public aa f59578s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f59579t;
    public final ks0.i u;
    public final la v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f59580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f59581x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.b f59582y;
    public final a z;

    public static final class a extends s1 {
        @Override // ix0.s1
        public final void b() {
        }

        @Override // ix0.s1
        public final void c() {
        }
    }

    public static final class b extends s1 {
        @Override // ix0.s1
        public final void b() {
        }

        @Override // ix0.s1
        public final void c() {
        }
    }

    public static final class c extends s1 {
        @Override // ix0.s1
        public final void b() {
        }

        @Override // ix0.s1
        public final void c() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(o oVar, int i) {
        oVar.setForegroundColor(i);
        return Unit.f186387a;
    }

    public static /* synthetic */ void getHideKnobActivator$annotations() {
    }

    public static /* synthetic */ void getNonCancelableActivator$annotations() {
    }

    public static /* synthetic */ void getPopupStyleActivator$annotations() {
    }

    private final void setForegroundColor(int i) {
        this.f59579t = i;
        UIKitView foreground = this.f59573m;
        Intrinsics.checkNotNullExpressionValue(foreground, "foreground");
        foreground.setVisibility(this.f59579t != 0 ? 0 : 8);
        foreground.setBackgroundColor(i);
    }

    public final void b(ek2.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f59568c.add(listener);
        this.f59578s.j(listener);
    }

    public final void c(ebi.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f59567b.add(listener);
        this.f59578s.g(listener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
        if (z) {
            return;
        }
        super.dispatchSetPressed(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L64
            js0.c r0 = r5.d
            r0.getClass()
            java.lang.String r1 = "ev"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            androidx.collection.MutableIntSet r1 = r0.f178089a
            boolean r2 = r1.isEmpty()
            int r3 = r6.getActionMasked()
            if (r3 == 0) goto L35
            r4 = 1
            if (r3 == r4) goto L29
            r4 = 3
            if (r3 == r4) goto L25
            r4 = 5
            if (r3 == r4) goto L35
            r4 = 6
            if (r3 == r4) goto L29
            goto L40
        L25:
            r1.clear()
            goto L40
        L29:
            int r3 = r6.getActionIndex()
            int r3 = r6.getPointerId(r3)
            r1.remove(r3)
            goto L40
        L35:
            int r3 = r6.getActionIndex()
            int r3 = r6.getPointerId(r3)
            r1.add(r3)
        L40:
            boolean r1 = r1.isEmpty()
            if (r2 == r1) goto L5f
            java.util.ArrayList r0 = r0.f178090b
            int r2 = r0.size()
            r3 = 0
        L4d:
            if (r3 >= r2) goto L5f
            java.lang.Object r4 = r0.get(r3)
            yt0.x r4 = (yt0.x) r4
            yt0.b0 r4 = r4.f316605a
            r4.f316521g = r1
            r4.b()
            int r3 = r3 + 1
            goto L4d
        L5f:
            android.view.GestureDetector r0 = r5.f
            r0.onTouchEvent(r6)
        L64:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.o.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final View getContent$ui_kit_components_release() {
        Integer num = this.f59571j;
        if (num == null) {
            return null;
        }
        UIKitFrameLayout contentContainer = this.f59572l;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        return contentContainer.findViewById(num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getContentActiveControllerView$ui_kit_components_release() {
        /*
            r3 = this;
            android.view.View r0 = r3.getContent$ui_kit_components_release()
            r1 = 0
            if (r0 == 0) goto L16
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 != 0) goto Lc
            r0 = r1
        Lc:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L16
            r2 = 0
            android.view.View r0 = r0.getChildAt(r2)
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L1e
            android.view.View r0 = te0.w.B(r0)
            return r0
        L1e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.o.getContentActiveControllerView$ui_kit_components_release():android.view.View");
    }

    public final UIKitFrameLayout getContentContainer$ui_kit_components_release() {
        return this.f59572l;
    }

    public final Integer getContentId$ui_kit_components_release() {
        return this.f59571j;
    }

    public final ViewGroup getContentWrapper$ui_kit_components_release() {
        return this.f59576q;
    }

    @NotNull
    public final s1 getEmbeddedContentActivator$ui_kit_components_release() {
        return this.z;
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    @NotNull
    public final List<View> getFooterViews() {
        return this.f59566a;
    }

    public final UIKitView getForeground$ui_kit_components_release() {
        return this.f59573m;
    }

    @NotNull
    public final ks0.i getForegroundDimmer$ui_kit_components_release() {
        return this.u;
    }

    public final UIKitLinearLayout getFrame$ui_kit_components_release() {
        return this.k;
    }

    @NotNull
    public final cr0.m getHeightTransitionInfo$ui_kit_components_release() {
        ModalViewContainerBehavior.Companion bVar = ModalViewContainerBehavior.INSTANCE;
        UIKitLinearLayout frame = this.k;
        Intrinsics.checkNotNullExpressionValue(frame, "frame");
        bVar.getClass();
        return ModalViewContainerBehavior.Companion.a(frame).d.f108180b;
    }

    @NotNull
    public final efm.r<Boolean> getHideInProgressObservable$ui_kit_components_release() {
        return this.f59582y;
    }

    @NotNull
    public final s1 getHideKnobActivator() {
        return this.v;
    }

    public final View getKnob$ui_kit_components_release() {
        return this.f59574n;
    }

    public final View getKnobContainer$ui_kit_components_release() {
        return this.o;
    }

    @NotNull
    public final s1 getNonCancelableActivator() {
        return this.f59580w;
    }

    @NotNull
    public final Function0<Unit> getOnDismiss$ui_kit_components_release() {
        return this.i;
    }

    @NotNull
    public final y9 getOrCreateEmbeddedContentContainerView() {
        y9 y9Var = this.f59577r;
        if (y9Var != null) {
            return y9Var;
        }
        y9.Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "hostView");
        y9 y9Var2 = new y9(this);
        y9Var2.setId(R$id.internal_modal_embedded_container);
        y9Var2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        y9Var2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        getContentContainer$ui_kit_components_release().addView(y9Var2, getContentContainer$ui_kit_components_release().indexOfChild(getKnobContainer$ui_kit_components_release()));
        this.f59577r = y9Var2;
        return y9Var2;
    }

    @NotNull
    public final s1 getPopupStyleActivator() {
        return this.A;
    }

    public final View.OnClickListener getSideSpaceClickListener$ui_kit_components_release() {
        return this.e;
    }

    @NotNull
    public final ka getStyle() {
        aa aaVar = this.f59578s;
        return aaVar instanceof yt0.h ? new ea(((yt0.h) aaVar).f316543l) : aaVar instanceof yt0.o ? new fa(((yt0.o) aaVar).k) : aaVar instanceof i0 ? ja.f209785a : aaVar instanceof d0 ? ia.f209759a : aaVar instanceof yt0.v ? ha.f209736a : ga.f209720a;
    }

    public final ModalTopSpacerView getTopPaddingSpace$ui_kit_components_release() {
        return this.f59575p;
    }

    @NotNull
    public final js0.c getTouchTracker$ui_kit_components_release() {
        return this.d;
    }

    @NotNull
    public final View getView() {
        return this;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsF = this.f59578s.f(insets);
        if (windowInsetsF != null) {
            return windowInsetsF;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        this.f59578s.k();
    }

    public final void setContentId$ui_kit_components_release(Integer num) {
        this.f59571j = num;
    }

    @Override // zv0.a
    public void setExpandableModalState(@NotNull zv0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f59578s.setExpandableModalState(state);
    }

    @Override // zv0.a
    public void setNonCancelable(@NotNull Object token, boolean z) {
        Intrinsics.checkNotNullParameter(token, "token");
        kotlin.jvm.internal.s.x(this.f59580w, token, z);
    }

    public final void setOnDismissListener(Function0<Unit> function0) {
        this.f59569g = function0;
    }

    public final void setSideSpaceClickListener$ui_kit_components_release(View.OnClickListener onClickListener) {
        this.e = onClickListener;
    }

    public final void setStyle(@NotNull ka value) {
        aa vVar;
        aa oVar;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f59578s.reset();
        if (Intrinsics.f(value, ga.f209720a)) {
            vVar = new yt0.r(this);
        } else if (Intrinsics.f(value, ia.f209759a)) {
            vVar = new d0(this);
        } else if (Intrinsics.f(value, ja.f209785a)) {
            vVar = new i0(this);
        } else {
            if (value instanceof ea) {
                oVar = new yt0.h(this, ((ea) value).f209681a);
            } else if (value instanceof fa) {
                oVar = new yt0.o(this, ((fa) value).f209703a);
            } else {
                if (!Intrinsics.f(value, ha.f209736a)) {
                    throw new NoWhenBranchMatchedException();
                }
                vVar = new yt0.v(this);
            }
            vVar = oVar;
        }
        this.f59578s = vVar;
        vVar.init();
        Iterator it8 = this.f59568c.iterator();
        while (it8.hasNext()) {
            this.f59578s.j((ek2.g) it8.next());
        }
        Iterator it9 = this.f59567b.iterator();
        while (it9.hasNext()) {
            this.f59578s.g((ebi.a) it9.next());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public o(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59566a = new ArrayList();
        this.f59567b = new ArrayList();
        this.f59568c = new ArrayList();
        this.d = new js0.c();
        this.f = new GestureDetector(context, new bx0.q(this, 8));
        this.f59570h = new ArrayList();
        this.i = new x8(this, 1);
        View.inflate(context, R$layout.internal_modal_container, this);
        UIKitLinearLayout uIKitLinearLayout = (UIKitLinearLayout) findViewById(R$id.modalContainer_frame);
        this.k = uIKitLinearLayout;
        this.f59572l = (UIKitFrameLayout) findViewById(R$id.modalContainer_contentContainer);
        this.f59573m = (UIKitView) findViewById(R$id.modalContainer_foreground);
        View knob = findViewById(R$id.modalContainer_knob);
        if (((Boolean) jo0.g.k.getValue()).booleanValue()) {
            Intrinsics.h(knob);
            ViewGroup.LayoutParams layoutParams = knob.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = kli.a.k(context, 48.0f);
                layoutParams.height = kli.a.k(context, 4.0f);
                knob.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.f59574n = knob;
        this.o = findViewById(R$id.modalContainer_knobContainer);
        this.f59575p = (ModalTopSpacerView) findViewById(R$id.modalContainer_topPaddingSpace);
        this.f59578s = new yt0.r(this);
        this.u = new ks0.i(io0.a.d(0.2f, kli.a.s(R$attr.internal_colorModalPopupDimmer, context)), new a7(this, 4), ks0.g.PICK_MAX);
        this.v = new la(this, 0);
        this.f59580w = new c();
        b bVar = new b();
        this.f59581x = bVar;
        this.f59582y = bVar.f169293c;
        this.z = new a();
        this.A = new la(this, 1);
        setStyle(ga.f209720a);
        Intrinsics.checkNotNullExpressionValue(knob, "knob");
        pd.b.p(knob, new TextLocalisedClause(R$string.common_action_accessibility_label_dismiss_now, null, null, 14));
        uIKitLinearLayout.setReadableAreaGuidelinesEnabled(true);
    }

    public /* synthetic */ o(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
