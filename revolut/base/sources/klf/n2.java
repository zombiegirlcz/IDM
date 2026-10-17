package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.i f185538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u71.a f185539c;
    public final fnc.s d;
    public final com.revolut.domain.interactors.transactions.a e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f185540g;

    public n2(CoroutineScope coroutineScope, k71.i transactionDescriptor, u71.a splitBillRepository, fnc.s splitBillLinkInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(splitBillRepository, "splitBillRepository");
        Intrinsics.checkNotNullParameter(splitBillLinkInteractor, "splitBillLinkInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f185537a = coroutineScope;
        this.f185538b = transactionDescriptor;
        this.f185539c = splitBillRepository;
        this.d = splitBillLinkInteractor;
        this.e = transactionsInteractor;
        this.f = featureToggleInteractor;
        this.f185540g = yhm.j.b(new k98.a(this, 23));
    }
}
