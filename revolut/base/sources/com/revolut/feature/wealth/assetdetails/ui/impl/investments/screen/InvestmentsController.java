package com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsController;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o4h.b;
import o4h.d;
import o4h.g;
import o4h.i;
import o4h.j;
import o4h.k;
import te0.w;
import tki.c;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/assetdetails/ui/impl/investments/screen/InvestmentsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lo4h/k;", "feature_wealth_asset_details_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestmentsController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(InvestmentsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final InvestmentsControllerContract$InputData K;
    public final h L;
    public final CellDetailsDelegate M;
    public final Object N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final kgm.c R;

    public InvestmentsController(InvestmentsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new CellDetailsDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: o4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentsController f222271b;

            {
                this.f222271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestmentsController investmentsController = this.f222271b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvestmentsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(investmentsController.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        z3h.g gVar = ((z3h.g) aVar2.b()).f319291s;
                        InvestmentsControllerContract$InputData investmentsControllerContract$InputData = investmentsController.K;
                        n2h.e eVar = new n2h.e(investmentsControllerContract$InputData.f95413b, investmentsControllerContract$InputData.f95414c);
                        kgm.c cVar = investmentsController.R;
                        cVar.getClass();
                        return new z3h.e(gVar, investmentsControllerContract$InputData, cVar, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestmentsController.S;
                        int i3 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        InvestmentsController investmentsController2 = this.f222271b;
                        return tki.g.a(investmentsController2, (d) investmentsController2.Q.getValue(), v.k(investmentsController2.M, new CellDetailsLoadingDelegate()), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InvestmentsController.S;
                        return (d) ((z3h.e) ((p4h.a) investmentsController.N.getValue())).f319275h.get();
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar_action_footer;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: o4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentsController f222271b;

            {
                this.f222271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestmentsController investmentsController = this.f222271b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestmentsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(investmentsController.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        z3h.g gVar = ((z3h.g) aVar2.b()).f319291s;
                        InvestmentsControllerContract$InputData investmentsControllerContract$InputData = investmentsController.K;
                        n2h.e eVar = new n2h.e(investmentsControllerContract$InputData.f95413b, investmentsControllerContract$InputData.f95414c);
                        kgm.c cVar = investmentsController.R;
                        cVar.getClass();
                        return new z3h.e(gVar, investmentsControllerContract$InputData, cVar, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestmentsController.S;
                        int i3 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        InvestmentsController investmentsController2 = this.f222271b;
                        return tki.g.a(investmentsController2, (d) investmentsController2.Q.getValue(), v.k(investmentsController2.M, new CellDetailsLoadingDelegate()), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InvestmentsController.S;
                        return (d) ((z3h.e) ((p4h.a) investmentsController.N.getValue())).f319275h.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: o4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentsController f222271b;

            {
                this.f222271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvestmentsController investmentsController = this.f222271b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestmentsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(investmentsController.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        z3h.g gVar = ((z3h.g) aVar2.b()).f319291s;
                        InvestmentsControllerContract$InputData investmentsControllerContract$InputData = investmentsController.K;
                        n2h.e eVar = new n2h.e(investmentsControllerContract$InputData.f95413b, investmentsControllerContract$InputData.f95414c);
                        kgm.c cVar = investmentsController.R;
                        cVar.getClass();
                        return new z3h.e(gVar, investmentsControllerContract$InputData, cVar, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestmentsController.S;
                        int i32 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        InvestmentsController investmentsController2 = this.f222271b;
                        return tki.g.a(investmentsController2, (d) investmentsController2.Q.getValue(), v.k(investmentsController2.M, new CellDetailsLoadingDelegate()), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InvestmentsController.S;
                        return (d) ((z3h.e) ((p4h.a) investmentsController.N.getValue())).f319275h.get();
                }
            }
        });
        this.R = new kgm.c(this, 25);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        j jVar = uiState.f222281a;
        if (jVar != null) {
            NavBarWithToolbar navBarWithToolbar = d3().f174534c;
            if (jVar instanceof g) {
                navBarWithToolbar.l0();
                g gVar = (g) jVar;
                ?? r3 = gVar.f222277b;
                ?? r2 = gVar.f222276a;
                NavBarWithToolbar.setToolbar$default(navBarWithToolbar, r2, r3, null, 4, null);
                navBarWithToolbar.setTitle(r2, null);
                navBarWithToolbar.setDescriptionText(r3);
                navBarWithToolbar.setEndImage(gVar.f222278c);
            } else if (jVar instanceof o4h.h) {
                navBarWithToolbar.l0();
            } else {
                if (!(jVar instanceof i)) {
                    throw new NoWhenBranchMatchedException();
                }
                t3 t3Var = t3.DEFAULT;
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                navBarWithToolbar.I0(t3Var, false);
            }
        }
        aw0.i iVar = uiState.f222282b;
        if (iVar != null) {
            d3().f174533b.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p4h.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.setDescriptionVisible(true);
        screenRecyclerNavbarActionFooterNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new nuh.j(this, null, 17), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new o4h.c(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
