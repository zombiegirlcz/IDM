package lae;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptions.impl.list.CardSubscriptionListScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends oki.h implements f {
    public final CardSubscriptionListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xua.a f193376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.f f193377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g6e.d f193378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c9e.c f193379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f193380t;

    public n(r stateMapper, CardSubscriptionListScreenContract$InputData inputData, xua.a recurringPaymentInteractor, l93.f revolutCardsInteractor, g6e.d subaccountInteractor, c9e.c subscriptionNavigationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        this.o = inputData;
        this.f193376p = recurringPaymentInteractor;
        this.f193377q = revolutCardsInteractor;
        this.f193378r = subaccountInteractor;
        this.f193379s = subscriptionNavigationProvider;
        this.f193380t = mra.d.b(this, new g(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new k(this, continuation, 0), new yi5.b(26));
        l2(new la8.h(this, continuation, 1), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f193380t;
    }
}
