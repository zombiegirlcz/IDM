package com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsController;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import xya.d;
import xya.p;
import xya.r;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/referral_troubleshooter/all/AllReferralsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxya/p;", "Ldli/a;", "Lxya/r;", "Companion", "a", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AllReferralsController extends ViewController<p> implements dli.a {
    public final AllReferralsScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final CellDetailsChevronDelegate N;
    public final ListSubheaderDelegate O;
    public final ListSubheaderLoadingDelegate P;
    public final RowDelegate Q;
    public final RowLoadingDelegate R;
    public final SwipeToActionDelegate S;
    public final FullScreenStateDelegate T;
    public v U;
    public final Object V;
    public final Object W;
    public final h X;
    public final Object Y;
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(AllReferralsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public AllReferralsController(AllReferralsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = true;
        this.N = new CellDetailsChevronDelegate();
        this.O = new ListSubheaderDelegate();
        this.P = new ListSubheaderLoadingDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new RowLoadingDelegate();
        this.S = new SwipeToActionDelegate(rowDelegate, false);
        this.T = new FullScreenStateDelegate();
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: xya.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllReferralsController f309681b;

            {
                this.f309681b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AllReferralsController allReferralsController = this.f309681b;
                switch (i2) {
                    case 0:
                        AllReferralsController.Companion companion = AllReferralsController.INSTANCE;
                        AllReferralsController allReferralsController2 = this.f309681b;
                        return dli.f.a(allReferralsController2, allReferralsController2.R2(), zhm.v.k(allReferralsController2.N, allReferralsController2.O, allReferralsController2.P, allReferralsController2.Q, allReferralsController2.R, allReferralsController2.S, allReferralsController2.T), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AllReferralsController.Companion companion2 = AllReferralsController.INSTANCE;
                        qji.b bVarU2 = allReferralsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.di.AllReferralsScreenInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        AllReferralsScreenContract$InputData allReferralsScreenContract$InputData = allReferralsController.K;
                        allReferralsScreenContract$InputData.getClass();
                        return new eya.a(jVar, fVar2, allReferralsScreenContract$InputData);
                    default:
                        AllReferralsController.Companion companion3 = AllReferralsController.INSTANCE;
                        return (q) ((eya.a) allReferralsController.W.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: xya.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllReferralsController f309681b;

            {
                this.f309681b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AllReferralsController allReferralsController = this.f309681b;
                switch (i22) {
                    case 0:
                        AllReferralsController.Companion companion = AllReferralsController.INSTANCE;
                        AllReferralsController allReferralsController2 = this.f309681b;
                        return dli.f.a(allReferralsController2, allReferralsController2.R2(), zhm.v.k(allReferralsController2.N, allReferralsController2.O, allReferralsController2.P, allReferralsController2.Q, allReferralsController2.R, allReferralsController2.S, allReferralsController2.T), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AllReferralsController.Companion companion2 = AllReferralsController.INSTANCE;
                        qji.b bVarU2 = allReferralsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.di.AllReferralsScreenInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        AllReferralsScreenContract$InputData allReferralsScreenContract$InputData = allReferralsController.K;
                        allReferralsScreenContract$InputData.getClass();
                        return new eya.a(jVar, fVar2, allReferralsScreenContract$InputData);
                    default:
                        AllReferralsController.Companion companion3 = AllReferralsController.INSTANCE;
                        return (q) ((eya.a) allReferralsController.W.getValue()).e.get();
                }
            }
        });
        this.X = s.t(this, xya.b.f);
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: xya.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllReferralsController f309681b;

            {
                this.f309681b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AllReferralsController allReferralsController = this.f309681b;
                switch (i22) {
                    case 0:
                        AllReferralsController.Companion companion = AllReferralsController.INSTANCE;
                        AllReferralsController allReferralsController2 = this.f309681b;
                        return dli.f.a(allReferralsController2, allReferralsController2.R2(), zhm.v.k(allReferralsController2.N, allReferralsController2.O, allReferralsController2.P, allReferralsController2.Q, allReferralsController2.R, allReferralsController2.S, allReferralsController2.T), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AllReferralsController.Companion companion2 = AllReferralsController.INSTANCE;
                        qji.b bVarU2 = allReferralsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.di.AllReferralsScreenInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        AllReferralsScreenContract$InputData allReferralsScreenContract$InputData = allReferralsController.K;
                        allReferralsScreenContract$InputData.getClass();
                        return new eya.a(jVar, fVar2, allReferralsScreenContract$InputData);
                    default:
                        AllReferralsController.Companion companion3 = AllReferralsController.INSTANCE;
                        return (q) ((eya.a) allReferralsController.W.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f309693a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (eya.a) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        v vVar = this.U;
        if (vVar != null) {
            ((c) this.V.getValue()).h().removeOnScrollListener(vVar);
        }
        this.U = null;
    }

    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new xni.h(this, null, 17), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new xya.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51821c), new d(this, null), 3);
        if (((b) R2()).v) {
            this.U = y.a(((c) this.V.getValue()).h(), 5, false, new xw9.c(this, 13));
        }
        ViewController.P2(this, rd0.e.b(this.T.f52371h.f121375b), new xya.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.X.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final xya.q R2() {
        return (xya.q) this.Y.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
