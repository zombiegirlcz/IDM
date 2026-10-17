package com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.ConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.ConsentDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kx4.f0;
import ll6.b;
import ll6.d;
import ll6.g;
import te0.w;
import tx0.j0;
import vc.s;
import xf6.j2;
import xf6.w2;
import xf6.x2;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consent_details/ConsentDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consent_details/ConsentDetailsScreenContract$OutputData;", "Ldli/a;", "Lll6/h;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentDetailsScreen extends ViewController<ConsentDetailsScreenContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ConsentDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ConsentDetailsScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final FooterTextDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public ConsentDetailsScreen(ConsentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = new RowDelegate(null, null, 7);
        this.N = new FooterTextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ll6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentDetailsScreen f196581b;

            {
                this.f196581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConsentDetailsScreen consentDetailsScreen = this.f196581b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentDetailsScreen.S;
                        ConsentDetailsScreen consentDetailsScreen2 = this.f196581b;
                        return dli.f.a(consentDetailsScreen2, (g) consentDetailsScreen2.R.getValue(), v.k(consentDetailsScreen2.M, new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new ListCellDelegate(), consentDetailsScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentDetailsScreen.S;
                        qji.b bVarU2 = consentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.di.ConsentDetailsScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData = consentDetailsScreen.K;
                        consentDetailsScreenContract$InputData.getClass();
                        return new j2(w2Var, x2Var2, consentDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ConsentDetailsScreen.S;
                        return (g) ((j2) consentDetailsScreen.Q.getValue()).d.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ll6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentDetailsScreen f196581b;

            {
                this.f196581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConsentDetailsScreen consentDetailsScreen = this.f196581b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentDetailsScreen.S;
                        ConsentDetailsScreen consentDetailsScreen2 = this.f196581b;
                        return dli.f.a(consentDetailsScreen2, (g) consentDetailsScreen2.R.getValue(), v.k(consentDetailsScreen2.M, new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new ListCellDelegate(), consentDetailsScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentDetailsScreen.S;
                        qji.b bVarU2 = consentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.di.ConsentDetailsScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData = consentDetailsScreen.K;
                        consentDetailsScreenContract$InputData.getClass();
                        return new j2(w2Var, x2Var2, consentDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ConsentDetailsScreen.S;
                        return (g) ((j2) consentDetailsScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ll6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentDetailsScreen f196581b;

            {
                this.f196581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConsentDetailsScreen consentDetailsScreen = this.f196581b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentDetailsScreen.S;
                        ConsentDetailsScreen consentDetailsScreen2 = this.f196581b;
                        return dli.f.a(consentDetailsScreen2, (g) consentDetailsScreen2.R.getValue(), v.k(consentDetailsScreen2.M, new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new ListCellDelegate(), consentDetailsScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentDetailsScreen.S;
                        qji.b bVarU2 = consentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.di.ConsentDetailsScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData = consentDetailsScreen.K;
                        consentDetailsScreenContract$InputData.getClass();
                        return new j2(w2Var, x2Var2, consentDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ConsentDetailsScreen.S;
                        return (g) ((j2) consentDetailsScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ll6.h uiState = (ll6.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setEndImage(uiState.f196587b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j2) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData = this.K;
        OpenBankingConsent openBankingConsent = consentDetailsScreenContract$InputData.f72772b;
        OutboundOpenBankingClient outboundOpenBankingClient = consentDetailsScreenContract$InputData.f72771a;
        if (openBankingConsent instanceof OpenBankingConsent.Australia) {
            navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.open_banking_consents_accounts_title, null, null, 14));
            navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.open_banking_consents_accounts_title, null, null, 14), null);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_permissions_info_screen_subtitle, u.c(outboundOpenBankingClient.getF60399b()), null, 12));
        } else {
            navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
            navBarWithToolbar.setToolbarTitle(new TextClause(outboundOpenBankingClient.getF60399b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            navBarWithToolbar.setTitle(new TextClause(outboundOpenBankingClient.getF60399b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        }
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new la8.h(this, null, 17), 3);
        ViewController.P2(this, new f0(rd0.e.b(this.M.f53218h), 22), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.e.f121375b), new le8.d(this, (Continuation) null, 14), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
