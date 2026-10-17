package com.revolut.feature.external_accounts.impl.ui.link.screens.consent;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.link.screens.consent.ConsentScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tn6.b;
import tn6.c;
import tn6.d;
import tn6.g;
import tn6.h;
import tn6.i;
import tn6.j;
import vc.s;
import xf6.u0;
import xf6.v0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/screens/consent/ConsentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltn6/h;", "Ldli/a;", "Ltn6/j;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentScreen extends ViewController<h> implements a {
    public final g K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final ListCellDelegate P;
    public final TextDelegate Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ConsentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.ui.link.screens.consent.ConsentScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ConsentScreen(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: tn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentScreen f272311b;

            {
                this.f272311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConsentScreen consentScreen = this.f272311b;
                switch (i2) {
                    case 0:
                        ConsentScreen.Companion companion = ConsentScreen.INSTANCE;
                        qji.b bVarU2 = consentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.consent.di.ConsentScreenInjector");
                        u0 u0Var = (u0) ((un6.a) bVarU2).b().mo3808a(consentScreen);
                        g gVar = consentScreen.K;
                        switch (u0Var.f305101a) {
                            case 0:
                                gVar.getClass();
                                u0Var.d = gVar;
                                break;
                            case 1:
                                gVar.getClass();
                                u0Var.d = gVar;
                                break;
                            default:
                                gVar.getClass();
                                u0Var.d = gVar;
                                break;
                        }
                        return (v0) u0Var.mo3783build();
                    case 1:
                        ConsentScreen.Companion companion2 = ConsentScreen.INSTANCE;
                        v0 v0Var = (v0) consentScreen.N.getValue();
                        switch (v0Var.f305115a) {
                            case 0:
                                return (i) v0Var.d.get();
                            case 1:
                                return (i) v0Var.d.get();
                            default:
                                return (i) v0Var.d.get();
                        }
                    default:
                        ConsentScreen.Companion companion3 = ConsentScreen.INSTANCE;
                        ConsentScreen consentScreen2 = this.f272311b;
                        return dli.f.a(consentScreen2, consentScreen2.R2(), v.k(consentScreen2.P, consentScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: tn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentScreen f272311b;

            {
                this.f272311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConsentScreen consentScreen = this.f272311b;
                switch (i22) {
                    case 0:
                        ConsentScreen.Companion companion = ConsentScreen.INSTANCE;
                        qji.b bVarU2 = consentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.consent.di.ConsentScreenInjector");
                        u0 u0Var = (u0) ((un6.a) bVarU2).b().mo3808a(consentScreen);
                        g gVar = consentScreen.K;
                        switch (u0Var.f305101a) {
                            case 0:
                                gVar.getClass();
                                u0Var.d = gVar;
                                break;
                            case 1:
                                gVar.getClass();
                                u0Var.d = gVar;
                                break;
                            default:
                                gVar.getClass();
                                u0Var.d = gVar;
                                break;
                        }
                        return (v0) u0Var.mo3783build();
                    case 1:
                        ConsentScreen.Companion companion2 = ConsentScreen.INSTANCE;
                        v0 v0Var = (v0) consentScreen.N.getValue();
                        switch (v0Var.f305115a) {
                            case 0:
                                return (i) v0Var.d.get();
                            case 1:
                                return (i) v0Var.d.get();
                            default:
                                return (i) v0Var.d.get();
                        }
                    default:
                        ConsentScreen.Companion companion3 = ConsentScreen.INSTANCE;
                        ConsentScreen consentScreen2 = this.f272311b;
                        return dli.f.a(consentScreen2, consentScreen2.R2(), v.k(consentScreen2.P, consentScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new ListCellDelegate();
        this.Q = new TextDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: tn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentScreen f272311b;

            {
                this.f272311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConsentScreen consentScreen = this.f272311b;
                switch (i22) {
                    case 0:
                        ConsentScreen.Companion companion = ConsentScreen.INSTANCE;
                        qji.b bVarU2 = consentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.consent.di.ConsentScreenInjector");
                        u0 u0Var = (u0) ((un6.a) bVarU2).b().mo3808a(consentScreen);
                        g gVar = consentScreen.K;
                        switch (u0Var.f305101a) {
                            case 0:
                                gVar.getClass();
                                u0Var.d = gVar;
                                break;
                            case 1:
                                gVar.getClass();
                                u0Var.d = gVar;
                                break;
                            default:
                                gVar.getClass();
                                u0Var.d = gVar;
                                break;
                        }
                        return (v0) u0Var.mo3783build();
                    case 1:
                        ConsentScreen.Companion companion2 = ConsentScreen.INSTANCE;
                        v0 v0Var = (v0) consentScreen.N.getValue();
                        switch (v0Var.f305115a) {
                            case 0:
                                return (i) v0Var.d.get();
                            case 1:
                                return (i) v0Var.d.get();
                            default:
                                return (i) v0Var.d.get();
                        }
                    default:
                        ConsentScreen.Companion companion3 = ConsentScreen.INSTANCE;
                        ConsentScreen consentScreen2 = this.f272311b;
                        return dli.f.a(consentScreen2, consentScreen2.R2(), v.k(consentScreen2.P, consentScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Clause textLocalisedClause;
        Clause textLocalisedClause2;
        Clause textLocalisedClause3;
        Clause textLocalisedClause4;
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        g gVar = this.K;
        ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration = gVar.f272314a;
        ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration2 = gVar.f272314a;
        if (externalConsentConfiguration == null || (textLocalisedClause = externalConsentConfiguration.f72281a) == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.external_institutions_consent_title, null, null, 14);
        }
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        if (externalConsentConfiguration2 == null || (textLocalisedClause2 = externalConsentConfiguration2.f72281a) == null) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.external_institutions_consent_title, null, null, 14);
        }
        navBarWithToolbar.setToolbarTitle(textLocalisedClause2);
        if (externalConsentConfiguration2 == null || (textLocalisedClause3 = externalConsentConfiguration2.f72282b) == null) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.external_institutions_consent_subtitle, null, null, 14);
        }
        navBarWithToolbar.setDescriptionText(textLocalisedClause3);
        navBarWithToolbar.setDescriptionVisible(true);
        CollapsingActionButton collapsingActionButton = d3().f174551b;
        if (externalConsentConfiguration2 == null || (textLocalisedClause4 = externalConsentConfiguration2.e) == null) {
            textLocalisedClause4 = new TextLocalisedClause(R.string.common_action_confirm, null, null, 14);
        }
        collapsingActionButton.setLargeButtonText(textLocalisedClause4);
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_forward, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        collapsingActionButton.setFabAbsoluteRotation(90.0f, false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174552c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.d()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.c()), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new tn6.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new tn6.e(this, null, 1), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
