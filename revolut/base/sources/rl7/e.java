package rl7;

import kotlin.jvm.internal.Intrinsics;
import ll7.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll7.a f254926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f254927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kw7.c f254928c;

    public e(ll7.a applicationFormRepository, v policyRepository, kw7.c insuranceAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(applicationFormRepository, "applicationFormRepository");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        Intrinsics.checkNotNullParameter(insuranceAvailabilityInteractor, "insuranceAvailabilityInteractor");
        this.f254926a = applicationFormRepository;
        this.f254927b = policyRepository;
        this.f254928c = insuranceAvailabilityInteractor;
    }
}
