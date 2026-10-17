package aoa;

import dwi.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efj.a f7935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mti.h f7936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f7937c;
    public final gte.a d;
    public final k e;

    public b(efj.a esimAvailabilityResolver, mti.h asftAvailabilityInteractor, x airportLoungesAvailabilityInteractor, gte.a featureToggleInteractor, k planWidgetV3DesignResolver) {
        Intrinsics.checkNotNullParameter(esimAvailabilityResolver, "esimAvailabilityResolver");
        Intrinsics.checkNotNullParameter(asftAvailabilityInteractor, "asftAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(airportLoungesAvailabilityInteractor, "airportLoungesAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(planWidgetV3DesignResolver, "planWidgetV3DesignResolver");
        this.f7935a = esimAvailabilityResolver;
        this.f7936b = asftAvailabilityInteractor;
        this.f7937c = airportLoungesAvailabilityInteractor;
        this.d = featureToggleInteractor;
        this.e = planWidgetV3DesignResolver;
    }

    public static mx0.d a(oga.d dVar) {
        int i = dVar == null ? -1 : a.f7934a[dVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return mx0.d.ACCENT;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return mx0.d.SEMIACCENT;
    }
}
