package tpd;

import com.revolut.core.model.account.AccountId;
import djb.u;
import g48.r0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import upd.h;
import upd.p;
import upd.r;
import vkm.y;
import w4l.j;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements xld.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f273349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final toh.d f273350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final djb.n f273351c;
    public final r0 d;
    public final p e;
    public final u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f273352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final upd.n f273353h;
    public final r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final upd.b f273354j;
    public final gte.a k;

    public f(n walletInteractor, toh.d savingsAvailabilityInteractor, djb.n savingsAccountsDetailsInteractor, r0 jointAccountsInteractor, p subaccountsDestinationsProvider, u tradingOnboardingStatusProvider, h investmentDestinationProvider, upd.n roboDestinationProvider, r transferIncomeSorterDestinationProvider, upd.b cryptoIncomeSorterDestinationsProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(savingsAvailabilityInteractor, "savingsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(subaccountsDestinationsProvider, "subaccountsDestinationsProvider");
        Intrinsics.checkNotNullParameter(tradingOnboardingStatusProvider, "tradingOnboardingStatusProvider");
        Intrinsics.checkNotNullParameter(investmentDestinationProvider, "investmentDestinationProvider");
        Intrinsics.checkNotNullParameter(roboDestinationProvider, "roboDestinationProvider");
        Intrinsics.checkNotNullParameter(transferIncomeSorterDestinationProvider, "transferIncomeSorterDestinationProvider");
        Intrinsics.checkNotNullParameter(cryptoIncomeSorterDestinationsProvider, "cryptoIncomeSorterDestinationsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f273349a = walletInteractor;
        this.f273350b = savingsAvailabilityInteractor;
        this.f273351c = savingsAccountsDetailsInteractor;
        this.d = jointAccountsInteractor;
        this.e = subaccountsDestinationsProvider;
        this.f = tradingOnboardingStatusProvider;
        this.f273352g = investmentDestinationProvider;
        this.f273353h = roboDestinationProvider;
        this.i = transferIncomeSorterDestinationProvider;
        this.f273354j = cryptoIncomeSorterDestinationsProvider;
        this.k = featureToggleInteractor;
    }

    public static final y a(f fVar, Flow flow) {
        fVar.getClass();
        return rd0.e.e(nim.a.A(flow, new tlf.n(26)), h0.f322473a, new tc6.d(3, 11, null));
    }

    public final Flow b(ArrayList arrayList) {
        return xam.a.h(new c(this, arrayList, null), rd0.e.b(this.f273349a.J(AccountId.Personal.f51414a, j.f294644c)));
    }
}
