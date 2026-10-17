package kh5;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends oki.h implements b {

    @NotNull
    public static final d Companion = new d();
    public final oh5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nw5.a f184071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f184072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f184073r;

    public g(oh5.b allLockedCryptoBalancesInteractor, nw5.a cryptoCommodityRateInteractor, c stateMapper) {
        Intrinsics.checkNotNullParameter(allLockedCryptoBalancesInteractor, "allLockedCryptoBalancesInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityRateInteractor, "cryptoCommodityRateInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = allLockedCryptoBalancesInteractor;
        this.f184071p = cryptoCommodityRateInteractor;
        this.f184072q = w.y0(new ka9.b(17));
        this.f184073r = mra.d.b(this, new a(0), stateMapper, null, false, 12);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(q.Q((vii.b) this.f184072q.getValue(), new e(continuation, this, 0)), new e(continuation, this, 1)), null, new kae.d(this, continuation, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f184073r;
    }
}
