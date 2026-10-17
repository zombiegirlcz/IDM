package com.revolut.feature.credit.help.impl.ui.financial_difficulties.self_service;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.self_service.FinancialDifficultiesController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import h15.c;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s15.b;
import s15.d;
import s15.g;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/help/impl/ui/financial_difficulties/self_service/FinancialDifficultiesController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lh15/c;", "Ldli/a;", "Ls15/g;", "feature_credit_help_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FinancialDifficultiesController extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(FinancialDifficultiesController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final int L;
    public final h M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final PlainTextWarningDelegate R;
    public final FullScreenStateDelegate S;
    public final List T;

    public FinancialDifficultiesController(FinancialDifficultiesControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$style.UiKitTheme_TransparentCompat;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        final int i = 1;
        this.N = true;
        this.O = w.y0(new rxe.b(this, inputData, 10));
        final int i2 = 0;
        this.P = w.y0(new Function0(this) { // from class: s15.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FinancialDifficultiesController f259084b;

            {
                this.f259084b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FinancialDifficultiesController.U;
                        return (e) ((i15.e) this.f259084b.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = FinancialDifficultiesController.U;
                        FinancialDifficultiesController financialDifficultiesController = this.f259084b;
                        return dli.f.a(financialDifficultiesController, financialDifficultiesController.d(), financialDifficultiesController.T, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new Function0(this) { // from class: s15.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FinancialDifficultiesController f259084b;

            {
                this.f259084b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FinancialDifficultiesController.U;
                        return (e) ((i15.e) this.f259084b.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = FinancialDifficultiesController.U;
                        FinancialDifficultiesController financialDifficultiesController = this.f259084b;
                        return dli.f.a(financialDifficultiesController, financialDifficultiesController.d(), financialDifficultiesController.T, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.R = plainTextWarningDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.S = fullScreenStateDelegate;
        this.T = v.k(plainTextWarningDelegate, fullScreenStateDelegate, new PlainTextLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.K);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f174564b;
        knm.b.z(largeActionButton, uiState.f259088c, null, 14);
        largeActionButton.setText(uiState.f259087b);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.d;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i15.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new s15.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.s()), null, new rt4.o(this, continuation, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new s15.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52371h.f121375b), null, new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final s15.e d() {
        return (s15.e) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
