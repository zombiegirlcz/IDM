package com.revolut.feature.credit.card.impl.ui.instalment.repay.select_repayment;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bk6.c;
import br4.e;
import bt4.f;
import bt4.g;
import bt4.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.select_repayment.CreditCardInstalmentSelectRepaymentScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import jm4.i1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import vkm.d;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/select_repayment/CreditCardInstalmentSelectRepaymentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbt4/f;", "Ldli/a;", "Lbt4/g;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardInstalmentSelectRepaymentScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CreditCardInstalmentSelectRepaymentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar;
    public final Object L = w.y0(new e(17));
    public final h N = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public CreditCardInstalmentSelectRepaymentScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: bt4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentSelectRepaymentScreen f18277b;

            {
                this.f18277b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardInstalmentSelectRepaymentScreen creditCardInstalmentSelectRepaymentScreen = this.f18277b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentSelectRepaymentScreen.Q;
                        CreditCardInstalmentSelectRepaymentScreen creditCardInstalmentSelectRepaymentScreen2 = this.f18277b;
                        return dli.f.a(creditCardInstalmentSelectRepaymentScreen2, (i) creditCardInstalmentSelectRepaymentScreen2.P.getValue(), u.c((RowDelegate) creditCardInstalmentSelectRepaymentScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentSelectRepaymentScreen.Q;
                        qji.b bVarU2 = creditCardInstalmentSelectRepaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.select_repayment.di.CreditCardInstalmentSelectRepaymentScreenInjector");
                        i1 i1Var = new i1();
                        i1Var.f176116a = e4m.b.b(new ix5.b(i1Var, 1, 24));
                        i1Var.f176117b = e4m.b.b(new ix5.b(i1Var, 0, 24));
                        return i1Var;
                    default:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentSelectRepaymentScreen.Q;
                        return (i) ((i1) creditCardInstalmentSelectRepaymentScreen.O.getValue()).f176117b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: bt4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentSelectRepaymentScreen f18277b;

            {
                this.f18277b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardInstalmentSelectRepaymentScreen creditCardInstalmentSelectRepaymentScreen = this.f18277b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentSelectRepaymentScreen.Q;
                        CreditCardInstalmentSelectRepaymentScreen creditCardInstalmentSelectRepaymentScreen2 = this.f18277b;
                        return dli.f.a(creditCardInstalmentSelectRepaymentScreen2, (i) creditCardInstalmentSelectRepaymentScreen2.P.getValue(), u.c((RowDelegate) creditCardInstalmentSelectRepaymentScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentSelectRepaymentScreen.Q;
                        qji.b bVarU2 = creditCardInstalmentSelectRepaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.select_repayment.di.CreditCardInstalmentSelectRepaymentScreenInjector");
                        i1 i1Var = new i1();
                        i1Var.f176116a = e4m.b.b(new ix5.b(i1Var, 1, 24));
                        i1Var.f176117b = e4m.b.b(new ix5.b(i1Var, 0, 24));
                        return i1Var;
                    default:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentSelectRepaymentScreen.Q;
                        return (i) ((i1) creditCardInstalmentSelectRepaymentScreen.O.getValue()).f176117b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: bt4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentSelectRepaymentScreen f18277b;

            {
                this.f18277b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardInstalmentSelectRepaymentScreen creditCardInstalmentSelectRepaymentScreen = this.f18277b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentSelectRepaymentScreen.Q;
                        CreditCardInstalmentSelectRepaymentScreen creditCardInstalmentSelectRepaymentScreen2 = this.f18277b;
                        return dli.f.a(creditCardInstalmentSelectRepaymentScreen2, (i) creditCardInstalmentSelectRepaymentScreen2.P.getValue(), u.c((RowDelegate) creditCardInstalmentSelectRepaymentScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentSelectRepaymentScreen.Q;
                        qji.b bVarU2 = creditCardInstalmentSelectRepaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.select_repayment.di.CreditCardInstalmentSelectRepaymentScreenInjector");
                        i1 i1Var = new i1();
                        i1Var.f176116a = e4m.b.b(new ix5.b(i1Var, 1, 24));
                        i1Var.f176117b = e4m.b.b(new ix5.b(i1Var, 0, 24));
                        return i1Var;
                    default:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentSelectRepaymentScreen.Q;
                        return (i) ((i1) creditCardInstalmentSelectRepaymentScreen.O.getValue()).f176117b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_repay_method_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.credit_card_instalment_repay_method_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarB = rd0.e.b(((RowDelegate) this.L.getValue()).f53218h);
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, new ay4.f(vkm.q.J(dVarB, new c(rd0.e.b(((m) value).f174539b.f59410q), 17)), yx4.b.Companion, 1), new aee.g(2, (i) this.P.getValue(), i.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 16), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
