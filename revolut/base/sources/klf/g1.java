package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.i f185484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f185485c;
    public final al4.m d;
    public final fm4.a e;
    public final Lazy f;

    public g1(CoroutineScope coroutineScope, k71.i transactionDescriptor, h0 commonDataSource, al4.m creditCardInstalmentInteractor, fm4.a creditCardInstalmentModelProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentModelProvider, "creditCardInstalmentModelProvider");
        this.f185483a = coroutineScope;
        this.f185484b = transactionDescriptor;
        this.f185485c = commonDataSource;
        this.d = creditCardInstalmentInteractor;
        this.e = creditCardInstalmentModelProvider;
        this.f = yhm.j.b(new k98.a(this, 16));
    }
}
