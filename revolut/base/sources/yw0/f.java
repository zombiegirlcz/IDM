package yw0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.t1;
import aw0.v1;
import aw0.x8;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView;
import com.revolut.core.ui_kit.internal.views.ShimmeringPillShapeView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.v7;
import ix0.w0;
import ix0.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import ju0.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import ms0.h4;
import mx0.w5;
import org.jetbrains.annotations.NotNull;
import ox0.b0;
import yw0.f;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends ConstraintLayout implements w0, ax0.k, qp0.a {

    @NotNull
    public static final a Companion = new a();
    public final Object A;
    public final int B;
    public final ColorDrawable C;
    public final LinkedHashMap D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.b f317258b;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f317259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f317260h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f317261j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f317262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ax0.l f317263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ax0.l f317264n;
    public ValueAnimator o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ifm.c f317265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x8 f317266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f317267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f317268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f317269t;
    public final a5h.g u;
    public final ju0.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Guideline f317270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Guideline f317271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BasicNavBar f317272y;
    public final Object z;

    public static final class a {
        private a() {
        }
    }

    public static final class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f317273a;

        public b() {
            this(0);
        }

        @Override // yw0.k
        public final boolean a() {
            return false;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f317273a == ((b) obj2).f317273a;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Integer.hashCode(this.f317273a) * 31);
        }

        public b(int i) {
            this.f317273a = R$drawable.uikit_icn_24_cross;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static ShapeDrawable f0(boolean z, float[] fArr, int[] iArr) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setShaderFactory(new u(z, fArr, iArr));
        return shapeDrawable;
    }

    private final r getCurrentPage() {
        a0 a0Var = this.f317261j;
        z zVar = a0Var instanceof z ? (z) a0Var : null;
        if (zVar != null) {
            return (r) zVar.f317311a.f317297a.get(zVar.f317312b);
        }
        return null;
    }

    public final void g0() {
        a0 a0Var = this.f317261j;
        z zVar = a0Var instanceof z ? (z) a0Var : null;
        if (zVar == null) {
            return;
        }
        int i = zVar.f317312b;
        z zVarD = zVar.d(i + 1);
        this.f317261j = zVarD;
        int i2 = zVarD.f317312b;
        if (i2 != i) {
            o0(i2, true, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ax0.k
    @NotNull
    public ActionFooterView getActionFooterView() {
        return (ActionFooterView) this.A.getValue();
    }

    public final int getCurrentPageIndex() {
        a0 a0Var = this.f317261j;
        z zVar = a0Var instanceof z ? (z) a0Var : null;
        if (zVar != null) {
            return zVar.f317312b;
        }
        return 0;
    }

    @Override // qp0.a
    @NotNull
    public Context getDynamicContext() {
        return (Context) this.u.f;
    }

    @Override // ax0.k
    @NotNull
    public ConstraintLayout getHostView() {
        return this;
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // ax0.k
    @NotNull
    public BasicNavBar getNavigationBar() {
        return this.f317272y;
    }

    public final int getPagesCount() {
        s sVar;
        a0 a0Var = this.f317261j;
        z zVar = a0Var instanceof z ? (z) a0Var : null;
        if (zVar == null || (sVar = zVar.f317311a) == null) {
            return 0;
        }
        return sVar.f317297a.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ax0.k
    @NotNull
    public ProgressPagingIndicatorView getProgressView() {
        return (ProgressPagingIndicatorView) this.z.getValue();
    }

    public final void h0() {
        a0 a0Var = this.f317261j;
        z zVar = a0Var instanceof z ? (z) a0Var : null;
        if (zVar == null) {
            return;
        }
        int i = zVar.f317312b;
        z zVarD = zVar.d(i - 1);
        this.f317261j = zVarD;
        int i2 = zVarD.f317312b;
        if (i2 != i) {
            o0(i2, false, true);
        }
    }

    public final efm.r i0() {
        efm.r rVarDistinctUntilChanged = this.v.f178561a.h().switchMap(new yua.h(new yw0.a(this, 3), 12)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final ShimmerFrameLayout j0() {
        List list = (List) this.D.get(ShimmerFrameLayout.class);
        AttributeSet attributeSet = null;
        View view = list != null ? (View) zhm.a0.G(list) : null;
        if (!(view instanceof ShimmerFrameLayout)) {
            view = null;
        }
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view;
        if (shimmerFrameLayout != null) {
            return shimmerFrameLayout;
        }
        ShimmerFrameLayout shimmerFrameLayout2 = new ShimmerFrameLayout(getContext());
        shimmerFrameLayout2.d(yp0.a0.b());
        Context context = shimmerFrameLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        shimmerFrameLayout2.addView(new ShimmeringPillShapeView(context, attributeSet, 6, 0), new ViewGroup.LayoutParams(-1, -1));
        shimmerFrameLayout2.setId(View.generateViewId());
        return shimmerFrameLayout2;
    }

    public final TagView l0() {
        List list = (List) this.D.get(TagView.class);
        AttributeSet attributeSet = null;
        View view = list != null ? (View) zhm.a0.G(list) : null;
        if (!(view instanceof TagView)) {
            view = null;
        }
        TagView tagView = (TagView) view;
        if (tagView != null) {
            return tagView;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TagView tagView2 = new TagView(context, attributeSet, 6, 0);
        tagView2.setId(View.generateViewId());
        return tagView2;
    }

    public final UIKitTextView m0() {
        List list = (List) this.D.get(UIKitTextView.class);
        View view = list != null ? (View) zhm.a0.G(list) : null;
        if (!(view instanceof UIKitTextView)) {
            view = null;
        }
        UIKitTextView uIKitTextView = (UIKitTextView) view;
        if (uIKitTextView != null) {
            return uIKitTextView;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, null, 6, 0);
        Context context2 = uIKitTextView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        uIKitTextView2.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context2));
        uIKitTextView2.setId(View.generateViewId());
        return uIKitTextView2;
    }

    public final void n0(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAlpha(1.0f);
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        view.setVisibility(0);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.clear(view.getId());
        constraintSet.applyTo(this);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(view);
        Class<?> cls = view.getClass();
        LinkedHashMap linkedHashMap = this.D;
        Object arrayList = linkedHashMap.get(cls);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(cls, arrayList);
        }
        ((List) arrayList).add(view);
    }

    public final void o0(int i, boolean z, boolean z3) {
        r rVar;
        ju0.i gVar;
        ax0.l lVar;
        v1 v1Var;
        Integer num;
        a0 a0Var = this.f317261j;
        z zVar = a0Var instanceof z ? (z) a0Var : null;
        if (zVar == null || (rVar = (r) d0.e0(i, zVar.f317311a.f317297a)) == null) {
            return;
        }
        s0(0L, -1L, false);
        n14.e eVarA = rVar.a();
        boolean zQ = rVar.a().q();
        if (eVarA instanceof d) {
            gVar = new ju0.h(UrlVideo.a(((d) eVarA).f317255b, zQ, null, null, 123));
        } else {
            if (!(eVarA instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar = (c) eVarA;
            gVar = new ju0.g(cVar.f317253c, cVar.f317252b, zQ);
        }
        this.v.setBackground(gVar);
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ax0.l lVar2 = this.f317264n;
        if (lVar2 != null) {
            lVar2.recycle();
        }
        this.o = null;
        this.f317264n = null;
        ax0.l lVar3 = this.f317263m;
        if (rVar instanceof o) {
            Intrinsics.checkNotNullParameter(this, "parent");
            ConstraintLayout hostView = getHostView();
            TagView tagViewL0 = l0();
            UIKitTextView uIKitTextViewB = ax0.m.b(this);
            UIKitTextView uIKitTextViewA = ax0.m.a(this);
            hostView.addView(tagViewL0, new ConstraintLayout.LayoutParams(-2, -2));
            hostView.addView(uIKitTextViewB, new ConstraintLayout.LayoutParams(0, -2));
            hostView.addView(uIKitTextViewA, new ConstraintLayout.LayoutParams(0, -2));
            ax0.h hVar = new ax0.h(this, tagViewL0, uIKitTextViewB, uIKitTextViewA);
            o page = (o) rVar;
            Intrinsics.checkNotNullParameter(page, "page");
            hVar.f10840g = page;
            boolean z4 = page.f317295b;
            e eVar = page.f317287h;
            int i2 = z4 ? 0 : 8;
            ProgressPagingIndicatorView progressPagingIndicatorView = hVar.f;
            progressPagingIndicatorView.setVisibility(i2);
            tagViewL0.setVisibility(eVar != null ? 0 : 8);
            uIKitTextViewB.setVisibility(page.f != null ? 0 : 8);
            uIKitTextViewA.setVisibility(page.f317286g != null ? 0 : 8);
            if (eVar != null) {
                Context context = getHostView().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                tagViewL0.setContent(ax0.m.d(eVar, context));
            }
            Context context2 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ty0.c.b(jh.d.f(context2).b0(), page.f, uIKitTextViewB, null, null, 12);
            Context context3 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ty0.c.b(jh.d.f(context3).b0(), page.f317286g, uIKitTextViewA, null, null, 12);
            Context context4 = getHostView().getContext();
            Intrinsics.h(context4);
            int iK = kli.a.k(context4, 16.0f);
            ConstraintLayout hostView2 = getHostView();
            ConstraintSet constraintSetL = v7.l(hostView2);
            hx7.q.f(constraintSetL, progressPagingIndicatorView, getBottomGuideline(), kli.a.k(context4, 16.0f));
            hx7.q.i(constraintSetL, progressPagingIndicatorView, iK);
            hx7.q.f(constraintSetL, uIKitTextViewA, progressPagingIndicatorView, kli.a.k(context4, 56.0f));
            hx7.q.i(constraintSetL, uIKitTextViewA, iK);
            hx7.q.f(constraintSetL, uIKitTextViewB, uIKitTextViewA, uIKitTextViewA.getVisibility() == 0 ? kli.a.k(context4, 12.0f) : kli.a.k(context4, 56.0f));
            hx7.q.i(constraintSetL, uIKitTextViewB, iK);
            hx7.q.f(constraintSetL, tagViewL0, uIKitTextViewB, kli.a.k(context4, 20.0f));
            hx7.q.i(constraintSetL, tagViewL0, iK);
            constraintSetL.applyTo(hostView2);
            lVar = hVar;
        } else if (rVar instanceof p) {
            Intrinsics.checkNotNullParameter(this, "parent");
            ConstraintLayout hostView3 = getHostView();
            UIKitTextView uIKitTextViewB2 = ax0.m.b(this);
            UIKitTextView uIKitTextViewA2 = ax0.m.a(this);
            hostView3.addView(uIKitTextViewB2, new ConstraintLayout.LayoutParams(0, -2));
            hostView3.addView(uIKitTextViewA2, new ConstraintLayout.LayoutParams(0, -2));
            ax0.g gVar2 = new ax0.g(this, uIKitTextViewB2, uIKitTextViewA2);
            p page2 = (p) rVar;
            Intrinsics.checkNotNullParameter(page2, "page");
            ActionFooterView actionFooterView = gVar2.e;
            actionFooterView.setVisibility(0);
            m6 m6Var = n6.Companion;
            actionFooterView.setModel(new aw0.h(false, m6.c(m6Var, page2.f317289h, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, page2.i, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), page2.f317290j, b0.BELOW_BUTTONS, null, 97));
            Context context5 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            ty0.c.b(jh.d.f(context5).b0(), page2.f, uIKitTextViewB2, null, null, 12);
            Context context6 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            ty0.c.b(jh.d.f(context6).b0(), page2.f317288g, uIKitTextViewA2, null, null, 12);
            Context context7 = getHostView().getContext();
            Intrinsics.h(context7);
            int iK2 = kli.a.k(context7, 16.0f);
            ConstraintLayout hostView4 = getHostView();
            ConstraintSet constraintSetL2 = v7.l(hostView4);
            hx7.q.f(constraintSetL2, actionFooterView, getBottomGuideline(), 0);
            hx7.q.i(constraintSetL2, actionFooterView, 0);
            hx7.q.f(constraintSetL2, uIKitTextViewA2, actionFooterView, kli.a.k(context7, 16.0f));
            hx7.q.i(constraintSetL2, uIKitTextViewA2, iK2);
            hx7.q.f(constraintSetL2, uIKitTextViewB2, uIKitTextViewA2, kli.a.k(context7, 16.0f));
            hx7.q.i(constraintSetL2, uIKitTextViewB2, iK2);
            constraintSetL2.applyTo(hostView4);
            lVar = gVar2;
        } else if (rVar instanceof q) {
            Intrinsics.checkNotNullParameter(this, "parent");
            ConstraintLayout hostView5 = getHostView();
            TagView tagViewL02 = l0();
            UIKitTextView uIKitTextViewB3 = ax0.m.b(this);
            UIKitTextView uIKitTextViewA3 = ax0.m.a(this);
            hostView5.addView(tagViewL02, new ConstraintLayout.LayoutParams(-2, -2));
            hostView5.addView(uIKitTextViewB3, new ConstraintLayout.LayoutParams(0, -2));
            hostView5.addView(uIKitTextViewA3, new ConstraintLayout.LayoutParams(0, -2));
            ax0.i iVar = new ax0.i(this, tagViewL02, uIKitTextViewB3, uIKitTextViewA3);
            q page3 = (q) rVar;
            Intrinsics.checkNotNullParameter(page3, "page");
            iVar.f10845h = page3;
            boolean z6 = page3.f317295b;
            e eVar2 = page3.f317292h;
            iVar.f10844g.setVisibility(z6 ? 0 : 8);
            tagViewL02.setVisibility(eVar2 != null ? 0 : 8);
            uIKitTextViewA3.setVisibility(page3.f317291g != null ? 0 : 8);
            ActionFooterView actionFooterView2 = iVar.f;
            actionFooterView2.setVisibility(0);
            m6 m6Var2 = n6.Companion;
            actionFooterView2.setModel(new aw0.h(false, m6.c(m6Var2, page3.i, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var2, page3.f317293j, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121));
            if (eVar2 != null) {
                Context context8 = getHostView().getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                tagViewL02.setContent(ax0.m.d(eVar2, context8));
            }
            Context context9 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            ty0.c.b(jh.d.f(context9).b0(), page3.f, uIKitTextViewB3, null, null, 12);
            Context context10 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
            ty0.c.b(jh.d.f(context10).b0(), page3.f317291g, uIKitTextViewA3, null, null, 12);
            Context context11 = getHostView().getContext();
            Intrinsics.h(context11);
            int iK3 = kli.a.k(context11, 16.0f);
            ConstraintLayout hostView6 = getHostView();
            ConstraintSet constraintSetL3 = v7.l(hostView6);
            hx7.q.l0(constraintSetL3, getProgressView(), getTopGuideline(), kli.a.k(context11, 25.0f));
            hx7.q.i(constraintSetL3, getProgressView(), iK3);
            hx7.q.f(constraintSetL3, actionFooterView2, getBottomGuideline(), 0);
            hx7.q.i(constraintSetL3, actionFooterView2, 0);
            hx7.q.f(constraintSetL3, uIKitTextViewA3, actionFooterView2, kli.a.k(context11, 16.0f));
            hx7.q.i(constraintSetL3, uIKitTextViewA3, iK3);
            hx7.q.f(constraintSetL3, uIKitTextViewB3, uIKitTextViewA3, kli.a.k(context11, 16.0f));
            hx7.q.i(constraintSetL3, uIKitTextViewB3, iK3);
            hx7.q.f(constraintSetL3, tagViewL02, uIKitTextViewB3, kli.a.k(context11, 20.0f));
            hx7.q.i(constraintSetL3, tagViewL02, iK3);
            constraintSetL3.applyTo(hostView6);
            lVar = iVar;
        } else if (rVar instanceof l) {
            Intrinsics.checkNotNullParameter(this, "parent");
            ConstraintLayout hostView7 = getHostView();
            UIKitTextView uIKitTextViewB4 = ax0.m.b(this);
            UIKitTextView uIKitTextViewA4 = ax0.m.a(this);
            hostView7.addView(uIKitTextViewB4, new ConstraintLayout.LayoutParams(0, -2));
            hostView7.addView(uIKitTextViewA4, new ConstraintLayout.LayoutParams(0, -2));
            ax0.c cVar2 = new ax0.c(this, uIKitTextViewB4, uIKitTextViewA4);
            l page4 = (l) rVar;
            Intrinsics.checkNotNullParameter(page4, "page");
            uIKitTextViewA4.setVisibility(page4.f317280g != null ? 0 : 8);
            cVar2.f.setVisibility(page4.f317295b ? 0 : 8);
            e eVar3 = page4.f317281h;
            Clause clauseC = eVar3 != null ? ax0.m.c(eVar3) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            BasicNavBar basicNavBar = cVar2.e;
            basicNavBar.setTitle(clauseC);
            Context context12 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
            ty0.c.b(jh.d.f(context12).b0(), page4.f, uIKitTextViewB4, null, null, 12);
            Context context13 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
            ty0.c.b(jh.d.f(context13).b0(), page4.f317280g, uIKitTextViewA4, null, null, 12);
            Context context14 = getHostView().getContext();
            Intrinsics.h(context14);
            int iK4 = kli.a.k(context14, 16.0f);
            ConstraintLayout hostView8 = getHostView();
            ConstraintSet constraintSetL4 = v7.l(hostView8);
            hx7.q.f(constraintSetL4, getProgressView(), getBottomGuideline(), kli.a.k(context14, 40.0f));
            hx7.q.i(constraintSetL4, getProgressView(), iK4);
            hx7.q.l0(constraintSetL4, uIKitTextViewB4, basicNavBar, kli.a.k(context14, 24.0f));
            hx7.q.i(constraintSetL4, uIKitTextViewB4, iK4);
            hx7.q.l0(constraintSetL4, uIKitTextViewA4, uIKitTextViewB4, kli.a.k(context14, 12.0f));
            hx7.q.i(constraintSetL4, uIKitTextViewA4, iK4);
            constraintSetL4.applyTo(hostView8);
            lVar = cVar2;
        } else if (rVar instanceof m) {
            Intrinsics.checkNotNullParameter(this, "parent");
            ConstraintLayout hostView9 = getHostView();
            UIKitTextView uIKitTextViewB5 = ax0.m.b(this);
            UIKitTextView uIKitTextViewA5 = ax0.m.a(this);
            hostView9.addView(uIKitTextViewB5, new ConstraintLayout.LayoutParams(0, -2));
            hostView9.addView(uIKitTextViewA5, new ConstraintLayout.LayoutParams(0, -2));
            ax0.b bVar = new ax0.b(this, uIKitTextViewB5, uIKitTextViewA5);
            m page5 = (m) rVar;
            Intrinsics.checkNotNullParameter(page5, "page");
            uIKitTextViewA5.setVisibility(page5.f317282g != null ? 0 : 8);
            ActionFooterView actionFooterView3 = bVar.f;
            actionFooterView3.setVisibility(0);
            m6 m6Var3 = n6.Companion;
            actionFooterView3.setModel(new aw0.h(false, m6.c(m6Var3, page5.f317283h, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var3, page5.i, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121));
            Context context15 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
            ty0.c.b(jh.d.f(context15).b0(), page5.f, uIKitTextViewB5, null, null, 12);
            Context context16 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
            ty0.c.b(jh.d.f(context16).b0(), page5.f317282g, uIKitTextViewA5, null, null, 12);
            Context context17 = getHostView().getContext();
            Intrinsics.h(context17);
            int iK5 = kli.a.k(context17, 16.0f);
            ConstraintLayout hostView10 = getHostView();
            ConstraintSet constraintSetL5 = v7.l(hostView10);
            hx7.q.f(constraintSetL5, getProgressView(), getBottomGuideline(), kli.a.k(context17, 40.0f));
            hx7.q.i(constraintSetL5, getProgressView(), iK5);
            hx7.q.l0(constraintSetL5, uIKitTextViewB5, bVar.e, kli.a.k(context17, 24.0f));
            hx7.q.i(constraintSetL5, uIKitTextViewB5, iK5);
            hx7.q.l0(constraintSetL5, uIKitTextViewA5, uIKitTextViewB5, kli.a.k(context17, 12.0f));
            hx7.q.i(constraintSetL5, uIKitTextViewA5, iK5);
            hx7.q.f(constraintSetL5, actionFooterView3, getBottomGuideline(), 0);
            hx7.q.i(constraintSetL5, actionFooterView3, 0);
            constraintSetL5.applyTo(hostView10);
            lVar = bVar;
        } else {
            if (!(rVar instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullParameter(this, "parent");
            ConstraintLayout hostView11 = getHostView();
            UIKitTextView uIKitTextViewB6 = ax0.m.b(this);
            UIKitTextView uIKitTextViewA6 = ax0.m.a(this);
            hostView11.addView(uIKitTextViewB6, new ConstraintLayout.LayoutParams(0, -2));
            hostView11.addView(uIKitTextViewA6, new ConstraintLayout.LayoutParams(0, -2));
            ax0.d dVar = new ax0.d(this, uIKitTextViewB6, uIKitTextViewA6);
            n page6 = (n) rVar;
            Intrinsics.checkNotNullParameter(page6, "page");
            uIKitTextViewA6.setVisibility(page6.f317284g != null ? 0 : 8);
            int i3 = page6.f317295b ? 0 : 8;
            ProgressPagingIndicatorView progressPagingIndicatorView2 = dVar.f;
            progressPagingIndicatorView2.setVisibility(i3);
            ActionFooterView actionFooterView4 = dVar.f10829g;
            actionFooterView4.setVisibility(0);
            actionFooterView4.setModel(new aw0.e(false, null, null, m6.c(n6.Companion, page6.i, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55));
            e eVar4 = page6.f317285h;
            Clause clauseC2 = eVar4 != null ? ax0.m.c(eVar4) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            BasicNavBar basicNavBar2 = dVar.e;
            basicNavBar2.setTitle(clauseC2);
            Context context18 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
            ty0.c.b(jh.d.f(context18).b0(), page6.f, uIKitTextViewB6, null, null, 12);
            Context context19 = getHostView().getContext();
            Intrinsics.checkNotNullExpressionValue(context19, "getContext(...)");
            ty0.c.b(jh.d.f(context19).b0(), page6.f317284g, uIKitTextViewA6, null, null, 12);
            Context context20 = getHostView().getContext();
            Intrinsics.h(context20);
            int iK6 = kli.a.k(context20, 16.0f);
            ConstraintLayout hostView12 = getHostView();
            ConstraintSet constraintSetL6 = v7.l(hostView12);
            hx7.q.l0(constraintSetL6, uIKitTextViewB6, basicNavBar2, kli.a.k(context20, 24.0f));
            hx7.q.i(constraintSetL6, uIKitTextViewB6, iK6);
            hx7.q.l0(constraintSetL6, uIKitTextViewA6, uIKitTextViewB6, kli.a.k(context20, 12.0f));
            hx7.q.i(constraintSetL6, uIKitTextViewA6, iK6);
            hx7.q.f(constraintSetL6, actionFooterView4, getBottomGuideline(), 0);
            hx7.q.i(constraintSetL6, actionFooterView4, 0);
            hx7.q.f(constraintSetL6, progressPagingIndicatorView2, actionFooterView4, kli.a.k(context20, 16.0f));
            hx7.q.i(constraintSetL6, progressPagingIndicatorView2, iK6);
            constraintSetL6.applyTo(hostView12);
            lVar = dVar;
        }
        Integer num2 = this.f317267r;
        if (num2 != null) {
            lVar.a(Integer.valueOf(num2.intValue()));
        }
        x8 x8Var = this.f317266q;
        if (x8Var != null && x8Var.f10609a != null) {
            lVar.d((Context) this.u.f);
        }
        x8 x8Var2 = this.f317266q;
        if (x8Var2 != null && (v1Var = x8Var2.f10609a) != null && (num = this.f317267r) != null) {
            int iIntValue = num.intValue();
            Integer num3 = this.f317268s;
            if (num3 != null) {
                int iIntValue2 = num3.intValue();
                foh.i.e(getActionFooterView(), v1Var, iIntValue, iIntValue2, iIntValue2);
            }
        }
        q0(rVar.f317296c);
        t0(rVar.b());
        this.i.onNext(Integer.valueOf(i));
        if (z3) {
            p0(lVar, z);
            return;
        }
        this.f317263m = lVar;
        if (lVar3 != null) {
            lVar3.recycle();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(getRootWindowInsets());
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        Guideline guideline = getTopGuideline();
        int i = insets2.top;
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(guideline, "guideline");
        constraintSet.setGuidelineBegin(guideline.getId(), i);
        Guideline guideline2 = getBottomGuideline();
        int i2 = insets2.bottom;
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(guideline2, "guideline");
        constraintSet.setGuidelineEnd(guideline2.getId(), i2);
        constraintSet.applyTo(this);
        return x0.a(insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ifm.b bVar = this.f317258b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f317258b = null;
        ifm.c cVar = this.f317265p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f317265p = null;
        this.f317266q = null;
        this.f317269t = false;
        getNavigationBar().q();
        this.f317267r = null;
        this.f317268s = null;
        t1 t1Var = v1.Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t1Var.getClass();
        this.u.b(t1.a(context));
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        r currentPage = getCurrentPage();
        if (currentPage == null || !currentPage.f317294a) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                return super.onTouchEvent(event);
            }
            if (event.getX() < getWidth() / 2) {
                if (getLayoutDirection() == 1) {
                    g0();
                } else {
                    h0();
                }
            } else if (getLayoutDirection() == 1) {
                h0();
            } else {
                g0();
            }
        }
        return true;
    }

    public final void p0(ax0.l lVar, boolean z) {
        Pair pair;
        Pair pair2;
        boolean z3;
        ax0.l lVar2 = this.f317263m;
        this.f317263m = lVar;
        boolean z4 = lVar2 instanceof ax0.j;
        if (z4 && (lVar instanceof ax0.j)) {
            pair = new Pair(300L, mif.a.v((ax0.j) lVar));
        } else if (z4) {
            ax0.j outOverlay = (ax0.j) lVar2;
            Intrinsics.checkNotNullParameter(outOverlay, "outOverlay");
            ConstraintLayout hostView = outOverlay.getHostView();
            List listE = outOverlay.e();
            outOverlay.c();
            lq0.f fVar = new lq0.f();
            List list = listE;
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                fVar.a((View) it8.next());
            }
            lq0.p.Companion.getClass();
            lq0.p pVarA = lq0.o.a(hostView, fVar);
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                ((View) it9.next()).setVisibility(8);
            }
            pair = new Pair(300L, pVarA);
        } else if (lVar instanceof ax0.j) {
            pair = new Pair(300L, mif.a.v((ax0.j) lVar));
        } else {
            boolean z6 = lVar2 instanceof ax0.h;
            if (z6 && (lVar instanceof ax0.h)) {
                ax0.h out = (ax0.h) lVar2;
                ax0.h into = (ax0.h) lVar;
                Intrinsics.checkNotNullParameter(out, "out");
                Intrinsics.checkNotNullParameter(into, "into");
                f fVar2 = into.f10837a;
                TagView tagView = into.f10838b;
                ConstraintLayout hostView2 = fVar2.getHostView();
                lq0.i iVar = z != (hostView2.getLayoutDirection() == 1) ? lq0.i.RIGHT_TO_LEFT : lq0.i.LEFT_TO_RIGHT;
                o oVar = out.f10840g;
                TagView tagView2 = out.f10838b;
                e eVar = oVar != null ? oVar.f317287h : null;
                o oVar2 = into.f10840g;
                boolean zF = Intrinsics.f(eVar, oVar2 != null ? oVar2.f317287h : null);
                aim.e eVarB = zhm.u.b();
                e0.d(eVarB, out.f10839c);
                e0.d(eVarB, out.d);
                if (!zF) {
                    e0.d(eVarB, tagView2);
                }
                aim.e eVarA = zhm.u.a(eVarB);
                aim.e eVarB2 = zhm.u.b();
                e0.d(eVarB2, into.f10839c);
                e0.d(eVarB2, into.d);
                if (!zF) {
                    e0.d(eVarB2, tagView);
                }
                aim.e eVarA2 = zhm.u.a(eVarB2);
                z3 = zF && tagView2.getVisibility() == 0 && tagView.getVisibility() == 0;
                lq0.q qVar = new lq0.q();
                lq0.j jVar = new lq0.j(hostView2, iVar);
                ListIterator listIterator = eVarA.listIterator(0);
                while (true) {
                    aim.b bVar = (aim.b) listIterator;
                    if (!bVar.hasNext()) {
                        break;
                    } else {
                        jVar.a((View) bVar.next());
                    }
                }
                ListIterator listIterator2 = eVarA2.listIterator(0);
                while (true) {
                    aim.b bVar2 = (aim.b) listIterator2;
                    if (!bVar2.hasNext()) {
                        break;
                    } else {
                        jVar.a((View) bVar2.next());
                    }
                }
                qVar.m(jVar);
                lq0.f fVar3 = new lq0.f();
                ListIterator listIterator3 = eVarA.listIterator(0);
                while (true) {
                    aim.b bVar3 = (aim.b) listIterator3;
                    if (!bVar3.hasNext()) {
                        break;
                    } else {
                        fVar3.a((View) bVar3.next());
                    }
                }
                ListIterator listIterator4 = eVarA2.listIterator(0);
                while (true) {
                    aim.b bVar4 = (aim.b) listIterator4;
                    if (!bVar4.hasNext()) {
                        break;
                    } else {
                        fVar3.a((View) bVar4.next());
                    }
                }
                qVar.m(fVar3);
                if (z3) {
                    tagView2.setVisibility(4);
                    tagView.setVisibility(4);
                    lq0.t tVar = new lq0.t(tagView2, tagView);
                    tVar.a(tagView);
                    qVar.m(tVar);
                }
                ListIterator listIterator5 = eVarA2.listIterator(0);
                while (true) {
                    aim.b bVar5 = (aim.b) listIterator5;
                    if (!bVar5.hasNext()) {
                        break;
                    } else {
                        ((View) bVar5.next()).setVisibility(8);
                    }
                }
                lq0.p.Companion.getClass();
                lq0.p pVarA2 = lq0.o.a(hostView2, qVar);
                ListIterator listIterator6 = eVarA2.listIterator(0);
                while (true) {
                    aim.b bVar6 = (aim.b) listIterator6;
                    if (!bVar6.hasNext()) {
                        break;
                    } else {
                        ((View) bVar6.next()).setVisibility(0);
                    }
                }
                ListIterator listIterator7 = eVarA.listIterator(0);
                while (true) {
                    aim.b bVar7 = (aim.b) listIterator7;
                    if (!bVar7.hasNext()) {
                        break;
                    } else {
                        ((View) bVar7.next()).setVisibility(8);
                    }
                }
                if (z3) {
                    tagView.setVisibility(0);
                }
                pair2 = new Pair(300L, pVarA2);
            } else if (z && z6 && (lVar instanceof ax0.g)) {
                pair = new Pair(400L, md6.s.k((ax0.h) lVar2, (ax0.g) lVar, true));
            } else if (!z && (lVar2 instanceof ax0.g) && (lVar instanceof ax0.h)) {
                pair = new Pair(400L, md6.s.k((ax0.h) lVar, (ax0.g) lVar2, false));
            } else if ((lVar2 instanceof ax0.i) && (lVar instanceof ax0.i)) {
                ax0.i out2 = (ax0.i) lVar2;
                ax0.i into2 = (ax0.i) lVar;
                Intrinsics.checkNotNullParameter(out2, "out");
                Intrinsics.checkNotNullParameter(into2, "into");
                f fVar4 = into2.f10841a;
                TagView tagView3 = into2.f10842b;
                ConstraintLayout hostView3 = fVar4.getHostView();
                lq0.i iVar2 = z != (hostView3.getLayoutDirection() == 1) ? lq0.i.RIGHT_TO_LEFT : lq0.i.LEFT_TO_RIGHT;
                q qVar2 = out2.f10845h;
                TagView tagView4 = out2.f10842b;
                e eVar2 = qVar2 != null ? qVar2.f317292h : null;
                q qVar3 = into2.f10845h;
                boolean zF2 = Intrinsics.f(eVar2, qVar3 != null ? qVar3.f317292h : null);
                aim.e eVarB3 = zhm.u.b();
                e0.d(eVarB3, out2.f10843c);
                e0.d(eVarB3, out2.d);
                if (!zF2) {
                    e0.d(eVarB3, tagView4);
                }
                aim.e eVarA3 = zhm.u.a(eVarB3);
                aim.e eVarB4 = zhm.u.b();
                e0.d(eVarB4, into2.f10843c);
                e0.d(eVarB4, into2.d);
                if (!zF2) {
                    e0.d(eVarB4, tagView3);
                }
                aim.e eVarA4 = zhm.u.a(eVarB4);
                z3 = zF2 && tagView4.getVisibility() == 0 && tagView3.getVisibility() == 0;
                lq0.q qVar4 = new lq0.q();
                lq0.j jVar2 = new lq0.j(hostView3, iVar2);
                ListIterator listIterator8 = eVarA3.listIterator(0);
                while (true) {
                    aim.b bVar8 = (aim.b) listIterator8;
                    if (!bVar8.hasNext()) {
                        break;
                    } else {
                        jVar2.a((View) bVar8.next());
                    }
                }
                ListIterator listIterator9 = eVarA4.listIterator(0);
                while (true) {
                    aim.b bVar9 = (aim.b) listIterator9;
                    if (!bVar9.hasNext()) {
                        break;
                    } else {
                        jVar2.a((View) bVar9.next());
                    }
                }
                qVar4.m(jVar2);
                lq0.f fVar5 = new lq0.f();
                ListIterator listIterator10 = eVarA3.listIterator(0);
                while (true) {
                    aim.b bVar10 = (aim.b) listIterator10;
                    if (!bVar10.hasNext()) {
                        break;
                    } else {
                        fVar5.a((View) bVar10.next());
                    }
                }
                ListIterator listIterator11 = eVarA4.listIterator(0);
                while (true) {
                    aim.b bVar11 = (aim.b) listIterator11;
                    if (!bVar11.hasNext()) {
                        break;
                    } else {
                        fVar5.a((View) bVar11.next());
                    }
                }
                qVar4.m(fVar5);
                if (z3) {
                    tagView4.setVisibility(4);
                    tagView3.setVisibility(4);
                    lq0.t tVar2 = new lq0.t(tagView4, tagView3);
                    tVar2.a(tagView3);
                    qVar4.m(tVar2);
                }
                ListIterator listIterator12 = eVarA4.listIterator(0);
                while (true) {
                    aim.b bVar12 = (aim.b) listIterator12;
                    if (!bVar12.hasNext()) {
                        break;
                    } else {
                        ((View) bVar12.next()).setVisibility(8);
                    }
                }
                lq0.p.Companion.getClass();
                lq0.p pVarA3 = lq0.o.a(hostView3, qVar4);
                ListIterator listIterator13 = eVarA4.listIterator(0);
                while (true) {
                    aim.b bVar13 = (aim.b) listIterator13;
                    if (!bVar13.hasNext()) {
                        break;
                    } else {
                        ((View) bVar13.next()).setVisibility(0);
                    }
                }
                ListIterator listIterator14 = eVarA3.listIterator(0);
                while (true) {
                    aim.b bVar14 = (aim.b) listIterator14;
                    if (!bVar14.hasNext()) {
                        break;
                    } else {
                        ((View) bVar14.next()).setVisibility(8);
                    }
                }
                if (z3) {
                    tagView3.setVisibility(0);
                }
                pair2 = new Pair(300L, pVarA3);
            } else {
                boolean z11 = lVar2 instanceof ax0.c;
                if (z11 && (lVar instanceof ax0.c)) {
                    ax0.c out3 = (ax0.c) lVar2;
                    ax0.c into3 = (ax0.c) lVar;
                    Intrinsics.checkNotNullParameter(out3, "out");
                    Intrinsics.checkNotNullParameter(into3, "into");
                    ConstraintLayout hostView4 = into3.f10823a.getHostView();
                    lq0.i iVar3 = z != (hostView4.getLayoutDirection() == 1) ? lq0.i.RIGHT_TO_LEFT : lq0.i.LEFT_TO_RIGHT;
                    aim.e eVarB5 = zhm.u.b();
                    e0.d(eVarB5, out3.f10824b);
                    e0.d(eVarB5, out3.f10825c);
                    aim.e eVarA5 = zhm.u.a(eVarB5);
                    aim.e eVarB6 = zhm.u.b();
                    e0.d(eVarB6, into3.f10824b);
                    e0.d(eVarB6, into3.f10825c);
                    aim.e eVarA6 = zhm.u.a(eVarB6);
                    lq0.q qVar5 = new lq0.q();
                    lq0.j jVar3 = new lq0.j(hostView4, iVar3);
                    ListIterator listIterator15 = eVarA5.listIterator(0);
                    while (true) {
                        aim.b bVar15 = (aim.b) listIterator15;
                        if (!bVar15.hasNext()) {
                            break;
                        } else {
                            jVar3.a((View) bVar15.next());
                        }
                    }
                    ListIterator listIterator16 = eVarA6.listIterator(0);
                    while (true) {
                        aim.b bVar16 = (aim.b) listIterator16;
                        if (!bVar16.hasNext()) {
                            break;
                        } else {
                            jVar3.a((View) bVar16.next());
                        }
                    }
                    qVar5.m(jVar3);
                    lq0.f fVar6 = new lq0.f();
                    ListIterator listIterator17 = eVarA5.listIterator(0);
                    while (true) {
                        aim.b bVar17 = (aim.b) listIterator17;
                        if (!bVar17.hasNext()) {
                            break;
                        } else {
                            fVar6.a((View) bVar17.next());
                        }
                    }
                    ListIterator listIterator18 = eVarA6.listIterator(0);
                    while (true) {
                        aim.b bVar18 = (aim.b) listIterator18;
                        if (!bVar18.hasNext()) {
                            break;
                        } else {
                            fVar6.a((View) bVar18.next());
                        }
                    }
                    qVar5.m(fVar6);
                    ListIterator listIterator19 = eVarA6.listIterator(0);
                    while (true) {
                        aim.b bVar19 = (aim.b) listIterator19;
                        if (!bVar19.hasNext()) {
                            break;
                        } else {
                            ((View) bVar19.next()).setVisibility(8);
                        }
                    }
                    lq0.p.Companion.getClass();
                    lq0.p pVarA4 = lq0.o.a(hostView4, qVar5);
                    ListIterator listIterator20 = eVarA6.listIterator(0);
                    while (true) {
                        aim.b bVar20 = (aim.b) listIterator20;
                        if (!bVar20.hasNext()) {
                            break;
                        } else {
                            ((View) bVar20.next()).setVisibility(0);
                        }
                    }
                    ListIterator listIterator21 = eVarA5.listIterator(0);
                    while (true) {
                        aim.b bVar21 = (aim.b) listIterator21;
                        if (!bVar21.hasNext()) {
                            break;
                        } else {
                            ((View) bVar21.next()).setVisibility(8);
                        }
                    }
                    pair2 = new Pair(300L, pVarA4);
                } else if (z && z11 && (lVar instanceof ax0.b)) {
                    pair = new Pair(400L, ngm.n.m((ax0.c) lVar2, (ax0.b) lVar, true));
                } else if (!z && (lVar2 instanceof ax0.b) && (lVar instanceof ax0.c)) {
                    pair = new Pair(400L, ngm.n.m((ax0.c) lVar, (ax0.b) lVar2, false));
                } else if ((lVar2 instanceof ax0.d) && (lVar instanceof ax0.d)) {
                    ax0.d out4 = (ax0.d) lVar2;
                    ax0.d into4 = (ax0.d) lVar;
                    Intrinsics.checkNotNullParameter(out4, "out");
                    Intrinsics.checkNotNullParameter(into4, "into");
                    ConstraintLayout hostView5 = into4.f10826a.getHostView();
                    lq0.i iVar4 = z != (hostView5.getLayoutDirection() == 1) ? lq0.i.RIGHT_TO_LEFT : lq0.i.LEFT_TO_RIGHT;
                    aim.e eVarB7 = zhm.u.b();
                    e0.d(eVarB7, out4.f10827b);
                    e0.d(eVarB7, out4.f10828c);
                    aim.e eVarA7 = zhm.u.a(eVarB7);
                    aim.e eVarB8 = zhm.u.b();
                    e0.d(eVarB8, into4.f10827b);
                    e0.d(eVarB8, into4.f10828c);
                    aim.e eVarA8 = zhm.u.a(eVarB8);
                    lq0.q qVar6 = new lq0.q();
                    lq0.j jVar4 = new lq0.j(hostView5, iVar4);
                    ListIterator listIterator22 = eVarA7.listIterator(0);
                    while (true) {
                        aim.b bVar22 = (aim.b) listIterator22;
                        if (!bVar22.hasNext()) {
                            break;
                        } else {
                            jVar4.a((View) bVar22.next());
                        }
                    }
                    ListIterator listIterator23 = eVarA8.listIterator(0);
                    while (true) {
                        aim.b bVar23 = (aim.b) listIterator23;
                        if (!bVar23.hasNext()) {
                            break;
                        } else {
                            jVar4.a((View) bVar23.next());
                        }
                    }
                    qVar6.m(jVar4);
                    lq0.f fVar7 = new lq0.f();
                    ListIterator listIterator24 = eVarA7.listIterator(0);
                    while (true) {
                        aim.b bVar24 = (aim.b) listIterator24;
                        if (!bVar24.hasNext()) {
                            break;
                        } else {
                            fVar7.a((View) bVar24.next());
                        }
                    }
                    ListIterator listIterator25 = eVarA8.listIterator(0);
                    while (true) {
                        aim.b bVar25 = (aim.b) listIterator25;
                        if (!bVar25.hasNext()) {
                            break;
                        } else {
                            fVar7.a((View) bVar25.next());
                        }
                    }
                    qVar6.m(fVar7);
                    ListIterator listIterator26 = eVarA8.listIterator(0);
                    while (true) {
                        aim.b bVar26 = (aim.b) listIterator26;
                        if (!bVar26.hasNext()) {
                            break;
                        } else {
                            ((View) bVar26.next()).setVisibility(8);
                        }
                    }
                    lq0.p.Companion.getClass();
                    lq0.p pVarA5 = lq0.o.a(hostView5, qVar6);
                    ListIterator listIterator27 = eVarA8.listIterator(0);
                    while (true) {
                        aim.b bVar27 = (aim.b) listIterator27;
                        if (!bVar27.hasNext()) {
                            break;
                        } else {
                            ((View) bVar27.next()).setVisibility(0);
                        }
                    }
                    ListIterator listIterator28 = eVarA7.listIterator(0);
                    while (true) {
                        aim.b bVar28 = (aim.b) listIterator28;
                        if (!bVar28.hasNext()) {
                            break;
                        } else {
                            ((View) bVar28.next()).setVisibility(8);
                        }
                    }
                    pair2 = new Pair(300L, pVarA5);
                } else {
                    pair = null;
                }
            }
            pair = pair2;
        }
        if (pair == null) {
            ax0.l lVar3 = this.f317264n;
            if (lVar3 != null) {
                lVar3.recycle();
            }
            this.f317264n = null;
            if (lVar2 != null) {
                lVar2.recycle();
                return;
            }
            return;
        }
        this.f317264n = lVar2;
        long jLongValue = ((Number) pair.f186385a).longValue();
        lq0.p pVar = (lq0.p) pair.f186386b;
        yq0.e eVar3 = new yq0.e(this, 14);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(jLongValue);
        valueAnimatorOfFloat.setInterpolator(jq0.r.f177394c);
        valueAnimatorOfFloat.addUpdateListener(new w5(pVar, 21));
        valueAnimatorOfFloat.addListener(new byl.i(pVar, 10, this, eVar3));
        valueAnimatorOfFloat.start();
        this.o = valueAnimatorOfFloat;
    }

    public final void q0(boolean z) {
        Integer numValueOf = null;
        if (z) {
            a0 a0Var = this.f317261j;
            if (a0Var instanceof z) {
                numValueOf = Integer.valueOf(((z) a0Var).f317311a.e);
            } else if (a0Var instanceof v) {
                numValueOf = Integer.valueOf(((v) a0Var).f317304a);
            } else if (a0Var instanceof w) {
                numValueOf = Integer.valueOf(((w) a0Var).f317305a);
            } else if (a0Var instanceof y) {
                numValueOf = Integer.valueOf(((y) a0Var).f317309a);
            } else if (!Intrinsics.f(a0Var, x.f317308a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        getNavigationBar().setNavigationButtonIcon(numValueOf);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r0() {
        a0 a0Var = this.f317261j;
        Drawable drawableF0 = null;
        z zVar = a0Var instanceof z ? (z) a0Var : null;
        if (zVar == null) {
            return;
        }
        int i = t.f317300a[zVar.f317311a.f317298b.ordinal()];
        if (i != 1) {
            int iS = this.B;
            a5h.g gVar = this.u;
            if (i == 2) {
                if (this.f317266q != null) {
                    iS = kli.a.s(R$attr.uikit_colorGroupedBackground, (Context) gVar.f);
                }
                int iD = io0.a.d(BitmapDescriptorFactory.HUE_RED, iS);
                drawableF0 = f0(false, new float[]{BitmapDescriptorFactory.HUE_RED, 0.6502f, 0.9624f}, new int[]{iD, iD, iS});
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f317266q != null) {
                    iS = kli.a.s(R$attr.uikit_colorGroupedBackground, (Context) gVar.f);
                }
                int iD2 = io0.a.d(BitmapDescriptorFactory.HUE_RED, iS);
                LayerDrawable layerDrawable = new LayerDrawable(new ShapeDrawable[]{f0(true, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 0.7229f, 1.0f}, new int[]{iD2, iD2, iS, iS}), f0(true, new float[]{BitmapDescriptorFactory.HUE_RED, 0.7623f, 0.893f, 1.0f}, new int[]{iD2, iD2, io0.a.d(0.2f, iS), io0.a.d(0.4f, iS)})});
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iK = kli.a.k(context, 80.0f);
                layerDrawable.setLayerInset(1, 0, iK, 0, iK);
                drawableF0 = layerDrawable;
            }
        }
        this.v.setForeground(drawableF0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r13 != (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        r1 = getProgressView();
        r2 = r2.f317297a;
        r3 = new java.util.ArrayList();
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r2.hasNext() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        r4 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (((yw0.r) r4).f317295b == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        r3.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        r1.setModel(new ms0.l3(r19, r13, r3.size(), r21, r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(long r19, long r21, boolean r23) {
        /*
            r18 = this;
            r0 = r18
            yw0.a0 r1 = r0.f317261j
            boolean r2 = r1 instanceof yw0.z
            r3 = 0
            if (r2 == 0) goto Lc
            yw0.z r1 = (yw0.z) r1
            goto Ld
        Lc:
            r1 = r3
        Ld:
            if (r1 != 0) goto L10
            goto L40
        L10:
            yw0.s r2 = r1.f317311a
            java.util.ArrayList r4 = r2.f317297a
            java.util.Iterator r4 = r4.iterator()
            r5 = -1
            r6 = 0
            r7 = r5
        L1b:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L3d
            java.lang.Object r8 = r4.next()
            int r9 = r6 + 1
            if (r6 < 0) goto L39
            yw0.r r8 = (yw0.r) r8
            boolean r8 = r8.f317295b
            if (r8 == 0) goto L37
            int r7 = r7 + 1
            int r8 = r1.f317312b
            if (r6 != r8) goto L37
            r13 = r7
            goto L3e
        L37:
            r6 = r9
            goto L1b
        L39:
            zhm.v.s()
            throw r3
        L3d:
            r13 = r5
        L3e:
            if (r13 != r5) goto L41
        L40:
            return
        L41:
            com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView r1 = r0.getProgressView()
            ms0.l3 r10 = new ms0.l3
            java.util.ArrayList r2 = r2.f317297a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L52:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r2.next()
            r5 = r4
            yw0.r r5 = (yw0.r) r5
            boolean r5 = r5.f317295b
            if (r5 == 0) goto L52
            r3.add(r4)
            goto L52
        L67:
            int r14 = r3.size()
            r11 = r19
            r15 = r21
            r17 = r23
            r10.<init>(r11, r13, r14, r15, r17)
            r1.setModel(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yw0.f.s0(long, long, boolean):void");
    }

    public final void setCurrentPageIndex(int i) {
        a0 a0Var = this.f317261j;
        z zVar = a0Var instanceof z ? (z) a0Var : null;
        if (zVar == null) {
            return;
        }
        int i2 = zVar.f317312b;
        z zVarD = zVar.d(i);
        this.f317261j = zVarD;
        int i3 = zVarD.f317312b;
        if (i3 != i2) {
            o0(i3, i3 > i2, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewGroup, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, ax0.k, java.lang.Object, yw0.f] */
    /* JADX WARN: Type inference failed for: r2v33, types: [android.view.ViewGroup, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View] */
    public final void setModel(@NotNull k model) {
        ihm.f fVar;
        ifm.c cVarSubscribe;
        Intrinsics.checkNotNullParameter(model, "model");
        boolean zA = model.a();
        boolean z = this.f317269t;
        int i = this.B;
        int i2 = 0;
        if (zA != z) {
            boolean zA2 = model.a();
            boolean z3 = this.f317269t;
            ifm.c cVar = this.f317265p;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f317265p = null;
            this.f317266q = null;
            this.f317267r = null;
            this.f317268s = null;
            this.f317269t = zA2;
            if (zA2) {
                BasicNavBar navigationBar = getNavigationBar();
                t1 t1Var = v1.Companion;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                t1Var.getClass();
                foh.i.e(navigationBar, t1.a(context), 0, i, i);
                this.f317265p = i0().subscribe(new yua.h(new yw0.a(this, 1), 7), new yua.h(new yw0.a(this, 2), 8));
            } else if (z3) {
                getNavigationBar().q();
                ProgressPagingIndicatorView progressView = getProgressView();
                progressView.setTintColorInt(progressView.f56323m);
                ax0.l lVar = this.f317263m;
                if (lVar != null) {
                    lVar.a(null);
                }
                ax0.l lVar2 = this.f317263m;
                if (lVar2 != null) {
                    lVar2.d(null);
                }
                ActionFooterView actionFooterView = getActionFooterView();
                t1 t1Var2 = v1.Companion;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                t1Var2.getClass();
                v1 v1VarA = t1.a(context2);
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                foh.i.e(actionFooterView, v1VarA, kli.a.s(R$attr.uikit_colorForeground, context3), i, i);
                r0();
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                this.u.b(t1.a(context4));
            }
        }
        ifm.b bVar = this.f317258b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f317258b = null;
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.o = null;
        ax0.l lVar3 = this.f317264n;
        if (lVar3 != null) {
            lVar3.recycle();
        }
        this.f317264n = null;
        q0(false);
        t0(false);
        getProgressView().setVisibility(8);
        getActionFooterView().setVisibility(8);
        a0 a0VarB = this.f317261j.b(model);
        this.f317261j = a0VarB;
        boolean z4 = a0VarB instanceof z;
        ju0.j jVar = this.v;
        if (z4) {
            z zVar = (z) a0VarB;
            ifm.b bVar2 = this.f317258b;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            this.f317258b = null;
            ifm.b bVar3 = new ifm.b();
            this.f317258b = bVar3;
            ihm.f fVar2 = jVar.e;
            ihm.f fVar3 = jVar.e;
            efm.r rVarHide = fVar2.hide();
            Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
            bVar3.a(rVarHide.ofType(ju0.c.class).subscribe(new yua.h(new yw0.a(this, 4), 14)));
            efm.r rVarHide2 = fVar3.hide();
            Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
            bVar3.a(rVarHide2.ofType(ju0.b.class).subscribe(new yua.h(new yw0.a(this, 5), 15)));
            efm.r rVarHide3 = fVar3.hide();
            Intrinsics.checkNotNullExpressionValue(rVarHide3, "hide(...)");
            bVar3.a(rVarHide3.ofType(a.b.class).subscribe(new yua.h(new yw0.a(this, 6), 16)));
            bVar3.a(getNavigationBar().f59210a.f57403b.subscribe(new yua.h(new yw0.a(this, 7), 17)));
            o0(zVar.f317312b, true, this.f317263m instanceof ax0.j);
            r0();
            return;
        }
        boolean z6 = a0VarB instanceof v;
        ColorDrawable colorDrawable = this.C;
        if (z6) {
            jVar.setForeground(colorDrawable);
            p0(null, false);
            q0(true);
            return;
        }
        boolean z11 = a0VarB instanceof w;
        LinkedHashMap linkedHashMap = this.D;
        if (z11) {
            jVar.setForeground(colorDrawable);
            a0 a0Var = this.f317261j;
            w wVar = a0Var instanceof w ? (w) a0Var : null;
            if (wVar == null) {
                return;
            }
            Intrinsics.checkNotNullParameter(this, "parent");
            ?? hostView = getHostView();
            List list = (List) linkedHashMap.get(FullScreenStateView.class);
            View view = list != null ? (View) zhm.a0.G(list) : null;
            if (!(view instanceof FullScreenStateView)) {
                view = null;
            }
            FullScreenStateView fullScreenStateView = (FullScreenStateView) view;
            int i3 = 6;
            if (fullScreenStateView == null) {
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                fullScreenStateView = new FullScreenStateView(context5, view, i3, i2);
                fullScreenStateView.setBackgroundColor(i);
                fullScreenStateView.setId(View.generateViewId());
            }
            Context context6 = fullScreenStateView.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            fullScreenStateView.setBackgroundColor(kli.a.s(R$attr.uikit_colorBackground, context6));
            hostView.addView(fullScreenStateView, new ConstraintLayout.LayoutParams(0, 0));
            ax0.a aVar = new ax0.a(this, fullScreenStateView);
            TextLocalisedClause title = wVar.f317306b;
            TextLocalisedClause actionText = wVar.f317307c;
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            fullScreenStateView.setTitleText(title);
            fullScreenStateView.setMainAction(new l6(12, actionText, null, h4.FLAT));
            FullScreenStateView.setImage$default(fullScreenStateView, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), null, 2, null);
            ConstraintLayout hostView2 = getHostView();
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(hostView2);
            hx7.q.h(constraintSet, fullScreenStateView);
            constraintSet.applyTo(hostView2);
            p0(aVar, true);
            q0(true);
            ifm.b bVar4 = this.f317258b;
            if (bVar4 != null) {
                bVar4.dispose();
            }
            this.f317258b = null;
            ax0.l lVar4 = this.f317263m;
            ax0.a aVar2 = lVar4 instanceof ax0.a ? (ax0.a) lVar4 : null;
            if (aVar2 == null || (fVar = aVar2.f10818b.getSmallActionButton().f56386h) == null || (cVarSubscribe = fVar.subscribe(new yua.h(new yw0.a(this, 0), 10))) == null) {
                return;
            }
            ifm.b bVar5 = this.f317258b;
            if (bVar5 == null) {
                bVar5 = new ifm.b();
                this.f317258b = bVar5;
            }
            bVar5.a(cVarSubscribe);
            return;
        }
        if (!(a0VarB instanceof y)) {
            if (!a0VarB.equals(x.f317308a)) {
                throw new NoWhenBranchMatchedException();
            }
            ax0.l lVar5 = this.f317263m;
            if (lVar5 != null) {
                lVar5.recycle();
            }
            this.f317263m = null;
            return;
        }
        jVar.setForeground(colorDrawable);
        a0 a0Var2 = this.f317261j;
        y yVar = a0Var2 instanceof y ? (y) a0Var2 : null;
        if (yVar == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(this, "parent");
        ?? hostView3 = getHostView();
        Context context7 = getHostView().getContext();
        List list2 = (List) linkedHashMap.get(View.class);
        View view2 = list2 != null ? (View) zhm.a0.G(list2) : null;
        view = view2 != null ? view2 : 0;
        if (view == 0) {
            view = new View(getContext());
            view.setId(View.generateViewId());
        }
        Intrinsics.h(context7);
        view.setBackgroundColor(kli.a.s(R$attr.uikit_colorBackground, context7));
        hostView3.addView(view, new ConstraintLayout.LayoutParams(0, 0));
        ShimmerFrameLayout shimmerFrameLayoutJ0 = j0();
        hostView3.addView(shimmerFrameLayoutJ0, new ConstraintLayout.LayoutParams(kli.a.k(context7, 216.0f), kli.a.k(context7, 32.0f)));
        ShimmerFrameLayout shimmerFrameLayoutJ02 = j0();
        hostView3.addView(shimmerFrameLayoutJ02, new ConstraintLayout.LayoutParams(kli.a.k(context7, 120.0f), kli.a.k(context7, 16.0f)));
        ShimmerFrameLayout shimmerFrameLayoutJ03 = j0();
        hostView3.addView(shimmerFrameLayoutJ03, new ConstraintLayout.LayoutParams(kli.a.k(context7, 120.0f), kli.a.k(context7, 16.0f)));
        ?? r72 = view;
        ShimmerFrameLayout shimmerFrameLayoutJ04 = j0();
        hostView3.addView(shimmerFrameLayoutJ04, new ConstraintLayout.LayoutParams(0, kli.a.k(context7, 52.0f)));
        ShimmerFrameLayout shimmerFrameLayoutJ05 = j0();
        hostView3.addView(shimmerFrameLayoutJ05, new ConstraintLayout.LayoutParams(0, kli.a.k(context7, 52.0f)));
        ax0.f fVar4 = new ax0.f(this, r72, shimmerFrameLayoutJ0, shimmerFrameLayoutJ02, shimmerFrameLayoutJ03, shimmerFrameLayoutJ04, shimmerFrameLayoutJ05);
        i style = yVar.f317310b;
        Intrinsics.checkNotNullParameter(style, "style");
        shimmerFrameLayoutJ0.e();
        shimmerFrameLayoutJ02.e();
        int[] iArr = ax0.e.f10830a;
        int i5 = iArr[style.ordinal()];
        if (i5 == 1) {
            shimmerFrameLayoutJ03.setVisibility(8);
            shimmerFrameLayoutJ04.setVisibility(8);
            shimmerFrameLayoutJ05.setVisibility(8);
        } else if (i5 == 2) {
            shimmerFrameLayoutJ03.setVisibility(8);
            shimmerFrameLayoutJ04.e();
            shimmerFrameLayoutJ05.e();
        } else if (i5 == 3) {
            shimmerFrameLayoutJ03.e();
            shimmerFrameLayoutJ04.setVisibility(8);
            shimmerFrameLayoutJ05.setVisibility(8);
        } else {
            if (i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            shimmerFrameLayoutJ03.e();
            shimmerFrameLayoutJ04.setVisibility(8);
            shimmerFrameLayoutJ05.e();
        }
        Context context8 = getHostView().getContext();
        Intrinsics.h(context8);
        int iK = kli.a.k(context8, 16.0f);
        ConstraintLayout hostView4 = getHostView();
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(hostView4);
        hx7.q.h(constraintSet2, r72);
        int i6 = iArr[style.ordinal()];
        View view3 = fVar4.f10833c;
        if (i6 == 1) {
            hx7.q.f(constraintSet2, shimmerFrameLayoutJ02, view3, kli.a.k(context8, 124.0f));
            hx7.q.i(constraintSet2, shimmerFrameLayoutJ02, 0);
            hx7.q.f(constraintSet2, shimmerFrameLayoutJ0, shimmerFrameLayoutJ02, kli.a.k(context8, 12.0f));
            hx7.q.i(constraintSet2, shimmerFrameLayoutJ0, 0);
        } else if (i6 == 2) {
            hx7.q.f(constraintSet2, shimmerFrameLayoutJ05, view3, kli.a.k(context8, 16.0f));
            hx7.q.i(constraintSet2, shimmerFrameLayoutJ05, iK);
            hx7.q.f(constraintSet2, shimmerFrameLayoutJ04, shimmerFrameLayoutJ05, kli.a.k(context8, 16.0f));
            hx7.q.i(constraintSet2, shimmerFrameLayoutJ04, iK);
            hx7.q.f(constraintSet2, shimmerFrameLayoutJ02, shimmerFrameLayoutJ04, kli.a.k(context8, 86.0f));
            hx7.q.i(constraintSet2, shimmerFrameLayoutJ02, 0);
            hx7.q.f(constraintSet2, shimmerFrameLayoutJ0, shimmerFrameLayoutJ02, kli.a.k(context8, 12.0f));
            hx7.q.i(constraintSet2, shimmerFrameLayoutJ0, 0);
        } else if (i6 == 3) {
            hx7.q.g(constraintSet2, shimmerFrameLayoutJ03, getNavigationBar());
            hx7.q.k(constraintSet2, shimmerFrameLayoutJ03, getNavigationBar());
            hx7.q.l0(constraintSet2, shimmerFrameLayoutJ0, getNavigationBar(), kli.a.k(context8, 22.0f));
            hx7.q.i(constraintSet2, shimmerFrameLayoutJ0, 0);
            hx7.q.l0(constraintSet2, shimmerFrameLayoutJ02, shimmerFrameLayoutJ0, kli.a.k(context8, 12.0f));
            hx7.q.i(constraintSet2, shimmerFrameLayoutJ02, 0);
        } else {
            if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            hx7.q.g(constraintSet2, shimmerFrameLayoutJ03, getNavigationBar());
            hx7.q.k(constraintSet2, shimmerFrameLayoutJ03, getNavigationBar());
            hx7.q.l0(constraintSet2, shimmerFrameLayoutJ0, getNavigationBar(), kli.a.k(context8, 22.0f));
            hx7.q.i(constraintSet2, shimmerFrameLayoutJ0, 0);
            hx7.q.l0(constraintSet2, shimmerFrameLayoutJ02, shimmerFrameLayoutJ0, kli.a.k(context8, 12.0f));
            hx7.q.i(constraintSet2, shimmerFrameLayoutJ02, 0);
            hx7.q.f(constraintSet2, shimmerFrameLayoutJ05, view3, kli.a.k(context8, 16.0f));
            hx7.q.i(constraintSet2, shimmerFrameLayoutJ05, iK);
        }
        constraintSet2.applyTo(hostView4);
        p0(fVar4, true);
        q0(true);
    }

    public final void t0(boolean z) {
        s sVar;
        a0 a0Var = this.f317261j;
        TextLocalisedClause textLocalisedClause = null;
        z zVar = a0Var instanceof z ? (z) a0Var : null;
        if (zVar != null && (sVar = zVar.f317311a) != null) {
            textLocalisedClause = sVar.f317299c;
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        getNavigationBar().setMenuItems((textLocalisedClause2 == null || !z) ? f0.f322471a : zhm.u.c(new TextNavBarMenuItem("id_skip", textLocalisedClause2, null, null, 12)));
    }

    @Override // qp0.a
    public final void x() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ax0.k
    @NotNull
    public Guideline getBottomGuideline() {
        return this.f317271x;
    }

    @Override // ax0.k
    @NotNull
    public Guideline getTopGuideline() {
        return this.f317270w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f = v0.a.d("create(...)");
        this.f317259g = v0.a.d("create(...)");
        this.f317260h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.f317261j = x.f317308a;
        this.k = v0.a.d("create(...)");
        this.f317262l = v0.a.d("create(...)");
        this.u = new a5h.g((View) this);
        ju0.j jVar = new ju0.j(context, null, 6, 0);
        jVar.setId(View.generateViewId());
        this.v = jVar;
        Guideline guideline = new Guideline(context);
        guideline.setId(View.generateViewId());
        this.f317270w = guideline;
        Guideline guideline2 = new Guideline(context);
        guideline2.setId(View.generateViewId());
        this.f317271x = guideline2;
        BasicNavBar basicNavBar = new BasicNavBar(context, null);
        basicNavBar.setId(View.generateViewId());
        basicNavBar.setTitleCentered(true);
        basicNavBar.setOnNavigationButtonClickListener(new wk.a(this, 5));
        this.f317272y = basicNavBar;
        final int i2 = 0;
        this.z = te0.w.y0(new Function0() { // from class: yw0.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                f fVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        f.a aVar = f.Companion;
                        ProgressPagingIndicatorView progressPagingIndicatorView = new ProgressPagingIndicatorView(context2, null, 6, 0);
                        progressPagingIndicatorView.setId(View.generateViewId());
                        fVar.addView(progressPagingIndicatorView, new ConstraintLayout.LayoutParams(-2, -2));
                        return progressPagingIndicatorView;
                    default:
                        f.a aVar2 = f.Companion;
                        ActionFooterView actionFooterView = new ActionFooterView(context2, null, 0, 14);
                        actionFooterView.setId(View.generateViewId());
                        fVar.addView(actionFooterView, new ConstraintLayout.LayoutParams(0, -2));
                        return actionFooterView;
                }
            }
        });
        final int i3 = 1;
        this.A = te0.w.y0(new Function0() { // from class: yw0.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                f fVar = this;
                Context context2 = context;
                switch (i32) {
                    case 0:
                        f.a aVar = f.Companion;
                        ProgressPagingIndicatorView progressPagingIndicatorView = new ProgressPagingIndicatorView(context2, null, 6, 0);
                        progressPagingIndicatorView.setId(View.generateViewId());
                        fVar.addView(progressPagingIndicatorView, new ConstraintLayout.LayoutParams(-2, -2));
                        return progressPagingIndicatorView;
                    default:
                        f.a aVar2 = f.Companion;
                        ActionFooterView actionFooterView = new ActionFooterView(context2, null, 0, 14);
                        actionFooterView.setId(View.generateViewId());
                        fVar.addView(actionFooterView, new ConstraintLayout.LayoutParams(0, -2));
                        return actionFooterView;
                }
            }
        });
        int iS = kli.a.s(R$attr.uikit_colorGroupedBackground, context);
        this.B = iS;
        this.C = new ColorDrawable(iS);
        this.D = new LinkedHashMap();
        setBackgroundColor(iS);
        addView(jVar, new ConstraintLayout.LayoutParams(0, 0));
        addView(getTopGuideline(), new ConstraintLayout.LayoutParams(-2, -2));
        addView(getBottomGuideline(), new ConstraintLayout.LayoutParams(-2, -2));
        addView(getNavigationBar(), new ConstraintLayout.LayoutParams(0, -2));
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        Guideline guideline3 = getTopGuideline();
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(guideline3, "guideline");
        constraintSet.create(guideline3.getId(), 0);
        Guideline guideline4 = getBottomGuideline();
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(guideline4, "guideline");
        constraintSet.create(guideline4.getId(), 0);
        hx7.q.h(constraintSet, jVar);
        Guideline guideline5 = getTopGuideline();
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(guideline5, "guideline");
        constraintSet.setGuidelineBegin(guideline5.getId(), 0);
        Guideline guideline6 = getBottomGuideline();
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        Intrinsics.checkNotNullParameter(guideline6, "guideline");
        constraintSet.setGuidelineEnd(guideline6.getId(), 0);
        hx7.q.i(constraintSet, getNavigationBar(), 0);
        hx7.q.l0(constraintSet, getNavigationBar(), getTopGuideline(), 0);
        constraintSet.applyTo(this);
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
