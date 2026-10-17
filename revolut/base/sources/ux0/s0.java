package ux0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import au0.l5;
import au0.p5;
import au0.q5;
import au0.s5;
import au0.u5;
import au0.v5;
import aw0.l6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import ix0.h1;
import ix0.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import tx0.u2;
import tx0.w2;
import tx0.x2;

/* JADX INFO: loaded from: classes20.dex */
public abstract class s0 extends FrameLayout implements x2, c1, ur0.b, up0.j0 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f283800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f283801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundView f283802c;
    public final int d;
    public final AccountSelectionNavBarContentView e;
    public AnimatorSet f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccelerateInterpolator f283803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tnb.g0 f283804h;
    public l0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f283805j;
    public l0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q5 f283806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xv0.d f283807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xv0.p f283808n;
    public ValueAnimator o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f283809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vx0.b f283810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f283811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f283812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f283813t;
    public final up0.d0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f283814w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public tx0.c f283815x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    public s0(Context context, AttributeSet attributeSet) {
        t0 view;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zBooleanValue = ((Boolean) jo0.g.d.getValue()).booleanValue();
        this.f283800a = zBooleanValue;
        if (zBooleanValue) {
            view = new a(context, null);
        } else {
            w0 w0Var = new w0(context, null);
            w0Var.setVideoPlayerDetachBehaviour$ui_kit_components_release(jv0.s.PAUSE_ON_DETACH);
            view = w0Var;
        }
        this.f283801b = view;
        this.d = kli.a.s(R$attr.uikit_colorGroupedBackground, context);
        AccountSelectionNavBarContentView view2 = new AccountSelectionNavBarContentView(context, null);
        this.e = view2;
        this.f283803g = new AccelerateInterpolator(1.5f);
        final AccountsNavBarContentView accountsNavBarContentView = (AccountsNavBarContentView) this;
        tnb.g0 g0Var = new tnb.g0(accountsNavBarContentView);
        this.f283804h = g0Var;
        this.i = new g0(g0Var, null, null, false, null);
        this.f283807m = new xv0.d();
        this.f283808n = new xv0.p();
        this.f283809p = true;
        vx0.b bVar = new vx0.b();
        this.f283810q = bVar;
        this.f283811r = v0.a.d("create(...)");
        up0.d0 d0Var = new up0.d0(context);
        this.u = d0Var;
        view2.setId(R$id.baseAccountsNavBarContentView_accountSelectionNavBarContent);
        AnimatedBackgroundView animatedBackgroundView = new AnimatedBackgroundView(context, null, 6, 0);
        animatedBackgroundView.setId(R$id.productIntroNavBarContent_backgroundView);
        animatedBackgroundView.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
        this.f283802c = animatedBackgroundView;
        view2.setOnPagingStateChanged$ui_kit_components_release(new umd.n(accountsNavBarContentView, 15));
        efm.r rVarO = view.o();
        final int i = 0;
        Function1 function1 = new Function1() { // from class: ux0.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Throwable thA = yhm.m.a(((yhm.m) obj2).f314193a);
                        AccountsNavBarContentView accountsNavBarContentView2 = accountsNavBarContentView;
                        if (thA == null || !accountsNavBarContentView2.isInLayout()) {
                            accountsNavBarContentView2.i(accountsNavBarContentView2.i.m(thA));
                        } else {
                            accountsNavBarContentView2.post(new uk.a(accountsNavBarContentView2, thA, 1));
                        }
                        break;
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        AccountsNavBarContentView accountsNavBarContentView3 = accountsNavBarContentView;
                        l0 l0Var = accountsNavBarContentView3.i;
                        j0 j0VarP = l0Var instanceof j0 ? (j0) l0Var : null;
                        if (j0VarP != null) {
                            if (j0VarP.f283768h != zBooleanValue2) {
                                j0VarP = j0.p(j0VarP, null, null, null, null, false, zBooleanValue2, false, null, 895);
                            }
                            accountsNavBarContentView3.i(j0VarP);
                        }
                        break;
                    default:
                        Configuration it8 = (Configuration) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        accountsNavBarContentView.c();
                        break;
                }
                return Unit.f186387a;
            }
        };
        efm.r rVarOnErrorResumeNext = rVarO.onErrorResumeNext(new ly7.g(21, new up5.s(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new n1i.b(22, function1), new n1i.b(22, q0.f283797a)), "subscribe(...)");
        efm.r rVarG0 = view.g0();
        final int i2 = 1;
        Function1 function12 = new Function1() { // from class: ux0.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Throwable thA = yhm.m.a(((yhm.m) obj2).f314193a);
                        AccountsNavBarContentView accountsNavBarContentView2 = accountsNavBarContentView;
                        if (thA == null || !accountsNavBarContentView2.isInLayout()) {
                            accountsNavBarContentView2.i(accountsNavBarContentView2.i.m(thA));
                        } else {
                            accountsNavBarContentView2.post(new uk.a(accountsNavBarContentView2, thA, 1));
                        }
                        break;
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        AccountsNavBarContentView accountsNavBarContentView3 = accountsNavBarContentView;
                        l0 l0Var = accountsNavBarContentView3.i;
                        j0 j0VarP = l0Var instanceof j0 ? (j0) l0Var : null;
                        if (j0VarP != null) {
                            if (j0VarP.f283768h != zBooleanValue2) {
                                j0VarP = j0.p(j0VarP, null, null, null, null, false, zBooleanValue2, false, null, 895);
                            }
                            accountsNavBarContentView3.i(j0VarP);
                        }
                        break;
                    default:
                        Configuration it8 = (Configuration) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        accountsNavBarContentView.c();
                        break;
                }
                return Unit.f186387a;
            }
        };
        efm.r rVarOnErrorResumeNext2 = rVarG0.onErrorResumeNext(new ly7.g(21, new up5.s(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2.subscribe(new n1i.b(22, function12), new n1i.b(22, r0.f283799a)), "subscribe(...)");
        if (!view2.isLaidOut() || view2.isLayoutRequested()) {
            view2.addOnLayoutChangeListener(new p0(accountsNavBarContentView, 0));
        } else {
            i(this.i.h());
            d0Var.g();
        }
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new p0(accountsNavBarContentView, 1));
        } else {
            i(this.i.h());
        }
        c();
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setColorSchemeListener(new rul.e(bVar, view2));
        Intrinsics.checkNotNullParameter(view, "view");
        view.setColorSchemeListener(new rul.e(bVar, view));
        final int i3 = 2;
        c8g.a.a(this, ny0.a.f220589a, new Function1() { // from class: ux0.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Throwable thA = yhm.m.a(((yhm.m) obj2).f314193a);
                        AccountsNavBarContentView accountsNavBarContentView2 = accountsNavBarContentView;
                        if (thA == null || !accountsNavBarContentView2.isInLayout()) {
                            accountsNavBarContentView2.i(accountsNavBarContentView2.i.m(thA));
                        } else {
                            accountsNavBarContentView2.post(new uk.a(accountsNavBarContentView2, thA, 1));
                        }
                        break;
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        AccountsNavBarContentView accountsNavBarContentView3 = accountsNavBarContentView;
                        l0 l0Var = accountsNavBarContentView3.i;
                        j0 j0VarP = l0Var instanceof j0 ? (j0) l0Var : null;
                        if (j0VarP != null) {
                            if (j0VarP.f283768h != zBooleanValue2) {
                                j0VarP = j0.p(j0VarP, null, null, null, null, false, zBooleanValue2, false, null, 895);
                            }
                            accountsNavBarContentView3.i(j0VarP);
                        }
                        break;
                    default:
                        Configuration it8 = (Configuration) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        accountsNavBarContentView.c();
                        break;
                }
                return Unit.f186387a;
            }
        });
    }

    public static final void a(final s0 s0Var, final RecyclerView recyclerView, final boolean z) {
        w2 w2Var;
        s0 s0Var2;
        ValueAnimator valueAnimator;
        final w2 w2Var2;
        w2 w2Var3;
        t0 t0Var = s0Var.f283801b;
        final NavBarWithContainer parentNavBarWithContainer = s0Var.getParentNavBarWithContainer();
        AnimatorSet animatorSet = s0Var.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i = 27;
        if (s0Var.isShown()) {
            int height = s0Var.e.getHeight() - t0Var.getHeight();
            if (height == 0) {
                parentNavBarWithContainer.getClass();
            } else {
                CollapsingAppBarLayout$Behavior currentBehaviourOrNull$ui_kit_components_release = parentNavBarWithContainer.getCurrentBehaviourOrNull$ui_kit_components_release();
                if (currentBehaviourOrNull$ui_kit_components_release != null) {
                    int topAndBottomOffset = currentBehaviourOrNull$ui_kit_components_release.getTopAndBottomOffset();
                    w2Var3 = height < 0 ? new w2(topAndBottomOffset, topAndBottomOffset, height) : new w2(topAndBottomOffset, topAndBottomOffset - height, 0);
                    w2Var3.addUpdateListener(new androidx.core.view.j(currentBehaviourOrNull$ui_kit_components_release, w2Var3, i));
                    w2Var3.addListener(new l5(parentNavBarWithContainer, 25));
                    w2Var3.addListener(new az0.o0(parentNavBarWithContainer, currentBehaviourOrNull$ui_kit_components_release, 10));
                }
                w2Var = w2Var3;
            }
            w2Var3 = null;
            w2Var = w2Var3;
        } else {
            w2Var = null;
        }
        final boolean z3 = w2Var != null && w2Var.f275263b > w2Var.f275264c;
        l0 l0Var = s0Var.i;
        k0 k0Var = l0Var instanceof k0 ? (k0) l0Var : null;
        final boolean zJ = pd.b.j(k0Var != null ? Boolean.valueOf(h(k0Var)) : null);
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        final float alpha = recyclerView != null ? recyclerView.getAlpha() : BitmapDescriptorFactory.HUE_RED;
        Intrinsics.h(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new mx0.l0(s0Var, zJ));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ux0.t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) z9h.n.g(valueAnimator2, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                s0 s0Var3 = this.f283816a;
                AccountSelectionNavBarContentView accountSelectionNavBarContentView = s0Var3.e;
                t0 t0Var2 = s0Var3.f283801b;
                s0Var3.b(accountSelectionNavBarContentView, fFloatValue, zJ);
                if (z3) {
                    t0Var2.setStoriesAlpha(1 - fFloatValue);
                } else {
                    t0Var2.setAlpha(1 - fFloatValue);
                }
                float f = alpha;
                float animatedFraction = (valueAnimatorOfFloat.getAnimatedFraction() * (1 - f)) + f;
                RecyclerView recyclerView2 = recyclerView;
                if (recyclerView2 != null) {
                    recyclerView2.setAlpha(animatedFraction);
                }
                parentNavBarWithContainer.setBottomViewAlpha$ui_kit_components_release(animatedFraction);
            }
        });
        if (w2Var != null) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final View actionsForTransition = t0Var.getActionsForTransition();
            final int iAbs = Math.abs(w2Var.f275264c) - Math.abs(w2Var.f275263b);
            Context context = s0Var.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 48.0f);
            final int iSignum = Math.abs(iAbs) > iK ? Integer.signum(iAbs) * iK : 0;
            final int disclaimerHeightForTransition = t0Var.getDisclaimerHeightForTransition();
            valueAnimator = valueAnimatorOfFloat;
            final boolean z4 = z3;
            w2Var2 = w2Var;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: ux0.u
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator it8) {
                    s0 s0Var3 = s0Var;
                    t0 t0Var2 = s0Var3.f283801b;
                    AccountSelectionNavBarContentView accountSelectionNavBarContentView = s0Var3.e;
                    Intrinsics.checkNotNullParameter(it8, "it");
                    Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                    if (ref$ObjectRef2.f186409a == null) {
                        ref$ObjectRef2.f186409a = accountSelectionNavBarContentView.getActionsForTransition();
                    }
                    w2 w2Var4 = w2Var2;
                    float animatedFraction = w2Var4.getAnimatedFraction();
                    int i2 = w2Var4.f275263b;
                    float f = iAbs;
                    float f4 = f * animatedFraction;
                    float fAbs = Math.abs(i2 - w2Var4.f275262a);
                    float f5 = iSignum;
                    t0Var2.setTranslationY((fAbs + f4) - (f5 * animatedFraction));
                    View view = actionsForTransition;
                    if (view != null) {
                        view.setTranslationY((disclaimerHeightForTransition * animatedFraction) + (fAbs - t0Var2.getTranslationY()));
                    }
                    accountSelectionNavBarContentView.setTranslationY(Math.abs(i2) + f4);
                    float f6 = 1;
                    float f32 = f6 - animatedFraction;
                    accountSelectionNavBarContentView.setContentTranslationY(f5 * f32);
                    View view2 = (View) ref$ObjectRef2.f186409a;
                    if (view2 != null) {
                        view2.setTranslationY((f - f5) * f32);
                        if (z4) {
                            float fC = jq0.a.c(animatedFraction, 0.8f);
                            if (z) {
                                view2.setAlpha(fC);
                            }
                            if (view != null) {
                                view.setAlpha(f6 - fC);
                            }
                        }
                    }
                }
            };
            s0Var2 = s0Var;
            w2Var2.addUpdateListener(animatorUpdateListener);
            w2Var2.addListener(new byl.i(s0Var2, 6, actionsForTransition, ref$ObjectRef));
        } else {
            s0Var2 = s0Var;
            valueAnimator = valueAnimatorOfFloat;
            w2Var2 = w2Var;
        }
        ValueAnimator valueAnimatorG = zJ ? null : s0Var2.g(false);
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] elements = {valueAnimatorG, valueAnimator, w2Var2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        animatorSet2.playTogether(kotlin.collections.d.L(elements));
        animatorSet2.setInterpolator(jq0.r.f177392a);
        animatorSet2.setDuration(600L);
        animatorSet2.addListener(new l5(s0Var2, i));
        animatorSet2.start();
        s0Var2.f = animatorSet2;
    }

    private final RecyclerView getContentRecycler() {
        ViewParent parent = getParentNavBarWithContainer().getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        for (View view : ViewGroupKt.getChildren((ViewGroup) parent)) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            if (view instanceof ViewPager2) {
                return yp0.j0.a((ViewPager2) view);
            }
        }
        return null;
    }

    private final q5 getOrCreateNavBarBgProjection() {
        q5 q5Var = this.f283806l;
        if (q5Var != null) {
            return q5Var;
        }
        p5 p5Var = q5.Companion;
        Integer numValueOf = Integer.valueOf(R$id.accountsNavBarContent_navBarProjection);
        p5Var.getClass();
        q5 q5VarA = p5.a(this, numValueOf);
        if (q5VarA == null) {
            return null;
        }
        this.f283806l = q5VarA;
        return q5VarA;
    }

    private final NavBarWithContainer getParentNavBarWithContainer() {
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof NavBarWithContainer)) {
            parent = parent.getParent();
        }
        NavBarWithContainer navBarWithContainer = parent instanceof NavBarWithContainer ? (NavBarWithContainer) parent : null;
        if (navBarWithContainer != null) {
            return navBarWithContainer;
        }
        throw new IllegalStateException("Couldn't find NavBarWithContainer parent");
    }

    public static boolean h(k0 k0Var) {
        f0 f0Var = k0Var.f283772b;
        j0 j0Var = f0Var instanceof j0 ? (j0) f0Var : null;
        if (pd.b.j(j0Var != null ? Boolean.valueOf(j0Var.f283769j instanceof d0) : null)) {
            return true;
        }
        m0 m0Var = k0Var.f283771a;
        j0 j0Var2 = m0Var instanceof j0 ? (j0) m0Var : null;
        return pd.b.j(j0Var2 != null ? Boolean.valueOf(j0Var2.f283769j instanceof d0) : null);
    }

    public static /* synthetic */ void setModels$default(s0 s0Var, List list, tx0.q qVar, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setModels");
        }
        if ((i & 2) != 0) {
            qVar = tx0.p.f275219a;
        }
        s0Var.setModels(list, qVar);
    }

    private final void setNavBarInteractionsEnabled(boolean z) {
        ViewParent parent;
        if (this.f283809p != z && z && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.f283809p = z;
    }

    @Override // tx0.x2
    public final void H(int i) {
        this.e.H(i);
        this.f283801b.H(i);
    }

    @Override // tx0.x2
    public final ViewGroup.LayoutParams N(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ViewGroup.LayoutParams(-1, -2);
    }

    public final void b(AccountSelectionNavBarContentView accountSelectionNavBarContentView, float f, boolean z) {
        accountSelectionNavBarContentView.setContentAlpha$ui_kit_components_release(f);
        if (z) {
            accountSelectionNavBarContentView.setBackgroundAlpha$ui_kit_components_release(1.0f);
        } else {
            accountSelectionNavBarContentView.setBackgroundAlpha$ui_kit_components_release(this.f283803g.getInterpolation(f));
        }
    }

    public final void c() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        t0 t0Var = this.f283801b;
        ViewGroup.LayoutParams layoutParamsN = t0Var.N(context);
        ViewGroup.LayoutParams layoutParams = t0Var.getLayoutParams();
        if (layoutParams == null || layoutParams.width != layoutParamsN.width || layoutParams.height != layoutParamsN.height) {
            t0Var.setLayoutParams(new FrameLayout.LayoutParams(layoutParamsN.width, layoutParamsN.height));
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        tx0.c cVar = this.f283815x;
        AccountSelectionNavBarContentView accountSelectionNavBarContentView = this.e;
        accountSelectionNavBarContentView.getClass();
        ViewGroup.LayoutParams layoutParamsC = AccountSelectionNavBarContentView.c(context2, cVar);
        ViewGroup.LayoutParams layoutParams2 = accountSelectionNavBarContentView.getLayoutParams();
        if (layoutParams2 == null || layoutParams2.width != layoutParamsC.width || layoutParams2.height != layoutParamsC.height) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParamsC.width, layoutParamsC.height);
            layoutParams3.gravity = 48;
            accountSelectionNavBarContentView.setLayoutParams(layoutParams3);
        }
        int iMin = Math.min(t0Var.getMinimumHeight(), layoutParamsC.height);
        if (iMin != getMinimumHeight()) {
            setMinimumHeight(iMin);
        }
    }

    @Override // tx0.x2
    public final void d(float f, int i) {
        l0 l0Var = this.i;
        boolean z = l0Var instanceof j0;
        k0 k0Var = l0Var instanceof k0 ? (k0) l0Var : null;
        boolean z3 = (k0Var != null ? k0Var.f283771a : null) instanceof h0;
        if (!z && !z3) {
            this.e.d(f, i);
            this.u.g();
        }
        this.f283801b.d(f, i);
        l0 l0Var2 = this.i;
        j0 j0VarP = l0Var2 instanceof j0 ? (j0) l0Var2 : null;
        if (j0VarP == null) {
            return;
        }
        boolean z4 = (getHeight() == 0 ? BitmapDescriptorFactory.HUE_RED : ((float) Math.abs(i)) / ((float) getHeight())) >= 0.25f;
        if (j0VarP.f283767g == z4) {
            j0VarP = j0.p(j0VarP, null, null, null, null, !z4, false, false, null, 959);
        }
        i(j0VarP);
    }

    @Override // tx0.x2
    public final void d0(int i) {
        this.e.d0(i);
        this.f283801b.d0(i);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        if (event != null) {
            up0.d0 d0Var = this.u;
            d0Var.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            if (d0Var.f281690b.isInitialized() && d0Var.e().getView().getParent() != null) {
                up0.s sVar = (up0.s) d0Var.f281691c.getValue();
                int[] iArr = sVar.d;
                int[] iArr2 = sVar.f281760c;
                up0.q0 q0Var = sVar.f281758a;
                Intrinsics.checkNotNullParameter(event, "event");
                View view = sVar.f281759b;
                if (view != null) {
                    if (event.getActionMasked() == 0) {
                        q0Var.getView().getLocationInWindow(iArr2);
                        view.getLocationInWindow(iArr);
                        sVar.e = iArr[0] - iArr2[0];
                        sVar.f = iArr[1] - iArr2[1];
                    }
                    float x3 = event.getX() + sVar.e;
                    float y2 = event.getY() + sVar.f;
                    up0.l0 l0Var = (up0.l0) q0Var;
                    l0Var.getClass();
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (up0.l0.f("Touch coordinates must be finite", x3, y2)) {
                        Function0 function0 = l0Var.f281732a;
                        if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : l0Var.i) {
                            int actionMasked = event.getActionMasked();
                            if (actionMasked == 0) {
                                l0Var.f281740n = true;
                                l0Var.o = true;
                                l0Var.f281741p = event.getEventTime();
                                l0Var.f281742q = x3;
                                l0Var.f281743r = y2;
                                up0.i0 i0Var = l0Var.f281736h;
                                if (i0Var != null) {
                                    up0.i0.a(i0Var, 4, Float.floatToRawIntBits(x3), Float.floatToRawIntBits(y2), null, 8);
                                }
                                l0Var.b();
                            } else if (actionMasked == 1) {
                                l0Var.c(event.getEventTime(), x3, y2, true);
                            } else if (actionMasked == 2) {
                                if (((float) Math.hypot((double) (x3 - l0Var.f281742q), (double) (y2 - l0Var.f281743r))) >= l0Var.f281744s) {
                                    l0Var.o = false;
                                }
                                if (l0Var.f281740n) {
                                    up0.i0 i0Var2 = l0Var.f281736h;
                                    if (i0Var2 != null) {
                                        up0.i0.a(i0Var2, 4, Float.floatToRawIntBits(x3), Float.floatToRawIntBits(y2), null, 8);
                                    }
                                    l0Var.b();
                                }
                            } else if (actionMasked == 3) {
                                l0Var.c(event.getEventTime(), x3, y2, false);
                            } else if (actionMasked == 5) {
                                l0Var.o = false;
                            }
                        } else {
                            l0Var.a();
                        }
                    }
                }
            }
        }
        if (this.f283809p) {
            return super.dispatchTouchEvent(event);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(ux0.l0 r20, ux0.l0 r21) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ux0.s0.e(ux0.l0, ux0.l0):void");
    }

    public final void f() {
        q5 orCreateNavBarBgProjection = getOrCreateNavBarBgProjection();
        if (orCreateNavBarBgProjection == null) {
            return;
        }
        AnimatedBackgroundView animatedBackgroundView = this.f283802c;
        if (animatedBackgroundView.getParent() == null || animatedBackgroundView.getVisibility() != 0) {
            orCreateNavBarBgProjection.setTopLayer(animatedBackgroundView, Integer.valueOf(this.d));
        }
    }

    public final ValueAnimator g(boolean z) {
        ValueAnimator valueAnimatorOfFloat;
        u5.a aVar;
        q5 orCreateNavBarBgProjection = getOrCreateNavBarBgProjection();
        if (orCreateNavBarBgProjection == null) {
            return null;
        }
        int i = this.d;
        Integer numValueOf = Integer.valueOf(i);
        u5 u5Var = (u5) orCreateNavBarBgProjection;
        AnimatedBackgroundView view = this.f283802c;
        Intrinsics.checkNotNullParameter(view, "view");
        u5.a aVar2 = new u5.a(view, numValueOf, 4);
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "ofFloat(...)");
            aVar = aVar2;
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "ofFloat(...)");
            aVar = null;
        }
        int iB = u5Var.b(i);
        valueAnimatorOfFloat.addListener(new v5(u5Var, aVar, aVar2, view, z ? BitmapDescriptorFactory.HUE_RED : 1.0f, numValueOf, iB));
        valueAnimatorOfFloat.addUpdateListener(new s5(view, u5Var, numValueOf, iB));
        return valueAnimatorOfFloat;
    }

    @NotNull
    public final AccountSelectionNavBarContentView getAccountsSelectionView() {
        return this.e;
    }

    @Override // up0.j0
    public View getParticlesBalanceCollapseView() {
        return this.e.k();
    }

    @Override // up0.j0
    @NotNull
    public View getParticlesInteractionView() {
        return this;
    }

    @Override // up0.j0
    @NotNull
    public ViewGroup getParticlesParent() {
        return this.e.getBackgroundView();
    }

    @Override // up0.j0
    public View getParticlesSceneView() {
        return this.e.h();
    }

    @NotNull
    public final t0 getProductIntroContentView() {
        return this.f283801b;
    }

    public final void i(l0 l0Var) {
        l0 l0Var2 = this.i;
        if (Intrinsics.f(l0Var2, l0Var)) {
            return;
        }
        if (this.f283805j) {
            this.k = l0Var;
            return;
        }
        this.i = l0Var;
        this.f283805j = true;
        try {
            e(l0Var2, l0Var);
            this.f283805j = false;
            l0 l0Var3 = this.k;
            if (l0Var3 != null) {
                this.k = null;
                i(l0Var3);
            }
        } catch (Throwable th10) {
            this.f283805j = false;
            throw th10;
        }
    }

    public final efm.r j() {
        efm.r rVarMerge = efm.r.merge(this.e.o, this.f283801b.f0());
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    public final efm.r k() {
        efm.r rVarMerge = efm.r.merge(this.e.f59169h, this.f283801b.h0().filter(new tc7.m0(28)).map(new tc7.m0(29)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    public final void l(final k0 k0Var) {
        ValueAnimator valueAnimatorG;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        final RecyclerView contentRecycler = getContentRecycler();
        final NavBarWithContainer parentNavBarWithContainer = getParentNavBarWithContainer();
        this.e.setHasTransientState(true);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.addListener(new az0.o0(this, k0Var, 13));
        final float alpha = contentRecycler != null ? contentRecycler.getAlpha() : BitmapDescriptorFactory.HUE_RED;
        final boolean zH = h(k0Var);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ux0.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                boolean z = k0Var.f283779n;
                s0 s0Var = this;
                if (z) {
                    s0Var.b(s0Var.e, fFloatValue, zH);
                } else {
                    s0Var.f283801b.setAlpha(fFloatValue);
                }
                float f = alpha * fFloatValue;
                View view = contentRecycler;
                if (view != null) {
                    view.setAlpha(f);
                }
                parentNavBarWithContainer.setBottomViewAlpha$ui_kit_components_release(f);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        ValueAnimator valueAnimator = null;
        if (!zH && (valueAnimatorG = g(k0Var.f283779n)) != null) {
            valueAnimatorG.setDuration(300L);
            valueAnimator = valueAnimatorG;
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.addListener(new n0(zH, this, k0Var));
        Animator[] elements = {valueAnimatorOfFloat, valueAnimator};
        Intrinsics.checkNotNullParameter(elements, "elements");
        animatorSet3.playTogether(kotlin.collections.d.L(elements));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final boolean z = k0Var.f283779n;
        final boolean zH2 = h(k0Var);
        Intrinsics.h(valueAnimatorOfFloat2);
        valueAnimatorOfFloat2.addListener(new o0(ref$ObjectRef, z, this, zH2, ref$ObjectRef, parentNavBarWithContainer));
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ux0.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) z9h.n.g(valueAnimator2, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                boolean z3 = z;
                s0 s0Var = this;
                View view = contentRecycler;
                NavBarWithContainer navBarWithContainer = parentNavBarWithContainer;
                if (!z3) {
                    if (view != null) {
                        view.setAlpha(fFloatValue);
                    }
                    navBarWithContainer.setBottomViewAlpha$ui_kit_components_release(fFloatValue);
                    s0Var.b(s0Var.e, fFloatValue, zH2);
                    return;
                }
                float f = 0.4f * fFloatValue;
                if (view != null) {
                    view.setAlpha(f);
                }
                navBarWithContainer.setBottomViewAlpha$ui_kit_components_release(f);
                s0Var.f283801b.setAlpha(fFloatValue);
            }
        });
        valueAnimatorOfFloat2.setDuration(300L);
        Animator[] elements2 = {animatorSet3, valueAnimatorOfFloat2};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        animatorSet2.playSequentially(kotlin.collections.d.L(elements2));
        animatorSet2.setInterpolator(jq0.r.f177392a);
        animatorSet2.start();
        this.f = animatorSet2;
    }

    public final void m() {
        p(this.f283801b);
        q5 orCreateNavBarBgProjection = getOrCreateNavBarBgProjection();
        if (orCreateNavBarBgProjection != null) {
            u5.c((u5) orCreateNavBarBgProjection, null, null, 1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View particlesInteractionView;
        super.onAttachedToWindow();
        up0.d0 d0Var = this.u;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(this, "host");
        s0 s0Var = d0Var.e;
        x1 x1Var = null;
        if (s0Var != this) {
            if (s0Var != null && (particlesInteractionView = s0Var.getParticlesInteractionView()) != null) {
                particlesInteractionView.removeCallbacks(d0Var.f281699q);
            }
            s0 s0Var2 = d0Var.e;
            if (s0Var2 != null) {
                s0Var2.setParticlesBalanceHidden(false);
            }
            ifm.c cVar = d0Var.f281696m;
            if (cVar != null) {
                cVar.dispose();
            }
            d0Var.f281696m = null;
            d0Var.f281697n = null;
            d0Var.e = this;
            d0Var.f281694j = false;
        }
        if (d0Var.f) {
            d0Var.f();
        }
        d0Var.h();
        s();
        Intrinsics.checkNotNullParameter(this, "<this>");
        View view = this;
        while (true) {
            x1 x1VarR = te0.w.R(view);
            if (x1VarR != null) {
                x1Var = x1VarR;
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
        }
        if (x1Var != null) {
            z callback = new z(this, x1Var);
            this.f283812s = callback;
            nji.j jVar = (nji.j) x1Var;
            Intrinsics.checkNotNullParameter(callback, "callback");
            ArrayList arrayList = jVar.f216536b;
            arrayList.add(callback);
            if (arrayList.size() == 1) {
                nhi.k.a(jVar);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        up0.d0 d0Var = this.u;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(this, "host");
        if (d0Var.e == this) {
            setParticlesBalanceHidden(false);
            ifm.c cVar = d0Var.f281696m;
            if (cVar != null) {
                cVar.dispose();
            }
            d0Var.f281696m = null;
            d0Var.f281697n = null;
            d0Var.d();
            d0Var.e = null;
            d0Var.f281694j = false;
        }
        super.onDetachedFromWindow();
        z callback = this.f283812s;
        if (callback != null) {
            nji.j jVar = (nji.j) callback.f283845a;
            Intrinsics.checkNotNullParameter(callback, "callback");
            ArrayList arrayList = jVar.f216536b;
            arrayList.remove(callback);
            if (arrayList.size() == 0) {
                nhi.k.b(jVar);
            }
        }
        this.f283812s = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        this.f283813t = 0L;
        super.onLayout(z, i, i2, i3, i5);
        if (this.f283813t == 0) {
            return;
        }
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                break;
            } else if (getChildAt(childCount) instanceof ViewStub) {
                removeViewAt(childCount);
            }
        }
        Lazy lazy = h1.f169241a;
        t70.x runnable = new t70.x(this, 18);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        h1.a().postAtFrontOfQueue(runnable);
        this.f283814w = false;
        int i6 = this.v;
        if (i6 != 0) {
            setBackgroundOffset(i6);
        }
    }

    public final void p(View view) {
        int iIndexOfChild;
        if (view.getParent() == null || (iIndexOfChild = indexOfChild(view)) < 0) {
            return;
        }
        removeViewAt(iIndexOfChild);
        if (isInLayout()) {
            addView(new ViewStub(getContext()), iIndexOfChild);
            this.f283813t++;
        }
    }

    public final void q(RecyclerView recyclerView, NavBarWithContainer navBarWithContainer, boolean z) {
        float alpha = recyclerView.getAlpha();
        float f = z ? 1.0f : 0.4f;
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new androidx.core.view.j(this, recyclerView, navBarWithContainer));
        valueAnimatorOfFloat.start();
        this.o = valueAnimatorOfFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // ur0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(aw0.v1 r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            java.lang.String r0 = "colorScheme"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            ux0.l0 r0 = r6.i
            boolean r1 = r0 instanceof ux0.k0
            r2 = 1
            if (r1 == 0) goto L1f
            r3 = r0
            ux0.k0 r3 = (ux0.k0) r3
            ux0.m0 r3 = r3.f283771a
            boolean r4 = r3 instanceof ux0.j0
            if (r4 == 0) goto L1f
            ux0.j0 r3 = (ux0.j0) r3
            ux0.e0 r0 = r3.f283769j
            boolean r0 = r0 instanceof ux0.d0
            r5 = r2
            r2 = r0
            r0 = r5
            goto L2c
        L1f:
            if (r1 == 0) goto L2b
            ux0.k0 r0 = (ux0.k0) r0
            ux0.m0 r0 = r0.f283771a
            boolean r0 = r0 instanceof ux0.h0
            if (r0 == 0) goto L2b
            r0 = 0
            goto L2c
        L2b:
            r0 = r2
        L2c:
            if (r2 == 0) goto L33
            com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView r1 = r6.e
            foh.i.e(r1, r7, r8, r9, r10)
        L33:
            if (r0 == 0) goto L3a
            ux0.t0 r0 = r6.f283801b
            foh.i.e(r0, r7, r8, r9, r10)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ux0.s0.r(aw0.v1, int, int, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020e A[PHI: r6
      0x020e: PHI (r6v24 int) = (r6v22 int), (r6v27 int) binds: [B:145:0x0234, B:137:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ux0.s0.s():void");
    }

    @Override // tx0.x2
    public void setBackgroundOffset(int i) {
        int i2;
        setClipChildren(i == 0);
        if (this.f283814w) {
            i2 = i - this.v;
        } else {
            this.f283814w = true;
            i2 = i;
        }
        this.v = i;
        this.f283802c.offsetTopAndBottom(i2);
        this.e.setBackgroundOffset(i);
    }

    @Override // tx0.x2
    public void setColorSchemeListener(@NotNull u2 listener) {
        vx0.a aVar;
        Intrinsics.checkNotNullParameter(listener, "listener");
        vx0.b bVar = this.f283810q;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        bVar.f292773c = listener;
        bVar.f292772b = null;
        View view = bVar.d;
        if (view == null || (aVar = (vx0.a) bVar.f292771a.get(view)) == null) {
            return;
        }
        bVar.a(aVar);
    }

    public void setCurrentPage(@NotNull String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        this.e.setCurrentPage(modelId);
    }

    public final void setHeightStrategy(@NotNull tx0.c heightStrategy) {
        Intrinsics.checkNotNullParameter(heightStrategy, "heightStrategy");
        this.f283815x = heightStrategy;
        c();
    }

    public abstract void setIntroViewed(@NotNull l6 l6Var);

    public final void setModel(@NotNull aw0.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        setModels$default(this, zhm.u.c(model), null, 2, null);
    }

    public final void setModels(@NotNull List<aw0.b> models, @NotNull tx0.q pagerIndicatorType) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(pagerIndicatorType, "pagerIndicatorType");
        List<aw0.b> list = models;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((aw0.b) it8.next()).f10240b);
        }
        this.e.setModels(arrayList, this.f283804h, pagerIndicatorType);
        if (Intrinsics.f(this.i.i(), models)) {
            return;
        }
        i(this.i.b(models, pagerIndicatorType));
    }

    public void setPageChangeTrackingEnabled(boolean z) {
        this.e.setPageChangeTrackingEnabled(z);
    }

    @Override // up0.j0
    public void setParticlesBalanceHidden(boolean z) {
        this.e.setSensitiveBalanceVisible$ui_kit_components_release(!z);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void setParticlesThemeEnabled(boolean z) {
        up0.d0 d0Var = this.u;
        if (d0Var.f != z) {
            d0Var.f = z;
            if (z) {
                d0Var.f();
                d0Var.h();
            } else {
                ifm.c cVar = d0Var.f281696m;
                if (cVar != null) {
                    cVar.dispose();
                }
                d0Var.f281696m = null;
                d0Var.f281697n = null;
                s0 s0Var = d0Var.e;
                if (s0Var != null) {
                    s0Var.setParticlesBalanceHidden(false);
                }
                if (d0Var.f281690b.isInitialized()) {
                    up0.l0 l0Var = (up0.l0) d0Var.e();
                    l0Var.f281737j = null;
                    up0.i0 i0Var = l0Var.f281736h;
                    if (i0Var != null) {
                        up0.i0.a(i0Var, 7, 0, 0, null, 14);
                    }
                    l0Var.b();
                }
                d0Var.d();
                d0Var.f281694j = false;
            }
        }
        s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0242  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, ux0.u0] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(ux0.j0 r21) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ux0.s0.t(ux0.j0):void");
    }
}
