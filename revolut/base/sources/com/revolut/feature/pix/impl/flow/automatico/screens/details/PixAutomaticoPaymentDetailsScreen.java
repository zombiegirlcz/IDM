package com.revolut.feature.pix.impl.flow.automatico.screens.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsInputDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreen;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.d0;
import te0.w;
import u9a.b;
import u9a.c;
import u9a.d;
import u9a.f;
import u9a.g;
import u9a.i;
import u9a.j;
import u9a.k;
import u9a.l;
import u9a.n;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/automatico/screens/details/PixAutomaticoPaymentDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lu9a/o;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAutomaticoPaymentDetailsScreen extends ViewController<Object> implements dli.a, d1 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f80610a0 = {o0.f186429a.j(new h0(PixAutomaticoPaymentDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PixAutomaticoPaymentDetailsScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public PixAutomaticoPaymentDetailsScreen(PixAutomaticoPaymentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: u9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAutomaticoPaymentDetailsScreen f278430b;

            {
                this.f278430b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixAutomaticoPaymentDetailsScreen pixAutomaticoPaymentDetailsScreen = this.f278430b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixAutomaticoPaymentDetailsScreen.f80610a0;
                        return (n) ((p8a.w) pixAutomaticoPaymentDetailsScreen.O.getValue()).f234112h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                        PixAutomaticoPaymentDetailsScreen pixAutomaticoPaymentDetailsScreen2 = this.f278430b;
                        return dli.f.a(pixAutomaticoPaymentDetailsScreen2, pixAutomaticoPaymentDetailsScreen2.d(), zhm.v.k((ActionsLoadingDelegate) pixAutomaticoPaymentDetailsScreen2.Q.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) pixAutomaticoPaymentDetailsScreen2.R.getValue(), (RowDelegate) pixAutomaticoPaymentDetailsScreen2.S.getValue(), (CellDetailsChevronDelegate) pixAutomaticoPaymentDetailsScreen2.W.getValue(), (CellDetailsDelegate) pixAutomaticoPaymentDetailsScreen2.T.getValue(), (CellDetailsInputDelegate) pixAutomaticoPaymentDetailsScreen2.U.getValue(), (CellDetailsActionDelegate) pixAutomaticoPaymentDetailsScreen2.V.getValue(), (CellDetailsNoteDelegate) pixAutomaticoPaymentDetailsScreen2.X.getValue(), (CellDetailsSwitcherDelegate) pixAutomaticoPaymentDetailsScreen2.Y.getValue(), (LargeActionButtonDelegate) pixAutomaticoPaymentDetailsScreen2.Z.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                        qji.b bVarU2 = pixAutomaticoPaymentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.automatico.screens.details.di.PixAutomaticoPaymentDetailsScreenInjector");
                        p8a.u uVar = (p8a.u) bVarU2;
                        d0 d0Var = uVar.f234094b;
                        p8a.u uVar2 = uVar.f234095c;
                        PixAutomaticoPaymentDetailsScreenContract$InputData pixAutomaticoPaymentDetailsScreenContract$InputData = pixAutomaticoPaymentDetailsScreen.K;
                        pixAutomaticoPaymentDetailsScreenContract$InputData.getClass();
                        return new p8a.w(d0Var, uVar2, pixAutomaticoPaymentDetailsScreen, pixAutomaticoPaymentDetailsScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: u9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAutomaticoPaymentDetailsScreen f278430b;

            {
                this.f278430b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixAutomaticoPaymentDetailsScreen pixAutomaticoPaymentDetailsScreen = this.f278430b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAutomaticoPaymentDetailsScreen.f80610a0;
                        return (n) ((p8a.w) pixAutomaticoPaymentDetailsScreen.O.getValue()).f234112h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                        PixAutomaticoPaymentDetailsScreen pixAutomaticoPaymentDetailsScreen2 = this.f278430b;
                        return dli.f.a(pixAutomaticoPaymentDetailsScreen2, pixAutomaticoPaymentDetailsScreen2.d(), zhm.v.k((ActionsLoadingDelegate) pixAutomaticoPaymentDetailsScreen2.Q.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) pixAutomaticoPaymentDetailsScreen2.R.getValue(), (RowDelegate) pixAutomaticoPaymentDetailsScreen2.S.getValue(), (CellDetailsChevronDelegate) pixAutomaticoPaymentDetailsScreen2.W.getValue(), (CellDetailsDelegate) pixAutomaticoPaymentDetailsScreen2.T.getValue(), (CellDetailsInputDelegate) pixAutomaticoPaymentDetailsScreen2.U.getValue(), (CellDetailsActionDelegate) pixAutomaticoPaymentDetailsScreen2.V.getValue(), (CellDetailsNoteDelegate) pixAutomaticoPaymentDetailsScreen2.X.getValue(), (CellDetailsSwitcherDelegate) pixAutomaticoPaymentDetailsScreen2.Y.getValue(), (LargeActionButtonDelegate) pixAutomaticoPaymentDetailsScreen2.Z.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                        qji.b bVarU2 = pixAutomaticoPaymentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.automatico.screens.details.di.PixAutomaticoPaymentDetailsScreenInjector");
                        p8a.u uVar = (p8a.u) bVarU2;
                        d0 d0Var = uVar.f234094b;
                        p8a.u uVar2 = uVar.f234095c;
                        PixAutomaticoPaymentDetailsScreenContract$InputData pixAutomaticoPaymentDetailsScreenContract$InputData = pixAutomaticoPaymentDetailsScreen.K;
                        pixAutomaticoPaymentDetailsScreenContract$InputData.getClass();
                        return new p8a.w(d0Var, uVar2, pixAutomaticoPaymentDetailsScreen, pixAutomaticoPaymentDetailsScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: u9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAutomaticoPaymentDetailsScreen f278430b;

            {
                this.f278430b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixAutomaticoPaymentDetailsScreen pixAutomaticoPaymentDetailsScreen = this.f278430b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAutomaticoPaymentDetailsScreen.f80610a0;
                        return (n) ((p8a.w) pixAutomaticoPaymentDetailsScreen.O.getValue()).f234112h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                        PixAutomaticoPaymentDetailsScreen pixAutomaticoPaymentDetailsScreen2 = this.f278430b;
                        return dli.f.a(pixAutomaticoPaymentDetailsScreen2, pixAutomaticoPaymentDetailsScreen2.d(), zhm.v.k((ActionsLoadingDelegate) pixAutomaticoPaymentDetailsScreen2.Q.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) pixAutomaticoPaymentDetailsScreen2.R.getValue(), (RowDelegate) pixAutomaticoPaymentDetailsScreen2.S.getValue(), (CellDetailsChevronDelegate) pixAutomaticoPaymentDetailsScreen2.W.getValue(), (CellDetailsDelegate) pixAutomaticoPaymentDetailsScreen2.T.getValue(), (CellDetailsInputDelegate) pixAutomaticoPaymentDetailsScreen2.U.getValue(), (CellDetailsActionDelegate) pixAutomaticoPaymentDetailsScreen2.V.getValue(), (CellDetailsNoteDelegate) pixAutomaticoPaymentDetailsScreen2.X.getValue(), (CellDetailsSwitcherDelegate) pixAutomaticoPaymentDetailsScreen2.Y.getValue(), (LargeActionButtonDelegate) pixAutomaticoPaymentDetailsScreen2.Z.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixAutomaticoPaymentDetailsScreen.f80610a0;
                        qji.b bVarU2 = pixAutomaticoPaymentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.automatico.screens.details.di.PixAutomaticoPaymentDetailsScreenInjector");
                        p8a.u uVar = (p8a.u) bVarU2;
                        d0 d0Var = uVar.f234094b;
                        p8a.u uVar2 = uVar.f234095c;
                        PixAutomaticoPaymentDetailsScreenContract$InputData pixAutomaticoPaymentDetailsScreenContract$InputData = pixAutomaticoPaymentDetailsScreen.K;
                        pixAutomaticoPaymentDetailsScreenContract$InputData.getClass();
                        return new p8a.w(d0Var, uVar2, pixAutomaticoPaymentDetailsScreen, pixAutomaticoPaymentDetailsScreenContract$InputData);
                }
            }
        });
        this.P = s.t(this, c.f);
        this.Q = w.y0(new u6h.h(27));
        this.R = w.y0(new u6h.h(28));
        this.S = w.y0(new u6h.h(29));
        this.T = w.y0(new b(0));
        this.U = w.y0(new u6h.h(21));
        this.V = w.y0(new u6h.h(22));
        this.W = w.y0(new u6h.h(23));
        this.X = w.y0(new u6h.h(24));
        this.Y = w.y0(new u6h.h(25));
        this.Z = w.y0(new u6h.h(26));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        u9a.o uiState = (u9a.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        MoneyClause moneyClause = uiState.f278436b;
        TextClause textClause = uiState.f278437c;
        if (moneyClause != null) {
            navBarWithToolbar.setTitle(moneyClause, null);
            navBarWithToolbar.setToolbarTitle(moneyClause);
        }
        navBarWithToolbar.setDescriptionVisible(textClause != null);
        navBarWithToolbar.setDescriptionText(textClause);
        navBarWithToolbar.setEndImage(uiState.d);
        navBarWithToolbar.setFilters(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p8a.w) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((p8a.w) this.O.getValue()).e.get()).d(u.c((LargeActionButtonDelegate) this.Z.getValue()));
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.pix_automatico_recurring_payments_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new u07.b(this, null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), null, new u9a.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.W.getValue()).f51821c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.s0()), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.Z.getValue()).d.f121375b), null, new u9a.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsNoteDelegate) this.X.getValue()).f), null, new i(this, null), 3);
        ?? r56 = this.Y;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r56.getValue()).d), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r56.getValue()).f51912c), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.V.getValue()).d), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.S.getValue()).f53218h), null, new d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, f80610a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
