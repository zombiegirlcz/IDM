package oej;

import kotlin.jvm.internal.Intrinsics;
import qej.e;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f224612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qej.c f224613b;

    public c(e installationRepository, qej.c coreRepository) {
        Intrinsics.checkNotNullParameter(installationRepository, "installationRepository");
        Intrinsics.checkNotNullParameter(coreRepository, "coreRepository");
        this.f224612a = installationRepository;
        this.f224613b = coreRepository;
    }
}
