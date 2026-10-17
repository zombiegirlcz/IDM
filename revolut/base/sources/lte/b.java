package lte;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f199854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f199855b;

    public b(fte.a appFeatureTogglesProvider, z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(appFeatureTogglesProvider, "appFeatureTogglesProvider");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f199854a = contextProvider;
        this.f199855b = j.b(new ite.d(this, 10));
    }
}
