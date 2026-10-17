package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.BrazilInboundMandatePreviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import jii.t;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.t3;
import tzh.g;
import uj6.d;
import uj6.i;
import uj6.l;
import uj6.r;
import vc.s;
import we6.k;
import xf6.n;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/mandate_preview/BrazilInboundMandatePreviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/mandate_preview/a;", "Ldli/a;", "Luj6/r;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrazilInboundMandatePreviewScreen extends ViewController<a> implements dli.a {
    public final l K;
    public final h L;
    public final CellDetailsDelegate M;
    public final RowDelegate N;
    public final boolean O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(BrazilInboundMandatePreviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterTwoButtonsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.BrazilInboundMandatePreviewScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public BrazilInboundMandatePreviewScreen(l inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, uj6.b.f);
        this.M = new CellDetailsDelegate();
        this.N = new RowDelegate(null, null, 7);
        this.O = inputData.e == k.STEERING;
        this.P = R$layout.screen_recycler_navbar_footer_two_buttons;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: uj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilInboundMandatePreviewScreen f280487b;

            {
                this.f280487b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrazilInboundMandatePreviewScreen brazilInboundMandatePreviewScreen = this.f280487b;
                switch (i2) {
                    case 0:
                        BrazilInboundMandatePreviewScreen.Companion companion = BrazilInboundMandatePreviewScreen.INSTANCE;
                        qji.b bVarU2 = brazilInboundMandatePreviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.di.BrazilInboundMandatePreviewScreenInjector");
                        xf6.m mVar = (xf6.m) bVarU2;
                        xf6.t tVar = mVar.f304943b;
                        xf6.m mVar2 = mVar.f304944c;
                        l lVar = brazilInboundMandatePreviewScreen.K;
                        lVar.getClass();
                        return new xf6.n(tVar, mVar2, lVar);
                    case 1:
                        BrazilInboundMandatePreviewScreen.Companion companion2 = BrazilInboundMandatePreviewScreen.INSTANCE;
                        return (q) ((xf6.n) brazilInboundMandatePreviewScreen.Q.getValue()).f304955c.get();
                    default:
                        BrazilInboundMandatePreviewScreen.Companion companion3 = BrazilInboundMandatePreviewScreen.INSTANCE;
                        BrazilInboundMandatePreviewScreen brazilInboundMandatePreviewScreen2 = this.f280487b;
                        return dli.f.a(brazilInboundMandatePreviewScreen2, brazilInboundMandatePreviewScreen2.R2(), zhm.v.k(brazilInboundMandatePreviewScreen2.N, new ListCellDelegate(), new ListSubheaderDelegate(), new CellDetailsActionDelegate(), brazilInboundMandatePreviewScreen2.M, new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: uj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilInboundMandatePreviewScreen f280487b;

            {
                this.f280487b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrazilInboundMandatePreviewScreen brazilInboundMandatePreviewScreen = this.f280487b;
                switch (i22) {
                    case 0:
                        BrazilInboundMandatePreviewScreen.Companion companion = BrazilInboundMandatePreviewScreen.INSTANCE;
                        qji.b bVarU2 = brazilInboundMandatePreviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.di.BrazilInboundMandatePreviewScreenInjector");
                        xf6.m mVar = (xf6.m) bVarU2;
                        xf6.t tVar = mVar.f304943b;
                        xf6.m mVar2 = mVar.f304944c;
                        l lVar = brazilInboundMandatePreviewScreen.K;
                        lVar.getClass();
                        return new xf6.n(tVar, mVar2, lVar);
                    case 1:
                        BrazilInboundMandatePreviewScreen.Companion companion2 = BrazilInboundMandatePreviewScreen.INSTANCE;
                        return (q) ((xf6.n) brazilInboundMandatePreviewScreen.Q.getValue()).f304955c.get();
                    default:
                        BrazilInboundMandatePreviewScreen.Companion companion3 = BrazilInboundMandatePreviewScreen.INSTANCE;
                        BrazilInboundMandatePreviewScreen brazilInboundMandatePreviewScreen2 = this.f280487b;
                        return dli.f.a(brazilInboundMandatePreviewScreen2, brazilInboundMandatePreviewScreen2.R2(), zhm.v.k(brazilInboundMandatePreviewScreen2.N, new ListCellDelegate(), new ListSubheaderDelegate(), new CellDetailsActionDelegate(), brazilInboundMandatePreviewScreen2.M, new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: uj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrazilInboundMandatePreviewScreen f280487b;

            {
                this.f280487b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrazilInboundMandatePreviewScreen brazilInboundMandatePreviewScreen = this.f280487b;
                switch (i22) {
                    case 0:
                        BrazilInboundMandatePreviewScreen.Companion companion = BrazilInboundMandatePreviewScreen.INSTANCE;
                        qji.b bVarU2 = brazilInboundMandatePreviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.di.BrazilInboundMandatePreviewScreenInjector");
                        xf6.m mVar = (xf6.m) bVarU2;
                        xf6.t tVar = mVar.f304943b;
                        xf6.m mVar2 = mVar.f304944c;
                        l lVar = brazilInboundMandatePreviewScreen.K;
                        lVar.getClass();
                        return new xf6.n(tVar, mVar2, lVar);
                    case 1:
                        BrazilInboundMandatePreviewScreen.Companion companion2 = BrazilInboundMandatePreviewScreen.INSTANCE;
                        return (q) ((xf6.n) brazilInboundMandatePreviewScreen.Q.getValue()).f304955c.get();
                    default:
                        BrazilInboundMandatePreviewScreen.Companion companion3 = BrazilInboundMandatePreviewScreen.INSTANCE;
                        BrazilInboundMandatePreviewScreen brazilInboundMandatePreviewScreen2 = this.f280487b;
                        return dli.f.a(brazilInboundMandatePreviewScreen2, brazilInboundMandatePreviewScreen2.R2(), zhm.v.k(brazilInboundMandatePreviewScreen2.N, new ListCellDelegate(), new ListSubheaderDelegate(), new CellDetailsActionDelegate(), brazilInboundMandatePreviewScreen2.M, new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        boolean z = uiState.f280511b;
        boolean z3 = this.O;
        if (z) {
            t tVarD3 = d3();
            NavBarWithToolbar screenRecyclerNavbarFooterTwoButtonsToolbar = tVarD3.f174562g;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsToolbar, "screenRecyclerNavbarFooterTwoButtonsToolbar");
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            screenRecyclerNavbarFooterTwoButtonsToolbar.I0(t3Var, false);
            LargeActionButton largeActionButton = tVarD3.f174560b;
            LargeActionButton.ButtonStyle.FlatButton flatButton = LargeActionButton.ButtonStyle.f58737s;
            largeActionButton.o(flatButton);
            if (z3) {
                tVarD3.f.o(flatButton);
                return;
            }
            return;
        }
        t tVarD32 = d3();
        NavBarWithToolbar navBarWithToolbar = tVarD32.f174562g;
        LargeActionButton largeActionButton2 = tVarD32.f174560b;
        LargeActionButton screenRecyclerNavbarFooterTwoButtonsSecondButton = tVarD32.f;
        navBarWithToolbar.l0();
        NavBarWithToolbar navBarWithToolbar2 = tVarD32.f174562g;
        Clause clause = uiState.f280512c;
        Clause clause2 = uiState.d;
        if (clause != null) {
            navBarWithToolbar2.setTitle(clause, null);
            navBarWithToolbar2.setToolbarTitle(clause);
        }
        if (clause2 != null) {
            navBarWithToolbar2.setDescriptionVisible(true);
            navBarWithToolbar2.setDescriptionColor(R$attr.uikit_colorGreyTone50);
            navBarWithToolbar2.setDescriptionText(clause2);
        }
        Clause clause3 = uiState.e;
        if (clause3 != null) {
            tVarD32.d.setContent(new c7(clause3, false, null, 6));
        }
        Clause clause4 = uiState.f;
        if (clause4 != null) {
            largeActionButton2.setText(clause4);
            largeActionButton2.o(LargeActionButton.ButtonStyle.f58725a);
        }
        Clause clause5 = uiState.f280513g;
        if (!z3 || clause5 == null) {
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsSecondButton, "screenRecyclerNavbarFooterTwoButtonsSecondButton");
            screenRecyclerNavbarFooterTwoButtonsSecondButton.setVisibility(8);
        } else {
            screenRecyclerNavbarFooterTwoButtonsSecondButton.setText(clause5);
            screenRecyclerNavbarFooterTwoButtonsSecondButton.o(LargeActionButton.ButtonStyle.f58726b);
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsSecondButton, "screenRecyclerNavbarFooterTwoButtonsSecondButton");
            screenRecyclerNavbarFooterTwoButtonsSecondButton.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        t tVarD3 = d3();
        ScreenContentRecyclerView screenRecyclerNavbarFooterTwoButtonsRecyclerView = tVarD3.e;
        LargeActionButton screenRecyclerNavbarFooterTwoButtonsSecondButton = tVarD3.f;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsRecyclerView, "screenRecyclerNavbarFooterTwoButtonsRecyclerView");
        knm.b.v(kli.a.k(m2(), 180.0f), screenRecyclerNavbarFooterTwoButtonsRecyclerView);
        tVarD3.f174561c.setBackgroundResource(R$drawable.uikit_bottom_container_gradient);
        NavBarWithToolbar navBarWithToolbar = tVarD3.f174562g;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        if (!this.O) {
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsSecondButton, "screenRecyclerNavbarFooterTwoButtonsSecondButton");
            screenRecyclerNavbarFooterTwoButtonsSecondButton.setVisibility(8);
        } else {
            navBarWithToolbar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MENU_STEERING_INFO_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsSecondButton, "screenRecyclerNavbarFooterTwoButtonsSecondButton");
            screenRecyclerNavbarFooterTwoButtonsSecondButton.setVisibility(0);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        t tVarD3 = d3();
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(tVarD3.f174562g.f59410q), new uj6.c(this, null, 0), 3);
        ViewController.P2(this, new g(rd0.e.b(tVarD3.f174562g.o.f57403b), 16), new uj6.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(tVarD3.f174560b.o), new uj6.c(this, null, 2), 3);
        CellDetailsDelegate cellDetailsDelegate = this.M;
        ViewController.P2(this, new g(rd0.e.b(cellDetailsDelegate.e), 17), new d(this, continuation, 0), 3);
        ViewController.P2(this, new g(rd0.e.b(cellDetailsDelegate.d), 18), new d(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53224q), new uj6.e(this, null), 3);
        if (this.O) {
            ViewController.P2(this, rd0.e.b(d3().f.o), new uj6.c(this, null, 3), 3);
            ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new i(this, null), 3);
        }
    }

    public final t d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final uj6.q R2() {
        return (uj6.q) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
