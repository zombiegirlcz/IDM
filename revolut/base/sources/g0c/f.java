package g0c;

import com.revolut.feature.crypto.onboarding.api.CryptoOnboardingApi$Toggles;
import f23.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.h1;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements c0c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh5.a f139424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f139425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0c.a f139426c;

    public f(xh5.a cryptoFeatureEnabledInteractor, gte.a featureToggleInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139424a = cryptoFeatureEnabledInteractor;
        this.f139425b = featureToggleInteractor;
        this.f139426c = productItemFactory;
    }

    @Override // c0c.b
    public final Flow a(h1 h1Var) {
        return new e(new t38.e(new a87.b(mo3.a.g(rd0.e.b(((ji5.e) this.f139424a).f()), null, new fv0.c(27), 1), 22), 24, new go.g(Boolean.valueOf(((jte.d) this.f139425b).c(CryptoOnboardingApi$Toggles.RevPointsCrypto.f70885c)), 2), new g0(3, 1, null)), this, h1Var, 0);
    }
}
