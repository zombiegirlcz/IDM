package ux0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import aw0.v1;
import aw0.x8;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.d2;
import ix0.f2;
import ix0.h2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ms0.e4;
import mx0.c9;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import tx0.u2;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends t0 implements d2, ur0.a {

    @NotNull
    public static final C1569a Companion = new C1569a();
    public v1 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f283718b;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f283719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f283720h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a2 f283721j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CoroutineScope f283722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f283723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f283724n;
    public u2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f283725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f283726q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f283727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f283728s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f283729t;
    public final ShimmerFrameLayout u;
    public final SwitcherButtonView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ActionsView f283730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n f283731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ParcelableViewTarget f283732y;
    public OneShotPreDrawListener z;

    /* JADX INFO: renamed from: ux0.a$a, reason: collision with other inner class name */
    public static final class C1569a {
        private C1569a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f283718b = j6.a.h("create(...)");
        this.f = v0.a.d("create(...)");
        this.i = true;
        skm.p0 p0Var = skm.p0.f264001a;
        this.f283722l = rd0.e.a(zkm.o.f323119a.e);
        this.f283723m = f.f283744a;
        f2 f2Var = new f2(this, this);
        this.f283727r = te0.w.y0(new ts0.t(context, 2));
        f2Var.a();
        LayoutInflater.from(context).inflate(R$layout.internal_view_product_intro_v2, this);
        View viewFindViewById = findViewById(R$id.productIntroNavBarContentV2_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f283728s = textView;
        jb3.l.e(textView, R$attr.internal_textAppearanceMarketingDisplay2_noXmlUsage);
        View viewFindViewById2 = findViewById(R$id.productIntroNavBarContentV2_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f283729t = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.productIntroNavBarContentV2_smallAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.v = (SwitcherButtonView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.productIntroShimmering_textContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) viewFindViewById4;
        this.u = shimmerFrameLayout;
        View viewFindViewById5 = findViewById(R$id.productIntroNavBarContentV2_actionsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ActionsView actionsView = (ActionsView) viewFindViewById5;
        this.f283730w = actionsView;
        actionsView.setLayoutType(mx0.l.HEADER_CIRCLE_ACTIONS);
        actionsView.setLongClickable(true);
        this.f283726q = new j(this);
        int childCount = shimmerFrameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = shimmerFrameLayout.getChildAt(i);
            RoundedBackgroundDrawable.Companion companion = RoundedBackgroundDrawable.INSTANCE;
            Context context2 = childAt.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iS = kli.a.s(R$attr.uikit_colorGreyTone8, context);
            companion.getClass();
            childAt.setBackground(RoundedBackgroundDrawable.Companion.c(iS, context2));
        }
        ifk.b.q(this.u, null, 3);
        setClipToPadding(false);
        setClipChildren(false);
        setOnClickListener(new c9(this, 26));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final x8 getProductIntroColorPalette() {
        return (x8) this.f283727r.getValue();
    }

    private final p getViewHolder() {
        p pVar = this.f283725p;
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(new h2(this.u), new h2(this.f283728s, this.f283729t));
        this.f283725p = pVar2;
        return pVar2;
    }

    public static ArrayList i0(List list, Set set) {
        List<ActionsView.Item> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (ActionsView.Item itemE : list2) {
            if (!set.contains(itemE.f58316a)) {
                e4 e4Var = itemE.d;
                e4 e4Var2 = e4.DisabledNonClickable;
                if (e4Var != e4Var2) {
                    itemE = ActionsView.Item.e(itemE, null, e4Var2, 32759);
                }
            }
            arrayList.add(itemE);
        }
        return arrayList;
    }

    @Override // ix0.d2
    public final void D(boolean z) {
        if (!z) {
            a2 a2Var = this.f283721j;
            if (a2Var != null) {
                a2Var.f(null);
                return;
            }
            return;
        }
        if (this.i) {
            return;
        }
        a2 a2Var2 = this.f283721j;
        if (a2Var2 == null || !a2Var2.d()) {
            l0(this.k);
        }
    }

    @Override // tx0.x2
    public final void H(int i) {
        this.f283720h = i;
        j0();
    }

    @Override // ux0.t0, tx0.x2
    public final ViewGroup.LayoutParams N(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ViewGroup.LayoutParams(-1, -2);
    }

    @Override // tx0.x2
    public final void d(float f, int i) {
    }

    @Override // ux0.t0, tx0.x2
    public final void d0(int i) {
        if (i == this.f283719g) {
            return;
        }
        this.f283719g = i;
        or0.u.z(this.f283728s, 0, i, 0, 0, false, 29);
    }

    @Override // ux0.t0
    public final efm.r f0() {
        return this.f283730w.f58296a.f121375b;
    }

    @Override // ux0.t0
    public final efm.r g0() {
        return this.f283730w.d.f121375b;
    }

    @Override // ux0.t0
    @NotNull
    public View getActionsForTransition() {
        return this.f283730w;
    }

    @Override // ux0.t0
    public int getDisclaimerHeightForTransition() {
        return 0;
    }

    @Override // ux0.t0
    public final efm.r h0() {
        return this.f;
    }

    public final void j0() {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
        ActionsView actionsView = this.f283730w;
        actionsView.setPadding(actionsView.getPaddingLeft(), actionsView.getPaddingTop(), actionsView.getPaddingRight(), 0);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 16.0f);
        if (this.f283724n == null || actionsView.getVisibility() != 0) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.f283720h);
        } else {
            actionsView.setPadding(actionsView.getPaddingLeft(), actionsView.getPaddingTop(), actionsView.getPaddingRight(), this.f283720h + iK);
        }
    }

    public final void l0(long j2) {
        if (jo0.m.f176851h) {
            a2 a2Var = this.f283721j;
            Continuation continuation = null;
            if (a2Var != null) {
                a2Var.f(null);
            }
            this.k = j2;
            this.i = false;
            this.f283721j = skm.e0.C(this.f283722l, null, null, new eh1.g(9, j2, this, continuation), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(ux0.i r20) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ux0.a.m0(ux0.i):void");
    }

    public final void n0(View view, n nVar) {
        OneShotPreDrawListener oneShotPreDrawListener = this.z;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        this.z = OneShotPreDrawListener.add(view, new et0.w(view, 9, this, nVar));
    }

    @Override // ux0.c1
    public final efm.r o() {
        return te0.w.a0(this.f283718b, new uwi.v(6));
    }

    public final void o0() {
        if (this.i) {
            return;
        }
        n nVar = this.f283731x;
        if (nVar instanceof l) {
            this.v.getGlowHighlightManager().d(null);
        } else if (nVar instanceof k) {
            Set ids = ((k) nVar).f283770a;
            ActionsView actionsView = this.f283730w;
            actionsView.getClass();
            Intrinsics.checkNotNullParameter(ids, "ids");
            actionsView.h(ids, mx0.z.f);
        } else if (nVar instanceof m) {
            ParcelableViewTarget parcelableViewTarget = ((m) nVar).f283782a;
            View rootView = getRootView();
            View viewA = rootView != null ? js0.d.a(parcelableViewTarget, rootView) : null;
            if (viewA == null) {
                IllegalStateException illegalStateException = new IllegalStateException(p.a.p("No view found for ", parcelableViewTarget.j(), ", can't play highlight"));
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                jr0.g.Companion.getClass();
                jr0.f.a(viewA).d(null);
            }
        } else if (nVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        this.f283731x = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u2 u2Var = this.o;
        if (u2Var != null) {
            u2Var.a(getProductIntroColorPalette().f10609a, getProductIntroColorPalette().f10610b, getProductIntroColorPalette().f10611c, getProductIntroColorPalette().e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f283726q;
        ValueAnimator valueAnimator = jVar.f283757b;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        jVar.f283757b = null;
        a2 a2Var = this.f283721j;
        if (a2Var != null) {
            a2Var.f(null);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        j jVar = this.f283726q;
        Paint paint = jVar.f283760h;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = jVar.i;
        if (bitmap != null) {
            if (!jVar.f283758c) {
                bitmap = null;
            }
            if (bitmap != null) {
                paint.setAlpha(rim.d.c((1.0f - jVar.e) * 255));
                float f = ((-jVar.k) * jVar.d) + 0 + 0;
                Float f4 = jVar.f;
                canvas.drawBitmap(bitmap, f, f4 != null ? f4.floatValue() : jVar.f283762l.getTop(), paint);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        p0(this.f283724n);
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
    public final void p0(d dVar) {
        if (dVar != null) {
            boolean z = dVar instanceof c;
            d bVar = dVar;
            if (!z) {
                if (!(dVar instanceof b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActionsView actionsView = this.f283730w;
                ArrayList arrayListU = zhm.w.u(actionsView.getHiddenActions$ui_kit_components_release());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it8 = arrayListU.iterator();
                while (it8.hasNext()) {
                    linkedHashSet.add(((ActionsView.Item) it8.next()).f58316a);
                }
                b bVar2 = (b) dVar;
                Clause clause = bVar2.f283736b;
                List actions = bVar2.f283735a;
                List list = bVar2.f283737c;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it9 = actions.iterator();
                while (it9.hasNext()) {
                    linkedHashSet2.add(((ActionsView.Item) it9.next()).f58316a);
                }
                Object layoutManager = actionsView.f58305p.getLayoutManager();
                int i = 0;
                boolean z3 = (layoutManager instanceof mx0.h ? (mx0.h) layoutManager : null) == null ? false : !r5.a().isEmpty();
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it10 = list2.iterator();
                    while (it10.hasNext()) {
                        if ((((o) it10.next()).f283788c instanceof l) && (i = i + 1) < 0) {
                            zhm.v.r();
                            throw null;
                        }
                    }
                }
                if (i > 1) {
                    IllegalStateException illegalStateException = new IllegalStateException("Product should not have more than 1 small button story");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                ArrayList stories = new ArrayList();
                for (Object obj2 : list2) {
                    n nVar = ((o) obj2).f283788c;
                    if (!(nVar instanceof k)) {
                        if (nVar instanceof l) {
                            if (clause == null || i >= 2) {
                            }
                        } else if (!(nVar instanceof m)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        stories.add(obj2);
                        break;
                        break;
                    }
                    Set set = ((k) nVar).f283770a;
                    if (!set.isEmpty()) {
                        Set<String> set2 = set;
                        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                            for (String str : set2) {
                                if ((!linkedHashSet2.contains(str) || linkedHashSet.contains(str)) && (!Intrinsics.f(str, actionsView.getMoreActionState().f209895a) || !z3)) {
                                }
                            }
                        }
                    }
                    stories.add(obj2);
                    break;
                }
                bVar = bVar2;
                if (list.size() != stories.size()) {
                    Intrinsics.checkNotNullParameter(actions, "actions");
                    Intrinsics.checkNotNullParameter(stories, "stories");
                    bVar = new b(clause, actions, stories);
                }
            }
            if (bVar.equals(this.f283724n)) {
                return;
            }
            this.f283724n = bVar;
            m0(this.f283723m.a(bVar));
        }
    }

    @Override // ms0.j2
    public final void pause() {
        a2 a2Var = this.f283721j;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.i = true;
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (colorScheme == this.A) {
            return;
        }
        this.A = colorScheme;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f283728s.setTextColor(kli.a.s(colorScheme.a(), context));
        ifk.b.q(this.u, colorScheme, 1);
    }

    @Override // ms0.j2
    public final void resume() {
        l0(this.k);
        o0();
    }

    @Override // ux0.t0, tx0.x2
    public void setBackgroundOffset(int i) {
    }

    @Override // ux0.t0, tx0.x2
    public void setColorSchemeListener(@NotNull u2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.o = listener;
    }

    @Override // ux0.t0
    public void setModel(@NotNull u0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!(model instanceof d)) {
            throw new IllegalStateException("Wrong model received");
        }
        p0((d) model);
    }

    @Override // ux0.t0
    public void setStoriesAlpha(float f) {
        this.f283728s.setAlpha(f);
        this.f283729t.setAlpha(f);
        this.v.setAlpha(f);
        this.u.setAlpha(f);
    }

    @Override // tx0.x2
    public final int w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
