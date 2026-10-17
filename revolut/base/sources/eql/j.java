package eql;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends cki.a implements i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ph0.f f128506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gql.a f128507n;
    public final d o;

    public j(ph0.f googleAuthenticationClient, gql.a googleMobileServicesAvailabilityManager) {
        Intrinsics.checkNotNullParameter(googleAuthenticationClient, "googleAuthenticationClient");
        Intrinsics.checkNotNullParameter(googleMobileServicesAvailabilityManager, "googleMobileServicesAvailabilityManager");
        this.f128506m = googleAuthenticationClient;
        this.f128507n = googleMobileServicesAvailabilityManager;
        this.o = d.f128501a;
    }

    @Override // cki.a
    public final Object Z2() {
        return this.o;
    }
}
