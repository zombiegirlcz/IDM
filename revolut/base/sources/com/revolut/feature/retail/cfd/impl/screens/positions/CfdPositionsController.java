package com.revolut.feature.retail.cfd.impl.screens.positions;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fmc.z;
import fnc.s;
import g06.k;
import g4b.d;
import g4b.f;
import g4b.g;
import g4b.r;
import g4b.t;
import jii.v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lg4b/t;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdPositionsController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(CfdPositionsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinHorizontalButtonsBinding;", 0))};
    public final String K;
    public final String L;
    public final String M;
    public final boolean N;
    public final h O;
    public final CellDetailsActionDelegate P;
    public final LargeActionButtonDelegate Q;
    public final RowDelegate R;
    public final SwipeToActionDelegate S;
    public final z T;
    public final s U;
    public final int V;
    public final Object W;
    public final Object X;
    public final Object Y;

    public CfdPositionsController(String instrumentRef, String portfolioId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.K = instrumentRef;
        this.L = portfolioId;
        this.M = str;
        this.N = z;
        this.O = vc.s.t(this, g4b.c.f);
        this.P = new CellDetailsActionDelegate();
        this.Q = new LargeActionButtonDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        this.S = new SwipeToActionDelegate(rowDelegate, false);
        this.T = new z(this);
        this.U = new s(this);
        this.V = R$layout.screen_recycler_navbar_twin_horizontal_buttons;
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: g4b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdPositionsController f140434b;

            {
                this.f140434b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CfdPositionsController.Z;
                        CfdPositionsController cfdPositionsController = this.f140434b;
                        return tki.g.a(cfdPositionsController, cfdPositionsController.R2(), zhm.v.k(new CellDetailsLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), new FullScreenStateDelegate(), new HeaderDelegate(), new HeaderLoadingDelegate(), new ListSubheaderDelegate(), cfdPositionsController.P, cfdPositionsController.Q, cfdPositionsController.R, cfdPositionsController.S), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdPositionsController.Z;
                        CfdPositionsController cfdPositionsController2 = this.f140434b;
                        qji.b bVarU2 = cfdPositionsController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cfd.impl.screens.positions.di.CfdPositionsControllerComponent.Injector");
                        m2b.p pVar = (m2b.p) bVarU2;
                        m2b.v vVar = pVar.f201879b;
                        m2b.p pVar2 = pVar.f201880c;
                        n nVar = new n(cfdPositionsController2.K, cfdPositionsController2.L, cfdPositionsController2.M, cfdPositionsController2.N);
                        fmc.z zVar = cfdPositionsController2.T;
                        zVar.getClass();
                        fnc.s sVar = cfdPositionsController2.U;
                        sVar.getClass();
                        return new m2b.q(vVar, pVar2, cfdPositionsController2, nVar, zVar, sVar);
                    default:
                        KProperty[] kPropertyArr3 = CfdPositionsController.Z;
                        return (h) ((m2b.q) this.f140434b.X.getValue()).f201890l.get();
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: g4b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdPositionsController f140434b;

            {
                this.f140434b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfdPositionsController.Z;
                        CfdPositionsController cfdPositionsController = this.f140434b;
                        return tki.g.a(cfdPositionsController, cfdPositionsController.R2(), zhm.v.k(new CellDetailsLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), new FullScreenStateDelegate(), new HeaderDelegate(), new HeaderLoadingDelegate(), new ListSubheaderDelegate(), cfdPositionsController.P, cfdPositionsController.Q, cfdPositionsController.R, cfdPositionsController.S), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdPositionsController.Z;
                        CfdPositionsController cfdPositionsController2 = this.f140434b;
                        qji.b bVarU2 = cfdPositionsController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cfd.impl.screens.positions.di.CfdPositionsControllerComponent.Injector");
                        m2b.p pVar = (m2b.p) bVarU2;
                        m2b.v vVar = pVar.f201879b;
                        m2b.p pVar2 = pVar.f201880c;
                        n nVar = new n(cfdPositionsController2.K, cfdPositionsController2.L, cfdPositionsController2.M, cfdPositionsController2.N);
                        fmc.z zVar = cfdPositionsController2.T;
                        zVar.getClass();
                        fnc.s sVar = cfdPositionsController2.U;
                        sVar.getClass();
                        return new m2b.q(vVar, pVar2, cfdPositionsController2, nVar, zVar, sVar);
                    default:
                        KProperty[] kPropertyArr3 = CfdPositionsController.Z;
                        return (h) ((m2b.q) this.f140434b.X.getValue()).f201890l.get();
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: g4b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdPositionsController f140434b;

            {
                this.f140434b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CfdPositionsController.Z;
                        CfdPositionsController cfdPositionsController = this.f140434b;
                        return tki.g.a(cfdPositionsController, cfdPositionsController.R2(), zhm.v.k(new CellDetailsLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), new FullScreenStateDelegate(), new HeaderDelegate(), new HeaderLoadingDelegate(), new ListSubheaderDelegate(), cfdPositionsController.P, cfdPositionsController.Q, cfdPositionsController.R, cfdPositionsController.S), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdPositionsController.Z;
                        CfdPositionsController cfdPositionsController2 = this.f140434b;
                        qji.b bVarU2 = cfdPositionsController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cfd.impl.screens.positions.di.CfdPositionsControllerComponent.Injector");
                        m2b.p pVar = (m2b.p) bVarU2;
                        m2b.v vVar = pVar.f201879b;
                        m2b.p pVar2 = pVar.f201880c;
                        n nVar = new n(cfdPositionsController2.K, cfdPositionsController2.L, cfdPositionsController2.M, cfdPositionsController2.N);
                        fmc.z zVar = cfdPositionsController2.T;
                        zVar.getClass();
                        fnc.s sVar = cfdPositionsController2.U;
                        sVar.getClass();
                        return new m2b.q(vVar, pVar2, cfdPositionsController2, nVar, zVar, sVar);
                    default:
                        KProperty[] kPropertyArr3 = CfdPositionsController.Z;
                        return (h) ((m2b.q) this.f140434b.X.getValue()).f201890l.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        g4b.s sVar = uiState.f140461a;
        Clause clause = uiState.f140463c;
        Clause clause2 = uiState.f140462b;
        if (Intrinsics.f(sVar, r.f140460a)) {
            navBarWithToolbar.setLoadingVisible(true);
        } else if (sVar instanceof g4b.q) {
            navBarWithToolbar.setLoadingVisible(false);
            g4b.q qVar2 = (g4b.q) sVar;
            ?? r3 = qVar2.f140457a;
            navBarWithToolbar.setTitle(r3, null);
            navBarWithToolbar.setToolbarTitle(r3);
            navBarWithToolbar.setDescriptionText(qVar2.f140458b);
            navBarWithToolbar.setSecondDescriptionText(qVar2.f140459c);
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setEndImage(qVar2.d);
            navBarWithToolbar.setBottomTag(qVar2.e);
        } else if (sVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        d3().d.setPrimaryButtonText(clause2);
        d3().d.setPrimaryButtonVisible(clause2 != null);
        d3().d.setSecondaryButtonText(clause);
        d3().d.setSecondaryButtonEnabled(uiState.d);
        d3().d.setSecondaryButtonVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m2b.q) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((m2b.q) this.X.getValue()).f201888h.get()).d(u.c(new CellDetailsDelegate()));
        d3().f174567b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174567b.f59410q), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174567b.r0()), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174567b.A0()), new k(this, continuation, 13), 3);
        ViewController.P2(this, rd0.e.b(d3().d.c()), new d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().d.d()), new d(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.P.f51780c), new g4b.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new g(this, null), 3);
    }

    public final v d3() {
        ViewBinding value = this.O.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (v) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g4b.h d() {
        return (g4b.h) this.Y.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.W.getValue();
    }
}
