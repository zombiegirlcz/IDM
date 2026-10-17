package m1i;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2i.h f201506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1i.b f201507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f201508c;
    public final AccountId d;
    public final tm.g e;

    public a(d2i.h exchangeProcessorFactory, c1i.b exchangeSecondaryCurrencyRepository, wsg.n walletInteractor, AccountId accountId, com.google.firebase.messaging.t actionFactory) {
        Intrinsics.checkNotNullParameter(exchangeProcessorFactory, "exchangeProcessorFactory");
        Intrinsics.checkNotNullParameter(exchangeSecondaryCurrencyRepository, "exchangeSecondaryCurrencyRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(actionFactory, "actionFactory");
        this.f201506a = exchangeProcessorFactory;
        this.f201507b = exchangeSecondaryCurrencyRepository;
        this.f201508c = walletInteractor;
        this.d = accountId;
        this.e = actionFactory.g(new m11.h(this, 3));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        j action = (j) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.e.a(action);
    }
}
