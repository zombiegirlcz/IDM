package com.revolut.retail.feature.pending_payments.impl.ui.confirmation;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.c1;
import au0.r0;
import au0.s0;
import aw0.i;
import bbk.b;
import bbk.d;
import bbk.d0;
import bbk.f;
import bbk.g;
import bbk.j;
import bbk.k;
import bbk.l;
import bbk.o;
import bbk.r;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import com.revolut.retail.feature.pending_payments.impl.ui.confirmation.PendingPaymentConfirmationScreen;
import dli.a;
import grl.k9;
import java.util.List;
import jii.c0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.p2;
import vc.s;
import vkm.j2;
import wak.c;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/impl/ui/confirmation/PendingPaymentConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbbk/o;", "Ldli/a;", "Lbbk/s;", "Lno/m;", "feature_retail_pending_payments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingPaymentConfirmationScreen extends ViewController<o> implements a, m {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PendingPaymentConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileActionfooterBinding;", 0))};
    public final PendingPaymentContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final int S;
    public final h T;
    public final Object U;
    public final Object V;

    public PendingPaymentConfirmationScreen(PendingPaymentContract$InputData flowInputData) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        this.K = flowInputData;
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = w.y0(new b8g.a(10));
        this.N = w.y0(new b8g.a(11));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: bbk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentConfirmationScreen f14315b;

            {
                this.f14315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.f14315b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PendingPaymentConfirmationScreen.W;
                        return new SelectableDelegate((RowDelegate) pendingPaymentConfirmationScreen.N.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PendingPaymentConfirmationScreen.W;
                        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen2 = this.f14315b;
                        return dli.f.a(pendingPaymentConfirmationScreen2, pendingPaymentConfirmationScreen2.d(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) pendingPaymentConfirmationScreen2.M.getValue(), (RowDelegate) pendingPaymentConfirmationScreen2.N.getValue(), (SelectableDelegate) pendingPaymentConfirmationScreen2.O.getValue(), (CellDetailsDelegate) pendingPaymentConfirmationScreen2.P.getValue(), (CellDetailsActionDelegate) pendingPaymentConfirmationScreen2.Q.getValue(), new CellDetailsNoteDelegate()), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PendingPaymentConfirmationScreen.W;
                        qji.b bVarU2 = pendingPaymentConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pending_payments.impl.ui.confirmation.di.PendingPaymentConfirmationScreenInjector");
                        wak.e eVar = (wak.e) bVarU2;
                        return new wak.c(eVar.f295965c, eVar.d);
                    default:
                        KProperty[] kPropertyArr4 = PendingPaymentConfirmationScreen.W;
                        return (r) ((wak.c) pendingPaymentConfirmationScreen.U.getValue()).f295960m.get();
                }
            }
        });
        this.P = w.y0(new b8g.a(12));
        this.Q = w.y0(new b8g.a(13));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bbk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentConfirmationScreen f14315b;

            {
                this.f14315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.f14315b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PendingPaymentConfirmationScreen.W;
                        return new SelectableDelegate((RowDelegate) pendingPaymentConfirmationScreen.N.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PendingPaymentConfirmationScreen.W;
                        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen2 = this.f14315b;
                        return dli.f.a(pendingPaymentConfirmationScreen2, pendingPaymentConfirmationScreen2.d(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) pendingPaymentConfirmationScreen2.M.getValue(), (RowDelegate) pendingPaymentConfirmationScreen2.N.getValue(), (SelectableDelegate) pendingPaymentConfirmationScreen2.O.getValue(), (CellDetailsDelegate) pendingPaymentConfirmationScreen2.P.getValue(), (CellDetailsActionDelegate) pendingPaymentConfirmationScreen2.Q.getValue(), new CellDetailsNoteDelegate()), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PendingPaymentConfirmationScreen.W;
                        qji.b bVarU2 = pendingPaymentConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pending_payments.impl.ui.confirmation.di.PendingPaymentConfirmationScreenInjector");
                        wak.e eVar = (wak.e) bVarU2;
                        return new wak.c(eVar.f295965c, eVar.d);
                    default:
                        KProperty[] kPropertyArr4 = PendingPaymentConfirmationScreen.W;
                        return (r) ((wak.c) pendingPaymentConfirmationScreen.U.getValue()).f295960m.get();
                }
            }
        });
        this.S = R$layout.screen_recycler_navbarwithbigtile_actionfooter;
        this.T = s.t(this, b.f);
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: bbk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentConfirmationScreen f14315b;

            {
                this.f14315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.f14315b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PendingPaymentConfirmationScreen.W;
                        return new SelectableDelegate((RowDelegate) pendingPaymentConfirmationScreen.N.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PendingPaymentConfirmationScreen.W;
                        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen2 = this.f14315b;
                        return dli.f.a(pendingPaymentConfirmationScreen2, pendingPaymentConfirmationScreen2.d(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) pendingPaymentConfirmationScreen2.M.getValue(), (RowDelegate) pendingPaymentConfirmationScreen2.N.getValue(), (SelectableDelegate) pendingPaymentConfirmationScreen2.O.getValue(), (CellDetailsDelegate) pendingPaymentConfirmationScreen2.P.getValue(), (CellDetailsActionDelegate) pendingPaymentConfirmationScreen2.Q.getValue(), new CellDetailsNoteDelegate()), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PendingPaymentConfirmationScreen.W;
                        qji.b bVarU2 = pendingPaymentConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pending_payments.impl.ui.confirmation.di.PendingPaymentConfirmationScreenInjector");
                        wak.e eVar = (wak.e) bVarU2;
                        return new wak.c(eVar.f295965c, eVar.d);
                    default:
                        KProperty[] kPropertyArr4 = PendingPaymentConfirmationScreen.W;
                        return (r) ((wak.c) pendingPaymentConfirmationScreen.U.getValue()).f295960m.get();
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: bbk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentConfirmationScreen f14315b;

            {
                this.f14315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.f14315b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PendingPaymentConfirmationScreen.W;
                        return new SelectableDelegate((RowDelegate) pendingPaymentConfirmationScreen.N.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PendingPaymentConfirmationScreen.W;
                        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen2 = this.f14315b;
                        return dli.f.a(pendingPaymentConfirmationScreen2, pendingPaymentConfirmationScreen2.d(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) pendingPaymentConfirmationScreen2.M.getValue(), (RowDelegate) pendingPaymentConfirmationScreen2.N.getValue(), (SelectableDelegate) pendingPaymentConfirmationScreen2.O.getValue(), (CellDetailsDelegate) pendingPaymentConfirmationScreen2.P.getValue(), (CellDetailsActionDelegate) pendingPaymentConfirmationScreen2.Q.getValue(), new CellDetailsNoteDelegate()), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PendingPaymentConfirmationScreen.W;
                        qji.b bVarU2 = pendingPaymentConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pending_payments.impl.ui.confirmation.di.PendingPaymentConfirmationScreenInjector");
                        wak.e eVar = (wak.e) bVarU2;
                        return new wak.c(eVar.f295965c, eVar.d);
                    default:
                        KProperty[] kPropertyArr4 = PendingPaymentConfirmationScreen.W;
                        return (r) ((wak.c) pendingPaymentConfirmationScreen.U.getValue()).f295960m.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        bbk.s uiState = (bbk.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ActionFooterView actionFooterView = d3().f174504b;
        i iVar = uiState.f14340c;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
        NavBarWithBigTile navBarWithBigTile = d3().f174505c;
        bbk.m mVar = uiState.f14339b;
        if (mVar instanceof k) {
            navBarWithBigTile.setLoadingState(true);
            return;
        }
        if (mVar instanceof l) {
            navBarWithBigTile.setLoadingState(false);
            navBarWithBigTile.setAvatar(null, r0.DEFAULT);
            navBarWithBigTile.setToolbarTitle(null);
        } else {
            if (!(mVar instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setLoadingState(false);
            j jVar = (j) mVar;
            navBarWithBigTile.setToolbarTitle(jVar.f14328a);
            navBarWithBigTile.setAvatar(jVar.f14330c, r0.BLURRED_BACKGROUND);
            navBarWithBigTile.setActionStatusLabel(jVar.d);
            c1.S(navBarWithBigTile, u.c(jVar.e), null, null, 6);
            navBarWithBigTile.setMenuItems(u.c(jVar.f14329b));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        d0 d0Var = (d0) d();
        d0Var.getClass();
        d0.I2("close");
        if (!((bbk.i) ((j2) d0Var.f14323t.f22677a).getValue()).f14325a) {
            return true;
        }
        d0Var.C2(o.a.f14334a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getX() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174505c;
        navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setAlwaysShowToolbar(true);
        PendingPaymentContract$InputData.Apm apm = (PendingPaymentContract$InputData.Apm) this.K;
        navBarWithBigTile.setIconClickable(apm.f102401b);
        if (apm.f102401b) {
            navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        }
    }

    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174505c.f59357t), null, new bbk.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174505c.f59360y.I.getTimeProgressController$ui_kit_components_release().e.f57220a), null, new bbk.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174504b.f), null, new bbk.c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174504b.f58955g), null, new bbk.c(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53220l), null, new bbk.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.O.getValue()).r()), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.P.getValue()).e), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.Q.getValue()).d), null, new bbk.h(this, null), 3);
    }

    public final c0 d3() {
        ViewBinding value = this.T.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
