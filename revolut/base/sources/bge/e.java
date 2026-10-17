package bge;

import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatEntryPoint;
import com.revolut.chat.ui.flow.ChatFlow;
import com.revolut.feature.card_screen.api.navigation.CardListPreSelectedVariant;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesScreen;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$InputData;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import dy0.n0;
import dy0.o;
import j30.f;
import jma.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n63.h;
import qc0.e1;
import skm.e0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements dtb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tla.e f15186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f15187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.d f15188c;
    public final qge.b d;
    public final gte.a e;

    public e(b tabAccountsControllerFactory, tla.e profileFlowControllerProvider, h cardsListFlowControllerProvider, j30.d moneyAssistantDestinationProvider, qge.b accountsNudgeSessionTracker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(tabAccountsControllerFactory, "tabAccountsControllerFactory");
        Intrinsics.checkNotNullParameter(profileFlowControllerProvider, "profileFlowControllerProvider");
        Intrinsics.checkNotNullParameter(cardsListFlowControllerProvider, "cardsListFlowControllerProvider");
        Intrinsics.checkNotNullParameter(moneyAssistantDestinationProvider, "moneyAssistantDestinationProvider");
        Intrinsics.checkNotNullParameter(accountsNudgeSessionTracker, "accountsNudgeSessionTracker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f15186a = profileFlowControllerProvider;
        this.f15187b = cardsListFlowControllerProvider;
        this.f15188c = moneyAssistantDestinationProvider;
        this.d = accountsNudgeSessionTracker;
        this.e = featureToggleInteractor;
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a a(o direction, boolean z) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = c.f15184a[direction.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return ((k) this.f15186a).a();
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return ((com.revolut.feature.card_screen.impl.kompot.cards_list.a) this.f15187b).a(new CardListPreSelectedVariant.DependingOnLastOpenAccount(ibb.c.f160140a));
        }
        ChatFlow chatFlowA = null;
        if (z) {
            lie.a aVar = lie.a.AIR_PULL_DOWN;
            qge.b bVar = this.d;
            if (bVar.f245787a.a(aVar.b())) {
                e0.C(bVar.f245788b, null, null, new e1(bVar, aVar, null, 9), 3);
            }
            chatFlowA = ((f) this.f15188c).a(new ChatEntryPoint("home"));
        }
        if (chatFlowA != null) {
            return chatFlowA;
        }
        TabAccountsMode.Home mode = TabAccountsMode.Home.f89466a;
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new AccountSpacesScreen(mode);
    }

    @Override // dtb.b
    public final n0 b() {
        return new a5a.c(this, 1);
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a c(Parcelable parcelable) {
        TabAccountsLaunchConfig tabAccountsLaunchConfig = parcelable instanceof TabAccountsLaunchConfig ? (TabAccountsLaunchConfig) parcelable : null;
        TabAccountsMode.Home mode = TabAccountsMode.Home.f89466a;
        ProductAccountDescriptor$Value productAccountDescriptor$Value = tabAccountsLaunchConfig != null ? tabAccountsLaunchConfig.f89544a : null;
        TabAccountsInitialPayload tabAccountsInitialPayload = tabAccountsLaunchConfig != null ? tabAccountsLaunchConfig.f89545b : null;
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new AccountsController(new TabAccountsScreenContract$InputData(productAccountDescriptor$Value, tabAccountsInitialPayload, mode));
    }
}
