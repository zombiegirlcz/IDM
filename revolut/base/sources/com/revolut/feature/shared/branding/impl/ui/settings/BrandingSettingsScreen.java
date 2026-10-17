package com.revolut.feature.shared.branding.impl.ui.settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsInputDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.branding.api.destination.BrandingSharedDestination;
import com.revolut.feature.shared.branding.impl.R$id;
import com.revolut.feature.shared.branding.impl.R$layout;
import com.revolut.feature.shared.branding.impl.R$string;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import cw6.m;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rxe.b;
import s42.f;
import s6d.c;
import s6d.d;
import s6d.g;
import s6d.k;
import s6d.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/branding/impl/ui/settings/BrandingSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls6d/k;", "Ldli/a;", "Ls6d/m;", "Companion", "a", "feature_shared_branding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrandingSettingsScreen extends ViewController<k> implements dli.a {
    public final int K;
    public final boolean L;
    public final h M;
    public final Object N;
    public final Object O;
    public final m P;
    public final ActionsDelegate Q;
    public final RowDelegate R;
    public final IconSelectorDelegate S;
    public final FullScreenStateDelegate T;
    public final ListSubheaderDelegate U;
    public final TextDelegate V;
    public final CellDetailsInputDelegate W;
    public final CellDetailsAttachmentDelegate X;
    public final Object Y;
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(BrandingSettingsScreen.class, "binding", "getBinding()Lcom/revolut/feature/shared/branding/impl/databinding/ScreenBrandingSettingsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public BrandingSettingsScreen(BrandingSharedDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_branding_settings;
        this.L = true;
        this.M = s.t(this, c.f);
        this.N = w.y0(new b(this, inputData, 25));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: s6d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrandingSettingsScreen f260236b;

            {
                this.f260236b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BrandingSettingsScreen.Companion companion = BrandingSettingsScreen.INSTANCE;
                        return (l) ((o6d.e) ((t6d.a) this.f260236b.N.getValue())).f222559q.get();
                    default:
                        BrandingSettingsScreen.Companion companion2 = BrandingSettingsScreen.INSTANCE;
                        BrandingSettingsScreen brandingSettingsScreen = this.f260236b;
                        return dli.f.a(brandingSettingsScreen, brandingSettingsScreen.R2(), zhm.v.k(brandingSettingsScreen.Q, brandingSettingsScreen.U, brandingSettingsScreen.R, brandingSettingsScreen.S, brandingSettingsScreen.W, brandingSettingsScreen.T, new RowLoadingDelegate(), brandingSettingsScreen.X, brandingSettingsScreen.V), R$id.brandingSettings_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new m(5);
        this.Q = new ActionsDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = new IconSelectorDelegate();
        this.T = new FullScreenStateDelegate();
        this.U = new ListSubheaderDelegate();
        this.V = new TextDelegate();
        this.W = new CellDetailsInputDelegate(new f(this, 7));
        this.X = new CellDetailsAttachmentDelegate();
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: s6d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrandingSettingsScreen f260236b;

            {
                this.f260236b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BrandingSettingsScreen.Companion companion = BrandingSettingsScreen.INSTANCE;
                        return (l) ((o6d.e) ((t6d.a) this.f260236b.N.getValue())).f222559q.get();
                    default:
                        BrandingSettingsScreen.Companion companion2 = BrandingSettingsScreen.INSTANCE;
                        BrandingSettingsScreen brandingSettingsScreen = this.f260236b;
                        return dli.f.a(brandingSettingsScreen, brandingSettingsScreen.R2(), zhm.v.k(brandingSettingsScreen.Q, brandingSettingsScreen.U, brandingSettingsScreen.R, brandingSettingsScreen.S, brandingSettingsScreen.W, brandingSettingsScreen.T, new RowLoadingDelegate(), brandingSettingsScreen.X, brandingSettingsScreen.V), R$id.brandingSettings_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        s6d.m uiState = (s6d.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        TwinHorizontalButton brandingSettingsButton = d3().f203051b;
        Intrinsics.checkNotNullExpressionValue(brandingSettingsButton, "brandingSettingsButton");
        boolean z = uiState.f260245b;
        boolean z3 = uiState.f260246c;
        brandingSettingsButton.setVisibility(z ? 0 : 8);
        d3().f203051b.setPrimaryButtonEnabled(z3);
        d3().f203051b.setSecondaryButtonEnabled(z3);
        d3().f203051b.setPrimaryButtonVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t6d.a) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f203052c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.merchant_profile_branding_screen_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.merchant_profile_branding_screen_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.merchant_profile_branding_screen_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "BRANDING_MENU_ID", new ResourceImage(R$drawable.uikit_icn_24_more, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        TwinHorizontalButton twinHorizontalButton = d3().f203051b;
        twinHorizontalButton.setPrimaryButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_eye, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        twinHorizontalButton.setPrimaryButtonStyle(defaultFilledButton);
        twinHorizontalButton.setPrimaryButtonWeight(0.16666667f);
        twinHorizontalButton.setSecondaryButtonStyle(defaultFilledButton);
        twinHorizontalButton.setSecondaryButtonWeight(0.8333333f);
        twinHorizontalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.merchant_profile_branding_screen_action, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f203052c.f59410q), null, new g(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f203052c.o.f57403b), null, new s6d.f(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f203051b.c()), null, new g(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f203051b.d()), null, new g(this, continuation, 2), 3);
        r rVarMergeWith = this.S.f52489c.d.map(new s65.o(new s65.r(3), 1)).mergeWith(this.Q.f51611c.f121375b.map(new s65.o(new s65.r(4), 2)));
        RowDelegate rowDelegate = this.R;
        r rVarMergeWith2 = rVarMergeWith.mergeWith(rowDelegate.f53218h).mergeWith(this.U.f52707c);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith2, "mergeWith(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeWith2), null, new s6d.f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.d), null, new s6d.f(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53225r), null, new s6d.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53220l), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f52371h.f121375b), null, new s6d.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.f51808c), null, new s6d.f(this, continuation, 0), 3);
    }

    public final m6d.a d3() {
        ViewBinding value = this.M.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m6d.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
