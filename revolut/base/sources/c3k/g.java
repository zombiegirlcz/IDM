package c3k;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends oki.h implements e {
    public final g3k.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f20960p;

    public g(g3k.a paymentVendorsInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(paymentVendorsInteractor, "paymentVendorsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = paymentVendorsInteractor;
        Data data = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this.f20960p = mra.d.b(this, new c(data, ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.a(), null, null, new c1i.f(this, (Continuation) null, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f20960p;
    }
}
