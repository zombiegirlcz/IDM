package com.revolut.feature.commodities.onboarding.impl.ui_kompot.risks;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.d;
import aw0.e;
import aw0.n6;
import chc.c0;
import ck3.c;
import ck3.i;
import ck3.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.commodities.onboarding.impl.ui_kompot.risks.CommoditiesOnboardingRisksController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import tw0.w;
import vc.s;
import xf6.f3;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/commodities/onboarding/impl/ui_kompot/risks/CommoditiesOnboardingRisksController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lck3/i;", "<init>", "()V", "Companion", "a", "feature_commodities_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommoditiesOnboardingRisksController extends ViewController<q> implements a {
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object Q;
    public final Object S;
    public w U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CommoditiesOnboardingRisksController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final h K = s.t(this, b.f);
    public final int P = R$layout.screen_recycler_navbar_twin_vertical_buttons;
    public final Object R = te0.w.y0(new c0(9));
    public final AtomicBoolean T = new AtomicBoolean(true);

    /* JADX INFO: renamed from: com.revolut.feature.commodities.onboarding.impl.ui_kompot.risks.CommoditiesOnboardingRisksController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, jii.w.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.w.a(p0);
        }
    }

    public CommoditiesOnboardingRisksController() {
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: ck3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommoditiesOnboardingRisksController f24756b;

            {
                this.f24756b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CommoditiesOnboardingRisksController commoditiesOnboardingRisksController = this.f24756b;
                switch (i2) {
                    case 0:
                        CommoditiesOnboardingRisksController.Companion companion = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174570b;
                    case 1:
                        CommoditiesOnboardingRisksController.Companion companion2 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174571c;
                    case 2:
                        CommoditiesOnboardingRisksController.Companion companion3 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().d;
                    case 3:
                        CommoditiesOnboardingRisksController.Companion companion4 = CommoditiesOnboardingRisksController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(commoditiesOnboardingRisksController.m2()).a().get(yj3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yj3.a.class, " is not found"));
                        }
                        yj3.a aVar3 = ((yj3.a) aVar2.b()).k;
                        yj3.b bVar = new yj3.b();
                        bVar.f314406a = e4m.b.b(new f3(aVar3, bVar));
                        return bVar;
                    case 4:
                        CommoditiesOnboardingRisksController.Companion companion5 = CommoditiesOnboardingRisksController.INSTANCE;
                        return (n) ((yj3.b) commoditiesOnboardingRisksController.O.getValue()).f314406a.get();
                    default:
                        CommoditiesOnboardingRisksController.Companion companion6 = CommoditiesOnboardingRisksController.INSTANCE;
                        CommoditiesOnboardingRisksController commoditiesOnboardingRisksController2 = this.f24756b;
                        return dli.f.a(commoditiesOnboardingRisksController2, (n) commoditiesOnboardingRisksController2.Q.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (ListCellBulletDelegate) commoditiesOnboardingRisksController2.R.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: ck3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommoditiesOnboardingRisksController f24756b;

            {
                this.f24756b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CommoditiesOnboardingRisksController commoditiesOnboardingRisksController = this.f24756b;
                switch (i22) {
                    case 0:
                        CommoditiesOnboardingRisksController.Companion companion = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174570b;
                    case 1:
                        CommoditiesOnboardingRisksController.Companion companion2 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174571c;
                    case 2:
                        CommoditiesOnboardingRisksController.Companion companion3 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().d;
                    case 3:
                        CommoditiesOnboardingRisksController.Companion companion4 = CommoditiesOnboardingRisksController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(commoditiesOnboardingRisksController.m2()).a().get(yj3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yj3.a.class, " is not found"));
                        }
                        yj3.a aVar3 = ((yj3.a) aVar2.b()).k;
                        yj3.b bVar = new yj3.b();
                        bVar.f314406a = e4m.b.b(new f3(aVar3, bVar));
                        return bVar;
                    case 4:
                        CommoditiesOnboardingRisksController.Companion companion5 = CommoditiesOnboardingRisksController.INSTANCE;
                        return (n) ((yj3.b) commoditiesOnboardingRisksController.O.getValue()).f314406a.get();
                    default:
                        CommoditiesOnboardingRisksController.Companion companion6 = CommoditiesOnboardingRisksController.INSTANCE;
                        CommoditiesOnboardingRisksController commoditiesOnboardingRisksController2 = this.f24756b;
                        return dli.f.a(commoditiesOnboardingRisksController2, (n) commoditiesOnboardingRisksController2.Q.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (ListCellBulletDelegate) commoditiesOnboardingRisksController2.R.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.N = te0.w.y0(new Function0(this) { // from class: ck3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommoditiesOnboardingRisksController f24756b;

            {
                this.f24756b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CommoditiesOnboardingRisksController commoditiesOnboardingRisksController = this.f24756b;
                switch (i22) {
                    case 0:
                        CommoditiesOnboardingRisksController.Companion companion = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174570b;
                    case 1:
                        CommoditiesOnboardingRisksController.Companion companion2 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174571c;
                    case 2:
                        CommoditiesOnboardingRisksController.Companion companion3 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().d;
                    case 3:
                        CommoditiesOnboardingRisksController.Companion companion4 = CommoditiesOnboardingRisksController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(commoditiesOnboardingRisksController.m2()).a().get(yj3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yj3.a.class, " is not found"));
                        }
                        yj3.a aVar3 = ((yj3.a) aVar2.b()).k;
                        yj3.b bVar = new yj3.b();
                        bVar.f314406a = e4m.b.b(new f3(aVar3, bVar));
                        return bVar;
                    case 4:
                        CommoditiesOnboardingRisksController.Companion companion5 = CommoditiesOnboardingRisksController.INSTANCE;
                        return (n) ((yj3.b) commoditiesOnboardingRisksController.O.getValue()).f314406a.get();
                    default:
                        CommoditiesOnboardingRisksController.Companion companion6 = CommoditiesOnboardingRisksController.INSTANCE;
                        CommoditiesOnboardingRisksController commoditiesOnboardingRisksController2 = this.f24756b;
                        return dli.f.a(commoditiesOnboardingRisksController2, (n) commoditiesOnboardingRisksController2.Q.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (ListCellBulletDelegate) commoditiesOnboardingRisksController2.R.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.O = te0.w.y0(new Function0(this) { // from class: ck3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommoditiesOnboardingRisksController f24756b;

            {
                this.f24756b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CommoditiesOnboardingRisksController commoditiesOnboardingRisksController = this.f24756b;
                switch (i22) {
                    case 0:
                        CommoditiesOnboardingRisksController.Companion companion = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174570b;
                    case 1:
                        CommoditiesOnboardingRisksController.Companion companion2 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174571c;
                    case 2:
                        CommoditiesOnboardingRisksController.Companion companion3 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().d;
                    case 3:
                        CommoditiesOnboardingRisksController.Companion companion4 = CommoditiesOnboardingRisksController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(commoditiesOnboardingRisksController.m2()).a().get(yj3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yj3.a.class, " is not found"));
                        }
                        yj3.a aVar3 = ((yj3.a) aVar2.b()).k;
                        yj3.b bVar = new yj3.b();
                        bVar.f314406a = e4m.b.b(new f3(aVar3, bVar));
                        return bVar;
                    case 4:
                        CommoditiesOnboardingRisksController.Companion companion5 = CommoditiesOnboardingRisksController.INSTANCE;
                        return (n) ((yj3.b) commoditiesOnboardingRisksController.O.getValue()).f314406a.get();
                    default:
                        CommoditiesOnboardingRisksController.Companion companion6 = CommoditiesOnboardingRisksController.INSTANCE;
                        CommoditiesOnboardingRisksController commoditiesOnboardingRisksController2 = this.f24756b;
                        return dli.f.a(commoditiesOnboardingRisksController2, (n) commoditiesOnboardingRisksController2.Q.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (ListCellBulletDelegate) commoditiesOnboardingRisksController2.R.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.Q = te0.w.y0(new Function0(this) { // from class: ck3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommoditiesOnboardingRisksController f24756b;

            {
                this.f24756b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CommoditiesOnboardingRisksController commoditiesOnboardingRisksController = this.f24756b;
                switch (i22) {
                    case 0:
                        CommoditiesOnboardingRisksController.Companion companion = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174570b;
                    case 1:
                        CommoditiesOnboardingRisksController.Companion companion2 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174571c;
                    case 2:
                        CommoditiesOnboardingRisksController.Companion companion3 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().d;
                    case 3:
                        CommoditiesOnboardingRisksController.Companion companion4 = CommoditiesOnboardingRisksController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(commoditiesOnboardingRisksController.m2()).a().get(yj3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yj3.a.class, " is not found"));
                        }
                        yj3.a aVar3 = ((yj3.a) aVar2.b()).k;
                        yj3.b bVar = new yj3.b();
                        bVar.f314406a = e4m.b.b(new f3(aVar3, bVar));
                        return bVar;
                    case 4:
                        CommoditiesOnboardingRisksController.Companion companion5 = CommoditiesOnboardingRisksController.INSTANCE;
                        return (n) ((yj3.b) commoditiesOnboardingRisksController.O.getValue()).f314406a.get();
                    default:
                        CommoditiesOnboardingRisksController.Companion companion6 = CommoditiesOnboardingRisksController.INSTANCE;
                        CommoditiesOnboardingRisksController commoditiesOnboardingRisksController2 = this.f24756b;
                        return dli.f.a(commoditiesOnboardingRisksController2, (n) commoditiesOnboardingRisksController2.Q.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (ListCellBulletDelegate) commoditiesOnboardingRisksController2.R.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i21 = 5;
        this.S = te0.w.y0(new Function0(this) { // from class: ck3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommoditiesOnboardingRisksController f24756b;

            {
                this.f24756b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CommoditiesOnboardingRisksController commoditiesOnboardingRisksController = this.f24756b;
                switch (i22) {
                    case 0:
                        CommoditiesOnboardingRisksController.Companion companion = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174570b;
                    case 1:
                        CommoditiesOnboardingRisksController.Companion companion2 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().f174571c;
                    case 2:
                        CommoditiesOnboardingRisksController.Companion companion3 = CommoditiesOnboardingRisksController.INSTANCE;
                        return commoditiesOnboardingRisksController.d3().d;
                    case 3:
                        CommoditiesOnboardingRisksController.Companion companion4 = CommoditiesOnboardingRisksController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(commoditiesOnboardingRisksController.m2()).a().get(yj3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yj3.a.class, " is not found"));
                        }
                        yj3.a aVar3 = ((yj3.a) aVar2.b()).k;
                        yj3.b bVar = new yj3.b();
                        bVar.f314406a = e4m.b.b(new f3(aVar3, bVar));
                        return bVar;
                    case 4:
                        CommoditiesOnboardingRisksController.Companion companion5 = CommoditiesOnboardingRisksController.INSTANCE;
                        return (n) ((yj3.b) commoditiesOnboardingRisksController.O.getValue()).f314406a.get();
                    default:
                        CommoditiesOnboardingRisksController.Companion companion6 = CommoditiesOnboardingRisksController.INSTANCE;
                        CommoditiesOnboardingRisksController commoditiesOnboardingRisksController2 = this.f24756b;
                        return dli.f.a(commoditiesOnboardingRisksController2, (n) commoditiesOnboardingRisksController2.Q.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (ListCellBulletDelegate) commoditiesOnboardingRisksController2.R.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.L.getValue();
        TextLocalisedClause textLocalisedClause = uiState.f24762b;
        e eVar = uiState.d;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f24763c;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        TwinVerticalButton twinVerticalButtonF3 = f3();
        n6 n6Var = eVar.d;
        twinVerticalButtonF3.setMainButtonLoadingTag(n6Var.f);
        twinVerticalButtonF3.setMainButtonText(n6Var.f10433a);
        twinVerticalButtonF3.setMainButtonStyle(n6Var.f10434b);
        twinVerticalButtonF3.setMainButtonEnabled(n6Var.f10436g);
        d dVar = eVar.e;
        if (dVar != null) {
            twinVerticalButtonF3.setFabImage(dVar.f10272a);
        }
        e3().post(new a0.a(this, 9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (yj3.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (n) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((NavBarWithToolbar) this.L.getValue()).setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TwinVerticalButton twinVerticalButtonF3 = f3();
        twinVerticalButtonF3.setMainButtonVisible(false);
        twinVerticalButtonF3.setSecondaryButtonVisible(false);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        w wVar = this.U;
        if (wVar != null) {
            e3().removeOnScrollListener(wVar);
        }
        this.U = y.b(e3(), new ce9.a(this, 15));
        ViewController.P2(this, rd0.e.b(f3().m0()), new ck3.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(f3().o0()), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((ListCellBulletDelegate) this.R.getValue()).f52691c), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) this.L.getValue()).f59410q), new c(this, null, 2), 3);
    }

    public final jii.w d3() {
        ViewBinding value = this.K.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.w) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ScreenContentRecyclerView e3() {
        return (ScreenContentRecyclerView) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final TwinVerticalButton f3() {
        return (TwinVerticalButton) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
