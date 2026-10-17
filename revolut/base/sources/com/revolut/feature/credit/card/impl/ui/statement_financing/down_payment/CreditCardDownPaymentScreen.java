package com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment.CreditCardDownPaymentScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import exe.k;
import fb6.j;
import fw4.b;
import fw4.c;
import fw4.g;
import fw4.i;
import java.util.List;
import jm4.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/down_payment/CreditCardDownPaymentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfw4/g;", "Ldli/a;", "Lfw4/i;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardDownPaymentScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CreditCardDownPaymentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public CreditCardDownPaymentScreen(CreditCardDownPaymentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: fw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDownPaymentScreen f138572b;

            {
                this.f138572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardDownPaymentScreen creditCardDownPaymentScreen = this.f138572b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardDownPaymentScreen.R;
                        qd0.b languageProvider = ((x0) creditCardDownPaymentScreen.P.getValue()).f176430b.k.n();
                        s.j(languageProvider);
                        gw4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return new u80.d(((s80.b) languageProvider).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardDownPaymentScreen.R;
                        return new CenteredAmountDelegate(new fv1.a(creditCardDownPaymentScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardDownPaymentScreen.R;
                        CreditCardDownPaymentScreen creditCardDownPaymentScreen2 = this.f138572b;
                        return dli.f.a(creditCardDownPaymentScreen2, (j) creditCardDownPaymentScreen2.Q.getValue(), u.c((CenteredAmountDelegate) creditCardDownPaymentScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardDownPaymentScreen.R;
                        return (j) ((x0) creditCardDownPaymentScreen.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: fw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDownPaymentScreen f138572b;

            {
                this.f138572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardDownPaymentScreen creditCardDownPaymentScreen = this.f138572b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardDownPaymentScreen.R;
                        qd0.b languageProvider = ((x0) creditCardDownPaymentScreen.P.getValue()).f176430b.k.n();
                        s.j(languageProvider);
                        gw4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return new u80.d(((s80.b) languageProvider).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardDownPaymentScreen.R;
                        return new CenteredAmountDelegate(new fv1.a(creditCardDownPaymentScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardDownPaymentScreen.R;
                        CreditCardDownPaymentScreen creditCardDownPaymentScreen2 = this.f138572b;
                        return dli.f.a(creditCardDownPaymentScreen2, (j) creditCardDownPaymentScreen2.Q.getValue(), u.c((CenteredAmountDelegate) creditCardDownPaymentScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardDownPaymentScreen.R;
                        return (j) ((x0) creditCardDownPaymentScreen.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: fw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDownPaymentScreen f138572b;

            {
                this.f138572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardDownPaymentScreen creditCardDownPaymentScreen = this.f138572b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardDownPaymentScreen.R;
                        qd0.b languageProvider = ((x0) creditCardDownPaymentScreen.P.getValue()).f176430b.k.n();
                        s.j(languageProvider);
                        gw4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return new u80.d(((s80.b) languageProvider).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardDownPaymentScreen.R;
                        return new CenteredAmountDelegate(new fv1.a(creditCardDownPaymentScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardDownPaymentScreen.R;
                        CreditCardDownPaymentScreen creditCardDownPaymentScreen2 = this.f138572b;
                        return dli.f.a(creditCardDownPaymentScreen2, (j) creditCardDownPaymentScreen2.Q.getValue(), u.c((CenteredAmountDelegate) creditCardDownPaymentScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardDownPaymentScreen.R;
                        return (j) ((x0) creditCardDownPaymentScreen.P.getValue()).d.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = w.y0(new j(this, inputData, 27));
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: fw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDownPaymentScreen f138572b;

            {
                this.f138572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardDownPaymentScreen creditCardDownPaymentScreen = this.f138572b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardDownPaymentScreen.R;
                        qd0.b languageProvider = ((x0) creditCardDownPaymentScreen.P.getValue()).f176430b.k.n();
                        s.j(languageProvider);
                        gw4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return new u80.d(((s80.b) languageProvider).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardDownPaymentScreen.R;
                        return new CenteredAmountDelegate(new fv1.a(creditCardDownPaymentScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardDownPaymentScreen.R;
                        CreditCardDownPaymentScreen creditCardDownPaymentScreen2 = this.f138572b;
                        return dli.f.a(creditCardDownPaymentScreen2, (j) creditCardDownPaymentScreen2.Q.getValue(), u.c((CenteredAmountDelegate) creditCardDownPaymentScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardDownPaymentScreen.R;
                        return (j) ((x0) creditCardDownPaymentScreen.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        fw4.h hVar = uiState.f138580b;
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.credit_common_confirm, null, null, 14));
        largeActionButton.setEnabled(hVar.f138578a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (fw4.j) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_statement_financing_edit_down_payment_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_statement_financing_edit_down_payment_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.M.getValue()).d.f121375b), null, new k(2, (fw4.j) this.Q.getValue(), fw4.j.class, "onAmountChanged", "onAmountChanged(Ljava/lang/CharSequence;)V", 4, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
