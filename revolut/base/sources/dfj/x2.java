package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2 f114150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cej.b f114151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kdh.b f114152c;

    public x2(v2 esimProfilesInteractor, cej.b mobilePlansFeatureAvailabilityInteractor, kdh.b deviceInteractor) {
        Intrinsics.checkNotNullParameter(esimProfilesInteractor, "esimProfilesInteractor");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(deviceInteractor, "deviceInteractor");
        this.f114150a = esimProfilesInteractor;
        this.f114151b = mobilePlansFeatureAvailabilityInteractor;
        this.f114152c = deviceInteractor;
    }
}
