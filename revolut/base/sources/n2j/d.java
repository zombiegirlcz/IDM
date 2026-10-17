package n2j;

import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f211562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.b f211563b;

    public d(n walletInteractor, wsg.b newWalletsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.f211562a = walletInteractor;
        this.f211563b = newWalletsInteractor;
    }
}
