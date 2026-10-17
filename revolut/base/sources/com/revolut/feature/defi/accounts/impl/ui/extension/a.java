package com.revolut.feature.defi.accounts.impl.ui.extension;

import aii.o;
import android.os.Parcelable;
import bn2.p;
import cm2.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.defi.accounts.api.DeFiAccountsApi$Toggles$CryptoDeFiAccount;
import com.revolut.feature.defi.accounts.impl.R$string;
import com.revolut.feature.defi.accounts.impl.ui.extension.DeFiAccountsModalStep;
import com.revolut.feature.defi.accounts.impl.ui.portfolio.DeFiPortfolioScreen;
import com.revolut.feature.defi.exchange.api.DeFiExchangeApi$Toggles$CryptoCeFiToDeFi;
import com.revolut.feature.defi.remittances.api.navigation.DeFiSendDestination;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import com.revolut.feature.tab.crypto.models.TabCryptoModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import dje.f;
import eii.l;
import grl.k9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o16.e;
import org.jetbrains.annotations.NotNull;
import ux0.s;
import vkm.j2;
import vkm.q;
import vkm.t0;
import x16.b;
import x16.d;
import x16.g;
import x16.i;
import x16.j;
import x16.k;
import xv5.c;
import yji.n;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends n implements b, f, vki.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f71657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f16.b f71658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t46.a f71659n;
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f71660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f71661q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final onh.b f71662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f71663s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f71664t;
    public final vki.a u;

    public a(gte.a featureToggleInteractor, f16.b accountsRepository, t46.a ratesRepository, c baseCurrencyInteractor, p backgroundsInteractor, e disclaimerWidget, onh.b headerDataCalculator, k headerActionsBottomSheetInputProvider) {
        Object next;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(accountsRepository, "accountsRepository");
        Intrinsics.checkNotNullParameter(ratesRepository, "ratesRepository");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(disclaimerWidget, "disclaimerWidget");
        Intrinsics.checkNotNullParameter(headerDataCalculator, "headerDataCalculator");
        Intrinsics.checkNotNullParameter(headerActionsBottomSheetInputProvider, "headerActionsBottomSheetInputProvider");
        this.f71657l = featureToggleInteractor;
        this.f71658m = accountsRepository;
        this.f71659n = ratesRepository;
        this.o = baseCurrencyInteractor;
        this.f71660p = backgroundsInteractor;
        this.f71661q = disclaimerWidget;
        this.f71662r = headerDataCalculator;
        this.f71663s = headerActionsBottomSheetInputProvider;
        this.f71664t = new vii.b();
        Iterator it8 = ((l16.e) accountsRepository).f191477b.getAll().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (next instanceof e16.b) {
                    break;
                }
            }
        }
        e16.b bVar = (e16.b) next;
        this.u = pyd.c.a(this, bVar != null ? new DeFiAccountsExtensionState(new Data(bVar, null, true, 2, null), 62) : new DeFiAccountsExtensionState(null, 63));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    @Override // dje.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0(java.lang.String r4, com.revolut.core.ui_kit.views.ActionsView.Item r5, zje.h r6) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.defi.accounts.impl.ui.extension.a.A0(java.lang.String, com.revolut.core.ui_kit.views.ActionsView$Item, zje.h):java.lang.Object");
    }

    @Override // yji.n
    public final void H2() {
        Continuation continuation = null;
        n.l2(this, rd0.e.b(c.b(this.o)), null, new x16.f(this, continuation, 3), 3);
        V2(new g(this, continuation, 0), new yi5.b(29));
        x1.n nVar = new x1.n(6);
        vki.a aVar = this.u;
        n.l2(this, q.Q(new t0(aVar.B(nVar), 1), new w2a.q(continuation, this, 29)), null, new x16.f(this, continuation, 4), 3);
        n.l2(this, new t0(aVar.B(new x1.n(5)), 1), null, new x16.f(this, continuation, 2), 3);
        n.l2(this, mo3.a.g(this.f71660p.g(RetailBackgroundKey.DeFiHome.f63827a), null, null, 3), null, new x16.f(this, continuation, 1), 3);
        V2(new g(this, continuation, 1), new yi5.b(29));
    }

    @Override // dje.a
    public final com.revolut.kompot.navigable.a K0(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new DeFiPortfolioScreen(accountId);
    }

    @Override // dje.b
    public final void L(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        V2(new wtj.f(this, clickData, null, 12), new yi5.b(29));
    }

    @Override // dje.b
    public final void N1(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
    }

    @Override // dje.f
    public final boolean P0(TabCryptoModalStep modalStep) {
        Intrinsics.checkNotNullParameter(modalStep, "modalStep");
        return modalStep instanceof DeFiAccountsModalStep;
    }

    @Override // dje.b
    public final void Q(AccountSelectionNavBarContentView.b scrollingState) {
        Intrinsics.checkNotNullParameter(scrollingState, "scrollingState");
    }

    @Override // dje.a
    public final void R(AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState) {
        DeFiAccountsExtensionState restoredState = (DeFiAccountsExtensionState) accountsExtensionContract$AccountsState;
        Intrinsics.checkNotNullParameter(restoredState, "restoredState");
    }

    @Override // dje.b
    public final void V1(s state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    @Override // dje.b
    public final void W1() {
    }

    public final void Z2() {
        e16.b bVar = (e16.b) ((DeFiAccountsExtensionState) ((j2) this.u.f22677a).getValue()).f71651a.getContent();
        String str = bVar != null ? bVar.f121886a : null;
        if (str != null) {
            A2(new DeFiSendDestination(str));
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "DeFiAccountsExtensionImpl", "Trying to navigate to send while DeFi account is not loaded", null, h0Var);
    }

    public final void b3(String str) {
        o oVarR2 = r2();
        if (!Intrinsics.f(str, "DEFI_ACCOUNT_ID")) {
            throw new IllegalArgumentException(p.a.p("Background for ", str, " is not set"));
        }
        oVarR2.M0(new dje.d(new DeFiAccountsModalStep.ThemeCustomisation(RetailBackgroundKey.DeFiHome.f63827a), ModalDestination.Style.POPUP.f98311a));
    }

    @Override // dje.b
    public final void c1() {
    }

    @Override // dje.f
    public final com.revolut.kompot.navigable.a d2(TabCryptoModalStep modalStep) {
        Intrinsics.checkNotNullParameter(modalStep, "modalStep");
        boolean zF = Intrinsics.f(modalStep, DeFiAccountsModalStep.DepositOptions.f71654a);
        k kVar = this.f71663s;
        if (zF) {
            l[] elements = {((jte.d) kVar.f302316a).c(DeFiExchangeApi$Toggles$CryptoCeFiToDeFi.f71717c) ? new l((Clause) new TextLocalisedClause(R$string.crypto_defi_deposit_type_selection_add_crypto_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.crypto_defi_deposit_type_selection_add_crypto_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_plus, null, null, 6), null, null, false, null, false, 62), true, false, (RowDelegate.Model.c) null, (Object) i.ADD_CRYPTO, 232) : null, new l((Clause) new TextLocalisedClause(R$string.crypto_defi_deposit_type_selection_receive_crypto_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.crypto_defi_deposit_type_selection_receive_crypto_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_arrow_request, null, null, 6), null, null, false, null, false, 62), true, false, (RowDelegate.Model.c) null, (Object) i.RECEIVE_CRYPTO, 232)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(null, null, listL, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
            x16.c block = new x16.c(this, 2);
            Intrinsics.checkNotNullParameter(block, "block");
            rowActionsBottomSheetController.H = block;
            return rowActionsBottomSheetController;
        }
        if (Intrinsics.f(modalStep, DeFiAccountsModalStep.SendOptions.f71655a)) {
            kVar.getClass();
            List listK = v.k(new l((Clause) new TextLocalisedClause(R$string.crypto_defi_withdraw_type_selection_move_crypto_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.crypto_defi_withdraw_type_selection_move_crypto_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_revolut, null, null, 6), null, null, false, null, false, 62), true, false, (RowDelegate.Model.c) null, (Object) j.MOVE_CRYPTO, 232), new l((Clause) new TextLocalisedClause(R$string.crypto_defi_withdraw_type_selection_send_crypto_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.crypto_defi_withdraw_type_selection_send_crypto_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_arrow_send, null, null, 6), null, null, false, null, false, 62), true, false, (RowDelegate.Model.c) null, (Object) j.SEND_CRYPTO, 232));
            k9 k9Var2 = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            RowActionsBottomSheetController rowActionsBottomSheetController2 = new RowActionsBottomSheetController(new eii.c(null, null, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null));
            x16.c block2 = new x16.c(this, 1);
            Intrinsics.checkNotNullParameter(block2, "block");
            rowActionsBottomSheetController2.H = block2;
            return rowActionsBottomSheetController2;
        }
        if (modalStep instanceof DeFiAccountsModalStep.ThemeCustomisation) {
            ThemedBackgroundKey themedBackgroundKey = ((DeFiAccountsModalStep.ThemeCustomisation) modalStep).f71656a;
            em2.b.Companion.getClass();
            return o2(new h(themedBackgroundKey, em2.a.a(), null));
        }
        throw new IllegalStateException("Provided modalStep: " + modalStep + " doesn't belongs to " + a.class.getSimpleName());
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.u;
    }

    @Override // dje.a
    public final AccountsExtensionContract$AccountsState i() {
        return (DeFiAccountsExtensionState) ((j2) this.u.f22677a).getValue();
    }

    @Override // dje.b
    public final void j() {
    }

    @Override // dje.b
    public final void m1(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        b3(accountId);
    }

    @Override // dje.b
    public final void q0(String accountId, String menuItemId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
    }

    @Override // dje.a
    public final Flow v() {
        if (!((jte.d) this.f71657l).c(DeFiAccountsApi$Toggles$CryptoDeFiAccount.f71633c)) {
            return vkm.i.f290039a;
        }
        return this.u.B(new x1.n(3));
    }
}
