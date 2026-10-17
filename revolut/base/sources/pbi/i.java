package pbi;

import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f234693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f234694b;

    public i(ang.f userInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f234693a = walletInteractor;
        this.f234694b = userInteractor;
    }
}
