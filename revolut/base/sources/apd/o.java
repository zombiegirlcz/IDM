package apd;

import fmc.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0j.a f8181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ekg.g f8182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f8183c;
    public final ks0.n d;

    public o(j0j.a tripsInteractor, ekg.g uiPersonalisationInteractor, z tripsCountriesProvider, ks0.n globeResourcesInteractor) {
        Intrinsics.checkNotNullParameter(tripsInteractor, "tripsInteractor");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(tripsCountriesProvider, "tripsCountriesProvider");
        Intrinsics.checkNotNullParameter(globeResourcesInteractor, "globeResourcesInteractor");
        this.f8181a = tripsInteractor;
        this.f8182b = uiPersonalisationInteractor;
        this.f8183c = tripsCountriesProvider;
        this.d = globeResourcesInteractor;
    }
}
