package com.revolut.feature.revolutpay.shared.ui.add_payment_method;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.shared.R$id;
import com.revolut.feature.revolutpay.shared.R$layout;
import com.revolut.feature.revolutpay.shared.R$string;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import g75.i;
import gdc.g;
import gdc.j;
import gdc.m;
import gdc.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/add_payment_method/AddPaymentMethodScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgdc/b;", "Ldli/a;", "Lgdc/n;", "Companion", "a", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddPaymentMethodScreen extends ViewController<gdc.b> implements dli.a {
    public final Integer K;
    public final int L;
    public final h M;
    public final Object N;
    public final InputTextDelegate O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AddPaymentMethodScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/shared/databinding/ScreenAddPaymentMethodBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public AddPaymentMethodScreen(AddPaymentMethodControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData.f ? Integer.valueOf(R$style.UiKitTheme_Transparent) : null;
        this.L = R$layout.screen_add_payment_method;
        this.M = s.t(this, gdc.h.f);
        this.N = w.y0(new fx5.a(this, inputData, 24));
        this.O = new InputTextDelegate(new i(this, 21));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: gdc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddPaymentMethodScreen f143131b;

            {
                this.f143131b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AddPaymentMethodScreen.Companion companion = AddPaymentMethodScreen.INSTANCE;
                        return ((hdc.b) this.f143131b.N.getValue()).a();
                    default:
                        AddPaymentMethodScreen.Companion companion2 = AddPaymentMethodScreen.INSTANCE;
                        AddPaymentMethodScreen addPaymentMethodScreen = this.f143131b;
                        return dli.f.a(addPaymentMethodScreen, addPaymentMethodScreen.d(), zhm.u.c(addPaymentMethodScreen.O), R$id.addPaymentMethodScreen_recyclerView, new g(addPaymentMethodScreen, 3), null, null, 48);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: gdc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddPaymentMethodScreen f143131b;

            {
                this.f143131b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AddPaymentMethodScreen.Companion companion = AddPaymentMethodScreen.INSTANCE;
                        return ((hdc.b) this.f143131b.N.getValue()).a();
                    default:
                        AddPaymentMethodScreen.Companion companion2 = AddPaymentMethodScreen.INSTANCE;
                        AddPaymentMethodScreen addPaymentMethodScreen = this.f143131b;
                        return dli.f.a(addPaymentMethodScreen, addPaymentMethodScreen.d(), zhm.u.c(addPaymentMethodScreen.O), R$id.addPaymentMethodScreen_recyclerView, new g(addPaymentMethodScreen, 3), null, null, 48);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getK() {
        return this.K;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        FooterActionButtonView footerActionButtonView = d3().f296391b;
        footerActionButtonView.setButtonEnabled(uiState.f143141b);
        footerActionButtonView.setDescription(new TextLocalisedClause(R$string.revolut_pay_payment_methods_add_card_tip, u.c(new TextLocalisedClause(R$string.revolut_pay_payment_methods_add_card_button_title, null, null, 14)), null, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (hdc.b) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f296392c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.revolut_pay_payment_methods_add_card_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.revolut_pay_payment_methods_add_card_title, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionClickable(true);
        navBarWithToolbar.setDescriptionText(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(R$drawable.uikit_icn_24_secure_seal, Integer.valueOf(R$attr.uikit_colorBlue), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.revolut_pay_add_card_info_screen_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorBlue), false, null, false, null, 254), 10))));
        d3().f296391b.setButtonText(new TextLocalisedClause(R$string.revolut_pay_payment_methods_add_card_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f3("CVV_INPUT_FIELD_ID", new g(this, 0));
        f3("CARDHOLDER_INPUT_FIELD_ID", new g(this, 1));
        f3("POSTCODE_INPUT_FIELD_ID", new g(this, 2));
        ViewController.P2(this, rd0.e.b(this.O.f.f121375b), new gaa.g(this, null, 10), 3);
        ViewController.P2(this, rd0.e.b(d3().f296391b.f0()), new j(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f296392c.f59410q), new j(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f296392c.q0()), new j(this, null, 2), 3);
    }

    public final wcc.a d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wcc.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.P.getValue();
    }

    public final void f3(String str, Function1 function1) {
        r map = this.O.e.f121375b.filter(new g9j.v(new g58.h(str, 5), 26)).map(new g9j.v(new gd8.j(1), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new ex6.c(1, null, function1), 3);
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
}
