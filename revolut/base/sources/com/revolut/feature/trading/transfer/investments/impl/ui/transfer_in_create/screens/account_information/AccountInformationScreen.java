package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import az.i;
import aza.g;
import baf.c;
import baf.f;
import baf.k;
import baf.l;
import baf.m;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l9f.t;
import l9f.u;
import te0.w;
import tx0.j0;
import u8f.d;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/screens/account_information/AccountInformationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbaf/k;", "Ldli/a;", "Lbaf/m;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountInformationScreen extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(AccountInformationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinHorizontalButtonsBinding;", 0))};
    public final TransferBroker K;
    public final TradingAccount L;
    public final d M;
    public final h N;
    public final InputTextDelegate O;
    public final InputChecklistDelegate P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public AccountInformationScreen(TransferBroker broker, TradingAccount tradingAccount, d direction) {
        Intrinsics.checkNotNullParameter(broker, "broker");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.K = broker;
        this.L = tradingAccount;
        this.M = direction;
        this.N = s.t(this, c.f);
        this.O = new InputTextDelegate(null);
        this.P = new InputChecklistDelegate();
        this.Q = R$layout.screen_recycler_navbar_twin_horizontal_buttons;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: baf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationScreen f14048b;

            {
                this.f14048b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountInformationScreen accountInformationScreen = this.f14048b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountInformationScreen.U;
                        qji.b bVarU2 = accountInformationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.di.AccountNumberScreenInjector");
                        t tVar = (t) ((daf.a) bVarU2).c().mo3808a(accountInformationScreen);
                        AccountInformationScreenContract$InputData accountInformationScreenContract$InputData = new AccountInformationScreenContract$InputData(accountInformationScreen.K, accountInformationScreen.L, accountInformationScreen.M);
                        switch (tVar.f193222a) {
                            case 0:
                                tVar.d = accountInformationScreenContract$InputData;
                                break;
                            default:
                                tVar.d = accountInformationScreenContract$InputData;
                                break;
                        }
                        return (u) tVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountInformationScreen.U;
                        u uVar = (u) accountInformationScreen.R.getValue();
                        switch (uVar.f193225a) {
                            case 0:
                                return (l) uVar.d.get();
                            default:
                                return (l) uVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = AccountInformationScreen.U;
                        AccountInformationScreen accountInformationScreen2 = this.f14048b;
                        return dli.f.a(accountInformationScreen2, accountInformationScreen2.d(), v.k(accountInformationScreen2.O, accountInformationScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: baf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationScreen f14048b;

            {
                this.f14048b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountInformationScreen accountInformationScreen = this.f14048b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountInformationScreen.U;
                        qji.b bVarU2 = accountInformationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.di.AccountNumberScreenInjector");
                        t tVar = (t) ((daf.a) bVarU2).c().mo3808a(accountInformationScreen);
                        AccountInformationScreenContract$InputData accountInformationScreenContract$InputData = new AccountInformationScreenContract$InputData(accountInformationScreen.K, accountInformationScreen.L, accountInformationScreen.M);
                        switch (tVar.f193222a) {
                            case 0:
                                tVar.d = accountInformationScreenContract$InputData;
                                break;
                            default:
                                tVar.d = accountInformationScreenContract$InputData;
                                break;
                        }
                        return (u) tVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountInformationScreen.U;
                        u uVar = (u) accountInformationScreen.R.getValue();
                        switch (uVar.f193225a) {
                            case 0:
                                return (l) uVar.d.get();
                            default:
                                return (l) uVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = AccountInformationScreen.U;
                        AccountInformationScreen accountInformationScreen2 = this.f14048b;
                        return dli.f.a(accountInformationScreen2, accountInformationScreen2.d(), v.k(accountInformationScreen2.O, accountInformationScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: baf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationScreen f14048b;

            {
                this.f14048b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountInformationScreen accountInformationScreen = this.f14048b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountInformationScreen.U;
                        qji.b bVarU2 = accountInformationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.di.AccountNumberScreenInjector");
                        t tVar = (t) ((daf.a) bVarU2).c().mo3808a(accountInformationScreen);
                        AccountInformationScreenContract$InputData accountInformationScreenContract$InputData = new AccountInformationScreenContract$InputData(accountInformationScreen.K, accountInformationScreen.L, accountInformationScreen.M);
                        switch (tVar.f193222a) {
                            case 0:
                                tVar.d = accountInformationScreenContract$InputData;
                                break;
                            default:
                                tVar.d = accountInformationScreenContract$InputData;
                                break;
                        }
                        return (u) tVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountInformationScreen.U;
                        u uVar = (u) accountInformationScreen.R.getValue();
                        switch (uVar.f193225a) {
                            case 0:
                                return (l) uVar.d.get();
                            default:
                                return (l) uVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = AccountInformationScreen.U;
                        AccountInformationScreen accountInformationScreen2 = this.f14048b;
                        return dli.f.a(accountInformationScreen2, accountInformationScreen2.d(), v.k(accountInformationScreen2.O, accountInformationScreen2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        ?? r06 = uiState.f14058a;
        navBarWithToolbar.setTitle(r06, null);
        navBarWithToolbar.setToolbarTitle(r06);
        Clause clause = uiState.f14059b;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        TwinHorizontalButton twinHorizontalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(twinHorizontalButton, "twinHorizontalButton");
        twinHorizontalButton.setPrimaryButtonEnabled(uiState.f14060c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174567b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TwinHorizontalButton twinHorizontalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(twinHorizontalButton, "twinHorizontalButton");
        twinHorizontalButton.setPrimaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinHorizontalButton.setPrimaryButtonText(new TextLocalisedClause(R$string.trading_stocks_transfer_in_assets_continue, null, null, 14));
        twinHorizontalButton.setGradientBackgroundEnabled(true);
        twinHorizontalButton.setSecondaryButtonVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174567b.f59410q), new i(this, continuation, 19), 3);
        InputTextDelegate inputTextDelegate = this.O;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new baf.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().d.c()), new g(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f.f121375b), new b74.e(this, continuation, 9), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new baf.e(2, 4, l.class, d(), "onInputTextClicked", "onInputTextClicked(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52518c), new f(2, 4, l.class, d(), "onInputChecklistClicked", "onInputChecklistClicked(Lcom/revolut/core/ui_kit/delegates/InputChecklistDelegate$Model;)V"), 3);
    }

    public final jii.v d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.v) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
