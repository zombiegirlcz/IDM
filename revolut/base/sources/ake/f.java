package ake;

import afa.q;
import bke.x;
import bke.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import com.revolut.feature.tab.crypto.impl.portfolio.CryptoPortfolioScreen;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$ModalStep;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoAccountsState;
import com.revolut.feature.tab.crypto.models.TabCryptoModalStep;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ux0.s;
import vkm.j2;
import yji.n;
import zje.h;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends n implements d, vki.b, dje.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f5810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vki.a f5811m;

    public f(y accountDelegateProvider) {
        Intrinsics.checkNotNullParameter(accountDelegateProvider, "accountDelegateProvider");
        x xVarA = accountDelegateProvider.a(new zjh.f(this, 4), new e(2, 0, f.class, this, "openModal", "openModal(Lcom/revolut/feature/tab/crypto/impl/ui/TabCryptoFlowContract$ModalStep;Lcom/revolut/kompot/common/ModalDestination$Style;)V"));
        w2(xVarA, null);
        this.f5810l = xVarA;
        this.f5811m = pyd.c.a(this, new CryptoAccountsState(0));
    }

    @Override // dje.b
    public final Object A0(String str, ActionsView.Item item, h hVar) {
        if (Intrinsics.f(item.f58316a, "APPEARANCE_ACTION_ID")) {
            m1(str);
            return Unit.f186387a;
        }
        Object objC3 = this.f5810l.c3(item, hVar);
        return objC3 == fim.a.COROUTINE_SUSPENDED ? objC3 : Unit.f186387a;
    }

    @Override // dje.a
    public final com.revolut.kompot.navigable.a K0(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f5810l.getClass();
        return new CryptoPortfolioScreen();
    }

    @Override // dje.b
    public final void L(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f5810l.L(clickData);
    }

    @Override // dje.b
    public final void N1(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f5810l.N1(model);
    }

    @Override // dje.f
    public final boolean P0(TabCryptoModalStep modalStep) {
        Intrinsics.checkNotNullParameter(modalStep, "modalStep");
        return modalStep instanceof TabCryptoFlowContract$ModalStep;
    }

    @Override // dje.b
    public final void Q(AccountSelectionNavBarContentView.b scrollingState) {
        Intrinsics.checkNotNullParameter(scrollingState, "scrollingState");
        this.f5810l.Q(scrollingState);
    }

    @Override // dje.a
    public final void R(AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState) {
        CryptoAccountsState restoredState = (CryptoAccountsState) accountsExtensionContract$AccountsState;
        Intrinsics.checkNotNullParameter(restoredState, "restoredState");
        X2(this.f5811m, new q(restoredState, 15));
    }

    @Override // dje.b
    public final void V1(s state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f5810l.V1(state);
    }

    @Override // dje.b
    public final void W1() {
        this.f5810l.W1();
    }

    @Override // dje.b
    public final void c1() {
        this.f5810l.c1();
    }

    @Override // dje.f
    public final com.revolut.kompot.navigable.a d2(TabCryptoModalStep modalStep) {
        Intrinsics.checkNotNullParameter(modalStep, "modalStep");
        if (modalStep instanceof TabCryptoFlowContract$ModalStep) {
            return this.f5810l.e3((TabCryptoFlowContract$ModalStep) modalStep);
        }
        throw new IllegalStateException("Provided modalStep: " + modalStep + " doesn't belongs to CryptoAccountsExtension");
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f5811m;
    }

    @Override // dje.a
    public final AccountsExtensionContract$AccountsState i() {
        return (CryptoAccountsState) ((j2) this.f5811m.f22677a).getValue();
    }

    @Override // dje.b
    public final void j() {
        this.f5810l.j();
    }

    @Override // dje.b
    public final void m1(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (!Intrinsics.f(accountId, "ACCOUNT_SELECTION_RETAIL_CRYPTO_LIST_ID")) {
            throw new IllegalArgumentException(p.a.p("Background for ", accountId, " is not set at CryptoAccountsExtensionImpl"));
        }
        this.f5810l.Z2(RetailBackgroundKey.CryptoHome.f63825b);
    }

    @Override // dje.b
    public final void q0(String accountId, String menuItemId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
        this.f5810l.d3(menuItemId);
    }

    @Override // dje.a
    public final Flow v() {
        return (j2) this.f5811m.f22677a;
    }
}
