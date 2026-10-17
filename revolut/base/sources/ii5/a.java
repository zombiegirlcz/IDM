package ii5;

import cu8.r0;
import ji5.i;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f161573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f161574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f161575c;
    public final r0 d;

    public a(xoj.a featuresInteractor, i cryptoOnboardingInteractor, m navigator, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.f161573a = featuresInteractor;
        this.f161574b = cryptoOnboardingInteractor;
        this.f161575c = navigator;
        this.d = kycRequiredActionTransformer;
    }

    public final g a() {
        return new g(this.f161573a, this.f161574b, this.f161575c, this.d);
    }
}
