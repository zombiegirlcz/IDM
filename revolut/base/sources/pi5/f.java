package pi5;

import cli.y;
import com.revolut.feature.crypto.onboarding.impl.ui.fca.screen.learn.CryptoFcaLearnScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfk.o0;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends oki.h implements dli.b {
    public final f80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CryptoFcaLearnScreenContract$InputData f236426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sd5.c f236427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f236428r;

    public f(i stateMapper, f80.a uriHelper, CryptoFcaLearnScreenContract$InputData inputData, sd5.c cryptoConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        this.o = uriHelper;
        this.f236426p = inputData;
        this.f236427q = cryptoConfigInteractor;
        this.f236428r = mra.d.b(this, new c(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        xi0.b bVar = this.f236426p.f70893a;
        if (bVar == null) {
            H2(this.f236428r, new phc.e(17));
        } else {
            l.b1(this, rd0.e.b(nim.a.w(this.f236427q.a(false), new ou5.a(4, bVar))), null, new o0(this, (Continuation) null, 5), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f236428r;
    }
}
