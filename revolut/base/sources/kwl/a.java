package kwl;

import com.revolut.network.error.KycNotPassedErrorHandler;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w49.a f190369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f190370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KycNotPassedErrorHandler f190371c;

    public a(w49.a commandView, n walletInteractor, KycNotPassedErrorHandler kycNotPassedErrorHandler) {
        Intrinsics.checkNotNullParameter(commandView, "commandView");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(kycNotPassedErrorHandler, "kycNotPassedErrorHandler");
        this.f190369a = commandView;
        this.f190370b = walletInteractor;
        this.f190371c = kycNotPassedErrorHandler;
    }
}
