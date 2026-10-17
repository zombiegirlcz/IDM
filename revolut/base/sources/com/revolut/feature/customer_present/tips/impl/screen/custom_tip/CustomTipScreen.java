package com.revolut.feature.customer_present.tips.impl.screen.custom_tip;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.customer_present.tips.impl.R$id;
import com.revolut.feature.customer_present.tips.impl.R$layout;
import com.revolut.feature.customer_present.tips.impl.R$string;
import com.revolut.feature.customer_present.tips.impl.screen.custom_tip.CustomTipScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dgg.b;
import dli.a;
import dt4.p;
import e06.c;
import e06.e;
import e06.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/customer_present/tips/impl/screen/custom_tip/CustomTipScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Le06/e;", "Ldli/a;", "Le06/f;", "feature_customer_present_tips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomTipScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CustomTipScreen.class, "binding", "getBinding()Lcom/revolut/feature/customer_present/tips/impl/databinding/ScreenCustomerPresentCustomTipBinding;", 0))};
    public final Object K;
    public final Object L;
    public final int M;
    public final Object N;
    public final h O;
    public final Object P;
    public final AmountEditDelegate Q;

    public CustomTipScreen(CustomTipScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: e06.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomTipScreen f121424b;

            {
                this.f121424b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CustomTipScreen customTipScreen = this.f121424b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CustomTipScreen.R;
                        return (h) ((c06.b) customTipScreen.L.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CustomTipScreen.R;
                        CustomTipScreen customTipScreen2 = this.f121424b;
                        return dli.f.a(customTipScreen2, (h) customTipScreen2.K.getValue(), u.c(customTipScreen2.Q), R$id.customerPresentCustomTipScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CustomTipScreen.R;
                        qd0.b bVarN = ((c06.b) customTipScreen.L.getValue()).f20171b.f20174b.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        this.L = w.y0(new b(this, inputData, 26));
        this.M = R$layout.screen_customer_present_custom_tip;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: e06.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomTipScreen f121424b;

            {
                this.f121424b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CustomTipScreen customTipScreen = this.f121424b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomTipScreen.R;
                        return (h) ((c06.b) customTipScreen.L.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CustomTipScreen.R;
                        CustomTipScreen customTipScreen2 = this.f121424b;
                        return dli.f.a(customTipScreen2, (h) customTipScreen2.K.getValue(), u.c(customTipScreen2.Q), R$id.customerPresentCustomTipScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CustomTipScreen.R;
                        qd0.b bVarN = ((c06.b) customTipScreen.L.getValue()).f20171b.f20174b.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        this.O = s.t(this, e06.b.f);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: e06.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomTipScreen f121424b;

            {
                this.f121424b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CustomTipScreen customTipScreen = this.f121424b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomTipScreen.R;
                        return (h) ((c06.b) customTipScreen.L.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CustomTipScreen.R;
                        CustomTipScreen customTipScreen2 = this.f121424b;
                        return dli.f.a(customTipScreen2, (h) customTipScreen2.K.getValue(), u.c(customTipScreen2.Q), R$id.customerPresentCustomTipScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CustomTipScreen.R;
                        qd0.b bVarN = ((c06.b) customTipScreen.L.getValue()).f20171b.f20174b.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                }
            }
        });
        this.Q = new AmountEditDelegate(new p(this, 17));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        MoneyClause moneyClause = uiState.f121430b;
        if (uiState.f121431c != null) {
            NavBarWithToolbar customerPresentCustomTipScreenNavBar = d3().f135c;
            Intrinsics.checkNotNullExpressionValue(customerPresentCustomTipScreenNavBar, "customerPresentCustomTipScreenNavBar");
            NavBarWithToolbar.setToolbar$default(customerPresentCustomTipScreenNavBar, moneyClause, uiState.f121431c, null, 4, null);
        } else {
            d3().f135c.setToolbarTitle(moneyClause);
        }
        d3().f134b.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c06.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (e06.h) this.K.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f135c;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f134b.setText(new TextLocalisedClause(R$string.customer_present_tipping_add_tip_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f135c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f134b.o), null, new c(this, null, 1), 3);
    }

    public final a06.a d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a06.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
