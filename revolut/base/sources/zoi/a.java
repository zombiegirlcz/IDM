package zoi;

import com.revolut.core.network.NetworkToggles$DisableCertificateFingerprintInUserAgent;
import com.revolut.core.network.NetworkToggles$SimulatedFailover;
import com.revolut.core.network.idempotency.IdempotencyExperiment;
import cpi.j;
import jte.d;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import lte.c;
import ulm.p0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements rj0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f324061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f324062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f324063c;

    public a(j firebaseExperimentsRepositoryProvider, j featureToggleInteractorProvider) {
        Intrinsics.checkNotNullParameter(firebaseExperimentsRepositoryProvider, "firebaseExperimentsRepositoryProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractorProvider, "featureToggleInteractorProvider");
        this.f324061a = firebaseExperimentsRepositoryProvider;
        this.f324062b = featureToggleInteractorProvider;
        this.f324063c = yhm.j.b(new p0(this, 17));
    }

    @Override // rj0.a
    public final boolean a() {
        c cVar = (c) this.f324063c.getValue();
        IdempotencyExperiment firebaseExperiment = IdempotencyExperiment.f51451c;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(firebaseExperiment, "firebaseExperiment");
        return Intrinsics.f(cVar.b(firebaseExperiment), firebaseExperiment.f107371b);
    }

    @Override // rj0.a
    public final boolean b() {
        return ((d) ((gte.a) this.f324062b.invoke())).c(NetworkToggles$DisableCertificateFingerprintInUserAgent.f51444c);
    }

    @Override // rj0.a
    public final boolean c() {
        return ((d) ((gte.a) this.f324062b.invoke())).c(NetworkToggles$SimulatedFailover.f51445a);
    }
}
