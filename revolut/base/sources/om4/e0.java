package om4;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp4.o0 f226556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f226557b;

    public e0(dp4.o0 creditCardProductRepository, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(creditCardProductRepository, "creditCardProductRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f226556a = creditCardProductRepository;
        this.f226557b = walletInteractor;
    }

    public final Flow a(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(n14.k.p(xam.a.h(new oli.f(this, null, 3), this.f226556a.a(loadingStrategy, true)), new okk.d(23)));
    }
}
