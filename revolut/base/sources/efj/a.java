package efj;

import kotlin.jvm.internal.Intrinsics;
import pej.a;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cej.a f125329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cej.b f125330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oej.a f125331c;

    public a(cej.a esimFeatureAvailabilityInteractor, cej.b esimMobilePlansFeatureAvailabilityInteractor, oej.a esimCoreInteractor) {
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimMobilePlansFeatureAvailabilityInteractor, "esimMobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        this.f125329a = esimFeatureAvailabilityInteractor;
        this.f125330b = esimMobilePlansFeatureAvailabilityInteractor;
        this.f125331c = esimCoreInteractor;
    }

    public final boolean a() {
        return (((c) this.f125329a).a() || ((d) this.f125330b).a()) && (((oej.b) this.f125331c).a() instanceof a.C1306a);
    }
}
