package com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.EligibilityCriteriaController;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.EligibilityCriteriaScreenContract$InputData;
import dli.a;
import guj.b;
import guj.c;
import guj.d;
import guj.f;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/screen/eligibility_criteria/EligibilityCriteriaController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lguj/f;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EligibilityCriteriaController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(EligibilityCriteriaController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final EligibilityCriteriaScreenContract$InputData K;
    public final h L;
    public final int M;
    public final ListCellBulletDelegate N;
    public final RowLoadingDelegate O;
    public final ListSubheaderDelegate P;
    public final FooterTextDelegate Q;
    public final CellDetailsLoadingDelegate R;
    public final FullScreenStateDelegate S;
    public final Object T;
    public final Object U;
    public final Object V;

    public EligibilityCriteriaController(EligibilityCriteriaScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar;
        this.N = new ListCellBulletDelegate();
        this.O = new RowLoadingDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new FooterTextDelegate();
        this.R = new CellDetailsLoadingDelegate();
        this.S = new FullScreenStateDelegate();
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: guj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EligibilityCriteriaController f146961b;

            {
                this.f146961b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EligibilityCriteriaController eligibilityCriteriaController = this.f146961b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EligibilityCriteriaController.W;
                        qji.b bVarU2 = eligibilityCriteriaController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.di.EligibilityCriteriaControllerInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        rtj.g gVar = hVar.f257290b;
                        rtj.h hVar2 = hVar.f257291c;
                        EligibilityCriteriaScreenContract$InputData eligibilityCriteriaScreenContract$InputData = eligibilityCriteriaController.K;
                        eligibilityCriteriaScreenContract$InputData.getClass();
                        return new rtj.b(gVar, hVar2, eligibilityCriteriaScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EligibilityCriteriaController.W;
                        EligibilityCriteriaController eligibilityCriteriaController2 = this.f146961b;
                        return dli.f.a(eligibilityCriteriaController2, (d) eligibilityCriteriaController2.V.getValue(), v.k(eligibilityCriteriaController2.N, eligibilityCriteriaController2.O, eligibilityCriteriaController2.P, eligibilityCriteriaController2.R, eligibilityCriteriaController2.S, eligibilityCriteriaController2.Q), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EligibilityCriteriaController.W;
                        return (d) ((rtj.b) eligibilityCriteriaController.T.getValue()).f257268b.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: guj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EligibilityCriteriaController f146961b;

            {
                this.f146961b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EligibilityCriteriaController eligibilityCriteriaController = this.f146961b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EligibilityCriteriaController.W;
                        qji.b bVarU2 = eligibilityCriteriaController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.di.EligibilityCriteriaControllerInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        rtj.g gVar = hVar.f257290b;
                        rtj.h hVar2 = hVar.f257291c;
                        EligibilityCriteriaScreenContract$InputData eligibilityCriteriaScreenContract$InputData = eligibilityCriteriaController.K;
                        eligibilityCriteriaScreenContract$InputData.getClass();
                        return new rtj.b(gVar, hVar2, eligibilityCriteriaScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EligibilityCriteriaController.W;
                        EligibilityCriteriaController eligibilityCriteriaController2 = this.f146961b;
                        return dli.f.a(eligibilityCriteriaController2, (d) eligibilityCriteriaController2.V.getValue(), v.k(eligibilityCriteriaController2.N, eligibilityCriteriaController2.O, eligibilityCriteriaController2.P, eligibilityCriteriaController2.R, eligibilityCriteriaController2.S, eligibilityCriteriaController2.Q), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EligibilityCriteriaController.W;
                        return (d) ((rtj.b) eligibilityCriteriaController.T.getValue()).f257268b.get();
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: guj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EligibilityCriteriaController f146961b;

            {
                this.f146961b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EligibilityCriteriaController eligibilityCriteriaController = this.f146961b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EligibilityCriteriaController.W;
                        qji.b bVarU2 = eligibilityCriteriaController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.di.EligibilityCriteriaControllerInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        rtj.g gVar = hVar.f257290b;
                        rtj.h hVar2 = hVar.f257291c;
                        EligibilityCriteriaScreenContract$InputData eligibilityCriteriaScreenContract$InputData = eligibilityCriteriaController.K;
                        eligibilityCriteriaScreenContract$InputData.getClass();
                        return new rtj.b(gVar, hVar2, eligibilityCriteriaScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EligibilityCriteriaController.W;
                        EligibilityCriteriaController eligibilityCriteriaController2 = this.f146961b;
                        return dli.f.a(eligibilityCriteriaController2, (d) eligibilityCriteriaController2.V.getValue(), v.k(eligibilityCriteriaController2.N, eligibilityCriteriaController2.O, eligibilityCriteriaController2.P, eligibilityCriteriaController2.R, eligibilityCriteriaController2.S, eligibilityCriteriaController2.Q), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = EligibilityCriteriaController.W;
                        return (d) ((rtj.b) eligibilityCriteriaController.T.getValue()).f257268b.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ?? r2 = uiState.f146967a;
        d3().f174539b.setLoadingVisible(false);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(r2, null);
        d3().f174539b.setToolbarTitle(r2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rtj.b) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new gqh.o(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.Q.e.f121375b), new gii.b(this, continuation, 28), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
