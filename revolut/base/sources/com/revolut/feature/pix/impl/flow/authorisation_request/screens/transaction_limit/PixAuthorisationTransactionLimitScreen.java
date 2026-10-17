package com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$id;
import com.revolut.feature.pix.impl.R$layout;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import org.jetbrains.annotations.NotNull;
import p8a.e1;
import r6f.i;
import r9a.b;
import r9a.c;
import r9a.g;
import r9a.k;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/transaction_limit/PixAuthorisationTransactionLimitScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lr9a/g;", "Ldli/a;", "Lr9a/h;", "Lno/d1;", "Companion", "a", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAuthorisationTransactionLimitScreen extends ViewController<g> implements a, d1 {
    public final PixAuthorisationTransactionLimitScreenContract$InputData K;
    public final CenteredAmountDelegate L;
    public final Lazy M;
    public final Lazy N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PixAuthorisationTransactionLimitScreen.class, "binding", "getBinding()Lcom/revolut/feature/pix/impl/databinding/ScreenPixAuthorisationTransactionLimitBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PixAuthorisationTransactionLimitScreen(PixAuthorisationTransactionLimitScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new CenteredAmountDelegate(new i(this, 8));
        this.M = j.b(new r4k.a(18));
        this.N = j.b(new r4k.a(19));
        this.O = R$layout.screen_pix_authorisation_transaction_limit;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: r9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationTransactionLimitScreen f252543b;

            {
                this.f252543b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixAuthorisationTransactionLimitScreen pixAuthorisationTransactionLimitScreen = this.f252543b;
                switch (i2) {
                    case 0:
                        PixAuthorisationTransactionLimitScreen.Companion companion = PixAuthorisationTransactionLimitScreen.INSTANCE;
                        e1 e1Var = (e1) pixAuthorisationTransactionLimitScreen.S.getValue();
                        switch (e1Var.f233954a) {
                            case 0:
                                return (k) e1Var.e.get();
                            default:
                                return (k) e1Var.e.get();
                        }
                    case 1:
                        PixAuthorisationTransactionLimitScreen.Companion companion2 = PixAuthorisationTransactionLimitScreen.INSTANCE;
                        PixAuthorisationTransactionLimitScreen pixAuthorisationTransactionLimitScreen2 = this.f252543b;
                        return dli.f.a(pixAuthorisationTransactionLimitScreen2, pixAuthorisationTransactionLimitScreen2.e3(), v.k(pixAuthorisationTransactionLimitScreen2.L, (InputTextDelegate) pixAuthorisationTransactionLimitScreen2.M.getValue(), (LargeActionButtonDelegate) pixAuthorisationTransactionLimitScreen2.N.getValue()), R$id.pixQrCodeTransactionLimitScreen_recyclerView, null, null, null, 56);
                    default:
                        PixAuthorisationTransactionLimitScreen.Companion companion3 = PixAuthorisationTransactionLimitScreen.INSTANCE;
                        qji.b bVarU2 = pixAuthorisationTransactionLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.di.PixAuthorisationTransactionLimitScreenInjector");
                        p8a.d1 d1Var = (p8a.d1) ((s9a.a) bVarU2).b().mo3808a(pixAuthorisationTransactionLimitScreen);
                        PixAuthorisationTransactionLimitScreenContract$InputData pixAuthorisationTransactionLimitScreenContract$InputData = pixAuthorisationTransactionLimitScreen.K;
                        switch (d1Var.f233946a) {
                            case 0:
                                pixAuthorisationTransactionLimitScreenContract$InputData.getClass();
                                d1Var.d = pixAuthorisationTransactionLimitScreenContract$InputData;
                                break;
                            default:
                                pixAuthorisationTransactionLimitScreenContract$InputData.getClass();
                                d1Var.d = pixAuthorisationTransactionLimitScreenContract$InputData;
                                break;
                        }
                        return (e1) d1Var.mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: r9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationTransactionLimitScreen f252543b;

            {
                this.f252543b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixAuthorisationTransactionLimitScreen pixAuthorisationTransactionLimitScreen = this.f252543b;
                switch (i22) {
                    case 0:
                        PixAuthorisationTransactionLimitScreen.Companion companion = PixAuthorisationTransactionLimitScreen.INSTANCE;
                        e1 e1Var = (e1) pixAuthorisationTransactionLimitScreen.S.getValue();
                        switch (e1Var.f233954a) {
                            case 0:
                                return (k) e1Var.e.get();
                            default:
                                return (k) e1Var.e.get();
                        }
                    case 1:
                        PixAuthorisationTransactionLimitScreen.Companion companion2 = PixAuthorisationTransactionLimitScreen.INSTANCE;
                        PixAuthorisationTransactionLimitScreen pixAuthorisationTransactionLimitScreen2 = this.f252543b;
                        return dli.f.a(pixAuthorisationTransactionLimitScreen2, pixAuthorisationTransactionLimitScreen2.e3(), v.k(pixAuthorisationTransactionLimitScreen2.L, (InputTextDelegate) pixAuthorisationTransactionLimitScreen2.M.getValue(), (LargeActionButtonDelegate) pixAuthorisationTransactionLimitScreen2.N.getValue()), R$id.pixQrCodeTransactionLimitScreen_recyclerView, null, null, null, 56);
                    default:
                        PixAuthorisationTransactionLimitScreen.Companion companion3 = PixAuthorisationTransactionLimitScreen.INSTANCE;
                        qji.b bVarU2 = pixAuthorisationTransactionLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.di.PixAuthorisationTransactionLimitScreenInjector");
                        p8a.d1 d1Var = (p8a.d1) ((s9a.a) bVarU2).b().mo3808a(pixAuthorisationTransactionLimitScreen);
                        PixAuthorisationTransactionLimitScreenContract$InputData pixAuthorisationTransactionLimitScreenContract$InputData = pixAuthorisationTransactionLimitScreen.K;
                        switch (d1Var.f233946a) {
                            case 0:
                                pixAuthorisationTransactionLimitScreenContract$InputData.getClass();
                                d1Var.d = pixAuthorisationTransactionLimitScreenContract$InputData;
                                break;
                            default:
                                pixAuthorisationTransactionLimitScreenContract$InputData.getClass();
                                d1Var.d = pixAuthorisationTransactionLimitScreenContract$InputData;
                                break;
                        }
                        return (e1) d1Var.mo3783build();
                }
            }
        });
        this.R = s.t(this, b.f);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: r9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationTransactionLimitScreen f252543b;

            {
                this.f252543b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixAuthorisationTransactionLimitScreen pixAuthorisationTransactionLimitScreen = this.f252543b;
                switch (i22) {
                    case 0:
                        PixAuthorisationTransactionLimitScreen.Companion companion = PixAuthorisationTransactionLimitScreen.INSTANCE;
                        e1 e1Var = (e1) pixAuthorisationTransactionLimitScreen.S.getValue();
                        switch (e1Var.f233954a) {
                            case 0:
                                return (k) e1Var.e.get();
                            default:
                                return (k) e1Var.e.get();
                        }
                    case 1:
                        PixAuthorisationTransactionLimitScreen.Companion companion2 = PixAuthorisationTransactionLimitScreen.INSTANCE;
                        PixAuthorisationTransactionLimitScreen pixAuthorisationTransactionLimitScreen2 = this.f252543b;
                        return dli.f.a(pixAuthorisationTransactionLimitScreen2, pixAuthorisationTransactionLimitScreen2.e3(), v.k(pixAuthorisationTransactionLimitScreen2.L, (InputTextDelegate) pixAuthorisationTransactionLimitScreen2.M.getValue(), (LargeActionButtonDelegate) pixAuthorisationTransactionLimitScreen2.N.getValue()), R$id.pixQrCodeTransactionLimitScreen_recyclerView, null, null, null, 56);
                    default:
                        PixAuthorisationTransactionLimitScreen.Companion companion3 = PixAuthorisationTransactionLimitScreen.INSTANCE;
                        qji.b bVarU2 = pixAuthorisationTransactionLimitScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.di.PixAuthorisationTransactionLimitScreenInjector");
                        p8a.d1 d1Var = (p8a.d1) ((s9a.a) bVarU2).b().mo3808a(pixAuthorisationTransactionLimitScreen);
                        PixAuthorisationTransactionLimitScreenContract$InputData pixAuthorisationTransactionLimitScreenContract$InputData = pixAuthorisationTransactionLimitScreen.K;
                        switch (d1Var.f233946a) {
                            case 0:
                                pixAuthorisationTransactionLimitScreenContract$InputData.getClass();
                                d1Var.d = pixAuthorisationTransactionLimitScreenContract$InputData;
                                break;
                            default:
                                pixAuthorisationTransactionLimitScreenContract$InputData.getClass();
                                d1Var.d = pixAuthorisationTransactionLimitScreenContract$InputData;
                                break;
                        }
                        return (e1) d1Var.mo3783build();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r9a.h uiState = (r9a.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().d.setEnabled(uiState.f252550b);
        d3().f222968c.setMenuItems(uiState.f252551c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e1) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f222968c;
        Continuation continuation = null;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.pix_authorisation_request_single_transaction_limit, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(basicNavBar.f59211b), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(basicNavBar.f59210a.f57403b), null, new r5e.e(this, continuation, 14), 3);
        d3().f222967b.setTextClause(new TextLocalisedClause(R$string.pix_authorisation_request_transaction_limit_footer, null, null, 14));
        LargeActionButton largeActionButton = d3().d;
        largeActionButton.setText(new TextLocalisedClause(R$string.pix_authorisation_request_transaction_limit_cta_button_confirm, null, null, 14));
        largeActionButton.setLoadingButtonTag("CONTINUE_BUTTON_ID");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o), null, new c(this, continuation, 1), 3);
    }

    public final o8a.b d3() {
        ViewBinding value = this.R.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o8a.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final k d() {
        return (k) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
