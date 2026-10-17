package ti5;

import ei5.d;
import ji5.i;
import kotlin.jvm.internal.Intrinsics;
import smd.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f271421a;

    public a(d dVar) {
        this.f271421a = dVar;
    }

    public final s a() {
        d dVar = this.f271421a;
        i cryptoOnboardingInteractor = dVar.c();
        vc.s.j(cryptoOnboardingInteractor);
        xh5.a cryptoFeatureEnabledInteractor = dVar.a();
        vc.s.j(cryptoFeatureEnabledInteractor);
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        s sVar = new s();
        sVar.f264432a = cryptoOnboardingInteractor;
        sVar.f264433b = cryptoFeatureEnabledInteractor;
        return sVar;
    }
}
