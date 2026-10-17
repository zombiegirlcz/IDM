package m61;

import kotlin.jvm.internal.Intrinsics;
import mt8.d;
import wsg.n;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f202967a;

    public c(d kycInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f202967a = walletInteractor;
    }
}
