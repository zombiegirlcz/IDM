package wrj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends jki.g implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final UpcomingPaymentsContract$InputData f299606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ppg.b f299607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l5i.q f299608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xld.f f299609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c9e.c f299610t;
    public final ge3.a u;
    public final l80.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cl3.a f299611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final nhf.a f299612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f299613y;
    public final z1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jki.p stateMapper, UpcomingPaymentsContract$InputData inputData, ppg.b vaultsInteractor, l5i.q analyticsTransactionsInteractor, xld.f upcomingSpendingInteractor, c9e.c subscriptionNavigationProvider, ge3.a analyticsPocketsInteractor, l80.e dateProvider, cl3.a contactsInteractor, nhf.a unitedWalletInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(upcomingSpendingInteractor, "upcomingSpendingInteractor");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f299606p = inputData;
        this.f299607q = vaultsInteractor;
        this.f299608r = analyticsTransactionsInteractor;
        this.f299609s = upcomingSpendingInteractor;
        this.f299610t = subscriptionNavigationProvider;
        this.u = analyticsPocketsInteractor;
        this.v = dateProvider;
        this.f299611w = contactsInteractor;
        this.f299612x = unitedWalletInteractor;
        this.f299613y = new a(new Data(null, null, true, 3, null));
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.z = z1VarB;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.z, new w2a.q(continuation, this, 22)), null, new wka.e(this, continuation, 21), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f299613y;
    }
}
