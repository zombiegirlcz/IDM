package com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.AccountClosureFeatureRatingScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.AccountClosureFeatureRatingScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mug.b;
import mug.g;
import mug.i;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;
import ztg.d;
import ztg.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/feature_rating/AccountClosureFeatureRatingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmug/g;", "Ltki/c;", "Lmug/i;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountClosureFeatureRatingScreen extends ViewController<g> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccountClosureFeatureRatingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AccountClosureFeatureRatingScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RateDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AccountClosureFeatureRatingScreen(AccountClosureFeatureRatingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new RateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: mug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureFeatureRatingScreen f209024b;

            {
                this.f209024b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountClosureFeatureRatingScreen accountClosureFeatureRatingScreen = this.f209024b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountClosureFeatureRatingScreen.R;
                        AccountClosureFeatureRatingScreen accountClosureFeatureRatingScreen2 = this.f209024b;
                        return tki.g.a(accountClosureFeatureRatingScreen2, accountClosureFeatureRatingScreen2.d(), u.c(accountClosureFeatureRatingScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountClosureFeatureRatingScreen.R;
                        qji.b bVarU2 = accountClosureFeatureRatingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.di.AccountClosureFeatureRatingScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureFeatureRatingScreenContract$InputData accountClosureFeatureRatingScreenContract$InputData = accountClosureFeatureRatingScreen.K;
                        accountClosureFeatureRatingScreenContract$InputData.getClass();
                        return new ztg.d(nVar, hVar2, accountClosureFeatureRatingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountClosureFeatureRatingScreen.R;
                        return (h) ((ztg.d) accountClosureFeatureRatingScreen.P.getValue()).f325124b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: mug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureFeatureRatingScreen f209024b;

            {
                this.f209024b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountClosureFeatureRatingScreen accountClosureFeatureRatingScreen = this.f209024b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountClosureFeatureRatingScreen.R;
                        AccountClosureFeatureRatingScreen accountClosureFeatureRatingScreen2 = this.f209024b;
                        return tki.g.a(accountClosureFeatureRatingScreen2, accountClosureFeatureRatingScreen2.d(), u.c(accountClosureFeatureRatingScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountClosureFeatureRatingScreen.R;
                        qji.b bVarU2 = accountClosureFeatureRatingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.di.AccountClosureFeatureRatingScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureFeatureRatingScreenContract$InputData accountClosureFeatureRatingScreenContract$InputData = accountClosureFeatureRatingScreen.K;
                        accountClosureFeatureRatingScreenContract$InputData.getClass();
                        return new ztg.d(nVar, hVar2, accountClosureFeatureRatingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountClosureFeatureRatingScreen.R;
                        return (h) ((ztg.d) accountClosureFeatureRatingScreen.P.getValue()).f325124b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: mug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountClosureFeatureRatingScreen f209024b;

            {
                this.f209024b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountClosureFeatureRatingScreen accountClosureFeatureRatingScreen = this.f209024b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountClosureFeatureRatingScreen.R;
                        AccountClosureFeatureRatingScreen accountClosureFeatureRatingScreen2 = this.f209024b;
                        return tki.g.a(accountClosureFeatureRatingScreen2, accountClosureFeatureRatingScreen2.d(), u.c(accountClosureFeatureRatingScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AccountClosureFeatureRatingScreen.R;
                        qji.b bVarU2 = accountClosureFeatureRatingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.di.AccountClosureFeatureRatingScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        AccountClosureFeatureRatingScreenContract$InputData accountClosureFeatureRatingScreenContract$InputData = accountClosureFeatureRatingScreen.K;
                        accountClosureFeatureRatingScreenContract$InputData.getClass();
                        return new ztg.d(nVar, hVar2, accountClosureFeatureRatingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountClosureFeatureRatingScreen.R;
                        return (h) ((ztg.d) accountClosureFeatureRatingScreen.P.getValue()).f325124b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        jii.u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f209029a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setDescriptionText(uiState.f209030b);
        navBarWithToolbar.setDescriptionVisible(true);
        LargeActionButton largeActionButton = uVarD3.f174564b;
        largeActionButton.setText(uiState.f209031c);
        largeActionButton.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        jii.u uVarD3 = d3();
        ViewController.P2(this, rd0.e.b(uVarD3.f174565c.f59410q), new mug.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(uVarD3.f174564b.o), new mug.c(this, null, 1), 3);
        RateDelegate rateDelegate = this.N;
        ViewController.P2(this, kii.e.t(rateDelegate.f53140c, "hide(...)"), new mug.d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(rateDelegate.d.f121375b), new mug.d(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final mug.h d() {
        return (mug.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF78873d0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }
}
