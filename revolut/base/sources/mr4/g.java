package mr4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDisplayBalanceSettings$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.e3;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends oki.h implements dli.b {
    public final CreditCardDisplayBalanceSettings$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kgm.c f208054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e3 f208055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ky4.e f208056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f208057s;

    public g(CreditCardDisplayBalanceSettings$InputData inputData, kgm.c selectorInteractor, e3 limitsInfoInteractor, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(selectorInteractor, "selectorInteractor");
        Intrinsics.checkNotNullParameter(limitsInfoInteractor, "limitsInfoInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f208054p = selectorInteractor;
        this.f208055q = limitsInfoInteractor;
        this.f208056r = new ky4.e(0);
        this.f208057s = mra.d.b(this, new b(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f208056r, new mk0.f(continuation, this, 5)), null, null, new mkk.q(this, continuation, 14), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f208057s;
    }
}
