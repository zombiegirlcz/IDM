package n3e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kye.e f211990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f211991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f211992c;
    public final ihm.f d;

    public c(kye.e storeExclusivesInteractor, yk0.d schedulerProvider) {
        Intrinsics.checkNotNullParameter(storeExclusivesInteractor, "storeExclusivesInteractor");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.f211990a = storeExclusivesInteractor;
        this.f211991b = j6.a.h("create(...)");
        this.f211992c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }
}
