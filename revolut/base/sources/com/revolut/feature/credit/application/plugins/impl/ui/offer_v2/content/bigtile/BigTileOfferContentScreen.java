package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.bigtile;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.s0;
import aw3.g;
import bx4.c;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.bigtile.BigTileOfferContentScreen;
import com.revolut.feature.credit.core.R$string;
import dli.a;
import dw3.u8;
import dw3.v8;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import p6.e;
import pf4.n;
import pf4.o;
import pf4.t;
import qf4.b;
import qf4.d;
import rr0.f;
import te0.w;
import vc.s;
import yhm.m;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/content/bigtile/BigTileOfferContentScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lpf4/n;", "Ldli/a;", "Lpf4/u;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BigTileOfferContentScreen extends PluginScreenController<n> implements a, c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(BigTileOfferContentScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditOfferWithBigTileBinding;", 0))};
    public final OfferContentScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final FullScreenStateDelegate R;
    public f S;

    public BigTileOfferContentScreen(OfferContentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_offer_with_big_tile;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BigTileOfferContentScreen f245238b;

            {
                this.f245238b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BigTileOfferContentScreen bigTileOfferContentScreen = this.f245238b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BigTileOfferContentScreen.T;
                        qji.b bVarU2 = bigTileOfferContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.bigtile.di.BigTileOfferContentScreenInjector");
                        u8 u8Var = (u8) ((rf4.a) bVarU2).G().mo3808a(bigTileOfferContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = bigTileOfferContentScreen.L;
                        switch (u8Var.f119942a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                u8Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                u8Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (v8) u8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BigTileOfferContentScreen.T;
                        v8 v8Var = (v8) bigTileOfferContentScreen.N.getValue();
                        switch (v8Var.f120025a) {
                            case 0:
                                return (o) v8Var.k.get();
                            default:
                                return (o) v8Var.k.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BigTileOfferContentScreen.T;
                        BigTileOfferContentScreen bigTileOfferContentScreen2 = this.f245238b;
                        return dli.f.a(bigTileOfferContentScreen2, bigTileOfferContentScreen2.d(), d0.E0(u.c(bigTileOfferContentScreen2.R), ((v8) bigTileOfferContentScreen2.N.getValue()).c().Q()), R$id.creditOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BigTileOfferContentScreen f245238b;

            {
                this.f245238b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BigTileOfferContentScreen bigTileOfferContentScreen = this.f245238b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BigTileOfferContentScreen.T;
                        qji.b bVarU2 = bigTileOfferContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.bigtile.di.BigTileOfferContentScreenInjector");
                        u8 u8Var = (u8) ((rf4.a) bVarU2).G().mo3808a(bigTileOfferContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = bigTileOfferContentScreen.L;
                        switch (u8Var.f119942a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                u8Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                u8Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (v8) u8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BigTileOfferContentScreen.T;
                        v8 v8Var = (v8) bigTileOfferContentScreen.N.getValue();
                        switch (v8Var.f120025a) {
                            case 0:
                                return (o) v8Var.k.get();
                            default:
                                return (o) v8Var.k.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BigTileOfferContentScreen.T;
                        BigTileOfferContentScreen bigTileOfferContentScreen2 = this.f245238b;
                        return dli.f.a(bigTileOfferContentScreen2, bigTileOfferContentScreen2.d(), d0.E0(u.c(bigTileOfferContentScreen2.R), ((v8) bigTileOfferContentScreen2.N.getValue()).c().Q()), R$id.creditOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, qf4.c.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BigTileOfferContentScreen f245238b;

            {
                this.f245238b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BigTileOfferContentScreen bigTileOfferContentScreen = this.f245238b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BigTileOfferContentScreen.T;
                        qji.b bVarU2 = bigTileOfferContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.bigtile.di.BigTileOfferContentScreenInjector");
                        u8 u8Var = (u8) ((rf4.a) bVarU2).G().mo3808a(bigTileOfferContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = bigTileOfferContentScreen.L;
                        switch (u8Var.f119942a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                u8Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                u8Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (v8) u8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BigTileOfferContentScreen.T;
                        v8 v8Var = (v8) bigTileOfferContentScreen.N.getValue();
                        switch (v8Var.f120025a) {
                            case 0:
                                return (o) v8Var.k.get();
                            default:
                                return (o) v8Var.k.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BigTileOfferContentScreen.T;
                        BigTileOfferContentScreen bigTileOfferContentScreen2 = this.f245238b;
                        return dli.f.a(bigTileOfferContentScreen2, bigTileOfferContentScreen2.d(), d0.E0(u.c(bigTileOfferContentScreen2.R), ((v8) bigTileOfferContentScreen2.N.getValue()).c().Q()), R$id.creditOffer_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new FullScreenStateDelegate();
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) throws Throwable {
        Object objA;
        pf4.u uiState = (pf4.u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        try {
            m.Companion companion = m.INSTANCE;
            t tVar = uiState.f235463b;
            Intrinsics.i(tVar, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract.UIState.HeaderContent.WithBigTile");
            pf4.s sVar = (pf4.s) tVar;
            e3().setTitle(sVar.f235460b);
            e3().setNavigationButtonIcon(sVar.f235459a);
            e3().setDescription(sVar.f235461c);
            e3().post(new e(this, sVar, 7));
            e3().setToolbarTagView(sVar.e);
            e3().setMenuItems(sVar.f);
            objA = Unit.f186387a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TwinVerticalButton creditOfferTwinVerticalButton = ((g) value).d;
        Intrinsics.checkNotNullExpressionValue(creditOfferTwinVerticalButton, "creditOfferTwinVerticalButton");
        boolean z = uiState.f;
        boolean z3 = uiState.f235464c;
        creditOfferTwinVerticalButton.setMainButtonVisible(z);
        Clause clause = uiState.d;
        creditOfferTwinVerticalButton.setFabEnabled(clause != null);
        creditOfferTwinVerticalButton.setMainButtonText(clause);
        int i = b.f245239a[this.L.f.ordinal()];
        if (i == 1) {
            f fVar = this.S;
            if (fVar != null) {
                fVar.b(z3);
                return;
            } else {
                Intrinsics.r("mainButtonLoadingController");
                throw null;
            }
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        f fVar2 = this.S;
        if (fVar2 != null) {
            fVar2.c(z3);
        } else {
            Intrinsics.r("mainButtonLoadingController");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        o.g0(d());
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v8) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        e3().setLayoutType(s0.CENTERED_HORIZONTALLY);
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TwinVerticalButton creditOfferTwinVerticalButton = ((g) value).d;
        Intrinsics.checkNotNullExpressionValue(creditOfferTwinVerticalButton, "creditOfferTwinVerticalButton");
        creditOfferTwinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.credit_application_quick_scroll_action, null, null, 14), LDSFile.EF_DG4_TAG));
        creditOfferTwinVerticalButton.setMainButtonVisible(false);
        creditOfferTwinVerticalButton.setSecondaryButtonVisible(false);
        creditOfferTwinVerticalButton.setCollapsible(true);
        this.S = creditOfferTwinVerticalButton.l0();
        ((dli.c) this.Q.getValue()).h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f59357t), null, new qf4.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().b()), null, new qc3.c(this, null, 12), 3);
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TwinVerticalButton creditOfferTwinVerticalButton = ((g) value).d;
        Intrinsics.checkNotNullExpressionValue(creditOfferTwinVerticalButton, "creditOfferTwinVerticalButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(creditOfferTwinVerticalButton.o0()), null, new qf4.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(creditOfferTwinVerticalButton.m0()), null, new qf4.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final o d() {
        return (o) this.O.getValue();
    }

    public final NavBarWithBigTile e3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile creditOfferNavBarWithBigTile = ((g) value).f10686b;
        Intrinsics.checkNotNullExpressionValue(creditOfferNavBarWithBigTile, "creditOfferNavBarWithBigTile");
        return creditOfferNavBarWithBigTile;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
