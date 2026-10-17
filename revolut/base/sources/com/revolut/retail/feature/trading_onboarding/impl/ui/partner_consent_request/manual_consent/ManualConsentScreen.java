package com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.manual_consent;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.trading_onboarding.impl.R$id;
import com.revolut.retail.feature.trading_onboarding.impl.R$layout;
import com.revolut.retail.feature.trading_onboarding.impl.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.manual_consent.ManualConsentScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kyk.o;
import kyk.v;
import no.m;
import rd0.e;
import sx2.r;
import szl.a;
import t0l.b;
import t0l.f;
import t0l.g;
import t0l.j;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/manual_consent/ManualConsentScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lt0l/g;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lt0l/f;", "Lno/m;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManualConsentScreen extends BaseRecyclerViewScreen<g, IOData$EmptyInput, f> implements m {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f104274d0 = {o0.f186429a.j(new h0(ManualConsentScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/trading_onboarding/impl/databinding/ScreenManualConsentBinding;", 0))};
    public final h U;
    public final Object V;
    public final Object W;
    public final boolean X;
    public final Object Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f104275a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f104276b0;
    public final AnalyticsProduct c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualConsentScreen(ManualConsentScreenContract$InputData inputData) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = w.y0(new a(1));
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: t0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualConsentScreen f267041b;

            {
                this.f267041b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ManualConsentScreen manualConsentScreen = this.f267041b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManualConsentScreen.f104274d0;
                        qji.b bVarQ2 = manualConsentScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.manual_consent.di.ManualConsentScreenInjector");
                        v vVar = ((o) bVarQ2).f190964b;
                        kyk.g gVar = new kyk.g();
                        gVar.f190942a = e4m.b.b(new kr9.m(vVar, gVar, 1, 14));
                        gVar.f190943b = e4m.b.b(new kr9.m(vVar, gVar, 0, 14));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = ManualConsentScreen.f104274d0;
                        return (j) ((kyk.g) manualConsentScreen.W.getValue()).f190943b.get();
                    default:
                        KProperty[] kPropertyArr3 = ManualConsentScreen.f104274d0;
                        return u.c((TextDelegate) manualConsentScreen.V.getValue());
                }
            }
        });
        this.X = true;
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: t0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualConsentScreen f267041b;

            {
                this.f267041b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ManualConsentScreen manualConsentScreen = this.f267041b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManualConsentScreen.f104274d0;
                        qji.b bVarQ2 = manualConsentScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.manual_consent.di.ManualConsentScreenInjector");
                        v vVar = ((o) bVarQ2).f190964b;
                        kyk.g gVar = new kyk.g();
                        gVar.f190942a = e4m.b.b(new kr9.m(vVar, gVar, 1, 14));
                        gVar.f190943b = e4m.b.b(new kr9.m(vVar, gVar, 0, 14));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = ManualConsentScreen.f104274d0;
                        return (j) ((kyk.g) manualConsentScreen.W.getValue()).f190943b.get();
                    default:
                        KProperty[] kPropertyArr3 = ManualConsentScreen.f104274d0;
                        return u.c((TextDelegate) manualConsentScreen.V.getValue());
                }
            }
        });
        this.Z = R$layout.screen_manual_consent;
        this.f104275a0 = R$id.manualConsentScreen_recyclerView;
        final int i3 = 2;
        this.f104276b0 = w.y0(new Function0(this) { // from class: t0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualConsentScreen f267041b;

            {
                this.f267041b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ManualConsentScreen manualConsentScreen = this.f267041b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManualConsentScreen.f104274d0;
                        qji.b bVarQ2 = manualConsentScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.manual_consent.di.ManualConsentScreenInjector");
                        v vVar = ((o) bVarQ2).f190964b;
                        kyk.g gVar = new kyk.g();
                        gVar.f190942a = e4m.b.b(new kr9.m(vVar, gVar, 1, 14));
                        gVar.f190943b = e4m.b.b(new kr9.m(vVar, gVar, 0, 14));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = ManualConsentScreen.f104274d0;
                        return (j) ((kyk.g) manualConsentScreen.W.getValue()).f190943b.get();
                    default:
                        KProperty[] kPropertyArr3 = ManualConsentScreen.f104274d0;
                        return u.c((TextDelegate) manualConsentScreen.V.getValue());
                }
            }
        });
        this.c0 = inputData.f104277a.getE();
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getC0() {
        return this.c0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (kyk.g) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f169777c.f59410q), null, new t05.m(this, null, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f169776b.c()), null, new sqd.h0(this, null, 10), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TextDelegate) this.V.getValue()).d), null, new r(this, null, 3), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f169777c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.trading_onboarding_partner_consent_request_manual_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.trading_onboarding_partner_consent_request_manual_title, null, null, 14));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        TwinHorizontalButton twinHorizontalButton = h3().f169776b;
        twinHorizontalButton.setPrimaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinHorizontalButton.setPrimaryButtonText(new TextLocalisedClause(R$string.trading_onboarding_partner_consent_request_manual_primary_button, null, null, 14));
        twinHorizontalButton.setPrimaryButtonEnabled(true);
        twinHorizontalButton.setGradientBackgroundEnabled(true);
        twinHorizontalButton.setSecondaryButtonVisible(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75577b0() {
        return (List) this.f104276b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getF104275a0() {
        return this.f104275a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        TwinHorizontalButton twinHorizontalButton = h3().f169776b;
        if (uiState.f267045a) {
            twinHorizontalButton.setPrimaryButtonIcon(new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 12, (Clause) null, Integer.valueOf(R$attr.uikit_colorWhite)));
            twinHorizontalButton.setPrimaryButtonEnabled(false);
        } else {
            twinHorizontalButton.setPrimaryButtonEnabled(true);
            twinHorizontalButton.setPrimaryButtonIcon(null);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Z;
    }

    public final iyk.a h3() {
        ViewBinding value = this.U.getValue(this, f104274d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (iyk.a) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
