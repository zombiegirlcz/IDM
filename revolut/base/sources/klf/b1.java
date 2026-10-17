package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f185448c;
    public final sa6.z d;
    public final n8b.a e;
    public final Lazy f;

    public b1(CoroutineScope coroutineScope, h0 commonDataSource, a31.a donationsAvailabilityInteractor, sa6.z externalDonationsInteractor, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(externalDonationsInteractor, "externalDonationsInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f185446a = coroutineScope;
        this.f185447b = commonDataSource;
        this.f185448c = donationsAvailabilityInteractor;
        this.d = externalDonationsInteractor;
        this.e = countryInteractor;
        this.f = yhm.j.b(new k98.a(this, 15));
    }
}
