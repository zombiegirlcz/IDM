package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfj.e0 f114047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f114048b;

    public n0(nfj.e0 repository, n80.b buildInfo, k0 installationStateInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(installationStateInteractor, "installationStateInteractor");
        this.f114047a = repository;
        this.f114048b = installationStateInteractor;
    }
}
