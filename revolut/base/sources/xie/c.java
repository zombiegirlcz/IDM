package xie;

import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.credit.api.navigation.CreditTabRestoreNavigationDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vie.h;
import vie.j;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f306346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f306347b;

    public c(h tabCreditAvailabilityInteractor, j tabCreditVisibilityInteractor) {
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tabCreditVisibilityInteractor, "tabCreditVisibilityInteractor");
        this.f306346a = tabCreditAvailabilityInteractor;
        this.f306347b = tabCreditVisibilityInteractor;
    }

    public final KompotDestination a(ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        a aVar;
        if (this.f306346a.a()) {
            j jVar = this.f306347b;
            aVar = (jVar.f289584a.a() && jVar.f289585b.a()) ? a.CREDIT : a.RESTORE;
        } else {
            aVar = a.ACCOUNTS;
        }
        int i = b.f306345a[aVar.ordinal()];
        if (i == 1) {
            return new MainContainerScreenDestination.JustShow(ibb.c.f, new TabAccountsLaunchConfig(productAccountDescriptor$Value, null), (AccountCreationTransitionAnimation) null, 12);
        }
        if (i == 2) {
            return new CreditTabRestoreNavigationDestination(productAccountDescriptor$Value);
        }
        if (i == 3) {
            return new MainContainerScreenDestination.JustShow(ibb.c.f160140a, new TabAccountsLaunchConfig(productAccountDescriptor$Value, null), (AccountCreationTransitionAnimation) null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
