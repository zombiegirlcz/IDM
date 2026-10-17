package com.revolut.feature.card_management.impl.cardagreements.screens.overview;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import cli.o;
import cli.q;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_management.impl.R$id;
import com.revolut.feature.card_management.impl.R$layout;
import com.revolut.feature.card_management.impl.cardagreements.screens.overview.CardIssuanceAgreementsScreen;
import com.revolut.feature.card_management.impl.cardagreements.screens.overview.CardIssuanceAgreementsScreenContract$InputData;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import hz2.d;
import hz2.n;
import hz2.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/cardagreements/screens/overview/CardIssuanceAgreementsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhz2/n;", "Ltki/c;", "Lhz2/p;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardIssuanceAgreementsScreen extends ViewController<n> implements c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CardIssuanceAgreementsScreen.class, "binding", "getBinding()Lcom/revolut/feature/card_management/impl/databinding/ScreenCardIssuanceAgreementBinding;", 0))};
    public final CardIssuanceAgreementsScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final h R;

    public CardIssuanceAgreementsScreen(CardIssuanceAgreementsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hz2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardIssuanceAgreementsScreen f156988b;

            {
                this.f156988b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardIssuanceAgreementsScreen cardIssuanceAgreementsScreen = this.f156988b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardIssuanceAgreementsScreen.S;
                        qji.b bVarU2 = cardIssuanceAgreementsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardagreements.screens.overview.di.CardIssuanceAgreementsOverviewInjector");
                        dz2.b bVar = (dz2.b) bVarU2;
                        dz2.a aVar = bVar.f121219b;
                        dz2.b bVar2 = bVar.f121220c;
                        CardIssuanceAgreementsScreenContract$InputData cardIssuanceAgreementsScreenContract$InputData = cardIssuanceAgreementsScreen.K;
                        cardIssuanceAgreementsScreenContract$InputData.getClass();
                        return new dz2.c(aVar, bVar2, cardIssuanceAgreementsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardIssuanceAgreementsScreen.S;
                        return (o) ((dz2.c) cardIssuanceAgreementsScreen.L.getValue()).f121223c.get();
                    default:
                        KProperty[] kPropertyArr3 = CardIssuanceAgreementsScreen.S;
                        CardIssuanceAgreementsScreen cardIssuanceAgreementsScreen2 = this.f156988b;
                        return tki.g.a(cardIssuanceAgreementsScreen2, (o) cardIssuanceAgreementsScreen2.M.getValue(), zhm.v.k(new RowLoadingDelegate(), cardIssuanceAgreementsScreen2.N, new ListSubheaderDelegate(), (FullScreenStateDelegate) cardIssuanceAgreementsScreen2.O.getValue()), R$id.cardIssuanceAgreement_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: hz2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardIssuanceAgreementsScreen f156988b;

            {
                this.f156988b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardIssuanceAgreementsScreen cardIssuanceAgreementsScreen = this.f156988b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardIssuanceAgreementsScreen.S;
                        qji.b bVarU2 = cardIssuanceAgreementsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardagreements.screens.overview.di.CardIssuanceAgreementsOverviewInjector");
                        dz2.b bVar = (dz2.b) bVarU2;
                        dz2.a aVar = bVar.f121219b;
                        dz2.b bVar2 = bVar.f121220c;
                        CardIssuanceAgreementsScreenContract$InputData cardIssuanceAgreementsScreenContract$InputData = cardIssuanceAgreementsScreen.K;
                        cardIssuanceAgreementsScreenContract$InputData.getClass();
                        return new dz2.c(aVar, bVar2, cardIssuanceAgreementsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardIssuanceAgreementsScreen.S;
                        return (o) ((dz2.c) cardIssuanceAgreementsScreen.L.getValue()).f121223c.get();
                    default:
                        KProperty[] kPropertyArr3 = CardIssuanceAgreementsScreen.S;
                        CardIssuanceAgreementsScreen cardIssuanceAgreementsScreen2 = this.f156988b;
                        return tki.g.a(cardIssuanceAgreementsScreen2, (o) cardIssuanceAgreementsScreen2.M.getValue(), zhm.v.k(new RowLoadingDelegate(), cardIssuanceAgreementsScreen2.N, new ListSubheaderDelegate(), (FullScreenStateDelegate) cardIssuanceAgreementsScreen2.O.getValue()), R$id.cardIssuanceAgreement_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = new RowDelegate(null, null, 7);
        this.O = w.y0(new hul.c(28));
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: hz2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardIssuanceAgreementsScreen f156988b;

            {
                this.f156988b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardIssuanceAgreementsScreen cardIssuanceAgreementsScreen = this.f156988b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardIssuanceAgreementsScreen.S;
                        qji.b bVarU2 = cardIssuanceAgreementsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardagreements.screens.overview.di.CardIssuanceAgreementsOverviewInjector");
                        dz2.b bVar = (dz2.b) bVarU2;
                        dz2.a aVar = bVar.f121219b;
                        dz2.b bVar2 = bVar.f121220c;
                        CardIssuanceAgreementsScreenContract$InputData cardIssuanceAgreementsScreenContract$InputData = cardIssuanceAgreementsScreen.K;
                        cardIssuanceAgreementsScreenContract$InputData.getClass();
                        return new dz2.c(aVar, bVar2, cardIssuanceAgreementsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardIssuanceAgreementsScreen.S;
                        return (o) ((dz2.c) cardIssuanceAgreementsScreen.L.getValue()).f121223c.get();
                    default:
                        KProperty[] kPropertyArr3 = CardIssuanceAgreementsScreen.S;
                        CardIssuanceAgreementsScreen cardIssuanceAgreementsScreen2 = this.f156988b;
                        return tki.g.a(cardIssuanceAgreementsScreen2, (o) cardIssuanceAgreementsScreen2.M.getValue(), zhm.v.k(new RowLoadingDelegate(), cardIssuanceAgreementsScreen2.N, new ListSubheaderDelegate(), (FullScreenStateDelegate) cardIssuanceAgreementsScreen2.O.getValue()), R$id.cardIssuanceAgreement_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = R$layout.screen_card_issuance_agreement;
        this.R = s.t(this, d.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ActionFooterView cardIssuanceAgreementActionFooterView = d3().f258496b;
        Intrinsics.checkNotNullExpressionValue(cardIssuanceAgreementActionFooterView, "cardIssuanceAgreementActionFooterView");
        cardIssuanceAgreementActionFooterView.setVisibility(uiState.f157001b ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (dz2.c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (hz2.o) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f258497c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.card_issuance_terms_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.card_issuance_terms_title, null, null, 14));
        navBarWithToolbar.setNavBarDescriptionModel(null);
        d3().f258496b.setModel(new aw0.e(false, new TextLocalisedClause(R$string.card_issuance_terms_disclaimer, u.c(new TextLocalisedClause(R$string.card_issuance_terms_accept_button, null, null, 14)), null, 12), null, new n6(new TextLocalisedClause(R$string.card_issuance_terms_accept_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "ACCEPT_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 53));
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        hsl.c cVar = new hsl.c(rd0.e.b(d3().f258497c.f59410q), 4);
        hsl.c cVar2 = new hsl.c(rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), 5);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, vkm.q.J(cVar, cVar2, new hsl.c(rd0.e.b(rowDelegate.f53218h), 6), new hsl.c(rd0.e.b(rowDelegate.f53226s), 7), new hsl.c(rd0.e.b(d3().f258496b.f), 8)), new hp2.d(this, null, 21), 3);
    }

    public final rz2.a d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rz2.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
