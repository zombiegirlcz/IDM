package com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation;

import ah1.c;
import ah1.h;
import ah1.i;
import ah1.j;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import in0.g;
import jii.x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import og1.d;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/confirmation/GooglePayConfirmationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lah1/h;", "Ldli/a;", "Lah1/j;", "Lin0/g;", "Companion", "a", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GooglePayConfirmationController extends ViewController<h> implements dli.a, g {
    public final GooglePayConfirmationControllerContract$InputData K;
    public final int L;
    public final ao.h M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(GooglePayConfirmationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public GooglePayConfirmationController(GooglePayConfirmationControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_two_buttons;
        this.M = s.t(this, ah1.b.f);
        this.N = true;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ah1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayConfirmationController f4850b;

            {
                this.f4850b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iK;
                int i2 = i;
                GooglePayConfirmationController googlePayConfirmationController = this.f4850b;
                switch (i2) {
                    case 0:
                        GooglePayConfirmationController.Companion companion = GooglePayConfirmationController.INSTANCE;
                        qji.b bVarU2 = googlePayConfirmationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.di.GooglePayConfirmationControllerInjector");
                        og1.e eVar = (og1.e) bVarU2;
                        og1.i iVar = eVar.f224967b;
                        og1.e eVar2 = eVar.f224968c;
                        GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData = googlePayConfirmationController.K;
                        googlePayConfirmationControllerContract$InputData.getClass();
                        return new og1.d(iVar, eVar2, googlePayConfirmationController, googlePayConfirmationControllerContract$InputData);
                    case 1:
                        GooglePayConfirmationController.Companion companion2 = GooglePayConfirmationController.INSTANCE;
                        return (d) ((og1.d) googlePayConfirmationController.O.getValue()).e.get();
                    default:
                        GooglePayConfirmationController googlePayConfirmationController2 = this.f4850b;
                        ?? r06 = googlePayConfirmationController2.O;
                        GooglePayConfirmationController.Companion companion3 = GooglePayConfirmationController.INSTANCE;
                        d dVar = (d) googlePayConfirmationController2.P.getValue();
                        GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData2 = googlePayConfirmationController2.K;
                        if (googlePayConfirmationControllerContract$InputData2 instanceof GooglePayConfirmationControllerContract$InputData.Confirmation) {
                            iK = (int) (((c90.c) ((og1.d) r06.getValue()).d.get()).c() * 0.8f);
                        } else {
                            if (!(googlePayConfirmationControllerContract$InputData2 instanceof GooglePayConfirmationControllerContract$InputData.RevivalConfirmation)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iK = kli.a.k(((c90.c) ((og1.d) r06.getValue()).d.get()).f22265a, 170.0f);
                        }
                        return dli.f.a(googlePayConfirmationController2, dVar, v.k(new NewRevolutCardDelegate(iK), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ah1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayConfirmationController f4850b;

            {
                this.f4850b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iK;
                int i22 = i2;
                GooglePayConfirmationController googlePayConfirmationController = this.f4850b;
                switch (i22) {
                    case 0:
                        GooglePayConfirmationController.Companion companion = GooglePayConfirmationController.INSTANCE;
                        qji.b bVarU2 = googlePayConfirmationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.di.GooglePayConfirmationControllerInjector");
                        og1.e eVar = (og1.e) bVarU2;
                        og1.i iVar = eVar.f224967b;
                        og1.e eVar2 = eVar.f224968c;
                        GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData = googlePayConfirmationController.K;
                        googlePayConfirmationControllerContract$InputData.getClass();
                        return new og1.d(iVar, eVar2, googlePayConfirmationController, googlePayConfirmationControllerContract$InputData);
                    case 1:
                        GooglePayConfirmationController.Companion companion2 = GooglePayConfirmationController.INSTANCE;
                        return (d) ((og1.d) googlePayConfirmationController.O.getValue()).e.get();
                    default:
                        GooglePayConfirmationController googlePayConfirmationController2 = this.f4850b;
                        ?? r06 = googlePayConfirmationController2.O;
                        GooglePayConfirmationController.Companion companion3 = GooglePayConfirmationController.INSTANCE;
                        d dVar = (d) googlePayConfirmationController2.P.getValue();
                        GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData2 = googlePayConfirmationController2.K;
                        if (googlePayConfirmationControllerContract$InputData2 instanceof GooglePayConfirmationControllerContract$InputData.Confirmation) {
                            iK = (int) (((c90.c) ((og1.d) r06.getValue()).d.get()).c() * 0.8f);
                        } else {
                            if (!(googlePayConfirmationControllerContract$InputData2 instanceof GooglePayConfirmationControllerContract$InputData.RevivalConfirmation)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iK = kli.a.k(((c90.c) ((og1.d) r06.getValue()).d.get()).f22265a, 170.0f);
                        }
                        return dli.f.a(googlePayConfirmationController2, dVar, v.k(new NewRevolutCardDelegate(iK), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ah1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayConfirmationController f4850b;

            {
                this.f4850b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iK;
                int i22 = i3;
                GooglePayConfirmationController googlePayConfirmationController = this.f4850b;
                switch (i22) {
                    case 0:
                        GooglePayConfirmationController.Companion companion = GooglePayConfirmationController.INSTANCE;
                        qji.b bVarU2 = googlePayConfirmationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.di.GooglePayConfirmationControllerInjector");
                        og1.e eVar = (og1.e) bVarU2;
                        og1.i iVar = eVar.f224967b;
                        og1.e eVar2 = eVar.f224968c;
                        GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData = googlePayConfirmationController.K;
                        googlePayConfirmationControllerContract$InputData.getClass();
                        return new og1.d(iVar, eVar2, googlePayConfirmationController, googlePayConfirmationControllerContract$InputData);
                    case 1:
                        GooglePayConfirmationController.Companion companion2 = GooglePayConfirmationController.INSTANCE;
                        return (d) ((og1.d) googlePayConfirmationController.O.getValue()).e.get();
                    default:
                        GooglePayConfirmationController googlePayConfirmationController2 = this.f4850b;
                        ?? r06 = googlePayConfirmationController2.O;
                        GooglePayConfirmationController.Companion companion3 = GooglePayConfirmationController.INSTANCE;
                        d dVar = (d) googlePayConfirmationController2.P.getValue();
                        GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData2 = googlePayConfirmationController2.K;
                        if (googlePayConfirmationControllerContract$InputData2 instanceof GooglePayConfirmationControllerContract$InputData.Confirmation) {
                            iK = (int) (((c90.c) ((og1.d) r06.getValue()).d.get()).c() * 0.8f);
                        } else {
                            if (!(googlePayConfirmationControllerContract$InputData2 instanceof GooglePayConfirmationControllerContract$InputData.RevivalConfirmation)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iK = kli.a.k(((c90.c) ((og1.d) r06.getValue()).d.get()).f22265a, 170.0f);
                        }
                        return dli.f.a(googlePayConfirmationController2, dVar, v.k(new NewRevolutCardDelegate(iK), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        boolean z = uiState.f4860b;
        i iVar = qVar instanceof i ? (i) qVar : null;
        if (pd.b.k(iVar != null ? Boolean.valueOf(iVar.f4858b) : null)) {
            NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = d3().f174574c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
            screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setTitle(uiState.f4861c, null);
        }
        if (pd.b.k(iVar != null ? Boolean.valueOf(iVar.f4857a) : null)) {
            d3().f174573b.setEnabled(z);
            d3().e.setEnabled(z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ah1.d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton largeActionButton = d3().f174573b;
        largeActionButton.setText(new TextLocalisedClause(R$string.common_action_confirm, null, null, 14));
        largeActionButton.setEnabled(false);
        LargeActionButton largeActionButton2 = d3().e;
        largeActionButton2.setText(new TextLocalisedClause(R$string.common_action_not_now, null, null, 14));
        largeActionButton2.o(LargeActionButton.ButtonStyle.f58726b);
        largeActionButton2.setEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new c(this, null, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
