package com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountController;
import com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import java.math.BigDecimal;
import kji.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oai.g0;
import oai.i0;
import oai.o;
import org.jetbrains.annotations.NotNull;
import sci.b;
import sci.c;
import sci.d;
import sci.g;
import sci.h;
import sci.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/transaction_countries/expected_amount/ExpectedAmountController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsci/h;", "Ldli/a;", "Lsci/i;", "Lkji/f;", "Companion", "a", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpectedAmountController extends ViewController<h> implements dli.a, f {
    public static final BigDecimal T;
    public final ExpectedAmountControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final ao.h R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ExpectedAmountController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(99999999999L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        T = bigDecimalValueOf;
    }

    public ExpectedAmountController(ExpectedAmountControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: sci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpectedAmountController f261749b;

            {
                this.f261749b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ExpectedAmountController expectedAmountController = this.f261749b;
                switch (i2) {
                    case 0:
                        ExpectedAmountController.Companion companion = ExpectedAmountController.INSTANCE;
                        qji.b bVarU2 = expectedAmountController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.di.ExpectedAmountControllerComponentInjector");
                        }
                        g0 g0Var = (g0) bVarU2;
                        i0 i0Var = g0Var.f223689b;
                        g0 g0Var2 = g0Var.f223690c;
                        ExpectedAmountControllerContract$InputData expectedAmountControllerContract$InputData = expectedAmountController.K;
                        expectedAmountControllerContract$InputData.getClass();
                        return new o(i0Var, g0Var2, expectedAmountControllerContract$InputData);
                    case 1:
                        ExpectedAmountController.Companion companion2 = ExpectedAmountController.INSTANCE;
                        return (g) ((o) expectedAmountController.L.getValue()).f223749c.get();
                    case 2:
                        ExpectedAmountController.Companion companion3 = ExpectedAmountController.INSTANCE;
                        qd0.b bVarN = ((o) expectedAmountController.L.getValue()).f223748b.f223703h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        ExpectedAmountController.Companion companion4 = ExpectedAmountController.INSTANCE;
                        return new InputTextDelegate(new s42.f(expectedAmountController, 25));
                    default:
                        ExpectedAmountController.Companion companion5 = ExpectedAmountController.INSTANCE;
                        ExpectedAmountController expectedAmountController2 = this.f261749b;
                        return dli.f.a(expectedAmountController2, expectedAmountController2.d(), u.c((InputTextDelegate) expectedAmountController2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: sci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpectedAmountController f261749b;

            {
                this.f261749b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ExpectedAmountController expectedAmountController = this.f261749b;
                switch (i22) {
                    case 0:
                        ExpectedAmountController.Companion companion = ExpectedAmountController.INSTANCE;
                        qji.b bVarU2 = expectedAmountController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.di.ExpectedAmountControllerComponentInjector");
                        }
                        g0 g0Var = (g0) bVarU2;
                        i0 i0Var = g0Var.f223689b;
                        g0 g0Var2 = g0Var.f223690c;
                        ExpectedAmountControllerContract$InputData expectedAmountControllerContract$InputData = expectedAmountController.K;
                        expectedAmountControllerContract$InputData.getClass();
                        return new o(i0Var, g0Var2, expectedAmountControllerContract$InputData);
                    case 1:
                        ExpectedAmountController.Companion companion2 = ExpectedAmountController.INSTANCE;
                        return (g) ((o) expectedAmountController.L.getValue()).f223749c.get();
                    case 2:
                        ExpectedAmountController.Companion companion3 = ExpectedAmountController.INSTANCE;
                        qd0.b bVarN = ((o) expectedAmountController.L.getValue()).f223748b.f223703h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        ExpectedAmountController.Companion companion4 = ExpectedAmountController.INSTANCE;
                        return new InputTextDelegate(new s42.f(expectedAmountController, 25));
                    default:
                        ExpectedAmountController.Companion companion5 = ExpectedAmountController.INSTANCE;
                        ExpectedAmountController expectedAmountController2 = this.f261749b;
                        return dli.f.a(expectedAmountController2, expectedAmountController2.d(), u.c((InputTextDelegate) expectedAmountController2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: sci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpectedAmountController f261749b;

            {
                this.f261749b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ExpectedAmountController expectedAmountController = this.f261749b;
                switch (i22) {
                    case 0:
                        ExpectedAmountController.Companion companion = ExpectedAmountController.INSTANCE;
                        qji.b bVarU2 = expectedAmountController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.di.ExpectedAmountControllerComponentInjector");
                        }
                        g0 g0Var = (g0) bVarU2;
                        i0 i0Var = g0Var.f223689b;
                        g0 g0Var2 = g0Var.f223690c;
                        ExpectedAmountControllerContract$InputData expectedAmountControllerContract$InputData = expectedAmountController.K;
                        expectedAmountControllerContract$InputData.getClass();
                        return new o(i0Var, g0Var2, expectedAmountControllerContract$InputData);
                    case 1:
                        ExpectedAmountController.Companion companion2 = ExpectedAmountController.INSTANCE;
                        return (g) ((o) expectedAmountController.L.getValue()).f223749c.get();
                    case 2:
                        ExpectedAmountController.Companion companion3 = ExpectedAmountController.INSTANCE;
                        qd0.b bVarN = ((o) expectedAmountController.L.getValue()).f223748b.f223703h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        ExpectedAmountController.Companion companion4 = ExpectedAmountController.INSTANCE;
                        return new InputTextDelegate(new s42.f(expectedAmountController, 25));
                    default:
                        ExpectedAmountController.Companion companion5 = ExpectedAmountController.INSTANCE;
                        ExpectedAmountController expectedAmountController2 = this.f261749b;
                        return dli.f.a(expectedAmountController2, expectedAmountController2.d(), u.c((InputTextDelegate) expectedAmountController2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.O = w.y0(new Function0(this) { // from class: sci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpectedAmountController f261749b;

            {
                this.f261749b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ExpectedAmountController expectedAmountController = this.f261749b;
                switch (i22) {
                    case 0:
                        ExpectedAmountController.Companion companion = ExpectedAmountController.INSTANCE;
                        qji.b bVarU2 = expectedAmountController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.di.ExpectedAmountControllerComponentInjector");
                        }
                        g0 g0Var = (g0) bVarU2;
                        i0 i0Var = g0Var.f223689b;
                        g0 g0Var2 = g0Var.f223690c;
                        ExpectedAmountControllerContract$InputData expectedAmountControllerContract$InputData = expectedAmountController.K;
                        expectedAmountControllerContract$InputData.getClass();
                        return new o(i0Var, g0Var2, expectedAmountControllerContract$InputData);
                    case 1:
                        ExpectedAmountController.Companion companion2 = ExpectedAmountController.INSTANCE;
                        return (g) ((o) expectedAmountController.L.getValue()).f223749c.get();
                    case 2:
                        ExpectedAmountController.Companion companion3 = ExpectedAmountController.INSTANCE;
                        qd0.b bVarN = ((o) expectedAmountController.L.getValue()).f223748b.f223703h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        ExpectedAmountController.Companion companion4 = ExpectedAmountController.INSTANCE;
                        return new InputTextDelegate(new s42.f(expectedAmountController, 25));
                    default:
                        ExpectedAmountController.Companion companion5 = ExpectedAmountController.INSTANCE;
                        ExpectedAmountController expectedAmountController2 = this.f261749b;
                        return dli.f.a(expectedAmountController2, expectedAmountController2.d(), u.c((InputTextDelegate) expectedAmountController2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.P = w.y0(new Function0(this) { // from class: sci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpectedAmountController f261749b;

            {
                this.f261749b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ExpectedAmountController expectedAmountController = this.f261749b;
                switch (i22) {
                    case 0:
                        ExpectedAmountController.Companion companion = ExpectedAmountController.INSTANCE;
                        qji.b bVarU2 = expectedAmountController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.di.ExpectedAmountControllerComponentInjector");
                        }
                        g0 g0Var = (g0) bVarU2;
                        i0 i0Var = g0Var.f223689b;
                        g0 g0Var2 = g0Var.f223690c;
                        ExpectedAmountControllerContract$InputData expectedAmountControllerContract$InputData = expectedAmountController.K;
                        expectedAmountControllerContract$InputData.getClass();
                        return new o(i0Var, g0Var2, expectedAmountControllerContract$InputData);
                    case 1:
                        ExpectedAmountController.Companion companion2 = ExpectedAmountController.INSTANCE;
                        return (g) ((o) expectedAmountController.L.getValue()).f223749c.get();
                    case 2:
                        ExpectedAmountController.Companion companion3 = ExpectedAmountController.INSTANCE;
                        qd0.b bVarN = ((o) expectedAmountController.L.getValue()).f223748b.f223703h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        ExpectedAmountController.Companion companion4 = ExpectedAmountController.INSTANCE;
                        return new InputTextDelegate(new s42.f(expectedAmountController, 25));
                    default:
                        ExpectedAmountController.Companion companion5 = ExpectedAmountController.INSTANCE;
                        ExpectedAmountController expectedAmountController2 = this.f261749b;
                        return dli.f.a(expectedAmountController2, expectedAmountController2.d(), u.c((InputTextDelegate) expectedAmountController2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = R$layout.screen_recycler_navbar_nextbutton;
        this.R = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f261755b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transaction_countries_expected_amount_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.transaction_countries_expected_amount_subtitle, u.c(new CountryClause(this.K.f97764a, null)), null, 12));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTag("EXPECTED_AMOUNT_NAV_BAR_TAG");
        d3().d.setTag("EXPECTED_AMOUNT_RECYCLER_VIEW_TAG");
        l.A(R.string.common_action_continue, null, null, 14, d3().f174564b);
        d3().f174564b.setTag("EXPECTED_AMOUNT_BUTTON_TAG");
        this.z = true;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        ?? r56 = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f52575g.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new sci.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
