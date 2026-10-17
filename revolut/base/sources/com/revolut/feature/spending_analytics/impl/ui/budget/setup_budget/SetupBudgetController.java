package com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget;

import aii.q;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.impl.R$id;
import com.revolut.feature.spending_analytics.impl.R$layout;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.ui_kit_artboard.PlainLabelView;
import ht0.b0;
import hx0.k;
import ipd.d;
import ipd.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import pkm.e;
import ppd.s0;
import te0.w;
import vc.s;
import xmd.a0;
import xmd.d0;
import xmd.e0;
import xmd.f0;
import xmd.i;
import xmd.l;
import xmd.m;
import xmd.n;
import xmd.p;
import xmd.q0;
import xmd.t;
import xmd.u;
import xmd.x;
import xmd.y;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/budget/setup_budget/SetupBudgetController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxmd/x;", "Companion", "a", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SetupBudgetController extends ViewController<q> implements dli.a {
    public static final long Y;
    public static final long Z;
    public final SetupBudgetContract$InputData K;
    public final int L;
    public final h M;
    public final g N;
    public final Object O;
    public final CenteredAmountDelegate P;
    public final ContainerDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;
    public OneShotPreDrawListener T;
    public AnimatorSet U;
    public y V;
    public final Object W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(SetupBudgetController.class, "binding", "getBinding()Lcom/revolut/feature/spending_analytics/impl/databinding/ScreenSetupBudgetBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    static {
        b.Companion companion = b.INSTANCE;
        e eVar = e.MILLISECONDS;
        Y = c.g(300, eVar);
        Z = c.g(300, eVar);
    }

    public SetupBudgetController(SetupBudgetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_setup_budget;
        this.M = s.t(this, a0.f);
        this.N = new g();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: xmd.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetupBudgetController f307220b;

            {
                this.f307220b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SetupBudgetController setupBudgetController = this.f307220b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SetupBudgetController.X;
                        return (s0) ((ppd.s0) setupBudgetController.W.getValue()).f238545c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SetupBudgetController.X;
                        SetupBudgetController setupBudgetController2 = this.f307220b;
                        return dli.f.a(setupBudgetController2, setupBudgetController2.R2(), zhm.v.k(setupBudgetController2.Q, setupBudgetController2.R), R$id.setupBudget_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SetupBudgetController.X;
                        qji.b bVarU2 = setupBudgetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.di.SetupBudgetInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        SetupBudgetContract$InputData setupBudgetContract$InputData = setupBudgetController.K;
                        setupBudgetContract$InputData.getClass();
                        return new ppd.s0(nVar, oVar2, setupBudgetContract$InputData);
                }
            }
        });
        CenteredAmountDelegate centeredAmountDelegate = new CenteredAmountDelegate(null);
        this.P = centeredAmountDelegate;
        final int i2 = 2;
        final int i3 = 1;
        this.Q = new ContainerDelegate(v.k(centeredAmountDelegate, new CellDetailsDelegate()), null, 6);
        this.R = new FullScreenStateDelegate();
        this.S = w.y0(new Function0(this) { // from class: xmd.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetupBudgetController f307220b;

            {
                this.f307220b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SetupBudgetController setupBudgetController = this.f307220b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SetupBudgetController.X;
                        return (s0) ((ppd.s0) setupBudgetController.W.getValue()).f238545c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SetupBudgetController.X;
                        SetupBudgetController setupBudgetController2 = this.f307220b;
                        return dli.f.a(setupBudgetController2, setupBudgetController2.R2(), zhm.v.k(setupBudgetController2.Q, setupBudgetController2.R), R$id.setupBudget_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SetupBudgetController.X;
                        qji.b bVarU2 = setupBudgetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.di.SetupBudgetInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        SetupBudgetContract$InputData setupBudgetContract$InputData = setupBudgetController.K;
                        setupBudgetContract$InputData.getClass();
                        return new ppd.s0(nVar, oVar2, setupBudgetContract$InputData);
                }
            }
        });
        this.W = w.y0(new Function0(this) { // from class: xmd.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetupBudgetController f307220b;

            {
                this.f307220b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SetupBudgetController setupBudgetController = this.f307220b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SetupBudgetController.X;
                        return (s0) ((ppd.s0) setupBudgetController.W.getValue()).f238545c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SetupBudgetController.X;
                        SetupBudgetController setupBudgetController2 = this.f307220b;
                        return dli.f.a(setupBudgetController2, setupBudgetController2.R2(), zhm.v.k(setupBudgetController2.Q, setupBudgetController2.R), R$id.setupBudget_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = SetupBudgetController.X;
                        qji.b bVarU2 = setupBudgetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.di.SetupBudgetInjector");
                        ppd.o oVar = (ppd.o) bVarU2;
                        ppd.n nVar = oVar.f238516b;
                        ppd.o oVar2 = oVar.f238517c;
                        SetupBudgetContract$InputData setupBudgetContract$InputData = setupBudgetController.K;
                        setupBudgetContract$InputData.getClass();
                        return new ppd.s0(nVar, oVar2, setupBudgetContract$InputData);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return this.N.c();
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        x uiState = (x) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.N.d(D2(), new d(uiState.getBackground()));
        xmd.g gVarF = uiState.f();
        BasicNavBar basicNavBar = g3().f;
        basicNavBar.setTitle(gVarF.f307169a);
        basicNavBar.setSubtitle(gVarF.f307170b);
        e3();
        if (uiState instanceof xmd.w) {
            hmd.g gVarG3 = g3();
            AnimatedNumbersView setupBudgetAmount = gVarG3.f153691b;
            Intrinsics.checkNotNullExpressionValue(setupBudgetAmount, "setupBudgetAmount");
            setupBudgetAmount.setVisibility(0);
            PlainLabelView setupBudgetCalculationDescription = gVarG3.f153692c;
            Intrinsics.checkNotNullExpressionValue(setupBudgetCalculationDescription, "setupBudgetCalculationDescription");
            setupBudgetCalculationDescription.setVisibility(8);
            RecyclerView setupBudgetRecyclerView = gVarG3.f153693g;
            Intrinsics.checkNotNullExpressionValue(setupBudgetRecyclerView, "setupBudgetRecyclerView");
            setupBudgetRecyclerView.setVisibility(8);
            ActionFooterView setupBudgetFooter = gVarG3.e;
            Intrinsics.checkNotNullExpressionValue(setupBudgetFooter, "setupBudgetFooter");
            setupBudgetFooter.setVisibility(8);
            AnimatedNumbersView animatedNumbersView = g3().f153691b;
            animatedNumbersView.setAnimateSpin(false);
            animatedNumbersView.setCurrentClause(((xmd.w) uiState).f307215b);
            return;
        }
        int i = 4;
        if (!(uiState instanceof u)) {
            if (!(uiState instanceof t)) {
                if (!(uiState instanceof xmd.v)) {
                    throw new NoWhenBranchMatchedException();
                }
                hmd.g gVarG32 = g3();
                AnimatedNumbersView setupBudgetAmount2 = gVarG32.f153691b;
                Intrinsics.checkNotNullExpressionValue(setupBudgetAmount2, "setupBudgetAmount");
                setupBudgetAmount2.setVisibility(8);
                PlainLabelView setupBudgetCalculationDescription2 = gVarG32.f153692c;
                Intrinsics.checkNotNullExpressionValue(setupBudgetCalculationDescription2, "setupBudgetCalculationDescription");
                setupBudgetCalculationDescription2.setVisibility(8);
                RecyclerView setupBudgetRecyclerView2 = gVarG32.f153693g;
                Intrinsics.checkNotNullExpressionValue(setupBudgetRecyclerView2, "setupBudgetRecyclerView");
                setupBudgetRecyclerView2.setVisibility(0);
                ActionFooterView setupBudgetFooter2 = gVarG32.e;
                Intrinsics.checkNotNullExpressionValue(setupBudgetFooter2, "setupBudgetFooter");
                setupBudgetFooter2.setVisibility(8);
                return;
            }
            t tVar = (t) uiState;
            g3().e.setModel(tVar.d);
            if (tVar.f307202c == null) {
                i3();
                return;
            }
            hmd.g gVarG33 = g3();
            AnimatedNumbersView setupBudgetAmount3 = gVarG33.f153691b;
            Intrinsics.checkNotNullExpressionValue(setupBudgetAmount3, "setupBudgetAmount");
            setupBudgetAmount3.getLocationInWindow(new int[2]);
            float height = (setupBudgetAmount3.getHeight() / 2.0f) + r1[1];
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(b.f(Y));
            AnimatedNumbersView animatedNumbersView2 = gVarG33.f153691b;
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(animatedNumbersView2, (Property<AnimatedNumbersView, Float>) property, BitmapDescriptorFactory.HUE_RED), ObjectAnimator.ofFloat(gVarG33.f153692c, (Property<PlainLabelView, Float>) property, BitmapDescriptorFactory.HUE_RED));
            animatorSet.addListener(new k(this, height, i));
            animatorSet.start();
            this.U = animatorSet;
            return;
        }
        hmd.g gVarG34 = g3();
        AnimatedNumbersView setupBudgetAmount4 = gVarG34.f153691b;
        Intrinsics.checkNotNullExpressionValue(setupBudgetAmount4, "setupBudgetAmount");
        setupBudgetAmount4.setVisibility(0);
        PlainLabelView setupBudgetCalculationDescription3 = gVarG34.f153692c;
        Intrinsics.checkNotNullExpressionValue(setupBudgetCalculationDescription3, "setupBudgetCalculationDescription");
        setupBudgetCalculationDescription3.setVisibility(0);
        RecyclerView setupBudgetRecyclerView3 = gVarG34.f153693g;
        Intrinsics.checkNotNullExpressionValue(setupBudgetRecyclerView3, "setupBudgetRecyclerView");
        setupBudgetRecyclerView3.setVisibility(8);
        ActionFooterView setupBudgetFooter3 = gVarG34.e;
        Intrinsics.checkNotNullExpressionValue(setupBudgetFooter3, "setupBudgetFooter");
        setupBudgetFooter3.setVisibility(8);
        u uVar = (u) uiState;
        xmd.s sVar = uVar.d;
        if (sVar instanceof p) {
            long j2 = ((p) sVar).f307187a;
            y yVar = new y(this, 0);
            g3().d.postDelayed(yVar, b.f(j2));
            this.V = yVar;
        }
        AnimatedNumbersView animatedNumbersView3 = g3().f153691b;
        xmd.e eVar = uVar.f307204b;
        if (eVar instanceof xmd.d) {
            animatedNumbersView3.setAnimateSpin(false);
            animatedNumbersView3.setCurrentClause(((xmd.d) eVar).f307167a);
        } else {
            if (!(eVar instanceof xmd.c)) {
                throw new NoWhenBranchMatchedException();
            }
            animatedNumbersView3.setAnimateSpin(false);
            xmd.c cVar = (xmd.c) eVar;
            animatedNumbersView3.setCurrentClause(cVar.f307164a);
            animatedNumbersView3.setAnimateSpin(true);
            animatedNumbersView3.setCurrentClause(cVar.f307165b);
        }
        g3().f153692c.setModel(uVar.f307205c);
        if (sVar instanceof xmd.q) {
            PlainLabelView setupBudgetCalculationDescription4 = g3().f153692c;
            Intrinsics.checkNotNullExpressionValue(setupBudgetCalculationDescription4, "setupBudgetCalculationDescription");
            ViewPropertyAnimator viewPropertyAnimatorAnimate = setupBudgetCalculationDescription4.animate();
            viewPropertyAnimatorAnimate.cancel();
            ViewPropertyAnimator startAnimation = viewPropertyAnimatorAnimate.setDuration(b.f(Z));
            Intrinsics.checkNotNullExpressionValue(startAnimation, "setDuration(...)");
            Intrinsics.checkNotNullParameter(startAnimation, "$this$startAnimation");
            startAnimation.alpha(BitmapDescriptorFactory.HUE_RED);
            startAnimation.withEndAction(new vf.c(setupBudgetCalculationDescription4, 4, (xmd.q) sVar, this));
            Unit unit = Unit.f186387a;
            startAnimation.start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s0) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.N.a(view);
        hmd.g gVarG3 = g3();
        RecyclerView setupBudgetRecyclerView = gVarG3.f153693g;
        Intrinsics.checkNotNullExpressionValue(setupBudgetRecyclerView, "setupBudgetRecyclerView");
        yp0.y.g(setupBudgetRecyclerView, m2());
        BasicNavBar basicNavBar = gVarG3.f;
        basicNavBar.setExpanded(false);
        basicNavBar.setTitleCentered(true);
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        AnimatedNumbersView animatedNumbersView = gVarG3.f153691b;
        animatedNumbersView.setAnimateColour(false);
        animatedNumbersView.setOnBarrelAnimationEndListener(new b0(0, this, SetupBudgetController.class, "onAmountAnimationEnd", "onAmountAnimationEnd()V", 0, 24));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        d3();
        g3().f153691b.setOnBarrelAnimationEndListener(null);
        this.N.b();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        d3();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f.f59211b), null, new x0f.g(this, continuation, 28), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.d.f121375b), null, new xjl.g(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.f51970p.f121375b), null, new d0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.f51971q.f121375b), null, new e0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new f0(this, null), 3);
    }

    public final void d3() {
        e3();
        OneShotPreDrawListener oneShotPreDrawListener = this.T;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        this.T = null;
        AnimatorSet animatorSet = this.U;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.cancel();
        }
        this.U = null;
        hmd.g gVarG3 = g3();
        gVarG3.f153691b.setAlpha(1.0f);
        gVarG3.f153692c.setAlpha(1.0f);
        RecyclerView recyclerView = gVarG3.f153693g;
        Intrinsics.h(recyclerView);
        recyclerView.animate().cancel();
        recyclerView.setAlpha(1.0f);
        recyclerView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        ActionFooterView actionFooterView = gVarG3.e;
        Intrinsics.h(actionFooterView);
        actionFooterView.animate().cancel();
        actionFooterView.setAlpha(1.0f);
    }

    public final void e3() {
        y yVar = this.V;
        if (yVar != null) {
            ConstraintLayout setupBudgetContent = g3().d;
            Intrinsics.checkNotNullExpressionValue(setupBudgetContent, "setupBudgetContent");
            setupBudgetContent.removeCallbacks(yVar);
        }
        this.V = null;
    }

    public final void f3() {
        xmd.b bVarA;
        xmd.k kVar;
        m lVar;
        e3();
        xmd.s0 s0VarR2 = R2();
        xmd.o oVarI2 = s0VarR2.I2();
        if (oVarI2 == null) {
            return;
        }
        n nVar = oVarI2.f307186b;
        if (nVar instanceof i) {
            i iVar = (i) nVar;
            xmd.a aVar = iVar.f307175b;
            xmd.b bVar = iVar.f307174a;
            int i = q0.f307193a[aVar.ordinal()];
            if (i == 1) {
                kVar = new xmd.k(bVar, aVar, xmd.a.RECURRING_EXPENSES);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar = new l(bVar);
                    s0VarR2.L2(xmd.o.a(oVarI2, null, lVar, 1));
                    return;
                }
                kVar = new xmd.k(bVar, aVar, xmd.a.ROUNDED_AMOUNT);
            }
            lVar = kVar;
            s0VarR2.L2(xmd.o.a(oVarI2, null, lVar, 1));
            return;
        }
        if (!(nVar instanceof xmd.k)) {
            if (nVar instanceof l) {
                s0VarR2.L2(xmd.o.a(oVarI2, null, new xmd.h(((l) nVar).f307182a), 1));
                return;
            }
            return;
        }
        xmd.a aVar2 = ((xmd.k) nVar).f307180c;
        xmd.o oVarI22 = s0VarR2.I2();
        if (oVarI22 == null) {
            return;
        }
        n nVar2 = oVarI22.f307186b;
        m mVar = nVar2 instanceof m ? (m) nVar2 : null;
        if (mVar == null || (bVarA = mVar.a()) == null) {
            return;
        }
        dj0.d amount = bVarA.f307158a;
        int i2 = q0.f307193a[aVar2.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                amount = pyd.c.O(amount, bVarA.f307159b);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                amount = bVarA.f307160c;
            }
        }
        i phase = new i(bVarA, aVar2, oVarI22.f307185a);
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(phase, "phase");
        s0VarR2.L2(new xmd.o(amount, phase));
    }

    public final hmd.g g3() {
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hmd.g) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final xmd.s0 R2() {
        return (xmd.s0) this.O.getValue();
    }

    public final void i3() {
        hmd.g gVarG3 = g3();
        AnimatedNumbersView setupBudgetAmount = gVarG3.f153691b;
        Intrinsics.checkNotNullExpressionValue(setupBudgetAmount, "setupBudgetAmount");
        setupBudgetAmount.setVisibility(8);
        PlainLabelView setupBudgetCalculationDescription = gVarG3.f153692c;
        Intrinsics.checkNotNullExpressionValue(setupBudgetCalculationDescription, "setupBudgetCalculationDescription");
        setupBudgetCalculationDescription.setVisibility(8);
        RecyclerView setupBudgetRecyclerView = gVarG3.f153693g;
        Intrinsics.checkNotNullExpressionValue(setupBudgetRecyclerView, "setupBudgetRecyclerView");
        setupBudgetRecyclerView.setVisibility(0);
        ActionFooterView setupBudgetFooter = gVarG3.e;
        Intrinsics.checkNotNullExpressionValue(setupBudgetFooter, "setupBudgetFooter");
        setupBudgetFooter.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
