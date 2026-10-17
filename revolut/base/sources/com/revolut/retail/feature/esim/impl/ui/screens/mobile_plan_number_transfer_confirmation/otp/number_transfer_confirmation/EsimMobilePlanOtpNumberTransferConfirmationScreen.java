package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation;

import afj.d0;
import afj.z;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.m6;
import aw0.n6;
import blj.f;
import blj.g;
import blj.j;
import blj.l;
import blj.m;
import blj.n;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/otp/number_transfer_confirmation/EsimMobilePlanOtpNumberTransferConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/otp/number_transfer_confirmation/a;", "Ldli/a;", "Lblj/n;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanOtpNumberTransferConfirmationScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(EsimMobilePlanOtpNumberTransferConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final CodeEditorDelegate O;
    public final TextDelegate P;
    public final SmallActionButtonDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public EsimMobilePlanOtpNumberTransferConfirmationScreen(EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, blj.b.f);
        this.N = new InputTextDelegate(null);
        this.O = new CodeEditorDelegate();
        this.P = new TextDelegate();
        this.Q = new SmallActionButtonDelegate();
        this.R = new FullScreenStateDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: blj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanOtpNumberTransferConfirmationScreen f16706b;

            {
                this.f16706b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanOtpNumberTransferConfirmationScreen esimMobilePlanOtpNumberTransferConfirmationScreen = this.f16706b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanOtpNumberTransferConfirmationScreen.V;
                        EsimMobilePlanOtpNumberTransferConfirmationScreen esimMobilePlanOtpNumberTransferConfirmationScreen2 = this.f16706b;
                        return dli.f.a(esimMobilePlanOtpNumberTransferConfirmationScreen2, esimMobilePlanOtpNumberTransferConfirmationScreen2.d(), zhm.v.k(new RowDelegate(null, null, 7), esimMobilePlanOtpNumberTransferConfirmationScreen2.N, esimMobilePlanOtpNumberTransferConfirmationScreen2.O, esimMobilePlanOtpNumberTransferConfirmationScreen2.P, esimMobilePlanOtpNumberTransferConfirmationScreen2.Q, new RowLoadingDelegate(), esimMobilePlanOtpNumberTransferConfirmationScreen2.R), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanOtpNumberTransferConfirmationScreen.V;
                        qji.b bVarU2 = esimMobilePlanOtpNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.di.EsimMobilePlanOtpNumberTransferConfirmationScreenInjector");
                        z zVar = (z) bVarU2;
                        afj.b bVar = zVar.f4545b;
                        z zVar2 = zVar.f4546c;
                        EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData = esimMobilePlanOtpNumberTransferConfirmationScreen.K;
                        esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new d0(bVar, zVar2, esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanOtpNumberTransferConfirmationScreen.V;
                        return (j) ((d0) esimMobilePlanOtpNumberTransferConfirmationScreen.T.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: blj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanOtpNumberTransferConfirmationScreen f16706b;

            {
                this.f16706b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanOtpNumberTransferConfirmationScreen esimMobilePlanOtpNumberTransferConfirmationScreen = this.f16706b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanOtpNumberTransferConfirmationScreen.V;
                        EsimMobilePlanOtpNumberTransferConfirmationScreen esimMobilePlanOtpNumberTransferConfirmationScreen2 = this.f16706b;
                        return dli.f.a(esimMobilePlanOtpNumberTransferConfirmationScreen2, esimMobilePlanOtpNumberTransferConfirmationScreen2.d(), zhm.v.k(new RowDelegate(null, null, 7), esimMobilePlanOtpNumberTransferConfirmationScreen2.N, esimMobilePlanOtpNumberTransferConfirmationScreen2.O, esimMobilePlanOtpNumberTransferConfirmationScreen2.P, esimMobilePlanOtpNumberTransferConfirmationScreen2.Q, new RowLoadingDelegate(), esimMobilePlanOtpNumberTransferConfirmationScreen2.R), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanOtpNumberTransferConfirmationScreen.V;
                        qji.b bVarU2 = esimMobilePlanOtpNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.di.EsimMobilePlanOtpNumberTransferConfirmationScreenInjector");
                        z zVar = (z) bVarU2;
                        afj.b bVar = zVar.f4545b;
                        z zVar2 = zVar.f4546c;
                        EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData = esimMobilePlanOtpNumberTransferConfirmationScreen.K;
                        esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new d0(bVar, zVar2, esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanOtpNumberTransferConfirmationScreen.V;
                        return (j) ((d0) esimMobilePlanOtpNumberTransferConfirmationScreen.T.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: blj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanOtpNumberTransferConfirmationScreen f16706b;

            {
                this.f16706b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanOtpNumberTransferConfirmationScreen esimMobilePlanOtpNumberTransferConfirmationScreen = this.f16706b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanOtpNumberTransferConfirmationScreen.V;
                        EsimMobilePlanOtpNumberTransferConfirmationScreen esimMobilePlanOtpNumberTransferConfirmationScreen2 = this.f16706b;
                        return dli.f.a(esimMobilePlanOtpNumberTransferConfirmationScreen2, esimMobilePlanOtpNumberTransferConfirmationScreen2.d(), zhm.v.k(new RowDelegate(null, null, 7), esimMobilePlanOtpNumberTransferConfirmationScreen2.N, esimMobilePlanOtpNumberTransferConfirmationScreen2.O, esimMobilePlanOtpNumberTransferConfirmationScreen2.P, esimMobilePlanOtpNumberTransferConfirmationScreen2.Q, new RowLoadingDelegate(), esimMobilePlanOtpNumberTransferConfirmationScreen2.R), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanOtpNumberTransferConfirmationScreen.V;
                        qji.b bVarU2 = esimMobilePlanOtpNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.di.EsimMobilePlanOtpNumberTransferConfirmationScreenInjector");
                        z zVar = (z) bVarU2;
                        afj.b bVar = zVar.f4545b;
                        z zVar2 = zVar.f4546c;
                        EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData = esimMobilePlanOtpNumberTransferConfirmationScreen.K;
                        esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new d0(bVar, zVar2, esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanOtpNumberTransferConfirmationScreen.V;
                        return (j) ((d0) esimMobilePlanOtpNumberTransferConfirmationScreen.T.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        l lVar = uiState.f16720c;
        screenRecyclerNavbarActionFooterActionFooterView.setModel(new aw0.e(false, lVar.f16715c, null, m6.c(n6.Companion, lVar.f16714b, LargeActionButton.ButtonStyle.f58725a, null, null, lVar.f16713a, null, null, null, 988), null, null, 53));
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        m mVar = uiState.f16718a;
        Clause clause = mVar.f16716a;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        Clause clause2 = mVar.f16717b;
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorGrey50);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d0) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(this.K.f101290g == hgj.c.CLOSE ? R$drawable.uikit_icn_24_cross : ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new blj.d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new blj.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53336c.f121375b), new blj.e(this, null), 3);
        InputTextDelegate inputTextDelegate = this.N;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52576h.f121375b), new blj.c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.O.d.f121375b), new blj.c(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new blj.d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.e), new blj.c(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.p0()), new blj.c(this, continuation, 0), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
