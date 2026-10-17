package y16;

import aw0.e8;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.defi.accounts.impl.R$string;
import com.revolut.feature.defi.accounts.impl.ui.extension.DeFiAccountsExtensionState;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import tx0.g;
import tx0.l;
import tx0.r;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements dje.c {
    @Override // dje.c
    public final List a(AccountsExtensionContract$AccountsState accountsState) {
        r lVar;
        NavBarWithContainerBackground navBarWithContainerBackground;
        NavBarWithContainerBackground navBarWithContainerBackground2;
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        DeFiAccountsExtensionState state = (DeFiAccountsExtensionState) accountsState;
        Data data = state.f71651a;
        ChosenBackground chosenBackground = state.e;
        if (data.getContent() == null && !data.getLoading()) {
            e8 e8Var = new e8(true);
            NavBarCenterViewModel navBarCenterViewModel = new NavBarCenterViewModel(new TextLocalisedClause(R$string.defi_accounts_header_activation_title, null, null, 14), null, new NavBarCenterViewModel.Subtitle.Secondary(new TextLocalisedClause(R$string.defi_accounts_header_activation_subtitle, null, null, 14)), false, 3574);
            tx0.d dVar = new tx0.d(u.c(u.c(new ActionsView.Item("DEFI_ACTIVATE_WALLET_ACTION_ID", null, false, null, null, new TextLocalisedClause(R$string.defi_accounts_header_activation_action_title, null, null, 14), null, null, null, null, false, null, null, null, null, 32670))));
            if (chosenBackground == null || (navBarWithContainerBackground2 = chosenBackground.f63742b) == null) {
                b.Companion.getClass();
                navBarWithContainerBackground2 = (NavBarWithContainerBackground.ImageBackground) b.f310305a.getValue();
            }
            return u.c(new aw0.b(e8Var, new g("DEFI_ACCOUNT_ID", navBarCenterViewModel, dVar, navBarWithContainerBackground2, null, null, null, null, null, null, 3056)));
        }
        Intrinsics.checkNotNullParameter(state, "state");
        e16.b bVar = (e16.b) data.getContent();
        z16.b bVar2 = state.f71653c;
        if (bVar == null || bVar2 == null) {
            lVar = new l("DEFI_ACCOUNT_ID", 6);
        } else {
            ej0.b bVar3 = bVar2.f318753a;
            NavBarCenterViewModel navBarCenterViewModel2 = new NavBarCenterViewModel(new MoneyClause(mif.a.Q(bVar3), new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), new TextClause(bVar.f121887b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(bVar3.f126703a, BigDecimal.ZERO) ? null : new NavBarCenterViewModel.Subtitle.CaptionComplex(u5l.a.a(bVar2.f318754b, bVar2.f318755c)), false, 3570);
            mx0.d dVar2 = mx0.d.CONTEXTUAL;
            ActionsView.Item[] elements = {new ActionsView.Item("DEFI_TRADE_ACTION_ID", dVar2, false, null, null, new TextLocalisedClause(R$string.tab_crypto_defi_header_action_trade, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_rates, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668), new ActionsView.Item("DEFI_RECEIVE_ACTION_ID", dVar2, false, null, null, new TextLocalisedClause(R$string.tab_crypto_defi_header_action_receive, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668), new ActionsView.Item("DEFI_SEND_ACTION_ID", dVar2, false, null, null, new TextLocalisedClause(R$string.tab_crypto_defi_header_action_send, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_up, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668), new ActionsView.Item("DEFI_SETTINGS_ACTION_ID", dVar2, false, null, null, new TextLocalisedClause(R$string.tab_crypto_defi_header_action_settings, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668), wqi.a.a("DEFI_THEME_ACTION_ID", e4.EnabledClickable, null)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            tx0.d dVar3 = new tx0.d(u.c(kotlin.collections.d.L(elements)));
            if (chosenBackground == null || (navBarWithContainerBackground = chosenBackground.f63742b) == null) {
                b.Companion.getClass();
                navBarWithContainerBackground = (NavBarWithContainerBackground.ImageBackground) b.f310305a.getValue();
            }
            lVar = new g("DEFI_ACCOUNT_ID", navBarCenterViewModel2, dVar3, navBarWithContainerBackground, null, null, null, null, null, null, 3024);
        }
        return u.c(new aw0.b(new e8(true), lVar));
    }

    @Override // dje.c
    public final List b(AccountsExtensionContract$AccountsState accountsState, String accountId) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return f0.f322471a;
    }

    @Override // dje.c
    public final boolean c(AccountsExtensionContract$AccountsState accountsState) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        return accountsState instanceof DeFiAccountsExtensionState;
    }

    @Override // dje.c
    public final MoneyClause d(AccountsExtensionContract$AccountsState accountsState) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        z16.b bVar = ((DeFiAccountsExtensionState) accountsState).f71653c;
        if (bVar == null) {
            return null;
        }
        return new MoneyClause(mif.a.Q(bVar.f318753a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    @Override // dje.c
    public final int e(AccountsExtensionContract$AccountsState accountsState) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        return R$drawable.uikit_icn_24_crypto_brick;
    }

    @Override // dje.c
    public final Clause f(AccountsExtensionContract$AccountsState accountsState) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        e16.b bVar = (e16.b) ((DeFiAccountsExtensionState) accountsState).f71651a.getContent();
        if (bVar != null) {
            return new TextClause(bVar.f121887b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return null;
    }

    @Override // dje.c
    public final Clause g(AccountsExtensionContract$AccountsState accountsState) {
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        return ((DeFiAccountsExtensionState) accountsState).f;
    }
}
