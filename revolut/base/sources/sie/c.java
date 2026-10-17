package sie;

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
import tla.e;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements dtb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f263626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f263627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f263628c;
    public final j30.d d;

    public c(bge.b tabAccountsControllerFactory, e profileFlowControllerProvider, h cardsListFlowControllerProvider, gte.a featureToggleInteractor, j30.d moneyAssistantDestinationProvider) {
        Intrinsics.checkNotNullParameter(tabAccountsControllerFactory, "tabAccountsControllerFactory");
        Intrinsics.checkNotNullParameter(profileFlowControllerProvider, "profileFlowControllerProvider");
        Intrinsics.checkNotNullParameter(cardsListFlowControllerProvider, "cardsListFlowControllerProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(moneyAssistantDestinationProvider, "moneyAssistantDestinationProvider");
        this.f263626a = profileFlowControllerProvider;
        this.f263627b = cardsListFlowControllerProvider;
        this.f263628c = featureToggleInteractor;
        this.d = moneyAssistantDestinationProvider;
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a a(o direction, boolean z) {
        ChatFlow chatFlowA;
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = a.f263624a[direction.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return ((k) this.f263626a).a();
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return ((com.revolut.feature.card_screen.impl.kompot.cards_list.a) this.f263627b).a(new CardListPreSelectedVariant.DependingOnLastOpenAccount(ibb.c.f));
        }
        if (z) {
            chatFlowA = ((f) this.d).a(new ChatEntryPoint("credit"));
        } else {
            chatFlowA = null;
        }
        if (chatFlowA != null) {
            return chatFlowA;
        }
        TabAccountsMode.Credit mode = TabAccountsMode.Credit.f89462a;
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new AccountSpacesScreen(mode);
    }

    @Override // dtb.b
    public final n0 b() {
        return new a5a.c(this, 6);
    }

    @Override // dtb.b
    public final com.revolut.kompot.navigable.a c(Parcelable parcelable) {
        TabAccountsLaunchConfig tabAccountsLaunchConfig = parcelable instanceof TabAccountsLaunchConfig ? (TabAccountsLaunchConfig) parcelable : null;
        TabAccountsMode.Credit mode = TabAccountsMode.Credit.f89462a;
        ProductAccountDescriptor$Value productAccountDescriptor$Value = tabAccountsLaunchConfig != null ? tabAccountsLaunchConfig.f89544a : null;
        TabAccountsInitialPayload tabAccountsInitialPayload = tabAccountsLaunchConfig != null ? tabAccountsLaunchConfig.f89545b : null;
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new AccountsController(new TabAccountsScreenContract$InputData(productAccountDescriptor$Value, tabAccountsInitialPayload, mode));
    }
}
