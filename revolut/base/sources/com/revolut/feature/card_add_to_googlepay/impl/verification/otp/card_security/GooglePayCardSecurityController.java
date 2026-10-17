package com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_add_to_googlepay.impl.R$string;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security.GooglePayCardSecurityController;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security.GooglePayCardSecurityScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fw2.f;
import jii.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qw2.b;
import qw2.c;
import qw2.j;
import qw2.l;
import qw2.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/otp/card_security/GooglePayCardSecurityController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqw2/l;", "Ldli/a;", "Lqw2/m;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GooglePayCardSecurityController extends ViewController<l> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(GooglePayCardSecurityController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final GooglePayCardSecurityScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;

    public GooglePayCardSecurityController(GooglePayCardSecurityScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qw2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayCardSecurityController f249746b;

            {
                this.f249746b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GooglePayCardSecurityController googlePayCardSecurityController = this.f249746b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayCardSecurityController.Q;
                        qji.b bVarU2 = googlePayCardSecurityController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security.di.GooglePayCardSecurityControllerInjector");
                        fw2.h hVar = (fw2.h) bVarU2;
                        fw2.d dVar = hVar.f138544b;
                        fw2.h hVar2 = hVar.f138545c;
                        GooglePayCardSecurityScreenContract$InputData googlePayCardSecurityScreenContract$InputData = googlePayCardSecurityController.K;
                        googlePayCardSecurityScreenContract$InputData.getClass();
                        return new fw2.f(dVar, hVar2, googlePayCardSecurityController, googlePayCardSecurityScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayCardSecurityController.Q;
                        return (j) ((fw2.f) googlePayCardSecurityController.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayCardSecurityController.Q;
                        GooglePayCardSecurityController googlePayCardSecurityController2 = this.f249746b;
                        return dli.f.a(googlePayCardSecurityController2, (j) googlePayCardSecurityController2.O.getValue(), v.k(new NewRevolutCardDelegate((int) (((c90.c) ((fw2.f) googlePayCardSecurityController2.L.getValue()).d.get()).c() * 0.8f)), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar_two_buttons;
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qw2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayCardSecurityController f249746b;

            {
                this.f249746b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GooglePayCardSecurityController googlePayCardSecurityController = this.f249746b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayCardSecurityController.Q;
                        qji.b bVarU2 = googlePayCardSecurityController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security.di.GooglePayCardSecurityControllerInjector");
                        fw2.h hVar = (fw2.h) bVarU2;
                        fw2.d dVar = hVar.f138544b;
                        fw2.h hVar2 = hVar.f138545c;
                        GooglePayCardSecurityScreenContract$InputData googlePayCardSecurityScreenContract$InputData = googlePayCardSecurityController.K;
                        googlePayCardSecurityScreenContract$InputData.getClass();
                        return new fw2.f(dVar, hVar2, googlePayCardSecurityController, googlePayCardSecurityScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayCardSecurityController.Q;
                        return (j) ((fw2.f) googlePayCardSecurityController.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayCardSecurityController.Q;
                        GooglePayCardSecurityController googlePayCardSecurityController2 = this.f249746b;
                        return dli.f.a(googlePayCardSecurityController2, (j) googlePayCardSecurityController2.O.getValue(), v.k(new NewRevolutCardDelegate((int) (((c90.c) ((fw2.f) googlePayCardSecurityController2.L.getValue()).d.get()).c() * 0.8f)), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: qw2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayCardSecurityController f249746b;

            {
                this.f249746b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GooglePayCardSecurityController googlePayCardSecurityController = this.f249746b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayCardSecurityController.Q;
                        qji.b bVarU2 = googlePayCardSecurityController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security.di.GooglePayCardSecurityControllerInjector");
                        fw2.h hVar = (fw2.h) bVarU2;
                        fw2.d dVar = hVar.f138544b;
                        fw2.h hVar2 = hVar.f138545c;
                        GooglePayCardSecurityScreenContract$InputData googlePayCardSecurityScreenContract$InputData = googlePayCardSecurityController.K;
                        googlePayCardSecurityScreenContract$InputData.getClass();
                        return new fw2.f(dVar, hVar2, googlePayCardSecurityController, googlePayCardSecurityScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayCardSecurityController.Q;
                        return (j) ((fw2.f) googlePayCardSecurityController.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayCardSecurityController.Q;
                        GooglePayCardSecurityController googlePayCardSecurityController2 = this.f249746b;
                        return dli.f.a(googlePayCardSecurityController2, (j) googlePayCardSecurityController2.O.getValue(), v.k(new NewRevolutCardDelegate((int) (((c90.c) ((fw2.f) googlePayCardSecurityController2.L.getValue()).d.get()).c() * 0.8f)), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((m) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.xpay_card_security_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.xpay_card_security_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f174573b.setText(new TextLocalisedClause(R$string.xpay_card_security_primary_button, null, null, 14));
        LargeActionButton largeActionButton = d3().e;
        largeActionButton.setText(new TextLocalisedClause(R$string.xpay_card_security_secondary_button, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f);
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
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
