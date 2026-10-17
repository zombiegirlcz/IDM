package bcj;

import au6.a3;
import com.revolut.retail.feature.crypto_deposits.api.CryptoDepositsApi$Toggles$DirectDeposits;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.t0;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends n implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f14461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f14462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rbj.f f14463n;
    public final vki.a o;

    public l(h mapper, gte.a featureToggleInteractor, rbj.f cryptoDepositsInternalInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositsInternalInteractor, "cryptoDepositsInternalInteractor");
        this.f14461l = mapper;
        this.f14462m = featureToggleInteractor;
        this.f14463n = cryptoDepositsInternalInteractor;
        this.o = pyd.c.a(this, new d(0));
    }

    @Override // yji.n
    public final void H2() {
        if (this.f14462m.a(CryptoDepositsApi$Toggles$DirectDeposits.f100033c)) {
            return;
        }
        Continuation continuation = null;
        n.l2(this, q.Q(new t0(this.o.B(new bbh.a(9)), 1), new a3(continuation, this, 15)), null, new b74.e(this, continuation, 17), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
