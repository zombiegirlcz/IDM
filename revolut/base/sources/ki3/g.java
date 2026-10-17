package ki3;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f184174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f184175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q89.e f184176c;
    public final vh3.c d;

    public g(AccountId accountId, NaviCommand naviCommand, q89.e onboardingInteractor, vh3.c checkoutNavigationFactory) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(checkoutNavigationFactory, "checkoutNavigationFactory");
        this.f184174a = accountId;
        this.f184175b = naviCommand;
        this.f184176c = onboardingInteractor;
        this.d = checkoutNavigationFactory;
    }
}
