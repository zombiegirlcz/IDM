package com.revolut.feature.external_accounts.impl.ui.link.penny_topup.payment_initiation_service;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.payment_initiation_service.PaymentInitiationServiceScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kn6.b;
import kn6.c;
import kn6.d;
import kn6.f;
import kn6.k;
import kn6.l;
import kn6.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xf6.g0;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/payment_initiation_service/PaymentInitiationServiceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkn6/k;", "Ldli/a;", "Lkn6/l;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentInitiationServiceScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PaymentInitiationServiceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};
    public final f K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final h P;

    public PaymentInitiationServiceScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: kn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentInitiationServiceScreen f186012b;

            {
                this.f186012b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentInitiationServiceScreen paymentInitiationServiceScreen = this.f186012b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentInitiationServiceScreen.Q;
                        qji.b bVarU2 = paymentInitiationServiceScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.penny_topup.payment_initiation_service.di.PaymentInitiationServiceScreenInjector");
                        }
                        xf6.h0 h0Var = ((xf6.h0) bVarU2).f304872c;
                        f fVar = paymentInitiationServiceScreen.K;
                        fVar.getClass();
                        return new g0(h0Var, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentInitiationServiceScreen.Q;
                        g0 g0Var = (g0) paymentInitiationServiceScreen.L.getValue();
                        return new n(g0Var.f304857a, (mn6.a) g0Var.f304858b.d.get(), new o());
                    default:
                        KProperty[] kPropertyArr3 = PaymentInitiationServiceScreen.Q;
                        PaymentInitiationServiceScreen paymentInitiationServiceScreen2 = this.f186012b;
                        return dli.f.a(paymentInitiationServiceScreen2, (n) paymentInitiationServiceScreen2.M.getValue(), v.k(new SimpleMediaDelegate(), new ListCellDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: kn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentInitiationServiceScreen f186012b;

            {
                this.f186012b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentInitiationServiceScreen paymentInitiationServiceScreen = this.f186012b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentInitiationServiceScreen.Q;
                        qji.b bVarU2 = paymentInitiationServiceScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.penny_topup.payment_initiation_service.di.PaymentInitiationServiceScreenInjector");
                        }
                        xf6.h0 h0Var = ((xf6.h0) bVarU2).f304872c;
                        f fVar = paymentInitiationServiceScreen.K;
                        fVar.getClass();
                        return new g0(h0Var, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentInitiationServiceScreen.Q;
                        g0 g0Var = (g0) paymentInitiationServiceScreen.L.getValue();
                        return new n(g0Var.f304857a, (mn6.a) g0Var.f304858b.d.get(), new o());
                    default:
                        KProperty[] kPropertyArr3 = PaymentInitiationServiceScreen.Q;
                        PaymentInitiationServiceScreen paymentInitiationServiceScreen2 = this.f186012b;
                        return dli.f.a(paymentInitiationServiceScreen2, (n) paymentInitiationServiceScreen2.M.getValue(), v.k(new SimpleMediaDelegate(), new ListCellDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: kn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentInitiationServiceScreen f186012b;

            {
                this.f186012b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentInitiationServiceScreen paymentInitiationServiceScreen = this.f186012b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentInitiationServiceScreen.Q;
                        qji.b bVarU2 = paymentInitiationServiceScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.penny_topup.payment_initiation_service.di.PaymentInitiationServiceScreenInjector");
                        }
                        xf6.h0 h0Var = ((xf6.h0) bVarU2).f304872c;
                        f fVar = paymentInitiationServiceScreen.K;
                        fVar.getClass();
                        return new g0(h0Var, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentInitiationServiceScreen.Q;
                        g0 g0Var = (g0) paymentInitiationServiceScreen.L.getValue();
                        return new n(g0Var.f304857a, (mn6.a) g0Var.f304858b.d.get(), new o());
                    default:
                        KProperty[] kPropertyArr3 = PaymentInitiationServiceScreen.Q;
                        PaymentInitiationServiceScreen paymentInitiationServiceScreen2 = this.f186012b;
                        return dli.f.a(paymentInitiationServiceScreen2, (n) paymentInitiationServiceScreen2.M.getValue(), v.k(new SimpleMediaDelegate(), new ListCellDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((l) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.external_institutions_penny_topup_payment_initiation_intro_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.external_institutions_penny_topup_payment_initiation_intro_subtitle_with_bankname, u.c(new TextClause(this.K.f186017b.f66108b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(textLocalisedClause2);
        navBarWithToolbar.setDescriptionVisible(true);
        CollapsingActionButton collapsingActionButton = d3().f174551b;
        collapsingActionButton.setLargeButtonText(new TextLocalisedClause(R$string.external_institutions_penny_topup_payment_initiation_intro_continue, null, null, 14));
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174552c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.d()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.c()), new c(this, null, 1), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
