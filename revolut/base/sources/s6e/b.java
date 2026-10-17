package s6e;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f260262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f260263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wzi.a f260264c;

    public b(g6e.d subaccountInteractor, xua.a recurringPaymentInteractor, wzi.a incomeSorterInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f260262a = subaccountInteractor;
        this.f260263b = recurringPaymentInteractor;
        this.f260264c = incomeSorterInteractor;
    }

    public final Flow a(String subaccountId) {
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        return xam.a.h(new a(this, null, 1), ((z) this.f260262a).u(subaccountId));
    }
}
