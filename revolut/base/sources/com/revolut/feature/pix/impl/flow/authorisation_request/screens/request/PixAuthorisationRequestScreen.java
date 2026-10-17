package com.revolut.feature.pix.impl.flow.authorisation_request.screens.request;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import jii.t;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import nsh.e;
import o23.b;
import o9a.c;
import o9a.f;
import o9a.g;
import o9a.i;
import o9a.o;
import o9a.p;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/request/PixAuthorisationRequestScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo9a/o;", "Ldli/a;", "Lo9a/q;", "Lno/d1;", "Companion", "a", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAuthorisationRequestScreen extends ViewController<o> implements dli.a, d1 {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PixAuthorisationRequestScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterTwoButtonsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PixAuthorisationRequestScreen(j2 inputDataFlow) {
        Intrinsics.checkNotNullParameter(inputDataFlow, "inputDataFlow");
        this.K = R$layout.screen_recycler_navbar_footer_two_buttons;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: o9a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationRequestScreen f223146b;

            {
                this.f223146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PixAuthorisationRequestScreen.Companion companion = PixAuthorisationRequestScreen.INSTANCE;
                        return (p) ((p8a.t) this.f223146b.N.getValue()).e.get();
                    default:
                        PixAuthorisationRequestScreen.Companion companion2 = PixAuthorisationRequestScreen.INSTANCE;
                        PixAuthorisationRequestScreen pixAuthorisationRequestScreen = this.f223146b;
                        return dli.f.a(pixAuthorisationRequestScreen, pixAuthorisationRequestScreen.d(), zhm.v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), (CellDetailsSwitcherDelegate) pixAuthorisationRequestScreen.Q.getValue(), new TextDelegate(), (CellDetailsActionDelegate) pixAuthorisationRequestScreen.P.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (PlainTextWarningDelegate) pixAuthorisationRequestScreen.R.getValue()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: o9a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationRequestScreen f223146b;

            {
                this.f223146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PixAuthorisationRequestScreen.Companion companion = PixAuthorisationRequestScreen.INSTANCE;
                        return (p) ((p8a.t) this.f223146b.N.getValue()).e.get();
                    default:
                        PixAuthorisationRequestScreen.Companion companion2 = PixAuthorisationRequestScreen.INSTANCE;
                        PixAuthorisationRequestScreen pixAuthorisationRequestScreen = this.f223146b;
                        return dli.f.a(pixAuthorisationRequestScreen, pixAuthorisationRequestScreen.d(), zhm.v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), (CellDetailsSwitcherDelegate) pixAuthorisationRequestScreen.Q.getValue(), new TextDelegate(), (CellDetailsActionDelegate) pixAuthorisationRequestScreen.P.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (PlainTextWarningDelegate) pixAuthorisationRequestScreen.R.getValue()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new e(this, inputDataFlow, 28));
        this.O = s.t(this, c.f);
        this.P = w.y0(new b(27));
        this.Q = w.y0(new b(28));
        this.R = w.y0(new b(29));
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        o9a.q uiState = (o9a.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        t tVarD3 = d3();
        tVarD3.f174560b.setEnabled(uiState.f223163b);
        tVarD3.f174560b.setText(uiState.f223162a);
        tVarD3.d.setTextClause(uiState.f223164c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p8a.t) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        t tVarD3 = d3();
        ScreenContentRecyclerView screenRecyclerNavbarFooterTwoButtonsRecyclerView = tVarD3.e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsRecyclerView, "screenRecyclerNavbarFooterTwoButtonsRecyclerView");
        knm.b.v(kli.a.k(m2(), 180.0f), screenRecyclerNavbarFooterTwoButtonsRecyclerView);
        tVarD3.f174561c.setBackgroundResource(R$drawable.uikit_bottom_container_gradient);
        NavBarWithToolbar navBarWithToolbar = tVarD3.f174562g;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pix_authorisation_request_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        tVarD3.f174560b.setLoadingButtonTag("CONFIRM_BUTTON_TAG");
        LargeActionButton largeActionButton = tVarD3.f;
        largeActionButton.setLoadingButtonTag("REJECT_BUTTON_TAG");
        largeActionButton.o(LargeActionButton.ButtonStyle.f58726b);
        l.A(R.string.common_action_reject, null, null, 14, largeActionButton);
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174562g.f59410q), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174560b.o), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f.o), null, new f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.P.getValue()).d), null, new g(this, null), 3);
        ?? r56 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r56.getValue()).d), null, new o9a.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r56.getValue()).f51912c), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new o9a.e(rd0.e.b(((PlainTextWarningDelegate) this.R.getValue()).d.f121375b), 0), null, new f(this, continuation, 3), 3);
    }

    public final t d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
