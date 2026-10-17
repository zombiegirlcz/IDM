package b0a;

import hx7.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zm3.p;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw9.d f11641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iz9.c f11642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj8.a f11643c;
    public final gte.a d;

    public k(cw9.d paymentsProductFeatureChecker, iz9.c transactionsInteractor, hj8.a juniorProfileInteractor, gte.a featureToggleInteractor, a contactChatCompatibilityChecker) {
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(contactChatCompatibilityChecker, "contactChatCompatibilityChecker");
        this.f11641a = paymentsProductFeatureChecker;
        this.f11642b = transactionsInteractor;
        this.f11643c = juniorProfileInteractor;
        this.d = featureToggleInteractor;
    }

    public final Flow a(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (contact instanceof zm3.l) {
            zm3.l lVar = (zm3.l) contact;
            if (!q.K(lVar) && !q.N(lVar)) {
                return this.f11641a.h("MESSENGER.messages");
            }
        } else if (!(contact instanceof zm3.g) && !(contact instanceof p)) {
            throw new NoWhenBranchMatchedException();
        }
        return new go.g(Boolean.FALSE, 2);
    }
}
