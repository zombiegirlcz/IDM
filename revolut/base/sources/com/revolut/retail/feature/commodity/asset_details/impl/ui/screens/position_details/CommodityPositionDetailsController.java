package com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsController;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsControllerContract$InputData;
import i6j.b;
import i6j.d;
import i6j.i;
import i6j.j;
import i6j.k;
import i6j.l;
import i6j.m;
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
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/commodity/asset_details/impl/ui/screens/position_details/CommodityPositionDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Li6j/m;", "Ld5h/a;", "feature_commodity_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommodityPositionDetailsController extends ViewController<q> implements c, d5h.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CommodityPositionDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final CommodityPositionDetailsControllerContract$InputData K;
    public final h L;
    public final CellDetailsDelegate M;
    public final CellDetailsChevronDelegate N;
    public final Object O;
    public final int P;
    public final Object Q;
    public final Object R;

    public CommodityPositionDetailsController(CommodityPositionDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new CellDetailsDelegate();
        this.N = new CellDetailsChevronDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: i6j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityPositionDetailsController f159017b;

            {
                this.f159017b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CommodityPositionDetailsController commodityPositionDetailsController = this.f159017b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityPositionDetailsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(commodityPositionDetailsController.m2()).a().get(w5j.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5j.b.class, " is not found"));
                        }
                        w5j.b bVar = ((w5j.b) aVar2.b()).I;
                        CommodityPositionDetailsControllerContract$InputData commodityPositionDetailsControllerContract$InputData = commodityPositionDetailsController.K;
                        commodityPositionDetailsControllerContract$InputData.getClass();
                        return new w5j.e(bVar, commodityPositionDetailsController, commodityPositionDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityPositionDetailsController.S;
                        int i3 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        CommodityPositionDetailsController commodityPositionDetailsController2 = this.f159017b;
                        return tki.g.a(commodityPositionDetailsController2, commodityPositionDetailsController2.R2(), v.k(commodityPositionDetailsController2.M, commodityPositionDetailsController2.N, new CellDetailsLoadingDelegate()), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CommodityPositionDetailsController.S;
                        return (e) ((w5j.e) commodityPositionDetailsController.O.getValue()).i.get();
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_action_footer;
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: i6j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityPositionDetailsController f159017b;

            {
                this.f159017b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CommodityPositionDetailsController commodityPositionDetailsController = this.f159017b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityPositionDetailsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(commodityPositionDetailsController.m2()).a().get(w5j.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5j.b.class, " is not found"));
                        }
                        w5j.b bVar = ((w5j.b) aVar2.b()).I;
                        CommodityPositionDetailsControllerContract$InputData commodityPositionDetailsControllerContract$InputData = commodityPositionDetailsController.K;
                        commodityPositionDetailsControllerContract$InputData.getClass();
                        return new w5j.e(bVar, commodityPositionDetailsController, commodityPositionDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityPositionDetailsController.S;
                        int i3 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        CommodityPositionDetailsController commodityPositionDetailsController2 = this.f159017b;
                        return tki.g.a(commodityPositionDetailsController2, commodityPositionDetailsController2.R2(), v.k(commodityPositionDetailsController2.M, commodityPositionDetailsController2.N, new CellDetailsLoadingDelegate()), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CommodityPositionDetailsController.S;
                        return (e) ((w5j.e) commodityPositionDetailsController.O.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: i6j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityPositionDetailsController f159017b;

            {
                this.f159017b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CommodityPositionDetailsController commodityPositionDetailsController = this.f159017b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityPositionDetailsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(commodityPositionDetailsController.m2()).a().get(w5j.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5j.b.class, " is not found"));
                        }
                        w5j.b bVar = ((w5j.b) aVar2.b()).I;
                        CommodityPositionDetailsControllerContract$InputData commodityPositionDetailsControllerContract$InputData = commodityPositionDetailsController.K;
                        commodityPositionDetailsControllerContract$InputData.getClass();
                        return new w5j.e(bVar, commodityPositionDetailsController, commodityPositionDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityPositionDetailsController.S;
                        int i32 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        CommodityPositionDetailsController commodityPositionDetailsController2 = this.f159017b;
                        return tki.g.a(commodityPositionDetailsController2, commodityPositionDetailsController2.R2(), v.k(commodityPositionDetailsController2.M, commodityPositionDetailsController2.N, new CellDetailsLoadingDelegate()), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CommodityPositionDetailsController.S;
                        return (e) ((w5j.e) commodityPositionDetailsController.O.getValue()).i.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        l lVar = uiState.f159028a;
        if (lVar != null) {
            NavBarWithToolbar navBarWithToolbar = d3().f174534c;
            if (lVar instanceof i) {
                navBarWithToolbar.l0();
                i iVar = (i) lVar;
                TextLocalisedClause textLocalisedClause = iVar.f159024b;
                ?? r2 = iVar.f159023a;
                NavBarWithToolbar.setToolbar$default(navBarWithToolbar, r2, textLocalisedClause, null, 4, null);
                navBarWithToolbar.setTitle(r2, null);
                navBarWithToolbar.setDescriptionText(textLocalisedClause);
                navBarWithToolbar.setEndImage(iVar.f159025c);
            } else if (lVar instanceof j) {
                navBarWithToolbar.l0();
            } else {
                if (!(lVar instanceof k)) {
                    throw new NoWhenBranchMatchedException();
                }
                t3 t3Var = t3.DEFAULT;
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                navBarWithToolbar.I0(t3Var, false);
            }
        }
        aw0.i iVar2 = uiState.f159029b;
        if (iVar2 != null) {
            d3().f174533b.setModel(iVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w5j.e) this.O.getValue();
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
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new i6j.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new i6j.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f58955g), new i6j.c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new d(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i6j.e d() {
        return (i6j.e) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
